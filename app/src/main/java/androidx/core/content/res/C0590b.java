package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.C0601a;

/* renamed from: androidx.core.content.res.b */
/* loaded from: classes.dex */
final class C0590b {

    /* renamed from: a */
    static final float[][] f3270a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    static final float[][] f3271b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    static final float[] f3272c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    static final float[][] f3273d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m3070a(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3272c;
        return C0601a.m3175a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m3071b(int i10) {
        return m3072c(m3076g(i10));
    }

    /* renamed from: c */
    static float m3072c(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m3073d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: e */
    static float m3074e(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static float[] m3075f(int i10) {
        float m3074e = m3074e(Color.red(i10));
        float m3074e2 = m3074e(Color.green(i10));
        float m3074e3 = m3074e(Color.blue(i10));
        float[][] fArr = f3273d;
        return new float[]{(fArr[0][0] * m3074e) + (fArr[0][1] * m3074e2) + (fArr[0][2] * m3074e3), (fArr[1][0] * m3074e) + (fArr[1][1] * m3074e2) + (fArr[1][2] * m3074e3), (m3074e * fArr[2][0]) + (m3074e2 * fArr[2][1]) + (m3074e3 * fArr[2][2])};
    }

    /* renamed from: g */
    static float m3076g(int i10) {
        float m3074e = m3074e(Color.red(i10));
        float m3074e2 = m3074e(Color.green(i10));
        float m3074e3 = m3074e(Color.blue(i10));
        float[][] fArr = f3273d;
        return (m3074e * fArr[1][0]) + (m3074e2 * fArr[1][1]) + (m3074e3 * fArr[1][2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static float m3077h(float f10) {
        return (f10 > 8.0f ? (float) Math.pow((f10 + 16.0d) / 116.0d, 3.0d) : f10 / 903.2963f) * 100.0f;
    }
}
