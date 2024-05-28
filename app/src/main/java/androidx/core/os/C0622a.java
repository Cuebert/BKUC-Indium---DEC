package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
/* loaded from: classes.dex */
public class C0622a {

    /* renamed from: a */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f3375a;

    /* renamed from: b */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f3376b;

    /* renamed from: c */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f3377c;

    /* renamed from: d */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f3378d;

    /* renamed from: androidx.core.os.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        static final int f3379a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b */
        static final int f3380b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c */
        static final int f3381c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d */
        static final int f3382d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3375a = i10 >= 30 ? a.f3379a : 0;
        f3376b = i10 >= 30 ? a.f3380b : 0;
        f3377c = i10 >= 30 ? a.f3381c : 0;
        f3378d = i10 >= 30 ? a.f3382d : 0;
    }

    /* renamed from: a */
    protected static boolean m3333a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m3334b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m3335c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && m3333a("Tiramisu", Build.VERSION.CODENAME));
    }
}
