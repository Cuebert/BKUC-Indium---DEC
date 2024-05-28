package backtraceio.library.logger;

import android.util.Log;

/* loaded from: classes.dex */
public class BacktraceLogger {
    private static final String BASE_TAG = "BacktraceLogger: ";
    private static LogLevel logLevel = LogLevel.OFF;

    /* renamed from: d */
    public static int m6448d(String str, String str2) {
        if (logLevel.ordinal() <= LogLevel.DEBUG.ordinal()) {
            return Log.d(getTag(str), str2);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m6449e(String str, String str2) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2);
        }
        return 0;
    }

    private static String getTag(String str) {
        return BASE_TAG + str;
    }

    public static void setLevel(LogLevel logLevel2) {
        logLevel = logLevel2;
    }

    /* renamed from: w */
    public static int m6451w(String str, String str2) {
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            return Log.w(getTag(str), str2);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m6450e(String str, String str2, Throwable th) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2, th);
        }
        return 0;
    }
}
