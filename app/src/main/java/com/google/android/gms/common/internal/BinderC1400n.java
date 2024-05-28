package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import p321z2.AbstractBinderC5977f0;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes.dex */
public final class BinderC1400n extends AbstractBinderC5977f0 {

    /* renamed from: c */
    private AbstractC1388b f6360c;

    /* renamed from: d */
    private final int f6361d;

    public BinderC1400n(AbstractC1388b abstractC1388b, int i10) {
        this.f6360c = abstractC1388b;
        this.f6361d = i10;
    }

    @Override // p321z2.InterfaceC5974e
    /* renamed from: G0 */
    public final void mo7705G0(int i10, IBinder iBinder, Bundle bundle) {
        C5984j.m21287k(this.f6360c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f6360c.m7653N(i10, iBinder, bundle, this.f6361d);
        this.f6360c = null;
    }

    @Override // p321z2.InterfaceC5974e
    /* renamed from: d0 */
    public final void mo7706d0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p321z2.InterfaceC5974e
    /* renamed from: u0 */
    public final void mo7707u0(int i10, IBinder iBinder, zzk zzkVar) {
        AbstractC1388b abstractC1388b = this.f6360c;
        C5984j.m21287k(abstractC1388b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C5984j.m21286j(zzkVar);
        AbstractC1388b.m7638c0(abstractC1388b, zzkVar);
        mo7705G0(i10, iBinder, zzkVar.f6395n);
    }
}
