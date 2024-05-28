package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import android.os.Build;
import androidx.camera.core.C0450n0;
import androidx.concurrent.futures.C0541c;
import androidx.core.os.C0631j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p001a0.C0001a;
import p279w.InterfaceC5034h1;

/* renamed from: androidx.camera.core.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0462q0 implements InterfaceC5034h1.a {

    /* renamed from: t */
    private static final RectF f2051t = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    private C0450n0.a f2052a;

    /* renamed from: b */
    private volatile int f2053b;

    /* renamed from: c */
    private volatile int f2054c;

    /* renamed from: e */
    private volatile boolean f2056e;

    /* renamed from: f */
    private volatile boolean f2057f;

    /* renamed from: g */
    private Executor f2058g;

    /* renamed from: h */
    private C0444l2 f2059h;

    /* renamed from: i */
    private ImageWriter f2060i;

    /* renamed from: n */
    ByteBuffer f2065n;

    /* renamed from: o */
    ByteBuffer f2066o;

    /* renamed from: p */
    ByteBuffer f2067p;

    /* renamed from: q */
    ByteBuffer f2068q;

    /* renamed from: d */
    private volatile int f2055d = 1;

    /* renamed from: j */
    private Rect f2061j = new Rect();

    /* renamed from: k */
    private Rect f2062k = new Rect();

    /* renamed from: l */
    private Matrix f2063l = new Matrix();

    /* renamed from: m */
    private Matrix f2064m = new Matrix();

    /* renamed from: r */
    private final Object f2069r = new Object();

    /* renamed from: s */
    protected boolean f2070s = true;

    /* renamed from: h */
    private void m2179h(InterfaceC0443l1 interfaceC0443l1) {
        if (this.f2055d == 1) {
            if (this.f2066o == null) {
                this.f2066o = ByteBuffer.allocateDirect(interfaceC0443l1.mo1853g() * interfaceC0443l1.getHeight());
            }
            this.f2066o.position(0);
            if (this.f2067p == null) {
                this.f2067p = ByteBuffer.allocateDirect((interfaceC0443l1.mo1853g() * interfaceC0443l1.getHeight()) / 4);
            }
            this.f2067p.position(0);
            if (this.f2068q == null) {
                this.f2068q = ByteBuffer.allocateDirect((interfaceC0443l1.mo1853g() * interfaceC0443l1.getHeight()) / 4);
            }
            this.f2068q.position(0);
            return;
        }
        if (this.f2055d == 2 && this.f2065n == null) {
            this.f2065n = ByteBuffer.allocateDirect(interfaceC0443l1.mo1853g() * interfaceC0443l1.getHeight() * 4);
        }
    }

    /* renamed from: i */
    private static C0444l2 m2180i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new C0444l2(C0451n1.m2162a(i15, i10, i13, i14));
    }

    /* renamed from: k */
    static Matrix m2181k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), f2051t, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(m2182l(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    /* renamed from: l */
    private static Matrix m2182l(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2051t, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: m */
    static Rect m2183m(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: n */
    public /* synthetic */ void m2184n(InterfaceC0443l1 interfaceC0443l1, Matrix matrix, InterfaceC0443l1 interfaceC0443l12, Rect rect, C0450n0.a aVar, C0541c.a aVar2) {
        if (this.f2070s) {
            C0448m2 c0448m2 = new C0448m2(interfaceC0443l12, AbstractC0455o1.m2173f(interfaceC0443l1.mo1857q().mo2028a(), interfaceC0443l1.mo1857q().mo2029c(), this.f2056e ? 0 : this.f2053b, matrix));
            if (!rect.isEmpty()) {
                c0448m2.mo1856o(rect);
            }
            aVar.mo2125b(c0448m2);
            aVar2.m2519c(null);
            return;
        }
        aVar2.m2521f(new C0631j("ImageAnalysis is detached"));
    }

    /* renamed from: o */
    public /* synthetic */ Object m2185o(Executor executor, InterfaceC0443l1 interfaceC0443l1, Matrix matrix, InterfaceC0443l1 interfaceC0443l12, Rect rect, C0450n0.a aVar, C0541c.a aVar2) throws Exception {
        executor.execute(new Runnable() { // from class: androidx.camera.core.p0

            /* renamed from: o */
            public final /* synthetic */ InterfaceC0443l1 f2042o;

            /* renamed from: p */
            public final /* synthetic */ Matrix f2043p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC0443l1 f2044q;

            /* renamed from: r */
            public final /* synthetic */ Rect f2045r;

            /* renamed from: s */
            public final /* synthetic */ C0450n0.a f2046s;

            /* renamed from: t */
            public final /* synthetic */ C0541c.a f2047t;

            public /* synthetic */ RunnableC0458p0(InterfaceC0443l1 interfaceC0443l13, Matrix matrix2, InterfaceC0443l1 interfaceC0443l122, Rect rect2, C0450n0.a aVar3, C0541c.a aVar22) {
                r2 = interfaceC0443l13;
                r3 = matrix2;
                r4 = interfaceC0443l122;
                r5 = rect2;
                r6 = aVar3;
                r7 = aVar22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0462q0.this.m2184n(r2, r3, r4, r5, r6, r7);
            }
        });
        return "analyzeImage";
    }

    /* renamed from: q */
    private void m2186q(int i10, int i11, int i12, int i13) {
        Matrix m2181k = m2181k(i10, i11, i12, i13, this.f2053b);
        this.f2062k = m2183m(this.f2061j, m2181k);
        this.f2064m.setConcat(this.f2063l, m2181k);
    }

    /* renamed from: r */
    private void m2187r(InterfaceC0443l1 interfaceC0443l1, int i10) {
        C0444l2 c0444l2 = this.f2059h;
        if (c0444l2 == null) {
            return;
        }
        c0444l2.m2131m();
        this.f2059h = m2180i(interfaceC0443l1.mo1853g(), interfaceC0443l1.getHeight(), i10, this.f2059h.mo1872d(), this.f2059h.mo1876h());
        if (Build.VERSION.SDK_INT < 23 || this.f2055d != 1) {
            return;
        }
        ImageWriter imageWriter = this.f2060i;
        if (imageWriter != null) {
            C0001a.m4a(imageWriter);
        }
        this.f2060i = C0001a.m6c(this.f2059h.mo1870a(), this.f2059h.mo1876h());
    }

    @Override // p279w.InterfaceC5034h1.a
    /* renamed from: a */
    public void mo1382a(InterfaceC5034h1 interfaceC5034h1) {
        try {
            InterfaceC0443l1 mo2188d = mo2188d(interfaceC5034h1);
            if (mo2188d != null) {
                mo2193p(mo2188d);
            }
        } catch (IllegalStateException e10) {
            C0463q1.m2205d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    /* renamed from: d */
    abstract InterfaceC0443l1 mo2188d(InterfaceC5034h1 interfaceC5034h1);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.InterfaceFutureC2565m<java.lang.Void> m2189e(androidx.camera.core.InterfaceC0443l1 r17) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.AbstractC0462q0.m2189e(androidx.camera.core.l1):com.google.common.util.concurrent.m");
    }

    /* renamed from: f */
    public void m2190f() {
        this.f2070s = true;
    }

    /* renamed from: g */
    public abstract void mo2191g();

    /* renamed from: j */
    public void m2192j() {
        this.f2070s = false;
        mo2191g();
    }

    /* renamed from: p */
    abstract void mo2193p(InterfaceC0443l1 interfaceC0443l1);

    /* renamed from: s */
    public void m2194s(Executor executor, C0450n0.a aVar) {
        synchronized (this.f2069r) {
            if (aVar == null) {
                mo2191g();
            }
            this.f2052a = aVar;
            this.f2058g = executor;
        }
    }

    /* renamed from: t */
    public void m2195t(boolean z10) {
        this.f2057f = z10;
    }

    /* renamed from: u */
    public void m2196u(int i10) {
        this.f2055d = i10;
    }

    /* renamed from: v */
    public void m2197v(boolean z10) {
        this.f2056e = z10;
    }

    /* renamed from: w */
    public void m2198w(C0444l2 c0444l2) {
        synchronized (this.f2069r) {
            this.f2059h = c0444l2;
        }
    }

    /* renamed from: x */
    public void m2199x(int i10) {
        this.f2053b = i10;
    }

    /* renamed from: y */
    public void m2200y(Matrix matrix) {
        synchronized (this.f2069r) {
            this.f2063l = matrix;
            this.f2064m = new Matrix(this.f2063l);
        }
    }

    /* renamed from: z */
    public void m2201z(Rect rect) {
        synchronized (this.f2069r) {
            this.f2061j = rect;
            this.f2062k = new Rect(this.f2061j);
        }
    }
}
