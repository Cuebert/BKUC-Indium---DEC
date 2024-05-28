package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.ao */
/* loaded from: classes.dex */
public final class C1229ao extends AbstractRunnableC1225ak {
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    boolean valueOf;
    b values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ao$b */
    /* loaded from: classes.dex */
    public interface b {
        void AFInAppEventParameterName(String str);

        void AFInAppEventParameterName(Map<String, String> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1229ao(Uri uri, C1219ae c1219ae, Context context) {
        super(c1219ae, context, "GET");
        this.valueOf = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (uri.getHost().contains(strArr[i10])) {
                z10 = true;
            }
        }
        if (C1274j.AppsFlyer2dXConversionCallback != null) {
            StringBuilder sb2 = new StringBuilder("Validate if link ");
            sb2.append(uri);
            sb2.append(" belongs to custom domains: ");
            sb2.append(Arrays.asList(C1274j.AppsFlyer2dXConversionCallback));
            AFLogger.AFInAppEventParameterName(sb2.toString());
            for (String str : C1274j.AppsFlyer2dXConversionCallback) {
                if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                    AFLogger.values("Link matches custom domain: ".concat(String.valueOf(str)));
                    this.valueOf = true;
                    z10 = true;
                }
            }
        }
        String[] split = uri.getPath().split("/");
        if (z10 && split.length == 3) {
            this.AFKeystoreWrapper = split[1];
            this.AFVersionDeclaration = split[2];
            this.AFLogger$LogLevel = uri.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    protected final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AppsFlyer2dXConversionCallback);
        String valueOf = String.valueOf(this.getLevel.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.getLevel.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.getLevel.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.getLevel.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.getLevel.get("sdk")));
        values(httpsURLConnection, this.AFInAppEventType, this.AppsFlyer2dXConversionCallback, this.AFKeystoreWrapper, this.AFVersionDeclaration, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    protected final void AFInAppEventType() {
        String str = this.AFLogger$LogLevel;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.values.AFInAppEventParameterName(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean AFKeystoreWrapper() {
        return (TextUtils.isEmpty(this.AFKeystoreWrapper) || TextUtils.isEmpty(this.AFVersionDeclaration) || this.AFKeystoreWrapper.equals("app")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    protected final void AFKeystoreWrapper(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.values.AFInAppEventParameterName(hashMap);
        } catch (JSONException e10) {
            this.values.AFInAppEventParameterName("Can't parse OneLink data");
            AFLogger.AFInAppEventType("Error while parsing to json ".concat(String.valueOf(str)), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    protected final String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AbstractRunnableC1225ak.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName()));
        sb2.append("/");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append("?id=");
        sb2.append(this.AFVersionDeclaration);
        return sb2.toString();
    }
}
