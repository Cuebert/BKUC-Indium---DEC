package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.AbstractC0418i0;
import androidx.camera.core.C0397d2;
import androidx.camera.core.C0401e1;
import androidx.camera.core.impl.utils.C0425e;
import androidx.camera.core.impl.utils.C0432l;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p014b0.InterfaceC0964e;
import p026c0.C1116a;
import p040d0.C2958a;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.C5006a1;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.C5057n0;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5018d1;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5041j0;
import p279w.InterfaceC5049l0;
import p279w.InterfaceC5053m0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5066p1;
import p279w.InterfaceC5067p2;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;
import p318z.C5948p;
import p318z.InterfaceC5939g;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.e1 */
/* loaded from: classes.dex */
public final class C0401e1 extends AbstractC0496y2 {

    /* renamed from: I */
    public static final g f1812I = new g();

    /* renamed from: J */
    static final C1116a f1813J = new C1116a();

    /* renamed from: A */
    C0444l2 f1814A;

    /* renamed from: B */
    C0397d2 f1815B;

    /* renamed from: C */
    private InterfaceFutureC2565m<Void> f1816C;

    /* renamed from: D */
    private AbstractC5032h f1817D;

    /* renamed from: E */
    private AbstractC5073r0 f1818E;

    /* renamed from: F */
    private i f1819F;

    /* renamed from: G */
    final Executor f1820G;

    /* renamed from: H */
    private Matrix f1821H;

    /* renamed from: l */
    private final InterfaceC5034h1.a f1822l;

    /* renamed from: m */
    final Executor f1823m;

    /* renamed from: n */
    private final int f1824n;

    /* renamed from: o */
    private final AtomicReference<Integer> f1825o;

    /* renamed from: p */
    private final int f1826p;

    /* renamed from: q */
    private int f1827q;

    /* renamed from: r */
    private Rational f1828r;

    /* renamed from: s */
    private ExecutorService f1829s;

    /* renamed from: t */
    private C5045k0 f1830t;

    /* renamed from: u */
    private InterfaceC5041j0 f1831u;

    /* renamed from: v */
    private int f1832v;

    /* renamed from: w */
    private InterfaceC5049l0 f1833w;

    /* renamed from: x */
    private boolean f1834x;

    /* renamed from: y */
    private boolean f1835y;

    /* renamed from: z */
    C5015c2.b f1836z;

    /* renamed from: androidx.camera.core.e1$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5032h {
        a() {
        }
    }

    /* renamed from: androidx.camera.core.e1$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC5032h {
        b() {
        }
    }

    /* renamed from: androidx.camera.core.e1$c */
    /* loaded from: classes.dex */
    public class c implements i.c {

        /* renamed from: a */
        final /* synthetic */ C5948p f1839a;

        c(C5948p c5948p) {
            this.f1839a = c5948p;
        }

