package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0397d2;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p169n.InterfaceC4005a;
import p279w.AbstractC5032h;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5041j0;
import p279w.InterfaceC5049l0;
import p279w.InterfaceC5053m0;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.d2 */
/* loaded from: classes.dex */
public class C0397d2 implements InterfaceC5034h1 {

    /* renamed from: g */
    final InterfaceC5034h1 f1750g;

    /* renamed from: h */
    final InterfaceC5034h1 f1751h;

    /* renamed from: i */
    InterfaceC5034h1.a f1752i;

    /* renamed from: j */
    Executor f1753j;

    /* renamed from: k */
    C0541c.a<Void> f1754k;

    /* renamed from: l */
    private InterfaceFutureC2565m<Void> f1755l;

    /* renamed from: m */
    final Executor f1756m;

    /* renamed from: n */
    final InterfaceC5049l0 f1757n;

    /* renamed from: o */
    private final InterfaceFutureC2565m<Void> f1758o;

    /* renamed from: t */
    f f1763t;

    /* renamed from: u */
    Executor f1764u;

    /* renamed from: a */
    final Object f1744a = new Object();

    /* renamed from: b */
    private InterfaceC5034h1.a f1745b = new a();

    /* renamed from: c */
    private InterfaceC5034h1.a f1746c = new b();

    /* renamed from: d */
    private InterfaceC5583c<List<InterfaceC0443l1>> f1747d = new c();

    /* renamed from: e */
    boolean f1748e = false;

    /* renamed from: f */
    boolean f1749f = false;

    /* renamed from: p */
    private String f1759p = new String();

    /* renamed from: q */
    C0452n2 f1760q = new C0452n2(Collections.emptyList(), this.f1759p);

    /* renamed from: r */
    private final List<Integer> f1761r = new ArrayList();

    /* renamed from: s */
    private InterfaceFutureC2565m<List<InterfaceC0443l1>> f1762s = C5586f.m20508h(new ArrayList());

