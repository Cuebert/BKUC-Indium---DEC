package p025c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: c.c */
/* loaded from: classes.dex */
public final class C1114c extends AbstractC1112a<Intent, ActivityResult> {
    @Override // p025c.AbstractC1112a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4537a(Context context, Intent intent) {
        return intent;
    }

    @Override // p025c.AbstractC1112a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo4538c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
