package p122j1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C3592a {

    /* renamed from: a */
    private static long f15219a;

    /* renamed from: b */
    private static Method f15220b;

    /* renamed from: a */
    public static void m15409a(String str) {
        C3593b.m15414a(str);
    }

    /* renamed from: b */
    public static void m15410b() {
        C3593b.m15415b();
    }

    /* renamed from: c */
    private static void m15411c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m15412d() {
        try {
            if (f15220b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m15413e();
    }

    /* renamed from: e */
    private static boolean m15413e() {
        try {
            if (f15220b == null) {
                f15219a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f15220b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f15220b.invoke(null, Long.valueOf(f15219a))).booleanValue();
        } catch (Exception e10) {
            m15411c("isTagEnabled", e10);
            return false;
        }
    }
}
