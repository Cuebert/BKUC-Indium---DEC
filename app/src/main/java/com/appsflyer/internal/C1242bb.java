package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C1270d;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.bb */
/* loaded from: classes.dex */
public final class C1242bb extends AbstractC1246bf {
    private static String onDeepLinkingNative;
    private final SharedPreferences onInstallConversionDataLoadedNative;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(C1219ae.AFKeystoreWrapper);
        onDeepLinkingNative = sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1242bb(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.appsflyer.internal.C1242bb.onDeepLinkingNative
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.appsflyer.AppsFlyerLib r3 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r3 = r3.getHostPrefix()
            r4 = 0
            r2[r4] = r3
            com.appsflyer.internal.ae r3 = com.appsflyer.internal.C1219ae.values()
            java.lang.String r3 = r3.getHostName()
            r4 = 1
            r2[r4] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r1 = r10.getPackageName()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.content.SharedPreferences r10 = com.appsflyer.internal.C1219ae.values(r10)
            r9.onInstallConversionDataLoadedNative = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1242bb.<init>(android.content.Context):void");
    }

    public static boolean AFInAppEventParameterName(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("An error occurred while trying to verify manifest declarations: ", th);
        }
        return C1215aa.AFInAppEventParameterName(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public void AFInAppEventType(String str) {
        Application application = this.valueOf;
        final C1219ae values = C1219ae.values();
        if (C1219ae.valueOf()) {
            AFLogger.AFInAppEventType("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String AFKeystoreWrapper = C1219ae.AFKeystoreWrapper(AppsFlyerProperties.AF_KEY);
        if (AFKeystoreWrapper == null) {
            AFLogger.init("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.AFInAppEventType.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.AFInAppEventType.put("app_version_name", packageInfo.versionName);
            this.AFInAppEventType.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j10 = packageInfo.firstInstallTime;
            this.AFInAppEventType.put("installDate", C1219ae.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j10));
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("Exception while collecting application version info.", th);
        }
        C1219ae.valueOf(application, (Map<String, ? super String>) this.AFInAppEventType);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            this.AFInAppEventType.put("appUserId", string);
        }
        try {
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.AFInAppEventType("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            this.AFInAppEventType.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        C1270d.e.d AFInAppEventParameterName = C1216ab.AFInAppEventParameterName(application.getContentResolver());
        if (AFInAppEventParameterName != null) {
            this.AFInAppEventType.put("amazon_aid", AFInAppEventParameterName.values);
            this.AFInAppEventType.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.valueOf));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.AFInAppEventType.put("advertiserId", string2);
        }
        this.AFInAppEventType.put("devkey", AFKeystoreWrapper);
        this.AFInAppEventType.put("uid", C1228an.AFKeystoreWrapper(new WeakReference(application)));
        this.AFInAppEventType.put("af_gcm_token", str);
        this.AFInAppEventType.put("launch_counter", Integer.toString(C1219ae.valueOf(this.onInstallConversionDataLoadedNative, "appsFlyerCount", false)));
        this.AFInAppEventType.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String valueOf = values.valueOf(application);
        if (valueOf != null) {
            this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, valueOf);
        }
        new Thread(new Runnable() { // from class: com.appsflyer.internal.bb.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1242bb c1242bb = C1242bb.this;
                    c1242bb.onConversionDataFail = values.isStopped();
                    HttpURLConnection AFInAppEventType = new RunnableC1277m(c1242bb).AFInAppEventType();
                    if (AFInAppEventType != null) {
                        if (AFInAppEventType.getResponseCode() == 200) {
                            C1242bb.AFInAppEventType(C1242bb.this);
                        }
                        AFInAppEventType.disconnect();
                    }
                } catch (Throwable th3) {
                    AFLogger.AFInAppEventType(th3.getMessage(), th3);
                }
            }
        }).start();
    }

    public final void valueOf(String str) {
        if (str != null) {
            AFLogger.AFKeystoreWrapper("Firebase Refreshed Token = ".concat(str));
            C1276l valueOf = valueOf();
            if (valueOf == null || !str.equals(valueOf.values)) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z10 = C1219ae.values(this.onInstallConversionDataLoadedNative) && (valueOf == null || currentTimeMillis - valueOf.valueOf > TimeUnit.SECONDS.toMillis(2L));
                AFInAppEventParameterName(new C1276l(str, currentTimeMillis, !z10));
                if (z10) {
                    AFInAppEventType(str);
                }
            }
        }
    }

    private void AFInAppEventParameterName(C1276l c1276l) {
        this.onInstallConversionDataLoadedNative.edit().putString("afUninstallToken", c1276l.values).putLong("afUninstallToken_received_time", c1276l.valueOf).putBoolean("afUninstallToken_queued", c1276l.AFInAppEventParameterName()).apply();
    }

    public C1276l valueOf() {
        String string;
        String string2;
        String string3 = this.onInstallConversionDataLoadedNative.getString("afUninstallToken", null);
        long j10 = this.onInstallConversionDataLoadedNative.getLong("afUninstallToken_received_time", 0L);
        boolean z10 = this.onInstallConversionDataLoadedNative.getBoolean("afUninstallToken_queued", false);
        this.onInstallConversionDataLoadedNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            string3 = string2.split(",")[r0.length - 1];
        }
        if (j10 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    j10 = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 != null) {
            return new C1276l(string3, j10, z10);
        }
        return null;
    }

    static /* synthetic */ void AFInAppEventType(C1242bb c1242bb) {
        c1242bb.onInstallConversionDataLoadedNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.values("Successfully registered for Uninstall Tracking");
    }
}
