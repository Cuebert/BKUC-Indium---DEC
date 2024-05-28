package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
public final class C0576i {

    /* renamed from: androidx.core.app.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Intent m2792a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        static boolean m2793b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        static boolean m2794c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m2786a(Activity activity) {
        Intent m2792a = a.m2792a(activity);
        if (m2792a != null) {
            return m2792a;
        }
        String m2788c = m2788c(activity);
        if (m2788c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m2788c);
        try {
            if (m2789d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m2788c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m2787b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String m2789d = m2789d(context, componentName);
        if (m2789d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m2789d);
        if (m2789d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m2788c(Activity activity) {
        try {
            return m2789d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    public static String m2789d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 640;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m2790e(Activity activity, Intent intent) {
        a.m2793b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m2791f(Activity activity, Intent intent) {
        return a.m2794c(activity, intent);
    }
}
