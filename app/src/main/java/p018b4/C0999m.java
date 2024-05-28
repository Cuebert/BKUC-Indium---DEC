package p018b4;

import android.os.Bundle;

/* renamed from: b4.m */
/* loaded from: classes.dex */
public final class C0999m {
    /* renamed from: a */
    public static <T> T m6228a(Bundle bundle, String str, Class<T> cls, T t10) {
        T t11 = (T) bundle.get(str);
        if (t11 == null) {
            return t10;
        }
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t11.getClass().getCanonicalName()));
    }

    /* renamed from: b */
    public static void m6229b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
