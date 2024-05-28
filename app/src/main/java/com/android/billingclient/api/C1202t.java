package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.t */
/* loaded from: classes.dex */
public final class C1202t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1202t(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
