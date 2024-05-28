package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AbstractC1260bt;
import com.appsflyer.internal.C1221ag;
import com.appsflyer.internal.C1229ao;
import com.appsflyer.internal.C1270d;
import com.appsflyer.internal.C1276l;
import com.appsflyer.internal.C1279v;
import com.appsflyer.internal.C1282y;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.C1342a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ae */
/* loaded from: classes.dex */
public final class C1219ae extends AppsFlyerLib {
    static final String AFInAppEventParameterName = "113";
    public static final String AFInAppEventType = "6.3";
    public static final String AFKeystoreWrapper;
    private static String onAppOpenAttribution = null;
    private static String onAttributionFailure = null;
    private static String onAttributionFailureNative = null;
    private static String onConversionDataFail = null;
    private static C1219ae onConversionDataSuccess = null;
    private static final String onDeepLinkingNative;
    private static String onInstallConversionDataLoadedNative = null;
    private static String onInstallConversionFailureNative = "https://%sstats.%s/stats";
    public static AppsFlyerConversionListener valueOf;
    static AppsFlyerInAppPurchaseValidatorListener values;
    String AFLogger$LogLevel;
    long AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    private long AppsFlyerConversionListener;
    private Map<Long, String> getInstance;
    public String[] getLevel;
    public C1235au init;
    public AbstractC1260bt[] onAppOpenAttributionNative;
    private boolean onPause;
    private SharedPreferences sendPushNotificationData;
    private C1236av setAdditionalData;
    private Map<String, Object> setCustomerIdAndLogSession;
    private String setCustomerUserId;
    private boolean setDebugLog;
    private Application setImeiData;
    private long stop;
    private String updateServerUninstallToken;
    private Map<String, Object> waitForCustomerUserId;
    private long onDeepLinking = -1;
    private long AppsFlyerInAppPurchaseValidatorListener = -1;
    private long AppsFlyerLib = TimeUnit.SECONDS.toMillis(5);
    private boolean onValidateInApp = false;
    private ScheduledExecutorService onValidateInAppFailure = null;
    private boolean getSdkVersion = false;
    private final C1226al enableLocationCollection = new C1226al();
    private boolean setAndroidIdData = false;
    private boolean setOaidData = false;
    private boolean setPhoneNumber = false;
    private boolean getOutOfStore = false;
    private final JSONObject setUserEmails = new JSONObject();
    private final Executor setAppInviteOneLink = Executors.newSingleThreadExecutor();

