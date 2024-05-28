package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AbstractC1260bt;
import com.appsflyer.internal.C1270d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aq */
/* loaded from: classes.dex */
public final class C1231aq extends AbstractC1246bf {
    private static String onAttributionFailure = "https://%sdlsdk.%s/v1.0/android/";
    public static long onInstallConversionDataLoadedNative;
    private boolean AppsFlyerConversionListener;
    private int AppsFlyerInAppPurchaseValidatorListener;
    private int AppsFlyerLib;
    private final List<AbstractC1260bt> onAppOpenAttribution;
    private final CountDownLatch onConversionDataSuccess;
    private final C1235au onDeepLinking;
    public int onDeepLinkingNative;
    private final JSONObject onValidateInAppFailure;

    /* renamed from: com.appsflyer.internal.aq$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AbstractC1260bt.e.values().length];
            valueOf = iArr;
            try {
                iArr[AbstractC1260bt.e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[AbstractC1260bt.e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.appsflyer.internal.aq$2 */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 implements Observer {
        private /* synthetic */ AbstractC1260bt AFInAppEventType;

        AnonymousClass2(AbstractC1260bt abstractC1260bt) {
            r2 = abstractC1260bt;
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            StringBuilder sb2 = new StringBuilder("[DDL] ");
            sb2.append(r2.AFKeystoreWrapper.get("source"));
            sb2.append(" referrer collected via observer");
            AFLogger.values(sb2.toString());
            C1231aq.this.valueOf((AbstractC1260bt) observable);
        }
    }

    /* renamed from: com.appsflyer.internal.aq$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Callable<DeepLinkResult> {
        public AnonymousClass3() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ DeepLinkResult call() throws Exception {
            Application application = C1231aq.this.valueOf;
            C1231aq.AFInAppEventParameterName(C1231aq.this);
            C1231aq.this.AFKeystoreWrapper(application);
            return C1231aq.valueOf(C1231aq.this, application);
        }
    }

    /* renamed from: com.appsflyer.internal.aq$5 */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends HashMap<String, Object> {
        AnonymousClass5() {
            put("type", "unhashed");
            put("value", C1270d.e.d.this.values);
        }
    }

    public C1231aq(Context context, C1235au c1235au) {
        super(null, onAttributionFailure, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onAppOpenAttribution = new ArrayList();
        this.onConversionDataSuccess = new CountDownLatch(1);
        this.onValidateInAppFailure = new JSONObject();
        this.onDeepLinking = c1235au;
    }

    private Map<String, Object> AFInAppEventParameterName(C1270d.e.d dVar) {
        Boolean bool;
        boolean z10 = false;
        if (dVar != null && dVar.values != null && ((bool = dVar.valueOf) == null || !bool.booleanValue())) {
            z10 = true;
        }
        if (z10) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.aq.5
                AnonymousClass5() {
                    put("type", "unhashed");
                    put("value", C1270d.e.d.this.values);
                }
            };
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AFKeystoreWrapper(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1231aq.AFKeystoreWrapper(android.content.Context):void");
    }

    private boolean valueOf() {
        List list = (List) this.AFInAppEventType.get("referrers");
        return (list != null ? list.size() : 0) < this.AppsFlyerLib && !this.AFInAppEventType.containsKey("referrers");
    }

    public final void values(DeepLinkResult deepLinkResult) {
        try {
            this.onValidateInAppFailure.put("status", deepLinkResult.getStatus().toString());
            this.onValidateInAppFailure.put("timeout_value", onInstallConversionDataLoadedNative);
        } catch (JSONException unused) {
        }
        C1235au c1235au = this.onDeepLinking;
        c1235au.valueOf.edit().putString("ddl", this.onValidateInAppFailure.toString()).apply();
        C1230ap.AFInAppEventParameterName(deepLinkResult);
    }

    static /* synthetic */ void AFInAppEventParameterName(C1231aq c1231aq) {
        ArrayList<AbstractC1260bt> arrayList = new ArrayList();
        for (AbstractC1260bt abstractC1260bt : C1219ae.values().onAppOpenAttributionNative) {
            if (abstractC1260bt != null && abstractC1260bt.AFInAppEventParameterName != AbstractC1260bt.e.NOT_STARTED) {
                arrayList.add(abstractC1260bt);
            }
        }
        c1231aq.AppsFlyerLib = arrayList.size();
        for (AbstractC1260bt abstractC1260bt2 : arrayList) {
            int i10 = AnonymousClass1.valueOf[abstractC1260bt2.AFInAppEventParameterName.ordinal()];
            if (i10 == 1) {
                StringBuilder sb2 = new StringBuilder("[DDL] ");
                sb2.append(abstractC1260bt2.AFKeystoreWrapper.get("source"));
                sb2.append(" referrer collected earlier");
                AFLogger.values(sb2.toString());
                c1231aq.valueOf(abstractC1260bt2);
            } else if (i10 == 2) {
                abstractC1260bt2.addObserver(new Observer() { // from class: com.appsflyer.internal.aq.2
                    private /* synthetic */ AbstractC1260bt AFInAppEventType;

                    AnonymousClass2(AbstractC1260bt abstractC1260bt22) {
                        r2 = abstractC1260bt22;
                    }

                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb22 = new StringBuilder("[DDL] ");
                        sb22.append(r2.AFKeystoreWrapper.get("source"));
                        sb22.append(" referrer collected via observer");
                        AFLogger.values(sb22.toString());
                        C1231aq.this.valueOf((AbstractC1260bt) observable);
                    }
                });
            }
        }
    }

