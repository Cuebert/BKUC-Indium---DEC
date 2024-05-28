package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p231s.C4487g;
import p255u.C4763g;
import p255u.C4764h;
import p255u.C4777u;
import p279w.AbstractC5073r0;
import p279w.C5095y1;
import p305y.C5586f;

/* renamed from: androidx.camera.camera2.internal.u2 */
/* loaded from: classes.dex */
public class C0357u2 extends C0337p2 {

    /* renamed from: o */
    private final Object f1612o;

    /* renamed from: p */
    private List<AbstractC5073r0> f1613p;

    /* renamed from: q */
    InterfaceFutureC2565m<Void> f1614q;

    /* renamed from: r */
    private final C4764h f1615r;

    /* renamed from: s */
    private final C4777u f1616s;

    /* renamed from: t */
    private final C4763g f1617t;

    public C0357u2(C5095y1 c5095y1, C5095y1 c5095y12, C0352t1 c0352t1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c0352t1, executor, scheduledExecutorService, handler);
        this.f1612o = new Object();
        this.f1615r = new C4764h(c5095y1, c5095y12);
        this.f1616s = new C4777u(c5095y1);
        this.f1617t = new C4763g(c5095y12);
    }

    /* renamed from: O */
    public /* synthetic */ void m1776O() {
        m1780N("Session call super.close()");
        super.close();
    }

    /* renamed from: P */
    public /* synthetic */ void m1777P(InterfaceC0313j2 interfaceC0313j2) {
        super.mo1595r(interfaceC0313j2);
    }

    /* renamed from: Q */
    public /* synthetic */ InterfaceFutureC2565m m1778Q(CameraDevice cameraDevice, C4487g c4487g, List list) {
        return super.mo1665l(cameraDevice, c4487g, list);
    }

    /* renamed from: R */
    public /* synthetic */ int m1779R(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.mo1590m(captureRequest, captureCallback);
    }

    /* renamed from: N */
    void m1780N(String str) {
        C0463q1.m2202a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.InterfaceC0313j2
    public void close() {
        m1780N("Session call close()");
        this.f1616s.m18962f();
        this.f1616s.m18961c().mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.q2
            public /* synthetic */ RunnableC0341q2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0357u2.this.m1776O();
            }
        }, mo1662c());
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: f */
    public InterfaceFutureC2565m<List<Surface>> mo1664f(List<AbstractC5073r0> list, long j10) {
        InterfaceFutureC2565m<List<Surface>> mo1664f;
        synchronized (this.f1612o) {
            this.f1613p = list;
            mo1664f = super.mo1664f(list, j10);
        }
        return mo1664f;
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: h */
    public InterfaceFutureC2565m<Void> mo1586h() {
        return this.f1616s.m18961c();
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: l */
    public InterfaceFutureC2565m<Void> mo1665l(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list) {
        InterfaceFutureC2565m<Void> m20510j;
        synchronized (this.f1612o) {
            InterfaceFutureC2565m<Void> m18963g = this.f1616s.m18963g(cameraDevice, c4487g, list, this.f1510b.m1759e(), new C4777u.b() { // from class: androidx.camera.camera2.internal.s2
                public /* synthetic */ C0349s2() {
                }

                @Override // p255u.C4777u.b
                /* renamed from: a */
                public final InterfaceFutureC2565m mo1683a(CameraDevice cameraDevice2, C4487g c4487g2, List list2) {
                    InterfaceFutureC2565m m1778Q;
                    m1778Q = C0357u2.this.m1778Q(cameraDevice2, c4487g2, list2);
                    return m1778Q;
                }
            });
            this.f1614q = m18963g;
            m20510j = C5586f.m20510j(m18963g);
        }
        return m20510j;
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: m */
    public int mo1590m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f1616s.m18964h(captureRequest, captureCallback, new C4777u.c() { // from class: androidx.camera.camera2.internal.t2
            public /* synthetic */ C0353t2() {
            }

            @Override // p255u.C4777u.c
            /* renamed from: a */
            public final int mo1771a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int m1779R;
                m1779R = C0357u2.this.m1779R(captureRequest2, captureCallback2);
                return m1779R;
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: p */
    public void mo1593p(InterfaceC0313j2 interfaceC0313j2) {
        synchronized (this.f1612o) {
            this.f1615r.m18944a(this.f1613p);
        }
        m1780N("onClosed()");
        super.mo1593p(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: r */
    public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
        m1780N("Session onConfigured()");
        this.f1617t.m18942c(interfaceC0313j2, this.f1510b.m1760f(), this.f1510b.m1758d(), new C4763g.a() { // from class: androidx.camera.camera2.internal.r2
            public /* synthetic */ C0345r2() {
            }

            @Override // p255u.C4763g.a
            /* renamed from: a */
            public final void mo1682a(InterfaceC0313j2 interfaceC0313j22) {
                C0357u2.this.m1777P(interfaceC0313j22);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C0337p2, androidx.camera.camera2.internal.C0361v2.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f1612o) {
            if (m1660C()) {
                this.f1615r.m18944a(this.f1613p);
            } else {
                InterfaceFutureC2565m<Void> interfaceFutureC2565m = this.f1614q;
                if (interfaceFutureC2565m != null) {
                    interfaceFutureC2565m.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
