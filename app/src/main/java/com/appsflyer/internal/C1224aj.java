package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aj */
/* loaded from: classes.dex */
public final class C1224aj {
    private static C1224aj valueOf = null;
    private static String values = "https://%smonitorsdk.%s/remote-debug?app_id=";
    boolean AFInAppEventParameterName;
    private JSONObject AFKeystoreWrapper;
    private boolean AFLogger$LogLevel;
    private int AppsFlyer2dXConversionCallback;
    private boolean getLevel;
    private boolean AFInAppEventType = true;
    private final List<String> AFVersionDeclaration = new ArrayList();
    private String init = "-1";

    private C1224aj() {
        this.AppsFlyer2dXConversionCallback = 0;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.AFLogger$LogLevel = z10;
        this.AFInAppEventParameterName = true ^ z10;
        this.AppsFlyer2dXConversionCallback = 0;
        this.getLevel = false;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFKeystoreWrapper.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFKeystoreWrapper.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFKeystoreWrapper.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFKeystoreWrapper.put("preInstall", str4);
        }
    }

    private boolean AFLogger$LogLevel() {
        if (this.AFInAppEventParameterName) {
            return this.AFInAppEventType || this.getLevel;
        }
        return false;
    }

    private synchronized void AFVersionDeclaration() {
        this.AFVersionDeclaration.clear();
        this.AppsFlyer2dXConversionCallback = 0;
    }

    private synchronized String init() {
        String str;
        try {
            this.AFKeystoreWrapper.put("data", new JSONArray((Collection) this.AFVersionDeclaration));
            str = this.AFKeystoreWrapper.toString();
            try {
                AFVersionDeclaration();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str = null;
        }
        return str;
    }

    public static C1224aj valueOf() {
        if (valueOf == null) {
            valueOf = new C1224aj();
        }
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFInAppEventParameterName(String str) {
        this.init = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFInAppEventType() {
        this.AFKeystoreWrapper = null;
        valueOf = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean getLevel() {
        return this.getLevel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void values() {
        this.getLevel = true;
        AFInAppEventType("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFInAppEventParameterName() {
        AFInAppEventType("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.getLevel = false;
        this.AFInAppEventType = false;
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.AFKeystoreWrapper.put("brand", str);
            this.AFKeystoreWrapper.put("model", str2);
            this.AFKeystoreWrapper.put("platform", "Android");
            this.AFKeystoreWrapper.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.AFKeystoreWrapper.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.AFKeystoreWrapper.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.AFKeystoreWrapper.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void AFInAppEventType(String str, String str2, String... strArr) {
        String obj;
        if (AFLogger$LogLevel()) {
            if (this.AppsFlyer2dXConversionCallback < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.3.2 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.3.2 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    this.AFVersionDeclaration.add(obj);
                    this.AppsFlyer2dXConversionCallback += obj.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFKeystoreWrapper() {
        this.AFInAppEventType = false;
        AFVersionDeclaration();
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        C1219ae values2 = C1219ae.values();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        if (string != null) {
            try {
                this.AFKeystoreWrapper = new JSONObject(string);
            } catch (Throwable unused) {
            }
        } else {
            this.AFKeystoreWrapper = new JSONObject();
            valueOf(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString("advertiserId"), values2.AppsFlyer2dXConversionCallback, values2.AFLogger$LogLevel);
            StringBuilder sb2 = new StringBuilder("6.3.2.");
            sb2.append(C1219ae.AFInAppEventParameterName);
            valueOf(sb2.toString(), appsFlyerProperties.getString(AppsFlyerProperties.AF_KEY), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i10 = packageManager.getPackageInfo(str, 0).versionCode;
                AFKeystoreWrapper(str, String.valueOf(i10), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", this.AFKeystoreWrapper.toString());
        }
        try {
            this.AFKeystoreWrapper.put("launch_counter", this.init);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            this.AFKeystoreWrapper.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFKeystoreWrapper.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(String str, PackageManager packageManager) {
        try {
            if (valueOf == null) {
                valueOf = new C1224aj();
            }
            valueOf.AFInAppEventType(str, packageManager);
            if (valueOf == null) {
                valueOf = new C1224aj();
            }
            String init = valueOf.init();
            C1249bi c1249bi = new C1249bi();
            c1249bi.onDeepLinkingNative = init;
            c1249bi.onConversionDataFail = AppsFlyerLib.getInstance().isStopped();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName()));
            sb2.append(str);
            new Thread(new RunnableC1277m((AbstractC1246bf) c1249bi.AFInAppEventParameterName(sb2.toString()))).start();
        } catch (Throwable th) {
            AFLogger.values(th);
        }
    }

    public static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i10 = 1; i10 < stackTraceElementArr.length; i10++) {
            strArr[i10] = stackTraceElementArr[i10].toString();
        }
        return strArr;
    }
}
