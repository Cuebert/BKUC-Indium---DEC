package androidx.core.content.res;

/* renamed from: androidx.core.content.res.l */
/* loaded from: classes.dex */
final class C0600l {

    /* renamed from: k */
    static final C0600l f3306k = m3164k(C0590b.f3272c, (float) ((C0590b.m3077h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f3307a;

    /* renamed from: b */
    private final float f3308b;

    /* renamed from: c */
    private final float f3309c;

    /* renamed from: d */
    private final float f3310d;

    /* renamed from: e */
    private final float f3311e;

    /* renamed from: f */
    private final float f3312f;

    /* renamed from: g */
    private final float[] f3313g;

    /* renamed from: h */
    private final float f3314h;

    /* renamed from: i */
    private final float f3315i;

    /* renamed from: j */
    private final float f3316j;

    private C0600l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f3312f = f10;
        this.f3307a = f11;
        this.f3308b = f12;
        this.f3309c = f13;
        this.f3310d = f14;
        this.f3311e = f15;
        this.f3313g = fArr;
        this.f3314h = f16;
        this.f3315i = f17;
        this.f3316j = f18;
    }

    /* renamed from: k */
    static C0600l m3164k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = C0590b.f3270a;
        float f13 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f14 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f15 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f16 = (f12 / 10.0f) + 0.8f;
        float m3073d = ((double) f16) >= 0.9d ? C0590b.m3073d(0.59f, 0.69f, (f16 - 0.9f) * 10.0f) : C0590b.m3073d(0.525f, 0.59f, (f16 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f16;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * f10) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f10) + (0.1f * f19 * f19 * ((float) Math.cbrt(f10 * 5.0d)));
        float m3077h = C0590b.m3077h(f11) / fArr[1];
        double d11 = m3077h;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f15) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C0600l(m3077h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, m3073d, f16, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m3165a() {
        return this.f3307a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m3166b() {
        return this.f3310d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m3167c() {
        return this.f3314h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m3168d() {
        return this.f3315i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m3169e() {
        return this.f3312f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m3170f() {
        return this.f3308b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m3171g() {
        return this.f3311e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m3172h() {
        return this.f3309c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m3173i() {
        return this.f3313g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m3174j() {
        return this.f3316j;
    }
}
