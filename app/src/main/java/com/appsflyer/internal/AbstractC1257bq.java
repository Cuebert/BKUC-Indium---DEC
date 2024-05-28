package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* renamed from: com.appsflyer.internal.bq */
/* loaded from: classes.dex */
public abstract class AbstractC1257bq extends AbstractC1260bt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1257bq(String str, Runnable runnable) {
        super(str, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(Context context, AbstractC1237aw<Map<String, Object>> abstractC1237aw) {
        C1219ae.values();
        if (C1219ae.valueOf(C1219ae.values(context), "appsFlyerCount", false) > 0 || !abstractC1237aw.values()) {
            return;
        }
        new Thread(abstractC1237aw.AFInAppEventParameterName).start();
        AFInAppEventParameterName();
    }
}
