package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.AbstractRunnableC1225ak;
import com.appsflyer.internal.C1219ae;
import com.appsflyer.internal.RunnableC1277m;
import com.appsflyer.oaid.BuildConfig;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask extends AbstractRunnableC1225ak {
    private final Map<String, String> AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private final String init;
    public String valueOf;
    public ResponseListener values;

    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, C1219ae c1219ae, Context context) {
        super(c1219ae, context, "POST");
        this.AFVersionDeclaration = BuildConfig.FLAVOR;
        if (context != null) {
            this.AFVersionDeclaration = context.getPackageName();
        } else {
            AFLogger.init("CreateOneLinkHttpTask: context can't be null");
        }
        this.AFKeystoreWrapper = str;
        this.init = "-1";
        this.AFLogger$LogLevel = map;
    }

    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    public final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws IOException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.init);
        hashMap.put("uuid", this.AppsFlyer2dXConversionCallback);
        hashMap.put("data", this.AFLogger$LogLevel);
        hashMap.put("meta", this.getLevel);
        String str = this.valueOf;
        if (str != null) {
            hashMap.put("brand_domain", str);
        }
        String jSONObject = RunnableC1277m.AFInAppEventType(hashMap).toString();
        values(httpsURLConnection, this.AFInAppEventType, jSONObject);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    public final void AFInAppEventType() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFKeystoreWrapper, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.AFVersionDeclaration).addParameter("af_siteid", this.AFVersionDeclaration).addParameters(this.AFLogger$LogLevel);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.values.onResponse(addParameters.generateLink());
    }

    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    public final void AFKeystoreWrapper(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.values.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e10) {
            this.values.onResponseError("Can't parse one link data");
            AFLogger.AFInAppEventType("Error while parsing to json ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.appsflyer.internal.AbstractRunnableC1225ak
    public final String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AbstractRunnableC1225ak.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), C1219ae.values().getHostName()));
        sb2.append("/");
        sb2.append(this.AFKeystoreWrapper);
        return sb2.toString();
    }
}
