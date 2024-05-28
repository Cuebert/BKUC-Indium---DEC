package org.webrtc.voiceengine;

import androidx.appcompat.app.ActivityC0153c;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class AppAudioManagerBase {
    private static AppAudioManagerBase sInstance;

    /* loaded from: classes.dex */
    public interface AudioManagerEvents {
        void onAudioDeviceChanged(String str, Set<String> set);
    }

    public static AppAudioManagerBase getInstance() {
        return sInstance;
    }

    public static boolean hasInstance() {
        return sInstance != null;
    }

    public void dispose() {
        AppAudioManagerBase appAudioManagerBase = sInstance;
        if (this == appAudioManagerBase) {
            appAudioManagerBase.onDispose();
            sInstance = null;
        }
    }

    public abstract void onDispose();

    public void setActivityForPermissionRequest(ActivityC0153c activityC0153c) {
    }

    public void setCommunicationMute(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInstance(AppAudioManagerBase appAudioManagerBase) {
        sInstance = appAudioManagerBase;
    }

    public abstract void startCommunication(AudioManagerEvents audioManagerEvents);

    public abstract void stopCommunication();
}
