package p134k0;

import java.util.Arrays;
import java.util.HashMap;
import p134k0.C3713i;
import p147l0.C3859d;
import p147l0.C3860e;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public class C3708d {

    /* renamed from: r */
    public static boolean f15494r = false;

    /* renamed from: s */
    public static boolean f15495s = true;

    /* renamed from: t */
    public static boolean f15496t = true;

    /* renamed from: u */
    public static boolean f15497u = true;

    /* renamed from: v */
    public static boolean f15498v = false;

    /* renamed from: w */
    private static int f15499w = 1000;

    /* renamed from: x */
    public static long f15500x;

    /* renamed from: y */
    public static long f15501y;

    /* renamed from: d */
    private a f15505d;

    /* renamed from: g */
    C3706b[] f15508g;

    /* renamed from: n */
    final C3707c f15515n;

    /* renamed from: q */
    private a f15518q;

    /* renamed from: a */
    public boolean f15502a = false;

    /* renamed from: b */
    int f15503b = 0;

    /* renamed from: c */
    private HashMap<String, C3713i> f15504c = null;

    /* renamed from: e */
    private int f15506e = 32;

    /* renamed from: f */
    private int f15507f = 32;

    /* renamed from: h */
    public boolean f15509h = false;

    /* renamed from: i */
    public boolean f15510i = false;

    /* renamed from: j */
    private boolean[] f15511j = new boolean[32];

    /* renamed from: k */
    int f15512k = 1;

    /* renamed from: l */
    int f15513l = 0;

    /* renamed from: m */
    private int f15514m = 32;

    /* renamed from: o */
    private C3713i[] f15516o = new C3713i[f15499w];

    /* renamed from: p */
    private int f15517p = 0;

    /* renamed from: k0.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C3713i mo15726a(C3708d c3708d, boolean[] zArr);

        /* renamed from: b */
        void mo15727b(a aVar);

        /* renamed from: c */
        void mo15728c(C3713i c3713i);

        void clear();

        C3713i getKey();

        boolean isEmpty();
    }

    /* renamed from: k0.d$b */
    /* loaded from: classes.dex */
    public class b extends C3706b {
        public b(C3707c c3707c) {
            this.f15488e = new C3714j(this, c3707c);
        }
    }

    public C3708d() {
        this.f15508g = null;
        this.f15508g = new C3706b[32];
        m15751C();
        C3707c c3707c = new C3707c();
        this.f15515n = c3707c;
        this.f15505d = new C3712h(c3707c);
        if (f15498v) {
            this.f15518q = new b(c3707c);
        } else {
            this.f15518q = new C3706b(c3707c);
        }
    }

    /* renamed from: B */
    private final int m15750B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f15512k; i10++) {
            this.f15511j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f15512k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f15511j[aVar.getKey().f15535c] = true;
            }
            C3713i mo15726a = aVar.mo15726a(this, this.f15511j);
            if (mo15726a != null) {
                boolean[] zArr = this.f15511j;
                int i12 = mo15726a.f15535c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (mo15726a != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f15513l; i14++) {
                    C3706b c3706b = this.f15508g[i14];
                    if (c3706b.f15484a.f15542j != C3713i.a.UNRESTRICTED && !c3706b.f15489f && c3706b.m15745t(mo15726a)) {
                        float mo15715g = c3706b.f15488e.mo15715g(mo15726a);
                        if (mo15715g < 0.0f) {
                            float f11 = (-c3706b.f15485b) / mo15715g;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C3706b c3706b2 = this.f15508g[i13];
                    c3706b2.f15484a.f15536d = -1;
                    c3706b2.m15747x(mo15726a);
                    C3713i c3713i = c3706b2.f15484a;
                    c3713i.f15536d = i13;
                    c3713i.m15798g(this, c3706b2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    /* renamed from: C */
    private void m15751C() {
        int i10 = 0;
        if (f15498v) {
            while (i10 < this.f15513l) {
                C3706b c3706b = this.f15508g[i10];
                if (c3706b != null) {
                    this.f15515n.f15490a.mo15780a(c3706b);
                }
                this.f15508g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f15513l) {
            C3706b c3706b2 = this.f15508g[i10];
            if (c3706b2 != null) {
                this.f15515n.f15491b.mo15780a(c3706b2);
            }
            this.f15508g[i10] = null;
            i10++;
        }
    }

    /* renamed from: a */
    private C3713i m15752a(C3713i.a aVar, String str) {
        C3713i mo15781b = this.f15515n.f15492c.mo15781b();
        if (mo15781b == null) {
            mo15781b = new C3713i(aVar, str);
            mo15781b.m15797f(aVar, str);
        } else {
            mo15781b.m15795d();
            mo15781b.m15797f(aVar, str);
        }
        int i10 = this.f15517p;
        int i11 = f15499w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f15499w = i12;
            this.f15516o = (C3713i[]) Arrays.copyOf(this.f15516o, i12);
        }
        C3713i[] c3713iArr = this.f15516o;
        int i13 = this.f15517p;
        this.f15517p = i13 + 1;
        c3713iArr[i13] = mo15781b;
        return mo15781b;
    }

    /* renamed from: l */
    private final void m15753l(C3706b c3706b) {
        int i10;
        if (f15496t && c3706b.f15489f) {
            c3706b.f15484a.m15796e(this, c3706b.f15485b);
        } else {
            C3706b[] c3706bArr = this.f15508g;
            int i11 = this.f15513l;
            c3706bArr[i11] = c3706b;
            C3713i c3713i = c3706b.f15484a;
            c3713i.f15536d = i11;
            this.f15513l = i11 + 1;
            c3713i.m15798g(this, c3706b);
        }
        if (f15496t && this.f15502a) {
            int i12 = 0;
            while (i12 < this.f15513l) {
                if (this.f15508g[i12] == null) {
                    System.out.println("WTF");
                }
                C3706b[] c3706bArr2 = this.f15508g;
                if (c3706bArr2[i12] != null && c3706bArr2[i12].f15489f) {
                    C3706b c3706b2 = c3706bArr2[i12];
                    c3706b2.f15484a.m15796e(this, c3706b2.f15485b);
                    if (f15498v) {
                        this.f15515n.f15490a.mo15780a(c3706b2);
                    } else {
                        this.f15515n.f15491b.mo15780a(c3706b2);
                    }
                    this.f15508g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f15513l;
                        if (i13 >= i10) {
                            break;
                        }
                        C3706b[] c3706bArr3 = this.f15508g;
                        int i15 = i13 - 1;
                        c3706bArr3[i15] = c3706bArr3[i13];
                        if (c3706bArr3[i15].f15484a.f15536d == i13) {
                            c3706bArr3[i15].f15484a.f15536d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f15508g[i14] = null;
                    }
                    this.f15513l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f15502a = false;
        }
    }

    /* renamed from: n */
    private void m15754n() {
        for (int i10 = 0; i10 < this.f15513l; i10++) {
            C3706b c3706b = this.f15508g[i10];
            c3706b.f15484a.f15538f = c3706b.f15485b;
        }
    }

    /* renamed from: s */
    public static C3706b m15755s(C3708d c3708d, C3713i c3713i, C3713i c3713i2, float f10) {
        return c3708d.m15775r().m15735j(c3713i, c3713i2, f10);
    }

    /* renamed from: u */
    private int m15756u(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f15513l) {
                z10 = false;
                break;
            }
            C3706b[] c3706bArr = this.f15508g;
            if (c3706bArr[i10].f15484a.f15542j != C3713i.a.UNRESTRICTED && c3706bArr[i10].f15485b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f15513l; i15++) {
                C3706b c3706b = this.f15508g[i15];
                if (c3706b.f15484a.f15542j != C3713i.a.UNRESTRICTED && !c3706b.f15489f && c3706b.f15485b < 0.0f) {
                    int i16 = 9;
                    if (f15497u) {
                        int mo15714f = c3706b.f15488e.mo15714f();
                        int i17 = 0;
                        while (i17 < mo15714f) {
                            C3713i mo15716h = c3706b.f15488e.mo15716h(i17);
                            float mo15715g = c3706b.f15488e.mo15715g(mo15716h);
                            if (mo15715g > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f11 = mo15716h.f15540h[i18] / mo15715g;
                                    if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = mo15716h.f15535c;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f11;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f15512k; i19++) {
                            C3713i c3713i = this.f15515n.f15493d[i19];
                            float mo15715g2 = c3706b.f15488e.mo15715g(c3713i);
                            if (mo15715g2 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = c3713i.f15540h[i20] / mo15715g2;
                                    if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f10 = f12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                C3706b c3706b2 = this.f15508g[i12];
                c3706b2.f15484a.f15536d = -1;
                c3706b2.m15747x(this.f15515n.f15493d[i13]);
                C3713i c3713i2 = c3706b2.f15484a;
                c3713i2.f15536d = i12;
                c3713i2.m15798g(this, c3706b2);
            } else {
                z11 = true;
            }
            if (i11 > this.f15512k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    /* renamed from: w */
    public static C3709e m15757w() {
        return null;
    }

    /* renamed from: y */
    private void m15758y() {
        int i10 = this.f15506e * 2;
        this.f15506e = i10;
        this.f15508g = (C3706b[]) Arrays.copyOf(this.f15508g, i10);
        C3707c c3707c = this.f15515n;
        c3707c.f15493d = (C3713i[]) Arrays.copyOf(c3707c.f15493d, this.f15506e);
        int i11 = this.f15506e;
        this.f15511j = new boolean[i11];
        this.f15507f = i11;
        this.f15514m = i11;
    }

    /* renamed from: A */
    void m15759A(a aVar) throws Exception {
        m15756u(aVar);
        m15750B(aVar, false);
        m15754n();
    }

    /* renamed from: D */
    public void m15760D() {
        C3707c c3707c;
        int i10 = 0;
        while (true) {
            c3707c = this.f15515n;
            C3713i[] c3713iArr = c3707c.f15493d;
            if (i10 >= c3713iArr.length) {
                break;
            }
            C3713i c3713i = c3713iArr[i10];
            if (c3713i != null) {
                c3713i.m15795d();
            }
            i10++;
        }
        c3707c.f15492c.mo15782c(this.f15516o, this.f15517p);
        this.f15517p = 0;
        Arrays.fill(this.f15515n.f15493d, (Object) null);
        HashMap<String, C3713i> hashMap = this.f15504c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f15503b = 0;
        this.f15505d.clear();
        this.f15512k = 1;
        for (int i11 = 0; i11 < this.f15513l; i11++) {
            C3706b[] c3706bArr = this.f15508g;
            if (c3706bArr[i11] != null) {
                c3706bArr[i11].f15486c = false;
            }
        }
        m15751C();
        this.f15513l = 0;
        if (f15498v) {
            this.f15518q = new b(this.f15515n);
        } else {
            this.f15518q = new C3706b(this.f15515n);
        }
    }

    /* renamed from: b */
    public void m15761b(C3860e c3860e, C3860e c3860e2, float f10, int i10) {
        C3859d.b bVar = C3859d.b.LEFT;
        C3713i m15774q = m15774q(c3860e.mo16389m(bVar));
        C3859d.b bVar2 = C3859d.b.TOP;
        C3713i m15774q2 = m15774q(c3860e.mo16389m(bVar2));
        C3859d.b bVar3 = C3859d.b.RIGHT;
        C3713i m15774q3 = m15774q(c3860e.mo16389m(bVar3));
        C3859d.b bVar4 = C3859d.b.BOTTOM;
        C3713i m15774q4 = m15774q(c3860e.mo16389m(bVar4));
        C3713i m15774q5 = m15774q(c3860e2.mo16389m(bVar));
        C3713i m15774q6 = m15774q(c3860e2.mo16389m(bVar2));
        C3713i m15774q7 = m15774q(c3860e2.mo16389m(bVar3));
        C3713i m15774q8 = m15774q(c3860e2.mo16389m(bVar4));
        C3706b m15775r = m15775r();
        double d10 = f10;
        double d11 = i10;
        m15775r.m15742q(m15774q2, m15774q4, m15774q6, m15774q8, (float) (Math.sin(d10) * d11));
        m15763d(m15775r);
        C3706b m15775r2 = m15775r();
        m15775r2.m15742q(m15774q, m15774q3, m15774q5, m15774q7, (float) (Math.cos(d10) * d11));
        m15763d(m15775r2);
    }

    /* renamed from: c */
    public void m15762c(C3713i c3713i, C3713i c3713i2, int i10, float f10, C3713i c3713i3, C3713i c3713i4, int i11, int i12) {
        C3706b m15775r = m15775r();
        m15775r.m15733h(c3713i, c3713i2, i10, f10, c3713i3, c3713i4, i11);
        if (i12 != 8) {
            m15775r.m15729d(this, i12);
        }
        m15763d(m15775r);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15763d(p134k0.C3706b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f15513l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f15514m
            if (r0 >= r2) goto L12
            int r0 = r5.f15512k
            int r0 = r0 + r1
            int r2 = r5.f15507f
            if (r0 < r2) goto L15
        L12:
            r5.m15758y()
        L15:
            r0 = 0
            boolean r2 = r6.f15489f
            if (r2 != 0) goto L84
            r6.m15725D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.m15743r()
            boolean r2 = r6.m15731f(r5)
            if (r2 == 0) goto L7b
            k0.i r2 = r5.m15773p()
            r6.f15484a = r2
            int r3 = r5.f15513l
            r5.m15753l(r6)
            int r4 = r5.f15513l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            k0.d$a r0 = r5.f15518q
            r0.mo15727b(r6)
            k0.d$a r0 = r5.f15518q
            r5.m15750B(r0, r1)
            int r0 = r2.f15536d
            r3 = -1
            if (r0 != r3) goto L7c
            k0.i r0 = r6.f15484a
            if (r0 != r2) goto L59
            k0.i r0 = r6.m15746v(r2)
            if (r0 == 0) goto L59
            r6.m15747x(r0)
        L59:
            boolean r0 = r6.f15489f
            if (r0 != 0) goto L62
            k0.i r0 = r6.f15484a
            r0.m15798g(r5, r6)
        L62:
            boolean r0 = p134k0.C3708d.f15498v
            if (r0 == 0) goto L6e
            k0.c r0 = r5.f15515n
            k0.f<k0.b> r0 = r0.f15490a
            r0.mo15780a(r6)
            goto L75
        L6e:
            k0.c r0 = r5.f15515n
            k0.f<k0.b> r0 = r0.f15491b
            r0.mo15780a(r6)
        L75:
            int r0 = r5.f15513l
            int r0 = r0 - r1
            r5.f15513l = r0
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r0 = r6.m15744s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.m15753l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p134k0.C3708d.m15763d(k0.b):void");
    }

    /* renamed from: e */
    public C3706b m15764e(C3713i c3713i, C3713i c3713i2, int i10, int i11) {
        if (f15495s && i11 == 8 && c3713i2.f15539g && c3713i.f15536d == -1) {
            c3713i.m15796e(this, c3713i2.f15538f + i10);
            return null;
        }
        C3706b m15775r = m15775r();
        m15775r.m15739n(c3713i, c3713i2, i10);
        if (i11 != 8) {
            m15775r.m15729d(this, i11);
        }
        m15763d(m15775r);
        return m15775r;
    }

    /* renamed from: f */
    public void m15765f(C3713i c3713i, int i10) {
        if (f15495s && c3713i.f15536d == -1) {
            float f10 = i10;
            c3713i.m15796e(this, f10);
            for (int i11 = 0; i11 < this.f15503b + 1; i11++) {
                C3713i c3713i2 = this.f15515n.f15493d[i11];
                if (c3713i2 != null && c3713i2.f15546n && c3713i2.f15547o == c3713i.f15535c) {
                    c3713i2.m15796e(this, c3713i2.f15548p + f10);
                }
            }
            return;
        }
        int i12 = c3713i.f15536d;
        if (i12 != -1) {
            C3706b c3706b = this.f15508g[i12];
            if (c3706b.f15489f) {
                c3706b.f15485b = i10;
                return;
            }
            if (c3706b.f15488e.mo15714f() == 0) {
                c3706b.f15489f = true;
                c3706b.f15485b = i10;
                return;
            } else {
                C3706b m15775r = m15775r();
                m15775r.m15738m(c3713i, i10);
                m15763d(m15775r);
                return;
            }
        }
        C3706b m15775r2 = m15775r();
        m15775r2.m15734i(c3713i, i10);
        m15763d(m15775r2);
    }

    /* renamed from: g */
    public void m15766g(C3713i c3713i, C3713i c3713i2, int i10, boolean z10) {
        C3706b m15775r = m15775r();
        C3713i m15776t = m15776t();
        m15776t.f15537e = 0;
        m15775r.m15740o(c3713i, c3713i2, m15776t, i10);
        m15763d(m15775r);
    }

    /* renamed from: h */
    public void m15767h(C3713i c3713i, C3713i c3713i2, int i10, int i11) {
        C3706b m15775r = m15775r();
        C3713i m15776t = m15776t();
        m15776t.f15537e = 0;
        m15775r.m15740o(c3713i, c3713i2, m15776t, i10);
        if (i11 != 8) {
            m15771m(m15775r, (int) (m15775r.f15488e.mo15715g(m15776t) * (-1.0f)), i11);
        }
        m15763d(m15775r);
    }

    /* renamed from: i */
    public void m15768i(C3713i c3713i, C3713i c3713i2, int i10, boolean z10) {
        C3706b m15775r = m15775r();
        C3713i m15776t = m15776t();
        m15776t.f15537e = 0;
        m15775r.m15741p(c3713i, c3713i2, m15776t, i10);
        m15763d(m15775r);
    }

    /* renamed from: j */
    public void m15769j(C3713i c3713i, C3713i c3713i2, int i10, int i11) {
        C3706b m15775r = m15775r();
        C3713i m15776t = m15776t();
        m15776t.f15537e = 0;
        m15775r.m15741p(c3713i, c3713i2, m15776t, i10);
        if (i11 != 8) {
            m15771m(m15775r, (int) (m15775r.f15488e.mo15715g(m15776t) * (-1.0f)), i11);
        }
        m15763d(m15775r);
    }

    /* renamed from: k */
    public void m15770k(C3713i c3713i, C3713i c3713i2, C3713i c3713i3, C3713i c3713i4, float f10, int i10) {
        C3706b m15775r = m15775r();
        m15775r.m15736k(c3713i, c3713i2, c3713i3, c3713i4, f10);
        if (i10 != 8) {
            m15775r.m15729d(this, i10);
        }
        m15763d(m15775r);
    }

    /* renamed from: m */
    void m15771m(C3706b c3706b, int i10, int i11) {
        c3706b.m15730e(m15772o(i11, null), i10);
    }

    /* renamed from: o */
    public C3713i m15772o(int i10, String str) {
        if (this.f15512k + 1 >= this.f15507f) {
            m15758y();
        }
        C3713i m15752a = m15752a(C3713i.a.ERROR, str);
        int i11 = this.f15503b + 1;
        this.f15503b = i11;
        this.f15512k++;
        m15752a.f15535c = i11;
        m15752a.f15537e = i10;
        this.f15515n.f15493d[i11] = m15752a;
        this.f15505d.mo15728c(m15752a);
        return m15752a;
    }

    /* renamed from: p */
    public C3713i m15773p() {
        if (this.f15512k + 1 >= this.f15507f) {
            m15758y();
        }
        C3713i m15752a = m15752a(C3713i.a.SLACK, null);
        int i10 = this.f15503b + 1;
        this.f15503b = i10;
        this.f15512k++;
        m15752a.f15535c = i10;
        this.f15515n.f15493d[i10] = m15752a;
        return m15752a;
    }

    /* renamed from: q */
    public C3713i m15774q(Object obj) {
        C3713i c3713i = null;
        if (obj == null) {
            return null;
        }
        if (this.f15512k + 1 >= this.f15507f) {
            m15758y();
        }
        if (obj instanceof C3859d) {
            C3859d c3859d = (C3859d) obj;
            c3713i = c3859d.m16308h();
            if (c3713i == null) {
                c3859d.m16318r(this.f15515n);
                c3713i = c3859d.m16308h();
            }
            int i10 = c3713i.f15535c;
            if (i10 == -1 || i10 > this.f15503b || this.f15515n.f15493d[i10] == null) {
                if (i10 != -1) {
                    c3713i.m15795d();
                }
                int i11 = this.f15503b + 1;
                this.f15503b = i11;
                this.f15512k++;
                c3713i.f15535c = i11;
                c3713i.f15542j = C3713i.a.UNRESTRICTED;
                this.f15515n.f15493d[i11] = c3713i;
            }
        }
        return c3713i;
    }

    /* renamed from: r */
    public C3706b m15775r() {
        C3706b mo15781b;
        if (f15498v) {
            mo15781b = this.f15515n.f15490a.mo15781b();
            if (mo15781b == null) {
                mo15781b = new b(this.f15515n);
                f15501y++;
            } else {
                mo15781b.m15748y();
            }
        } else {
            mo15781b = this.f15515n.f15491b.mo15781b();
            if (mo15781b == null) {
                mo15781b = new C3706b(this.f15515n);
                f15500x++;
            } else {
                mo15781b.m15748y();
            }
        }
        C3713i.m15792b();
        return mo15781b;
    }

    /* renamed from: t */
    public C3713i m15776t() {
        if (this.f15512k + 1 >= this.f15507f) {
            m15758y();
        }
        C3713i m15752a = m15752a(C3713i.a.SLACK, null);
        int i10 = this.f15503b + 1;
        this.f15503b = i10;
        this.f15512k++;
        m15752a.f15535c = i10;
        this.f15515n.f15493d[i10] = m15752a;
        return m15752a;
    }

    /* renamed from: v */
    public C3707c m15777v() {
        return this.f15515n;
    }

    /* renamed from: x */
    public int m15778x(Object obj) {
        C3713i m16308h = ((C3859d) obj).m16308h();
        if (m16308h != null) {
            return (int) (m16308h.f15538f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m15779z() throws Exception {
        if (this.f15505d.isEmpty()) {
            m15754n();
            return;
        }
        if (!this.f15509h && !this.f15510i) {
            m15759A(this.f15505d);
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f15513l) {
                z10 = true;
                break;
            } else if (!this.f15508g[i10].f15489f) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            m15759A(this.f15505d);
        } else {
            m15754n();
        }
    }
}
