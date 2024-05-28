package p028c2;

import java.util.Objects;

/* renamed from: c2.d */
/* loaded from: classes.dex */
public final class C1126d {
    /* renamed from: a */
    public static <T> void m6512a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m6513b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: c */
    public static <T> T m6514c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
