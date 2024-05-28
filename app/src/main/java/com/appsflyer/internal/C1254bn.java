package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;

/* renamed from: com.appsflyer.internal.bn */
/* loaded from: classes.dex */
public final class C1254bn extends AbstractC1251bk {
    public C1254bn(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.AbstractC1271g
    public final AbstractC1271g AFInAppEventParameterName(String str) {
        return super.AFInAppEventParameterName(AFKeystoreWrapper(str));
    }
}
