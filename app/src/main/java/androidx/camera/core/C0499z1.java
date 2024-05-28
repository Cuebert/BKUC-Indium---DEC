package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.camera.core.C0492x2;
import androidx.camera.core.C0499z1;
import androidx.camera.core.impl.utils.C0432l;
import java.util.UUID;
import java.util.concurrent.Executor;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5057n0;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.C5089w1;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5010b1;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5018d1;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5049l0;
import p279w.InterfaceC5053m0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5066p1;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5068q;
import p292x.C5493a;
import p318z.C5934b;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.z1 */
/* loaded from: classes.dex */
public final class C0499z1 extends AbstractC0496y2 {

    /* renamed from: r */
    public static final c f2221r = new c();

    /* renamed from: s */
    private static final Executor f2222s = C5493a.m20222d();

    /* renamed from: l */
    private d f2223l;

    /* renamed from: m */
    private Executor f2224m;

    /* renamed from: n */
    private AbstractC5073r0 f2225n;

    /* renamed from: o */
    C0492x2 f2226o;

    /* renamed from: p */
    private boolean f2227p;

    /* renamed from: q */
    private Size f2228q;

    /* renamed from: androidx.camera.core.z1$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5032h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5010b1 f2229a;

        a(InterfaceC5010b1 interfaceC5010b1) {
            this.f2229a = interfaceC5010b1;
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            super.mo1399b(interfaceC5068q);
            if (this.f2229a.m19486a(new C5934b(interfaceC5068q))) {
                C0499z1.this.m2318v();
            }
        }
    }

    /* renamed from: androidx.camera.core.z1$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC5063o2.a<C0499z1, C5089w1, b> {

        /* renamed from: a */
        private final C5070q1 f2231a;

        public b() {
            this(C5070q1.m19660L());
        }

