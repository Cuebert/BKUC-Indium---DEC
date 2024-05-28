package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.e */
/* loaded from: classes.dex */
public final class C0670e {

    /* renamed from: androidx.core.view.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3642a(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
            Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
        }

        /* renamed from: b */
        static void m3643b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
            Gravity.apply(i10, i11, i12, rect, rect2, i13);
        }

        /* renamed from: c */
        static void m3644c(int i10, Rect rect, Rect rect2, int i11) {
            Gravity.applyDisplay(i10, rect, rect2, i11);
        }
    }

    /* renamed from: a */
    public static void m3640a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        a.m3643b(i10, i11, i12, rect, rect2, i13);
    }

    /* renamed from: b */
    public static int m3641b(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
