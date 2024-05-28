package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.internal.c */
/* loaded from: classes.dex */
final class C1267c {
    private IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.c$c */
    /* loaded from: classes.dex */
    static final class c {
        static final C1267c AFKeystoreWrapper = new C1267c();
    }

    /* renamed from: com.appsflyer.internal.c$e */
    /* loaded from: classes.dex */
    static final class e {
        final String AFKeystoreWrapper;
        final float values;

        e(float f10, String str) {
            this.values = f10;
            this.AFKeystoreWrapper = str;
        }
    }

    C1267c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e values(Context context) {
        String str = null;
        float f10 = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventParameterName);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f10 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new e(f10, str);
    }
}
