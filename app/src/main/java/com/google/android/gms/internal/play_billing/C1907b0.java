package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C1179f;
import com.android.billingclient.api.Purchase;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.b0 */
/* loaded from: classes.dex */
public final class C1907b0 {

    /* renamed from: a */
    public static final int f7632a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m9242a(Intent intent, String str) {
        if (intent == null) {
            m9250i("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return m9252k(intent.getExtras(), "ProxyBillingActivity");
    }

    /* renamed from: b */
    public static int m9243b(Bundle bundle, String str) {
        if (bundle == null) {
            m9250i(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m9249h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m9250i(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* renamed from: c */
    public static Bundle m9244c(boolean z10, boolean z11, boolean z12, boolean z13, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: d */
    public static C1179f m9245d(Intent intent, String str) {
        if (intent == null) {
            m9250i("BillingHelper", "Got null intent!");
            C1179f.a m6908c = C1179f.m6908c();
            m6908c.m6915c(6);
            m6908c.m6914b("An internal error occurred.");
            return m6908c.m6913a();
        }
        C1179f.a m6908c2 = C1179f.m6908c();
        m6908c2.m6915c(m9243b(intent.getExtras(), str));
        m6908c2.m6914b(m9246e(intent.getExtras(), str));
        return m6908c2.m6913a();
    }

    /* renamed from: e */
    public static String m9246e(Bundle bundle, String str) {
        if (bundle == null) {
            m9250i(str, "Unexpected null bundle received!");
            return BuildConfig.FLAVOR;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m9249h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m9250i(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public static String m9247f(int i10) {
        return EnumC1899a.m9199b(i10).toString();
    }

    /* renamed from: g */
    public static List m9248g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            m9249h("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase m9253l = m9253l(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (m9253l != null) {
                    arrayList.add(m9253l);
                }
            }
        } else {
            Purchase m9253l2 = m9253l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (m9253l2 == null) {
                m9249h("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(m9253l2);
        }
        return arrayList;
    }

    /* renamed from: h */
    public static void m9249h(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i10 = 40000;
                while (!str2.isEmpty() && i10 > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i10));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i10 -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    /* renamed from: i */
    public static void m9250i(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: j */
    public static void m9251j(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: k */
    private static int m9252k(Bundle bundle, String str) {
        if (bundle == null) {
            m9250i(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    /* renamed from: l */
    private static Purchase m9253l(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                m9250i("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        m9249h("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
