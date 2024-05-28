package p303xa;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xa.h */
/* loaded from: classes.dex */
public final class C5579h {

    /* renamed from: a */
    public static final C5579h f20684a = new C5579h();

    /* renamed from: b */
    private static final a f20685b = new a(null, null, null);

    /* renamed from: c */
    private static a f20686c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xa.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f20687a;

        /* renamed from: b */
        public final Method f20688b;

        /* renamed from: c */
        public final Method f20689c;

        public a(Method method, Method method2, Method method3) {
            this.f20687a = method;
            this.f20688b = method2;
            this.f20689c = method3;
        }
    }

    private C5579h() {
    }

    /* renamed from: a */
    private final a m20491a(AbstractC5572a abstractC5572a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC5572a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC5572a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20686c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f20685b;
            f20686c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m20492b(AbstractC5572a continuation) {
        C3844i.m16253f(continuation, "continuation");
        a aVar = f20686c;
        if (aVar == null) {
            aVar = m20491a(continuation);
        }
        if (aVar == f20685b) {
            return null;
        }
        Method method = aVar.f20687a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f20688b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f20689c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
