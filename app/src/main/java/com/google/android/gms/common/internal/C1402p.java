package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1388b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public final class C1402p extends AbstractC1396j {

    /* renamed from: g */
    public final IBinder f6364g;

    /* renamed from: h */
    final /* synthetic */ AbstractC1388b f6365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402p(AbstractC1388b abstractC1388b, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC1388b, i10, bundle);
        this.f6365h = abstractC1388b;
        this.f6364g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1396j
    /* renamed from: f */
    protected final void mo7697f(ConnectionResult connectionResult) {
        if (this.f6365h.f6336v != null) {
            this.f6365h.f6336v.mo7683l(connectionResult);
        }
        this.f6365h.m7651L(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1396j
    /* renamed from: g */
    protected final boolean mo7698g() {
        AbstractC1388b.a aVar;
        AbstractC1388b.a aVar2;
        try {
            IBinder iBinder = this.f6364g;
            C5984j.m21286j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f6365h.mo6182E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f6365h.mo6182E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface mo6186s = this.f6365h.mo6186s(this.f6364g);
            if (mo6186s == null || !(AbstractC1388b.m7641g0(this.f6365h, 2, 4, mo6186s) || AbstractC1388b.m7641g0(this.f6365h, 3, 4, mo6186s))) {
                return false;
            }
            this.f6365h.f6340z = null;
            Bundle m7678x = this.f6365h.m7678x();
            AbstractC1388b abstractC1388b = this.f6365h;
            aVar = abstractC1388b.f6335u;
            if (aVar == null) {
                return true;
            }
            aVar2 = abstractC1388b.f6335u;
            aVar2.mo7682n(m7678x);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
