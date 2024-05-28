package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C1179f;
import com.google.android.gms.internal.play_billing.C1907b0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.y */
/* loaded from: classes.dex */
public final class C1207y {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1206x m6961a(Bundle bundle, String str, String str2) {
        C1179f c1179f = C1197o.f5690j;
        if (bundle == null) {
            C1907b0.m9250i("BillingClient", String.format("%s got null owned items list", str2));
            return new C1206x(c1179f, 54);
        }
        int m9243b = C1907b0.m9243b(bundle, "BillingClient");
        String m9246e = C1907b0.m9246e(bundle, "BillingClient");
        C1179f.a m6908c = C1179f.m6908c();
        m6908c.m6915c(m9243b);
        m6908c.m6914b(m9246e);
        C1179f m6913a = m6908c.m6913a();
        if (m9243b != 0) {
            C1907b0.m9250i("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(m9243b)));
            return new C1206x(m6913a, 23);
        }
        if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                C1907b0.m9250i("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return new C1206x(c1179f, 56);
            }
            if (stringArrayList2 == null) {
                C1907b0.m9250i("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return new C1206x(c1179f, 57);
            }
            if (stringArrayList3 != null) {
                return new C1206x(C1197o.f5692l, 1);
            }
            C1907b0.m9250i("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
            return new C1206x(c1179f, 58);
        }
        C1907b0.m9250i("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
        return new C1206x(c1179f, 55);
    }
}
