package com.roblox.audio;

import android.util.Log;
import com.roblox.audio.AbstractC2714a;
import java.util.Set;

/* loaded from: classes.dex */
public class AppRtcDeviceWrapper {
    private static final String TAG = "AppRtcDeviceWrapper";
    private final C2713b audioManagerEvents;
    private final long nativeReference;

    /* renamed from: com.roblox.audio.AppRtcDeviceWrapper$b */
    /* loaded from: classes.dex */
    private class C2713b implements AbstractC2714a.b {
        private C2713b() {
        }

        @Override // com.roblox.audio.AbstractC2714a.b
        /* renamed from: a */
        public void mo12091a(AbstractC2714a.a aVar, Set<AbstractC2714a.a> set) {
            Log.d(AppRtcDeviceWrapper.TAG, "onAudioDeviceChanged: selectedAudioDevice: " + aVar.toString());
            Log.d(AppRtcDeviceWrapper.TAG, "Placeholder until Log Audio State is implemented.");
            AppRtcDeviceWrapper.this.nativeAudioDeviceChanged(aVar.ordinal(), AppRtcDeviceWrapper.this.nativeReference);
        }
    }

    public AppRtcDeviceWrapper(long j10) {
        this.nativeReference = j10;
        Log.d(TAG, "ctor AppRtcDeviceWrapper");
        if (AbstractC2714a.m12093d()) {
            this.audioManagerEvents = new C2713b();
        } else {
            this.audioManagerEvents = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAudioDeviceChanged(int i10, long j10);

    public int getSelectedAudioDeviceAsInt() {
        if (!AbstractC2714a.m12093d()) {
            Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
            return AbstractC2714a.a.NONE.ordinal();
        }
        return AbstractC2714a.m12092b().mo12095c().ordinal();
    }

    public String getSelectedAudioDeviceName() {
        if (!AbstractC2714a.m12093d()) {
            Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
            return "INVALID INSTANCE";
        }
        AbstractC2714a.a mo12095c = AbstractC2714a.m12092b().mo12095c();
        return mo12095c == AbstractC2714a.a.SPEAKER_PHONE ? "Android Audio (Speaker)" : mo12095c == AbstractC2714a.a.WIRED_HEADSET ? "Android Audio (Wired Device)" : mo12095c == AbstractC2714a.a.EARPIECE ? "Android Audio (Earpiece)" : mo12095c == AbstractC2714a.a.BLUETOOTH ? "Android Audio (Bluetooth)" : "Android Audio (NONE)";
    }

    public boolean isValid() {
        return AbstractC2714a.m12093d();
    }

    public void wrapSetCommunicationMute(boolean z10) {
        Log.d(TAG, "setMicrophoneMute(" + z10 + ")");
        if (AbstractC2714a.m12093d()) {
            AbstractC2714a.m12092b().m12098g(z10);
        }
    }

    public void wrapStartCommunication() {
        Log.d(TAG, "startCommunication()");
        if (AbstractC2714a.m12093d()) {
            AbstractC2714a.m12092b().mo12100i(this.audioManagerEvents);
        }
    }

    public void wrapStopCommunication() {
        Log.d(TAG, "stopCommunication()");
        if (AbstractC2714a.m12093d()) {
            AbstractC2714a.m12092b().mo12101j();
        }
    }
}
