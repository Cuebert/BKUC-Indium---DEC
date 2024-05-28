package com.roblox.client;

import android.os.AsyncTask;
import android.os.Build;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.io.File;

/* renamed from: com.roblox.client.l */
/* loaded from: classes.dex */
public class C2842l {

    /* renamed from: b */
    private static C2842l f11313b;

    /* renamed from: a */
    private boolean f11314a = false;

    /* renamed from: com.roblox.client.l$a */
    /* loaded from: classes.dex */
    class a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ c f11315a;

        a(c cVar) {
            this.f11315a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(C2842l.this.m12680e() || C2842l.this.m12681f());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            C2842l.this.f11314a = bool.booleanValue();
            c cVar = this.f11315a;
            if (cVar != null) {
                cVar.m12689a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.roblox.client.l$b */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        ARM32,
        ARM64,
        X86_64;

        /* renamed from: b */
        public static b m12688b(int i10) {
            if (i10 == 1) {
                return ARM32;
            }
            if (i10 == 2) {
                return ARM64;
            }
            if (i10 != 3) {
                return UNKNOWN;
            }
            return X86_64;
        }
    }

    /* renamed from: com.roblox.client.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void m12689a(boolean z10);
    }

    private C2842l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m12680e() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m12681f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static C2842l m12682g() {
        C2842l c2842l = f11313b;
        if (c2842l != null) {
            return c2842l;
        }
        synchronized (C2842l.class) {
            if (f11313b == null) {
                f11313b = new C2842l();
            }
        }
        return f11313b;
    }

    /* renamed from: d */
    public void m12683d(c cVar) {
        new a(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: h */
    public boolean m12684h() {
        return this.f11314a;
    }

    /* renamed from: i */
    public b m12685i() {
        return b.m12688b(NativeSettingsInterface.getRunningArchitecture());
    }
}
