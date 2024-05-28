package p091gc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;

/* renamed from: gc.f */
/* loaded from: classes.dex */
public interface InterfaceC3334f<F, T> {

    /* renamed from: gc.f$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public static Type m14648a(int i10, ParameterizedType parameterizedType) {
            return C3353y.m14762g(i10, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m14649b(Type type) {
            return C3353y.m14763h(type);
        }

        /* renamed from: c */
        public InterfaceC3334f<?, AbstractC4179h0> mo14627c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3349u c3349u) {
            return null;
        }

        /* renamed from: d */
        public InterfaceC3334f<AbstractC4183j0, ?> mo14628d(Type type, Annotation[] annotationArr, C3349u c3349u) {
            return null;
        }

        /* renamed from: e */
        public InterfaceC3334f<?, String> m14650e(Type type, Annotation[] annotationArr, C3349u c3349u) {
            return null;
        }
    }

    /* renamed from: a */
    T mo14629a(F f10) throws IOException;
}
