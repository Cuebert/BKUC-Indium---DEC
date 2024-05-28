package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* renamed from: com.appsflyer.internal.bf */
/* loaded from: classes.dex */
public abstract class AbstractC1246bf extends AbstractC1271g {
    public boolean onConversionDataFail;
    private final boolean onDeepLinkingNative;
    private final boolean onInstallConversionDataLoadedNative;

    public AbstractC1246bf() {
        this(null, null, null, null, null, null);
    }

    public String AFLogger$LogLevel() {
        return RunnableC1277m.AFInAppEventType((Map<String, ?>) AFInAppEventType()).toString();
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onConversionDataFail;
    }

    public final boolean getLevel() {
        return this.onInstallConversionDataLoadedNative;
    }

    public final boolean init() {
        return this.onDeepLinkingNative;
    }

    public AbstractC1246bf(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        this.onInstallConversionDataLoadedNative = bool2 != null ? bool2.booleanValue() : true;
    }
}
