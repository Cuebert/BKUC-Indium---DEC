package p147l0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p134k0.C3708d;
import p134k0.C3713i;
import p147l0.C3860e;
import p158m0.C3914b;
import p158m0.C3917e;
import p158m0.C3920h;
import p158m0.C3921i;

/* renamed from: l0.f */
/* loaded from: classes.dex */
public class C3861f extends C3867l {

    /* renamed from: J0 */
    int f16056J0;

    /* renamed from: K0 */
    int f16057K0;

    /* renamed from: L0 */
    int f16058L0;

    /* renamed from: M0 */
    int f16059M0;

    /* renamed from: E0 */
    C3914b f16051E0 = new C3914b(this);

    /* renamed from: F0 */
    public C3917e f16052F0 = new C3917e(this);

    /* renamed from: G0 */
    protected C3914b.b f16053G0 = null;

    /* renamed from: H0 */
    private boolean f16054H0 = false;

    /* renamed from: I0 */
    protected C3708d f16055I0 = new C3708d();

    /* renamed from: N0 */
    public int f16060N0 = 0;

    /* renamed from: O0 */
    public int f16061O0 = 0;

    /* renamed from: P0 */
    C3858c[] f16062P0 = new C3858c[4];

    /* renamed from: Q0 */
    C3858c[] f16063Q0 = new C3858c[4];

    /* renamed from: R0 */
    public boolean f16064R0 = false;

    /* renamed from: S0 */
    public boolean f16065S0 = false;

    /* renamed from: T0 */
    public boolean f16066T0 = false;

    /* renamed from: U0 */
    public int f16067U0 = 0;

    /* renamed from: V0 */
    public int f16068V0 = 0;

    /* renamed from: W0 */
    private int f16069W0 = 257;

    /* renamed from: X0 */
    public boolean f16070X0 = false;

    /* renamed from: Y0 */
    private boolean f16071Y0 = false;

    /* renamed from: Z0 */
    private boolean f16072Z0 = false;

    /* renamed from: a1 */
    int f16073a1 = 0;

    /* renamed from: b1 */
    private WeakReference<C3859d> f16074b1 = null;

    /* renamed from: c1 */
    private WeakReference<C3859d> f16075c1 = null;

    /* renamed from: d1 */
    private WeakReference<C3859d> f16076d1 = null;

    /* renamed from: e1 */
    private WeakReference<C3859d> f16077e1 = null;

    /* renamed from: f1 */
    public C3914b.a f16078f1 = new C3914b.a();

