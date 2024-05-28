package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.h */
/* loaded from: classes.dex */
public class C0618h extends C0617g {
    @Override // androidx.core.graphics.C0617g
    /* renamed from: i */
    protected Typeface mo3306i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3366g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3372m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0617g
    /* renamed from: u */
    protected Method mo3310u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
