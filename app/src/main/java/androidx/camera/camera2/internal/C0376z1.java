package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0445m;
import androidx.concurrent.futures.C0541c;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p206q.C4288a;
import p255u.C4767k;
import p279w.AbstractC5032h;
import p279w.C5040j;
import p279w.C5045k0;
import p279w.C5095y1;
import p279w.InterfaceC5068q;
import p279w.InterfaceC5093y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.z1 */
/* loaded from: classes.dex */
public class C0376z1 {

    /* renamed from: u */
    private static final MeteringRectangle[] f1675u = new MeteringRectangle[0];

    /* renamed from: a */
    private final C0350t f1676a;

    /* renamed from: b */
    final Executor f1677b;

    /* renamed from: c */
    private final ScheduledExecutorService f1678c;

    /* renamed from: f */
    private final C4767k f1681f;

    /* renamed from: i */
    private ScheduledFuture<?> f1684i;

    /* renamed from: p */
    private MeteringRectangle[] f1691p;

    /* renamed from: q */
    private MeteringRectangle[] f1692q;

    /* renamed from: r */
    private MeteringRectangle[] f1693r;

    /* renamed from: s */
    C0541c.a<Object> f1694s;

    /* renamed from: t */
    C0541c.a<Void> f1695t;

    /* renamed from: d */
    private volatile boolean f1679d = false;

    /* renamed from: e */
    private volatile Rational f1680e = null;

    /* renamed from: g */
    private boolean f1682g = false;

    /* renamed from: h */
    Integer f1683h = 0;

    /* renamed from: j */
    long f1685j = 0;

    /* renamed from: k */
    boolean f1686k = false;

    /* renamed from: l */
    boolean f1687l = false;

    /* renamed from: m */
    private int f1688m = 1;

    /* renamed from: n */
    private C0350t.c f1689n = null;

    /* renamed from: o */
    private C0350t.c f1690o = null;

    /* renamed from: androidx.camera.camera2.internal.z1$a */
    /* loaded from: classes.dex */
    class a extends AbstractC5032h {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f1696a;