    public void valueOf(AbstractC1260bt abstractC1260bt) {
        if (AFKeystoreWrapper(abstractC1260bt)) {
            this.onAppOpenAttribution.add(abstractC1260bt);
            this.onConversionDataSuccess.countDown();
            StringBuilder sb2 = new StringBuilder("[DDL] Added non-organic ");
            sb2.append(abstractC1260bt.getClass().getSimpleName());
            AFLogger.values(sb2.toString());
            return;
        }
        int i10 = this.AppsFlyerInAppPurchaseValidatorListener + 1;
        this.AppsFlyerInAppPurchaseValidatorListener = i10;
        if (i10 == this.AppsFlyerLib) {
            this.onConversionDataSuccess.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult valueOf(com.appsflyer.internal.C1231aq r9, android.content.Context r10) throws java.io.IOException, org.json.JSONException, java.lang.InterruptedException {
        /*
        L0:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r9.onDeepLinkingNative
            r3 = 1
            if (r2 != r3) goto L1e
            org.json.JSONObject r2 = r9.onValidateInAppFailure
            com.appsflyer.internal.au r4 = r9.onDeepLinking
            android.content.SharedPreferences r4 = r4.valueOf
            r5 = 0
            java.lang.String r7 = "fg_ts"
            long r4 = r4.getLong(r7, r5)
            long r4 = r0 - r4
            java.lang.String r6 = "from_fg"
            r2.put(r6, r4)
        L1e:
            com.appsflyer.internal.m r2 = new com.appsflyer.internal.m
            r2.<init>(r9)
            java.net.HttpURLConnection r2 = r2.AFInAppEventType()
            org.json.JSONObject r4 = r9.onValidateInAppFailure
            java.lang.String r5 = "net"
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            if (r4 != 0) goto L36
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
        L36:
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = r9.onDeepLinkingNative
            int r8 = r8 - r3
            long r0 = r6 - r0
            r4.put(r8, r0)
            org.json.JSONObject r0 = r9.onValidateInAppFailure
            r0.put(r5, r4)
            int r0 = r2.getResponseCode()
            r1 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r0 != r1) goto Lc2
            com.appsflyer.internal.C1219ae.values()
            java.lang.String r0 = com.appsflyer.internal.C1219ae.AFKeystoreWrapper(r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "is_second_ping"
            boolean r0 = r1.optBoolean(r0, r3)
            r9.AppsFlyerConversionListener = r0
            java.lang.String r0 = "found"
            boolean r0 = r1.optBoolean(r0)
            if (r0 != 0) goto L6e
            r0 = r4
            goto L7f
        L6e:
            java.lang.String r0 = "click_event"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            com.appsflyer.deeplink.DeepLink r0 = com.appsflyer.deeplink.DeepLink.AFInAppEventParameterName(r0)
            org.json.JSONObject r1 = r0.AFInAppEventParameterName
            java.lang.String r2 = "is_deferred"
            r1.put(r2, r3)
        L7f:
            if (r0 == 0) goto L87
            com.appsflyer.deeplink.DeepLinkResult r9 = new com.appsflyer.deeplink.DeepLinkResult
            r9.<init>(r0, r4)
            return r9
        L87:
            int r0 = r9.onDeepLinkingNative
            if (r0 > r3) goto Lbc
            boolean r0 = r9.valueOf()
            if (r0 == 0) goto Lbc
            boolean r0 = r9.AppsFlyerConversionListener
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "[DDL] Waiting for referrers..."
            com.appsflyer.AFLogger.values(r0)
            java.util.concurrent.CountDownLatch r0 = r9.onConversionDataSuccess
            r0.await()
            org.json.JSONObject r0 = r9.onValidateInAppFailure
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            java.lang.String r3 = "rfr_wait"
            r0.put(r3, r1)
            int r0 = r9.AppsFlyerInAppPurchaseValidatorListener
            int r1 = r9.AppsFlyerLib
            if (r0 != r1) goto Lb7
            com.appsflyer.deeplink.DeepLinkResult r9 = new com.appsflyer.deeplink.DeepLinkResult
            r9.<init>(r4, r4)
            return r9
        Lb7:
            r9.AFKeystoreWrapper(r10)
            goto L0
        Lbc:
            com.appsflyer.deeplink.DeepLinkResult r9 = new com.appsflyer.deeplink.DeepLinkResult
            r9.<init>(r4, r4)
            return r9
        Lc2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[DDL] Error occurred. Server response code = "
            r9.<init>(r10)
            int r10 = r2.getResponseCode()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.values(r9)
            com.appsflyer.deeplink.DeepLinkResult r9 = new com.appsflyer.deeplink.DeepLinkResult
            com.appsflyer.deeplink.DeepLinkResult$Error r10 = com.appsflyer.deeplink.DeepLinkResult.Error.HTTP_STATUS_CODE
            r9.<init>(r4, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1231aq.valueOf(com.appsflyer.internal.aq, android.content.Context):com.appsflyer.deeplink.DeepLinkResult");
    }

    private static boolean AFKeystoreWrapper(AbstractC1260bt abstractC1260bt) {
        Long l10 = (Long) abstractC1260bt.AFKeystoreWrapper.get("click_ts");
        return l10 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }
}
