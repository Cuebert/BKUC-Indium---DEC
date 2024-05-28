package com.Indium;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class CrashHandler {
    public static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = Thread.getDefaultUncaughtExceptionHandler();

    public static void init(final Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.Indium.CrashHandler.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                try {
                    tryUncaughtException(thread, th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    if (CrashHandler.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER != null) {
                        CrashHandler.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(thread, th);
                    } else {
                        System.exit(2);
                    }
                }
            }

            private void tryUncaughtException(Thread thread, Throwable th) {
                long j10;
                String format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
                File file = new File("/storage/emulated/0/Documents/Indium/debug_logs/", "java_crash" + format + ".logcat");
                String str = "unknown";
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    str = packageInfo.versionName;
                    j10 = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    j10 = 0;
                }
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                String stringWriter2 = stringWriter.toString();
                printWriter.close();
                try {
                    writeFile(file, "// Information //\nJava Crash.\nTime Of Crash      : " + format + "\nDevice Manufacturer: " + Build.MANUFACTURER + "\nDevice Model       : " + Build.MODEL + "\nAndroid Version    : " + Build.VERSION.RELEASE + "\nAndroid SDK        : " + Build.VERSION.SDK_INT + "\nApp VersionName    : " + str + "\nApp VersionCode    : " + j10 + "\n// Information //\n\n" + stringWriter2);
                } catch (IOException unused2) {
                }
                Logcat.dump_logs();
                System.exit(2);
            }

            private void writeFile(File file, String str) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(str.getBytes());
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
            }
        });
    }
}
