package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C0702d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m4138a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: classes.dex */
    private static class b {
        /* renamed from: a */
        public static EdgeEffect m4139a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m4140b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m4141c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m4134a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4139a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m4135b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4140b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m4136c(EdgeEffect edgeEffect, float f10, float f11) {
        a.m4138a(edgeEffect, f10, f11);
    }

    /* renamed from: d */
    public static float m4137d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4141c(edgeEffect, f10, f11);
        }
        m4136c(edgeEffect, f10, f11);
        return f10;
    }
}
