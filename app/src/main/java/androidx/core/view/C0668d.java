package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0649c;
import java.util.List;

/* renamed from: androidx.core.view.d */
/* loaded from: classes.dex */
public final class C0668d {

    /* renamed from: a */
    private final DisplayCutout f3586a;

    /* renamed from: androidx.core.view.d$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static DisplayCutout m3634a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m3635b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m3636c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m3637d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m3638e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m3639f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0668d(DisplayCutout displayCutout) {
        this.f3586a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0668d m3629e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0668d(displayCutout);
    }

    /* renamed from: a */
    public int m3630a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3636c(this.f3586a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m3631b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3637d(this.f3586a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m3632c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3638e(this.f3586a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m3633d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3639f(this.f3586a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0668d.class != obj.getClass()) {
            return false;
        }
        return C0649c.m3452a(this.f3586a, ((C0668d) obj).f3586a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3586a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3586a + "}";
    }
}
