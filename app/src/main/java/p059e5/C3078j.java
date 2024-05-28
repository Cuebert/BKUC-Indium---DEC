package p059e5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e5.j */
/* loaded from: classes.dex */
public final class C3078j {

    /* renamed from: a */
    private static final Object f12907a;

    /* renamed from: b */
    private static final Method f12908b;

    /* renamed from: c */
    private static final Method f12909c;

    static {
        Object m13563b = m13563b();
        f12907a = m13563b;
        f12908b = m13563b == null ? null : m13562a();
        f12909c = m13563b != null ? m13565d(m13563b) : null;
    }

    /* renamed from: a */
    private static Method m13562a() {
        return m13564c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    private static Object m13563b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m13564c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m13565d(Object obj) {
        try {
            Method m13564c = m13564c("getStackTraceDepth", Throwable.class);
            if (m13564c == null) {
                return null;
            }
            m13564c.invoke(obj, new Throwable());
            return m13564c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m13566e(Throwable th) {
        C3075g.m13551f(th);
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            return;
        }
        throw ((RuntimeException) th);
    }
}
