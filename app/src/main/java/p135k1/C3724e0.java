package p135k1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k1.e0 */
/* loaded from: classes.dex */
class C3724e0 {

    /* renamed from: a */
    private static Method f15629a;

    /* renamed from: b */
    private static boolean f15630b;

    /* renamed from: c */
    private static Field f15631c;

    /* renamed from: d */
    private static boolean f15632d;

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m15847b() {
        if (f15630b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f15629a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
        }
        f15630b = true;
    }

    /* renamed from: a */
    public void mo15848a(View view) {
        throw null;
    }

    /* renamed from: c */
    public float mo15843c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo15849d(View view) {
        throw null;
    }

    /* renamed from: e */
    public void mo15812e(View view, int i10, int i11, int i12, int i13) {
        m15847b();
        Method method = f15629a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo15844f(View view, float f10) {
        throw null;
    }

    /* renamed from: g */
    public void mo15838g(View view, int i10) {
        if (!f15632d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f15631c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f15632d = true;
        }
        Field field = f15631c;
        if (field != null) {
            try {
                f15631c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo15809h(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: i */
    public void mo15810i(View view, Matrix matrix) {
        throw null;
    }
}
