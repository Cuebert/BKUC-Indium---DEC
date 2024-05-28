package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p171n1.C4034m0;

/* renamed from: com.android.billingclient.api.b */
/* loaded from: classes.dex */
public final class C1171b {

    /* renamed from: a */
    private final String f5522a;

    /* renamed from: b */
    private final JSONObject f5523b;

    /* renamed from: c */
    private final List f5524c;

    /* renamed from: com.android.billingclient.api.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final String f5525a;

        /* renamed from: b */
        private final String f5526b;

        /* renamed from: c */
        private final String f5527c;

        /* synthetic */ a(JSONObject jSONObject, C4034m0 c4034m0) {
            this.f5525a = jSONObject.optString("productId");
            this.f5526b = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.f5527c = true == optString.isEmpty() ? null : optString;
        }

        /* renamed from: a */
        public String m6805a() {
            return this.f5525a;
        }

        /* renamed from: b */
        public String m6806b() {
            return this.f5527c;
        }

        /* renamed from: c */
        public String m6807c() {
            return this.f5526b;
        }

        public final boolean equals(Object obj) {
            String str;
            String m6806b;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5525a.equals(aVar.m6805a()) && this.f5526b.equals(aVar.m6807c()) && ((str = this.f5527c) == (m6806b = aVar.m6806b()) || (str != null && str.equals(m6806b)));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5525a, this.f5526b, this.f5527c});
        }

        public final String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f5525a, this.f5526b, this.f5527c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1171b(String str) throws JSONException {
        this.f5522a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5523b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new a(optJSONObject, null));
                }
            }
        }
        this.f5524c = arrayList;
    }
}
