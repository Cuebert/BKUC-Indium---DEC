package p321z2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import p070f3.C3143q;

/* renamed from: z2.j */
/* loaded from: classes.dex */
public final class C5984j {
    /* renamed from: a */
    public static void m21277a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m21278b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m21279c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m21280d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: e */
    public static void m21281e(String str) {
        if (!C3143q.m13820a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m21282f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* renamed from: g */
    public static String m21283g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: h */
    public static void m21284h() {
        m21285i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m21285i(String str) {
        if (C3143q.m13820a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: j */
    public static <T> T m21286j(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    /* renamed from: k */
    public static <T> T m21287k(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m21288l(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m21289m(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m21290n(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
