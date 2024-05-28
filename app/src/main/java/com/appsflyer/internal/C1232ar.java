package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ar */
/* loaded from: classes.dex */
public final class C1232ar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject AFKeystoreWrapper(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (jSONObject2.optBoolean("monitor", false) && !z10) {
                    C1224aj.valueOf().values();
                } else {
                    C1224aj.valueOf().AFKeystoreWrapper();
                    C1224aj.valueOf().AFInAppEventParameterName();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String optString = jSONObject2.optString("ol_scheme", null);
                String optString2 = jSONObject2.optString("ol_domain", null);
                String optString3 = jSONObject2.optString("ol_ver", null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.AFInAppEventType(th.getMessage(), th);
                C1224aj.valueOf().AFKeystoreWrapper();
                C1224aj.valueOf().AFInAppEventParameterName();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
