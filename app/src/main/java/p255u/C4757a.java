package p255u;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import p206q.C4288a;
import p242t.C4563a;
import p279w.C5095y1;

/* renamed from: u.a */
/* loaded from: classes.dex */
public class C4757a {

    /* renamed from: a */
    private final Range<Integer> f18607a;

    public C4757a(C5095y1 c5095y1) {
        C4563a c4563a = (C4563a) c5095y1.m19725b(C4563a.class);
        if (c4563a == null) {
            this.f18607a = null;
        } else {
            this.f18607a = c4563a.m18648b();
        }
    }

    /* renamed from: a */
    public void m18933a(C4288a.a aVar) {
        Range<Integer> range = this.f18607a;
        if (range != null) {
            aVar.m17775e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
