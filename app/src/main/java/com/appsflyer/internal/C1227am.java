package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* renamed from: com.appsflyer.internal.am */
/* loaded from: classes.dex */
public final class C1227am {
    private static String AFInAppEventParameterName;
    private static String values;

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventParameterName == null) {
            valueOf(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = AFInAppEventParameterName;
        if (str2 != null) {
            AFLogger.AFKeystoreWrapper(str.replace(str2, values));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(String str) {
        AFInAppEventParameterName = str;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 != 0 && i10 != str.length() - 1) {
                sb2.append("*");
            } else {
                sb2.append(str.charAt(i10));
            }
        }
        values = sb2.toString();
    }
}
