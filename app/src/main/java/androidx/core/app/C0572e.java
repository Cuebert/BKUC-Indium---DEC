package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class C0572e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static <T> T m2756a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m2757b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m2758c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m2759d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static int m2760a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        /* renamed from: b */
        static String m2761b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2762c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2753a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m2762c = b.m2762c(context);
            int m2760a = b.m2760a(m2762c, str, Binder.getCallingUid(), str2);
            return m2760a != 0 ? m2760a : b.m2760a(m2762c, str, i10, b.m2761b(context));
        }
        return m2754b(context, str, str2);
    }

    /* renamed from: b */
    public static int m2754b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m2758c((AppOpsManager) a.m2756a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m2755c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m2759d(str);
        }
        return null;
    }
}
