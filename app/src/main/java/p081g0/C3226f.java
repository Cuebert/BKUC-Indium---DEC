package p081g0;

import android.graphics.drawable.Drawable;

/* renamed from: g0.f */
/* loaded from: classes.dex */
class C3226f extends Drawable {

    /* renamed from: a */
    private static final double f13615a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m14414a(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f13615a) * f11)) : f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m14415b(float f10, float f11, boolean z10) {
        return z10 ? (float) ((f10 * 1.5f) + ((1.0d - f13615a) * f11)) : f10 * 1.5f;
    }
}
