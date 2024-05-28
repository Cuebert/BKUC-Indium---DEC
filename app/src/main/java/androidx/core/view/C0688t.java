package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.t */
/* loaded from: classes.dex */
public final class C0688t {

    /* renamed from: a */
    private final PointerIcon f3634a;

    /* renamed from: androidx.core.view.t$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static PointerIcon m3780a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        /* renamed from: b */
        static PointerIcon m3781b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        /* renamed from: c */
        static PointerIcon m3782c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private C0688t(PointerIcon pointerIcon) {
        this.f3634a = pointerIcon;
    }

    /* renamed from: b */
    public static C0688t m3778b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0688t(a.m3781b(context, i10));
        }
        return new C0688t(null);
    }

    /* renamed from: a */
    public Object m3779a() {
        return this.f3634a;
    }
}
