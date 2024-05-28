package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.c */
/* loaded from: classes.dex */
public class C0649c {

    /* renamed from: androidx.core.util.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m3457a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m3458b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m3452a(Object obj, Object obj2) {
        return a.m3457a(obj, obj2);
    }

    /* renamed from: b */
    public static int m3453b(Object... objArr) {
        return a.m3458b(objArr);
    }

    /* renamed from: c */
    public static <T> T m3454c(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: d */
    public static <T> T m3455d(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: e */
    public static String m3456e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
