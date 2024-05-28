package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.y */
/* loaded from: classes.dex */
public final class C0693y {

    /* renamed from: androidx.core.view.y$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m4024a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m4025b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m4026c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    /* renamed from: a */
    public static boolean m4023a(ViewGroup viewGroup) {
        return a.m4025b(viewGroup);
    }
}
