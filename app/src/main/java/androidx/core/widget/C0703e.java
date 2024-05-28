package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public class C0703e {

    /* renamed from: androidx.core.widget.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m4146a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4147b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m4148c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4149d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m4142a(ImageView imageView) {
        return a.m4146a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m4143b(ImageView imageView) {
        return a.m4147b(imageView);
    }

    /* renamed from: c */
    public static void m4144c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        a.m4148c(imageView, colorStateList);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || a.m4146a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: d */
    public static void m4145d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        a.m4149d(imageView, mode);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || a.m4146a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
