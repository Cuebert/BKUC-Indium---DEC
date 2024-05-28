package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.internal.C1219ae;
import com.appsflyer.internal.C1224aj;
import com.appsflyer.internal.C1234at;

/* loaded from: classes.dex */
public final class AFLogger {
    private static final long values = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int AFInAppEventParameterName;

        LogLevel(int i10) {
            this.AFInAppEventParameterName = i10;
        }

        public final int getLevel() {
            return this.AFInAppEventParameterName;
        }
    }

    private static String AFInAppEventParameterName(String str, boolean z10) {
        if (str == null) {
            str = "null";
        }
        if (!z10 && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.currentTimeMillis() - values);
        sb2.append(") [");
        sb2.append(Thread.currentThread().getName());
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    public static void AFInAppEventType(String str, boolean z10) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.3.2", AFInAppEventParameterName(str, false));
        }
        if (z10) {
            C1224aj.valueOf().AFInAppEventType(null, "I", AFInAppEventParameterName(str, true));
        }
    }

    private static void AFKeystoreWrapper(String str, Throwable th, boolean z10, boolean z11) {
        if (AFInAppEventType(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(th.getClass().getSimpleName());
                sb2.append(" at ");
                sb2.append(th.getStackTrace()[0].toString());
                str = sb2.toString();
            }
            String AFInAppEventParameterName = AFInAppEventParameterName(str, false);
            if (z11) {
                Log.e("AppsFlyer_6.3.2", AFInAppEventParameterName, th);
            } else if (z10) {
                Log.d("AppsFlyer_6.3.2", AFInAppEventParameterName);
            }
        }
        C1224aj valueOf = C1224aj.valueOf();
        Throwable cause = th.getCause();
        valueOf.AFInAppEventType("exception", th.getClass().getSimpleName(), C1224aj.AFInAppEventType(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Application application = C1234at.AFInAppEventParameterName;
        if (application != null) {
            SharedPreferences.Editor edit = C1219ae.values(application).edit();
            Application application2 = C1234at.AFInAppEventParameterName;
            edit.putLong("exception_number", (application2 == null ? -1L : C1219ae.values(application2).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    public static void init(String str) {
        valueOf(str);
    }

    public static void valueOf(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.3.2", AFInAppEventParameterName(str, false));
        }
        C1224aj.valueOf().AFInAppEventType(null, "W", AFInAppEventParameterName(str, true));
    }

    public static void values(Throwable th) {
        AFKeystoreWrapper(null, th, false, false);
    }

    public static void values(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.3.2", AFInAppEventParameterName(str, false));
        }
        C1224aj.valueOf().AFInAppEventType(null, "D", AFInAppEventParameterName(str, true));
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.3.2", AFInAppEventParameterName(str, false));
        }
        C1224aj.valueOf().AFInAppEventType(null, "V", AFInAppEventParameterName(str, true));
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void AFInAppEventType(String str) {
        if (!valueOf()) {
            Log.d("AppsFlyer_6.3.2", AFInAppEventParameterName(str, false));
        }
        C1224aj.valueOf().AFInAppEventType(null, "F", str);
    }

    public static void AFInAppEventParameterName(String str, Throwable th) {
        AFKeystoreWrapper(str, th, true, true);
    }

    public static void AFInAppEventType(String str, Throwable th) {
        AFKeystoreWrapper(str, th, true, false);
    }

    public static void AFKeystoreWrapper(String str) {
        AFInAppEventType(str, true);
    }
}
