package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.k */
/* loaded from: classes.dex */
public final class C0632k {

    /* renamed from: a */
    private static long f3397a;

    /* renamed from: b */
    private static Method f3398b;

    /* renamed from: c */
    private static Method f3399c;

    /* renamed from: d */
    private static Method f3400d;

    /* renamed from: e */
    private static Method f3401e;

    /* renamed from: androidx.core.os.k$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3362a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m3363b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3397a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3398b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3399c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3400d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3401e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* renamed from: a */
    public static void m3360a(String str) {
        a.m3362a(str);
    }

    /* renamed from: b */
    public static void m3361b() {
        a.m3363b();
    }
}
