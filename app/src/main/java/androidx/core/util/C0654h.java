package androidx.core.util;

import java.util.Locale;
import java.util.Objects;

/* renamed from: androidx.core.util.h */
/* loaded from: classes.dex */
public final class C0654h {
    /* renamed from: a */
    public static void m3462a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m3463b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m3464c(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: d */
    public static int m3465d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m3466e(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    /* renamed from: f */
    public static <T> T m3467f(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: g */
    public static <T> T m3468g(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m3469h(boolean z10) {
        m3470i(z10, null);
    }

    /* renamed from: i */
    public static void m3470i(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
