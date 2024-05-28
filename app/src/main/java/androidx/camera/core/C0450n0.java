package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0450n0;
import androidx.camera.core.impl.utils.C0432l;
import androidx.core.util.C0654h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p014b0.InterfaceC0963d;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5038i1;
import p279w.C5057n0;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.C5097z0;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5066p1;
import p279w.InterfaceC5067p2;
import p292x.C5493a;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.n0 */
/* loaded from: classes.dex */
public final class C0450n0 extends AbstractC0496y2 {

    /* renamed from: p */
    public static final d f2011p = new d();

    /* renamed from: q */
    private static final Boolean f2012q = null;

    /* renamed from: l */
    final AbstractC0462q0 f2013l;

    /* renamed from: m */
    private final Object f2014m;

    /* renamed from: n */
    private a f2015n;

    /* renamed from: o */
    private AbstractC5073r0 f2016o;

    /* renamed from: androidx.camera.core.n0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Size mo2124a();

        /* renamed from: b */
        void mo2125b(InterfaceC0443l1 interfaceC0443l1);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.n0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* renamed from: androidx.camera.core.n0$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC5063o2.a<C0450n0, C5097z0, c> {

        /* renamed from: a */
        private final C5070q1 f2017a;

        public c() {
            this(C5070q1.m19660L());
        }

        /* renamed from: d */
        static c m2151d(InterfaceC5061o0 interfaceC5061o0) {
            return new c(C5070q1.m19661M(interfaceC5061o0));
        }

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f2017a;
        }

