package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.voiceengine.AppAudioManagerBase;

/* loaded from: classes.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage = false;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden = false;
    private static boolean useAudioManagerCommunicationMode = true;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private final AudioManagerEvents audioManagerEvents;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    /* loaded from: classes.dex */
    private class AudioManagerEvents implements AppAudioManagerBase.AudioManagerEvents {
        private AudioManagerEvents() {
        }

        @Override // org.webrtc.voiceengine.AppAudioManagerBase.AudioManagerEvents
        public void onAudioDeviceChanged(String str, Set<String> set) {
            Logging.m17629b(WebRtcAudioManager.TAG, "onAudioDeviceChanged: selectedAudioDevice: " + str);
            WebRtcAudioUtils.logAudioState(WebRtcAudioManager.TAG);
        }
    }

    /* loaded from: classes.dex */
    private static class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        private final AudioManager audioManager;
        private Timer timer;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            LogVolumeTask(int i10, int i11) {
                this.maxRingVolume = i10;
                this.maxVoiceCallVolume = i11;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    Logging.m17629b(WebRtcAudioManager.TAG, "STREAM_RING stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                    return;
                }
                if (mode == 3) {
                    Logging.m17629b(WebRtcAudioManager.TAG, "VOICE_CALL stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    WebRtcAudioManager(long j10) {
        Logging.m17629b(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j10;
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager;
        if (AppAudioManagerBase.hasInstance()) {
            this.audioManagerEvents = new AudioManagerEvents();
        } else {
            this.audioManagerEvents = null;
            if (useAudioManagerCommunicationMode) {
                audioManager.setMode(3);
            }
        }
        this.volumeLogger = new VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j10);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        Logging.m17629b(TAG, "dispose" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            if (AppAudioManagerBase.hasInstance()) {
                AppAudioManagerBase.getInstance().stopCommunication();
            }
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        return property == null ? DEFAULT_FRAME_PER_BUFFER : Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        return AudioRecord.getMinBufferSize(i10, i11 == 1 ? 16 : 12, 2) / (i11 * 2);
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        return AudioTrack.getMinBufferSize(i10, i11 == 1 ? 4 : 12, 2) / (i11 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m17629b(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.m17629b(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        Logging.m17629b(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z10;
        synchronized (WebRtcAudioManager.class) {
            z10 = useStereoInput;
        }
        return z10;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z10;
        synchronized (WebRtcAudioManager.class) {
            z10 = useStereoOutput;
        }
        return z10;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        Logging.m17629b(TAG, "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return blacklistDeviceForAAudioUsage;
        }
        Logging.m17629b(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = blacklistDeviceForAAudioUsage;
        this.volumeLogger.start();
        if (AppAudioManagerBase.hasInstance()) {
            AppAudioManagerBase.getInstance().startCommunication(this.audioManagerEvents);
        }
        return blacklistDeviceForAAudioUsage;
    }

    private boolean isAAudioSupported() {
        Logging.m17632e(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsage;
        } else {
            deviceIsBlacklistedForOpenSLESUsage = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.m17629b(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        if (Build.VERSION.SDK_INT < 23 || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return blacklistDeviceForAAudioUsage;
    }

    private native void nativeCacheAudioParameters(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, long j10);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = blacklistDeviceForAAudioUsage;
            blacklistDeviceForOpenSLESUsage = z10;
        }
    }

    private void setMicrophoneMute(boolean z10) {
        Logging.m17629b(TAG, "setMicrophoneMute(" + z10 + ")" + WebRtcAudioUtils.getThreadInfo());
        if (AppAudioManagerBase.hasInstance()) {
            AppAudioManagerBase.getInstance().setCommunicationMute(z10);
        }
    }

    public static synchronized void setStereoInput(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            Logging.m17632e(TAG, "Overriding default input behavior: setStereoInput(" + z10 + ')');
            useStereoInput = z10;
        }
    }

    public static synchronized void setStereoOutput(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            Logging.m17632e(TAG, "Overriding default output behavior: setStereoOutput(" + z10 + ')');
            useStereoOutput = z10;
        }
    }

    public static void setUseAudioManagerCommunicationMode(boolean z10) {
        useAudioManagerCommunicationMode = z10;
    }

    private void storeAudioParameters() {
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}
