package p213q6;

import android.content.Context;
import androidx.appcompat.app.ActivityC0153c;
import com.roblox.audio.AbstractC2714a;
import ec.C3113e;
import ec.C3118j;
import org.webrtc.voiceengine.AppAudioManagerBase;
import p033c7.C1134c;

/* renamed from: q6.c */
/* loaded from: classes.dex */
public class C4323c implements InterfaceC4321a {

    /* renamed from: a */
    final AppAudioManagerBase f17556a;

    /* renamed from: b */
    final AbstractC2714a f17557b;

    public C4323c(Context context) {
        if (C1134c.m6537a().mo6576S0()) {
            this.f17557b = C3118j.m13712s(context);
            this.f17556a = null;
        } else {
            this.f17557b = null;
            this.f17556a = C3113e.m13678i(context);
        }
    }

    @Override // p213q6.InterfaceC4321a
    /* renamed from: a */
    public void mo17837a(ActivityC0153c activityC0153c) {
        if (C1134c.m6537a().mo6576S0()) {
            this.f17557b.mo12097f(activityC0153c);
        } else {
            this.f17556a.setActivityForPermissionRequest(activityC0153c);
        }
    }

    @Override // p213q6.InterfaceC4321a
    /* renamed from: b */
    public void mo17838b() {
        if (C1134c.m6537a().mo6576S0()) {
            AbstractC2714a abstractC2714a = this.f17557b;
            if (abstractC2714a != null) {
                abstractC2714a.m12094a();
                return;
            }
            return;
        }
        AppAudioManagerBase appAudioManagerBase = this.f17556a;
        if (appAudioManagerBase != null) {
            appAudioManagerBase.dispose();
        }
    }
}
