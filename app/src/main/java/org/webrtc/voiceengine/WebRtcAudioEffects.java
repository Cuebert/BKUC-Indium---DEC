package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: classes.dex */
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns */
    private NoiseSuppressor f17403ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        Logging.m17629b(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z10 = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.m17629b(TAG, "canUseAcousticEchoCanceler: " + z10);
        return z10;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z10 = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.m17629b(TAG, "canUseNoiseSuppressor: " + z10);
        return z10;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.m17632e(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.m17632e(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i10) {
        Logging.m17629b(TAG, "enable(audioSession=" + i10 + ")");
        assertTrue(this.aec == null);
        assertTrue(this.f17403ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i10);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z10 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z10) != 0) {
                    Logging.m17630c(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcousticEchoCanceler: was ");
                sb2.append(enabled ? "enabled" : "disabled");
                sb2.append(", enable: ");
                sb2.append(z10);
                sb2.append(", is now: ");
                sb2.append(this.aec.getEnabled() ? "enabled" : "disabled");
                Logging.m17629b(TAG, sb2.toString());
            } else {
                Logging.m17630c(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i10);
            this.f17403ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                boolean z11 = this.shouldEnableNs && canUseNoiseSuppressor();
                if (this.f17403ns.setEnabled(z11) != 0) {
                    Logging.m17630c(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("NoiseSuppressor: was ");
                sb3.append(enabled2 ? "enabled" : "disabled");
                sb3.append(", enable: ");
                sb3.append(z11);
                sb3.append(", is now: ");
                sb3.append(this.f17403ns.getEnabled() ? "enabled" : "disabled");
                Logging.m17629b(TAG, sb3.toString());
                return;
            }
            Logging.m17630c(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.m17629b(TAG, BuildConfig.BUILD_TYPE);
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f17403ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f17403ns = null;
        }
    }

    public boolean setAEC(boolean z10) {
        Logging.m17629b(TAG, "setAEC(" + z10 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.m17632e(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z10 != this.shouldEnableAec) {
            Logging.m17630c(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAec = z10;
        return true;
    }

    public boolean setNS(boolean z10) {
        Logging.m17629b(TAG, "setNS(" + z10 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.m17632e(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f17403ns != null && z10 != this.shouldEnableNs) {
            Logging.m17630c(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
        this.shouldEnableNs = z10;
        return true;
    }
}
