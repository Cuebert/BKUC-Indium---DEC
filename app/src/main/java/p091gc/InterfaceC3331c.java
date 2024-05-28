package p091gc;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: gc.c */
/* loaded from: classes.dex */
public interface InterfaceC3331c<R, T> {

    /* renamed from: gc.c$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: b */
        public static Type m14643b(int i10, ParameterizedType parameterizedType) {
            return C3353y.m14762g(i10, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m14644c(Type type) {
            return C3353y.m14763h(type);
        }

        /* renamed from: a */
        public abstract InterfaceC3331c<?, ?> mo14645a(Type type, Annotation[] annotationArr, C3349u c3349u);
    }

    /* renamed from: a */
    Type mo14641a();

    /* renamed from: b */
    T mo14642b(InterfaceC3330b<R> interfaceC3330b);
}
