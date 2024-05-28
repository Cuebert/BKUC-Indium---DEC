package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.ai */
/* loaded from: classes.dex */
public final class C1223ai {
    private static C1223ai AFInAppEventType = new C1223ai();

    private C1223ai() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C1272h> AFInAppEventParameterName(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb2 = new StringBuilder("Found cached request");
                    sb2.append(file2.getName());
                    AFLogger.AFKeystoreWrapper(sb2.toString());
                    arrayList.add(AFInAppEventParameterName(file2));
                }
            }
        } catch (Exception e10) {
            AFLogger.AFInAppEventType("Could not cache request", e10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1223ai AFKeystoreWrapper() {
        return AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb2 = new StringBuilder("Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        AFLogger.AFKeystoreWrapper(sb2.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder("Could not delete ");
                sb3.append(str);
                sb3.append(" from cache");
                AFLogger.AFInAppEventType(sb3.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File AFKeystoreWrapper(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1272h AFInAppEventParameterName(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
        } catch (Exception unused) {
            fileReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            char[] cArr = new char[(int) file.length()];
            fileReader.read(cArr);
            C1272h c1272h = new C1272h(cArr);
            c1272h.valueOf = file.getName();
            try {
                fileReader.close();
            } catch (IOException e10) {
                AFLogger.values(e10);
            }
            return c1272h;
        } catch (Exception unused2) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e11) {
                    AFLogger.values(e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (IOException e12) {
                    AFLogger.values(e12);
                }
            }
            throw th;
        }
    }
}
