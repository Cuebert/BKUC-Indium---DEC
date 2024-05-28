package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ba */
/* loaded from: classes.dex */
public final class C1241ba {
    public static Map<String, Object> valueOf(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            AFLogger.AFInAppEventType(e10.getMessage(), e10);
            return null;
        }
    }

    public static void values(C1219ae c1219ae, AbstractC1271g abstractC1271g, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        if (abstractC1271g.AFKeystoreWrapper()) {
            if (C1219ae.valueOf == null) {
                AFLogger.values("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb2 = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb2.append(abstractC1271g.onInstallConversionFailureNative);
            AFLogger.values(sb2.toString());
            long j10 = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
            if (j10 != 0 && System.currentTimeMillis() - j10 > 5184000000L) {
                AFLogger.values("[GCD-E02] Cached conversion data expired");
                C1219ae.valueOf(context, "sixtyDayConversionData");
                C1219ae.AFKeystoreWrapper(context, "attributionId", (String) null);
                c1219ae.valueOf(context, "appsflyerConversionDataCacheExpiration", 0L);
            }
            if (sharedPreferences.getString("attributionId", null) == null) {
                if (th != null) {
                    StringBuilder sb3 = new StringBuilder("Launch exception: ");
                    sb3.append(th.getMessage());
                    RunnableC1239ay.AFInAppEventParameterName(sb3.toString());
                    return;
                } else if (num.intValue() != 200) {
                    RunnableC1239ay.AFInAppEventParameterName("Launch status code: ".concat(String.valueOf(num)));
                    return;
                } else {
                    RunnableC1239ay runnableC1239ay = new RunnableC1239ay(c1219ae, (Application) context.getApplicationContext(), str);
                    C1219ae.AFInAppEventType(runnableC1239ay.AFInAppEventType, runnableC1239ay, 10L, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (C1219ae.valueOf(sharedPreferences, "appsFlyerCount", false) <= 1) {
                return;
            }
            try {
                Map<String, Object> values = values(context);
                if (values == null) {
                    return;
                }
                try {
                    if (!values.containsKey("is_first_launch")) {
                        values.put("is_first_launch", Boolean.FALSE);
                    }
                    RunnableC1239ay.AFInAppEventType(values);
                } catch (Throwable th2) {
                    AFLogger.AFInAppEventType(th2.getLocalizedMessage(), th2);
                }
            } catch (C1240az e10) {
                AFLogger.AFInAppEventType(e10.getMessage(), e10);
            }
        }
    }

    public static Map<String, Object> values(Context context) throws C1240az {
        String string = C1219ae.values(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return valueOf(string);
        }
        throw new C1240az();
    }
}
