package p056e2;

import android.os.Build;
import android.util.Log;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C3061a {
    /* renamed from: a */
    private static String m13515a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m13516b(String str, String str2, Object obj) {
        String m13519e = m13519e(str);
        if (Log.isLoggable(m13519e, 3)) {
            Log.d(m13519e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m13517c(String str, String str2, Object... objArr) {
        String m13519e = m13519e(str);
        if (Log.isLoggable(m13519e, 3)) {
            Log.d(m13519e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m13518d(String str, String str2, Throwable th) {
        String m13519e = m13519e(str);
        if (Log.isLoggable(m13519e, 6)) {
            Log.e(m13519e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m13519e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m13515a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m13520f(String str, String str2, Object obj) {
        String m13519e = m13519e(str);
        if (Log.isLoggable(m13519e, 4)) {
            Log.i(m13519e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m13521g(String str, String str2, Object obj) {
        String m13519e = m13519e(str);
        if (Log.isLoggable(m13519e, 5)) {
            Log.w(m13519e, String.format(str2, obj));
        }
    }
}