    /* renamed from: androidx.camera.core.d2$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5034h1.a {
        a() {
        }

        @Override // p279w.InterfaceC5034h1.a
        /* renamed from: a */
        public void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
            C0397d2.this.m1890q(interfaceC5034h1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d2$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC5034h1.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m1895c(InterfaceC5034h1.a aVar) {
            aVar.mo1382a(C0397d2.this);
        }

        @Override // p279w.InterfaceC5034h1.a
        /* renamed from: a */
        public void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
            final InterfaceC5034h1.a aVar;
            Executor executor;
            synchronized (C0397d2.this.f1744a) {
                C0397d2 c0397d2 = C0397d2.this;
                aVar = c0397d2.f1752i;
                executor = c0397d2.f1753j;
                c0397d2.f1760q.m2168e();
                C0397d2.this.m1893w();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.e2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0397d2.b.this.m1895c(aVar);
                        }
                    });
                } else {
                    aVar.mo1382a(C0397d2.this);
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.d2$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC5583c<List<InterfaceC0443l1>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ void m1897c(f fVar, Exception exc) {
            fVar.mo1902a(exc.getMessage(), exc.getCause());
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<InterfaceC0443l1> list) {
            C0397d2 c0397d2;
            synchronized (C0397d2.this.f1744a) {
                C0397d2 c0397d22 = C0397d2.this;
                if (c0397d22.f1748e) {
                    return;
                }
                c0397d22.f1749f = true;
                C0452n2 c0452n2 = c0397d22.f1760q;
                final f fVar = c0397d22.f1763t;
                Executor executor = c0397d22.f1764u;
                try {
                    c0397d22.f1757n.mo2023a(c0452n2);
                } catch (Exception e10) {
                    synchronized (C0397d2.this.f1744a) {
                        C0397d2.this.f1760q.m2168e();
                        if (fVar != null && executor != null) {
                            executor.execute(new Runnable() { // from class: androidx.camera.core.f2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0397d2.c.m1897c(C0397d2.f.this, e10);
                                }
                            });
                        }
                    }
                }
                synchronized (C0397d2.this.f1744a) {
                    c0397d2 = C0397d2.this;
                    c0397d2.f1749f = false;
                }
                c0397d2.m1886m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d2$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC5032h {
        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d2$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo1902a(String str, Throwable th);
    }

    C0397d2(e eVar) {
        if (eVar.f1769a.mo1876h() >= eVar.f1770b.mo1864a().size()) {
            InterfaceC5034h1 interfaceC5034h1 = eVar.f1769a;
            this.f1750g = interfaceC5034h1;
            int mo1875g = interfaceC5034h1.mo1875g();
            int height = interfaceC5034h1.getHeight();
            int i10 = eVar.f1772d;
            if (i10 == 256) {
                mo1875g = ((int) (mo1875g * height * 1.5f)) + BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
                height = 1;
            }
            C0394d c0394d = new C0394d(ImageReader.newInstance(mo1875g, height, i10, interfaceC5034h1.mo1876h()));
            this.f1751h = c0394d;
            this.f1756m = eVar.f1773e;
            InterfaceC5049l0 interfaceC5049l0 = eVar.f1771c;
            this.f1757n = interfaceC5049l0;
            interfaceC5049l0.mo2025c(c0394d.mo1870a(), eVar.f1772d);
            interfaceC5049l0.mo2024b(new Size(interfaceC5034h1.mo1875g(), interfaceC5034h1.getHeight()));
            this.f1758o = interfaceC5049l0.mo2026d();
            m1891u(eVar.f1770b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    /* renamed from: l */
    private void m1882l() {
        synchronized (this.f1744a) {
            if (!this.f1762s.isDone()) {
                this.f1762s.cancel(true);
            }
            this.f1760q.m2168e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m1883r(C0541c.a aVar) {
        m1882l();
        if (aVar != null) {
            aVar.m2519c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ Void m1884s(Void r02) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Object m1885t(C0541c.a aVar) throws Exception {
        synchronized (this.f1744a) {
            this.f1754k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: a */
    public Surface mo1870a() {
        Surface mo1870a;
        synchronized (this.f1744a) {
            mo1870a = this.f1750g.mo1870a();
        }
        return mo1870a;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: c */
    public InterfaceC0443l1 mo1871c() {
        InterfaceC0443l1 mo1871c;
        synchronized (this.f1744a) {
            mo1871c = this.f1751h.mo1871c();
        }
        return mo1871c;
    }

    @Override // p279w.InterfaceC5034h1
    public void close() {
        synchronized (this.f1744a) {
            if (this.f1748e) {
                return;
            }
            this.f1750g.mo1874f();
            this.f1751h.mo1874f();
            this.f1748e = true;
            this.f1757n.close();
            m1886m();
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: d */
    public int mo1872d() {
        int mo1872d;
        synchronized (this.f1744a) {
            mo1872d = this.f1751h.mo1872d();
        }
        return mo1872d;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: e */
    public void mo1873e(InterfaceC5034h1.a aVar, Executor executor) {
        synchronized (this.f1744a) {
            this.f1752i = (InterfaceC5034h1.a) C0654h.m3467f(aVar);
            this.f1753j = (Executor) C0654h.m3467f(executor);
            this.f1750g.mo1873e(this.f1745b, executor);
            this.f1751h.mo1873e(this.f1746c, executor);
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: f */
    public void mo1874f() {
        synchronized (this.f1744a) {
            this.f1752i = null;
            this.f1753j = null;
            this.f1750g.mo1874f();
            this.f1751h.mo1874f();
            if (!this.f1749f) {
                this.f1760q.m2167d();
            }
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: g */
    public int mo1875g() {
        int mo1875g;
        synchronized (this.f1744a) {
            mo1875g = this.f1750g.mo1875g();
        }
        return mo1875g;
    }

    @Override // p279w.InterfaceC5034h1
    public int getHeight() {
        int height;
        synchronized (this.f1744a) {
            height = this.f1750g.getHeight();
        }
        return height;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: h */
    public int mo1876h() {
        int mo1876h;
        synchronized (this.f1744a) {
            mo1876h = this.f1750g.mo1876h();
        }
        return mo1876h;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: i */
    public InterfaceC0443l1 mo1877i() {
        InterfaceC0443l1 mo1877i;
        synchronized (this.f1744a) {
            mo1877i = this.f1751h.mo1877i();
        }
        return mo1877i;
    }

    /* renamed from: m */
    void m1886m() {
        boolean z10;
        boolean z11;
        final C0541c.a<Void> aVar;
        synchronized (this.f1744a) {
            z10 = this.f1748e;
            z11 = this.f1749f;
            aVar = this.f1754k;
            if (z10 && !z11) {
                this.f1750g.close();
                this.f1760q.m2167d();
                this.f1751h.close();
            }
        }
        if (!z10 || z11) {
            return;
        }
        this.f1758o.mo2501b(new Runnable() { // from class: androidx.camera.core.b2
            @Override // java.lang.Runnable
            public final void run() {
                C0397d2.this.m1883r(aVar);
            }
        }, C5493a.m20219a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public AbstractC5032h m1887n() {
        synchronized (this.f1744a) {
            InterfaceC5034h1 interfaceC5034h1 = this.f1750g;
            if (interfaceC5034h1 instanceof C0475t1) {
                return ((C0475t1) interfaceC5034h1).m2243o();
            }
            return new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public InterfaceFutureC2565m<Void> m1888o() {
        InterfaceFutureC2565m<Void> m20510j;
        synchronized (this.f1744a) {
            if (this.f1748e && !this.f1749f) {
                m20510j = C5586f.m20515o(this.f1758o, new InterfaceC4005a() { // from class: androidx.camera.core.c2
                    @Override // p169n.InterfaceC4005a
                    /* renamed from: a */
                    public final Object mo1403a(Object obj) {
                        Void m1884s;
                        m1884s = C0397d2.m1884s((Void) obj);
                        return m1884s;
                    }
                }, C5493a.m20219a());
            } else {
                if (this.f1755l == null) {
                    this.f1755l = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.core.a2
                        @Override // androidx.concurrent.futures.C0541c.c
                        /* renamed from: a */
                        public final Object mo1498a(C0541c.a aVar) {
                            Object m1885t;
                            m1885t = C0397d2.this.m1885t(aVar);
                            return m1885t;
                        }
                    });
                }
                m20510j = C5586f.m20510j(this.f1755l);
            }
        }
        return m20510j;
    }

    /* renamed from: p */
    public String m1889p() {
        return this.f1759p;
    }

    /* renamed from: q */
    void m1890q(InterfaceC5034h1 interfaceC5034h1) {
        synchronized (this.f1744a) {
            if (this.f1748e) {
                return;
            }
            try {
                InterfaceC0443l1 mo1877i = interfaceC5034h1.mo1877i();
                if (mo1877i != null) {
                    Integer num = (Integer) mo1877i.mo1857q().mo2028a().m19578c(this.f1759p);
                    if (!this.f1761r.contains(num)) {
                        C0463q1.m2212k("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                        mo1877i.close();
                    } else {
                        this.f1760q.m2166c(mo1877i);
                    }
                }
            } catch (IllegalStateException e10) {
                C0463q1.m2205d("ProcessingImageReader", "Failed to acquire latest image.", e10);
            }
        }
    }

    /* renamed from: u */
    public void m1891u(InterfaceC5041j0 interfaceC5041j0) {
        synchronized (this.f1744a) {
            if (this.f1748e) {
                return;
            }
            m1882l();
            if (interfaceC5041j0.mo1864a() != null) {
                if (this.f1750g.mo1876h() >= interfaceC5041j0.mo1864a().size()) {
                    this.f1761r.clear();
                    for (InterfaceC5053m0 interfaceC5053m0 : interfaceC5041j0.mo1864a()) {
                        if (interfaceC5053m0 != null) {
                            this.f1761r.add(Integer.valueOf(interfaceC5053m0.mo19607b()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(interfaceC5041j0.hashCode());
            this.f1759p = num;
            this.f1760q = new C0452n2(this.f1761r, num);
            m1893w();
        }
    }

    /* renamed from: v */
    public void m1892v(Executor executor, f fVar) {
        synchronized (this.f1744a) {
            this.f1764u = executor;
            this.f1763t = fVar;
        }
    }

    /* renamed from: w */
    void m1893w() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.f1761r.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f1760q.mo2164a(it.next().intValue()));
        }
        this.f1762s = C5586f.m20503c(arrayList);
        C5586f.m20502b(C5586f.m20503c(arrayList), this.f1747d, this.f1756m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.d2$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        protected final InterfaceC5034h1 f1769a;

        /* renamed from: b */
        protected final InterfaceC5041j0 f1770b;

        /* renamed from: c */
        protected final InterfaceC5049l0 f1771c;

        /* renamed from: d */
        protected int f1772d;

        /* renamed from: e */
        protected Executor f1773e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(InterfaceC5034h1 interfaceC5034h1, InterfaceC5041j0 interfaceC5041j0, InterfaceC5049l0 interfaceC5049l0) {
            this.f1773e = Executors.newSingleThreadExecutor();
            this.f1769a = interfaceC5034h1;
            this.f1770b = interfaceC5041j0;
            this.f1771c = interfaceC5049l0;
            this.f1772d = interfaceC5034h1.mo1872d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C0397d2 m1899a() {
            return new C0397d2(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public e m1900b(int i10) {
            this.f1772d = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public e m1901c(Executor executor) {
            this.f1773e = executor;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i10, int i11, int i12, int i13, InterfaceC5041j0 interfaceC5041j0, InterfaceC5049l0 interfaceC5049l0) {
            this(new C0475t1(i10, i11, i12, i13), interfaceC5041j0, interfaceC5049l0);
        }
    }
}
