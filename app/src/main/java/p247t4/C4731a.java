package p247t4;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public final class C4731a {
    /* renamed from: a */
    public static float m18861a(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    /* renamed from: b */
    public static float m18862b(float f10, float f11, float f12, float f13, float f14, float f15) {
        return m18864d(m18861a(f10, f11, f12, f13), m18861a(f10, f11, f14, f13), m18861a(f10, f11, f14, f15), m18861a(f10, f11, f12, f15));
    }

    /* renamed from: c */
    public static float m18863c(float f10, float f11, float f12) {
        return ((1.0f - f12) * f10) + (f12 * f11);
    }

    /* renamed from: d */
    private static float m18864d(float f10, float f11, float f12, float f13) {
        return (f10 <= f11 || f10 <= f12 || f10 <= f13) ? (f11 <= f12 || f11 <= f13) ? f12 > f13 ? f12 : f13 : f11 : f10;
    }
}