        /* renamed from: d */
        static b m2347d(InterfaceC5061o0 interfaceC5061o0) {
            return new b(C5070q1.m19661M(interfaceC5061o0));
        }

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f2231a;
        }

        /* renamed from: c */
        public C0499z1 m2348c() {
            if (mo1926a().mo1365a(InterfaceC5026f1.f19166g, null) != null && mo1926a().mo1365a(InterfaceC5026f1.f19169j, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            return new C0499z1(mo1927b());
        }

        @Override // p279w.InterfaceC5063o2.a
        /* renamed from: e */
        public C5089w1 mo1927b() {
            return new C5089w1(C5083u1.m19702J(this.f2231a));
        }

        /* renamed from: f */
        public b m2350f(int i10) {
            mo1926a().mo19659g(InterfaceC5063o2.f19282r, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public b m2351g(int i10) {
            mo1926a().mo19659g(InterfaceC5026f1.f19166g, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: h */
        public b m2352h(Class<C0499z1> cls) {
            mo1926a().mo19659g(InterfaceC5941i.f21845w, cls);
            if (mo1926a().mo1365a(InterfaceC5941i.f21844v, null) == null) {
                m2353i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: i */
        public b m2353i(String str) {
            mo1926a().mo19659g(InterfaceC5941i.f21844v, str);
            return this;
        }

        private b(C5070q1 c5070q1) {
            this.f2231a = c5070q1;
            Class cls = (Class) c5070q1.mo1365a(InterfaceC5941i.f21845w, null);
            if (cls != null && !cls.equals(C0499z1.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m2352h(C0499z1.class);
        }
    }

    /* renamed from: androidx.camera.core.z1$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private static final C5089w1 f2232a = new b().m2350f(2).m2351g(0).mo1927b();

        /* renamed from: a */
        public C5089w1 m2354a() {
            return f2232a;
        }
    }

    /* renamed from: androidx.camera.core.z1$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo2355a(C0492x2 c0492x2);
    }

    C0499z1(C5089w1 c5089w1) {
        super(c5089w1);
        this.f2224m = f2222s;
        this.f2227p = false;
    }

    /* renamed from: N */
    private Rect m2338N(Size size) {
        if (m2311o() != null) {
            return m2311o();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: O */
    public /* synthetic */ void m2339O(String str, C5089w1 c5089w1, Size size, C5015c2 c5015c2, C5015c2.e eVar) {
        if (m2312p(str)) {
            m2298I(m2344M(str, c5089w1, size).m19514m());
            m2316t();
        }
    }

    /* renamed from: Q */
    private boolean m2341Q() {
        C0492x2 c0492x2 = this.f2226o;
        d dVar = this.f2223l;
        if (dVar == null || c0492x2 == null) {
            return false;
        }
        this.f2224m.execute(new Runnable() { // from class: androidx.camera.core.x1

            /* renamed from: o */
            public final /* synthetic */ C0492x2 f2145o;

            public /* synthetic */ RunnableC0491x1(C0492x2 c0492x22) {
                r2 = c0492x22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0499z1.d.this.mo2355a(r2);
            }
        });
        return true;
    }

    /* renamed from: R */
    private void m2342R() {
        InterfaceC5017d0 m2302d = m2302d();
        d dVar = this.f2223l;
        Rect m2338N = m2338N(this.f2228q);
        C0492x2 c0492x2 = this.f2226o;
        if (m2302d == null || dVar == null || m2338N == null) {
            return;
        }
        c0492x2.m2271x(C0492x2.g.m2277d(m2338N, m2308k(m2302d), m2300b()));
    }

    /* renamed from: U */
    private void m2343U(String str, C5089w1 c5089w1, Size size) {
        m2298I(m2344M(str, c5089w1, size).m19514m());
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: A */
    public void mo1916A() {
        AbstractC5073r0 abstractC5073r0 = this.f2225n;
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
        }
        this.f2226o = null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: B */
    protected InterfaceC5063o2<?> mo1970B(InterfaceC5009b0 interfaceC5009b0, InterfaceC5063o2.a<?, ?, ?> aVar) {
        if (aVar.mo1926a().mo1365a(C5089w1.f19344B, null) != null) {
            aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 35);
        } else {
            aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 34);
        }
        return aVar.mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: E */
    protected Size mo1918E(Size size) {
        this.f2228q = size;
        m2343U(m2304f(), (C5089w1) m2305g(), this.f2228q);
        return size;
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: H */
    public void mo2142H(Rect rect) {
        super.mo2142H(rect);
        m2342R();
    }

    /* renamed from: M */
    C5015c2.b m2344M(String str, C5089w1 c5089w1, Size size) {
        C0432l.m2119a();
        C5015c2.b m19501o = C5015c2.b.m19501o(c5089w1);
        InterfaceC5049l0 m19718H = c5089w1.m19718H(null);
        AbstractC5073r0 abstractC5073r0 = this.f2225n;
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
        }
        C0492x2 c0492x2 = new C0492x2(size, m2302d(), c5089w1.m19720J(false));
        this.f2226o = c0492x2;
        if (m2341Q()) {
            m2342R();
        } else {
            this.f2227p = true;
        }
        if (m19718H != null) {
            InterfaceC5053m0.a aVar = new InterfaceC5053m0.a();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            C0420i2 c0420i2 = new C0420i2(size.getWidth(), size.getHeight(), c5089w1.mo1374q(), new Handler(handlerThread.getLooper()), aVar, m19718H, c0492x2.m2266k(), num);
            m19501o.m19505d(c0420i2.m2043r());
            c0420i2.m19682i().mo2501b(new Runnable() { // from class: androidx.camera.core.w1

                /* renamed from: n */
                public final /* synthetic */ HandlerThread f2135n;

                public /* synthetic */ RunnableC0487w1(HandlerThread handlerThread2) {
                    r1 = handlerThread2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    r1.quitSafely();
                }
            }, C5493a.m20219a());
            this.f2225n = c0420i2;
            m19501o.m19513l(num, Integer.valueOf(aVar.mo19607b()));
        } else {
            InterfaceC5010b1 m19719I = c5089w1.m19719I(null);
            if (m19719I != null) {
                m19501o.m19505d(new a(m19719I));
            }
            this.f2225n = c0492x2.m2266k();
        }
        m19501o.m19512k(this.f2225n);
        m19501o.m19507f(new C5015c2.c() { // from class: androidx.camera.core.y1

            /* renamed from: b */
            public final /* synthetic */ String f2193b;

            /* renamed from: c */
            public final /* synthetic */ C5089w1 f2194c;

            /* renamed from: d */
            public final /* synthetic */ Size f2195d;

            public /* synthetic */ C0495y1(String str2, C5089w1 c5089w12, Size size2) {
                r2 = str2;
                r3 = c5089w12;
                r4 = size2;
            }

            @Override // p279w.C5015c2.c
            /* renamed from: a */
            public final void mo1878a(C5015c2 c5015c2, C5015c2.e eVar) {
                C0499z1.this.m2339O(r2, r3, r4, c5015c2, eVar);
            }
        });
        return m19501o;
    }

    /* renamed from: S */
    public void m2345S(d dVar) {
        m2346T(f2222s, dVar);
    }

    /* renamed from: T */
    public void m2346T(Executor executor, d dVar) {
        C0432l.m2119a();
        if (dVar == null) {
            this.f2223l = null;
            m2315s();
            return;
        }
        this.f2223l = dVar;
        this.f2224m = executor;
        m2314r();
        if (this.f2227p) {
            if (m2341Q()) {
                m2342R();
                this.f2227p = false;
                return;
            }
            return;
        }
        if (m2301c() != null) {
            m2343U(m2304f(), (C5089w1) m2305g(), m2301c());
            m2316t();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: h */
    public InterfaceC5063o2<?> mo1921h(boolean z10, InterfaceC5067p2 interfaceC5067p2) {
        InterfaceC5061o0 mo1381a = interfaceC5067p2.mo1381a(InterfaceC5067p2.b.PREVIEW, 1);
        if (z10) {
            mo1381a = C5057n0.m19631b(mo1381a, f2221r.m2354a());
        }
        if (mo1381a == null) {
            return null;
        }
        return mo1922n(mo1381a).mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: n */
    public InterfaceC5063o2.a<?, ?, ?> mo1922n(InterfaceC5061o0 interfaceC5061o0) {
        return b.m2347d(interfaceC5061o0);
    }

    public String toString() {
        return "Preview:" + m2307j();
    }
}
