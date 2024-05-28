package p035c9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.startup.ActivitySplash;
import java.util.List;
import p288w8.EnumC5480o;

/* renamed from: c9.m */
/* loaded from: classes.dex */
public class C1153m {
    /* renamed from: a */
    public static String m6738a(Context context) {
        return m6739b(context) ? "foreground" : "background";
    }

    /* renamed from: b */
    private static boolean m6739b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        boolean z10 = false;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equals(context.getPackageName())) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
        }
        return z10;
    }

    /* renamed from: c */
    public static void m6740c(Context context) {
        C1151k.m6712f("ProcessUtils", "restartSelf, context = " + context);
        Intent m13160C1 = ActivitySplash.m13160C1(context, EnumC5480o.APP_RESTART);
        m13160C1.setFlags(268468224);
        context.startActivity(m13160C1);
        Runtime.getRuntime().exit(0);
    }
}
