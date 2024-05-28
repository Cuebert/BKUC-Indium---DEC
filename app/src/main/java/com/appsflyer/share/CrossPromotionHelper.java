package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C1219ae;
import com.appsflyer.internal.C1259bs;
import com.appsflyer.internal.C1262bv;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String valueOf = "https://%simpression.%s";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.share.CrossPromotionHelper$a */
    /* loaded from: classes.dex */
    public static class RunnableC1287a implements Runnable {
        private final boolean AFInAppEventParameterName;
        private final String AFInAppEventType;
        private final C1259bs AFKeystoreWrapper;
        private final WeakReference<Context> valueOf;

        RunnableC1287a(String str, C1259bs c1259bs, Context context, boolean z10) {
            this.AFInAppEventType = str;
            this.AFKeystoreWrapper = c1259bs;
            this.valueOf = new WeakReference<>(context);
            this.AFInAppEventParameterName = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.AFInAppEventParameterName) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.AFInAppEventType).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                    sb2.append(this.AFInAppEventType);
                    AFLogger.AFInAppEventType(sb2.toString(), false);
                } else if (responseCode != 301 && responseCode != 302) {
                    StringBuilder sb3 = new StringBuilder("call to ");
                    sb3.append(this.AFInAppEventType);
                    sb3.append(" failed: ");
                    sb3.append(responseCode);
                    AFLogger.AFKeystoreWrapper(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
                    sb4.append(this.AFInAppEventType);
                    AFLogger.AFInAppEventType(sb4.toString(), false);
                    if (this.AFKeystoreWrapper != null && this.valueOf.get() != null) {
                        this.AFKeystoreWrapper.AFInAppEventType = httpURLConnection.getHeaderField("Location");
                        C1259bs c1259bs = this.AFKeystoreWrapper;
                        Context context = this.valueOf.get();
                        if (c1259bs.AFInAppEventType != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c1259bs.AFInAppEventType)).setFlags(268435456));
                        }
                    }
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                th = th3;
                try {
                    AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }

    private static LinkGenerator AFKeystoreWrapper(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            char c10 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c10 = 1;
                }
            } else if (key.equals("app")) {
                c10 = 0;
            }
            if (c10 == 0) {
                C1262bv.AFKeystoreWrapper = value;
            } else if (c10 == 1) {
                valueOf = value;
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFKeystoreWrapper = AFKeystoreWrapper(context, str, str2, map, String.format(C1262bv.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventType("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new RunnableC1287a(AFKeystoreWrapper.generateLink(), new C1259bs(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventType("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new RunnableC1287a(AFKeystoreWrapper(context, str, str2, map, String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }
}
