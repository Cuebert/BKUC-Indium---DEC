package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC1271g {
    String AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    AppsFlyerRequestListener AFKeystoreWrapper;
    String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    byte[] AppsFlyer2dXConversionCallback;
    String getLevel;
    String init;
    public String onAppOpenAttributionNative;
    boolean onAttributionFailureNative;
    private final boolean onDeepLinkingNative;
    public int onInstallConversionFailureNative;
    public Application valueOf;
    Map<String, Object> values;

    public AbstractC1271g() {
        this(null, null, null, null);
    }

    public AbstractC1271g AFInAppEventParameterName(String str) {
        this.onAppOpenAttributionNative = str;
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean AFKeystoreWrapper() {
        return this.onAttributionFailureNative;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC1271g valueOf(Map<String, ?> map) {
        this.AFInAppEventType.putAll(map);
        return this;
    }

    public final boolean values() {
        return this.onDeepLinkingNative;
    }

    public AbstractC1271g(String str, String str2, Boolean bool, Context context) {
        this.AFInAppEventType = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onAppOpenAttributionNative = str2;
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.valueOf = (Application) context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] AFInAppEventParameterName() {
        return this.AppsFlyer2dXConversionCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String AFKeystoreWrapper(String str) {
        String valueOf = C1219ae.values().valueOf(this.valueOf);
        return valueOf != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, valueOf).build().toString() : str;
    }
}
