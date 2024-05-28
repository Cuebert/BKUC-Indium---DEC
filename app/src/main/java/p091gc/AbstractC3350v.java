package p091gc;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.v */
/* loaded from: classes.dex */
public abstract class AbstractC3350v<T> {
    /* renamed from: b */
    public static <T> AbstractC3350v<T> m14754b(C3349u c3349u, Method method) {
        C3347s m14717b = C3347s.m14717b(c3349u, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!C3353y.m14765j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return AbstractC3339k.m14659f(c3349u, method, m14717b);
            }
            throw C3353y.m14768m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw C3353y.m14768m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    /* renamed from: a */
    public abstract T mo14660a(Object[] objArr);
}
