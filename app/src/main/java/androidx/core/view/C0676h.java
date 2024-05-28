package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.h */
/* loaded from: classes.dex */
public final class C0676h {

    /* renamed from: androidx.core.view.h$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m3723a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m3724b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m3725c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m3726d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m3727e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        /* renamed from: f */
        static void m3728f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        /* renamed from: g */
        static void m3729g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        /* renamed from: h */
        static void m3730h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    /* renamed from: a */
    public static int m3719a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m3724b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m3720b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m3725c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m3721c(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.m3729g(marginLayoutParams, i10);
    }

    /* renamed from: d */
    public static void m3722d(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.m3730h(marginLayoutParams, i10);
    }
}
