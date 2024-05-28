package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.appsflyer.internal.au */
/* loaded from: classes.dex */
public final class C1235au {
    public final Application AFKeystoreWrapper;
    public final SharedPreferences valueOf;

    public C1235au(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.AFKeystoreWrapper = application;
        this.valueOf = C1219ae.values(application);
    }

    public final boolean AFInAppEventType() {
        C1219ae.values();
        return C1219ae.valueOf(this.valueOf, "appsFlyerCount", false) == 0;
    }
}
