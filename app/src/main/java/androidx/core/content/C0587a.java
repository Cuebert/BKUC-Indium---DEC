package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.C0581n;
import androidx.core.content.res.C0596h;
import androidx.core.os.C0622a;
import androidx.core.os.C0625d;
import androidx.core.util.C0649c;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0587a {

    /* renamed from: a */
    private static final Object f3259a = new Object();

    /* renamed from: b */
    private static final Object f3260b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m3038a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m3039b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static File m3040a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m3041b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* renamed from: c */
        static File m3042c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m3043a(Context context, int i10) {
            return context.getColor(i10);
        }

        /* renamed from: b */
        static <T> T m3044b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m3045c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static Context m3046a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m3047b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m3048c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        static Intent m3049a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C0587a.m3034h(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        }

        /* renamed from: b */
        static ComponentName m3050b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static Executor m3051a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m3027a(Context context, String str) {
        C0649c.m3455d(str, "permission must be non-null");
        if (C0622a.m3335c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C0581n.m2959b(context).m2963a() ? 0 : -1;
    }

    /* renamed from: b */
    public static Context m3028b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.m3046a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m3029c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m3043a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    /* renamed from: d */
    public static ColorStateList m3030d(Context context, int i10) {
        return C0596h.m3128d(context.getResources(), i10, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m3031e(Context context, int i10) {
        return b.m3041b(context, i10);
    }

    /* renamed from: f */
    public static Executor m3032f(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.m3051a(context);
        }
        return C0625d.m3345a(new Handler(context.getMainLooper()));
    }

    /* renamed from: g */
    public static File m3033g(Context context) {
        return b.m3042c(context);
    }

    /* renamed from: h */
    static String m3034h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C0588b.m3053b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: i */
    public static boolean m3035i(Context context, Intent[] intentArr, Bundle bundle) {
        a.m3038a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: j */
    public static void m3036j(Context context, Intent intent, Bundle bundle) {
        a.m3039b(context, intent, bundle);
    }

    /* renamed from: k */
    public static void m3037k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            e.m3050b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