        @Override // androidx.camera.core.C0401e1.i.c
        /* renamed from: a */
        public void mo1980a(h hVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f1839a.m21146h(hVar.f1848b);
                this.f1839a.m21147i(hVar.f1847a);
            }
        }
    }

    /* renamed from: androidx.camera.core.e1$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f1841a;

        d(C0541c.a aVar) {
            this.f1841a = aVar;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0401e1.this.m1978s0();
            this.f1841a.m2521f(th);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r12) {
            C0401e1.this.m1978s0();
        }
    }

    /* renamed from: androidx.camera.core.e1$e */
    /* loaded from: classes.dex */
    class e implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f1843a = new AtomicInteger(0);

        e() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f1843a.getAndIncrement());
        }
    }

    /* renamed from: androidx.camera.core.e1$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC5063o2.a<C0401e1, C5006a1, f> {

        /* renamed from: a */
        private final C5070q1 f1845a;

        public f() {
            this(C5070q1.m19660L());
        }

        /* renamed from: d */
        public static f m1982d(InterfaceC5061o0 interfaceC5061o0) {
            return new f(C5070q1.m19661M(interfaceC5061o0));
        }

        @Override // androidx.camera.core.InterfaceC0414h0
        /* renamed from: a */
        public InterfaceC5066p1 mo1926a() {
            return this.f1845a;
        }

        /* renamed from: c */
        public C0401e1 m1983c() {
            int intValue;
            if (mo1926a().mo1365a(InterfaceC5026f1.f19166g, null) != null && mo1926a().mo1365a(InterfaceC5026f1.f19169j, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            Integer num = (Integer) mo1926a().mo1365a(C5006a1.f19110E, null);
            if (num != null) {
                C0654h.m3463b(mo1926a().mo1365a(C5006a1.f19109D, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                mo1926a().mo19659g(InterfaceC5018d1.f19155f, num);
            } else if (mo1926a().mo1365a(C5006a1.f19109D, null) != null) {
                mo1926a().mo19659g(InterfaceC5018d1.f19155f, 35);
            } else {
                mo1926a().mo19659g(InterfaceC5018d1.f19155f, 256);
            }
            C0401e1 c0401e1 = new C0401e1(mo1927b());
            Size size = (Size) mo1926a().mo1365a(InterfaceC5026f1.f19169j, null);
            if (size != null) {
                c0401e1.m1977p0(new Rational(size.getWidth(), size.getHeight()));
            }
            C0654h.m3463b(((Integer) mo1926a().mo1365a(C5006a1.f19111F, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
            C0654h.m3468g((Executor) mo1926a().mo1365a(InterfaceC5939g.f21843u, C5493a.m20221c()), "The IO executor can't be null");
            InterfaceC5066p1 mo1926a = mo1926a();
            InterfaceC5061o0.a<Integer> aVar = C5006a1.f19107B;
            if (!mo1926a.mo1369e(aVar) || (intValue = ((Integer) mo1926a().mo1366b(aVar)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                return c0401e1;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
        }

        @Override // p279w.InterfaceC5063o2.a
        /* renamed from: e */
        public C5006a1 mo1927b() {
            return new C5006a1(C5083u1.m19702J(this.f1845a));
        }

        /* renamed from: f */
        public f m1985f(int i10) {
            mo1926a().mo19659g(InterfaceC5063o2.f19282r, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public f m1986g(int i10) {
            mo1926a().mo19659g(InterfaceC5026f1.f19166g, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: h */
        public f m1987h(Class<C0401e1> cls) {
            mo1926a().mo19659g(InterfaceC5941i.f21845w, cls);
            if (mo1926a().mo1365a(InterfaceC5941i.f21844v, null) == null) {
                m1988i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: i */
        public f m1988i(String str) {
            mo1926a().mo19659g(InterfaceC5941i.f21844v, str);
            return this;
        }

        private f(C5070q1 c5070q1) {
            this.f1845a = c5070q1;
            Class cls = (Class) c5070q1.mo1365a(InterfaceC5941i.f21845w, null);
            if (cls != null && !cls.equals(C0401e1.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m1987h(C0401e1.class);
        }
    }

    /* renamed from: androidx.camera.core.e1$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        private static final C5006a1 f1846a = new f().m1985f(4).m1986g(0).mo1927b();

        /* renamed from: a */
        public C5006a1 m1989a() {
            return f1846a;
        }
    }

    /* renamed from: androidx.camera.core.e1$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        final int f1847a;

        /* renamed from: b */
        final int f1848b;

        /* renamed from: c */
        private final Rational f1849c;

        /* renamed from: d */
        private final Executor f1850d;

        /* renamed from: e */
        AtomicBoolean f1851e;

        /* renamed from: f */
        private final Rect f1852f;

        /* renamed from: g */
        private final Matrix f1853g;

        /* renamed from: d */
        public /* synthetic */ void m1992d(InterfaceC0443l1 interfaceC0443l1) {
            throw null;
        }

        /* renamed from: e */
        public /* synthetic */ void m1993e(int i10, String str, Throwable th) {
            new C0415h1(i10, str, th);
            throw null;
        }

        /* renamed from: c */
        void m1994c(InterfaceC0443l1 interfaceC0443l1) {
            Size size;
            int m2071j;
            if (!this.f1851e.compareAndSet(false, true)) {
                interfaceC0443l1.close();
                return;
            }
            if (C0401e1.f1813J.m6504b(interfaceC0443l1)) {
                try {
                    ByteBuffer mo1860d = interfaceC0443l1.mo1855k()[0].mo1860d();
                    mo1860d.rewind();
                    byte[] bArr = new byte[mo1860d.capacity()];
                    mo1860d.get(bArr);
                    C0425e m2063d = C0425e.m2063d(new ByteArrayInputStream(bArr));
                    mo1860d.rewind();
                    size = new Size(m2063d.m2073l(), m2063d.m2068g());
                    m2071j = m2063d.m2071j();
                } catch (IOException e10) {
                    m1995f(1, "Unable to parse JPEG exif", e10);
                    interfaceC0443l1.close();
                    return;
                }
            } else {
                size = new Size(interfaceC0443l1.mo1853g(), interfaceC0443l1.getHeight());
                m2071j = this.f1847a;
            }
            C0448m2 c0448m2 = new C0448m2(interfaceC0443l1, size, AbstractC0455o1.m2173f(interfaceC0443l1.mo1857q().mo2028a(), interfaceC0443l1.mo1857q().mo2029c(), m2071j, this.f1853g));
            c0448m2.mo1856o(C0401e1.m1952V(this.f1852f, this.f1849c, this.f1847a, size, m2071j));
            try {
                this.f1850d.execute(new Runnable() { // from class: androidx.camera.core.g1

                    /* renamed from: o */
                    public final /* synthetic */ InterfaceC0443l1 f1898o;

                    public /* synthetic */ RunnableC0411g1(InterfaceC0443l1 c0448m22) {
                        r2 = c0448m22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0401e1.h.this.m1992d(r2);
                    }
                });
            } catch (RejectedExecutionException unused) {
                C0463q1.m2204c("ImageCapture", "Unable to post to the supplied executor.");
                interfaceC0443l1.close();
            }
        }

        /* renamed from: f */
        void m1995f(int i10, String str, Throwable th) {
            if (this.f1851e.compareAndSet(false, true)) {
                try {
                    this.f1850d.execute(new Runnable() { // from class: androidx.camera.core.f1

                        /* renamed from: o */
                        public final /* synthetic */ int f1878o;

                        /* renamed from: p */
                        public final /* synthetic */ String f1879p;

                        /* renamed from: q */
                        public final /* synthetic */ Throwable f1880q;

                        public /* synthetic */ RunnableC0406f1(int i102, String str2, Throwable th2) {
                            r2 = i102;
                            r3 = str2;
                            r4 = th2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C0401e1.h.this.m1993e(r2, r3, r4);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    C0463q1.m2204c("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.e1$i */
    /* loaded from: classes.dex */
    public static class i implements AbstractC0418i0.a {

        /* renamed from: e */
        private final b f1858e;

        /* renamed from: f */
        private final int f1859f;

        /* renamed from: g */
        private final c f1860g;

        /* renamed from: a */
        private final Deque<h> f1854a = new ArrayDeque();

        /* renamed from: b */
        h f1855b = null;

        /* renamed from: c */
        InterfaceFutureC2565m<InterfaceC0443l1> f1856c = null;

        /* renamed from: d */
        int f1857d = 0;

        /* renamed from: h */
        final Object f1861h = new Object();

        /* renamed from: androidx.camera.core.e1$i$a */
        /* loaded from: classes.dex */
        public class a implements InterfaceC5583c<InterfaceC0443l1> {

            /* renamed from: a */
            final /* synthetic */ h f1862a;

            a(h hVar) {
                this.f1862a = hVar;
            }

            @Override // p305y.InterfaceC5583c
            /* renamed from: a */
            public void mo1361a(Throwable th) {
                synchronized (i.this.f1861h) {
                    if (!(th instanceof CancellationException)) {
                        this.f1862a.m1995f(C0401e1.m1955a0(th), th != null ? th.getMessage() : "Unknown error", th);
                    }
                    i iVar = i.this;
                    iVar.f1855b = null;
                    iVar.f1856c = null;
                    iVar.m1998c();
                }
            }

            @Override // p305y.InterfaceC5583c
            /* renamed from: b */
            public void onSuccess(InterfaceC0443l1 interfaceC0443l1) {
                synchronized (i.this.f1861h) {
                    C0654h.m3467f(interfaceC0443l1);
                    C0456o2 c0456o2 = new C0456o2(interfaceC0443l1);
                    c0456o2.m2035b(i.this);
                    i.this.f1857d++;
                    this.f1862a.m1994c(c0456o2);
                    i iVar = i.this;
                    iVar.f1855b = null;
                    iVar.f1856c = null;
                    iVar.m1998c();
                }
            }
        }

        /* renamed from: androidx.camera.core.e1$i$b */
        /* loaded from: classes.dex */
        public interface b {
            /* renamed from: a */
            InterfaceFutureC2565m<InterfaceC0443l1> mo2000a(h hVar);
        }

        /* renamed from: androidx.camera.core.e1$i$c */
        /* loaded from: classes.dex */
        public interface c {
            /* renamed from: a */
            void mo1980a(h hVar);
        }

        i(int i10, b bVar, c cVar) {
            this.f1859f = i10;
            this.f1858e = bVar;
            this.f1860g = cVar;
        }

        /* renamed from: a */
        public void m1996a(Throwable th) {
            h hVar;
            InterfaceFutureC2565m<InterfaceC0443l1> interfaceFutureC2565m;
            ArrayList arrayList;
            synchronized (this.f1861h) {
                hVar = this.f1855b;
                this.f1855b = null;
                interfaceFutureC2565m = this.f1856c;
                this.f1856c = null;
                arrayList = new ArrayList(this.f1854a);
                this.f1854a.clear();
            }
            if (hVar != null && interfaceFutureC2565m != null) {
                hVar.m1995f(C0401e1.m1955a0(th), th.getMessage(), th);
                interfaceFutureC2565m.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((h) it.next()).m1995f(C0401e1.m1955a0(th), th.getMessage(), th);
            }
        }

        @Override // androidx.camera.core.AbstractC0418i0.a
        /* renamed from: b */
        public void mo1997b(InterfaceC0443l1 interfaceC0443l1) {
            synchronized (this.f1861h) {
                this.f1857d--;
                m1998c();
            }
        }

        /* renamed from: c */
        void m1998c() {
            synchronized (this.f1861h) {
                if (this.f1855b != null) {
                    return;
                }
                if (this.f1857d >= this.f1859f) {
                    C0463q1.m2212k("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                h poll = this.f1854a.poll();
                if (poll == null) {
                    return;
                }
                this.f1855b = poll;
                c cVar = this.f1860g;
                if (cVar != null) {
                    cVar.mo1980a(poll);
                }
                InterfaceFutureC2565m<InterfaceC0443l1> mo2000a = this.f1858e.mo2000a(poll);
                this.f1856c = mo2000a;
                C5586f.m20502b(mo2000a, new a(poll), C5493a.m20219a());
            }
        }
    }

    C0401e1(C5006a1 c5006a1) {
        super(c5006a1);
        this.f1822l = C0391c1.f1733a;
        this.f1825o = new AtomicReference<>(null);
        this.f1827q = -1;
        this.f1828r = null;
        this.f1834x = false;
        this.f1835y = true;
        this.f1816C = C5586f.m20508h(null);
        this.f1821H = new Matrix();
        C5006a1 c5006a12 = (C5006a1) m2305g();
        if (c5006a12.mo1369e(C5006a1.f19106A)) {
            this.f1824n = c5006a12.m19466I();
        } else {
            this.f1824n = 1;
        }
        this.f1826p = c5006a12.m19469L(0);
        Executor executor = (Executor) C0654h.m3467f(c5006a12.m19471N(C5493a.m20221c()));
        this.f1823m = executor;
        this.f1820G = C5493a.m20224f(executor);
    }

    /* renamed from: T */
    private void m1951T() {
        if (this.f1819F != null) {
            this.f1819F.m1996a(new C0441l("Camera is closed."));
        }
    }

    /* renamed from: V */
    static Rect m1952V(Rect rect, Rational rational, int i10, Size size, int i11) {
        if (rect != null) {
            return C2958a.m13377b(rect, i10, size, i11);
        }
        if (rational != null) {
            if (i11 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (C2958a.m13381f(size, rational)) {
                return C2958a.m13376a(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: X */
    static boolean m1953X(InterfaceC5066p1 interfaceC5066p1) {
        InterfaceC5061o0.a<Boolean> aVar = C5006a1.f19113H;
        Boolean bool = Boolean.FALSE;
        boolean z10 = false;
        if (((Boolean) interfaceC5066p1.mo1365a(aVar, bool)).booleanValue()) {
            boolean z11 = true;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26) {
                C0463q1.m2212k("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i10);
                z11 = false;
            }
            Integer num = (Integer) interfaceC5066p1.mo1365a(C5006a1.f19110E, null);
            if (num == null || num.intValue() == 256) {
                z10 = z11;
            } else {
                C0463q1.m2212k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z10) {
                C0463q1.m2212k("ImageCapture", "Unable to support software JPEG. Disabling.");
                interfaceC5066p1.mo19659g(aVar, bool);
            }
        }
        return z10;
    }

    /* renamed from: Y */
    private InterfaceC5041j0 m1954Y(InterfaceC5041j0 interfaceC5041j0) {
        List<InterfaceC5053m0> mo1864a = this.f1831u.mo1864a();
        return (mo1864a == null || mo1864a.isEmpty()) ? interfaceC5041j0 : C0380a0.m1861a(mo1864a);
    }

    /* renamed from: a0 */
    static int m1955a0(Throwable th) {
        if (th instanceof C0441l) {
            return 3;
        }
        if (th instanceof C0415h1) {
            return ((C0415h1) th).m2032a();
        }
        return 0;
    }

    /* renamed from: c0 */
    private int m1956c0() {
        C5006a1 c5006a1 = (C5006a1) m2305g();
        if (c5006a1.mo1369e(C5006a1.f19115J)) {
            return c5006a1.m19472O();
        }
        int i10 = this.f1824n;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f1824n + " is invalid");
    }

    /* renamed from: d0 */
    private static boolean m1957d0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public /* synthetic */ void m1959g0(String str, C5006a1 c5006a1, Size size, C5015c2 c5015c2, C5015c2.e eVar) {
        m1972U();
        if (m2312p(str)) {
            C5015c2.b m1973W = m1973W(str, c5006a1, size);
            this.f1836z = m1973W;
            m2298I(m1973W.m19514m());
            m2316t();
        }
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m1960h0(h hVar, String str, Throwable th) {
        C0463q1.m2204c("ImageCapture", "Processing image failed! " + str);
        hVar.m1995f(2, str, th);
    }

    /* renamed from: i0 */
    public static /* synthetic */ Void m1961i0(List list) {
        return null;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m1962j0(InterfaceC5034h1 interfaceC5034h1) {
        try {
            InterfaceC0443l1 mo1871c = interfaceC5034h1.mo1871c();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + mo1871c);
                if (mo1871c != null) {
                    mo1871c.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m1964l0(C0541c.a aVar, InterfaceC5034h1 interfaceC5034h1) {
        try {
            InterfaceC0443l1 mo1871c = interfaceC5034h1.mo1871c();
            if (mo1871c != null) {
                if (!aVar.m2519c(mo1871c)) {
                    mo1871c.close();
                }
            } else {
                aVar.m2521f(new IllegalStateException("Unable to acquire image"));
            }
        } catch (IllegalStateException e10) {
            aVar.m2521f(e10);
        }
    }

    /* renamed from: n0 */
    public /* synthetic */ Object m1966n0(h hVar, C0541c.a aVar) throws Exception {
        this.f1814A.mo1873e(new InterfaceC5034h1.a() { // from class: androidx.camera.core.b1
            public /* synthetic */ C0386b1() {
            }

            @Override // p279w.InterfaceC5034h1.a
            /* renamed from: a */
            public final void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
                C0401e1.m1964l0(C0541c.a.this, interfaceC5034h1);
            }
        }, C5493a.m20222d());
        m1967o0();
        InterfaceFutureC2565m<Void> m1976e0 = m1976e0(hVar);
        C5586f.m20502b(m1976e0, new d(aVar), this.f1829s);
        aVar.m2517a(new Runnable() { // from class: androidx.camera.core.y0
            public /* synthetic */ RunnableC0494y0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceFutureC2565m.this.cancel(true);
            }
        }, C5493a.m20219a());
        return "takePictureInternal";
    }

    /* renamed from: o0 */
    private void m1967o0() {
        synchronized (this.f1825o) {
            if (this.f1825o.get() != null) {
                return;
            }
            this.f1825o.set(Integer.valueOf(m1975b0()));
        }
    }

    /* renamed from: q0 */
    public InterfaceFutureC2565m<InterfaceC0443l1> m1958f0(h hVar) {
        return C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.core.x0

            /* renamed from: b */
            public final /* synthetic */ C0401e1.h f2143b;

            public /* synthetic */ C0490x0(C0401e1.h hVar2) {
                r2 = hVar2;
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m1966n0;
                m1966n0 = C0401e1.this.m1966n0(r2, aVar);
                return m1966n0;
            }
        });
    }

    /* renamed from: r0 */
    private void m1969r0() {
        synchronized (this.f1825o) {
            if (this.f1825o.get() != null) {
                return;
            }
            m2303e().mo1734h(m1975b0());
        }
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: A */
    public void mo1916A() {
        InterfaceFutureC2565m<Void> interfaceFutureC2565m = this.f1816C;
        m1951T();
        m1972U();
        this.f1834x = false;
        interfaceFutureC2565m.mo2501b(new Runnable() { // from class: androidx.camera.core.z0

            /* renamed from: n */
            public final /* synthetic */ ExecutorService f2220n;

            public /* synthetic */ RunnableC0498z0(ExecutorService executorService) {
                r1 = executorService;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r1.shutdown();
            }
        }, C5493a.m20219a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w.o2, w.a2] */
    /* JADX WARN: Type inference failed for: r8v25, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: B */
    protected InterfaceC5063o2<?> mo1970B(InterfaceC5009b0 interfaceC5009b0, InterfaceC5063o2.a<?, ?, ?> aVar) {
        ?? mo1927b = aVar.mo1927b();
        InterfaceC5061o0.a<InterfaceC5049l0> aVar2 = C5006a1.f19109D;
        if (mo1927b.mo1365a(aVar2, null) != null && Build.VERSION.SDK_INT >= 29) {
            C0463q1.m2206e("ImageCapture", "Requesting software JPEG due to a CaptureProcessor is set.");
            aVar.mo1926a().mo19659g(C5006a1.f19113H, Boolean.TRUE);
        } else if (interfaceC5009b0.mo1573g().m19724a(InterfaceC0964e.class)) {
            InterfaceC5066p1 mo1926a = aVar.mo1926a();
            InterfaceC5061o0.a<Boolean> aVar3 = C5006a1.f19113H;
            Boolean bool = Boolean.TRUE;
            if (!((Boolean) mo1926a.mo1365a(aVar3, bool)).booleanValue()) {
                C0463q1.m2212k("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C0463q1.m2206e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.mo1926a().mo19659g(aVar3, bool);
            }
        }
        boolean m1953X = m1953X(aVar.mo1926a());
        Integer num = (Integer) aVar.mo1926a().mo1365a(C5006a1.f19110E, null);
        if (num != null) {
            C0654h.m3463b(aVar.mo1926a().mo1365a(aVar2, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, Integer.valueOf(m1953X ? 35 : num.intValue()));
        } else if (aVar.mo1926a().mo1365a(aVar2, null) == null && !m1953X) {
            List list = (List) aVar.mo1926a().mo1365a(InterfaceC5026f1.f19172m, null);
            if (list == null) {
                aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 256);
            } else if (m1957d0(list, 256)) {
                aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 256);
            } else if (m1957d0(list, 35)) {
                aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 35);
            }
        } else {
            aVar.mo1926a().mo19659g(InterfaceC5018d1.f19155f, 35);
        }
        C0654h.m3463b(((Integer) aVar.mo1926a().mo1365a(C5006a1.f19111F, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
        return aVar.mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: D */
    public void mo1917D() {
        m1951T();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: E */
    protected Size mo1918E(Size size) {
        C5015c2.b m1973W = m1973W(m2304f(), (C5006a1) m2305g(), size);
        this.f1836z = m1973W;
        m2298I(m1973W.m19514m());
        m2314r();
        return size;
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: G */
    public void mo1971G(Matrix matrix) {
        this.f1821H = matrix;
    }

    /* renamed from: U */
    void m1972U() {
        C0432l.m2119a();
        i iVar = this.f1819F;
        if (iVar != null) {
            iVar.m1996a(new CancellationException("Request is canceled."));
            this.f1819F = null;
        }
        AbstractC5073r0 abstractC5073r0 = this.f1818E;
        this.f1818E = null;
        this.f1814A = null;
        this.f1815B = null;
        this.f1816C = C5586f.m20508h(null);
        if (abstractC5073r0 != null) {
            abstractC5073r0.m19676c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c8  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p279w.C5015c2.b m1973W(java.lang.String r16, p279w.C5006a1 r17, android.util.Size r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0401e1.m1973W(java.lang.String, w.a1, android.util.Size):w.c2$b");
    }

    /* renamed from: Z */
    public int m1974Z() {
        return this.f1824n;
    }

    /* renamed from: b0 */
    public int m1975b0() {
        int i10;
        synchronized (this.f1825o) {
            i10 = this.f1827q;
            if (i10 == -1) {
                i10 = ((C5006a1) m2305g()).m19468K(2);
            }
        }
        return i10;
    }

    /* renamed from: e0 */
    InterfaceFutureC2565m<Void> m1976e0(h hVar) {
        InterfaceC5041j0 m1954Y;
        String str;
        C0463q1.m2202a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.f1815B != null) {
            m1954Y = m1954Y(C0380a0.m1863c());
            if (m1954Y == null) {
                return C5586f.m20506f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.f1833w == null && m1954Y.mo1864a().size() > 1) {
                return C5586f.m20506f(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (m1954Y.mo1864a().size() > this.f1832v) {
                return C5586f.m20506f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.f1815B.m1891u(m1954Y);
            this.f1815B.m1892v(C5493a.m20219a(), new C0397d2.f() { // from class: androidx.camera.core.w0
                public /* synthetic */ C0486w0() {
                }

                @Override // androidx.camera.core.C0397d2.f
                /* renamed from: a */
                public final void mo1902a(String str2, Throwable th) {
                    C0401e1.m1960h0(C0401e1.h.this, str2, th);
                }
            });
            str = this.f1815B.m1889p();
        } else {
            m1954Y = m1954Y(C0380a0.m1863c());
            if (m1954Y.mo1864a().size() > 1) {
                return C5586f.m20506f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (InterfaceC5053m0 interfaceC5053m0 : m1954Y.mo1864a()) {
            C5045k0.a aVar = new C5045k0.a();
            aVar.m19603p(this.f1830t.m19586g());
            aVar.m19594e(this.f1830t.m19583d());
            aVar.m19590a(this.f1836z.m19516p());
            aVar.m19595f(this.f1818E);
            if (m2306i() == 256) {
                if (f1813J.m6503a()) {
                    aVar.m19593d(C5045k0.f19211h, Integer.valueOf(hVar.f1847a));
                }
                aVar.m19593d(C5045k0.f19212i, Integer.valueOf(hVar.f1848b));
            }
            aVar.m19594e(interfaceC5053m0.mo19606a().m19583d());
            if (str != null) {
                aVar.m19596g(str, Integer.valueOf(interfaceC5053m0.mo19607b()));
            }
            aVar.m19592c(this.f1817D);
            arrayList.add(aVar.m19597h());
        }
        return C5586f.m20515o(m2303e().mo1727d(arrayList, this.f1824n, this.f1826p), C0381a1.f1718a, C5493a.m20219a());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: h */
    public InterfaceC5063o2<?> mo1921h(boolean z10, InterfaceC5067p2 interfaceC5067p2) {
        InterfaceC5061o0 mo1381a = interfaceC5067p2.mo1381a(InterfaceC5067p2.b.IMAGE_CAPTURE, m1974Z());
        if (z10) {
            mo1381a = C5057n0.m19631b(mo1381a, f1812I.m1989a());
        }
        if (mo1381a == null) {
            return null;
        }
        return mo1922n(mo1381a).mo1927b();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: n */
    public InterfaceC5063o2.a<?, ?, ?> mo1922n(InterfaceC5061o0 interfaceC5061o0) {
        return f.m1982d(interfaceC5061o0);
    }

    /* renamed from: p0 */
    public void m1977p0(Rational rational) {
        this.f1828r = rational;
    }

    /* renamed from: s0 */
    void m1978s0() {
        synchronized (this.f1825o) {
            Integer andSet = this.f1825o.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != m1975b0()) {
                m1969r0();
            }
        }
    }

    public String toString() {
        return "ImageCapture:" + m2307j();
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: x */
    public void mo1923x() {
        C5006a1 c5006a1 = (C5006a1) m2305g();
        this.f1830t = C5045k0.a.m19588j(c5006a1).m19597h();
        this.f1833w = c5006a1.m19467J(null);
        this.f1832v = c5006a1.m19473P(2);
        this.f1831u = c5006a1.m19465H(C0380a0.m1863c());
        this.f1834x = c5006a1.m19476S();
        this.f1835y = c5006a1.m19475R();
        C0654h.m3468g(m2302d(), "Attached camera cannot be null");
        this.f1829s = Executors.newFixedThreadPool(1, new e());
    }

    @Override // androidx.camera.core.AbstractC0496y2
    /* renamed from: y */
    protected void mo1979y() {
        m1969r0();
    }
}
