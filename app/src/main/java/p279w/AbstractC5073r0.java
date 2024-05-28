package p279w;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.atomic.AtomicInteger;
import p292x.C5493a;
import p305y.C5586f;

/* renamed from: w.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC5073r0 {

    /* renamed from: i */
    public static final Size f19303i = new Size(0, 0);

    /* renamed from: j */
    private static final boolean f19304j = C0463q1.m2207f("DeferrableSurface");

    /* renamed from: k */
    private static final AtomicInteger f19305k = new AtomicInteger(0);

    /* renamed from: l */
    private static final AtomicInteger f19306l = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f19307a;

    /* renamed from: b */
    private int f19308b;

    /* renamed from: c */
    private boolean f19309c;

    /* renamed from: d */
    private C0541c.a<Void> f19310d;

    /* renamed from: e */
    private final InterfaceFutureC2565m<Void> f19311e;

    /* renamed from: f */
    private final Size f19312f;

    /* renamed from: g */
    private final int f19313g;

    /* renamed from: h */
    Class<?> f19314h;

    /* renamed from: w.r0$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: n */
        AbstractC5073r0 f19315n;

        public a(String str, AbstractC5073r0 abstractC5073r0) {
            super(str);
            this.f19315n = abstractC5073r0;
        }

        /* renamed from: a */
        public AbstractC5073r0 m19685a() {
            return this.f19315n;
        }
    }

    /* renamed from: w.r0$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC5073r0() {
        this(f19303i, 0);
    }

    /* renamed from: k */
    public /* synthetic */ Object m19673k(C0541c.a aVar) throws Exception {
        synchronized (this.f19307a) {
            this.f19310d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* renamed from: l */
    public /* synthetic */ void m19674l(String str) {
        try {
            this.f19311e.get();
            m19675m("Surface terminated", f19306l.decrementAndGet(), f19305k.get());
        } catch (Exception e10) {
            C0463q1.m2204c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f19307a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f19309c), Integer.valueOf(this.f19308b)), e10);
            }
        }
    }

    /* renamed from: m */
    private void m19675m(String str, int i10, int i11) {
        if (!f19304j && C0463q1.m2207f("DeferrableSurface")) {
            C0463q1.m2202a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C0463q1.m2202a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    /* renamed from: c */
    public final void m19676c() {
        C0541c.a<Void> aVar;
        synchronized (this.f19307a) {
            if (this.f19309c) {
                aVar = null;
            } else {
                this.f19309c = true;
                if (this.f19308b == 0) {
                    aVar = this.f19310d;
                    this.f19310d = null;
                } else {
                    aVar = null;
                }
                if (C0463q1.m2207f("DeferrableSurface")) {
                    C0463q1.m2202a("DeferrableSurface", "surface closed,  useCount=" + this.f19308b + " closed=true " + this);
                }
            }
        }
        if (aVar != null) {
            aVar.m2519c(null);
        }
    }

    /* renamed from: d */
    public void m19677d() {
        C0541c.a<Void> aVar;
        synchronized (this.f19307a) {
            int i10 = this.f19308b;
            if (i10 != 0) {
                int i11 = i10 - 1;
                this.f19308b = i11;
                if (i11 == 0 && this.f19309c) {
                    aVar = this.f19310d;
                    this.f19310d = null;
                } else {
                    aVar = null;
                }
                if (C0463q1.m2207f("DeferrableSurface")) {
                    C0463q1.m2202a("DeferrableSurface", "use count-1,  useCount=" + this.f19308b + " closed=" + this.f19309c + " " + this);
                    if (this.f19308b == 0) {
                        m19675m("Surface no longer in use", f19306l.get(), f19305k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.m2519c(null);
        }
    }

    /* renamed from: e */
    public Class<?> m19678e() {
        return this.f19314h;
    }

    /* renamed from: f */
    public Size m19679f() {
        return this.f19312f;
    }

    /* renamed from: g */
    public int m19680g() {
        return this.f19313g;
    }

    /* renamed from: h */
    public final InterfaceFutureC2565m<Surface> m19681h() {
        synchronized (this.f19307a) {
            if (this.f19309c) {
                return C5586f.m20506f(new a("DeferrableSurface already closed.", this));
            }
            return mo2042n();
        }
    }

    /* renamed from: i */
    public InterfaceFutureC2565m<Void> m19682i() {
        return C5586f.m20510j(this.f19311e);
    }

    /* renamed from: j */
    public void m19683j() throws a {
        synchronized (this.f19307a) {
            int i10 = this.f19308b;
            if (i10 == 0 && this.f19309c) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f19308b = i10 + 1;
            if (C0463q1.m2207f("DeferrableSurface")) {
                if (this.f19308b == 1) {
                    m19675m("New surface in use", f19306l.get(), f19305k.incrementAndGet());
                }
                C0463q1.m2202a("DeferrableSurface", "use count+1, useCount=" + this.f19308b + " " + this);
            }
        }
    }

    /* renamed from: n */
    protected abstract InterfaceFutureC2565m<Surface> mo2042n();

    /* renamed from: o */
    public void m19684o(Class<?> cls) {
        this.f19314h = cls;
    }

    public AbstractC5073r0(Size size, int i10) {
        this.f19307a = new Object();
        this.f19308b = 0;
        this.f19309c = false;
        this.f19312f = size;
        this.f19313g = i10;
        InterfaceFutureC2565m<Void> m2515a = C0541c.m2515a(new C0541c.c() { // from class: w.p0
            public /* synthetic */ C5065p0() {
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m19673k;
                m19673k = AbstractC5073r0.this.m19673k(aVar);
                return m19673k;
            }
        });
        this.f19311e = m2515a;
        if (C0463q1.m2207f("DeferrableSurface")) {
            m19675m("Surface created", f19306l.incrementAndGet(), f19305k.get());
            m2515a.mo2501b(new Runnable() { // from class: w.q0

                /* renamed from: o */
                public final /* synthetic */ String f19293o;

                public /* synthetic */ RunnableC5069q0(String str) {
                    r2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC5073r0.this.m19674l(r2);
                }
            }, C5493a.m20219a());
        }
    }
}
