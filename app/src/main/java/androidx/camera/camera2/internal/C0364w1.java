package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0445m;
import androidx.concurrent.futures.C0541c;
import java.util.concurrent.Executor;
import p206q.C4288a;
import p218r.C4414z;

/* renamed from: androidx.camera.camera2.internal.w1 */
/* loaded from: classes.dex */
public class C0364w1 {

    /* renamed from: a */
    private final C0350t f1642a;

    /* renamed from: b */
    private final C0368x1 f1643b;

    /* renamed from: c */
    private final Executor f1644c;

    /* renamed from: d */
    private boolean f1645d = false;

    /* renamed from: e */
    private C0541c.a<Integer> f1646e;

    /* renamed from: f */
    private C0350t.c f1647f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0364w1(C0350t c0350t, C4414z c4414z, Executor executor) {
        this.f1642a = c0350t;
        this.f1643b = new C0368x1(c4414z, 0);
        this.f1644c = executor;
    }

    /* renamed from: a */
    private void m1799a() {
        C0541c.a<Integer> aVar = this.f1646e;
        if (aVar != null) {
            aVar.m2521f(new C0445m("Cancelled by another setExposureCompensationIndex()"));
            this.f1646e = null;
        }
        C0350t.c cVar = this.f1647f;
        if (cVar != null) {
            this.f1642a.m1717W(cVar);
            this.f1647f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1800b(boolean z10) {
        if (z10 == this.f1645d) {
            return;
        }
        this.f1645d = z10;
        if (z10) {
            return;
        }
        this.f1643b.m1804b(0);
        m1799a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1801c(C4288a.a aVar) {
        aVar.m17775e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f1643b.m1803a()));
    }
}
