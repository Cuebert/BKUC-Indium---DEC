package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0609a {

    /* renamed from: a */
    private static Method f3341a;

    /* renamed from: b */
    private static boolean f3342b;

    /* renamed from: c */
    private static Method f3343c;

    /* renamed from: d */
    private static boolean f3344d;

    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static int m3264a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m3265b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        /* renamed from: c */
        static Drawable m3266c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m3267d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m3268e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m3269a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m3270b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m3271c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m3272d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m3273e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        /* renamed from: f */
        static void m3274f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        static void m3275g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        /* renamed from: h */
        static void m3276h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m3277i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m3278a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m3279b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    /* renamed from: a */
    public static void m3246a(Drawable drawable, Resources.Theme theme) {
        b.m3269a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m3247b(Drawable drawable) {
        return b.m3270b(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m3248c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m3248c(a.m3266c((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof InterfaceC0611c) {
            m3248c(((InterfaceC0611c) drawable).mo3281b());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Drawable m3265b = a.m3265b(drawableContainerState, i10);
            if (m3265b != null) {
                m3248c(m3265b);
            }
        }
    }

    /* renamed from: d */
    public static int m3249d(Drawable drawable) {
        return a.m3264a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m3250e(Drawable drawable) {
        return b.m3271c(drawable);
    }

    /* renamed from: f */
    public static int m3251f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m3278a(drawable);
        }
        if (!f3344d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f3343c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f3344d = true;
        }
        Method method = f3343c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f3343c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m3252g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b.m3272d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m3253h(Drawable drawable) {
        return a.m3267d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m3254i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m3255j(Drawable drawable, boolean z10) {
        a.m3268e(drawable, z10);
    }

    /* renamed from: k */
    public static void m3256k(Drawable drawable, float f10, float f11) {
        b.m3273e(drawable, f10, f11);
    }

    /* renamed from: l */
    public static void m3257l(Drawable drawable, int i10, int i11, int i12, int i13) {
        b.m3274f(drawable, i10, i11, i12, i13);
    }

    /* renamed from: m */
    public static boolean m3258m(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m3279b(drawable, i10);
        }
        if (!f3342b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f3341a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f3342b = true;
        }
        Method method = f3341a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f3341a = null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m3259n(Drawable drawable, int i10) {
        b.m3275g(drawable, i10);
    }

    /* renamed from: o */
    public static void m3260o(Drawable drawable, ColorStateList colorStateList) {
        b.m3276h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m3261p(Drawable drawable, PorterDuff.Mode mode) {
        b.m3277i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m3262q(Drawable drawable) {
        return drawable instanceof InterfaceC0611c ? (T) ((InterfaceC0611c) drawable).mo3281b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m3263r(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC0610b)) ? new C0613e(drawable) : drawable;
    }
}
