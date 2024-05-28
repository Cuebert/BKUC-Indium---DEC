package p267v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0445m;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.Executor;
import p206q.C4288a;
import p279w.InterfaceC5061o0;
import p305y.C5586f;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C4929g {

    /* renamed from: c */
    private final C0350t f18970c;

    /* renamed from: d */
    final Executor f18971d;

    /* renamed from: g */
    C0541c.a<Void> f18974g;

    /* renamed from: a */
    private boolean f18968a = false;

    /* renamed from: b */
    private boolean f18969b = false;

    /* renamed from: e */
    final Object f18972e = new Object();

    /* renamed from: f */
    private C4288a.a f18973f = new C4288a.a();

    /* renamed from: h */
    private final C0350t.c f18975h = new C0350t.c() { // from class: v.a
        @Override // androidx.camera.camera2.internal.C0350t.c
        /* renamed from: a */
        public final boolean mo1400a(TotalCaptureResult totalCaptureResult) {
            boolean m19338q;
            m19338q = C4929g.this.m19338q(totalCaptureResult);
            return m19338q;
        }
    };

    public C4929g(C0350t c0350t, Executor executor) {
        this.f18970c = c0350t;
        this.f18971d = executor;
    }

    /* renamed from: h */
    private void m19332h(C4932j c4932j) {
        synchronized (this.f18972e) {
            for (InterfaceC5061o0.a aVar : c4932j.mo1367c()) {
                this.f18973f.mo1926a().mo19659g(aVar, c4932j.mo1366b(aVar));
            }
        }
    }

    /* renamed from: j */
    private void m19333j() {
        synchronized (this.f18972e) {
            this.f18973f = new C4288a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m19335n(final C0541c.a aVar) throws Exception {
        this.f18971d.execute(new Runnable() { // from class: v.e
            @Override // java.lang.Runnable
            public final void run() {
                C4929g.this.m19334m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m19337p(final C0541c.a aVar) throws Exception {
        this.f18971d.execute(new Runnable() { // from class: v.d
            @Override // java.lang.Runnable
            public final void run() {
                C4929g.this.m19336o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean m19338q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f18974g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof p279w.C5043j2
            if (r0 == 0) goto L32
            w.j2 r3 = (p279w.C5043j2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.m19578c(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f18974g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r3 = r2.f18974g
            r2.f18974g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.m2519c(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p267v.C4929g.m19338q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m19339r(boolean z10) {
        if (this.f18968a == z10) {
            return;
        }
        this.f18968a = z10;
        if (z10) {
            if (this.f18969b) {
                m19342v();
            }
        } else {
            C0541c.a<Void> aVar = this.f18974g;
            if (aVar != null) {
                aVar.m2521f(new C0445m("The camera control has became inactive."));
                this.f18974g = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m19336o(C0541c.a<Void> aVar) {
        this.f18969b = true;
        C0541c.a<Void> aVar2 = this.f18974g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f18974g = aVar;
        if (this.f18968a) {
            m19342v();
        }
        if (aVar2 != null) {
            aVar2.m2521f(new C0445m("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: v */
    private void m19342v() {
        this.f18970c.m1728d0();
        this.f18969b = false;
    }

    /* renamed from: g */
    public InterfaceFutureC2565m<Void> m19343g(C4932j c4932j) {
        m19332h(c4932j);
        return C5586f.m20510j(C0541c.m2515a(new C0541c.c() { // from class: v.c
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m19335n;
                m19335n = C4929g.this.m19335n(aVar);
                return m19335n;
            }
        }));
    }

    /* renamed from: i */
    public InterfaceFutureC2565m<Void> m19344i() {
        m19333j();
        return C5586f.m20510j(C0541c.m2515a(new C0541c.c() { // from class: v.b
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m19337p;
                m19337p = C4929g.this.m19337p(aVar);
                return m19337p;
            }
        }));
    }

    /* renamed from: k */
    public C4288a m19345k() {
        C4288a m17773c;
        synchronized (this.f18972e) {
            if (this.f18974g != null) {
                this.f18973f.mo1926a().mo19659g(C4288a.f17508F, Integer.valueOf(this.f18974g.hashCode()));
            }
            m17773c = this.f18973f.m17773c();
        }
        return m17773c;
    }

    /* renamed from: l */
    public C0350t.c m19346l() {
        return this.f18975h;
    }

    /* renamed from: s */
    public void m19347s(final boolean z10) {
        this.f18971d.execute(new Runnable() { // from class: v.f
            @Override // java.lang.Runnable
            public final void run() {
                C4929g.this.m19339r(z10);
            }
        });
    }
}
