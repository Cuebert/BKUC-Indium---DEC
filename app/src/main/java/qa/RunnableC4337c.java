package qa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import qa.AbstractC4364y;
import qa.C4357r;
import qa.C4359t;
import qa.InterfaceC4349j;

/* renamed from: qa.c */
/* loaded from: classes.dex */
public class RunnableC4337c implements Runnable {

    /* renamed from: G */
    private static final Object f17637G = new Object();

    /* renamed from: H */
    private static final ThreadLocal<StringBuilder> f17638H = new a();

    /* renamed from: I */
    private static final AtomicInteger f17639I = new AtomicInteger();

    /* renamed from: J */
    private static final AbstractC4364y f17640J = new b();

    /* renamed from: A */
    Future<?> f17641A;

    /* renamed from: B */
    C4359t.e f17642B;

    /* renamed from: C */
    Exception f17643C;

    /* renamed from: D */
    int f17644D;

    /* renamed from: E */
    int f17645E;

    /* renamed from: F */
    C4359t.f f17646F;

    /* renamed from: n */
    final int f17647n = f17639I.incrementAndGet();

    /* renamed from: o */
    final C4359t f17648o;

    /* renamed from: p */
    final C4348i f17649p;

    /* renamed from: q */
    final InterfaceC4339d f17650q;

    /* renamed from: r */
    final C4334a0 f17651r;

    /* renamed from: s */
    final String f17652s;

    /* renamed from: t */
    final C4362w f17653t;

    /* renamed from: u */
    final int f17654u;

    /* renamed from: v */
    int f17655v;

    /* renamed from: w */
    final AbstractC4364y f17656w;

    /* renamed from: x */
    AbstractC4333a f17657x;

    /* renamed from: y */
    List<AbstractC4333a> f17658y;

    /* renamed from: z */
    Bitmap f17659z;

    /* renamed from: qa.c$a */
    /* loaded from: classes.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: qa.c$b */
    /* loaded from: classes.dex */
    static class b extends AbstractC4364y {
        b() {
        }

        @Override // qa.AbstractC4364y
        /* renamed from: c */
        public boolean mo17891c(C4362w c4362w) {
            return true;
        }

