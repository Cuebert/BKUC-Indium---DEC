package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p070f3.C3134h;
import p070f3.C3137k;
import p070f3.C3140n;
import p070f3.C3142p;
import p096h3.C3393c;
import p282w2.C5105c;
import p282w2.C5106d;
import p282w2.C5107e;
import p321z2.C5984j;
import p321z2.C5985j0;

/* renamed from: com.google.android.gms.common.d */
/* loaded from: classes.dex */
public class C1381d {

    /* renamed from: a */
    @Deprecated
    public static final int f6259a = 12451000;

    /* renamed from: c */
    private static boolean f6261c;

    /* renamed from: d */
    static boolean f6262d;

    /* renamed from: b */
    @Deprecated
    static final AtomicBoolean f6260b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f6263e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m7595a(Context context, int i10) throws C5106d, C5105c {
        int mo7391h = C1379b.m7589f().mo7391h(context, i10);
        if (mo7391h != 0) {
            Intent mo7387b = C1379b.m7589f().mo7387b(context, mo7391h, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + mo7391h);
            if (mo7387b == null) {
                throw new C5105c(mo7391h);
            }
            throw new C5106d(mo7391h, "Google Play Services not available", mo7387b);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m7596b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m7597c(int i10) {
        return ConnectionResult.m7377C(i10);
    }

    /* renamed from: d */
    public static Context m7598d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m7599e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m7600f(Context context) {
        try {
            if (!f6262d) {
                PackageInfo m14949d = C3393c.m14952a(context).m14949d("com.google.android.gms", 64);
                C1382e.m7607a(context);
                if (m14949d == null || C1382e.m7609e(m14949d, false) || !C1382e.m7609e(m14949d, true)) {
                    f6261c = false;
                } else {
                    f6261c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f6262d = true;
        }
        return f6261c || !C3134h.m13788b();
    }

    @Deprecated
    /* renamed from: g */
    public static int m7601g(Context context, int i10) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C5107e.f19372a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6263e.get()) {
            int m21291a = C5985j0.m21291a(context);
            if (m21291a != 0) {
                if (m21291a != f6259a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m21291a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        boolean z10 = (C3134h.m13790d(context) || C3134h.m13792f(context)) ? false : true;
        C5984j.m21277a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1382e.m7607a(context);
            if (!C1382e.m7609e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z10) {
                    C5984j.m21286j(packageInfo);
                    if (!C1382e.m7609e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else {
                    if (C3142p.m13819a(packageInfo2.versionCode) < C3142p.m13819a(i10)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m7602h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m7606l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: i */
    public static boolean m7603i(Context context) {
        if (!C3137k.m13799c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C5984j.m21286j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m7604j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: k */
    public static boolean m7605k(Context context, int i10, String str) {
        return C3140n.m13812b(context, i10, str);
    }

    @TargetApi(21)
    /* renamed from: l */
    public static boolean m7606l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C3137k.m13802f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !m7603i(context);
    }
}