    /* renamed from: A1 */
    public static boolean m16417A1(C3860e c3860e, C3914b.b bVar, C3914b.a aVar, int i10) {
        int i11;
        int i12;
        if (bVar == null) {
            return false;
        }
        aVar.f16226a = c3860e.m16413y();
        aVar.f16227b = c3860e.m16351O();
        aVar.f16228c = c3860e.m16357R();
        aVar.f16229d = c3860e.m16407v();
        aVar.f16234i = false;
        aVar.f16235j = i10;
        C3860e.b bVar2 = aVar.f16226a;
        C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f16227b == bVar3;
        boolean z12 = z10 && c3860e.f15988W > 0.0f;
        boolean z13 = z11 && c3860e.f15988W > 0.0f;
        if (z10 && c3860e.m16365V(0) && c3860e.f16022p == 0 && !z12) {
            aVar.f16226a = C3860e.b.WRAP_CONTENT;
            if (z11 && c3860e.f16024q == 0) {
                aVar.f16226a = C3860e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c3860e.m16365V(1) && c3860e.f16024q == 0 && !z13) {
            aVar.f16227b = C3860e.b.WRAP_CONTENT;
            if (z10 && c3860e.f16022p == 0) {
                aVar.f16227b = C3860e.b.FIXED;
            }
            z11 = false;
        }
        if (c3860e.mo16285e0()) {
            aVar.f16226a = C3860e.b.FIXED;
            z10 = false;
        }
        if (c3860e.mo16287f0()) {
            aVar.f16227b = C3860e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (c3860e.f16026r[0] == 4) {
                aVar.f16226a = C3860e.b.FIXED;
            } else if (!z11) {
                C3860e.b bVar4 = aVar.f16227b;
                C3860e.b bVar5 = C3860e.b.FIXED;
                if (bVar4 == bVar5) {
                    i12 = aVar.f16229d;
                } else {
                    aVar.f16226a = C3860e.b.WRAP_CONTENT;
                    bVar.mo2552b(c3860e, aVar);
                    i12 = aVar.f16231f;
                }
                aVar.f16226a = bVar5;
                int i13 = c3860e.f15989X;
                if (i13 != 0 && i13 != -1) {
                    aVar.f16228c = (int) (c3860e.m16403t() / i12);
                } else {
                    aVar.f16228c = (int) (c3860e.m16403t() * i12);
                }
            }
        }
        if (z13) {
            if (c3860e.f16026r[1] == 4) {
                aVar.f16227b = C3860e.b.FIXED;
            } else if (!z10) {
                C3860e.b bVar6 = aVar.f16226a;
                C3860e.b bVar7 = C3860e.b.FIXED;
                if (bVar6 == bVar7) {
                    i11 = aVar.f16228c;
                } else {
                    aVar.f16227b = C3860e.b.WRAP_CONTENT;
                    bVar.mo2552b(c3860e, aVar);
                    i11 = aVar.f16230e;
                }
                aVar.f16227b = bVar7;
                int i14 = c3860e.f15989X;
                if (i14 != 0 && i14 != -1) {
                    aVar.f16229d = (int) (i11 * c3860e.m16403t());
                } else {
                    aVar.f16229d = (int) (i11 / c3860e.m16403t());
                }
            }
        }
        bVar.mo2552b(c3860e, aVar);
        c3860e.m16364U0(aVar.f16230e);
        c3860e.m16408v0(aVar.f16231f);
        c3860e.m16406u0(aVar.f16233h);
        c3860e.m16386k0(aVar.f16232g);
        aVar.f16235j = C3914b.a.f16223k;
        return aVar.f16234i;
    }

    /* renamed from: C1 */
    private void m16418C1() {
        this.f16060N0 = 0;
        this.f16061O0 = 0;
    }

    /* renamed from: g1 */
    private void m16419g1(C3860e c3860e) {
        int i10 = this.f16060N0 + 1;
        C3858c[] c3858cArr = this.f16063Q0;
        if (i10 >= c3858cArr.length) {
            this.f16063Q0 = (C3858c[]) Arrays.copyOf(c3858cArr, c3858cArr.length * 2);
        }
        this.f16063Q0[this.f16060N0] = new C3858c(c3860e, 0, m16445x1());
        this.f16060N0++;
    }

    /* renamed from: j1 */
    private void m16420j1(C3859d c3859d, C3713i c3713i) {
        this.f16055I0.m15767h(c3713i, this.f16055I0.m15774q(c3859d), 0, 5);
    }

    /* renamed from: k1 */
    private void m16421k1(C3859d c3859d, C3713i c3713i) {
        this.f16055I0.m15767h(this.f16055I0.m15774q(c3859d), c3713i, 0, 5);
    }

    /* renamed from: l1 */
    private void m16422l1(C3860e c3860e) {
        int i10 = this.f16061O0 + 1;
        C3858c[] c3858cArr = this.f16062P0;
        if (i10 >= c3858cArr.length) {
            this.f16062P0 = (C3858c[]) Arrays.copyOf(c3858cArr, c3858cArr.length * 2);
        }
        this.f16062P0[this.f16061O0] = new C3858c(c3860e, 1, m16445x1());
        this.f16061O0++;
    }

    /* renamed from: B1 */
    public boolean m16423B1(int i10) {
        return (this.f16069W0 & i10) == i10;
    }

    /* renamed from: D1 */
    public void m16424D1(C3914b.b bVar) {
        this.f16053G0 = bVar;
        this.f16052F0.m16620n(bVar);
    }

    /* renamed from: E1 */
    public void m16425E1(int i10) {
        this.f16069W0 = i10;
        C3708d.f15494r = m16423B1(512);
    }

    /* renamed from: F1 */
    public void m16426F1(boolean z10) {
        this.f16054H0 = z10;
    }

    /* renamed from: G1 */
    public void m16427G1(C3708d c3708d, boolean[] zArr) {
        zArr[2] = false;
        boolean m16423B1 = m16423B1(64);
        mo16373Z0(c3708d, m16423B1);
        int size = this.f16103D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16103D0.get(i10).mo16373Z0(c3708d, m16423B1);
        }
    }

    /* renamed from: H1 */
    public void m16428H1() {
        this.f16051E0.m16597e(this);
    }

