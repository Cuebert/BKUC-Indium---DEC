package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* renamed from: androidx.camera.core.q1 */
/* loaded from: classes.dex */
public final class C0463q1 {

    /* renamed from: a */
    private static int f2071a = 3;

    /* renamed from: a */
    public static void m2202a(String str, String str2) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 3)) {
            Log.d(m2211j, str2);
        }
    }

    /* renamed from: b */
    public static void m2203b(String str, String str2, Throwable th) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 3)) {
            Log.d(m2211j, str2, th);
        }
    }

    /* renamed from: c */
    public static void m2204c(String str, String str2) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 6)) {
            Log.e(m2211j, str2);
        }
    }

    /* renamed from: d */
    public static void m2205d(String str, String str2, Throwable th) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 6)) {
            Log.e(m2211j, str2, th);
        }
    }

    /* renamed from: e */
    public static void m2206e(String str, String str2) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 4)) {
            Log.i(m2211j, str2);
        }
    }

    /* renamed from: f */
    public static boolean m2207f(String str) {
        return m2208g(m2211j(str), 3);
    }

    /* renamed from: g */
    private static boolean m2208g(String str, int i10) {
        return f2071a <= i10 || Log.isLoggable(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m2209h() {
        f2071a = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m2210i(int i10) {
        f2071a = i10;
    }

    /* renamed from: j */
    private static String m2211j(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: k */
    public static void m2212k(String str, String str2) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 5)) {
            Log.w(m2211j, str2);
        }
    }

    /* renamed from: l */
    public static void m2213l(String str, String str2, Throwable th) {
        String m2211j = m2211j(str);
        if (m2208g(m2211j, 5)) {
            Log.w(m2211j, str2, th);
        }
    }
}
