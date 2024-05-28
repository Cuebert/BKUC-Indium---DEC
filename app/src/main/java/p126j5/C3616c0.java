package p126j5;

import java.util.Objects;

/* renamed from: j5.c0 */
/* loaded from: classes.dex */
public final class C3616c0 {
    /* renamed from: a */
    public static void m15456a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m15457b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: c */
    public static <T> T m15458c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: d */
    public static void m15459d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
