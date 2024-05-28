package com.roblox.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p035c9.C1151k;

/* renamed from: com.roblox.client.i */
/* loaded from: classes.dex */
public class C2836i {

    /* renamed from: g */
    public static final String[] f11265g = {"libroblox.so", "libtrampoline.so"};

    /* renamed from: a */
    private AtomicBoolean f11266a;

    /* renamed from: b */
    private SharedPreferences f11267b;

    /* renamed from: c */
    private int f11268c;

    /* renamed from: d */
    private String f11269d;

    /* renamed from: e */
    private EnumC2838j f11270e;

    /* renamed from: f */
    private c f11271f;

    /* renamed from: com.roblox.client.i$b */
    /* loaded from: classes.dex */
    private static class b extends AsyncTask<String[], Integer, String> {

        /* renamed from: a */
        private String f11272a;

        /* renamed from: b */
        private String f11273b;

        /* renamed from: c */
        private C2836i f11274c;

        b(String str, String str2, C2836i c2836i) {
            this.f11272a = str;
            this.f11273b = str2;
            this.f11274c = c2836i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String[]... strArr) {
            InputStream inputStream;
            FileOutputStream fileOutputStream;
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr[0]));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            File file = new File(this.f11273b);
            FileOutputStream fileOutputStream2 = null;
            if (file.exists()) {
                try {
                    ZipFile zipFile = new ZipFile(file);
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    byte[] bArr = new byte[32768];
                    while (entries.hasMoreElements() && !arrayList.isEmpty()) {
                        ZipEntry nextElement = entries.nextElement();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (nextElement.getName().contains(str)) {
                                File file2 = new File(this.f11272a + "/" + str);
                                if (file2.exists()) {
                                    file2.delete();
                                }
                                try {
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        inputStream = zipFile.getInputStream(nextElement);
                                        while (true) {
                                            try {
                                                try {
                                                    int read = inputStream.read(bArr);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr, 0, read);
                                                    } else {
                                                        try {
                                                            break;
                                                        } catch (IOException e10) {
                                                            C1151k.m6709c("CrashLibFileHelper", e10.getMessage());
                                                        }
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    C1151k.m6709c("CrashLibFileHelper", e.getMessage());
                                                    this.f11274c.f11270e = EnumC2838j.ERROR_COPYING_FILE_TO_CACHE;
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e12) {
                                                            C1151k.m6709c("CrashLibFileHelper", e12.getMessage());
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (IOException e13) {
                                                            C1151k.m6709c("CrashLibFileHelper", e13.getMessage());
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                fileOutputStream2 = fileOutputStream;
                                                if (fileOutputStream2 != null) {
                                                    try {
                                                        fileOutputStream2.close();
                                                    } catch (IOException e14) {
                                                        C1151k.m6709c("CrashLibFileHelper", e14.getMessage());
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                        throw th;
                                                    } catch (IOException e15) {
                                                        C1151k.m6709c("CrashLibFileHelper", e15.getMessage());
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        fileOutputStream.close();
                                        try {
                                            inputStream.close();
                                        } catch (IOException e16) {
                                            C1151k.m6709c("CrashLibFileHelper", e16.getMessage());
                                        }
                                        it.remove();
                                    } catch (IOException e17) {
                                        e = e17;
                                        inputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = null;
                                    }
                                } catch (IOException e18) {
                                    e = e18;
                                    fileOutputStream = null;
                                    inputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = null;
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        C1151k.m6707a("CrashLibFileHelper", "Copy duration : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        this.f11274c.m12632j();
                        return this.f11272a;
                    }
                    this.f11274c.f11270e = EnumC2838j.ERROR_SO_FILE_MISSING;
                    return null;
                } catch (IOException unused) {
                    this.f11274c.f11270e = EnumC2838j.ERROR_APK_ZIP_FILE_CANT_OPEN;
                    return null;
                }
            }
            this.f11274c.f11270e = EnumC2838j.ERROR_APK_FILE_NOT_FOUND;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            this.f11274c.m12633k(str);
            synchronized (C2836i.class) {
                if (this.f11274c.f11271f != null) {
                    this.f11274c.f11271f.mo12637a(str, this.f11274c.f11270e);
                }
                this.f11274c.f11271f = null;
            }
        }
    }

    /* renamed from: com.roblox.client.i$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo12637a(String str, EnumC2838j enumC2838j);
    }

    /* renamed from: com.roblox.client.i$d */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        private static final C2836i f11275a = new C2836i();
    }

    @TargetApi(21)
    /* renamed from: g */
    private static String m12629g(String[] strArr) {
        String[] strArr2 = Build.SUPPORTED_ABIS;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (str != null) {
                for (String str2 : strArr2) {
                    if (str.contains(str2) || str.contains(str2.replace("-", "_"))) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static void m12630h(c cVar) {
        synchronized (C2836i.class) {
            C2836i c2836i = d.f11275a;
            String str = c2836i.f11269d;
            if (str == null && c2836i.f11270e == null) {
                c2836i.f11271f = cVar;
            }
            cVar.mo12637a(str, c2836i.f11270e);
        }
    }

    /* renamed from: i */
    public static void m12631i(Context context, String[] strArr, String str) throws RuntimeException {
        String m12629g;
        C2836i c2836i = d.f11275a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr2 = applicationInfo.splitSourceDirs;
        if (strArr2 != null && (m12629g = m12629g(strArr2)) != null) {
            if (!c2836i.f11266a.getAndSet(true)) {
                if (!c2836i.m12634l(context)) {
                    new b(str, m12629g, c2836i).execute(strArr);
                    return;
                } else {
                    C1151k.m6707a("CrashLibFileHelper", "SO files copied.");
                    c2836i.m12633k(str);
                    return;
                }
            }
            throw new RuntimeException("Helper inited.");
        }
        C1151k.m6707a("CrashLibFileHelper", "Use the native lib path.");
        c2836i.m12633k(applicationInfo.nativeLibraryDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m12632j() {
        SharedPreferences sharedPreferences = this.f11267b;
        if (sharedPreferences == null || this.f11268c <= 0) {
            return;
        }
        sharedPreferences.edit().putInt("latest_copied_version", this.f11268c).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m12633k(String str) {
        synchronized (C2836i.class) {
            this.f11269d = str;
        }
    }

    /* renamed from: l */
    private boolean m12634l(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            SharedPreferences sharedPreferences = context.getSharedPreferences("crash_lib_file_helper", 0);
            this.f11267b = sharedPreferences;
            this.f11268c = packageInfo.versionCode;
            return sharedPreferences.getInt("latest_copied_version", 0) == packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C1151k.m6709c("CrashLibFileHelper", e10.getMessage());
            return false;
        }
    }

    private C2836i() {
        this.f11266a = new AtomicBoolean(false);
    }
}
