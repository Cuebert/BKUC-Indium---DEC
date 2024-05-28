package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
public final class C1403q extends AbstractC1396j {

    /* renamed from: g */
    final /* synthetic */ AbstractC1388b f6366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1403q(AbstractC1388b abstractC1388b, int i10, Bundle bundle) {
        super(abstractC1388b, i10, null);
        this.f6366g = abstractC1388b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1396j
    /* renamed from: f */
    protected final void mo7697f(ConnectionResult connectionResult) {
        if (this.f6366g.m7675t() && AbstractC1388b.m7642h0(this.f6366g)) {
            AbstractC1388b.m7639d0(this.f6366g, 16);
        } else {
            this.f6366g.f6330p.mo7581a(connectionResult);
            this.f6366g.m7651L(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1396j
    /* renamed from: g */
    protected final boolean mo7698g() {
        this.f6366g.f6330p.mo7581a(ConnectionResult.f6108r);
        return true;
    }
}
