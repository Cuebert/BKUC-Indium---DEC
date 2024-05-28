package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes.dex */
public final class RunnableC2101b7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f7987n;

    /* renamed from: o */
    final /* synthetic */ C2350y7 f7988o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2101b7(C2350y7 c2350y7, zzp zzpVar) {
        this.f7988o = c2350y7;
        this.f7987n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f7988o.f8787d;
        if (interfaceC0990d == null) {
            this.f7988o.f8118a.mo9765d().m10048r().m9893a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C5984j.m21286j(this.f7987n);
            interfaceC0990d.mo6209J(this.f7987n);
        } catch (RemoteException e10) {
            this.f7988o.f8118a.mo9765d().m10048r().m9894b("Failed to reset data on the service: remote exception", e10);
        }
        this.f7988o.m10358E();
    }
}
