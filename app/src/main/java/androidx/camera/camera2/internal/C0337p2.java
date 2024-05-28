package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.C0361v2;
import androidx.camera.camera2.internal.InterfaceC0313j2;
import androidx.camera.core.C0463q1;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p218r.C4373a0;
import p218r.C4384g;
import p231s.C4482b;
import p231s.C4487g;
import p279w.AbstractC5073r0;
import p279w.C5088w0;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;
import p305y.InterfaceC5583c;

/* renamed from: androidx.camera.camera2.internal.p2 */
/* loaded from: classes.dex */
public class C0337p2 extends InterfaceC0313j2.a implements InterfaceC0313j2, C0361v2.b {

    /* renamed from: b */
    final C0352t1 f1510b;

    /* renamed from: c */
    final Handler f1511c;

    /* renamed from: d */
    final Executor f1512d;

    /* renamed from: e */
    private final ScheduledExecutorService f1513e;

    /* renamed from: f */
    InterfaceC0313j2.a f1514f;

    /* renamed from: g */
    C4384g f1515g;

    /* renamed from: h */
    InterfaceFutureC2565m<Void> f1516h;

    /* renamed from: i */
    C0541c.a<Void> f1517i;

    /* renamed from: j */
    private InterfaceFutureC2565m<List<Surface>> f1518j;

    /* renamed from: a */
    final Object f1509a = new Object();

    /* renamed from: k */
    private List<AbstractC5073r0> f1519k = null;

    /* renamed from: l */
    private boolean f1520l = false;

    /* renamed from: m */
    private boolean f1521m = false;