    /* renamed from: com.appsflyer.internal.ae$1 */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 implements C1279v.d {
        private /* synthetic */ long AFKeystoreWrapper;

        AnonymousClass1(long j10) {
            r2 = j10;
        }

        @Override // com.appsflyer.internal.C1279v.d
        public final void AFInAppEventParameterName(String str, String str2) {
            C1219ae.this.setCustomerIdAndLogSession.put("signedData", str);
            C1219ae.this.setCustomerIdAndLogSession.put("signature", str2);
            C1219ae.this.setCustomerIdAndLogSession.put("ttr", Long.valueOf(System.currentTimeMillis() - r2));
            AFLogger.AFKeystoreWrapper("Successfully retrieved Google LVL data.");
        }

        @Override // com.appsflyer.internal.C1279v.d
        public final void AFKeystoreWrapper(String str, Exception exc) {
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            C1219ae.this.setCustomerIdAndLogSession.put("error", message);
            AFLogger.AFInAppEventParameterName(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ae$2 */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 implements Runnable {

        /* renamed from: com.appsflyer.internal.ae$2$2 */
        /* loaded from: classes.dex */
        final class RunnableC60412 implements Runnable {
            RunnableC60412() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1248bh c1248bh = new C1248bh();
                    Application application = C1219ae.this.setImeiData;
                    if (application != null) {
                        c1248bh.valueOf = (Application) application.getApplicationContext();
                    }
                    C1219ae c1219ae = C1219ae.this;
                    if (c1219ae.AFInAppEventParameterName(c1248bh, C1219ae.values(c1219ae.setImeiData))) {
                        C1219ae.AFKeystoreWrapper(C1219ae.this, c1248bh);
                    }
                } catch (Throwable th) {
                    AFLogger.AFInAppEventType(th.getMessage(), th);
                }
            }
        }

        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1275k.valueOf == null) {
                C1275k.valueOf = new C1275k();
            }
            C1219ae.AFInAppEventType(C1275k.valueOf.AFInAppEventParameterName(), new Runnable() { // from class: com.appsflyer.internal.ae.2.2
                RunnableC60412() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1248bh c1248bh = new C1248bh();
                        Application application = C1219ae.this.setImeiData;
                        if (application != null) {
                            c1248bh.valueOf = (Application) application.getApplicationContext();
                        }
                        C1219ae c1219ae = C1219ae.this;
                        if (c1219ae.AFInAppEventParameterName(c1248bh, C1219ae.values(c1219ae.setImeiData))) {
                            C1219ae.AFKeystoreWrapper(C1219ae.this, c1248bh);
                        }
                    } catch (Throwable th) {
                        AFLogger.AFInAppEventType(th.getMessage(), th);
                    }
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.appsflyer.internal.ae$3 */
    /* loaded from: classes.dex */
    final class AnonymousClass3 implements Runnable {
        private /* synthetic */ Intent AFInAppEventType;
        private /* synthetic */ Context valueOf;

        AnonymousClass3(Intent intent, Context context) {
            r2 = intent;
            r3 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1274j.AFInAppEventType();
            Intent intent = r2;
            Context context = r3;
            C1219ae c1219ae = C1219ae.this;
            if (c1219ae.init == null) {
                c1219ae.init = new C1235au(context);
            }
            C1235au c1235au = c1219ae.init;
            Uri AFInAppEventType = C1274j.AFInAppEventType(intent);
            boolean z10 = (AFInAppEventType == null || AFInAppEventType.toString().isEmpty()) ? false : true;
            if (C1219ae.values(context).getBoolean("ddl_sent", false) && !z10) {
                C1230ap.valueOf("No direct deep link", null);
            } else {
                C1274j.AFInAppEventType().AFKeystoreWrapper(new HashMap(), c1235au, intent, context);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ae$4 */
    /* loaded from: classes.dex */
    final class AnonymousClass4 implements C1276l.a {
        private /* synthetic */ long valueOf;

        AnonymousClass4(long j10) {
            r2 = j10;
        }

        @Override // com.appsflyer.internal.C1276l.a
        public final void AFInAppEventType(String str, String str2, String str3) {
            if (str != null) {
                AFLogger.AFKeystoreWrapper("Facebook Deferred AppLink data received: ".concat(str));
                C1219ae.this.waitForCustomerUserId.put("link", str);
                if (str2 != null) {
                    C1219ae.this.waitForCustomerUserId.put("target_url", str2);
                }
                if (str3 != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("promo_code", str3);
                    hashMap.put("deeplink_context", hashMap2);
                    C1219ae.this.waitForCustomerUserId.put("extras", hashMap);
                }
            } else {
                C1219ae.this.waitForCustomerUserId.put("link", BuildConfig.FLAVOR);
            }
            C1219ae.this.waitForCustomerUserId.put("ttr", String.valueOf(System.currentTimeMillis() - r2));
        }

        @Override // com.appsflyer.internal.C1276l.a
        public final void values(String str) {
            C1219ae.this.waitForCustomerUserId.put("error", str);
        }
    }

    /* renamed from: com.appsflyer.internal.ae$5 */
    /* loaded from: classes.dex */
    final class AnonymousClass5 implements Runnable {
        private /* synthetic */ C1255bo valueOf;

        AnonymousClass5(C1255bo c1255bo) {
            r2 = c1255bo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SharedPreferences values = C1219ae.values(C1219ae.this.setImeiData);
            int valueOf = C1219ae.valueOf(values, "appsFlyerCount", false);
            boolean z10 = values.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
            boolean z11 = r2.AFInAppEventParameterName == AbstractC1260bt.e.NOT_STARTED;
            if (valueOf == 1) {
                if (z11 || z10) {
                    C1219ae c1219ae = C1219ae.this;
                    C1248bh c1248bh = new C1248bh();
                    Application application = C1219ae.this.setImeiData;
                    if (application != null) {
                        c1248bh.valueOf = (Application) application.getApplicationContext();
                    }
                    C1219ae.AFKeystoreWrapper(c1219ae, c1248bh);
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ae$8 */
    /* loaded from: classes.dex */
    final class AnonymousClass8 implements C1221ag.b {
        private /* synthetic */ String AFKeystoreWrapper;
        private /* synthetic */ AppsFlyerRequestListener valueOf;

        AnonymousClass8(String str, AppsFlyerRequestListener appsFlyerRequestListener) {
            r2 = str;
            r3 = appsFlyerRequestListener;
        }

        @Override // com.appsflyer.internal.C1221ag.b
        public final void AFKeystoreWrapper(Activity activity) {
            C1219ae.this.AppsFlyerConversionListener = System.currentTimeMillis();
            C1219ae c1219ae = C1219ae.this;
            if (c1219ae.init == null) {
                c1219ae.init = new C1235au(activity);
            }
            C1235au c1235au = c1219ae.init;
            if (c1235au.AFInAppEventType()) {
                c1235au.valueOf.edit().putLong("fg_ts", System.currentTimeMillis()).apply();
            }
            int valueOf = C1219ae.valueOf(C1219ae.values(activity), "appsFlyerCount", false);
            if (valueOf == 0) {
                try {
                    C1219ae.this.setUserEmails.put("init_to_fg", C1219ae.this.AppsFlyerConversionListener - c1235au.valueOf.getLong("init_ts", 0L));
                } catch (JSONException unused) {
                }
            }
            AFLogger.AFKeystoreWrapper("onBecameForeground");
            if (valueOf < 2) {
                C1283z AFKeystoreWrapper = C1283z.AFKeystoreWrapper(activity);
                AFKeystoreWrapper.valueOf.post(AFKeystoreWrapper.AFVersionDeclaration);
                AFKeystoreWrapper.valueOf.post(AFKeystoreWrapper.AFKeystoreWrapper);
            }
            C1252bl c1252bl = new C1252bl();
            C1274j.AFInAppEventType().AFKeystoreWrapper(c1252bl.AFInAppEventType(), c1235au, activity.getIntent(), activity.getApplication());
            C1219ae c1219ae2 = C1219ae.this;
            c1252bl.valueOf = (Application) activity.getApplicationContext();
            c1252bl.AFVersionDeclaration = r2;
            c1252bl.AFKeystoreWrapper = r3;
            c1219ae2.values(c1252bl, activity);
        }

        @Override // com.appsflyer.internal.C1221ag.b
        public final void values(Context context) {
            AFLogger.AFKeystoreWrapper("onBecameBackground");
            C1219ae.this.stop = System.currentTimeMillis();
            long j10 = C1219ae.this.stop - C1219ae.this.AppsFlyerConversionListener;
            if (j10 > 0 && j10 < 1000) {
                j10 = 1000;
            }
            C1219ae c1219ae = C1219ae.this;
            if (c1219ae.init == null) {
                c1219ae.init = new C1235au(context);
            }
            c1219ae.init.valueOf.edit().putLong("prev_session_dur", TimeUnit.MILLISECONDS.toSeconds(j10)).apply();
            AFLogger.AFKeystoreWrapper("callStatsBackground background call");
            C1219ae.this.AFKeystoreWrapper(new WeakReference<>(context));
            C1224aj valueOf = C1224aj.valueOf();
            if (valueOf.getLevel()) {
                valueOf.AFInAppEventParameterName();
                if (context != null) {
                    C1224aj.valueOf(context.getPackageName(), context.getPackageManager());
                }
                valueOf.AFInAppEventType();
            } else {
                AFLogger.values("RD status is OFF");
            }
            if (C1275k.valueOf == null) {
                C1275k.valueOf = new C1275k();
            }
            C1275k c1275k = C1275k.valueOf;
            try {
                C1275k.AFKeystoreWrapper(c1275k.values);
                Executor executor = c1275k.AFKeystoreWrapper;
                if (executor instanceof ThreadPoolExecutor) {
                    C1275k.AFKeystoreWrapper((ThreadPoolExecutor) executor);
                }
            } catch (Throwable th) {
                AFLogger.AFInAppEventType("failed to stop Executors", th);
            }
            C1283z AFKeystoreWrapper = C1283z.AFKeystoreWrapper(context);
            AFKeystoreWrapper.valueOf.post(AFKeystoreWrapper.AFVersionDeclaration);
        }
    }

    /* renamed from: com.appsflyer.internal.ae$9 */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] AFInAppEventType;
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
            int[] iArr2 = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventType = iArr2;
            try {
                iArr2[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AFInAppEventType[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ae$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private final AbstractC1271g AFInAppEventParameterName;

        /* synthetic */ c(C1219ae c1219ae, AbstractC1271g abstractC1271g, byte b10) {
            this(abstractC1271g);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1219ae.AFKeystoreWrapper(C1219ae.this, this.AFInAppEventParameterName);
        }

        private c(AbstractC1271g abstractC1271g) {
            this.AFInAppEventParameterName = abstractC1271g;
        }
    }

    /* renamed from: com.appsflyer.internal.ae$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        private final AbstractC1271g AFInAppEventType;

        /* synthetic */ d(C1219ae c1219ae, AbstractC1271g abstractC1271g, byte b10) {
            this(abstractC1271g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
        /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Writer] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v37 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0218 -> B:64:0x021c). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 590
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1219ae.d.run():void");
        }

        private d(AbstractC1271g abstractC1271g) {
            this.AFInAppEventType = abstractC1271g;
        }
    }

    /* renamed from: com.appsflyer.internal.ae$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        private final Application valueOf;

        public e(Context context) {
            this.valueOf = (Application) context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1219ae.this.onValidateInApp) {
                return;
            }
            C1219ae.this.AFVersionDeclaration = System.currentTimeMillis();
            C1219ae.this.onValidateInApp = true;
            try {
                try {
                    String AFKeystoreWrapper = C1219ae.AFKeystoreWrapper(AppsFlyerProperties.AF_KEY);
                    C1223ai.AFKeystoreWrapper();
                    for (C1272h c1272h : C1223ai.AFInAppEventParameterName(this.valueOf)) {
                        StringBuilder sb2 = new StringBuilder("resending request: ");
                        sb2.append(c1272h.AFInAppEventParameterName);
                        AFLogger.AFKeystoreWrapper(sb2.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(c1272h.valueOf, 10);
                            C1219ae c1219ae = C1219ae.this;
                            C1245be c1245be = new C1245be();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c1272h.AFInAppEventParameterName);
                            sb3.append("&isCachedRequest=true&timeincache=");
                            sb3.append((currentTimeMillis - parseLong) / 1000);
                            AbstractC1271g AFInAppEventParameterName = c1245be.AFInAppEventParameterName(sb3.toString());
                            AFInAppEventParameterName.AppsFlyer2dXConversionCallback = c1272h.values();
                            AFInAppEventParameterName.AFVersionDeclaration = AFKeystoreWrapper;
                            Application application = this.valueOf;
                            if (application != null) {
                                AFInAppEventParameterName.valueOf = (Application) application.getApplicationContext();
                            }
                            AFInAppEventParameterName.getLevel = c1272h.valueOf;
                            AFInAppEventParameterName.onAttributionFailureNative = false;
                            C1219ae.valueOf(c1219ae, AFInAppEventParameterName);
                        } catch (Exception e10) {
                            AFLogger.AFInAppEventType("Failed to resend cached request", e10);
                        }
                    }
                } catch (Exception e11) {
                    AFLogger.AFInAppEventType("failed to check cache. ", e11);
                }
                C1219ae.this.onValidateInApp = false;
                C1219ae.this.onValidateInAppFailure.shutdown();
                C1219ae.AppsFlyer2dXConversionCallback(C1219ae.this);
            } catch (Throwable th) {
                C1219ae.this.onValidateInApp = false;
                throw th;
            }
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFInAppEventType);
        sb2.append("/androidevent?buildnumber=6.3.2&app_id=");
        AFKeystoreWrapper = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb3.append(AFInAppEventType);
        sb3.append("/android?buildnumber=6.3.2&app_id=");
        onInstallConversionDataLoadedNative = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AFInAppEventType);
        sb4.append("/androidevent?app_id=");
        String obj = sb4.toString();
        onDeepLinkingNative = obj;
        StringBuilder sb5 = new StringBuilder("https://%sconversions.%s/api/v");
        sb5.append(obj);
        onAttributionFailureNative = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%slaunches.%s/api/v");
        sb6.append(obj);
        onAppOpenAttribution = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sinapps.%s/api/v");
        sb7.append(obj);
        onConversionDataFail = sb7.toString();
        StringBuilder sb8 = new StringBuilder("https://%sattr.%s/api/v");
        sb8.append(obj);
        onAttributionFailure = sb8.toString();
        values = null;
        valueOf = null;
        onConversionDataSuccess = new C1219ae();
    }

    public C1219ae() {
        AFVersionDeclaration.init();
    }

    static /* synthetic */ ScheduledExecutorService AppsFlyer2dXConversionCallback(C1219ae c1219ae) {
        c1219ae.onValidateInAppFailure = null;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = C1274j.AFInAppEventType().getLevel;
        if (list.contains(asList)) {
            return;
        }
        list.add(asList);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "anonymizeUser", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        C1274j AFInAppEventType2 = C1274j.AFInAppEventType();
        AFInAppEventType2.AFVersionDeclaration = str;
        AFInAppEventType2.AFLogger$LogLevel = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        this.setPhoneNumber = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib enableLocationCollection(boolean z10) {
        this.getSdkVersion = z10;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "getAppsFlyerUID", new String[0]);
        return C1228an.AFKeystoreWrapper(new WeakReference(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            return new C1222ah(context).AFInAppEventParameterName();
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : "appsflyer.com";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : BuildConfig.FLAVOR;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String AFKeystoreWrapper2 = context == null ? null : AFKeystoreWrapper("AF_STORE", context.getPackageManager(), context.getPackageName());
        if (AFKeystoreWrapper2 != null) {
            return AFKeystoreWrapper2;
        }
        AFLogger.AFKeystoreWrapper("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb2 = new StringBuilder("version: 6.3.2 (build ");
        sb2.append(AFInAppEventParameterName);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventType("Could not check if app is pre installed", e10);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isStopped() {
        return this.setOaidData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        C1250bj c1250bj = new C1250bj();
        if (context != null) {
            c1250bj.valueOf = (Application) context.getApplicationContext();
        }
        c1250bj.AFLogger$LogLevel = str;
        c1250bj.values = map == null ? null : new HashMap(map);
        c1250bj.AFKeystoreWrapper = appsFlyerRequestListener;
        C1224aj valueOf2 = C1224aj.valueOf();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = c1250bj.values;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        valueOf2.AFInAppEventType("public_api_call", "logEvent", strArr);
        if (str != null) {
            C1283z.AFKeystoreWrapper(context).AFInAppEventType();
        }
        values(c1250bj, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d11));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        AFKeystoreWrapper(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "logSession", new String[0]);
        C1224aj.valueOf().AFInAppEventParameterName = false;
        AFKeystoreWrapper(context, (String) null, (Map<String, Object>) null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        C1221ag.b bVar = C1221ag.AFInAppEventParameterName;
        if (bVar != null) {
            bVar.values(context);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri == null || uri.toString().isEmpty()) {
            StringBuilder sb2 = new StringBuilder("Link is \"");
            sb2.append(uri);
            sb2.append("\"");
            C1230ap.valueOf(sb2.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        if (context == null) {
            StringBuilder sb3 = new StringBuilder("Context is \"");
            sb3.append(context);
            sb3.append("\"");
            C1230ap.valueOf(sb3.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        C1274j.AFInAppEventType().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        if (intent == null) {
            C1230ap.valueOf("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else if (context == null) {
            C1230ap.valueOf("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            this.setAppInviteOneLink.execute(new Runnable() { // from class: com.appsflyer.internal.ae.3
                private /* synthetic */ Intent AFInAppEventType;
                private /* synthetic */ Context valueOf;

                AnonymousClass3(Intent intent2, Context context2) {
                    r2 = intent2;
                    r3 = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1274j.AFInAppEventType();
                    Intent intent2 = r2;
                    Context context2 = r3;
                    C1219ae c1219ae = C1219ae.this;
                    if (c1219ae.init == null) {
                        c1219ae.init = new C1235au(context2);
                    }
                    C1235au c1235au = c1219ae.init;
                    Uri AFInAppEventType2 = C1274j.AFInAppEventType(intent2);
                    boolean z10 = (AFInAppEventType2 == null || AFInAppEventType2.toString().isEmpty()) ? false : true;
                    if (C1219ae.values(context2).getBoolean("ddl_sent", false) && !z10) {
                        C1230ap.valueOf("No direct deep link", null);
                    } else {
                        C1274j.AFInAppEventType().AFKeystoreWrapper(new HashMap(), c1235au, intent2, context2);
                    }
                }
            });
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            valueOf = appsFlyerConversionListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.values("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.values("registerValidatorListener null listener");
        } else {
            values = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        C1247bg c1247bg = new C1247bg();
        if (context != null) {
            c1247bg.valueOf = (Application) context.getApplicationContext();
        }
        c1247bg.values = map;
        Application application = c1247bg.valueOf;
        String format = String.format(onInstallConversionDataLoadedNative, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(format);
        sb2.append(application.getPackageName());
        String obj = sb2.toString();
        SharedPreferences values2 = values(application);
        int valueOf2 = valueOf(values2, "appsFlyerCount", false);
        int valueOf3 = valueOf(values2, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", c1247bg.values);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf3));
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        hashMap.put("af_key", string);
        hashMap.put("launch_counter", Integer.valueOf(valueOf2));
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", C1228an.AFKeystoreWrapper(new WeakReference(application)));
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string3 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (string3 != null) {
            hashMap.put("advertiserIdEnabled", string3);
        }
        if (string2 != null) {
            hashMap.put("advertiserId", string2);
        }
        hashMap.put("device", Build.DEVICE);
        values(application, hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            long j10 = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(j10)));
            String string4 = values2.getString("appsFlyerFirstInstall", null);
            if (string4 == null) {
                string4 = AFInAppEventParameterName(simpleDateFormat, application);
            }
            hashMap.put("first_launch_date", string4);
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("AdRevenue - Exception while collecting app version data ", th);
        }
        AbstractC1271g valueOf4 = c1247bg.AFInAppEventParameterName(obj).valueOf(hashMap);
        valueOf4.onInstallConversionFailureNative = valueOf2;
        valueOf4.AFVersionDeclaration = string;
        d dVar = new d(this, valueOf4, (byte) 0);
        if (C1275k.valueOf == null) {
            C1275k.valueOf = new C1275k();
        }
        AFInAppEventType(C1275k.valueOf.AFInAppEventParameterName(), dVar, 1L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1219ae.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        if (map != null) {
            C1224aj.valueOf().AFInAppEventType("public_api_call", "setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setAndroidIdData", str);
        this.AFLogger$LogLevel = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setAppInviteOneLink", str);
        AFLogger.AFKeystoreWrapper("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setCollectAndroidID", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setCollectIMEI", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setCollectOaid", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            if (valueOf()) {
                setCustomerUserId(str);
                StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
                sb2.append(str);
                sb2.append(" - Initializing AppsFlyer Tacking");
                AFLogger.AFInAppEventType(sb2.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                if (referrer == null) {
                    referrer = BuildConfig.FLAVOR;
                }
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                C1252bl c1252bl = new C1252bl();
                c1252bl.valueOf = (Application) context.getApplicationContext();
                c1252bl.AFLogger$LogLevel = null;
                c1252bl.AFVersionDeclaration = string;
                c1252bl.values = null;
                c1252bl.init = referrer;
                c1252bl.AFInAppEventParameterName = null;
                AFInAppEventType(c1252bl);
                return;
            }
            setCustomerUserId(str);
            AFLogger.AFInAppEventType("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setCustomerUserId", str);
        AFLogger.AFKeystoreWrapper("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        setLogLevel(z10 ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        AFLogger.values("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        C1216ab.AFInAppEventType = Boolean.valueOf(!z10);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 != null && !str2.isEmpty()) {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        } else {
            AFLogger.init("hostName cannot be null or empty");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setImeiData", str);
        this.AppsFlyer2dXConversionCallback = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "log", String.valueOf(logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        this.AppsFlyerLib = TimeUnit.SECONDS.toMillis(i10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setOaidData", str);
        C1216ab.valueOf = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFLogger.values(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        C1274j.AppsFlyer2dXConversionCallback = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.AFInAppEventType("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.valueOf("Cannot set setOutOfStore with null");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        if (this.setAdditionalData == null) {
            this.setAdditionalData = new C1236av();
        }
        C1236av c1236av = this.setAdditionalData;
        if (str != null && !str.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("Setting partner data for ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(map);
                AFLogger.values(sb2.toString());
                int length = new JSONObject(map).toString().length();
                if (length > 1000) {
                    AFLogger.init("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    c1236av.AFKeystoreWrapper.put(str, hashMap);
                    return;
                }
                c1236av.valueOf.put(str, map);
                c1236av.AFKeystoreWrapper.remove(str);
                return;
            }
            AFLogger.init(c1236av.valueOf.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
            return;
        }
        AFLogger.init("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        this.setCustomerUserId = C1220af.values(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.values("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e10) {
                AFLogger.AFInAppEventType(e10.getMessage(), e10);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
        } else {
            AFLogger.init("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.values(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        C1274j.AFKeystoreWrapper = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilter(String... strArr) {
        if (strArr == null || Arrays.equals(this.getLevel, new String[]{"all"})) {
            return;
        }
        Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.init("Invalid partner name :".concat(String.valueOf(str)));
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            this.getLevel = null;
        } else {
            this.getLevel = (String[]) arrayList.toArray(new String[0]);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForAllPartners() {
        this.getLevel = new String[]{"all"};
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        start(context, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        this.setOaidData = z10;
        C1223ai.AFKeystoreWrapper();
        try {
            File AFKeystoreWrapper2 = C1223ai.AFKeystoreWrapper(context);
            if (!AFKeystoreWrapper2.exists()) {
                AFKeystoreWrapper2.mkdir();
            } else {
                for (File file : AFKeystoreWrapper2.listFiles()) {
                    StringBuilder sb2 = new StringBuilder("Found cached request");
                    sb2.append(file.getName());
                    AFLogger.AFKeystoreWrapper(sb2.toString());
                    C1223ai.valueOf(C1223ai.AFInAppEventParameterName(file).valueOf, context);
                }
            }
        } catch (Exception e10) {
            AFLogger.AFInAppEventType("Could not cache request", e10);
        }
        if (this.setOaidData) {
            SharedPreferences.Editor edit = values(context).edit();
            edit.putBoolean("is_stop_tracking_used", true);
            edit.apply();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        C1224aj.valueOf().AFInAppEventType("public_api_call", "unregisterConversionListener", new String[0]);
        valueOf = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        new C1242bb(context).valueOf(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C1224aj valueOf2 = C1224aj.valueOf();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? BuildConfig.FLAVOR : map.toString();
        valueOf2.AFInAppEventType("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            AFLogger.AFKeystoreWrapper(sb2.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            Context applicationContext = context.getApplicationContext();
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            new Thread(new RunnableC1218ad(applicationContext, string, str, str2, str3, str4, str5, map)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = values;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        AFLogger.AFInAppEventType("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
    }

    private static boolean AFInAppEventType(String str, boolean z10) {
        return AppsFlyerProperties.getInstance().getBoolean(str, z10);
    }

    private boolean AFLogger$LogLevel() {
        Map<String, Object> map = this.setCustomerIdAndLogSession;
        return (map == null || map.isEmpty()) ? false : true;
    }

    private static float AFVersionDeclaration(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (intExtra / intExtra2) * 100.0f;
        } catch (Throwable th) {
            AFLogger.AFInAppEventType(th.getMessage(), th);
            return 1.0f;
        }
    }

    private static boolean AppsFlyer2dXConversionCallback(Context context) {
        return (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !AFLogger$LogLevel(context);
    }

    private static boolean getLevel(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e10) {
                    AFLogger.AFInAppEventType("Failed collecting ivc data", e10);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e11) {
                    AFLogger.AFInAppEventType("Failed collecting ivc data", e11);
                }
            }
        }
        return false;
    }

    public static C1219ae values() {
        return onConversionDataSuccess;
    }

    public final void AFInAppEventParameterName(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.init("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e10) {
                AFLogger.AFInAppEventType("Error parsing JSON for preinstall", e10);
            }
        }
        AFLogger.AFKeystoreWrapper("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.AFKeystoreWrapper("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            SharedPreferences.Editor edit = values(context).edit();
            edit.putString("referrer", stringExtra2);
            edit.apply();
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra2);
            appsFlyerProperties.valueOf = stringExtra2;
            if (AppsFlyerProperties.getInstance().values()) {
                AFLogger.AFKeystoreWrapper("onReceive: isLaunchCalled");
                C1244bd c1244bd = new C1244bd();
                if (context != null) {
                    c1244bd.valueOf = (Application) context.getApplicationContext();
                }
                c1244bd.init = stringExtra2;
                if (stringExtra2.length() <= 5 || !AFInAppEventParameterName(c1244bd, values(context))) {
                    return;
                }
                if (C1275k.valueOf == null) {
                    C1275k.valueOf = new C1275k();
                }
                AFInAppEventType(C1275k.valueOf.AFInAppEventParameterName(), new c(this, c1244bd, (byte) 0), 5L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (this.setDebugLog) {
            return this;
        }
        this.setDebugLog = true;
        if (context != null) {
            if (this.init == null) {
                this.init = new C1235au(context);
            }
            C1235au c1235au = this.init;
            if (c1235au.AFInAppEventType()) {
                c1235au.valueOf.edit().putLong("init_ts", System.currentTimeMillis()).apply();
            }
            this.setImeiData = (Application) context.getApplicationContext();
            C1255bo c1255bo = new C1255bo(new Runnable() { // from class: com.appsflyer.internal.ae.2

                /* renamed from: com.appsflyer.internal.ae$2$2 */
                /* loaded from: classes.dex */
                final class RunnableC60412 implements Runnable {
                    RunnableC60412() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C1248bh c1248bh = new C1248bh();
                            Application application = C1219ae.this.setImeiData;
                            if (application != null) {
                                c1248bh.valueOf = (Application) application.getApplicationContext();
                            }
                            C1219ae c1219ae = C1219ae.this;
                            if (c1219ae.AFInAppEventParameterName(c1248bh, C1219ae.values(c1219ae.setImeiData))) {
                                C1219ae.AFKeystoreWrapper(C1219ae.this, c1248bh);
                            }
                        } catch (Throwable th) {
                            AFLogger.AFInAppEventType(th.getMessage(), th);
                        }
                    }
                }

                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (C1275k.valueOf == null) {
                        C1275k.valueOf = new C1275k();
                    }
                    C1219ae.AFInAppEventType(C1275k.valueOf.AFInAppEventParameterName(), new Runnable() { // from class: com.appsflyer.internal.ae.2.2
                        RunnableC60412() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                C1248bh c1248bh = new C1248bh();
                                Application application = C1219ae.this.setImeiData;
                                if (application != null) {
                                    c1248bh.valueOf = (Application) application.getApplicationContext();
                                }
                                C1219ae c1219ae = C1219ae.this;
                                if (c1219ae.AFInAppEventParameterName(c1248bh, C1219ae.values(c1219ae.setImeiData))) {
                                    C1219ae.AFKeystoreWrapper(C1219ae.this, c1248bh);
                                }
                            } catch (Throwable th) {
                                AFLogger.AFInAppEventType(th.getMessage(), th);
                            }
                        }
                    }, 0L, TimeUnit.MILLISECONDS);
                }
            });
            AnonymousClass5 anonymousClass5 = new Runnable() { // from class: com.appsflyer.internal.ae.5
                private /* synthetic */ C1255bo valueOf;

                AnonymousClass5(C1255bo c1255bo2) {
                    r2 = c1255bo2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences values2 = C1219ae.values(C1219ae.this.setImeiData);
                    int valueOf2 = C1219ae.valueOf(values2, "appsFlyerCount", false);
                    boolean z10 = values2.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    boolean z11 = r2.AFInAppEventParameterName == AbstractC1260bt.e.NOT_STARTED;
                    if (valueOf2 == 1) {
                        if (z11 || z10) {
                            C1219ae c1219ae = C1219ae.this;
                            C1248bh c1248bh = new C1248bh();
                            Application application = C1219ae.this.setImeiData;
                            if (application != null) {
                                c1248bh.valueOf = (Application) application.getApplicationContext();
                            }
                            C1219ae.AFKeystoreWrapper(c1219ae, c1248bh);
                        }
                    }
                }
            };
            AbstractC1260bt[] abstractC1260btArr = {c1255bo2, new C1258br(anonymousClass5), new C1263bw(anonymousClass5)};
            this.onAppOpenAttributionNative = abstractC1260btArr;
            for (AbstractC1260bt abstractC1260bt : abstractC1260btArr) {
                abstractC1260bt.AFInAppEventParameterName(this.setImeiData);
            }
            this.getOutOfStore = AFInAppEventType(context);
            C1234at.AFInAppEventParameterName = this.setImeiData;
        } else {
            AFLogger.init("context is null, Google Install Referrer will be not initialized");
        }
        C1224aj valueOf2 = C1224aj.valueOf();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        valueOf2.AFInAppEventType("public_api_call", "init", strArr);
        AFLogger.AFInAppEventType(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.3.2", AFInAppEventParameterName));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        C1227am.valueOf(str);
        valueOf = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        start(context, str, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j10) {
        C1274j.AFInAppEventType().AFInAppEventParameterName = deepLinkListener;
        C1231aq.onInstallConversionDataLoadedNative = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ae$6 */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 implements C1229ao.b {
        private /* synthetic */ Map valueOf;

        AnonymousClass6(Map map) {
            r1 = map;
        }

        @Override // com.appsflyer.internal.C1229ao.b
        public final void AFInAppEventParameterName(Map<String, String> map) {
            for (String str : map.keySet()) {
                r1.put(str, map.get(str));
            }
            C1230ap.AFInAppEventParameterName((Map<String, String>) r1);
        }

        @Override // com.appsflyer.internal.C1229ao.b
        public final void AFInAppEventParameterName(String str) {
            C1230ap.valueOf(str, DeepLinkResult.Error.NETWORK);
        }
    }

    private boolean AFInAppEventType(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            long currentTimeMillis = System.currentTimeMillis();
            this.setCustomerIdAndLogSession = new ConcurrentHashMap();
            AnonymousClass1 anonymousClass1 = new C1279v.d() { // from class: com.appsflyer.internal.ae.1
                private /* synthetic */ long AFKeystoreWrapper;

                AnonymousClass1(long currentTimeMillis2) {
                    r2 = currentTimeMillis2;
                }

                @Override // com.appsflyer.internal.C1279v.d
                public final void AFInAppEventParameterName(String str, String str2) {
                    C1219ae.this.setCustomerIdAndLogSession.put("signedData", str);
                    C1219ae.this.setCustomerIdAndLogSession.put("signature", str2);
                    C1219ae.this.setCustomerIdAndLogSession.put("ttr", Long.valueOf(System.currentTimeMillis() - r2));
                    AFLogger.AFKeystoreWrapper("Successfully retrieved Google LVL data.");
                }

                @Override // com.appsflyer.internal.C1279v.d
                public final void AFKeystoreWrapper(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    C1219ae.this.setCustomerIdAndLogSession.put("error", message);
                    AFLogger.AFInAppEventParameterName(str, exc);
                }
            };
            try {
                try {
                    Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                    Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                    cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis2), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.v.2
                        public AnonymousClass2() {
                        }

                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr) {
                            if (method.getName().equals("onLvlResult")) {
                                String str = objArr[0] != null ? (String) objArr[0] : null;
                                String str2 = objArr[1] != null ? (String) objArr[1] : null;
                                d dVar = d.this;
                                if (dVar == null) {
                                    AFLogger.values("onLvlResult invocation succeeded, but listener is null");
                                } else if (str != null && str2 != null) {
                                    dVar.AFInAppEventParameterName(str, str2);
                                } else if (str2 == null) {
                                    dVar.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                } else {
                                    dVar.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                }
                            } else if (method.getName().equals("onLvlFailure")) {
                                d dVar2 = d.this;
                                if (dVar2 != null) {
                                    if (objArr[0] != null) {
                                        dVar2.AFKeystoreWrapper("onLvlFailure with exception", (Exception) objArr[0]);
                                    } else {
                                        dVar2.AFKeystoreWrapper("onLvlFailure", new Exception("unknown"));
                                    }
                                } else {
                                    AFLogger.values("onLvlFailure: listener is null");
                                }
                            } else {
                                d dVar3 = d.this;
                                if (dVar3 != null) {
                                    dVar3.AFKeystoreWrapper("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                }
                            }
                            return null;
                        }
                    }));
                } catch (NoSuchMethodException e10) {
                    anonymousClass1.AFKeystoreWrapper(e10.getClass().getSimpleName(), e10);
                } catch (InvocationTargetException e11) {
                    anonymousClass1.AFKeystoreWrapper(e11.getClass().getSimpleName(), e11);
                }
            } catch (ClassNotFoundException e12) {
                anonymousClass1.AFKeystoreWrapper(e12.getClass().getSimpleName(), e12);
            } catch (IllegalAccessException e13) {
                anonymousClass1.AFKeystoreWrapper(e13.getClass().getSimpleName(), e13);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static boolean AFLogger$LogLevel(Context context) {
        try {
            if (C1342a.m7385o().mo7390g(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventType("WARNING:  Google Play Services is unavailable. ", e10);
            return false;
        }
    }

    public static void valueOf(Context context, String str) {
        SharedPreferences.Editor edit = values(context).edit();
        edit.putBoolean(str, true);
        edit.apply();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        if (C1221ag.AFInAppEventParameterName != null) {
            return;
        }
        if (!this.setDebugLog) {
            AFLogger.init("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C1238ax.AFKeystoreWrapper);
                    return;
                }
                return;
            }
        }
        this.setImeiData = (Application) context.getApplicationContext();
        C1224aj.valueOf().AFInAppEventType("public_api_call", "start", str);
        String str2 = AFInAppEventParameterName;
        AFLogger.AFKeystoreWrapper(String.format("Starting AppsFlyer: (v%s.%s)", "6.3.2", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        AFLogger.AFKeystoreWrapper(sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.setImeiData.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
            C1227am.valueOf(str);
        } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY))) {
            AFLogger.init("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C1238ax.AFKeystoreWrapper);
                return;
            }
            return;
        }
        Context baseContext = this.setImeiData.getBaseContext();
        try {
            if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                    AFLogger.AFInAppEventType("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.valueOf("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
            }
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder("checkBackupRules Exception: ");
            sb3.append(e10.toString());
            AFLogger.AFInAppEventParameterName(sb3.toString());
        }
        if (this.setPhoneNumber) {
            Context applicationContext = this.setImeiData.getApplicationContext();
            this.waitForCustomerUserId = new HashMap();
            AnonymousClass4 anonymousClass4 = new C1276l.a() { // from class: com.appsflyer.internal.ae.4
                private /* synthetic */ long valueOf;

                AnonymousClass4(long j10) {
                    r2 = j10;
                }

                @Override // com.appsflyer.internal.C1276l.a
                public final void AFInAppEventType(String str3, String str22, String str32) {
                    if (str3 != null) {
                        AFLogger.AFKeystoreWrapper("Facebook Deferred AppLink data received: ".concat(str3));
                        C1219ae.this.waitForCustomerUserId.put("link", str3);
                        if (str22 != null) {
                            C1219ae.this.waitForCustomerUserId.put("target_url", str22);
                        }
                        if (str32 != null) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("promo_code", str32);
                            hashMap.put("deeplink_context", hashMap2);
                            C1219ae.this.waitForCustomerUserId.put("extras", hashMap);
                        }
                    } else {
                        C1219ae.this.waitForCustomerUserId.put("link", BuildConfig.FLAVOR);
                    }
                    C1219ae.this.waitForCustomerUserId.put("ttr", String.valueOf(System.currentTimeMillis() - r2));
                }

                @Override // com.appsflyer.internal.C1276l.a
                public final void values(String str3) {
                    C1219ae.this.waitForCustomerUserId.put("error", str3);
                }
            };
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, applicationContext);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.l.5
                    private /* synthetic */ Class AFInAppEventParameterName;
                    private /* synthetic */ a values;

                    public AnonymousClass5(Class cls3, a anonymousClass42) {
                        r1 = cls3;
                        r2 = anonymousClass42;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String str3;
                        String str4;
                        String str5;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            if (objArr[0] != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", new Class[0]).invoke(r1.cast(objArr[0]), new Object[0]));
                                if (bundle2 != null) {
                                    str4 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                    str5 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    str3 = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                                } else {
                                    str3 = null;
                                    str4 = null;
                                    str5 = null;
                                }
                                a aVar = r2;
                                if (aVar != null) {
                                    aVar.AFInAppEventType(str4, str5, str3);
                                }
                            } else {
                                a aVar2 = r2;
                                if (aVar2 != null) {
                                    aVar2.AFInAppEventType(null, null, null);
                                }
                            }
                            return null;
                        }
                        a aVar3 = r2;
                        if (aVar3 != null) {
                            aVar3.values("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    anonymousClass42.values("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, applicationContext, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e11) {
                anonymousClass42.values(e11.toString());
            } catch (IllegalAccessException e12) {
                anonymousClass42.values(e12.toString());
            } catch (NoSuchMethodException e13) {
                anonymousClass42.values(e13.toString());
            } catch (InvocationTargetException e14) {
                anonymousClass42.values(e14.toString());
            }
        }
        C1221ag.valueOf(context, new C1221ag.b() { // from class: com.appsflyer.internal.ae.8
            private /* synthetic */ String AFKeystoreWrapper;
            private /* synthetic */ AppsFlyerRequestListener valueOf;

            AnonymousClass8(String str3, AppsFlyerRequestListener appsFlyerRequestListener2) {
                r2 = str3;
                r3 = appsFlyerRequestListener2;
            }

            @Override // com.appsflyer.internal.C1221ag.b
            public final void AFKeystoreWrapper(Activity activity) {
                C1219ae.this.AppsFlyerConversionListener = System.currentTimeMillis();
                C1219ae c1219ae = C1219ae.this;
                if (c1219ae.init == null) {
                    c1219ae.init = new C1235au(activity);
                }
                C1235au c1235au = c1219ae.init;
                if (c1235au.AFInAppEventType()) {
                    c1235au.valueOf.edit().putLong("fg_ts", System.currentTimeMillis()).apply();
                }
                int valueOf2 = C1219ae.valueOf(C1219ae.values(activity), "appsFlyerCount", false);
                if (valueOf2 == 0) {
                    try {
                        C1219ae.this.setUserEmails.put("init_to_fg", C1219ae.this.AppsFlyerConversionListener - c1235au.valueOf.getLong("init_ts", 0L));
                    } catch (JSONException unused) {
                    }
                }
                AFLogger.AFKeystoreWrapper("onBecameForeground");
                if (valueOf2 < 2) {
                    C1283z AFKeystoreWrapper2 = C1283z.AFKeystoreWrapper(activity);
                    AFKeystoreWrapper2.valueOf.post(AFKeystoreWrapper2.AFVersionDeclaration);
                    AFKeystoreWrapper2.valueOf.post(AFKeystoreWrapper2.AFKeystoreWrapper);
                }
                C1252bl c1252bl = new C1252bl();
                C1274j.AFInAppEventType().AFKeystoreWrapper(c1252bl.AFInAppEventType(), c1235au, activity.getIntent(), activity.getApplication());
                C1219ae c1219ae2 = C1219ae.this;
                c1252bl.valueOf = (Application) activity.getApplicationContext();
                c1252bl.AFVersionDeclaration = r2;
                c1252bl.AFKeystoreWrapper = r3;
                c1219ae2.values(c1252bl, activity);
            }

            @Override // com.appsflyer.internal.C1221ag.b
            public final void values(Context context2) {
                AFLogger.AFKeystoreWrapper("onBecameBackground");
                C1219ae.this.stop = System.currentTimeMillis();
                long j10 = C1219ae.this.stop - C1219ae.this.AppsFlyerConversionListener;
                if (j10 > 0 && j10 < 1000) {
                    j10 = 1000;
                }
                C1219ae c1219ae = C1219ae.this;
                if (c1219ae.init == null) {
                    c1219ae.init = new C1235au(context2);
                }
                c1219ae.init.valueOf.edit().putLong("prev_session_dur", TimeUnit.MILLISECONDS.toSeconds(j10)).apply();
                AFLogger.AFKeystoreWrapper("callStatsBackground background call");
                C1219ae.this.AFKeystoreWrapper(new WeakReference<>(context2));
                C1224aj valueOf2 = C1224aj.valueOf();
                if (valueOf2.getLevel()) {
                    valueOf2.AFInAppEventParameterName();
                    if (context2 != null) {
                        C1224aj.valueOf(context2.getPackageName(), context2.getPackageManager());
                    }
                    valueOf2.AFInAppEventType();
                } else {
                    AFLogger.values("RD status is OFF");
                }
                if (C1275k.valueOf == null) {
                    C1275k.valueOf = new C1275k();
                }
                C1275k c1275k = C1275k.valueOf;
                try {
                    C1275k.AFKeystoreWrapper(c1275k.values);
                    Executor executor = c1275k.AFKeystoreWrapper;
                    if (executor instanceof ThreadPoolExecutor) {
                        C1275k.AFKeystoreWrapper((ThreadPoolExecutor) executor);
                    }
                } catch (Throwable th) {
                    AFLogger.AFInAppEventType("failed to stop Executors", th);
                }
                C1283z AFKeystoreWrapper2 = C1283z.AFKeystoreWrapper(context2);
                AFKeystoreWrapper2.valueOf.post(AFKeystoreWrapper2.AFVersionDeclaration);
            }
        }, this.setAppInviteOneLink);
    }

    public final void values(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.values("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = values(context).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                AFKeystoreWrapper(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            String jSONObject3 = jSONObject.toString();
            SharedPreferences.Editor edit = values(context).edit();
            edit.putString("extraReferrers", jSONObject3);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.AFInAppEventType(sb2.toString(), th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        C1224aj.valueOf().AFInAppEventType("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass9.AFInAppEventType[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(C1220af.values(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    private static void AFKeystoreWrapper(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i11) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i11++;
                            str = next;
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public final void valueOf(Context context, String str, long j10) {
        SharedPreferences.Editor edit = values(context).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public static boolean valueOf() {
        return AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, null);
    }

    private static String valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int indexOf = str.indexOf(63);
        String substring = indexOf == -1 ? BuildConfig.FLAVOR : str.substring(indexOf);
        if (substring.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (substring.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(substring.split("&")));
        } else {
            arrayList.add(substring);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("access_token")) {
                it.remove();
            } else {
                if (sb2.length() != 0) {
                    sb2.append("&");
                } else if (!str2.startsWith("?")) {
                    sb2.append("?");
                }
                sb2.append(str2);
            }
        }
        return str.replace(substring, sb2.toString());
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.waitForCustomerUserId;
        return (map == null || map.isEmpty()) ? false : true;
    }

    private static String AFInAppEventType(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AFLogger.AFInAppEventType(th.getMessage(), th);
            return null;
        }
    }

    private static String AFInAppEventType(File file, String str) {
        FileReader fileReader;
        try {
            try {
                try {
                    Properties properties = new Properties();
                    fileReader = new FileReader(file);
                    try {
                        properties.load(fileReader);
                        AFLogger.AFKeystoreWrapper("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            fileReader.close();
                        } catch (Throwable th) {
                            AFLogger.AFInAppEventType(th.getMessage(), th);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
                        sb2.append(file.getAbsolutePath());
                        AFLogger.values(sb2.toString());
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.AFInAppEventType(th.getMessage(), th);
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    fileReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileReader = null;
                }
            } catch (Throwable th4) {
                AFLogger.AFInAppEventType(th4.getMessage(), th4);
                return null;
            }
        } catch (Throwable th5) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Throwable th6) {
                    AFLogger.AFInAppEventType(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    public static void AFKeystoreWrapper(Context context, String str, String str2) {
        SharedPreferences.Editor edit = values(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
    }

    private static void values(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? BuildConfig.FLAVOR : "lr" : "pr" : "l" : "p");
        }
    }

    public static String AFKeystoreWrapper(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    private static void AFKeystoreWrapper(Context context) {
        int i10;
        if (C1215aa.values()) {
            i10 = 23;
            AFLogger.AFInAppEventParameterName("OPPO device found");
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= i10 && !AFInAppEventType(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i11);
            sb2.append("; use KeyStore");
            AFLogger.AFInAppEventParameterName(sb2.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.AFInAppEventParameterName()) {
                aFKeystoreWrapper.AFInAppEventType = C1228an.AFKeystoreWrapper(new WeakReference(context));
                aFKeystoreWrapper.valueOf = 0;
                aFKeystoreWrapper.AFInAppEventType(aFKeystoreWrapper.AFInAppEventType());
            } else {
                String AFInAppEventType2 = aFKeystoreWrapper.AFInAppEventType();
                synchronized (aFKeystoreWrapper.values) {
                    aFKeystoreWrapper.valueOf++;
                    AFLogger.AFKeystoreWrapper("Deleting key with alias: ".concat(String.valueOf(AFInAppEventType2)));
                    try {
                        synchronized (aFKeystoreWrapper.values) {
                            aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFInAppEventType2);
                        }
                    } catch (KeyStoreException e10) {
                        StringBuilder sb3 = new StringBuilder("Exception ");
                        sb3.append(e10.getMessage());
                        sb3.append(" occurred");
                        AFLogger.AFInAppEventType(sb3.toString(), e10);
                    }
                }
                aFKeystoreWrapper.AFInAppEventType(aFKeystoreWrapper.AFInAppEventType());
            }
            AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.values());
            AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.valueOf()));
            return;
        }
        StringBuilder sb4 = new StringBuilder("OS SDK is=");
        sb4.append(i11);
        sb4.append("; no KeyStore usage");
        AFLogger.AFInAppEventParameterName(sb4.toString());
    }

    private static boolean values(File file) {
        return file == null || !file.exists();
    }

    final void values(AbstractC1271g abstractC1271g, Activity activity) {
        Uri AFInAppEventType2;
        Application application = abstractC1271g.valueOf;
        String str = BuildConfig.FLAVOR;
        String obj = (activity == null || (AFInAppEventType2 = C1233as.AFInAppEventType(activity)) == null) ? BuildConfig.FLAVOR : AFInAppEventType2.toString();
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY) == null) {
            AFLogger.init("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = abstractC1271g.AFKeystoreWrapper;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C1238ax.AFKeystoreWrapper);
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(application);
        if (referrer != null) {
            str = referrer;
        }
        abstractC1271g.init = str;
        abstractC1271g.AFInAppEventParameterName = obj;
        AFInAppEventType(abstractC1271g);
    }

    public static String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j10));
    }

    public final String valueOf(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = context == null ? null : AFKeystoreWrapper("CHANNEL", context.getPackageManager(), context.getPackageName());
        }
        if (string == null || !string.equals(BuildConfig.FLAVOR)) {
            return string;
        }
        return null;
    }

    private static String AFInAppEventParameterName(Activity activity) {
        Intent intent;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (str = extras.getString("af")) != null) {
                    AFLogger.AFKeystoreWrapper("Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.AFInAppEventType(th.getMessage(), th);
            }
        }
        return str;
    }

    public static void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j10, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e10) {
                AFLogger.AFInAppEventType("scheduleJob failed with RejectedExecutionException Exception", e10);
                return;
            } catch (Throwable th) {
                AFLogger.AFInAppEventType("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.init("scheduler is null, shut downed or terminated");
    }

    public static int valueOf(SharedPreferences sharedPreferences, String str, boolean z10) {
        int i10 = sharedPreferences.getInt(str, 0);
        if (z10) {
            i10++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i10);
            edit.apply();
        }
        if (C1224aj.valueOf().getLevel()) {
            C1224aj.valueOf().AFInAppEventParameterName(String.valueOf(i10));
        }
        return i10;
    }

    private void AFInAppEventType(AbstractC1271g abstractC1271g) {
        boolean z10 = abstractC1271g.AFLogger$LogLevel == null;
        if (valueOf()) {
            AFLogger.AFInAppEventType("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z10) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                if (AFKeystoreWrapper()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = abstractC1271g.AFKeystoreWrapper;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, C1238ax.valueOf);
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.AFKeystoreWrapper("Allowing multiple launches within a 5 second time window.");
            }
            this.onDeepLinking = System.currentTimeMillis();
        }
        if (C1275k.valueOf == null) {
            C1275k.valueOf = new C1275k();
        }
        AFInAppEventType(C1275k.valueOf.AFInAppEventParameterName(), new c(this, abstractC1271g, (byte) 0), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:433:0x0675, code lost:
    
        if (r8 != null) goto L833;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037d A[Catch: all -> 0x0c70, TRY_LEAVE, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0390 A[Catch: Exception -> 0x0396, all -> 0x0c70, TRY_LEAVE, TryCatch #16 {Exception -> 0x0396, blocks: (B:107:0x0382, B:109:0x0390), top: B:106:0x0382, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a7 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03bc A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d7 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0412 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x042b A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ba A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e4 A[Catch: all -> 0x0c70, TRY_LEAVE, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04f1 A[Catch: all -> 0x0c70, TRY_ENTER, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05f1 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07f9 A[Catch: all -> 0x0861, TryCatch #0 {all -> 0x0861, blocks: (B:215:0x07f1, B:217:0x07f9, B:218:0x0809), top: B:214:0x07f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0891 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x089a A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x091d A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0942 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a46 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0baf A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c5e A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x073f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05fa A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x067c A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06a7 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06f0 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0711 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0706 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0692 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x05e0 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0509 A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x03dd A[Catch: all -> 0x0c70, TryCatch #5 {all -> 0x0c70, blocks: (B:13:0x0091, B:15:0x0097, B:18:0x00a4, B:19:0x00b4, B:21:0x00b7, B:23:0x00c1, B:26:0x00d0, B:28:0x00ec, B:29:0x00f1, B:31:0x00f9, B:32:0x00fe, B:34:0x0106, B:36:0x0113, B:38:0x0153, B:39:0x015a, B:41:0x0162, B:43:0x0168, B:45:0x016e, B:46:0x017b, B:48:0x0182, B:50:0x0195, B:52:0x019c, B:53:0x01a3, B:55:0x01a9, B:56:0x018b, B:57:0x01b0, B:59:0x01cc, B:60:0x01d5, B:62:0x01f2, B:64:0x01f9, B:65:0x01fe, B:475:0x0209, B:477:0x0218, B:67:0x022f, B:69:0x0233, B:70:0x0238, B:73:0x0240, B:74:0x0243, B:76:0x024c, B:77:0x0251, B:79:0x025b, B:81:0x0261, B:82:0x0264, B:84:0x0272, B:85:0x027b, B:88:0x0290, B:90:0x029b, B:92:0x02a3, B:93:0x02aa, B:95:0x02b2, B:97:0x0345, B:100:0x035d, B:102:0x0367, B:103:0x0371, B:105:0x037d, B:107:0x0382, B:109:0x0390, B:111:0x039d, B:113:0x03a7, B:115:0x03ad, B:116:0x03b2, B:118:0x03bc, B:120:0x03c6, B:121:0x03cb, B:123:0x03d7, B:125:0x0412, B:126:0x041b, B:128:0x042b, B:130:0x0431, B:132:0x04b1, B:133:0x0439, B:135:0x043f, B:137:0x044f, B:138:0x0461, B:140:0x0467, B:141:0x046d, B:143:0x0473, B:144:0x0479, B:153:0x0492, B:154:0x0481, B:156:0x04a1, B:158:0x04ba, B:159:0x04c3, B:163:0x04e4, B:166:0x04f1, B:168:0x04f7, B:169:0x0512, B:171:0x051e, B:172:0x0523, B:174:0x052b, B:176:0x0548, B:178:0x054f, B:179:0x0554, B:181:0x0560, B:182:0x056b, B:184:0x0577, B:186:0x057e, B:187:0x0594, B:188:0x0599, B:190:0x05a5, B:191:0x05aa, B:437:0x05e0, B:194:0x05e5, B:196:0x05f1, B:198:0x0732, B:356:0x073f, B:202:0x075e, B:354:0x076e, B:205:0x0773, B:351:0x0783, B:207:0x0788, B:347:0x0798, B:208:0x079d, B:210:0x07b4, B:228:0x0874, B:230:0x0891, B:232:0x089a, B:234:0x089e, B:236:0x08a6, B:237:0x08ac, B:238:0x08c3, B:314:0x08d1, B:316:0x08e4, B:317:0x08f6, B:319:0x08f1, B:241:0x0911, B:243:0x091d, B:246:0x0931, B:248:0x0938, B:250:0x0942, B:251:0x0954, B:254:0x097b, B:260:0x0993, B:262:0x09a2, B:264:0x09b1, B:266:0x0a02, B:269:0x0a0c, B:271:0x0a46, B:273:0x0a4a, B:275:0x0a58, B:276:0x0a7f, B:278:0x0a85, B:279:0x0a8a, B:281:0x0a9f, B:284:0x0aa7, B:286:0x0aba, B:287:0x0acb, B:288:0x0abe, B:290:0x0ac8, B:291:0x0ace, B:293:0x0baf, B:294:0x0bbf, B:296:0x0c5e, B:300:0x09b5, B:302:0x09c3, B:303:0x09cc, B:305:0x09db, B:307:0x09ea, B:308:0x09ef, B:310:0x09fb, B:322:0x08fc, B:326:0x086f, B:343:0x07dc, B:360:0x0749, B:364:0x05fa, B:366:0x060e, B:368:0x0616, B:409:0x061c, B:414:0x063f, B:372:0x067c, B:373:0x0697, B:375:0x06a7, B:377:0x06af, B:390:0x06b5, B:381:0x06f0, B:382:0x070b, B:384:0x0711, B:386:0x0728, B:387:0x072d, B:388:0x0706, B:394:0x06c4, B:401:0x06d4, B:402:0x06df, B:404:0x06e8, B:407:0x0692, B:424:0x0651, B:425:0x065a, B:418:0x0664, B:419:0x066d, B:432:0x0673, B:443:0x05d1, B:439:0x05d8, B:444:0x0531, B:446:0x053d, B:447:0x04fd, B:449:0x0509, B:451:0x050f, B:452:0x0c64, B:457:0x04d6, B:458:0x03dd, B:460:0x03e3, B:463:0x0402, B:466:0x03f4, B:472:0x0398, B:473:0x0284, B:481:0x02cc, B:484:0x02da, B:487:0x02e4, B:490:0x02eb, B:493:0x02f6, B:494:0x0325, B:498:0x0340, B:508:0x010e, B:511:0x00cb, B:513:0x00af, B:435:0x05c1), top: B:12:0x0091, inners: #1, #6, #7, #10, #11, #14, #15, #16, #17, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> values(com.appsflyer.internal.AbstractC1271g r32) {
        /*
            Method dump skipped, instructions count: 3194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1219ae.values(com.appsflyer.internal.g):java.util.Map");
    }

    public final void AFInAppEventParameterName(Context context, Map<String, Object> map, Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            String valueOf2 = valueOf(uri.toString());
            C1274j AFInAppEventType2 = C1274j.AFInAppEventType();
            String str = AFInAppEventType2.AFVersionDeclaration;
            if (str != null && AFInAppEventType2.AFLogger$LogLevel != null && valueOf2.contains(str)) {
                Uri.Builder buildUpon = Uri.parse(valueOf2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : AFInAppEventType2.AFLogger$LogLevel.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                valueOf2 = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", valueOf2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        C1229ao c1229ao = new C1229ao(uri, this, context);
        if (c1229ao.valueOf) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        C1215aa.AFKeystoreWrapper(context, hashMap, uri);
        if (c1229ao.AFKeystoreWrapper()) {
            c1229ao.values = new C1229ao.b() { // from class: com.appsflyer.internal.ae.6
                private /* synthetic */ Map valueOf;

                AnonymousClass6(Map hashMap2) {
                    r1 = hashMap2;
                }

                @Override // com.appsflyer.internal.C1229ao.b
                public final void AFInAppEventParameterName(Map<String, String> map2) {
                    for (String str2 : map2.keySet()) {
                        r1.put(str2, map2.get(str2));
                    }
                    C1230ap.AFInAppEventParameterName((Map<String, String>) r1);
                }

                @Override // com.appsflyer.internal.C1229ao.b
                public final void AFInAppEventParameterName(String str2) {
                    C1230ap.valueOf(str2, DeepLinkResult.Error.NETWORK);
                }
            };
            if (C1275k.valueOf == null) {
                C1275k.valueOf = new C1275k();
            }
            C1275k.valueOf.valueOf().execute(c1229ao);
            return;
        }
        C1230ap.AFInAppEventParameterName(hashMap2);
    }

    public static void valueOf(Context context, Map<String, ? super String> map) {
        C1282y c1282y = C1282y.a.valueOf;
        C1282y.d AFKeystoreWrapper2 = C1282y.AFKeystoreWrapper(context);
        map.put("network", AFKeystoreWrapper2.AFKeystoreWrapper);
        String str = AFKeystoreWrapper2.AFInAppEventType;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFKeystoreWrapper2.valueOf;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    static /* synthetic */ void valueOf(C1219ae c1219ae, AbstractC1271g abstractC1271g) throws IOException {
        String jSONObject;
        StringBuilder sb2 = new StringBuilder("url: ");
        sb2.append(abstractC1271g.onAppOpenAttributionNative);
        AFLogger.AFKeystoreWrapper(sb2.toString());
        if (abstractC1271g.getLevel != null) {
            jSONObject = Base64.encodeToString(abstractC1271g.AFInAppEventParameterName(), 2);
            AFLogger.AFKeystoreWrapper("cached data: ".concat(String.valueOf(jSONObject)));
        } else {
            jSONObject = new JSONObject(abstractC1271g.AFInAppEventType()).toString();
            String replaceAll = jSONObject.replaceAll("\\p{C}", "*Non-printing character*");
            if (!replaceAll.equals(jSONObject)) {
                AFLogger.init("Payload contains non-printing characters");
                jSONObject = replaceAll;
            }
            C1227am.AFKeystoreWrapper("data: ".concat(jSONObject));
        }
        C1224aj.valueOf().AFInAppEventType("server_request", abstractC1271g.onAppOpenAttributionNative, jSONObject);
        try {
            c1219ae.AFKeystoreWrapper(abstractC1271g);
        } catch (IOException e10) {
            AFLogger.AFInAppEventType("Exception in sendRequestToServer. ", e10);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                c1219ae.AFKeystoreWrapper(abstractC1271g.AFInAppEventParameterName(abstractC1271g.onAppOpenAttributionNative.replace("https:", "http:")));
                return;
            }
            StringBuilder sb3 = new StringBuilder("failed to send request to server. ");
            sb3.append(e10.getLocalizedMessage());
            AFLogger.AFKeystoreWrapper(sb3.toString());
            throw e10;
        }
    }

    final void AFKeystoreWrapper(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.AFKeystoreWrapper("app went to background");
        SharedPreferences values2 = values(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(values2);
        long j10 = this.stop - this.AppsFlyerConversionListener;
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.init("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        C1270d.e.d AFInAppEventParameterName2 = C1216ab.AFInAppEventParameterName(weakReference.get().getContentResolver());
        if (AFInAppEventParameterName2 != null) {
            hashMap.put("amazon_aid", AFInAppEventParameterName2.values);
            hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName2.valueOf));
        }
        String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string3 != null) {
            hashMap.put("advertiserId", string3);
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", string);
        hashMap.put("uid", C1228an.AFKeystoreWrapper(weakReference));
        hashMap.put("time_in_app", String.valueOf(j10 / 1000));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(valueOf(values2, "appsFlyerCount", false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, valueOf(weakReference.get()));
        if (string2 == null) {
            string2 = BuildConfig.FLAVOR;
        }
        hashMap.put("originalAppsflyerId", string2);
        if (this.setAndroidIdData) {
            try {
                AFLogger.values("Running callStats task");
                C1256bp c1256bp = new C1256bp();
                c1256bp.onConversionDataFail = isStopped();
                new Thread(new RunnableC1277m((AbstractC1246bf) c1256bp.valueOf(hashMap).AFInAppEventParameterName(String.format(onInstallConversionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName())))).start();
                return;
            } catch (Throwable th) {
                AFLogger.AFInAppEventType("Could not send callStats request", th);
                return;
            }
        }
        AFLogger.values("Stats call is disabled, ignore ...");
    }

    public static boolean AFInAppEventParameterName(Context context) {
        return !values(context).contains("appsFlyerCount");
    }

    private static File AFInAppEventParameterName(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.AFInAppEventType(th.getMessage(), th);
            return null;
        }
    }

    private String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = values(context).getString("appsFlyerFirstInstall", null);
        if (string == null) {
            if (AFInAppEventParameterName(context)) {
                AFLogger.values("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = BuildConfig.FLAVOR;
            }
            string = str;
            SharedPreferences.Editor edit = values(context).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.AFKeystoreWrapper("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        if (AFLogger$LogLevel()) {
            hashMap.put("lvl", this.setCustomerIdAndLogSession);
        } else if (this.getOutOfStore) {
            HashMap hashMap2 = new HashMap();
            this.setCustomerIdAndLogSession = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.setCustomerIdAndLogSession);
        }
        return hashMap;
    }

    public boolean AFInAppEventParameterName(AbstractC1271g abstractC1271g, SharedPreferences sharedPreferences) {
        int valueOf2 = valueOf(sharedPreferences, "appsFlyerCount", false);
        return (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false) && valueOf2 == 1) || (valueOf2 == 1 && !(abstractC1271g instanceof C1248bh));
    }

    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map) {
        C1250bj c1250bj = new C1250bj();
        if (context != null) {
            c1250bj.valueOf = (Application) context.getApplicationContext();
        }
        c1250bj.AFLogger$LogLevel = str;
        c1250bj.values = map;
        values(c1250bj, context instanceof Activity ? (Activity) context : null);
    }

    private boolean AFKeystoreWrapper() {
        if (this.onDeepLinking > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onDeepLinking;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            long j10 = this.onDeepLinking;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j10));
            long j11 = this.AppsFlyerInAppPurchaseValidatorListener;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j11));
            if (currentTimeMillis < this.AppsFlyerLib && !isStopped()) {
                AFLogger.AFKeystoreWrapper(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.AppsFlyerLib)));
                return true;
            }
            if (!isStopped()) {
                AFLogger.AFKeystoreWrapper(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", format, format2, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            AFLogger.AFKeystoreWrapper("Sending first launch for this session!");
        }
        return false;
    }

    public static Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private static String AFKeystoreWrapper(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = ((PackageItemInfo) packageManager.getApplicationInfo(str2, 128)).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Could not find ");
            sb2.append(str);
            sb2.append(" value in the manifest");
            AFLogger.AFInAppEventType(sb2.toString(), th);
            return null;
        }
    }

    public final String AFKeystoreWrapper(Context context, String str) {
        SharedPreferences values2 = values(context);
        if (values2.contains("CACHED_CHANNEL")) {
            return values2.getString("CACHED_CHANNEL", null);
        }
        SharedPreferences.Editor edit = values(context).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    public static String AFKeystoreWrapper(HttpURLConnection httpURLConnection) {
        String obj;
        InputStreamReader inputStreamReader;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z10 = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(z10 ? '\n' : BuildConfig.FLAVOR);
                            sb2.append(readLine);
                            z10 = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                                sb3.append(httpURLConnection.getURL().toString());
                                AFLogger.AFInAppEventType(sb3.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                obj = sb2.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.values(th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.values(th6);
        }
        obj = sb2.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException unused) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException unused2) {
                return new JSONObject().toString();
            }
        }
    }

    private void AFKeystoreWrapper(AbstractC1271g abstractC1271g) throws IOException {
        long currentTimeMillis;
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        URL url = new URL(abstractC1271g.onAppOpenAttributionNative);
        byte[] AFInAppEventParameterName2 = abstractC1271g.AFInAppEventParameterName();
        String str = abstractC1271g.AFVersionDeclaration;
        String str2 = abstractC1271g.getLevel;
        boolean AFKeystoreWrapper2 = abstractC1271g.AFKeystoreWrapper();
        Application application = abstractC1271g.valueOf;
        AppsFlyerRequestListener appsFlyerRequestListener = abstractC1271g.AFKeystoreWrapper;
        boolean z10 = AFKeystoreWrapper2 && abstractC1271g.onInstallConversionFailureNative == 1;
        if (z10) {
            try {
                this.setUserEmails.put("from_fg", System.currentTimeMillis() - this.AppsFlyerConversionListener);
            } catch (JSONException unused) {
            }
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = 0;
        }
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(AFInAppEventParameterName2.length));
                httpURLConnection2.setRequestProperty("Content-Type", abstractC1271g.values() ? "application/octet-stream" : "application/json");
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setDoOutput(true);
                if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                    httpURLConnection2.setUseCaches(false);
                }
                try {
                    dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = null;
                }
                try {
                    dataOutputStream.write(AFInAppEventParameterName2);
                    dataOutputStream.close();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (z10) {
                        try {
                            this.setUserEmails.put("net", System.currentTimeMillis() - currentTimeMillis);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (this.init == null) {
                        this.init = new C1235au(application);
                    }
                    this.init.valueOf.edit().putString("first_launch", this.setUserEmails.toString()).apply();
                    String AFKeystoreWrapper3 = AFKeystoreWrapper(httpURLConnection2);
                    C1224aj.valueOf().AFInAppEventType("server_response", url.toString(), String.valueOf(responseCode), AFKeystoreWrapper3);
                    AFLogger.AFKeystoreWrapper("response code: ".concat(String.valueOf(responseCode)));
                    SharedPreferences values2 = values(application);
                    if (responseCode == 200) {
                        if (application != null && AFKeystoreWrapper2) {
                            this.AppsFlyerInAppPurchaseValidatorListener = System.currentTimeMillis();
                        }
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onSuccess();
                        }
                        if (str2 != null) {
                            C1223ai.AFKeystoreWrapper();
                            C1223ai.valueOf(str2, application);
                        } else {
                            SharedPreferences.Editor edit = values(application).edit();
                            edit.putString("sentSuccessfully", "true");
                            edit.apply();
                            if (!this.onValidateInApp && System.currentTimeMillis() - this.AFVersionDeclaration >= 15000 && this.onValidateInAppFailure == null) {
                                if (C1275k.valueOf == null) {
                                    C1275k.valueOf = new C1275k();
                                }
                                this.onValidateInAppFailure = C1275k.valueOf.AFInAppEventParameterName();
                                AFInAppEventType(this.onValidateInAppFailure, new e(application), 1L, TimeUnit.SECONDS);
                            }
                        }
                        C1242bb c1242bb = new C1242bb(application);
                        C1276l valueOf2 = c1242bb.valueOf();
                        if (valueOf2 != null && valueOf2.AFInAppEventParameterName()) {
                            String str3 = valueOf2.values;
                            AFLogger.values("Resending Uninstall token to AF servers: ".concat(String.valueOf(str3)));
                            c1242bb.AFInAppEventType(str3);
                        }
                        this.setAndroidIdData = C1232ar.AFKeystoreWrapper(AFKeystoreWrapper3).optBoolean("send_background", false);
                    } else if (appsFlyerRequestListener != null) {
                        int i10 = RequestError.RESPONSE_CODE_FAILURE;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C1238ax.AFInAppEventType);
                        sb2.append(" ");
                        sb2.append(responseCode);
                        appsFlyerRequestListener.onError(i10, sb2.toString());
                    }
                    C1241ba.values(this, abstractC1271g, str, application, values2, Integer.valueOf(responseCode), null);
                    httpURLConnection2.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    static /* synthetic */ void AFKeystoreWrapper(C1219ae c1219ae, AbstractC1271g abstractC1271g) {
        String format;
        ScheduledExecutorService AFInAppEventParameterName2;
        Application application = abstractC1271g.valueOf;
        String str = abstractC1271g.AFLogger$LogLevel;
        if (application == null) {
            AFLogger.values("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences values2 = values(application);
        AppsFlyerProperties.getInstance().saveProperties(values2);
        if (!c1219ae.isStopped()) {
            StringBuilder sb2 = new StringBuilder("sendWithEvent from activity: ");
            sb2.append(application.getClass().getName());
            AFLogger.AFKeystoreWrapper(sb2.toString());
        }
        int i10 = 1;
        int i11 = 0;
        boolean z10 = str == null;
        boolean z11 = abstractC1271g instanceof C1244bd;
        boolean z12 = abstractC1271g instanceof C1248bh;
        abstractC1271g.onAttributionFailureNative = z10;
        Map<String, ?> values3 = c1219ae.values(abstractC1271g);
        String str2 = (String) values3.get("appsflyerKey");
        if (str2 != null && str2.length() != 0) {
            if (!c1219ae.isStopped()) {
                AFLogger.AFKeystoreWrapper("AppsFlyerLib.sendWithEvent");
            }
            int valueOf2 = valueOf(values2, "appsFlyerCount", false);
            if (z12 || z11) {
                format = String.format(onAttributionFailure, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName());
            } else if (!z10) {
                format = String.format(onConversionDataFail, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName());
            } else if (valueOf2 < 2) {
                format = String.format(onAttributionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName());
            } else {
                format = String.format(onAppOpenAttribution, AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataSuccess.getHostName());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(format);
            sb3.append(application.getPackageName());
            String obj = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("&buildnumber=6.3.2");
            String obj2 = sb4.toString();
            String valueOf3 = c1219ae.valueOf(application);
            if (valueOf3 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj2);
                sb5.append("&channel=");
                sb5.append(valueOf3);
                obj2 = sb5.toString();
            }
            if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) && values3.get("advertiserId") != null) {
                try {
                    if (TextUtils.isEmpty(c1219ae.AFLogger$LogLevel) && values3.remove("android_id") != null) {
                        AFLogger.AFKeystoreWrapper("validateGaidAndIMEI :: removing: android_id");
                    }
                    if (TextUtils.isEmpty(c1219ae.AppsFlyer2dXConversionCallback) && values3.remove("imei") != null) {
                        AFLogger.AFKeystoreWrapper("validateGaidAndIMEI :: removing: imei");
                    }
                } catch (Exception e10) {
                    AFLogger.AFInAppEventType("failed to remove IMEI or AndroidID key from params; ", e10);
                }
            }
            AbstractC1271g valueOf4 = abstractC1271g.AFInAppEventParameterName(obj2).valueOf(values3);
            valueOf4.onInstallConversionFailureNative = valueOf2;
            d dVar = new d(c1219ae, valueOf4, (byte) 0);
            if (z10) {
                AbstractC1260bt[] abstractC1260btArr = c1219ae.onAppOpenAttributionNative;
                if (abstractC1260btArr != null) {
                    int length = abstractC1260btArr.length;
                    int i12 = 0;
                    while (i11 < length) {
                        AbstractC1260bt abstractC1260bt = abstractC1260btArr[i11];
                        if (abstractC1260bt.AFInAppEventParameterName == AbstractC1260bt.e.STARTED) {
                            StringBuilder sb6 = new StringBuilder("Failed to get ");
                            sb6.append(abstractC1260bt.valueOf);
                            sb6.append(" referrer, wait ...");
                            AFLogger.values(sb6.toString());
                            i12 = 1;
                        }
                        i11++;
                    }
                    i11 = i12;
                }
                if (c1219ae.setPhoneNumber && !c1219ae.AFInAppEventType()) {
                    AFLogger.values("fetching Facebook deferred AppLink data, wait ...");
                    i11 = 1;
                }
                if (!c1219ae.getOutOfStore || c1219ae.AFLogger$LogLevel()) {
                    i10 = i11;
                }
            } else {
                i10 = 0;
            }
            if (C1274j.valueOf) {
                AFLogger.AFInAppEventParameterName("ESP deeplink: execute launch on SerialExecutor");
                if (C1275k.valueOf == null) {
                    C1275k.valueOf = new C1275k();
                }
                C1275k c1275k = C1275k.valueOf;
                if (c1275k.AFInAppEventParameterName == null) {
                    c1275k.AFInAppEventParameterName = Executors.newSingleThreadScheduledExecutor(c1275k.AFInAppEventType);
                }
                AFInAppEventParameterName2 = c1275k.AFInAppEventParameterName;
            } else {
                if (C1275k.valueOf == null) {
                    C1275k.valueOf = new C1275k();
                }
                AFInAppEventParameterName2 = C1275k.valueOf.AFInAppEventParameterName();
            }
            AFInAppEventType(AFInAppEventParameterName2, dVar, i10 != 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.values("Not sending data yet, waiting for dev key");
        AppsFlyerRequestListener appsFlyerRequestListener = abstractC1271g.AFKeystoreWrapper;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C1238ax.AFKeystoreWrapper);
        }
    }

    public static SharedPreferences values(Context context) {
        C1219ae c1219ae = onConversionDataSuccess;
        if (c1219ae.sendPushNotificationData == null) {
            c1219ae.sendPushNotificationData = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        }
        return onConversionDataSuccess.sendPushNotificationData;
    }
}
