package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.f0 */
/* loaded from: classes.dex */
public final class C0673f0 {

    /* renamed from: androidx.core.view.f0$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3652a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: androidx.core.view.f0$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m3653a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* renamed from: a */
    public static void m3651a(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m3653a(window, z10);
        } else {
            a.m3652a(window, z10);
        }
    }
}