        a(C0541c.a aVar) {
            this.f1696a = aVar;
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: a */
        public void mo1638a() {
            C0541c.a aVar = this.f1696a;
            if (aVar != null) {
                aVar.m2521f(new C0445m("Camera is closed"));
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            C0541c.a aVar = this.f1696a;
            if (aVar != null) {
                aVar.m2519c(interfaceC5068q);
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: c */
        public void mo1639c(C5040j c5040j) {
            C0541c.a aVar = this.f1696a;
            if (aVar != null) {
                aVar.m2521f(new InterfaceC5093y.b(c5040j));
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.z1$b */
    /* loaded from: classes.dex */
    class b extends AbstractC5032h {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f1698a;

        b(C0541c.a aVar) {
            this.f1698a = aVar;
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: a */
        public void mo1638a() {
            C0541c.a aVar = this.f1698a;
            if (aVar != null) {
                aVar.m2521f(new C0445m("Camera is closed"));
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            C0541c.a aVar = this.f1698a;
            if (aVar != null) {
                aVar.m2519c(null);
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: c */
        public void mo1639c(C5040j c5040j) {
            C0541c.a aVar = this.f1698a;
            if (aVar != null) {
                aVar.m2521f(new InterfaceC5093y.b(c5040j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0376z1(C0350t c0350t, ScheduledExecutorService scheduledExecutorService, Executor executor, C5095y1 c5095y1) {
        MeteringRectangle[] meteringRectangleArr = f1675u;
        this.f1691p = meteringRectangleArr;
        this.f1692q = meteringRectangleArr;
        this.f1693r = meteringRectangleArr;
        this.f1694s = null;
        this.f1695t = null;
        this.f1676a = c0350t;
        this.f1677b = executor;
        this.f1678c = scheduledExecutorService;
        this.f1681f = new C4767k(c5095y1);
    }

    /* renamed from: f */
    private void m1817f() {
        C0541c.a<Void> aVar = this.f1695t;
        if (aVar != null) {
            aVar.m2519c(null);
            this.f1695t = null;
        }
    }

    /* renamed from: g */
    private void m1818g() {
        ScheduledFuture<?> scheduledFuture = this.f1684i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f1684i = null;
        }
    }

    /* renamed from: h */
    private void m1819h(String str) {
        this.f1676a.m1717W(this.f1689n);
        C0541c.a<Object> aVar = this.f1694s;
        if (aVar != null) {
            aVar.m2521f(new C0445m(str));
            this.f1694s = null;
        }
    }

    /* renamed from: i */
    private void m1820i(String str) {
        this.f1676a.m1717W(this.f1690o);
        C0541c.a<Void> aVar = this.f1695t;
        if (aVar != null) {
            aVar.m2521f(new C0445m(str));
            this.f1695t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ boolean m1821k(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C0350t.m1687K(totalCaptureResult, j10)) {
            return false;
        }
        m1817f();
        return true;
    }

    /* renamed from: o */
    private boolean m1822o() {
        return this.f1691p.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1823b(C4288a.a aVar) {
        aVar.m17775e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f1676a.m1710B(this.f1682g ? 1 : m1827j())));
        MeteringRectangle[] meteringRectangleArr = this.f1691p;
        if (meteringRectangleArr.length != 0) {
            aVar.m17775e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f1692q;
        if (meteringRectangleArr2.length != 0) {
            aVar.m17775e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f1693r;
        if (meteringRectangleArr3.length != 0) {
            aVar.m17775e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1824c(boolean z10, boolean z11) {
        if (this.f1679d) {
            C5045k0.a aVar = new C5045k0.a();
            aVar.m19604q(true);
            aVar.m19603p(this.f1688m);
            C4288a.a aVar2 = new C4288a.a();
            if (z10) {
                aVar2.m17775e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z11) {
                aVar2.m17775e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m19594e(aVar2.m17773c());
            this.f1676a.m1726c0(Collections.singletonList(aVar.m19597h()));
        }
    }

    /* renamed from: d */
    void m1825d(C0541c.a<Void> aVar) {
        m1820i("Cancelled by another cancelFocusAndMetering()");
        m1819h("Cancelled by cancelFocusAndMetering()");
        this.f1695t = aVar;
        m1818g();
        if (m1822o()) {
            m1824c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f1675u;
        this.f1691p = meteringRectangleArr;
        this.f1692q = meteringRectangleArr;
        this.f1693r = meteringRectangleArr;
        this.f1682g = false;
        final long m1732f0 = this.f1676a.m1732f0();
        if (this.f1695t != null) {
            final int m1710B = this.f1676a.m1710B(m1827j());
            C0350t.c cVar = new C0350t.c() { // from class: androidx.camera.camera2.internal.y1
                @Override // androidx.camera.camera2.internal.C0350t.c
                /* renamed from: a */
                public final boolean mo1400a(TotalCaptureResult totalCaptureResult) {
                    boolean m1821k;
                    m1821k = C0376z1.this.m1821k(m1710B, m1732f0, totalCaptureResult);
                    return m1821k;
                }
            };
            this.f1690o = cVar;
            this.f1676a.m1735s(cVar);
        }
    }

    /* renamed from: e */
    void m1826e() {
        m1825d(null);
    }

    /* renamed from: j */
    int m1827j() {
        return this.f1688m != 3 ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m1828l(boolean z10) {
        if (z10 == this.f1679d) {
            return;
        }
        this.f1679d = z10;
        if (this.f1679d) {
            return;
        }
        m1826e();
    }

    /* renamed from: m */
    public void m1829m(Rational rational) {
        this.f1680e = rational;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m1830n(int i10) {
        this.f1688m = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1831p(C0541c.a<Void> aVar) {
        if (!this.f1679d) {
            if (aVar != null) {
                aVar.m2521f(new C0445m("Camera is not active."));
                return;
            }
            return;
        }
        C5045k0.a aVar2 = new C5045k0.a();
        aVar2.m19603p(this.f1688m);
        aVar2.m19604q(true);
        C4288a.a aVar3 = new C4288a.a();
        aVar3.m17775e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.m19594e(aVar3.m17773c());
        aVar2.m19592c(new b(aVar));
        this.f1676a.m1726c0(Collections.singletonList(aVar2.m19597h()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1832q(C0541c.a<InterfaceC5068q> aVar, boolean z10) {
        if (!this.f1679d) {
            if (aVar != null) {
                aVar.m2521f(new C0445m("Camera is not active."));
                return;
            }
            return;
        }
        C5045k0.a aVar2 = new C5045k0.a();
        aVar2.m19603p(this.f1688m);
        aVar2.m19604q(true);
        C4288a.a aVar3 = new C4288a.a();
        aVar3.m17775e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            aVar3.m17775e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f1676a.m1709A(1)));
        }
        aVar2.m19594e(aVar3.m17773c());
        aVar2.m19592c(new a(aVar));
        this.f1676a.m1726c0(Collections.singletonList(aVar2.m19597h()));
    }
}
