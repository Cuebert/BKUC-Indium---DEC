package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0843j {

    /* renamed from: o */
    private static int f425o;

    /* renamed from: p */
    private static Field f426p;

    /* renamed from: q */
    private static Field f427q;

    /* renamed from: r */
    private static Field f428r;

    /* renamed from: n */
    private Activity f429n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f429n = activity;
    }

    /* renamed from: a */
    private static void m596a() {
        try {
            f425o = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f427q = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f428r = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f426p = declaredField3;
            declaredField3.setAccessible(true);
            f425o = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        if (bVar != AbstractC0839f.b.ON_DESTROY) {
            return;
        }
        if (f425o == 0) {
            m596a();
        }
        if (f425o == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f429n.getSystemService("input_method");
            try {
                Object obj = f426p.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f427q.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f428r.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
