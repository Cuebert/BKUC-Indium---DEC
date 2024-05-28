package p147l0;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p134k0.C3707c;
import p134k0.C3708d;
import p147l0.C3859d;
import p158m0.AbstractC3928p;
import p158m0.C3915c;
import p158m0.C3918f;
import p158m0.C3924l;
import p158m0.C3926n;

/* renamed from: l0.e */
/* loaded from: classes.dex */
public class C3860e {

    /* renamed from: C0 */
    public static float f15963C0 = 0.5f;

    /* renamed from: A0 */
    public int f15965A0;

    /* renamed from: B0 */
    public int f15967B0;

    /* renamed from: D */
    private boolean f15969D;

    /* renamed from: O */
    public C3859d f15980O;

    /* renamed from: P */
    public C3859d[] f15981P;

    /* renamed from: Q */
    protected ArrayList<C3859d> f15982Q;

    /* renamed from: R */
    private boolean[] f15983R;

    /* renamed from: S */
    public b[] f15984S;

    /* renamed from: T */
    public C3860e f15985T;

    /* renamed from: U */
    int f15986U;

    /* renamed from: V */
    int f15987V;

    /* renamed from: W */
    public float f15988W;

    /* renamed from: X */
    protected int f15989X;

    /* renamed from: Y */
    protected int f15990Y;

    /* renamed from: Z */
    protected int f15991Z;

    /* renamed from: a0 */
    int f15993a0;

    /* renamed from: b0 */
    int f15995b0;

    /* renamed from: c */
    public C3915c f15996c;

    /* renamed from: c0 */
    protected int f15997c0;

    /* renamed from: d */
    public C3915c f15998d;

    /* renamed from: d0 */
    protected int f15999d0;

    /* renamed from: e0 */
    int f16001e0;

    /* renamed from: f0 */
    protected int f16003f0;

    /* renamed from: g0 */
    protected int f16005g0;

    /* renamed from: h0 */
    float f16007h0;

    /* renamed from: i0 */
    float f16009i0;

    /* renamed from: j0 */
    private Object f16011j0;

    /* renamed from: k0 */
    private int f16013k0;

    /* renamed from: l0 */
    private int f16015l0;

    /* renamed from: m0 */
    private String f16017m0;

    /* renamed from: n0 */
    private String f16019n0;

    /* renamed from: o0 */
    boolean f16021o0;

    /* renamed from: p0 */
    boolean f16023p0;

    /* renamed from: q0 */
    boolean f16025q0;

    /* renamed from: r0 */
    int f16027r0;

    /* renamed from: s0 */
    int f16029s0;

    /* renamed from: t0 */
    boolean f16031t0;

    /* renamed from: u0 */
    boolean f16033u0;

    /* renamed from: v0 */
    public float[] f16035v0;

    /* renamed from: w0 */
    protected C3860e[] f16037w0;

    /* renamed from: x0 */
    protected C3860e[] f16039x0;

    /* renamed from: y0 */
    C3860e f16041y0;

    /* renamed from: z0 */
    C3860e f16043z0;

    /* renamed from: a */
    public boolean f15992a = false;

    /* renamed from: b */
    public AbstractC3928p[] f15994b = new AbstractC3928p[2];

    /* renamed from: e */
    public C3924l f16000e = null;

    /* renamed from: f */
    public C3926n f16002f = null;

    /* renamed from: g */
    public boolean[] f16004g = {true, true};

    /* renamed from: h */
    boolean f16006h = false;

    /* renamed from: i */
    private boolean f16008i = true;

    /* renamed from: j */
    private boolean f16010j = false;

    /* renamed from: k */
    private boolean f16012k = true;

    /* renamed from: l */
    private boolean f16014l = false;

    /* renamed from: m */
    private boolean f16016m = false;

    /* renamed from: n */
    public int f16018n = -1;

    /* renamed from: o */
    public int f16020o = -1;

    /* renamed from: p */
    public int f16022p = 0;

    /* renamed from: q */
    public int f16024q = 0;

    /* renamed from: r */
    public int[] f16026r = new int[2];

    /* renamed from: s */
    public int f16028s = 0;

    /* renamed from: t */
    public int f16030t = 0;

    /* renamed from: u */
    public float f16032u = 1.0f;

    /* renamed from: v */
    public int f16034v = 0;

    /* renamed from: w */
    public int f16036w = 0;

