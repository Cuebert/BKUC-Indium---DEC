package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.f */
/* loaded from: classes.dex */
public class C0672f {

    /* renamed from: a */
    private static boolean f3587a;

    /* renamed from: b */
    private static Method f3588b;

    /* renamed from: c */
    private static boolean f3589c;

    /* renamed from: d */
    private static Field f3590d;

    /* renamed from: androidx.core.view.f$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: v */
        boolean mo2766v(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m3645a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3587a) {
            try {
                f3588b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3587a = true;
        }
        Method method = f3588b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m3646b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3645a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0690v.m3838j(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m3647c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m3650f = m3650f(dialog);
        if (m3650f != null && m3650f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0690v.m3838j(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m3648d(View view, KeyEvent keyEvent) {
        return C0690v.m3840k(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m3649e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo2766v(keyEvent);
        }
        if (callback instanceof Activity) {
            return m3646b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m3647c((Dialog) callback, keyEvent);
        }
        return (view != null && C0690v.m3838j(view, keyEvent)) || aVar.mo2766v(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m3650f(Dialog dialog) {
        if (!f3589c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3590d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3589c = true;
        }
        Field field = f3590d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
