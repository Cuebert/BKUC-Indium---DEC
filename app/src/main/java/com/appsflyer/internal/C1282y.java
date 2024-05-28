package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.y */
/* loaded from: classes.dex */
public final class C1282y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final C1282y valueOf = new C1282y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.y$d */
    /* loaded from: classes.dex */
    public static final class d {
        final String AFInAppEventType;
        final String AFKeystoreWrapper;
        final String valueOf;

        d(String str, String str2, String str3) {
            this.AFKeystoreWrapper = str;
            this.valueOf = str2;
            this.AFInAppEventType = str3;
        }
    }

    C1282y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d AFKeystoreWrapper(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i10]);
                    if (!valueOf(networkInfo)) {
                        i10++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            str4 = telephonyManager.getNetworkOperatorName();
            if (str4 == null || str4.isEmpty()) {
                if (2 == telephonyManager.getPhoneType()) {
                    str4 = "CDMA";
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str = str4;
            str4 = str2;
            AFLogger.AFInAppEventType("Exception while collecting network info. ", th);
            String str5 = str;
            str2 = str4;
            str4 = str5;
            return new d(str3, str4, str2);
        }
        return new d(str3, str4, str2);
    }

    private static boolean valueOf(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
