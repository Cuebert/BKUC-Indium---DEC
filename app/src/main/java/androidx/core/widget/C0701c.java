package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C0701c {

    /* renamed from: a */
    private static Field f3721a;

    /* renamed from: b */
    private static boolean f3722b;

    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m4129a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4130b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m4131c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4132d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static Drawable m4133a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m4125a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m4133a(compoundButton);
        }
        if (!f3722b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3721a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f3722b = true;
        }
        Field field = f3721a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f3721a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m4126b(CompoundButton compoundButton) {
        return a.m4129a(compoundButton);
    }

    /* renamed from: c */
    public static void m4127c(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m4131c(compoundButton, colorStateList);
    }

    /* renamed from: d */
    public static void m4128d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m4132d(compoundButton, mode);
    }
}
