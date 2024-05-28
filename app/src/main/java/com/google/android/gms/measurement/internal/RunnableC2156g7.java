package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes.dex */
public final class RunnableC2156g7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8125n;

    /* renamed from: o */
    final /* synthetic */ Bundle f8126o;

    /* renamed from: p */
    final /* synthetic */ C2350y7 f8127p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2156g7(C2350y7 c2350y7, zzp zzpVar, Bundle bundle) {
        this.f8127p = c2350y7;
        this.f8125n = zzpVar;
        this.f8126o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8127p.f8787d;
        if (interfaceC0990d == null) {
            this.f8127p.f8118a.mo9765d().m10048r().m9893a("Failed to send default event parameters to service");
            return;
        }
        try {
            C5984j.m21286j(this.f8125n);
            interfaceC0990d.mo6221v(this.f8126o, this.f8125n);
        } catch (RemoteException e10) {
            this.f8127p.f8118a.mo9765d().m10048r().m9894b("Failed to send default event parameters to service", e10);
        }
    }
}