    /* renamed from: n */
    private boolean f1522n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.p2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {
        a() {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0337p2.this.mo1583b();
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.f1510b.m1764j(c0337p2);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r12) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.p2$b */
    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C0337p2.this.m1658A(cameraCaptureSession);
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.mo1591n(c0337p2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C0337p2.this.m1658A(cameraCaptureSession);
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.mo1592o(c0337p2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C0337p2.this.m1658A(cameraCaptureSession);
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.mo1593p(c0337p2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C0541c.a<Void> aVar;
            try {
                C0337p2.this.m1658A(cameraCaptureSession);
                C0337p2 c0337p2 = C0337p2.this;
                c0337p2.mo1594q(c0337p2);
                synchronized (C0337p2.this.f1509a) {
                    C0654h.m3468g(C0337p2.this.f1517i, "OpenCaptureSession completer should not null");
                    C0337p2 c0337p22 = C0337p2.this;
                    aVar = c0337p22.f1517i;
                    c0337p22.f1517i = null;
                }
                aVar.m2521f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C0337p2.this.f1509a) {
                    C0654h.m3468g(C0337p2.this.f1517i, "OpenCaptureSession completer should not null");
                    C0337p2 c0337p23 = C0337p2.this;
                    C0541c.a<Void> aVar2 = c0337p23.f1517i;
                    c0337p23.f1517i = null;
                    aVar2.m2521f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C0541c.a<Void> aVar;
            try {
                C0337p2.this.m1658A(cameraCaptureSession);
                C0337p2 c0337p2 = C0337p2.this;
                c0337p2.mo1595r(c0337p2);
                synchronized (C0337p2.this.f1509a) {
                    C0654h.m3468g(C0337p2.this.f1517i, "OpenCaptureSession completer should not null");
                    C0337p2 c0337p22 = C0337p2.this;
                    aVar = c0337p22.f1517i;
                    c0337p22.f1517i = null;
                }
                aVar.m2519c(null);
            } catch (Throwable th) {
                synchronized (C0337p2.this.f1509a) {
                    C0654h.m3468g(C0337p2.this.f1517i, "OpenCaptureSession completer should not null");
                    C0337p2 c0337p23 = C0337p2.this;
                    C0541c.a<Void> aVar2 = c0337p23.f1517i;
                    c0337p23.f1517i = null;
                    aVar2.m2519c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C0337p2.this.m1658A(cameraCaptureSession);
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.mo1596s(c0337p2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C0337p2.this.m1658A(cameraCaptureSession);
            C0337p2 c0337p2 = C0337p2.this;
            c0337p2.mo1598u(c0337p2, surface);
        }
    }

    public C0337p2(C0352t1 c0352t1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f1510b = c0352t1;
        this.f1511c = handler;
        this.f1512d = executor;
        this.f1513e = scheduledExecutorService;
    }

    /* renamed from: D */
    public /* synthetic */ void m1648D() {
        mo1597t(this);
    }

    /* renamed from: E */
    public /* synthetic */ void m1649E(InterfaceC0313j2 interfaceC0313j2) {
        this.f1510b.m1762h(this);
        mo1597t(interfaceC0313j2);
        this.f1514f.mo1593p(interfaceC0313j2);
    }

    /* renamed from: F */
    public /* synthetic */ void m1650F(InterfaceC0313j2 interfaceC0313j2) {
        this.f1514f.mo1597t(interfaceC0313j2);
    }

    /* renamed from: G */
    public /* synthetic */ Object m1651G(List list, C4373a0 c4373a0, C4487g c4487g, C0541c.a aVar) throws Exception {
        String str;
        synchronized (this.f1509a) {
            m1659B(list);
            C0654h.m3470i(this.f1517i == null, "The openCaptureSessionCompleter can only set once!");
            this.f1517i = aVar;
            c4373a0.m18101a(c4487g);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: H */
    public /* synthetic */ InterfaceFutureC2565m m1652H(List list, List list2) throws Exception {
        C0463q1.m2202a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return C5586f.m20506f(new AbstractC5073r0.a("Surface closed", (AbstractC5073r0) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return C5586f.m20506f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C5586f.m20508h(list2);
    }

    /* renamed from: A */
    void m1658A(CameraCaptureSession cameraCaptureSession) {
        if (this.f1515g == null) {
            this.f1515g = C4384g.m18122d(cameraCaptureSession, this.f1511c);
        }
    }

    /* renamed from: B */
    void m1659B(List<AbstractC5073r0> list) throws AbstractC5073r0.a {
        synchronized (this.f1509a) {
            m1661I();
            C5088w0.m19711f(list);
            this.f1519k = list;
        }
    }

    /* renamed from: C */
    public boolean m1660C() {
        boolean z10;
        synchronized (this.f1509a) {
            z10 = this.f1516h != null;
        }
        return z10;
    }

    /* renamed from: I */
    void m1661I() {
        synchronized (this.f1509a) {
            List<AbstractC5073r0> list = this.f1519k;
            if (list != null) {
                C5088w0.m19710e(list);
                this.f1519k = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: a */
    public InterfaceC0313j2.a mo1582a() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: b */
    public void mo1583b() {
        m1661I();
    }

    @Override // androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: c */
    public Executor mo1662c() {
        return this.f1512d;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    public void close() {
        C0654h.m3468g(this.f1515g, "Need to call openCaptureSession before using this API.");
        this.f1510b.m1763i(this);
        this.f1515g.m18125c().close();
        mo1662c().execute(new Runnable() { // from class: androidx.camera.camera2.internal.l2
            public /* synthetic */ RunnableC0321l2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0337p2.this.m1648D();
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: d */
    public C4487g mo1663d(int i10, List<C4482b> list, InterfaceC0313j2.a aVar) {
        this.f1514f = aVar;
        return new C4487g(i10, list, mo1662c(), new b());
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: e */
    public void mo1584e() throws CameraAccessException {
        C0654h.m3468g(this.f1515g, "Need to call openCaptureSession before using this API.");
        this.f1515g.m18125c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: f */
    public InterfaceFutureC2565m<List<Surface>> mo1664f(List<AbstractC5073r0> list, long j10) {
        synchronized (this.f1509a) {
            if (this.f1521m) {
                return C5586f.m20506f(new CancellationException("Opener is disabled"));
            }
            C5584d m20500f = C5584d.m20496a(C5088w0.m19716k(list, false, j10, mo1662c(), this.f1513e)).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.o2

                /* renamed from: b */
                public final /* synthetic */ List f1503b;

                public /* synthetic */ C0333o2(List list2) {
                    r2 = list2;
                }

                @Override // p305y.InterfaceC5581a
                /* renamed from: a */
                public final InterfaceFutureC2565m mo1404a(Object obj) {
                    InterfaceFutureC2565m m1652H;
                    m1652H = C0337p2.this.m1652H(r2, (List) obj);
                    return m1652H;
                }
            }, mo1662c());
            this.f1518j = m20500f;
            return C5586f.m20510j(m20500f);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: g */
    public int mo1585g(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C0654h.m3468g(this.f1515g, "Need to call openCaptureSession before using this API.");
        return this.f1515g.m18123a(list, mo1662c(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: h */
    public InterfaceFutureC2565m<Void> mo1586h() {
        return C5586f.m20508h(null);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: i */
    public C4384g mo1587i() {
        C0654h.m3467f(this.f1515g);
        return this.f1515g;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: j */
    public void mo1588j() throws CameraAccessException {
        C0654h.m3468g(this.f1515g, "Need to call openCaptureSession before using this API.");
        this.f1515g.m18125c().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: k */
    public CameraDevice mo1589k() {
        C0654h.m3467f(this.f1515g);
        return this.f1515g.m18125c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.C0361v2.b
    /* renamed from: l */
    public InterfaceFutureC2565m<Void> mo1665l(CameraDevice cameraDevice, C4487g c4487g, List<AbstractC5073r0> list) {
        synchronized (this.f1509a) {
            if (this.f1521m) {
                return C5586f.m20506f(new CancellationException("Opener is disabled"));
            }
            this.f1510b.m1766l(this);
            InterfaceFutureC2565m<Void> m2515a = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.k2

                /* renamed from: b */
                public final /* synthetic */ List f1447b;

                /* renamed from: c */
                public final /* synthetic */ C4373a0 f1448c;

                /* renamed from: d */
                public final /* synthetic */ C4487g f1449d;

                public /* synthetic */ C0317k2(List list2, C4373a0 c4373a0, C4487g c4487g2) {
                    r2 = list2;
                    r3 = c4373a0;
                    r4 = c4487g2;
                }

                @Override // androidx.concurrent.futures.C0541c.c
                /* renamed from: a */
                public final Object mo1498a(C0541c.a aVar) {
                    Object m1651G;
                    m1651G = C0337p2.this.m1651G(r2, r3, r4, aVar);
                    return m1651G;
                }
            });
            this.f1516h = m2515a;
            C5586f.m20502b(m2515a, new a(), C5493a.m20219a());
            return C5586f.m20510j(this.f1516h);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2
    /* renamed from: m */
    public int mo1590m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C0654h.m3468g(this.f1515g, "Need to call openCaptureSession before using this API.");
        return this.f1515g.m18124b(captureRequest, mo1662c(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: n */
    public void mo1591n(InterfaceC0313j2 interfaceC0313j2) {
        this.f1514f.mo1591n(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: o */
    public void mo1592o(InterfaceC0313j2 interfaceC0313j2) {
        this.f1514f.mo1592o(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: p */
    public void mo1593p(InterfaceC0313j2 interfaceC0313j2) {
        InterfaceFutureC2565m<Void> interfaceFutureC2565m;
        synchronized (this.f1509a) {
            if (this.f1520l) {
                interfaceFutureC2565m = null;
            } else {
                this.f1520l = true;
                C0654h.m3468g(this.f1516h, "Need to call openCaptureSession before using this API.");
                interfaceFutureC2565m = this.f1516h;
            }
        }
        mo1583b();
        if (interfaceFutureC2565m != null) {
            interfaceFutureC2565m.mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.n2

                /* renamed from: o */
                public final /* synthetic */ InterfaceC0313j2 f1466o;

                public /* synthetic */ RunnableC0329n2(InterfaceC0313j2 interfaceC0313j22) {
                    r2 = interfaceC0313j22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0337p2.this.m1649E(r2);
                }
            }, C5493a.m20219a());
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: q */
    public void mo1594q(InterfaceC0313j2 interfaceC0313j2) {
        mo1583b();
        this.f1510b.m1764j(this);
        this.f1514f.mo1594q(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: r */
    public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
        this.f1510b.m1765k(this);
        this.f1514f.mo1595r(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: s */
    public void mo1596s(InterfaceC0313j2 interfaceC0313j2) {
        this.f1514f.mo1596s(interfaceC0313j2);
    }

    @Override // androidx.camera.camera2.internal.C0361v2.b
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f1509a) {
                if (!this.f1521m) {
                    InterfaceFutureC2565m<List<Surface>> interfaceFutureC2565m = this.f1518j;
                    r1 = interfaceFutureC2565m != null ? interfaceFutureC2565m : null;
                    this.f1521m = true;
                }
                z10 = !m1660C();
            }
            return z10;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: t */
    public void mo1597t(InterfaceC0313j2 interfaceC0313j2) {
        InterfaceFutureC2565m<Void> interfaceFutureC2565m;
        synchronized (this.f1509a) {
            if (this.f1522n) {
                interfaceFutureC2565m = null;
            } else {
                this.f1522n = true;
                C0654h.m3468g(this.f1516h, "Need to call openCaptureSession before using this API.");
                interfaceFutureC2565m = this.f1516h;
            }
        }
        if (interfaceFutureC2565m != null) {
            interfaceFutureC2565m.mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.m2

                /* renamed from: o */
                public final /* synthetic */ InterfaceC0313j2 f1460o;

                public /* synthetic */ RunnableC0325m2(InterfaceC0313j2 interfaceC0313j22) {
                    r2 = interfaceC0313j22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0337p2.this.m1650F(r2);
                }
            }, C5493a.m20219a());
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
    /* renamed from: u */
    public void mo1598u(InterfaceC0313j2 interfaceC0313j2, Surface surface) {
        this.f1514f.mo1598u(interfaceC0313j2, surface);
    }
}
