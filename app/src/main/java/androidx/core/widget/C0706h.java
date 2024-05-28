package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public final class C0706h {

    /* renamed from: a */
    private static Method f3724a;

    /* renamed from: b */
    private static boolean f3725b;

    /* renamed from: c */
    private static Field f3726c;

    /* renamed from: d */
    private static boolean f3727d;

    /* renamed from: androidx.core.widget.h$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m4157a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* renamed from: androidx.core.widget.h$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static boolean m4158a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m4159b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m4160c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        /* renamed from: d */
        static void m4161d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    /* renamed from: a */
    public static void m4154a(PopupWindow popupWindow, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m4160c(popupWindow, z10);
            return;
        }
        if (!f3727d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f3726c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f3727d = true;
        }
        Field field = f3726c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    /* renamed from: b */
    public static void m4155b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m4161d(popupWindow, i10);
            return;
        }
        if (!f3725b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3724a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3725b = true;
        }
        Method method = f3724a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m4156c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        a.m4157a(popupWindow, view, i10, i11, i12);
    }
}
