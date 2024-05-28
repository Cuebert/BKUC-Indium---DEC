package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.g */
/* loaded from: classes.dex */
public final class C1181g {

    /* renamed from: a */
    private final String f5601a;

    /* renamed from: b */
    private final JSONObject f5602b;

    /* renamed from: c */
    private final String f5603c;

    /* renamed from: d */
    private final String f5604d;

    /* renamed from: e */
    private final String f5605e;

    /* renamed from: f */
    private final String f5606f;

    /* renamed from: g */
    private final String f5607g;

    /* renamed from: h */
    private final String f5608h;

    /* renamed from: i */
    private final String f5609i;

    /* renamed from: j */
    private final String f5610j;

    /* renamed from: k */
    private final String f5611k;

    /* renamed from: l */
    private final List f5612l;

    /* renamed from: m */
    private final List f5613m;

    /* renamed from: com.android.billingclient.api.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f5614a;

        /* renamed from: b */
        private final long f5615b;

        /* renamed from: c */
        private final String f5616c;

        /* renamed from: d */
        private final String f5617d;

        /* renamed from: e */
        private final String f5618e;

        /* renamed from: f */
        private final AbstractC2024r5 f5619f;

        /* renamed from: g */
        private final Long f5620g;

        /* renamed from: h */
        private final C1203u f5621h;

        /* renamed from: i */
        private final C1205w f5622i;

        /* renamed from: j */
        private final C1204v f5623j;

        a(JSONObject jSONObject) throws JSONException {
            this.f5614a = jSONObject.optString("formattedPrice");
            this.f5615b = jSONObject.optLong("priceAmountMicros");
            this.f5616c = jSONObject.optString("priceCurrencyCode");
            this.f5617d = jSONObject.optString("offerIdToken");
            this.f5618e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f5619f = AbstractC2024r5.m9559r(arrayList);
            this.f5620g = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f5621h = optJSONObject == null ? null : new C1203u(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f5622i = optJSONObject2 == null ? null : new C1205w(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5623j = optJSONObject3 != null ? new C1204v(optJSONObject3) : null;
        }

        /* renamed from: a */
        public String m6923a() {
            return this.f5614a;
        }

        /* renamed from: b */
        public long m6924b() {
            return this.f5615b;
        }

        /* renamed from: c */
        public String m6925c() {
            return this.f5616c;
        }

        /* renamed from: d */
        public final String m6926d() {
            return this.f5617d;
        }
    }

    /* renamed from: com.android.billingclient.api.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f5624a;

        /* renamed from: b */
        private final long f5625b;

        /* renamed from: c */
        private final String f5626c;

        /* renamed from: d */
        private final String f5627d;

        /* renamed from: e */
        private final int f5628e;

        /* renamed from: f */
        private final int f5629f;

        b(JSONObject jSONObject) {
            this.f5627d = jSONObject.optString("billingPeriod");
            this.f5626c = jSONObject.optString("priceCurrencyCode");
            this.f5624a = jSONObject.optString("formattedPrice");
            this.f5625b = jSONObject.optLong("priceAmountMicros");
            this.f5629f = jSONObject.optInt("recurrenceMode");
            this.f5628e = jSONObject.optInt("billingCycleCount");
        }

        /* renamed from: a */
        public String m6927a() {
            return this.f5624a;
        }

        /* renamed from: b */
        public long m6928b() {
            return this.f5625b;
        }

        /* renamed from: c */
        public String m6929c() {
            return this.f5626c;
        }
    }

    /* renamed from: com.android.billingclient.api.g$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final List f5630a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f5630a = arrayList;
        }

        /* renamed from: a */
        public List<b> m6930a() {
            return this.f5630a;
        }
    }

    /* renamed from: com.android.billingclient.api.g$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f5631a;

        /* renamed from: b */
        private final String f5632b;

        /* renamed from: c */
        private final String f5633c;

        /* renamed from: d */
        private final c f5634d;

        /* renamed from: e */
        private final List f5635e;

        /* renamed from: f */
        private final C1202t f5636f;

        d(JSONObject jSONObject) throws JSONException {
            this.f5631a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f5632b = true == optString.isEmpty() ? null : optString;
            this.f5633c = jSONObject.getString("offerIdToken");
            this.f5634d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5636f = optJSONObject != null ? new C1202t(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f5635e = arrayList;
        }

        /* renamed from: a */
        public String m6931a() {
            return this.f5633c;
        }

        /* renamed from: b */
        public c m6932b() {
            return this.f5634d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1181g(String str) throws JSONException {
        this.f5601a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5602b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f5603c = optString;
        String optString2 = jSONObject.optString("type");
        this.f5604d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f5605e = jSONObject.optString("title");
                this.f5606f = jSONObject.optString("name");
                this.f5607g = jSONObject.optString("description");
                this.f5609i = jSONObject.optString("packageDisplayName");
                this.f5610j = jSONObject.optString("iconUrl");
                this.f5608h = jSONObject.optString("skuDetailsToken");
                this.f5611k = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList.add(new d(optJSONArray.getJSONObject(i10)));
                    }
                    this.f5612l = arrayList;
                } else {
                    this.f5612l = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
                }
                JSONObject optJSONObject = this.f5602b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f5602b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList2.add(new a(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f5613m = arrayList2;
                    return;
                }
                if (optJSONObject == null) {
                    this.f5613m = null;
                    return;
                } else {
                    arrayList2.add(new a(optJSONObject));
                    this.f5613m = arrayList2;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    /* renamed from: a */
    public a m6916a() {
        List list = this.f5613m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (a) this.f5613m.get(0);
    }

    /* renamed from: b */
    public String m6917b() {
        return this.f5603c;
    }

    /* renamed from: c */
    public String m6918c() {
        return this.f5604d;
    }

    /* renamed from: d */
    public List<d> m6919d() {
        return this.f5612l;
    }

    /* renamed from: e */
    public final String m6920e() {
        return this.f5602b.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1181g) {
            return TextUtils.equals(this.f5601a, ((C1181g) obj).f5601a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final String m6921f() {
        return this.f5608h;
    }

    /* renamed from: g */
    public String m6922g() {
        return this.f5611k;
    }

    public int hashCode() {
        return this.f5601a.hashCode();
    }

    public String toString() {
        return "ProductDetails{jsonString='" + this.f5601a + "', parsedJson=" + this.f5602b.toString() + ", productId='" + this.f5603c + "', productType='" + this.f5604d + "', title='" + this.f5605e + "', productDetailsToken='" + this.f5608h + "', subscriptionOfferDetails=" + String.valueOf(this.f5612l) + "}";
    }
}
