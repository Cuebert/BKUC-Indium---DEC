package p070f3;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p321z2.C5984j;

/* renamed from: f3.l */
/* loaded from: classes.dex */
public class C3138l {

    /* renamed from: a */
    private static String f13149a;

    /* renamed from: b */
    private static int f13150b;

    /* renamed from: a */
    public static String m13809a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f13149a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f13149a = Application.getProcessName();
            } else {
                int i10 = f13150b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f13150b = i10;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        str = "/proc/" + i10 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            C5984j.m21286j(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            C3136j.m13796a(bufferedReader2);
                            throw th;
                        }
                        C3136j.m13796a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f13149a = str2;
            }
        }
        return f13149a;
    }
}
