package androidx.core.content.res;

import androidx.core.graphics.C0601a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.a */
/* loaded from: classes.dex */
public class C0589a {

    /* renamed from: a */
    private final float f3261a;

    /* renamed from: b */
    private final float f3262b;

    /* renamed from: c */
    private final float f3263c;

    /* renamed from: d */
    private final float f3264d;

    /* renamed from: e */
    private final float f3265e;

    /* renamed from: f */
    private final float f3266f;

    /* renamed from: g */
    private final float f3267g;

    /* renamed from: h */
    private final float f3268h;

    /* renamed from: i */
    private final float f3269i;

    C0589a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f3261a = f10;
        this.f3262b = f11;
        this.f3263c = f12;
        this.f3264d = f13;
        this.f3265e = f14;
        this.f3266f = f15;
        this.f3267g = f16;
        this.f3268h = f17;
        this.f3269i = f18;
    }

    /* renamed from: b */
    private static C0589a m3054b(float f10, float f11, float f12) {
        float f13 = 1000.0f;
        C0589a c0589a = null;
        float f14 = 1000.0f;
        float f15 = 100.0f;
        float f16 = 0.0f;
        while (Math.abs(f16 - f15) > 0.01f) {
            float f17 = ((f15 - f16) / 2.0f) + f16;
            int m3069p = m3057e(f17, f11, f10).m3069p();
            float m3071b = C0590b.m3071b(m3069p);
            float abs = Math.abs(f12 - m3071b);
            if (abs < 0.2f) {
                C0589a m3055c = m3055c(m3069p);
                float m3061a = m3055c.m3061a(m3057e(m3055c.m3066k(), m3055c.m3064i(), f10));
                if (m3061a <= 1.0f) {
                    c0589a = m3055c;
                    f13 = abs;
                    f14 = m3061a;
                }
            }
            if (f13 == 0.0f && f14 == 0.0f) {
                break;
            }
            if (m3071b < f12) {
                f16 = f17;
            } else {
                f15 = f17;
            }
        }
        return c0589a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0589a m3055c(int i10) {
        return m3056d(i10, C0600l.f3306k);
    }

    /* renamed from: d */
    static C0589a m3056d(int i10, C0600l c0600l) {
        float[] m3075f = C0590b.m3075f(i10);
        float[][] fArr = C0590b.f3270a;
        float f10 = (m3075f[0] * fArr[0][0]) + (m3075f[1] * fArr[0][1]) + (m3075f[2] * fArr[0][2]);
        float f11 = (m3075f[0] * fArr[1][0]) + (m3075f[1] * fArr[1][1]) + (m3075f[2] * fArr[1][2]);
        float f12 = (m3075f[0] * fArr[2][0]) + (m3075f[1] * fArr[2][1]) + (m3075f[2] * fArr[2][2]);
        float f13 = c0600l.m3173i()[0] * f10;
        float f14 = c0600l.m3173i()[1] * f11;
        float f15 = c0600l.m3173i()[2] * f12;
        float pow = (float) Math.pow((c0600l.m3167c() * Math.abs(f13)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c0600l.m3167c() * Math.abs(f14)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c0600l.m3167c() * Math.abs(f15)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f16 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d10)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * c0600l.m3170f()) / c0600l.m3165a(), c0600l.m3166b() * c0600l.m3174j())) * 100.0f;
        float m3168d = c0600l.m3168d() * (4.0f / c0600l.m3166b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c0600l.m3165a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0600l.m3169e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0600l.m3171g()) * c0600l.m3172h()) * ((float) Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float m3168d2 = pow5 * c0600l.m3168d();
        float sqrt = ((float) Math.sqrt((r2 * c0600l.m3166b()) / (c0600l.m3165a() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m3168d2) + 1.0f)) * 43.85965f;
        double d11 = f22;
        return new C0589a(f21, pow5, pow4, m3168d, m3168d2, sqrt, f23, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* renamed from: e */
    private static C0589a m3057e(float f10, float f11, float f12) {
        return m3058f(f10, f11, f12, C0600l.f3306k);
    }

    /* renamed from: f */
    private static C0589a m3058f(float f10, float f11, float f12, C0600l c0600l) {
        float m3166b = (4.0f / c0600l.m3166b()) * ((float) Math.sqrt(f10 / 100.0d)) * (c0600l.m3165a() + 4.0f) * c0600l.m3168d();
        float m3168d = f11 * c0600l.m3168d();
        float sqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c0600l.m3166b()) / (c0600l.m3165a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((m3168d * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C0589a(f12, f11, f10, m3166b, m3168d, sqrt, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m3059m(float f10, float f11, float f12) {
        return m3060n(f10, f11, f12, C0600l.f3306k);
    }

    /* renamed from: n */
    static int m3060n(float f10, float f11, float f12, C0600l c0600l) {
        if (f11 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
            float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
            float f13 = f11;
            C0589a c0589a = null;
            float f14 = 0.0f;
            boolean z10 = true;
            while (Math.abs(f14 - f11) >= 0.4f) {
                C0589a m3054b = m3054b(min, f13, f12);
                if (z10) {
                    if (m3054b != null) {
                        return m3054b.m3068o(c0600l);
                    }
                    z10 = false;
                } else if (m3054b == null) {
                    f11 = f13;
                } else {
                    f14 = f13;
                    c0589a = m3054b;
                }
                f13 = ((f11 - f14) / 2.0f) + f14;
            }
            if (c0589a == null) {
                return C0590b.m3070a(f12);
            }
            return c0589a.m3068o(c0600l);
        }
        return C0590b.m3070a(f12);
    }

    /* renamed from: a */
    float m3061a(C0589a c0589a) {
        float m3067l = m3067l() - c0589a.m3067l();
        float m3062g = m3062g() - c0589a.m3062g();
        float m3063h = m3063h() - c0589a.m3063h();
        return (float) (Math.pow(Math.sqrt((m3067l * m3067l) + (m3062g * m3062g) + (m3063h * m3063h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m3062g() {
        return this.f3268h;
    }

    /* renamed from: h */
    float m3063h() {
        return this.f3269i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m3064i() {
        return this.f3262b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m3065j() {
        return this.f3261a;
    }

    /* renamed from: k */
    float m3066k() {
        return this.f3263c;
    }

    /* renamed from: l */
    float m3067l() {
        return this.f3267g;
    }

    /* renamed from: o */
    int m3068o(C0600l c0600l) {
        float pow = (float) Math.pow(((((double) m3064i()) == 0.0d || ((double) m3066k()) == 0.0d) ? 0.0f : m3064i() / ((float) Math.sqrt(m3066k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c0600l.m3169e()), 0.73d), 1.1111111111111112d);
        double m3065j = (m3065j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + m3065j) + 3.8d)) * 0.25f;
        float m3165a = c0600l.m3165a() * ((float) Math.pow(m3066k() / 100.0d, (1.0d / c0600l.m3166b()) / c0600l.m3174j()));
        float m3171g = cos * 3846.1538f * c0600l.m3171g() * c0600l.m3172h();
        float m3170f = m3165a / c0600l.m3170f();
        float sin = (float) Math.sin(m3065j);
        float cos2 = (float) Math.cos(m3065j);
        float f10 = (((0.305f + m3170f) * 23.0f) * pow) / (((m3171g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f11 = cos2 * f10;
        float f12 = f10 * sin;
        float f13 = m3170f * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float signum = Math.signum(f14) * (100.0f / c0600l.m3167c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float signum2 = Math.signum(f15) * (100.0f / c0600l.m3167c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float signum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / c0600l.m3167c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r6) * 27.13d) / (400.0d - Math.abs(r6))), 2.380952380952381d));
        float f16 = signum / c0600l.m3173i()[0];
        float f17 = signum2 / c0600l.m3173i()[1];
        float f18 = signum3 / c0600l.m3173i()[2];
        float[][] fArr = C0590b.f3271b;
        return C0601a.m3175a((fArr[0][0] * f16) + (fArr[0][1] * f17) + (fArr[0][2] * f18), (fArr[1][0] * f16) + (fArr[1][1] * f17) + (fArr[1][2] * f18), (f16 * fArr[2][0]) + (f17 * fArr[2][1]) + (f18 * fArr[2][2]));
    }

    /* renamed from: p */
    int m3069p() {
        return m3068o(C0600l.f3306k);
    }
}
