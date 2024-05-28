package p059e5;

import java.util.Objects;

/* renamed from: e5.g */
/* loaded from: classes.dex */
public final class C3075g {
    /* renamed from: a */
    private static String m13546a(int i10, int i11, String str) {
        if (i10 < 0) {
            return C3077i.m13560c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C3077i.m13560c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    private static String m13547b(int i10, int i11, String str) {
        if (i10 < 0) {
            return C3077i.m13560c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C3077i.m13560c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    private static String m13548c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return m13547b(i10, i12, "start index");
        }
        return (i11 < 0 || i11 > i12) ? m13547b(i11, i12, "end index") : C3077i.m13560c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    /* renamed from: d */
    public static int m13549d(int i10, int i11) {
        return m13550e(i10, i11, "index");
    }

    /* renamed from: e */
    public static int m13550e(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(m13546a(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: f */
    public static <T> T m13551f(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: g */
    public static <T> T m13552g(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static int m13553h(int i10, int i11) {
        return m13554i(i10, i11, "index");
    }

    /* renamed from: i */
    public static int m13554i(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m13547b(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: j */
    public static void m13555j(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(m13548c(i10, i11, i12));
        }
    }

    /* renamed from: k */
    public static void m13556k(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: l */
    public static void m13557l(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(C3077i.m13560c(str, obj));
        }
    }
}
