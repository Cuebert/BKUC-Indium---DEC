package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.ap */
/* loaded from: classes.dex */
public final class C1230ap {
    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (C1274j.AFInAppEventType().AFInAppEventParameterName != null) {
            try {
                try {
                    DeepLink valueOf = DeepLink.valueOf(map);
                    valueOf.AFInAppEventParameterName.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(valueOf, null);
                } catch (JSONException e10) {
                    AFLogger.AFInAppEventParameterName("[DDL] Error occurred", e10);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventParameterName(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventParameterName(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFInAppEventType(map);
    }

    private static void AFInAppEventType(Map<String, String> map) {
        if (C1219ae.valueOf != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.values(sb2.toString());
                C1219ae.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.AFInAppEventType(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void valueOf(String str, DeepLinkResult.Error error) {
        if (C1274j.AFInAppEventType().AFInAppEventParameterName != null) {
            AFLogger.values("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
        } else {
            AFInAppEventType(str);
        }
    }

    private static void AFInAppEventType(String str) {
        if (C1219ae.valueOf != null) {
            try {
                AFLogger.values("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                C1219ae.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.AFInAppEventType(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (C1274j.AFInAppEventType().AFInAppEventParameterName != null) {
            StringBuilder sb2 = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            AFLogger.values(sb2.toString());
            try {
                C1274j.AFInAppEventType().AFInAppEventParameterName.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.AFInAppEventType(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.values("[DDL] skipping, no callback registered");
    }
}