    /* renamed from: x */
    public float f16038x = 1.0f;

    /* renamed from: y */
    int f16040y = -1;

    /* renamed from: z */
    float f16042z = 1.0f;

    /* renamed from: A */
    private int[] f15964A = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: B */
    private float f15966B = 0.0f;

    /* renamed from: C */
    private boolean f15968C = false;

    /* renamed from: E */
    private boolean f15970E = false;

    /* renamed from: F */
    private int f15971F = 0;

    /* renamed from: G */
    private int f15972G = 0;

    /* renamed from: H */
    public C3859d f15973H = new C3859d(this, C3859d.b.LEFT);

    /* renamed from: I */
    public C3859d f15974I = new C3859d(this, C3859d.b.TOP);

    /* renamed from: J */
    public C3859d f15975J = new C3859d(this, C3859d.b.RIGHT);

    /* renamed from: K */
    public C3859d f15976K = new C3859d(this, C3859d.b.BOTTOM);

    /* renamed from: L */
    public C3859d f15977L = new C3859d(this, C3859d.b.BASELINE);

    /* renamed from: M */
    C3859d f15978M = new C3859d(this, C3859d.b.CENTER_X);

    /* renamed from: N */
    C3859d f15979N = new C3859d(this, C3859d.b.CENTER_Y);

    /* renamed from: l0.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16044a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16045b;

        static {
            int[] iArr = new int[b.values().length];
            f16045b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16045b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16045b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16045b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C3859d.b.values().length];
            f16044a = iArr2;
            try {
                iArr2[C3859d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16044a[C3859d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16044a[C3859d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16044a[C3859d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16044a[C3859d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16044a[C3859d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16044a[C3859d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16044a[C3859d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16044a[C3859d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: l0.e$b */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C3860e() {
        C3859d c3859d = new C3859d(this, C3859d.b.CENTER);
        this.f15980O = c3859d;
        this.f15981P = new C3859d[]{this.f15973H, this.f15975J, this.f15974I, this.f15976K, this.f15977L, c3859d};
        this.f15982Q = new ArrayList<>();
        this.f15983R = new boolean[2];
        b bVar = b.FIXED;
        this.f15984S = new b[]{bVar, bVar};
        this.f15985T = null;
        this.f15986U = 0;
        this.f15987V = 0;
        this.f15988W = 0.0f;
        this.f15989X = -1;
        this.f15990Y = 0;
        this.f15991Z = 0;
        this.f15993a0 = 0;
        this.f15995b0 = 0;
        this.f15997c0 = 0;
        this.f15999d0 = 0;
        this.f16001e0 = 0;
        float f10 = f15963C0;
        this.f16007h0 = f10;
        this.f16009i0 = f10;
        this.f16013k0 = 0;
        this.f16015l0 = 0;
        this.f16017m0 = null;
        this.f16019n0 = null;
        this.f16025q0 = false;
        this.f16027r0 = 0;
        this.f16029s0 = 0;
        this.f16035v0 = new float[]{-1.0f, -1.0f};
        this.f16037w0 = new C3860e[]{null, null};
        this.f16039x0 = new C3860e[]{null, null};
        this.f16041y0 = null;
        this.f16043z0 = null;
        this.f15965A0 = -1;
        this.f15967B0 = -1;
        m16321d();
    }

