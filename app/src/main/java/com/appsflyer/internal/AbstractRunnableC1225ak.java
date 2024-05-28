package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.ak */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1225ak implements Runnable {
    protected static String AFInAppEventParameterName = null;
    private static int AFLogger$LogLevel = 0;
    private static int AFVersionDeclaration = 0;
    private static int onAppOpenAttributionNative = 1;
    private static short[] onAttributionFailureNative;
    private static int onDeepLinkingNative;
    private static int onInstallConversionDataLoadedNative;
    private static byte[] onInstallConversionFailureNative;
    private static String valueOf;
    public final String AFInAppEventType;
    public String AFKeystoreWrapper;
    public final String AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
    public final Map<String, Object> getLevel = valueOf();
    private final Context init;
    private final C1219ae values;

    static {
        values();
        valueOf = "v2";
        StringBuilder sb2 = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb2.append(valueOf);
        AFInAppEventParameterName = sb2.toString();
        int i10 = onInstallConversionDataLoadedNative + 43;
        onAppOpenAttributionNative = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        int i11 = 74 / 0;
    }

    public AbstractRunnableC1225ak(C1219ae c1219ae, Context context, String str) {
        this.values = c1219ae;
        this.init = context;
        this.AFInAppEventType = str;
    }

    private Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.3.2");
        hashMap.put("counter", Integer.valueOf(C1219ae.valueOf(C1219ae.values(this.init), "appsFlyerCount", false)));
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.init.getPackageManager().getPackageInfo(this.init.getPackageName(), 0).versionName);
            int i10 = onAppOpenAttributionNative + 101;
            onInstallConversionDataLoadedNative = i10 % 128;
            int i11 = i10 % 2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.init.getPackageName());
        hashMap.put("platformextension", new C1226al().AFInAppEventParameterName());
        return hashMap;
    }

    static void values() {
        AFLogger$LogLevel = 91;
        AFVersionDeclaration = -784549513;
        onDeepLinkingNative = -1400650653;
        onInstallConversionFailureNative = new byte[]{-79, -13, -3, 1, 19, -13, 7, -2, 22, 38, -57, 37};
    }

    protected abstract String AFInAppEventParameterName();

    protected abstract void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    protected abstract void AFInAppEventType();

    protected abstract void AFKeystoreWrapper(String str);

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r8.AFInAppEventParameterName()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "oneLinkUrl: "
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r2)
            r2 = 1
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L71
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L71
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L71
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = "content-type"
            java.lang.String r6 = "application/json"
            r4.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L71
            r5 = 3000(0xbb8, float:4.204E-42)
            r4.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L71
            r4.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r8.AFInAppEventType     // Catch: java.lang.Throwable -> L71
            r4.setRequestMethod(r5)     // Catch: java.lang.Throwable -> L71
            r8.AFInAppEventParameterName(r4)     // Catch: java.lang.Throwable -> L71
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = com.appsflyer.internal.C1219ae.AFKeystoreWrapper(r4)     // Catch: java.lang.Throwable -> L71
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L58
            int r5 = com.appsflyer.internal.AbstractRunnableC1225ak.onInstallConversionDataLoadedNative
            int r5 = r5 + 107
            int r6 = r5 % 128
            com.appsflyer.internal.AbstractRunnableC1225ak.onAppOpenAttributionNative = r6
            int r5 = r5 % 2
            java.lang.String r5 = "Status 200 ok"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5)     // Catch: java.lang.Throwable -> L6f
            goto L9a
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "Response code = "
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            r0.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = " content = "
            r0.append(r5)     // Catch: java.lang.Throwable -> L6f
            r0.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6f
            goto L9a
        L6f:
            r0 = move-exception
            goto L75
        L71:
            r4 = move-exception
            r7 = r4
            r4 = r0
            r0 = r7
        L75:
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r6 = "Error while calling "
            java.lang.String r5 = r6.concat(r5)
            com.appsflyer.AFLogger.AFInAppEventType(r5, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " stacktrace: "
            r5.append(r1)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
        L9a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto La1
            goto La2
        La1:
            r2 = 0
        La2:
            if (r2 == 0) goto Lb5
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            r8.AFKeystoreWrapper(r4)
            return
        Lb5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.init(r0)
            r8.AFInAppEventType()
            int r0 = com.appsflyer.internal.AbstractRunnableC1225ak.onInstallConversionDataLoadedNative
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.appsflyer.internal.AbstractRunnableC1225ak.onAppOpenAttributionNative = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AbstractRunnableC1225ak.run():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void values(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, valueOf);
        String join = TextUtils.join("\u2063", arrayList.toArray());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        sb2.append(this.AppsFlyer2dXConversionCallback);
        sb2.append(valueOf);
        httpsURLConnection.setRequestProperty(valueOf((byte) (ViewConfiguration.getPressedStateDuration() >> 16), 1400650718 - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) + 801326729, (-88) - AndroidCharacter.getEastAsianWidth('0')).intern(), C1220af.values(join, sb2.toString()));
        int i10 = onAppOpenAttributionNative + 33;
        onInstallConversionDataLoadedNative = i10 % 128;
        int i11 = i10 % 2;
    }

    private static String valueOf(byte b10, int i10, short s10, int i11, int i12) {
        int i13;
        int i14;
        StringBuilder sb2 = new StringBuilder();
        int i15 = AFLogger$LogLevel;
        int i16 = i12 + i15;
        boolean z10 = (i16 == -1 ? (char) 17 : ';') == 17;
        if (z10) {
            byte[] bArr = onInstallConversionFailureNative;
            if (bArr != null) {
                i16 = (byte) (bArr[AFVersionDeclaration + i11] + i15);
            } else {
                i16 = (short) (onAttributionFailureNative[AFVersionDeclaration + i11] + i15);
            }
        }
        if (i16 > 0) {
            int i17 = ((i11 + i16) - 2) + AFVersionDeclaration + (z10 ? 1 : 0);
            char c10 = (char) (i10 + onDeepLinkingNative);
            sb2.append(c10);
            for (int i18 = 1; i18 < i16; i18++) {
                int i19 = onAppOpenAttributionNative;
                int i20 = i19 + 45;
                onInstallConversionDataLoadedNative = i20 % 128;
                int i21 = i20 % 2;
                byte[] bArr2 = onInstallConversionFailureNative;
                if ((bArr2 != null ? (char) 19 : '.') != 19) {
                    c10 = (char) (c10 + (((short) (onAttributionFailureNative[i17] + s10)) ^ b10));
                    int i22 = i19 + 11;
                    onInstallConversionDataLoadedNative = i22 % 128;
                    int i23 = i22 % 2;
                    i17--;
                } else {
                    int i24 = i19 + 17;
                    onInstallConversionDataLoadedNative = i24 % 128;
                    if (i24 % 2 != 0) {
                        i13 = i17 + 119;
                        i14 = c10 >> (((byte) (bArr2[i17] >>> s10)) | b10);
                    } else {
                        i13 = i17 - 1;
                        i14 = c10 + (((byte) (bArr2[i17] + s10)) ^ b10);
                    }
                    c10 = (char) i14;
                    i17 = i13;
                }
                sb2.append(c10);
            }
        }
        String obj = sb2.toString();
        int i25 = onAppOpenAttributionNative + 25;
        onInstallConversionDataLoadedNative = i25 % 128;
        int i26 = i25 % 2;
        return obj;
    }
}
