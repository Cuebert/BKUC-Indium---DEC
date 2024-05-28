package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
abstract class AbstractC1396j extends AbstractC1399m {

    /* renamed from: d */
    public final int f6352d;

    /* renamed from: e */
    public final Bundle f6353e;

    /* renamed from: f */
    final /* synthetic */ AbstractC1388b f6354f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1396j(AbstractC1388b abstractC1388b, int i10, Bundle bundle) {
        super(abstractC1388b, Boolean.TRUE);
        this.f6354f = abstractC1388b;
        this.f6352d = i10;
        this.f6353e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1399m
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo7695a(Object obj) {
        if (this.f6352d != 0) {
            this.f6354f.m7643i0(1, null);
            Bundle bundle = this.f6353e;
            mo7697f(new ConnectionResult(this.f6352d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (mo7698g()) {
                return;
            }
            this.f6354f.m7643i0(1, null);
            mo7697f(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1399m
    /* renamed from: b */
    public final void mo7696b() {
    }

    /* renamed from: f */
    protected abstract void mo7697f(ConnectionResult connectionResult);

    /* renamed from: g */
    protected abstract boolean mo7698g();
}
