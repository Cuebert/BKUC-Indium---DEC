package p147l0;

import java.util.ArrayList;
import p147l0.C3860e;

/* renamed from: l0.c */
/* loaded from: classes.dex */
public class C3858c {

    /* renamed from: a */
    protected C3860e f15921a;

    /* renamed from: b */
    protected C3860e f15922b;

    /* renamed from: c */
    protected C3860e f15923c;

    /* renamed from: d */
    protected C3860e f15924d;

    /* renamed from: e */
    protected C3860e f15925e;

    /* renamed from: f */
    protected C3860e f15926f;

    /* renamed from: g */
    protected C3860e f15927g;

    /* renamed from: h */
    protected ArrayList<C3860e> f15928h;

    /* renamed from: i */
    protected int f15929i;

    /* renamed from: j */
    protected int f15930j;

    /* renamed from: k */
    protected float f15931k = 0.0f;

    /* renamed from: l */
    int f15932l;

    /* renamed from: m */
    int f15933m;

    /* renamed from: n */
    int f15934n;

    /* renamed from: o */
    boolean f15935o;

    /* renamed from: p */
    private int f15936p;

    /* renamed from: q */
    private boolean f15937q;

    /* renamed from: r */
    protected boolean f15938r;

    /* renamed from: s */
    protected boolean f15939s;

    /* renamed from: t */
    protected boolean f15940t;

    /* renamed from: u */
    protected boolean f15941u;

    /* renamed from: v */
    private boolean f15942v;

    public C3858c(C3860e c3860e, int i10, boolean z10) {
        this.f15921a = c3860e;
        this.f15936p = i10;
        this.f15937q = z10;
    }

    /* renamed from: b */
    private void m16298b() {
        int i10 = this.f15936p * 2;
        C3860e c3860e = this.f15921a;
        this.f15935o = true;
        C3860e c3860e2 = c3860e;
        boolean z10 = false;
        while (!z10) {
            this.f15929i++;
            C3860e[] c3860eArr = c3860e.f16039x0;
            int i11 = this.f15936p;
            C3860e c3860e3 = null;
            c3860eArr[i11] = null;
            c3860e.f16037w0[i11] = null;
            if (c3860e.m16355Q() != 8) {
                this.f15932l++;
                C3860e.b m16401s = c3860e.m16401s(this.f15936p);
                C3860e.b bVar = C3860e.b.MATCH_CONSTRAINT;
                if (m16401s != bVar) {
                    this.f15933m += c3860e.m16327C(this.f15936p);
                }
                int m16305e = this.f15933m + c3860e.f15981P[i10].m16305e();
                this.f15933m = m16305e;
                int i12 = i10 + 1;
                this.f15933m = m16305e + c3860e.f15981P[i12].m16305e();
                int m16305e2 = this.f15934n + c3860e.f15981P[i10].m16305e();
                this.f15934n = m16305e2;
                this.f15934n = m16305e2 + c3860e.f15981P[i12].m16305e();
                if (this.f15922b == null) {
                    this.f15922b = c3860e;
                }
                this.f15924d = c3860e;
                C3860e.b[] bVarArr = c3860e.f15984S;
                int i13 = this.f15936p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = c3860e.f16026r;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f15930j++;
                        float[] fArr = c3860e.f16035v0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f15931k += fArr[i13];
                        }
                        if (m16299c(c3860e, i13)) {
                            if (f10 < 0.0f) {
                                this.f15938r = true;
                            } else {
                                this.f15939s = true;
                            }
                            if (this.f15928h == null) {
                                this.f15928h = new ArrayList<>();
                            }
                            this.f15928h.add(c3860e);
                        }
                        if (this.f15926f == null) {
                            this.f15926f = c3860e;
                        }
                        C3860e c3860e4 = this.f15927g;
                        if (c3860e4 != null) {
                            c3860e4.f16037w0[this.f15936p] = c3860e;
                        }
                        this.f15927g = c3860e;
                    }
                    if (this.f15936p == 0) {
                        if (c3860e.f16022p != 0) {
                            this.f15935o = false;
                        } else if (c3860e.f16028s != 0 || c3860e.f16030t != 0) {
                            this.f15935o = false;
                        }
                    } else if (c3860e.f16024q != 0) {
                        this.f15935o = false;
                    } else if (c3860e.f16034v != 0 || c3860e.f16036w != 0) {
                        this.f15935o = false;
                    }
                    if (c3860e.f15988W != 0.0f) {
                        this.f15935o = false;
                        this.f15941u = true;
                    }
                }
            }
            if (c3860e2 != c3860e) {
                c3860e2.f16039x0[this.f15936p] = c3860e;
            }
            C3859d c3859d = c3860e.f15981P[i10 + 1].f15948f;
            if (c3859d != null) {
                C3860e c3860e5 = c3859d.f15946d;
                C3859d[] c3859dArr = c3860e5.f15981P;
                if (c3859dArr[i10].f15948f != null && c3859dArr[i10].f15948f.f15946d == c3860e) {
                    c3860e3 = c3860e5;
                }
            }
            if (c3860e3 == null) {
                c3860e3 = c3860e;
                z10 = true;
            }
            c3860e2 = c3860e;
            c3860e = c3860e3;
        }
        C3860e c3860e6 = this.f15922b;
        if (c3860e6 != null) {
            this.f15933m -= c3860e6.f15981P[i10].m16305e();
        }
        C3860e c3860e7 = this.f15924d;
        if (c3860e7 != null) {
            this.f15933m -= c3860e7.f15981P[i10 + 1].m16305e();
        }
        this.f15923c = c3860e;
        if (this.f15936p == 0 && this.f15937q) {
            this.f15925e = c3860e;
        } else {
            this.f15925e = this.f15921a;
        }
        this.f15940t = this.f15939s && this.f15938r;
    }

    /* renamed from: c */
    private static boolean m16299c(C3860e c3860e, int i10) {
        if (c3860e.m16355Q() != 8 && c3860e.f15984S[i10] == C3860e.b.MATCH_CONSTRAINT) {
            int[] iArr = c3860e.f16026r;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m16300a() {
        if (!this.f15942v) {
            m16298b();
        }
        this.f15942v = true;
    }
}
