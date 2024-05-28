package p147l0;

import p134k0.C3708d;
import p134k0.C3713i;
import p147l0.C3859d;
import p147l0.C3860e;

/* renamed from: l0.g */
/* loaded from: classes.dex */
public class C3862g extends C3860e {

    /* renamed from: D0 */
    protected float f16079D0 = -1.0f;

    /* renamed from: E0 */
    protected int f16080E0 = -1;

    /* renamed from: F0 */
    protected int f16081F0 = -1;

    /* renamed from: G0 */
    private C3859d f16082G0 = this.f15974I;

    /* renamed from: H0 */
    private int f16083H0 = 0;

    /* renamed from: I0 */
    private int f16084I0 = 0;

    /* renamed from: J0 */
    private boolean f16085J0;

    /* renamed from: l0.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16086a;

        static {
            int[] iArr = new int[C3859d.b.values().length];
            f16086a = iArr;
            try {
                iArr[C3859d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16086a[C3859d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16086a[C3859d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16086a[C3859d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16086a[C3859d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16086a[C3859d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16086a[C3859d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16086a[C3859d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16086a[C3859d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C3862g() {
        this.f15982Q.clear();
        this.f15982Q.add(this.f16082G0);
        int length = this.f15981P.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f15981P[i10] = this.f16082G0;
        }
    }

    @Override // p147l0.C3860e
    /* renamed from: Z0 */
    public void mo16373Z0(C3708d c3708d, boolean z10) {
        if (m16339I() == null) {
            return;
        }
        int m15778x = c3708d.m15778x(this.f16082G0);
        if (this.f16083H0 == 1) {
            m16366V0(m15778x);
            m16368W0(0);
            m16408v0(m16339I().m16407v());
            m16364U0(0);
            return;
        }
        m16366V0(0);
        m16368W0(m15778x);
        m16364U0(m16339I().m16357R());
        m16408v0(0);
    }

    /* renamed from: a1 */
    public C3859d m16448a1() {
        return this.f16082G0;
    }

    /* renamed from: b1 */
    public int m16449b1() {
        return this.f16083H0;
    }

    /* renamed from: c1 */
    public int m16450c1() {
        return this.f16080E0;
    }

    /* renamed from: d1 */
    public int m16451d1() {
        return this.f16081F0;
    }

    @Override // p147l0.C3860e
    /* renamed from: e0 */
    public boolean mo16285e0() {
        return this.f16085J0;
    }

    /* renamed from: e1 */
    public float m16452e1() {
        return this.f16079D0;
    }

    @Override // p147l0.C3860e
    /* renamed from: f0 */
    public boolean mo16287f0() {
        return this.f16085J0;
    }

    /* renamed from: f1 */
    public void m16453f1(int i10) {
        this.f16082G0.m16319s(i10);
        this.f16085J0 = true;
    }

    @Override // p147l0.C3860e
    /* renamed from: g */
    public void mo16289g(C3708d c3708d, boolean z10) {
        C3861f c3861f = (C3861f) m16339I();
        if (c3861f == null) {
            return;
        }
        C3859d mo16389m = c3861f.mo16389m(C3859d.b.LEFT);
        C3859d mo16389m2 = c3861f.mo16389m(C3859d.b.RIGHT);
        C3860e c3860e = this.f15985T;
        boolean z11 = c3860e != null && c3860e.f15984S[0] == C3860e.b.WRAP_CONTENT;
        if (this.f16083H0 == 0) {
            mo16389m = c3861f.mo16389m(C3859d.b.TOP);
            mo16389m2 = c3861f.mo16389m(C3859d.b.BOTTOM);
            C3860e c3860e2 = this.f15985T;
            z11 = c3860e2 != null && c3860e2.f15984S[1] == C3860e.b.WRAP_CONTENT;
        }
        if (this.f16085J0 && this.f16082G0.m16313m()) {
            C3713i m15774q = c3708d.m15774q(this.f16082G0);
            c3708d.m15765f(m15774q, this.f16082G0.m16304d());
            if (this.f16080E0 != -1) {
                if (z11) {
                    c3708d.m15767h(c3708d.m15774q(mo16389m2), m15774q, 0, 5);
                }
            } else if (this.f16081F0 != -1 && z11) {
                C3713i m15774q2 = c3708d.m15774q(mo16389m2);
                c3708d.m15767h(m15774q, c3708d.m15774q(mo16389m), 0, 5);
                c3708d.m15767h(m15774q2, m15774q, 0, 5);
            }
            this.f16085J0 = false;
            return;
        }
        if (this.f16080E0 != -1) {
            C3713i m15774q3 = c3708d.m15774q(this.f16082G0);
            c3708d.m15764e(m15774q3, c3708d.m15774q(mo16389m), this.f16080E0, 8);
            if (z11) {
                c3708d.m15767h(c3708d.m15774q(mo16389m2), m15774q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f16081F0 == -1) {
            if (this.f16079D0 != -1.0f) {
                c3708d.m15763d(C3708d.m15755s(c3708d, c3708d.m15774q(this.f16082G0), c3708d.m15774q(mo16389m2), this.f16079D0));
                return;
            }
            return;
        }
        C3713i m15774q4 = c3708d.m15774q(this.f16082G0);
        C3713i m15774q5 = c3708d.m15774q(mo16389m2);
        c3708d.m15764e(m15774q4, m15774q5, -this.f16081F0, 8);
        if (z11) {
            c3708d.m15767h(m15774q4, c3708d.m15774q(mo16389m), 0, 5);
            c3708d.m15767h(m15774q5, m15774q4, 0, 5);
        }
    }

    /* renamed from: g1 */
    public void m16454g1(int i10) {
        if (i10 > -1) {
            this.f16079D0 = -1.0f;
            this.f16080E0 = i10;
            this.f16081F0 = -1;
        }
    }

    @Override // p147l0.C3860e
    /* renamed from: h */
    public boolean mo16291h() {
        return true;
    }

    /* renamed from: h1 */
    public void m16455h1(int i10) {
        if (i10 > -1) {
            this.f16079D0 = -1.0f;
            this.f16080E0 = -1;
            this.f16081F0 = i10;
        }
    }

    /* renamed from: i1 */
    public void m16456i1(float f10) {
        if (f10 > -1.0f) {
            this.f16079D0 = f10;
            this.f16080E0 = -1;
            this.f16081F0 = -1;
        }
    }

    /* renamed from: j1 */
    public void m16457j1(int i10) {
        if (this.f16083H0 == i10) {
            return;
        }
        this.f16083H0 = i10;
        this.f15982Q.clear();
        if (this.f16083H0 == 1) {
            this.f16082G0 = this.f15973H;
        } else {
            this.f16082G0 = this.f15974I;
        }
        this.f15982Q.add(this.f16082G0);
        int length = this.f15981P.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f15981P[i11] = this.f16082G0;
        }
    }

    @Override // p147l0.C3860e
    /* renamed from: m */
    public C3859d mo16389m(C3859d.b bVar) {
        switch (a.f16086a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f16083H0 == 1) {
                    return this.f16082G0;
                }
                break;
            case 3:
            case 4:
                if (this.f16083H0 == 0) {
                    return this.f16082G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
