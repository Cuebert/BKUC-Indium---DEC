package p158m0;

import java.util.ArrayList;
import p134k0.C3708d;
import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.C3861f;
import p147l0.C3862g;
import p147l0.C3865j;
import p147l0.C3866k;
import p147l0.InterfaceC3863h;

/* renamed from: m0.b */
/* loaded from: classes.dex */
public class C3914b {

    /* renamed from: a */
    private final ArrayList<C3860e> f16220a = new ArrayList<>();

    /* renamed from: b */
    private a f16221b = new a();

    /* renamed from: c */
    private C3861f f16222c;

    /* renamed from: m0.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k */
        public static int f16223k = 0;

        /* renamed from: l */
        public static int f16224l = 1;

        /* renamed from: m */
        public static int f16225m = 2;

        /* renamed from: a */
        public C3860e.b f16226a;

        /* renamed from: b */
        public C3860e.b f16227b;

        /* renamed from: c */
        public int f16228c;

        /* renamed from: d */
        public int f16229d;

        /* renamed from: e */
        public int f16230e;

        /* renamed from: f */
        public int f16231f;

        /* renamed from: g */
        public int f16232g;

        /* renamed from: h */
        public boolean f16233h;

        /* renamed from: i */
        public boolean f16234i;

        /* renamed from: j */
        public int f16235j;
    }

    /* renamed from: m0.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2551a();

        /* renamed from: b */
        void mo2552b(C3860e c3860e, a aVar);
    }

    public C3914b(C3861f c3861f) {
        this.f16222c = c3861f;
    }

    /* renamed from: a */
    private boolean m16593a(b bVar, C3860e c3860e, int i10) {
        this.f16221b.f16226a = c3860e.m16413y();
        this.f16221b.f16227b = c3860e.m16351O();
        this.f16221b.f16228c = c3860e.m16357R();
        this.f16221b.f16229d = c3860e.m16407v();
        a aVar = this.f16221b;
        aVar.f16234i = false;
        aVar.f16235j = i10;
        C3860e.b bVar2 = aVar.f16226a;
        C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f16227b == bVar3;
        boolean z12 = z10 && c3860e.f15988W > 0.0f;
        boolean z13 = z11 && c3860e.f15988W > 0.0f;
        if (z12 && c3860e.f16026r[0] == 4) {
            aVar.f16226a = C3860e.b.FIXED;
        }
        if (z13 && c3860e.f16026r[1] == 4) {
            aVar.f16227b = C3860e.b.FIXED;
        }
        bVar.mo2552b(c3860e, aVar);
        c3860e.m16364U0(this.f16221b.f16230e);
        c3860e.m16408v0(this.f16221b.f16231f);
        c3860e.m16406u0(this.f16221b.f16233h);
        c3860e.m16386k0(this.f16221b.f16232g);
        a aVar2 = this.f16221b;
        aVar2.f16235j = a.f16223k;
        return aVar2.f16234i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.f15988W <= 0.0f) goto L126;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16594b(p147l0.C3861f r13) {
        /*
            r12 = this;
            java.util.ArrayList<l0.e> r0 = r13.f16103D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m16423B1(r1)
            m0.b$b r2 = r13.m16439r1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<l0.e> r5 = r13.f16103D0
            java.lang.Object r5 = r5.get(r4)
            l0.e r5 = (p147l0.C3860e) r5
            boolean r6 = r5 instanceof p147l0.C3862g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof p147l0.C3856a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.m16376c0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            m0.l r6 = r5.f16000e
            if (r6 == 0) goto L47
            m0.n r7 = r5.f16002f
            if (r7 == 0) goto L47
            m0.g r6 = r6.f16302e
            boolean r6 = r6.f16256j
            if (r6 == 0) goto L47
            m0.g r6 = r7.f16302e
            boolean r6 = r6.f16256j
            if (r6 == 0) goto L47
            goto La0
        L47:
            l0.e$b r6 = r5.m16401s(r3)
            r7 = 1
            l0.e$b r8 = r5.m16401s(r7)
            l0.e$b r9 = p147l0.C3860e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f16022p
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f16024q
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m16423B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof p147l0.C3866k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f16022p
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m16372Z()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f16024q
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m16372Z()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f15988W
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = p158m0.C3914b.a.f16223k
            r12.m16593a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.mo2551a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m0.C3914b.m16594b(l0.f):void");
    }

    /* renamed from: c */
    private void m16595c(C3861f c3861f, String str, int i10, int i11) {
        int m16335G = c3861f.m16335G();
        int m16333F = c3861f.m16333F();
        c3861f.m16344K0(0);
        c3861f.m16342J0(0);
        c3861f.m16364U0(i10);
        c3861f.m16408v0(i11);
        c3861f.m16344K0(m16335G);
        c3861f.m16342J0(m16333F);
        this.f16222c.mo16429b1();
    }

    /* renamed from: d */
    public long m16596d(C3861f c3861f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        int i20;
        C3861f c3861f2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i21;
        boolean z14;
        int i22;
        boolean z15;
        b m16439r1 = c3861f.m16439r1();
        int size = c3861f.f16103D0.size();
        int m16357R = c3861f.m16357R();
        int m16407v = c3861f.m16407v();
        boolean m16464b = C3865j.m16464b(i10, 128);
        boolean z16 = m16464b || C3865j.m16464b(i10, 64);
        if (z16) {
            for (int i23 = 0; i23 < size; i23++) {
                C3860e c3860e = c3861f.f16103D0.get(i23);
                C3860e.b m16413y = c3860e.m16413y();
                C3860e.b bVar = C3860e.b.MATCH_CONSTRAINT;
                boolean z17 = (m16413y == bVar) && (c3860e.m16351O() == bVar) && c3860e.m16403t() > 0.0f;
                if ((c3860e.m16372Z() && z17) || ((c3860e.m16375b0() && z17) || (c3860e instanceof C3866k) || c3860e.m16372Z() || c3860e.m16375b0())) {
                    z16 = false;
                    break;
                }
            }
        }
        if (z16) {
            boolean z18 = C3708d.f15494r;
        }
        boolean z19 = z16 & ((i13 == 1073741824 && i15 == 1073741824) || m16464b);
        if (z19) {
            int min = Math.min(c3861f.m16331E(), i14);
            int min2 = Math.min(c3861f.m16329D(), i16);
            if (i13 == 1073741824 && c3861f.m16357R() != min) {
                c3861f.m16364U0(min);
                c3861f.m16442u1();
            }
            if (i15 == 1073741824 && c3861f.m16407v() != min2) {
                c3861f.m16408v0(min2);
                c3861f.m16442u1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = c3861f.m16436o1(m16464b);
                i19 = 2;
            } else {
                boolean m16437p1 = c3861f.m16437p1(m16464b);
                if (i13 == 1073741824) {
                    m16437p1 &= c3861f.m16438q1(m16464b, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = c3861f.m16438q1(m16464b, 1) & m16437p1;
                    i19++;
                } else {
                    z10 = m16437p1;
                }
            }
            if (z10) {
                c3861f.mo16371Y0(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int m16440s1 = c3861f.m16440s1();
        if (size > 0) {
            m16594b(c3861f);
        }
        m16597e(c3861f);
        int size2 = this.f16220a.size();
        if (size > 0) {
            m16595c(c3861f, "First pass", m16357R, m16407v);
        }
        if (size2 > 0) {
            C3860e.b m16413y2 = c3861f.m16413y();
            C3860e.b bVar2 = C3860e.b.WRAP_CONTENT;
            boolean z20 = m16413y2 == bVar2;
            boolean z21 = c3861f.m16351O() == bVar2;
            int max = Math.max(c3861f.m16357R(), this.f16222c.m16335G());
            int max2 = Math.max(c3861f.m16407v(), this.f16222c.m16333F());
            int i24 = 0;
            boolean z22 = false;
            while (i24 < size2) {
                C3860e c3860e2 = this.f16220a.get(i24);
                if (c3860e2 instanceof C3866k) {
                    int m16357R2 = c3860e2.m16357R();
                    i22 = m16440s1;
                    int m16407v2 = c3860e2.m16407v();
                    boolean m16593a = m16593a(m16439r1, c3860e2, a.f16224l) | z22;
                    int m16357R3 = c3860e2.m16357R();
                    int m16407v3 = c3860e2.m16407v();
                    if (m16357R3 != m16357R2) {
                        c3860e2.m16364U0(m16357R3);
                        if (z20 && c3860e2.m16343K() > max) {
                            max = Math.max(max, c3860e2.m16343K() + c3860e2.mo16389m(C3859d.b.RIGHT).m16305e());
                        }
                        z15 = true;
                    } else {
                        z15 = m16593a;
                    }
                    if (m16407v3 != m16407v2) {
                        c3860e2.m16408v0(m16407v3);
                        if (z21 && c3860e2.m16395p() > max2) {
                            max2 = Math.max(max2, c3860e2.m16395p() + c3860e2.mo16389m(C3859d.b.BOTTOM).m16305e());
                        }
                        z15 = true;
                    }
                    z22 = z15 | ((C3866k) c3860e2).m16466d1();
                } else {
                    i22 = m16440s1;
                }
                i24++;
                m16440s1 = i22;
            }
            i20 = m16440s1;
            int i25 = 0;
            int i26 = 2;
            while (i25 < i26) {
                int i27 = 0;
                while (i27 < size2) {
                    C3860e c3860e3 = this.f16220a.get(i27);
                    if (((c3860e3 instanceof InterfaceC3863h) && !(c3860e3 instanceof C3866k)) || (c3860e3 instanceof C3862g) || c3860e3.m16355Q() == 8 || ((z19 && c3860e3.f16000e.f16302e.f16256j && c3860e3.f16002f.f16302e.f16256j) || (c3860e3 instanceof C3866k))) {
                        z13 = z19;
                        i21 = size2;
                    } else {
                        int m16357R4 = c3860e3.m16357R();
                        int m16407v4 = c3860e3.m16407v();
                        z13 = z19;
                        int m16391n = c3860e3.m16391n();
                        int i28 = a.f16224l;
                        i21 = size2;
                        if (i25 == 1) {
                            i28 = a.f16225m;
                        }
                        boolean m16593a2 = m16593a(m16439r1, c3860e3, i28) | z22;
                        int m16357R5 = c3860e3.m16357R();
                        int m16407v5 = c3860e3.m16407v();
                        if (m16357R5 != m16357R4) {
                            c3860e3.m16364U0(m16357R5);
                            if (z20 && c3860e3.m16343K() > max) {
                                max = Math.max(max, c3860e3.m16343K() + c3860e3.mo16389m(C3859d.b.RIGHT).m16305e());
                            }
                            z14 = true;
                        } else {
                            z14 = m16593a2;
                        }
                        if (m16407v5 != m16407v4) {
                            c3860e3.m16408v0(m16407v5);
                            if (z21 && c3860e3.m16395p() > max2) {
                                max2 = Math.max(max2, c3860e3.m16395p() + c3860e3.mo16389m(C3859d.b.BOTTOM).m16305e());
                            }
                            z14 = true;
                        }
                        z22 = (!c3860e3.m16363U() || m16391n == c3860e3.m16391n()) ? z14 : true;
                    }
                    i27++;
                    size2 = i21;
                    z19 = z13;
                }
                boolean z23 = z19;
                int i29 = size2;
                if (!z22) {
                    break;
                }
                m16595c(c3861f, "intermediate pass", m16357R, m16407v);
                i25++;
                size2 = i29;
                z19 = z23;
                i26 = 2;
                z22 = false;
            }
            c3861f2 = c3861f;
            if (z22) {
                m16595c(c3861f2, "2nd pass", m16357R, m16407v);
                if (c3861f.m16357R() < max) {
                    c3861f2.m16364U0(max);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c3861f.m16407v() < max2) {
                    c3861f2.m16408v0(max2);
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    m16595c(c3861f2, "3rd pass", m16357R, m16407v);
                }
            }
        } else {
            i20 = m16440s1;
            c3861f2 = c3861f;
        }
        c3861f2.m16425E1(i20);
        return 0L;
    }

    /* renamed from: e */
    public void m16597e(C3861f c3861f) {
        this.f16220a.clear();
        int size = c3861f.f16103D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3860e c3860e = c3861f.f16103D0.get(i10);
            C3860e.b m16413y = c3860e.m16413y();
            C3860e.b bVar = C3860e.b.MATCH_CONSTRAINT;
            if (m16413y == bVar || c3860e.m16351O() == bVar) {
                this.f16220a.add(c3860e);
            }
        }
        c3861f.m16442u1();
    }
}
