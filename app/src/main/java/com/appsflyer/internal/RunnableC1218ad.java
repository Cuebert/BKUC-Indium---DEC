package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ad */
/* loaded from: classes.dex */
public final class RunnableC1218ad implements Runnable {
    private static String AFInAppEventParameterName = "https://%ssdk-services.%s/validate-android-signature";
    private static String AFInAppEventType;
    private String AFKeystoreWrapper;
    private Map<String, String> AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private WeakReference<Context> valueOf;
    private String values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%svalidate.%s/api/v");
        sb2.append(C1219ae.AFInAppEventType);
        sb2.append("/androidevent?buildnumber=6.3.2&app_id=");
        AFInAppEventType = sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1218ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.valueOf = new WeakReference<>(context);
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.init = str4;
        this.getLevel = str5;
        this.AFVersionDeclaration = str6;
        this.AFLogger$LogLevel = map;
        this.AppsFlyer2dXConversionCallback = str3;
    }

    static /* synthetic */ void AFInAppEventParameterName(RunnableC1218ad runnableC1218ad, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            C1283z.AFKeystoreWrapper((Context) weakReference.get()).AFInAppEventType();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName()));
            sb2.append(((Context) weakReference.get()).getPackageName());
            String obj = sb2.toString();
            String string = C1219ae.values((Context) weakReference.get()).getString("referrer", BuildConfig.FLAVOR);
            AbstractC1271g c1254bn = new C1254bn((Context) weakReference.get());
            c1254bn.AFVersionDeclaration = runnableC1218ad.values;
            c1254bn.init = string;
            C1219ae values = C1219ae.values();
            Map<String, Object> values2 = values.values(c1254bn);
            values2.put("price", runnableC1218ad.getLevel);
            values2.put("currency", runnableC1218ad.AFVersionDeclaration);
            values2.put("receipt_data", map);
            if (map2 != null) {
                values2.put("extra_prms", map2);
            }
            values2.putAll(values.AFInAppEventParameterName());
            C1224aj.valueOf().AFInAppEventType("server_request", obj, new JSONObject(values2).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = AFKeystoreWrapper((AbstractC1251bk) c1254bn.valueOf(values2).AFInAppEventParameterName(obj));
                int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
                String AFKeystoreWrapper = C1219ae.AFKeystoreWrapper(httpURLConnection);
                C1224aj.valueOf().AFInAppEventType("server_response", obj, String.valueOf(responseCode), AFKeystoreWrapper);
                StringBuilder sb3 = new StringBuilder("Validate-WH response - ");
                sb3.append(responseCode);
                sb3.append(": ");
                sb3.append(new JSONObject(AFKeystoreWrapper).toString());
                AFLogger.AFKeystoreWrapper(sb3.toString());
            } catch (Throwable th) {
                try {
                    AFLogger.AFInAppEventType(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }

    private static HttpURLConnection AFKeystoreWrapper(AbstractC1251bk abstractC1251bk) {
        StringBuilder sb2 = new StringBuilder("Calling ");
        sb2.append(abstractC1251bk.onAppOpenAttributionNative);
        AFLogger.values(sb2.toString());
        abstractC1251bk.onConversionDataFail = AppsFlyerLib.getInstance().isStopped();
        return new RunnableC1277m(abstractC1251bk).AFInAppEventType();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.values;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.valueOf.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.AFKeystoreWrapper);
            hashMap.put("sig-data", this.init);
            hashMap.put("signature", this.AppsFlyer2dXConversionCallback);
            final HashMap hashMap2 = new HashMap(hashMap);
            new Thread(new Runnable() { // from class: com.appsflyer.internal.ad.4
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC1218ad runnableC1218ad = RunnableC1218ad.this;
                    RunnableC1218ad.AFInAppEventParameterName(runnableC1218ad, hashMap2, runnableC1218ad.AFLogger$LogLevel, RunnableC1218ad.this.valueOf);
                }
            }).start();
            hashMap.put("dev_key", this.values);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            String jSONObject = new JSONObject(hashMap).toString();
            String format = String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName());
            C1224aj.valueOf().AFInAppEventType("server_request", format, jSONObject);
            HttpURLConnection AFKeystoreWrapper = AFKeystoreWrapper((AbstractC1251bk) new C1253bm().valueOf(hashMap).AFInAppEventParameterName(format));
            int responseCode = AFKeystoreWrapper != null ? AFKeystoreWrapper.getResponseCode() : -1;
            C1219ae.values();
            String AFKeystoreWrapper2 = C1219ae.AFKeystoreWrapper(AFKeystoreWrapper);
            C1224aj.valueOf().AFInAppEventType("server_response", format, String.valueOf(responseCode), AFKeystoreWrapper2);
            JSONObject jSONObject2 = new JSONObject(AFKeystoreWrapper2);
            jSONObject2.put("code", responseCode);
            if (responseCode == 200) {
                StringBuilder sb2 = new StringBuilder("Validate response 200 ok: ");
                sb2.append(jSONObject2.toString());
                AFLogger.AFKeystoreWrapper(sb2.toString());
                valueOf(jSONObject2.optBoolean("result"), this.init, this.getLevel, this.AFVersionDeclaration, jSONObject2.toString());
            } else {
                AFLogger.AFKeystoreWrapper("Failed Validate request");
                valueOf(false, this.init, this.getLevel, this.AFVersionDeclaration, jSONObject2.toString());
            }
            if (AFKeystoreWrapper != null) {
                AFKeystoreWrapper.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (C1219ae.values != null) {
                    AFLogger.AFInAppEventType("Failed Validate request + ex", th);
                    valueOf(false, this.init, this.getLevel, this.AFVersionDeclaration, th.getMessage());
                }
                AFLogger.AFInAppEventType(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    private static void valueOf(boolean z10, String str, String str2, String str3, String str4) {
        if (C1219ae.values != null) {
            StringBuilder sb2 = new StringBuilder("Validate callback parameters: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            AFLogger.values(sb2.toString());
            if (z10) {
                AFLogger.values("Validate in app purchase success: ".concat(String.valueOf(str4)));
                C1219ae.values.onValidateInApp();
                return;
            }
            AFLogger.values("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = C1219ae.values;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
