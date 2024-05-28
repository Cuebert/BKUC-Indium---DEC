package p147l0;

import p134k0.C3708d;
import p134k0.C3713i;
import p147l0.C3859d;
import p147l0.C3860e;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public class C3856a extends C3864i {

    /* renamed from: F0 */
    private int f15917F0 = 0;

    /* renamed from: G0 */
    private boolean f15918G0 = true;

    /* renamed from: H0 */
    private int f15919H0 = 0;

    /* renamed from: I0 */
    boolean f15920I0 = false;

    /* renamed from: c1 */
    public boolean m16283c1() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f16088E0;
            if (i13 >= i10) {
                break;
            }
            C3860e c3860e = this.f16087D0[i13];
            if ((this.f15918G0 || c3860e.mo16291h()) && ((((i11 = this.f15917F0) == 0 || i11 == 1) && !c3860e.mo16285e0()) || (((i12 = this.f15917F0) == 2 || i12 == 3) && !c3860e.mo16287f0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f16088E0; i15++) {
            C3860e c3860e2 = this.f16087D0[i15];
            if (this.f15918G0 || c3860e2.mo16291h()) {
                if (!z11) {
                    int i16 = this.f15917F0;
                    if (i16 == 0) {
                        i14 = c3860e2.mo16389m(C3859d.b.LEFT).m16304d();
                    } else if (i16 == 1) {
                        i14 = c3860e2.mo16389m(C3859d.b.RIGHT).m16304d();
                    } else if (i16 == 2) {
                        i14 = c3860e2.mo16389m(C3859d.b.TOP).m16304d();
                    } else if (i16 == 3) {
                        i14 = c3860e2.mo16389m(C3859d.b.BOTTOM).m16304d();
                    }
                    z11 = true;
                }
                int i17 = this.f15917F0;
                if (i17 == 0) {
                    i14 = Math.min(i14, c3860e2.mo16389m(C3859d.b.LEFT).m16304d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, c3860e2.mo16389m(C3859d.b.RIGHT).m16304d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, c3860e2.mo16389m(C3859d.b.TOP).m16304d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, c3860e2.mo16389m(C3859d.b.BOTTOM).m16304d());
                }
            }
        }
        int i18 = i14 + this.f15919H0;
        int i19 = this.f15917F0;
        if (i19 != 0 && i19 != 1) {
            m16402s0(i18, i18);
        } else {
            m16396p0(i18, i18);
        }
        this.f15920I0 = true;
        return true;
    }

    /* renamed from: d1 */
    public boolean m16284d1() {
        return this.f15918G0;
    }

    @Override // p147l0.C3860e
    /* renamed from: e0 */
    public boolean mo16285e0() {
        return this.f15920I0;
    }

    /* renamed from: e1 */
    public int m16286e1() {
        return this.f15917F0;
    }

    @Override // p147l0.C3860e
    /* renamed from: f0 */
    public boolean mo16287f0() {
        return this.f15920I0;
    }

    /* renamed from: f1 */
    public int m16288f1() {
        return this.f15919H0;
    }

    @Override // p147l0.C3860e
    /* renamed from: g */
    public void mo16289g(C3708d c3708d, boolean z10) {
        C3859d[] c3859dArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        C3859d[] c3859dArr2 = this.f15981P;
        c3859dArr2[0] = this.f15973H;
        c3859dArr2[2] = this.f15974I;
        c3859dArr2[1] = this.f15975J;
        c3859dArr2[3] = this.f15976K;
        int i13 = 0;
        while (true) {
            c3859dArr = this.f15981P;
            if (i13 >= c3859dArr.length) {
                break;
            }
            c3859dArr[i13].f15951i = c3708d.m15774q(c3859dArr[i13]);
            i13++;
        }
        int i14 = this.f15917F0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C3859d c3859d = c3859dArr[i14];
        if (!this.f15920I0) {
            m16283c1();
        }
        if (this.f15920I0) {
            this.f15920I0 = false;
            int i15 = this.f15917F0;
            if (i15 == 0 || i15 == 1) {
                c3708d.m15765f(this.f15973H.f15951i, this.f15990Y);
                c3708d.m15765f(this.f15975J.f15951i, this.f15990Y);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c3708d.m15765f(this.f15974I.f15951i, this.f15991Z);
                    c3708d.m15765f(this.f15976K.f15951i, this.f15991Z);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f16088E0; i16++) {
            C3860e c3860e = this.f16087D0[i16];
            if ((this.f15918G0 || c3860e.mo16291h()) && ((((i11 = this.f15917F0) == 0 || i11 == 1) && c3860e.m16413y() == C3860e.b.MATCH_CONSTRAINT && c3860e.f15973H.f15948f != null && c3860e.f15975J.f15948f != null) || (((i12 = this.f15917F0) == 2 || i12 == 3) && c3860e.m16351O() == C3860e.b.MATCH_CONSTRAINT && c3860e.f15974I.f15948f != null && c3860e.f15976K.f15948f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f15973H.m16311k() || this.f15975J.m16311k();
        boolean z13 = this.f15974I.m16311k() || this.f15976K.m16311k();
        int i17 = !z11 && (((i10 = this.f15917F0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.f16088E0; i18++) {
            C3860e c3860e2 = this.f16087D0[i18];
            if (this.f15918G0 || c3860e2.mo16291h()) {
                C3713i m15774q = c3708d.m15774q(c3860e2.f15981P[this.f15917F0]);
                C3859d[] c3859dArr3 = c3860e2.f15981P;
                int i19 = this.f15917F0;
                c3859dArr3[i19].f15951i = m15774q;
                int i20 = (c3859dArr3[i19].f15948f == null || c3859dArr3[i19].f15948f.f15946d != this) ? 0 : c3859dArr3[i19].f15949g + 0;
                if (i19 != 0 && i19 != 2) {
                    c3708d.m15766g(c3859d.f15951i, m15774q, this.f15919H0 + i20, z11);
                } else {
                    c3708d.m15768i(c3859d.f15951i, m15774q, this.f15919H0 - i20, z11);
                }
                c3708d.m15764e(c3859d.f15951i, m15774q, this.f15919H0 + i20, i17);
            }
        }
        int i21 = this.f15917F0;
        if (i21 == 0) {
            c3708d.m15764e(this.f15975J.f15951i, this.f15973H.f15951i, 0, 8);
            c3708d.m15764e(this.f15973H.f15951i, this.f15985T.f15975J.f15951i, 0, 4);
            c3708d.m15764e(this.f15973H.f15951i, this.f15985T.f15973H.f15951i, 0, 0);
            return;
        }
        if (i21 == 1) {
            c3708d.m15764e(this.f15973H.f15951i, this.f15975J.f15951i, 0, 8);
            c3708d.m15764e(this.f15973H.f15951i, this.f15985T.f15973H.f15951i, 0, 4);
            c3708d.m15764e(this.f15973H.f15951i, this.f15985T.f15975J.f15951i, 0, 0);
        } else if (i21 == 2) {
            c3708d.m15764e(this.f15976K.f15951i, this.f15974I.f15951i, 0, 8);
            c3708d.m15764e(this.f15974I.f15951i, this.f15985T.f15976K.f15951i, 0, 4);
            c3708d.m15764e(this.f15974I.f15951i, this.f15985T.f15974I.f15951i, 0, 0);
        } else if (i21 == 3) {
            c3708d.m15764e(this.f15974I.f15951i, this.f15976K.f15951i, 0, 8);
            c3708d.m15764e(this.f15974I.f15951i, this.f15985T.f15974I.f15951i, 0, 4);
            c3708d.m15764e(this.f15974I.f15951i, this.f15985T.f15976K.f15951i, 0, 0);
        }
    }

    /* renamed from: g1 */
    public int m16290g1() {
        int i10 = this.f15917F0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // p147l0.C3860e
    /* renamed from: h */
    public boolean mo16291h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public void m16292h1() {
        for (int i10 = 0; i10 < this.f16088E0; i10++) {
            C3860e c3860e = this.f16087D0[i10];
            int i11 = this.f15917F0;
            if (i11 == 0 || i11 == 1) {
                c3860e.m16328C0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                c3860e.m16328C0(1, true);
            }
        }
    }

    /* renamed from: i1 */
    public void m16293i1(boolean z10) {
        this.f15918G0 = z10;
    }

    /* renamed from: j1 */
    public void m16294j1(int i10) {
        this.f15917F0 = i10;
    }

    /* renamed from: k1 */
    public void m16295k1(int i10) {
        this.f15919H0 = i10;
    }

    @Override // p147l0.C3860e
    public String toString() {
        String str = "[Barrier] " + m16399r() + " {";
        for (int i10 = 0; i10 < this.f16088E0; i10++) {
            C3860e c3860e = this.f16087D0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c3860e.m16399r();
        }
        return str + "}";
    }
}