        /* renamed from: c */
        public C0450n0 m2152c() {
            if (mo1926a().mo1365a(InterfaceC5026f1.f19166g, null) != null && mo1926a().mo1365a(InterfaceC5026f1.f19169j, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            return new C0450n0(mo1927b());
        }

        @Override // p279w.InterfaceC5063o2.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5097z0 mo1927b() {
            return new C5097z0(C5083u1.m19702J(this.f2017a));
        }

        /* renamed from: f */
        public c m2154f(int i10) {
            mo1926a().mo19659g(C5097z0.f19354A, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public c m2155g(Size size) {
            mo1926a().mo19659g(InterfaceC5026f1.f19170k, size);
            return this;
        }

        /* renamed from: h */
        public c m2156h(int i10) {
            mo1926a().mo19659g(InterfaceC5063o2.f19282r, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: i */
        public c m2157i(int i10) {
            mo1926a().mo19659g(InterfaceC5026f1.f19166g, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: j */
        public c m2158j(Class<C0450n0> cls) {
            mo1926a().mo19659g(InterfaceC5941i.f21845w, cls);
            if (mo1926a().mo1365a(InterfaceC5941i.f21844v, null) == null) {
                m2159k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public c m2159k(String str) {
            mo1926a().mo19659g(InterfaceC5941i.f21844v, str);
            return this;
        }

        /* renamed from: l */
        public c m2160l(Size size) {
            mo1926a().mo19659g(InterfaceC5026f1.f19169j, size);
            return this;
        }

        private c(C5070q1 c5070q1) {
            this.f2017a = c5070q1;
            Class cls = (Class) c5070q1.mo1365a(InterfaceC5941i.f21845w, null);
            if (cls != null && !cls.equals(C0450n0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m2158j(C0450n0.class);
        }
    }

    /* renamed from: androidx.camera.core.n0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2018a;

        /* renamed from: b */
        private static final C5097z0 f2019b;

        static {
            Size size = new Size(640, 480);
            f2018a = size;
            f2019b = new c().m2155g(size).m2156h(1).m2157i(0).mo1927b();
        }

        /* renamed from: a */
        public C5097z0 m2161a() {
            return f2019b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.n0$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    C0450n0(C5097z0 c5097z0) {
        super(c5097z0);
        this.f2014m = new Object();
        if (((C5097z0) m2305g()).m19727I(0) == 1) {
            this.f2013l = new C0466r0();
        } else {
            this.f2013l = new C0470s0(c5097z0.m19726H(C5493a.m20220b()));
        }
        this.f2013l.m2196u(m2148S());
        this.f2013l.m2197v(m2149U());
    }

    /* renamed from: T */
    private boolean m2137T(InterfaceC5017d0 interfaceC5017d0) {
        return m2149U() && m2308k(interfaceC5017d0) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m2138V(C0444l2 c0444l2, C0444l2 c0444l22) {
        c0444l2.m2131m();
        if (c0444l22 != null) {
            c0444l22.m2131m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m2139W(String str, C5097z0 c5097z0, Size size, C5015c2 c5015c2, C5015c2.e eVar) {
        m2143N();
        this.f2013l.mo2191g();
        if (m2312p(str)) {
            m2298I(m2144O(str, c5097z0, size).m19514m());
            m2316t();
        }
    }

    /* renamed from: Z */
    private void m2141Z() {
        InterfaceC5017d0 m2302d = m2302d();
        if (m2302d != null) {
            this.f2013l.m2199x(m2308k(m2302d));
        }
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: A */
    public void mo1916A() {
        m2143N();
        this.f2013l.m2192j();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: B */
    protected InterfaceC5063o2<?> mo1970B(InterfaceC5009b0 interfaceC5009b0, InterfaceC5063o2.a<?, ?, ?> aVar) {
        Size mo2124a;
        Boolean m2147R = m2147R();
        boolean m19724a = interfaceC5009b0.mo1573g().m19724a(InterfaceC0963d.class);
        AbstractC0462q0 abstractC0462q0 = this.f2013l;
        if (m2147R != null) {
            m19724a = m2147R.booleanValue();
        }
        abstractC0462q0.m2195t(m19724a);
        synchronized (this.f2014m) {
            a aVar2 = this.f2015n;
            mo2124a = aVar2 != null ? aVar2.mo2124a() : null;
        }
        if (mo2124a != null) {
            aVar.mo1926a().mo19659g(InterfaceC5026f1.f19169j, mo2124a);
        }
        return aVar.mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: E */
    protected Size mo1918E(Size size) {
        m2298I(m2144O(m2304f(), (C5097z0) m2305g(), size).m19514m());
        return size;
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: G */
    public void mo1971G(Matrix matrix) {
        this.f2013l.m2200y(matrix);
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: H */
    public void mo2142H(Rect rect) {
        super.mo2142H(rect);
        this.f2013l.m2201z(rect);
    }

    /* renamed from: N */
    void m2143N() {
        C0432l.m2119a();
        AbstractC5073r0 abstractC5073r0 = this.f2016o;
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
            this.f2016o = null;
        }
    }

    /* renamed from: O */
    C5015c2.b m2144O(final String str, final C5097z0 c5097z0, final Size size) {
        final C0444l2 c0444l2;
        C0432l.m2119a();
        Executor executor = (Executor) C0654h.m3467f(c5097z0.m19726H(C5493a.m20220b()));
        boolean z10 = true;
        int m2146Q = m2145P() == 1 ? m2146Q() : 4;
        if (c5097z0.m19729K() != null) {
            c0444l2 = new C0444l2(c5097z0.m19729K().m2133a(size.getWidth(), size.getHeight(), m2306i(), m2146Q, 0L));
        } else {
            c0444l2 = new C0444l2(C0451n1.m2162a(size.getWidth(), size.getHeight(), m2306i(), m2146Q));
        }
        boolean m2137T = m2302d() != null ? m2137T(m2302d()) : false;
        int height = m2137T ? size.getHeight() : size.getWidth();
        int width = m2137T ? size.getWidth() : size.getHeight();
        int i10 = m2148S() == 2 ? 1 : 35;
        boolean z11 = m2306i() == 35 && m2148S() == 2;
        if (m2306i() != 35 || ((m2302d() == null || m2308k(m2302d()) == 0) && !Boolean.TRUE.equals(m2147R()))) {
            z10 = false;
        }
        final C0444l2 c0444l22 = (z11 || z10) ? new C0444l2(C0451n1.m2162a(height, width, i10, c0444l2.mo1876h())) : null;
        if (c0444l22 != null) {
            this.f2013l.m2198w(c0444l22);
        }
        m2141Z();
        c0444l2.mo1873e(this.f2013l, executor);
        C5015c2.b m19501o = C5015c2.b.m19501o(c5097z0);
        AbstractC5073r0 abstractC5073r0 = this.f2016o;
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
        }
        C5038i1 c5038i1 = new C5038i1(c0444l2.mo1870a(), size, m2306i());
        this.f2016o = c5038i1;
        c5038i1.m19682i().mo2501b(new Runnable() { // from class: androidx.camera.core.k0
            @Override // java.lang.Runnable
            public final void run() {
                C0450n0.m2138V(C0444l2.this, c0444l22);
            }
        }, C5493a.m20222d());
        m19501o.m19512k(this.f2016o);
        m19501o.m19507f(new C5015c2.c() { // from class: androidx.camera.core.l0
            @Override // p279w.C5015c2.c
            /* renamed from: a */
            public final void mo1878a(C5015c2 c5015c2, C5015c2.e eVar) {
                C0450n0.this.m2139W(str, c5097z0, size, c5015c2, eVar);
            }
        });
        return m19501o;
    }

    /* renamed from: P */
    public int m2145P() {
        return ((C5097z0) m2305g()).m19727I(0);
    }

    /* renamed from: Q */
    public int m2146Q() {
        return ((C5097z0) m2305g()).m19728J(6);
    }

    /* renamed from: R */
    public Boolean m2147R() {
        return ((C5097z0) m2305g()).m19730L(f2012q);
    }

    /* renamed from: S */
    public int m2148S() {
        return ((C5097z0) m2305g()).m19731M(1);
    }

    /* renamed from: U */
    public boolean m2149U() {
        return ((C5097z0) m2305g()).m19732N(Boolean.FALSE).booleanValue();
    }

    /* renamed from: Y */
    public void m2150Y(Executor executor, final a aVar) {
        synchronized (this.f2014m) {
            this.f2013l.m2194s(executor, new a() { // from class: androidx.camera.core.j0
                @Override // androidx.camera.core.C0450n0.a
                /* renamed from: a */
                public /* synthetic */ Size mo2124a() {
                    return C0446m0.m2132a(this);
                }

                @Override // androidx.camera.core.C0450n0.a
                /* renamed from: b */
                public final void mo2125b(InterfaceC0443l1 interfaceC0443l1) {
                    C0450n0.a.this.mo2125b(interfaceC0443l1);
                }
            });
            if (this.f2015n == null) {
                m2314r();
            }
            this.f2015n = aVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: h */
    public InterfaceC5063o2<?> mo1921h(boolean z10, InterfaceC5067p2 interfaceC5067p2) {
        InterfaceC5061o0 mo1381a = interfaceC5067p2.mo1381a(InterfaceC5067p2.b.IMAGE_ANALYSIS, 1);
        if (z10) {
            mo1381a = C5057n0.m19631b(mo1381a, f2011p.m2161a());
        }
        if (mo1381a == null) {
            return null;
        }
        return mo1922n(mo1381a).mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: n */
    public InterfaceC5063o2.a<?, ?, ?> mo1922n(InterfaceC5061o0 interfaceC5061o0) {
        return c.m2151d(interfaceC5061o0);
    }

    public String toString() {
        return "ImageAnalysis:" + m2307j();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: x */
    public void mo1923x() {
        this.f2013l.m2190f();
    }
}
