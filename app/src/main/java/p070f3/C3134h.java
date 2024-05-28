package p070f3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.C1381d;

/* renamed from: f3.h */
/* loaded from: classes.dex */
public final class C3134h {

    /* renamed from: a */
    private static Boolean f13143a;

    /* renamed from: b */
    private static Boolean f13144b;

    /* renamed from: c */
    private static Boolean f13145c;

    /* renamed from: d */
    private static Boolean f13146d;

    /* renamed from: a */
    public static boolean m13787a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13146d == null) {
            boolean z10 = false;
            if (C3137k.m13804h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f13146d = Boolean.valueOf(z10);
        }
        return f13146d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m13788b() {
        int i10 = C1381d.f6259a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    /* renamed from: c */
    public static boolean m13789c(Context context) {
        return m13793g(context.getPackageManager());
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m13790d(Context context) {
        if (m13789c(context) && !C3137k.m13803g()) {
            return true;
        }
        if (m13791e(context)) {
            return !C3137k.m13804h() || C3137k.m13807k();
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m13791e(Context context) {
        if (f13144b == null) {
            boolean z10 = false;
            if (C3137k.m13802f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f13144b = Boolean.valueOf(z10);
        }
        return f13144b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m13792f(Context context) {
        if (f13145c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f13145c = Boolean.valueOf(z10);
        }
        return f13145c.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    /* renamed from: g */
    public static boolean m13793g(PackageManager packageManager) {
        if (f13143a == null) {
            boolean z10 = false;
            if (C3137k.m13801e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f13143a = Boolean.valueOf(z10);
        }
        return f13143a.booleanValue();
    }
}
