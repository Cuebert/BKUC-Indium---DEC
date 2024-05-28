package p025c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: c.d */
/* loaded from: classes.dex */
public final class C1115d extends AbstractC1112a<IntentSenderRequest, ActivityResult> {
    @Override // p025c.AbstractC1112a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4537a(Context context, IntentSenderRequest intentSenderRequest) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
    }

    @Override // p025c.AbstractC1112a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo4538c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