    @Override // p147l0.C3860e
    /* renamed from: Y0 */
    public void mo16371Y0(boolean z10, boolean z11) {
        super.mo16371Y0(z10, z11);
        int size = this.f16103D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16103D0.get(i10).mo16371Y0(z10, z11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // p147l0.C3867l
    /* renamed from: b1 */
    public void mo16429b1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ?? r62;
        boolean z12;
        C3860e.b bVar;
        this.f15990Y = 0;
        this.f15991Z = 0;
        this.f16071Y0 = false;
        this.f16072Z0 = false;
        int size = this.f16103D0.size();
        int max = Math.max(0, m16357R());
        int max2 = Math.max(0, m16407v());
        C3860e.b[] bVarArr = this.f15984S;
        C3860e.b bVar2 = bVarArr[1];
        C3860e.b bVar3 = bVarArr[0];
        if (C3865j.m16464b(this.f16069W0, 1)) {
            C3920h.m16631h(this, m16439r1());
            for (int i12 = 0; i12 < size; i12++) {
                C3860e c3860e = this.f16103D0.get(i12);
                if (c3860e.m16377d0() && !(c3860e instanceof C3862g) && !(c3860e instanceof C3856a) && !(c3860e instanceof C3866k) && !c3860e.m16376c0()) {
                    C3860e.b m16401s = c3860e.m16401s(0);
                    C3860e.b m16401s2 = c3860e.m16401s(1);
                    C3860e.b bVar4 = C3860e.b.MATCH_CONSTRAINT;
                    if (!(m16401s == bVar4 && c3860e.f16022p != 1 && m16401s2 == bVar4 && c3860e.f16024q != 1)) {
                        m16417A1(c3860e, this.f16053G0, new C3914b.a(), C3914b.a.f16223k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = C3860e.b.WRAP_CONTENT) || bVar2 == bVar) && C3865j.m16464b(this.f16069W0, 1024) && C3921i.m16635c(this, m16439r1()))) {
            i10 = max2;
            i11 = max;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (max < m16357R() && max > 0) {
                    m16364U0(max);
                    this.f16071Y0 = true;
                } else {
                    max = m16357R();
                }
            }
            if (bVar2 == bVar) {
                if (max2 < m16407v() && max2 > 0) {
                    m16408v0(max2);
                    this.f16072Z0 = true;
                } else {
                    max2 = m16407v();
                }
            }
            i10 = max2;
            i11 = max;
            z10 = true;
        }
        boolean z13 = m16423B1(64) || m16423B1(128);
        C3708d c3708d = this.f16055I0;
        c3708d.f15509h = false;
        c3708d.f15510i = false;
        if (this.f16069W0 != 0 && z13) {
            c3708d.f15510i = true;
        }
        ArrayList<C3860e> arrayList = this.f16103D0;
        C3860e.b m16413y = m16413y();
        C3860e.b bVar5 = C3860e.b.WRAP_CONTENT;
        boolean z14 = m16413y == bVar5 || m16351O() == bVar5;
        m16418C1();
        for (int i13 = 0; i13 < size; i13++) {
            C3860e c3860e2 = this.f16103D0.get(i13);
            if (c3860e2 instanceof C3867l) {
                ((C3867l) c3860e2).mo16429b1();
            }
        }
        boolean m16423B1 = m16423B1(64);
        boolean z15 = z10;
        int i14 = 0;
        boolean z16 = true;
        while (z16) {
            int i15 = i14 + 1;
            try {
                this.f16055I0.m15760D();
                m16418C1();
                m16385k(this.f16055I0);
                for (int i16 = 0; i16 < size; i16++) {
                    this.f16103D0.get(i16).m16385k(this.f16055I0);
                }
                z16 = m16431f1(this.f16055I0);
                WeakReference<C3859d> weakReference = this.f16074b1;
                if (weakReference != null && weakReference.get() != null) {
                    m16421k1(this.f16074b1.get(), this.f16055I0.m15774q(this.f15974I));
                    this.f16074b1 = null;
                }
                WeakReference<C3859d> weakReference2 = this.f16076d1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m16420j1(this.f16076d1.get(), this.f16055I0.m15774q(this.f15976K));
                    this.f16076d1 = null;
                }
                WeakReference<C3859d> weakReference3 = this.f16075c1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m16421k1(this.f16075c1.get(), this.f16055I0.m15774q(this.f15973H));
                    this.f16075c1 = null;
                }
                WeakReference<C3859d> weakReference4 = this.f16077e1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m16420j1(this.f16077e1.get(), this.f16055I0.m15774q(this.f15975J));
                    this.f16077e1 = null;
                }
                if (z16) {
                    this.f16055I0.m15779z();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            if (z16) {
                m16427G1(this.f16055I0, C3865j.f16089a);
            } else {
                mo16373Z0(this.f16055I0, m16423B1);
                for (int i17 = 0; i17 < size; i17++) {
                    this.f16103D0.get(i17).mo16373Z0(this.f16055I0, m16423B1);
                }
            }
            if (z14 && i15 < 8 && C3865j.f16089a[2]) {
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < size; i20++) {
                    C3860e c3860e3 = this.f16103D0.get(i20);
                    i18 = Math.max(i18, c3860e3.f15990Y + c3860e3.m16357R());
                    i19 = Math.max(i19, c3860e3.f15991Z + c3860e3.m16407v());
                }
                int max3 = Math.max(this.f16003f0, i18);
                int max4 = Math.max(this.f16005g0, i19);
                C3860e.b bVar6 = C3860e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || m16357R() >= max3) {
                    z11 = false;
                } else {
                    m16364U0(max3);
                    this.f15984S[0] = bVar6;
                    z11 = true;
                    z15 = true;
                }
                if (bVar2 == bVar6 && m16407v() < max4) {
                    m16408v0(max4);
                    this.f15984S[1] = bVar6;
                    z11 = true;
                    z15 = true;
                }
            } else {
                z11 = false;
            }
            int max5 = Math.max(this.f16003f0, m16357R());
            if (max5 > m16357R()) {
                m16364U0(max5);
                this.f15984S[0] = C3860e.b.FIXED;
                z11 = true;
                z15 = true;
            }
            int max6 = Math.max(this.f16005g0, m16407v());
            if (max6 > m16407v()) {
                m16408v0(max6);
                r62 = 1;
                this.f15984S[1] = C3860e.b.FIXED;
                z11 = true;
                z12 = true;
            } else {
                r62 = 1;
                z12 = z15;
            }
            if (!z12) {
                C3860e.b bVar7 = this.f15984S[0];
                C3860e.b bVar8 = C3860e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i11 > 0 && m16357R() > i11) {
                    this.f16071Y0 = r62;
                    this.f15984S[0] = C3860e.b.FIXED;
                    m16364U0(i11);
                    z11 = true;
                    z12 = true;
                }
                if (this.f15984S[r62] == bVar8 && i10 > 0 && m16407v() > i10) {
                    this.f16072Z0 = r62;
                    this.f15984S[r62] = C3860e.b.FIXED;
                    m16408v0(i10);
                    z15 = true;
                    z16 = true;
                    i14 = i15;
                }
            }
            z16 = z11;
            z15 = z12;
            i14 = i15;
        }
        this.f16103D0 = arrayList;
        if (z15) {
            C3860e.b[] bVarArr2 = this.f15984S;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        mo16384j0(this.f16055I0.m15777v());
    }

    /* renamed from: e1 */
    public void m16430e1(C3860e c3860e, int i10) {
        if (i10 == 0) {
            m16419g1(c3860e);
        } else if (i10 == 1) {
            m16422l1(c3860e);
        }
    }

    /* renamed from: f1 */
    public boolean m16431f1(C3708d c3708d) {
        boolean m16423B1 = m16423B1(64);
        mo16289g(c3708d, m16423B1);
        int size = this.f16103D0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3860e c3860e = this.f16103D0.get(i10);
            c3860e.m16328C0(0, false);
            c3860e.m16328C0(1, false);
            if (c3860e instanceof C3856a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C3860e c3860e2 = this.f16103D0.get(i11);
                if (c3860e2 instanceof C3856a) {
                    ((C3856a) c3860e2).m16292h1();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C3860e c3860e3 = this.f16103D0.get(i12);
            if (c3860e3.m16379f()) {
                c3860e3.mo16289g(c3708d, m16423B1);
            }
        }
        if (C3708d.f15494r) {
            HashSet<C3860e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                C3860e c3860e4 = this.f16103D0.get(i13);
                if (!c3860e4.m16379f()) {
                    hashSet.add(c3860e4);
                }
            }
            m16378e(this, c3708d, hashSet, m16413y() == C3860e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<C3860e> it = hashSet.iterator();
            while (it.hasNext()) {
                C3860e next = it.next();
                C3865j.m16463a(this, c3708d, next);
                next.mo16289g(c3708d, m16423B1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                C3860e c3860e5 = this.f16103D0.get(i14);
                if (c3860e5 instanceof C3861f) {
                    C3860e.b[] bVarArr = c3860e5.f15984S;
                    C3860e.b bVar = bVarArr[0];
                    C3860e.b bVar2 = bVarArr[1];
                    C3860e.b bVar3 = C3860e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c3860e5.m16416z0(C3860e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c3860e5.m16356Q0(C3860e.b.FIXED);
                    }
                    c3860e5.mo16289g(c3708d, m16423B1);
                    if (bVar == bVar3) {
                        c3860e5.m16416z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c3860e5.m16356Q0(bVar2);
                    }
                } else {
                    C3865j.m16463a(this, c3708d, c3860e5);
                    if (!c3860e5.m16379f()) {
                        c3860e5.mo16289g(c3708d, m16423B1);
                    }
                }
            }
        }
        if (this.f16060N0 > 0) {
            C3857b.m16297b(this, c3708d, null, 0);
        }
        if (this.f16061O0 > 0) {
            C3857b.m16297b(this, c3708d, null, 1);
        }
        return true;
    }

    @Override // p147l0.C3867l, p147l0.C3860e
    /* renamed from: h0 */
    public void mo16381h0() {
        this.f16055I0.m15760D();
        this.f16056J0 = 0;
        this.f16058L0 = 0;
        this.f16057K0 = 0;
        this.f16059M0 = 0;
        this.f16070X0 = false;
        super.mo16381h0();
    }

    /* renamed from: h1 */
    public void m16432h1(C3859d c3859d) {
        WeakReference<C3859d> weakReference = this.f16077e1;
        if (weakReference == null || weakReference.get() == null || c3859d.m16304d() > this.f16077e1.get().m16304d()) {
            this.f16077e1 = new WeakReference<>(c3859d);
        }
    }

    /* renamed from: i1 */
    public void m16433i1(C3859d c3859d) {
        WeakReference<C3859d> weakReference = this.f16075c1;
        if (weakReference == null || weakReference.get() == null || c3859d.m16304d() > this.f16075c1.get().m16304d()) {
            this.f16075c1 = new WeakReference<>(c3859d);
        }
    }

    /* renamed from: m1 */
    public void m16434m1(C3859d c3859d) {
        WeakReference<C3859d> weakReference = this.f16076d1;
        if (weakReference == null || weakReference.get() == null || c3859d.m16304d() > this.f16076d1.get().m16304d()) {
            this.f16076d1 = new WeakReference<>(c3859d);
        }
    }

    /* renamed from: n1 */
    public void m16435n1(C3859d c3859d) {
        WeakReference<C3859d> weakReference = this.f16074b1;
        if (weakReference == null || weakReference.get() == null || c3859d.m16304d() > this.f16074b1.get().m16304d()) {
            this.f16074b1 = new WeakReference<>(c3859d);
        }
    }

    /* renamed from: o1 */
    public boolean m16436o1(boolean z10) {
        return this.f16052F0.m16614f(z10);
    }

    /* renamed from: p1 */
    public boolean m16437p1(boolean z10) {
        return this.f16052F0.m16615g(z10);
    }

    /* renamed from: q1 */
    public boolean m16438q1(boolean z10, int i10) {
        return this.f16052F0.m16616h(z10, i10);
    }

    /* renamed from: r1 */
    public C3914b.b m16439r1() {
        return this.f16053G0;
    }

    /* renamed from: s1 */
    public int m16440s1() {
        return this.f16069W0;
    }

    /* renamed from: t1 */
    public C3708d m16441t1() {
        return this.f16055I0;
    }

    /* renamed from: u1 */
    public void m16442u1() {
        this.f16052F0.m16617j();
    }

    /* renamed from: v1 */
    public void m16443v1() {
        this.f16052F0.m16618k();
    }

    /* renamed from: w1 */
    public boolean m16444w1() {
        return this.f16072Z0;
    }

    /* renamed from: x1 */
    public boolean m16445x1() {
        return this.f16054H0;
    }

    /* renamed from: y1 */
    public boolean m16446y1() {
        return this.f16071Y0;
    }

    /* renamed from: z1 */
    public long m16447z1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f16056J0 = i17;
        this.f16057K0 = i18;
        return this.f16051E0.m16596d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }
}
