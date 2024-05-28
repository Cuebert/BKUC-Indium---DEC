package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a */
    private final String f5516a;

    /* renamed from: b */
    private final JSONObject f5517b;

    /* renamed from: a */
    public String m6791a() {
        return this.f5517b.optString("productId");
    }

    /* renamed from: b */
    public String m6792b() {
        return this.f5517b.optString("type");
    }

    /* renamed from: c */
    public int m6793c() {
        return this.f5517b.optInt("offer_type");
    }

    /* renamed from: d */
    public String m6794d() {
        return this.f5517b.optString("offer_id");
    }

    /* renamed from: e */
    public String m6795e() {
        String optString = this.f5517b.optString("offerIdToken");
        return optString.isEmpty() ? this.f5517b.optString("offer_id_token") : optString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f5516a, ((SkuDetails) obj).f5516a);
        }
        return false;
    }

    /* renamed from: f */
    public final String m6796f() {
        return this.f5517b.optString("packageName");
    }

    /* renamed from: g */
    public String m6797g() {
        return this.f5517b.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final String m6798h() {
        return this.f5517b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f5516a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f5516a));
    }
}
