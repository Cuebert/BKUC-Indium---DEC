package kotlin.jvm.internal;

import java.util.Arrays;
import p253ta.C4747d;
import p253ta.C4754k;

/* renamed from: kotlin.jvm.internal.i */
/* loaded from: classes.dex */
public class C3844i {
    private C3844i() {
    }

    /* renamed from: a */
    public static boolean m16248a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m16249b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m16257j(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m16250c(Object obj) {
        if (obj == null) {
            m16259l();
        }
    }

    /* renamed from: d */
    public static void m16251d(Object obj, String str) {
        if (obj == null) {
            m16260m(str);
        }
    }

    /* renamed from: e */
    public static void m16252e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m16257j(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m16253f(Object obj, String str) {
        if (obj == null) {
            m16263p(str);
        }
    }

    /* renamed from: g */
    public static void m16254g(Object obj, String str) {
        if (obj == null) {
            m16262o(str);
        }
    }

    /* renamed from: h */
    public static int m16255h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: i */
    private static String m16256i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C3844i.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: j */
    private static <T extends Throwable> T m16257j(T t10) {
        return (T) m16258k(t10, C3844i.class.getName());
    }

    /* renamed from: k */
    static <T extends Throwable> T m16258k(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    /* renamed from: l */
    public static void m16259l() {
        throw ((NullPointerException) m16257j(new NullPointerException()));
    }

    /* renamed from: m */
    public static void m16260m(String str) {
        throw ((NullPointerException) m16257j(new NullPointerException(str)));
    }

    /* renamed from: n */
    public static void m16261n() {
        throw ((C4747d) m16257j(new C4747d()));
    }

    /* renamed from: o */
    private static void m16262o(String str) {
        throw ((IllegalArgumentException) m16257j(new IllegalArgumentException(m16256i(str))));
    }

    /* renamed from: p */
    private static void m16263p(String str) {
        throw ((NullPointerException) m16257j(new NullPointerException(m16256i(str))));
    }

    /* renamed from: q */
    public static void m16264q(String str) {
        throw ((C4754k) m16257j(new C4754k(str)));
    }

    /* renamed from: r */
    public static void m16265r(String str) {
        m16264q("lateinit property " + str + " has not been initialized");
    }
}
