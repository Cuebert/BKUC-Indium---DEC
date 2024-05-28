package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a */
    private final String f5510a;

    /* renamed from: b */
    private final String f5511b;

    /* renamed from: c */
    private final JSONObject f5512c;

    public Purchase(String str, String str2) throws JSONException {
        this.f5510a = str;
        this.f5511b = str2;
        this.f5512c = new JSONObject(str);
    }

    /* renamed from: j */
    private final ArrayList m6778j() {
        ArrayList arrayList = new ArrayList();
        if (this.f5512c.has("productIds")) {
            JSONArray optJSONArray = this.f5512c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f5512c.has("productId")) {
            arrayList.add(this.f5512c.optString("productId"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1169a m6779a() {
        String optString = this.f5512c.optString("obfuscatedAccountId");
        String optString2 = this.f5512c.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new C1169a(optString, optString2);
    }

    /* renamed from: b */
    public String m6780b() {
        String optString = this.f5512c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    /* renamed from: c */
    public String m6781c() {
        return this.f5510a;
    }

    /* renamed from: d */
    public String m6782d() {
        return this.f5512c.optString("packageName");
    }

    /* renamed from: e */
    public List<String> m6783e() {
        return m6778j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f5510a, purchase.m6781c()) && TextUtils.equals(this.f5511b, purchase.m6786h());
    }

    /* renamed from: f */
    public int m6784f() {
        return this.f5512c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: g */
    public String m6785g() {
        JSONObject jSONObject = this.f5512c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: h */
    public String m6786h() {
        return this.f5511b;
    }

    public int hashCode() {
        return this.f5510a.hashCode();
    }

    /* renamed from: i */
    public boolean m6787i() {
        return this.f5512c.optBoolean("acknowledged", true);
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5510a));
    }
}
