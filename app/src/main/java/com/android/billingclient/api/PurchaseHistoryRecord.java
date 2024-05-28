package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a */
    private final String f5513a;

    /* renamed from: b */
    private final String f5514b;

    /* renamed from: c */
    private final JSONObject f5515c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f5513a = str;
        this.f5514b = str2;
        this.f5515c = new JSONObject(str);
    }

    /* renamed from: a */
    public String m6788a() {
        return this.f5513a;
    }

    /* renamed from: b */
    public String m6789b() {
        JSONObject jSONObject = this.f5515c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: c */
    public String m6790c() {
        return this.f5514b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f5513a, purchaseHistoryRecord.m6788a()) && TextUtils.equals(this.f5514b, purchaseHistoryRecord.m6790c());
    }

    public int hashCode() {
        return this.f5513a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f5513a));
    }
}
