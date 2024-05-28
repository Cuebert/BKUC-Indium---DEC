package p324z5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0587a;
import p200p5.InterfaceC4271c;

/* renamed from: z5.a */
/* loaded from: classes.dex */
public class C6012a {

    /* renamed from: a */
    private final Context f22079a;

    /* renamed from: b */
    private final SharedPreferences f22080b;

    /* renamed from: c */
    private final InterfaceC4271c f22081c;

    /* renamed from: d */
    private boolean f22082d;

    public C6012a(Context context, String str, InterfaceC4271c interfaceC4271c) {
        Context m21325a = m21325a(context);
        this.f22079a = m21325a;
        this.f22080b = m21325a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f22081c = interfaceC4271c;
        this.f22082d = m21326c();
    }

    /* renamed from: a */
    private static Context m21325a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C0587a.m3028b(context);
    }

    /* renamed from: c */
    private boolean m21326c() {
        if (this.f22080b.contains("firebase_data_collection_default_enabled")) {
            return this.f22080b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m21327d();
    }

    /* renamed from: d */
    private boolean m21327d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f22079a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f22079a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m21328b() {
        return this.f22082d;
    }
}
