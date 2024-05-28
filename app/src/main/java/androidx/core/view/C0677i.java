package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p195p0.InterfaceMenuItemC4211b;

/* renamed from: androidx.core.view.i */
/* loaded from: classes.dex */
public final class C0677i {

    /* renamed from: androidx.core.view.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m3738a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m3739b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m3740c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m3741d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m3742e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m3743f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m3744g(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        /* renamed from: h */
        static MenuItem m3745h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m3746i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m3747j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m3748k(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        /* renamed from: l */
        static MenuItem m3749l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            return menuItem.setShortcut(c10, c11, i10, i11);
        }

        /* renamed from: m */
        static MenuItem m3750m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m3731a(MenuItem menuItem, AbstractC0664b abstractC0664b) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            return ((InterfaceMenuItemC4211b) menuItem).mo1036a(abstractC0664b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m3732b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3744g(menuItem, c10, i10);
        }
    }

    /* renamed from: c */
    public static void m3733c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3745h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m3734d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3746i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m3735e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3747j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m3736f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3748k(menuItem, c10, i10);
        }
    }

    /* renamed from: g */
    public static void m3737g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC4211b) {
            ((InterfaceMenuItemC4211b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3750m(menuItem, charSequence);
        }
    }
}
