package p125j4;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p027c1.C1119a;
import p027c1.C1120b;
import p027c1.C1121c;

/* renamed from: j4.a */
/* loaded from: classes.dex */
public class C3600a {

    /* renamed from: a */
    public static final TimeInterpolator f15223a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f15224b = new C1120b();

    /* renamed from: c */
    public static final TimeInterpolator f15225c = new C1119a();

    /* renamed from: d */
    public static final TimeInterpolator f15226d = new C1121c();

    /* renamed from: e */
    public static final TimeInterpolator f15227e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m15417a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    /* renamed from: b */
    public static float m15418b(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : m15417a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    /* renamed from: c */
    public static int m15419c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