    /* renamed from: Y */
    private boolean m16320Y(int i10) {
        int i11 = i10 * 2;
        C3859d[] c3859dArr = this.f15981P;
        if (c3859dArr[i11].f15948f != null && c3859dArr[i11].f15948f.f15948f != c3859dArr[i11]) {
            int i12 = i11 + 1;
            if (c3859dArr[i12].f15948f != null && c3859dArr[i12].f15948f.f15948f == c3859dArr[i12]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m16321d() {
        this.f15982Q.add(this.f15973H);
        this.f15982Q.add(this.f15974I);
        this.f15982Q.add(this.f15975J);
        this.f15982Q.add(this.f15976K);
        this.f15982Q.add(this.f15978M);
        this.f15982Q.add(this.f15979N);
        this.f15982Q.add(this.f15980O);
        this.f15982Q.add(this.f15977L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x051c, code lost:
    
        if (r1[r30] == r6) goto L706;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0418 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16322i(p134k0.C3708d r32, boolean r33, boolean r34, boolean r35, boolean r36, p134k0.C3713i r37, p134k0.C3713i r38, p147l0.C3860e.b r39, boolean r40, p147l0.C3859d r41, p147l0.C3859d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p147l0.C3860e.m16322i(k0.d, boolean, boolean, boolean, boolean, k0.i, k0.i, l0.e$b, boolean, l0.d, l0.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int m16323A() {
        return this.f15971F;
    }

    /* renamed from: A0 */
    public void m16324A0(int i10, int i11, int i12, float f10) {
        this.f16022p = i10;
        this.f16028s = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f16030t = i12;
        this.f16032u = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f16022p = 2;
    }

    /* renamed from: B */
    public int m16325B() {
        return this.f15972G;
    }

    /* renamed from: B0 */
    public void m16326B0(float f10) {
        this.f16035v0[0] = f10;
    }

    /* renamed from: C */
    public int m16327C(int i10) {
        if (i10 == 0) {
            return m16357R();
        }
        if (i10 == 1) {
            return m16407v();
        }
        return 0;
    }

    /* renamed from: C0 */
    public void m16328C0(int i10, boolean z10) {
        this.f15983R[i10] = z10;
    }

    /* renamed from: D */
    public int m16329D() {
        return this.f15964A[1];
    }

    /* renamed from: D0 */
    public void m16330D0(boolean z10) {
        this.f15969D = z10;
    }

    /* renamed from: E */
    public int m16331E() {
        return this.f15964A[0];
    }

    /* renamed from: E0 */
    public void m16332E0(boolean z10) {
        this.f15970E = z10;
    }

    /* renamed from: F */
    public int m16333F() {
        return this.f16005g0;
    }

    /* renamed from: F0 */
    public void m16334F0(int i10, int i11) {
        this.f15971F = i10;
        this.f15972G = i11;
        m16340I0(false);
    }

    /* renamed from: G */
    public int m16335G() {
        return this.f16003f0;
    }

    /* renamed from: G0 */
    public void m16336G0(int i10) {
        this.f15964A[1] = i10;
    }

    /* renamed from: H */
    public C3860e m16337H(int i10) {
        C3859d c3859d;
        C3859d c3859d2;
        if (i10 != 0) {
            if (i10 == 1 && (c3859d2 = (c3859d = this.f15976K).f15948f) != null && c3859d2.f15948f == c3859d) {
                return c3859d2.f15946d;
            }
            return null;
        }
        C3859d c3859d3 = this.f15975J;
        C3859d c3859d4 = c3859d3.f15948f;
        if (c3859d4 == null || c3859d4.f15948f != c3859d3) {
            return null;
        }
        return c3859d4.f15946d;
    }

    /* renamed from: H0 */
    public void m16338H0(int i10) {
        this.f15964A[0] = i10;
    }

    /* renamed from: I */
    public C3860e m16339I() {
        return this.f15985T;
    }

    /* renamed from: I0 */
    public void m16340I0(boolean z10) {
        this.f16008i = z10;
    }

    /* renamed from: J */
    public C3860e m16341J(int i10) {
        C3859d c3859d;
        C3859d c3859d2;
        if (i10 != 0) {
            if (i10 == 1 && (c3859d2 = (c3859d = this.f15974I).f15948f) != null && c3859d2.f15948f == c3859d) {
                return c3859d2.f15946d;
            }
            return null;
        }
        C3859d c3859d3 = this.f15973H;
        C3859d c3859d4 = c3859d3.f15948f;
        if (c3859d4 == null || c3859d4.f15948f != c3859d3) {
            return null;
        }
        return c3859d4.f15946d;
    }

    /* renamed from: J0 */
    public void m16342J0(int i10) {
        if (i10 < 0) {
            this.f16005g0 = 0;
        } else {
            this.f16005g0 = i10;
        }
    }

    /* renamed from: K */
    public int m16343K() {
        return m16359S() + this.f15986U;
    }

    /* renamed from: K0 */
    public void m16344K0(int i10) {
        if (i10 < 0) {
            this.f16003f0 = 0;
        } else {
            this.f16003f0 = i10;
        }
    }

    /* renamed from: L */
    public AbstractC3928p m16345L(int i10) {
        if (i10 == 0) {
            return this.f16000e;
        }
        if (i10 == 1) {
            return this.f16002f;
        }
        return null;
    }

    /* renamed from: L0 */
    public void m16346L0(int i10, int i11) {
        this.f15990Y = i10;
        this.f15991Z = i11;
    }

    /* renamed from: M */
    public float m16347M() {
        return this.f16009i0;
    }

    /* renamed from: M0 */
    public void m16348M0(C3860e c3860e) {
        this.f15985T = c3860e;
    }

    /* renamed from: N */
    public int m16349N() {
        return this.f16029s0;
    }

    /* renamed from: N0 */
    public void m16350N0(float f10) {
        this.f16009i0 = f10;
    }

    /* renamed from: O */
    public b m16351O() {
        return this.f15984S[1];
    }

    /* renamed from: O0 */
    public void m16352O0(int i10) {
        this.f16029s0 = i10;
    }

    /* renamed from: P */
    public int m16353P() {
        int i10 = this.f15973H != null ? 0 + this.f15974I.f15949g : 0;
        return this.f15975J != null ? i10 + this.f15976K.f15949g : i10;
    }

    /* renamed from: P0 */
    public void m16354P0(int i10, int i11) {
        this.f15991Z = i10;
        int i12 = i11 - i10;
        this.f15987V = i12;
        int i13 = this.f16005g0;
        if (i12 < i13) {
            this.f15987V = i13;
        }
    }

    /* renamed from: Q */
    public int m16355Q() {
        return this.f16015l0;
    }

    /* renamed from: Q0 */
    public void m16356Q0(b bVar) {
        this.f15984S[1] = bVar;
    }

    /* renamed from: R */
    public int m16357R() {
        if (this.f16015l0 == 8) {
            return 0;
        }
        return this.f15986U;
    }

    /* renamed from: R0 */
    public void m16358R0(int i10, int i11, int i12, float f10) {
        this.f16024q = i10;
        this.f16034v = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f16036w = i12;
        this.f16038x = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f16024q = 2;
    }

    /* renamed from: S */
    public int m16359S() {
        C3860e c3860e = this.f15985T;
        if (c3860e != null && (c3860e instanceof C3861f)) {
            return ((C3861f) c3860e).f16056J0 + this.f15990Y;
        }
        return this.f15990Y;
    }

    /* renamed from: S0 */
    public void m16360S0(float f10) {
        this.f16035v0[1] = f10;
    }

    /* renamed from: T */
    public int m16361T() {
        C3860e c3860e = this.f15985T;
        if (c3860e != null && (c3860e instanceof C3861f)) {
            return ((C3861f) c3860e).f16057K0 + this.f15991Z;
        }
        return this.f15991Z;
    }

    /* renamed from: T0 */
    public void m16362T0(int i10) {
        this.f16015l0 = i10;
    }

    /* renamed from: U */
    public boolean m16363U() {
        return this.f15968C;
    }

    /* renamed from: U0 */
    public void m16364U0(int i10) {
        this.f15986U = i10;
        int i11 = this.f16003f0;
        if (i10 < i11) {
            this.f15986U = i11;
        }
    }

    /* renamed from: V */
    public boolean m16365V(int i10) {
        if (i10 == 0) {
            return (this.f15973H.f15948f != null ? 1 : 0) + (this.f15975J.f15948f != null ? 1 : 0) < 2;
        }
        return ((this.f15974I.f15948f != null ? 1 : 0) + (this.f15976K.f15948f != null ? 1 : 0)) + (this.f15977L.f15948f != null ? 1 : 0) < 2;
    }

    /* renamed from: V0 */
    public void m16366V0(int i10) {
        this.f15990Y = i10;
    }

    /* renamed from: W */
    public boolean m16367W() {
        int size = this.f15982Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f15982Q.get(i10).m16312l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public void m16368W0(int i10) {
        this.f15991Z = i10;
    }

    /* renamed from: X */
    public void m16369X(C3859d.b bVar, C3860e c3860e, C3859d.b bVar2, int i10, int i11) {
        mo16389m(bVar).m16301a(c3860e.mo16389m(bVar2), i10, i11, true);
    }

    /* renamed from: X0 */
    public void m16370X0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f16040y == -1) {
            if (z12 && !z13) {
                this.f16040y = 0;
            } else if (!z12 && z13) {
                this.f16040y = 1;
                if (this.f15989X == -1) {
                    this.f16042z = 1.0f / this.f16042z;
                }
            }
        }
        if (this.f16040y == 0 && (!this.f15974I.m16314n() || !this.f15976K.m16314n())) {
            this.f16040y = 1;
        } else if (this.f16040y == 1 && (!this.f15973H.m16314n() || !this.f15975J.m16314n())) {
            this.f16040y = 0;
        }
        if (this.f16040y == -1 && (!this.f15974I.m16314n() || !this.f15976K.m16314n() || !this.f15973H.m16314n() || !this.f15975J.m16314n())) {
            if (this.f15974I.m16314n() && this.f15976K.m16314n()) {
                this.f16040y = 0;
            } else if (this.f15973H.m16314n() && this.f15975J.m16314n()) {
                this.f16042z = 1.0f / this.f16042z;
                this.f16040y = 1;
            }
        }
        if (this.f16040y == -1) {
            int i10 = this.f16028s;
            if (i10 > 0 && this.f16034v == 0) {
                this.f16040y = 0;
            } else {
                if (i10 != 0 || this.f16034v <= 0) {
                    return;
                }
                this.f16042z = 1.0f / this.f16042z;
                this.f16040y = 1;
            }
        }
    }

    /* renamed from: Y0 */
    public void mo16371Y0(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean m16662k = z10 & this.f16000e.m16662k();
        boolean m16662k2 = z11 & this.f16002f.m16662k();
        C3924l c3924l = this.f16000e;
        int i12 = c3924l.f16305h.f16253g;
        C3926n c3926n = this.f16002f;
        int i13 = c3926n.f16305h.f16253g;
        int i14 = c3924l.f16306i.f16253g;
        int i15 = c3926n.f16306i.f16253g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (m16662k) {
            this.f15990Y = i12;
        }
        if (m16662k2) {
            this.f15991Z = i13;
        }
        if (this.f16015l0 == 8) {
            this.f15986U = 0;
            this.f15987V = 0;
            return;
        }
        if (m16662k) {
            if (this.f15984S[0] == b.FIXED && i17 < (i11 = this.f15986U)) {
                i17 = i11;
            }
            this.f15986U = i17;
            int i19 = this.f16003f0;
            if (i17 < i19) {
                this.f15986U = i19;
            }
        }
        if (m16662k2) {
            if (this.f15984S[1] == b.FIXED && i18 < (i10 = this.f15987V)) {
                i18 = i10;
            }
            this.f15987V = i18;
            int i20 = this.f16005g0;
            if (i18 < i20) {
                this.f15987V = i20;
            }
        }
    }

    /* renamed from: Z */
    public boolean m16372Z() {
        C3859d c3859d = this.f15973H;
        C3859d c3859d2 = c3859d.f15948f;
        if (c3859d2 != null && c3859d2.f15948f == c3859d) {
            return true;
        }
        C3859d c3859d3 = this.f15975J;
        C3859d c3859d4 = c3859d3.f15948f;
        return c3859d4 != null && c3859d4.f15948f == c3859d3;
    }

    /* renamed from: Z0 */
    public void mo16373Z0(C3708d c3708d, boolean z10) {
        C3926n c3926n;
        C3924l c3924l;
        int m15778x = c3708d.m15778x(this.f15973H);
        int m15778x2 = c3708d.m15778x(this.f15974I);
        int m15778x3 = c3708d.m15778x(this.f15975J);
        int m15778x4 = c3708d.m15778x(this.f15976K);
        if (z10 && (c3924l = this.f16000e) != null) {
            C3918f c3918f = c3924l.f16305h;
            if (c3918f.f16256j) {
                C3918f c3918f2 = c3924l.f16306i;
                if (c3918f2.f16256j) {
                    m15778x = c3918f.f16253g;
                    m15778x3 = c3918f2.f16253g;
                }
            }
        }
        if (z10 && (c3926n = this.f16002f) != null) {
            C3918f c3918f3 = c3926n.f16305h;
            if (c3918f3.f16256j) {
                C3918f c3918f4 = c3926n.f16306i;
                if (c3918f4.f16256j) {
                    m15778x2 = c3918f3.f16253g;
                    m15778x4 = c3918f4.f16253g;
                }
            }
        }
        int i10 = m15778x4 - m15778x2;
        if (m15778x3 - m15778x < 0 || i10 < 0 || m15778x == Integer.MIN_VALUE || m15778x == Integer.MAX_VALUE || m15778x2 == Integer.MIN_VALUE || m15778x2 == Integer.MAX_VALUE || m15778x3 == Integer.MIN_VALUE || m15778x3 == Integer.MAX_VALUE || m15778x4 == Integer.MIN_VALUE || m15778x4 == Integer.MAX_VALUE) {
            m15778x4 = 0;
            m15778x = 0;
            m15778x2 = 0;
            m15778x3 = 0;
        }
        m16404t0(m15778x, m15778x2, m15778x3, m15778x4);
    }

    /* renamed from: a0 */
    public boolean m16374a0() {
        return this.f15969D;
    }

    /* renamed from: b0 */
    public boolean m16375b0() {
        C3859d c3859d = this.f15974I;
        C3859d c3859d2 = c3859d.f15948f;
        if (c3859d2 != null && c3859d2.f15948f == c3859d) {
            return true;
        }
        C3859d c3859d3 = this.f15976K;
        C3859d c3859d4 = c3859d3.f15948f;
        return c3859d4 != null && c3859d4.f15948f == c3859d3;
    }

    /* renamed from: c0 */
    public boolean m16376c0() {
        return this.f15970E;
    }

    /* renamed from: d0 */
    public boolean m16377d0() {
        return this.f16008i && this.f16015l0 != 8;
    }

    /* renamed from: e */
    public void m16378e(C3861f c3861f, C3708d c3708d, HashSet<C3860e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            C3865j.m16463a(c3861f, c3708d, this);
            hashSet.remove(this);
            mo16289g(c3708d, c3861f.m16423B1(64));
        }
        if (i10 == 0) {
            HashSet<C3859d> m16303c = this.f15973H.m16303c();
            if (m16303c != null) {
                Iterator<C3859d> it = m16303c.iterator();
                while (it.hasNext()) {
                    it.next().f15946d.m16378e(c3861f, c3708d, hashSet, i10, true);
                }
            }
            HashSet<C3859d> m16303c2 = this.f15975J.m16303c();
            if (m16303c2 != null) {
                Iterator<C3859d> it2 = m16303c2.iterator();
                while (it2.hasNext()) {
                    it2.next().f15946d.m16378e(c3861f, c3708d, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<C3859d> m16303c3 = this.f15974I.m16303c();
        if (m16303c3 != null) {
            Iterator<C3859d> it3 = m16303c3.iterator();
            while (it3.hasNext()) {
                it3.next().f15946d.m16378e(c3861f, c3708d, hashSet, i10, true);
            }
        }
        HashSet<C3859d> m16303c4 = this.f15976K.m16303c();
        if (m16303c4 != null) {
            Iterator<C3859d> it4 = m16303c4.iterator();
            while (it4.hasNext()) {
                it4.next().f15946d.m16378e(c3861f, c3708d, hashSet, i10, true);
            }
        }
        HashSet<C3859d> m16303c5 = this.f15977L.m16303c();
        if (m16303c5 != null) {
            Iterator<C3859d> it5 = m16303c5.iterator();
            while (it5.hasNext()) {
                it5.next().f15946d.m16378e(c3861f, c3708d, hashSet, i10, true);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo16285e0() {
        return this.f16014l || (this.f15973H.m16313m() && this.f15975J.m16313m());
    }

    /* renamed from: f */
    public boolean m16379f() {
        return (this instanceof C3866k) || (this instanceof C3862g);
    }

    /* renamed from: f0 */
    public boolean mo16287f0() {
        return this.f16016m || (this.f15974I.m16313m() && this.f15976K.m16313m());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02d1  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16289g(p134k0.C3708d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p147l0.C3860e.mo16289g(k0.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean m16380g0() {
        b[] bVarArr = this.f15984S;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* renamed from: h */
    public boolean mo16291h() {
        return this.f16015l0 != 8;
    }

    /* renamed from: h0 */
    public void mo16381h0() {
        this.f15973H.m16316p();
        this.f15974I.m16316p();
        this.f15975J.m16316p();
        this.f15976K.m16316p();
        this.f15977L.m16316p();
        this.f15978M.m16316p();
        this.f15979N.m16316p();
        this.f15980O.m16316p();
        this.f15985T = null;
        this.f15966B = 0.0f;
        this.f15986U = 0;
        this.f15987V = 0;
        this.f15988W = 0.0f;
        this.f15989X = -1;
        this.f15990Y = 0;
        this.f15991Z = 0;
        this.f15997c0 = 0;
        this.f15999d0 = 0;
        this.f16001e0 = 0;
        this.f16003f0 = 0;
        this.f16005g0 = 0;
        float f10 = f15963C0;
        this.f16007h0 = f10;
        this.f16009i0 = f10;
        b[] bVarArr = this.f15984S;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f16011j0 = null;
        this.f16013k0 = 0;
        this.f16015l0 = 0;
        this.f16019n0 = null;
        this.f16021o0 = false;
        this.f16023p0 = false;
        this.f16027r0 = 0;
        this.f16029s0 = 0;
        this.f16031t0 = false;
        this.f16033u0 = false;
        float[] fArr = this.f16035v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f16018n = -1;
        this.f16020o = -1;
        int[] iArr = this.f15964A;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f16022p = 0;
        this.f16024q = 0;
        this.f16032u = 1.0f;
        this.f16038x = 1.0f;
        this.f16030t = Integer.MAX_VALUE;
        this.f16036w = Integer.MAX_VALUE;
        this.f16028s = 0;
        this.f16034v = 0;
        this.f16006h = false;
        this.f16040y = -1;
        this.f16042z = 1.0f;
        this.f16025q0 = false;
        boolean[] zArr = this.f16004g;
        zArr[0] = true;
        zArr[1] = true;
        this.f15970E = false;
        boolean[] zArr2 = this.f15983R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f16008i = true;
    }

    /* renamed from: i0 */
    public void m16382i0() {
        this.f16014l = false;
        this.f16016m = false;
        int size = this.f15982Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15982Q.get(i10).m16317q();
        }
    }

    /* renamed from: j */
    public void m16383j(C3860e c3860e, float f10, int i10) {
        C3859d.b bVar = C3859d.b.CENTER;
        m16369X(bVar, c3860e, bVar, i10, 0);
        this.f15966B = f10;
    }

    /* renamed from: j0 */
    public void mo16384j0(C3707c c3707c) {
        this.f15973H.m16318r(c3707c);
        this.f15974I.m16318r(c3707c);
        this.f15975J.m16318r(c3707c);
        this.f15976K.m16318r(c3707c);
        this.f15977L.m16318r(c3707c);
        this.f15980O.m16318r(c3707c);
        this.f15978M.m16318r(c3707c);
        this.f15979N.m16318r(c3707c);
    }

    /* renamed from: k */
    public void m16385k(C3708d c3708d) {
        c3708d.m15774q(this.f15973H);
        c3708d.m15774q(this.f15974I);
        c3708d.m15774q(this.f15975J);
        c3708d.m15774q(this.f15976K);
        if (this.f16001e0 > 0) {
            c3708d.m15774q(this.f15977L);
        }
    }

    /* renamed from: k0 */
    public void m16386k0(int i10) {
        this.f16001e0 = i10;
        this.f15968C = i10 > 0;
    }

    /* renamed from: l */
    public void m16387l() {
        if (this.f16000e == null) {
            this.f16000e = new C3924l(this);
        }
        if (this.f16002f == null) {
            this.f16002f = new C3926n(this);
        }
    }

    /* renamed from: l0 */
    public void m16388l0(Object obj) {
        this.f16011j0 = obj;
    }

    /* renamed from: m */
    public C3859d mo16389m(C3859d.b bVar) {
        switch (a.f16044a[bVar.ordinal()]) {
            case 1:
                return this.f15973H;
            case 2:
                return this.f15974I;
            case 3:
                return this.f15975J;
            case 4:
                return this.f15976K;
            case 5:
                return this.f15977L;
            case 6:
                return this.f15980O;
            case 7:
                return this.f15978M;
            case 8:
                return this.f15979N;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: m0 */
    public void m16390m0(String str) {
        this.f16017m0 = str;
    }

    /* renamed from: n */
    public int m16391n() {
        return this.f16001e0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:31:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: n0 */
    public void m16392n0(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int i11 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i12, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i11 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = 0.0f;
            } else {
                String substring4 = str.substring(i12);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = 0.0f;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.f15988W = f10;
                this.f15989X = i11;
                return;
            }
            return;
        }
        this.f15988W = 0.0f;
    }

    /* renamed from: o */
    public float m16393o(int i10) {
        if (i10 == 0) {
            return this.f16007h0;
        }
        if (i10 == 1) {
            return this.f16009i0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void m16394o0(int i10) {
        if (this.f15968C) {
            int i11 = i10 - this.f16001e0;
            int i12 = this.f15987V + i11;
            this.f15991Z = i11;
            this.f15974I.m16319s(i11);
            this.f15976K.m16319s(i12);
            this.f15977L.m16319s(i10);
            this.f16016m = true;
        }
    }

    /* renamed from: p */
    public int m16395p() {
        return m16361T() + this.f15987V;
    }

    /* renamed from: p0 */
    public void m16396p0(int i10, int i11) {
        this.f15973H.m16319s(i10);
        this.f15975J.m16319s(i11);
        this.f15990Y = i10;
        this.f15986U = i11 - i10;
        this.f16014l = true;
    }

    /* renamed from: q */
    public Object m16397q() {
        return this.f16011j0;
    }

    /* renamed from: q0 */
    public void m16398q0(int i10) {
        this.f15973H.m16319s(i10);
        this.f15990Y = i10;
    }

    /* renamed from: r */
    public String m16399r() {
        return this.f16017m0;
    }

    /* renamed from: r0 */
    public void m16400r0(int i10) {
        this.f15974I.m16319s(i10);
        this.f15991Z = i10;
    }

    /* renamed from: s */
    public b m16401s(int i10) {
        if (i10 == 0) {
            return m16413y();
        }
        if (i10 == 1) {
            return m16351O();
        }
        return null;
    }

    /* renamed from: s0 */
    public void m16402s0(int i10, int i11) {
        this.f15974I.m16319s(i10);
        this.f15976K.m16319s(i11);
        this.f15991Z = i10;
        this.f15987V = i11 - i10;
        if (this.f15968C) {
            this.f15977L.m16319s(i10 + this.f16001e0);
        }
        this.f16016m = true;
    }

    /* renamed from: t */
    public float m16403t() {
        return this.f15988W;
    }

    /* renamed from: t0 */
    public void m16404t0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f15990Y = i10;
        this.f15991Z = i11;
        if (this.f16015l0 == 8) {
            this.f15986U = 0;
            this.f15987V = 0;
            return;
        }
        b[] bVarArr = this.f15984S;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f15986U)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f15987V)) {
            i17 = i14;
        }
        this.f15986U = i16;
        this.f15987V = i17;
        int i18 = this.f16005g0;
        if (i17 < i18) {
            this.f15987V = i18;
        }
        int i19 = this.f16003f0;
        if (i16 < i19) {
            this.f15986U = i19;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f16019n0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.f16019n0 + " ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        if (this.f16017m0 != null) {
            str3 = "id: " + this.f16017m0 + " ";
        }
        sb2.append(str3);
        sb2.append("(");
        sb2.append(this.f15990Y);
        sb2.append(", ");
        sb2.append(this.f15991Z);
        sb2.append(") - (");
        sb2.append(this.f15986U);
        sb2.append(" x ");
        sb2.append(this.f15987V);
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public int m16405u() {
        return this.f15989X;
    }

    /* renamed from: u0 */
    public void m16406u0(boolean z10) {
        this.f15968C = z10;
    }

    /* renamed from: v */
    public int m16407v() {
        if (this.f16015l0 == 8) {
            return 0;
        }
        return this.f15987V;
    }

    /* renamed from: v0 */
    public void m16408v0(int i10) {
        this.f15987V = i10;
        int i11 = this.f16005g0;
        if (i10 < i11) {
            this.f15987V = i11;
        }
    }

    /* renamed from: w */
    public float m16409w() {
        return this.f16007h0;
    }

    /* renamed from: w0 */
    public void m16410w0(float f10) {
        this.f16007h0 = f10;
    }

    /* renamed from: x */
    public int m16411x() {
        return this.f16027r0;
    }

    /* renamed from: x0 */
    public void m16412x0(int i10) {
        this.f16027r0 = i10;
    }

    /* renamed from: y */
    public b m16413y() {
        return this.f15984S[0];
    }

    /* renamed from: y0 */
    public void m16414y0(int i10, int i11) {
        this.f15990Y = i10;
        int i12 = i11 - i10;
        this.f15986U = i12;
        int i13 = this.f16003f0;
        if (i12 < i13) {
            this.f15986U = i13;
        }
    }

    /* renamed from: z */
    public int m16415z() {
        C3859d c3859d = this.f15973H;
        int i10 = c3859d != null ? 0 + c3859d.f15949g : 0;
        C3859d c3859d2 = this.f15975J;
        return c3859d2 != null ? i10 + c3859d2.f15949g : i10;
    }

    /* renamed from: z0 */
    public void m16416z0(b bVar) {
        this.f15984S[0] = bVar;
    }
}
