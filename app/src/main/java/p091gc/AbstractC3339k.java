package p091gc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p091gc.C3353y;
import p193ob.AbstractC4183j0;
import p193ob.C4181i0;
import p193ob.InterfaceC4176g;
import va.InterfaceC4999c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.k */
/* loaded from: classes.dex */
public abstract class AbstractC3339k<ResponseT, ReturnT> extends AbstractC3350v<ReturnT> {

    /* renamed from: a */
    private final C3347s f13867a;

    /* renamed from: b */
    private final InterfaceC4176g.a f13868b;

    /* renamed from: c */
    private final InterfaceC3334f<AbstractC4183j0, ResponseT> f13869c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.k$a */
    /* loaded from: classes.dex */
    public static final class a<ResponseT, ReturnT> extends AbstractC3339k<ResponseT, ReturnT> {

        /* renamed from: d */
        private final InterfaceC3331c<ResponseT, ReturnT> f13870d;

        a(C3347s c3347s, InterfaceC4176g.a aVar, InterfaceC3334f<AbstractC4183j0, ResponseT> interfaceC3334f, InterfaceC3331c<ResponseT, ReturnT> interfaceC3331c) {
            super(c3347s, aVar, interfaceC3334f);
            this.f13870d = interfaceC3331c;
        }

        @Override // p091gc.AbstractC3339k
        /* renamed from: c */
        protected ReturnT mo14661c(InterfaceC3330b<ResponseT> interfaceC3330b, Object[] objArr) {
            return this.f13870d.mo14642b(interfaceC3330b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.k$b */
    /* loaded from: classes.dex */
    public static final class b<ResponseT> extends AbstractC3339k<ResponseT, Object> {

        /* renamed from: d */
        private final InterfaceC3331c<ResponseT, InterfaceC3330b<ResponseT>> f13871d;

        /* renamed from: e */
        private final boolean f13872e;

        b(C3347s c3347s, InterfaceC4176g.a aVar, InterfaceC3334f<AbstractC4183j0, ResponseT> interfaceC3334f, InterfaceC3331c<ResponseT, InterfaceC3330b<ResponseT>> interfaceC3331c, boolean z10) {
            super(c3347s, aVar, interfaceC3334f);
            this.f13871d = interfaceC3331c;
            this.f13872e = z10;
        }

        @Override // p091gc.AbstractC3339k
        /* renamed from: c */
        protected Object mo14661c(InterfaceC3330b<ResponseT> interfaceC3330b, Object[] objArr) {
            InterfaceC3330b<ResponseT> mo14642b = this.f13871d.mo14642b(interfaceC3330b);
            InterfaceC4999c interfaceC4999c = (InterfaceC4999c) objArr[objArr.length - 1];
            try {
                if (this.f13872e) {
                    return C3341m.m14664b(mo14642b, interfaceC4999c);
                }
                return C3341m.m14663a(mo14642b, interfaceC4999c);
            } catch (Exception e10) {
                return C3341m.m14666d(e10, interfaceC4999c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.k$c */
    /* loaded from: classes.dex */
    public static final class c<ResponseT> extends AbstractC3339k<ResponseT, Object> {

        /* renamed from: d */
        private final InterfaceC3331c<ResponseT, InterfaceC3330b<ResponseT>> f13873d;

        c(C3347s c3347s, InterfaceC4176g.a aVar, InterfaceC3334f<AbstractC4183j0, ResponseT> interfaceC3334f, InterfaceC3331c<ResponseT, InterfaceC3330b<ResponseT>> interfaceC3331c) {
            super(c3347s, aVar, interfaceC3334f);
            this.f13873d = interfaceC3331c;
        }

        @Override // p091gc.AbstractC3339k
        /* renamed from: c */
        protected Object mo14661c(InterfaceC3330b<ResponseT> interfaceC3330b, Object[] objArr) {
            InterfaceC3330b<ResponseT> mo14642b = this.f13873d.mo14642b(interfaceC3330b);
            InterfaceC4999c interfaceC4999c = (InterfaceC4999c) objArr[objArr.length - 1];
            try {
                return C3341m.m14665c(mo14642b, interfaceC4999c);
            } catch (Exception e10) {
                return C3341m.m14666d(e10, interfaceC4999c);
            }
        }
    }

    AbstractC3339k(C3347s c3347s, InterfaceC4176g.a aVar, InterfaceC3334f<AbstractC4183j0, ResponseT> interfaceC3334f) {
        this.f13867a = c3347s;
        this.f13868b = aVar;
        this.f13869c = interfaceC3334f;
    }

    /* renamed from: d */
    private static <ResponseT, ReturnT> InterfaceC3331c<ResponseT, ReturnT> m14657d(C3349u c3349u, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC3331c<ResponseT, ReturnT>) c3349u.m14738a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw C3353y.m14769n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static <ResponseT> InterfaceC3334f<AbstractC4183j0, ResponseT> m14658e(C3349u c3349u, Method method, Type type) {
        try {
            return c3349u.m14745h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw C3353y.m14769n(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <ResponseT, ReturnT> AbstractC3339k<ResponseT, ReturnT> m14659f(C3349u c3349u, Method method, C3347s c3347s) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = c3347s.f13979k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type m14761f = C3353y.m14761f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C3353y.m14763h(m14761f) == C3348t.class && (m14761f instanceof ParameterizedType)) {
                m14761f = C3353y.m14762g(0, (ParameterizedType) m14761f);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new C3353y.b(null, InterfaceC3330b.class, m14761f);
            annotations = C3352x.m14755a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        InterfaceC3331c m14657d = m14657d(c3349u, method, genericReturnType, annotations);
        Type mo14641a = m14657d.mo14641a();
        if (mo14641a != C4181i0.class) {
            if (mo14641a != C3348t.class) {
                if (c3347s.f13971c.equals("HEAD") && !Void.class.equals(mo14641a)) {
                    throw C3353y.m14768m(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                InterfaceC3334f m14658e = m14658e(c3349u, method, mo14641a);
                InterfaceC4176g.a aVar = c3349u.f14009b;
                if (!z11) {
                    return new a(c3347s, aVar, m14658e, m14657d);
                }
                if (z10) {
                    return new c(c3347s, aVar, m14658e, m14657d);
                }
                return new b(c3347s, aVar, m14658e, m14657d, false);
            }
            throw C3353y.m14768m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw C3353y.m14768m(method, "'" + C3353y.m14763h(mo14641a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p091gc.AbstractC3350v
    /* renamed from: a */
    public final ReturnT mo14660a(Object[] objArr) {
        return mo14661c(new C3342n(this.f13867a, objArr, this.f13868b, this.f13869c), objArr);
    }

    /* renamed from: c */
    protected abstract ReturnT mo14661c(InterfaceC3330b<ResponseT> interfaceC3330b, Object[] objArr);
}