        @Override // qa.AbstractC4364y
        /* renamed from: f */
        public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + c4362w);
        }
    }

    /* renamed from: qa.c$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4342e0 f17660n;

        /* renamed from: o */
        final /* synthetic */ RuntimeException f17661o;

        c(InterfaceC4342e0 interfaceC4342e0, RuntimeException runtimeException) {
            this.f17660n = interfaceC4342e0;
            this.f17661o = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f17660n.mo6705b() + " crashed with exception.", this.f17661o);
        }
    }

    /* renamed from: qa.c$d */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: n */
        final /* synthetic */ StringBuilder f17662n;

        d(StringBuilder sb2) {
            this.f17662n = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f17662n.toString());
        }
    }

    /* renamed from: qa.c$e */
    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4342e0 f17663n;

        e(InterfaceC4342e0 interfaceC4342e0) {
            this.f17663n = interfaceC4342e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f17663n.mo6705b() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: qa.c$f */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceC4342e0 f17664n;

        f(InterfaceC4342e0 interfaceC4342e0) {
            this.f17664n = interfaceC4342e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f17664n.mo6705b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    RunnableC4337c(C4359t c4359t, C4348i c4348i, InterfaceC4339d interfaceC4339d, C4334a0 c4334a0, AbstractC4333a abstractC4333a, AbstractC4364y abstractC4364y) {
        this.f17648o = c4359t;
        this.f17649p = c4348i;
        this.f17650q = interfaceC4339d;
        this.f17651r = c4334a0;
        this.f17657x = abstractC4333a;
        this.f17652s = abstractC4333a.m17867d();
        this.f17653t = abstractC4333a.m17872i();
        this.f17646F = abstractC4333a.m17871h();
        this.f17654u = abstractC4333a.m17868e();
        this.f17655v = abstractC4333a.m17869f();
        this.f17656w = abstractC4364y;
        this.f17645E = abstractC4364y.mo17998e();
    }

    /* renamed from: a */
    static Bitmap m17894a(List<InterfaceC4342e0> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            InterfaceC4342e0 interfaceC4342e0 = list.get(i10);
            try {
                Bitmap mo6704a = interfaceC4342e0.mo6704a(bitmap);
                if (mo6704a == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(interfaceC4342e0.mo6705b());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<InterfaceC4342e0> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().mo6705b());
                        sb2.append('\n');
                    }
                    C4359t.f17735p.post(new d(sb2));
                    return null;
                }
                if (mo6704a == bitmap && bitmap.isRecycled()) {
                    C4359t.f17735p.post(new e(interfaceC4342e0));
                    return null;
                }
                if (mo6704a != bitmap && !bitmap.isRecycled()) {
                    C4359t.f17735p.post(new f(interfaceC4342e0));
                    return null;
                }
                i10++;
                bitmap = mo6704a;
            } catch (RuntimeException e10) {
                C4359t.f17735p.post(new c(interfaceC4342e0, e10));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    private C4359t.f m17895d() {
        C4359t.f fVar = C4359t.f.LOW;
        List<AbstractC4333a> list = this.f17658y;
        boolean z10 = true;
        boolean z11 = (list == null || list.isEmpty()) ? false : true;
        AbstractC4333a abstractC4333a = this.f17657x;
        if (abstractC4333a == null && !z11) {
            z10 = false;
        }
        if (!z10) {
            return fVar;
        }
        if (abstractC4333a != null) {
            fVar = abstractC4333a.m17871h();
        }
        if (z11) {
            int size = this.f17658y.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4359t.f m17871h = this.f17658y.get(i10).m17871h();
                if (m17871h.ordinal() > fVar.ordinal()) {
                    fVar = m17871h;
                }
            }
        }
        return fVar;
    }

    /* renamed from: e */
    static Bitmap m17896e(InputStream inputStream, C4362w c4362w) throws IOException {
        C4353n c4353n = new C4353n(inputStream);
        long m17990c = c4353n.m17990c(65536);
        BitmapFactory.Options m18050d = AbstractC4364y.m18050d(c4362w);
        boolean m18051g = AbstractC4364y.m18051g(m18050d);
        boolean m17949t = C4346g0.m17949t(c4353n);
        c4353n.m17989b(m17990c);
        if (m17949t) {
            byte[] m17953x = C4346g0.m17953x(c4353n);
            if (m18051g) {
                BitmapFactory.decodeByteArray(m17953x, 0, m17953x.length, m18050d);
                AbstractC4364y.m18049b(c4362w.f17793h, c4362w.f17794i, m18050d, c4362w);
            }
            return BitmapFactory.decodeByteArray(m17953x, 0, m17953x.length, m18050d);
        }
        if (m18051g) {
            BitmapFactory.decodeStream(c4353n, null, m18050d);
            AbstractC4364y.m18049b(c4362w.f17793h, c4362w.f17794i, m18050d, c4362w);
            c4353n.m17989b(m17990c);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(c4353n, null, m18050d);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: g */
    public static RunnableC4337c m17897g(C4359t c4359t, C4348i c4348i, InterfaceC4339d interfaceC4339d, C4334a0 c4334a0, AbstractC4333a abstractC4333a) {
        C4362w m17872i = abstractC4333a.m17872i();
        List<AbstractC4364y> m18011i = c4359t.m18011i();
        int size = m18011i.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4364y abstractC4364y = m18011i.get(i10);
            if (abstractC4364y.mo17891c(m17872i)) {
                return new RunnableC4337c(c4359t, c4348i, interfaceC4339d, c4334a0, abstractC4333a, abstractC4364y);
            }
        }
        return new RunnableC4337c(c4359t, c4348i, interfaceC4339d, c4334a0, abstractC4333a, f17640J);
    }

    /* renamed from: t */
    private static boolean m17898t(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || i10 > i12 || i11 > i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.graphics.Bitmap m17899w(qa.C4362w r13, android.graphics.Bitmap r14, int r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.RunnableC4337c.m17899w(qa.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: x */
    static void m17900x(C4362w c4362w) {
        String m18028a = c4362w.m18028a();
        StringBuilder sb2 = f17638H.get();
        sb2.ensureCapacity(m18028a.length() + 8);
        sb2.replace(8, sb2.length(), m18028a);
        Thread.currentThread().setName(sb2.toString());
    }

    /* renamed from: b */
    public void m17901b(AbstractC4333a abstractC4333a) {
        boolean z10 = this.f17648o.f17750n;
        C4362w c4362w = abstractC4333a.f17592b;
        if (this.f17657x == null) {
            this.f17657x = abstractC4333a;
            if (z10) {
                List<AbstractC4333a> list = this.f17658y;
                if (list != null && !list.isEmpty()) {
                    C4346g0.m17951v("Hunter", "joined", c4362w.m18031d(), C4346g0.m17942m(this, "to "));
                    return;
                } else {
                    C4346g0.m17951v("Hunter", "joined", c4362w.m18031d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f17658y == null) {
            this.f17658y = new ArrayList(3);
        }
        this.f17658y.add(abstractC4333a);
        if (z10) {
            C4346g0.m17951v("Hunter", "joined", c4362w.m18031d(), C4346g0.m17942m(this, "to "));
        }
        C4359t.f m17871h = abstractC4333a.m17871h();
        if (m17871h.ordinal() > this.f17646F.ordinal()) {
            this.f17646F = m17871h;
        }
    }

    /* renamed from: c */
    public boolean m17902c() {
        Future<?> future;
        if (this.f17657x != null) {
            return false;
        }
        List<AbstractC4333a> list = this.f17658y;
        return (list == null || list.isEmpty()) && (future = this.f17641A) != null && future.cancel(false);
    }

    /* renamed from: f */
    public void m17903f(AbstractC4333a abstractC4333a) {
        boolean remove;
        if (this.f17657x == abstractC4333a) {
            this.f17657x = null;
            remove = true;
        } else {
            List<AbstractC4333a> list = this.f17658y;
            remove = list != null ? list.remove(abstractC4333a) : false;
        }
        if (remove && abstractC4333a.m17871h() == this.f17646F) {
            this.f17646F = m17895d();
        }
        if (this.f17648o.f17750n) {
            C4346g0.m17951v("Hunter", "removed", abstractC4333a.f17592b.m18031d(), C4346g0.m17942m(this, "from "));
        }
    }

    /* renamed from: h */
    public AbstractC4333a m17904h() {
        return this.f17657x;
    }

    /* renamed from: i */
    public List<AbstractC4333a> m17905i() {
        return this.f17658y;
    }

    /* renamed from: j */
    public C4362w m17906j() {
        return this.f17653t;
    }

    /* renamed from: k */
    public Exception m17907k() {
        return this.f17643C;
    }

    /* renamed from: l */
    public String m17908l() {
        return this.f17652s;
    }

    /* renamed from: m */
    public C4359t.e m17909m() {
        return this.f17642B;
    }

    /* renamed from: n */
    public int m17910n() {
        return this.f17654u;
    }

    /* renamed from: o */
    public C4359t m17911o() {
        return this.f17648o;
    }

    /* renamed from: p */
    public C4359t.f m17912p() {
        return this.f17646F;
    }

    /* renamed from: q */
    public Bitmap m17913q() {
        return this.f17659z;
    }

    /* renamed from: r */
    Bitmap m17914r() throws IOException {
        Bitmap bitmap;
        if (EnumC4355p.m17993b(this.f17654u)) {
            bitmap = this.f17650q.mo17919a(this.f17652s);
            if (bitmap != null) {
                this.f17651r.m17882d();
                this.f17642B = C4359t.e.MEMORY;
                if (this.f17648o.f17750n) {
                    C4346g0.m17951v("Hunter", "decoded", this.f17653t.m18031d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        C4362w c4362w = this.f17653t;
        c4362w.f17788c = this.f17645E == 0 ? EnumC4356q.OFFLINE.f17731n : this.f17655v;
        AbstractC4364y.a mo17892f = this.f17656w.mo17892f(c4362w, this.f17655v);
        if (mo17892f != null) {
            this.f17642B = mo17892f.m18054c();
            this.f17644D = mo17892f.m18053b();
            bitmap = mo17892f.m18052a();
            if (bitmap == null) {
                InputStream m18055d = mo17892f.m18055d();
                try {
                    Bitmap m17896e = m17896e(m18055d, this.f17653t);
                    C4346g0.m17934e(m18055d);
                    bitmap = m17896e;
                } catch (Throwable th) {
                    C4346g0.m17934e(m18055d);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f17648o.f17750n) {
                C4346g0.m17950u("Hunter", "decoded", this.f17653t.m18031d());
            }
            this.f17651r.m17880b(bitmap);
            if (this.f17653t.m18033f() || this.f17644D != 0) {
                synchronized (f17637G) {
                    if (this.f17653t.m18032e() || this.f17644D != 0) {
                        bitmap = m17899w(this.f17653t, bitmap, this.f17644D);
                        if (this.f17648o.f17750n) {
                            C4346g0.m17950u("Hunter", "transformed", this.f17653t.m18031d());
                        }
                    }
                    if (this.f17653t.m18029b()) {
                        bitmap = m17894a(this.f17653t.f17792g, bitmap);
                        if (this.f17648o.f17750n) {
                            C4346g0.m17951v("Hunter", "transformed", this.f17653t.m18031d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f17651r.m17881c(bitmap);
                }
            }
        }
        return bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        m17900x(this.f17653t);
                        if (this.f17648o.f17750n) {
                            C4346g0.m17950u("Hunter", "executing", C4346g0.m17941l(this));
                        }
                        Bitmap m17914r = m17914r();
                        this.f17659z = m17914r;
                        if (m17914r == null) {
                            this.f17649p.m17966e(this);
                        } else {
                            this.f17649p.m17965d(this);
                        }
                    } catch (OutOfMemoryError e10) {
                        StringWriter stringWriter = new StringWriter();
                        this.f17651r.m17879a().m17893a(new PrintWriter(stringWriter));
                        this.f17643C = new RuntimeException(stringWriter.toString(), e10);
                        this.f17649p.m17966e(this);
                    } catch (C4357r.a e11) {
                        this.f17643C = e11;
                        this.f17649p.m17968g(this);
                    }
                } catch (InterfaceC4349j.b e12) {
                    if (!e12.f17700n || e12.f17701o != 504) {
                        this.f17643C = e12;
                    }
                    this.f17649p.m17966e(this);
                } catch (Exception e13) {
                    this.f17643C = e13;
                    this.f17649p.m17966e(this);
                }
            } catch (IOException e14) {
                this.f17643C = e14;
                this.f17649p.m17968g(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* renamed from: s */
    public boolean m17915s() {
        Future<?> future = this.f17641A;
        return future != null && future.isCancelled();
    }

    /* renamed from: u */
    public boolean m17916u(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f17645E;
        if (!(i10 > 0)) {
            return false;
        }
        this.f17645E = i10 - 1;
        return this.f17656w.mo17999h(z10, networkInfo);
    }

    /* renamed from: v */
    public boolean m17917v() {
        return this.f17656w.mo18000i();
    }
}
