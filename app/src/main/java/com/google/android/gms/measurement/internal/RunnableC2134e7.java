package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* loaded from: classes.dex */
public final class RunnableC2134e7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8066n;

    /* renamed from: o */
    final /* synthetic */ C2350y7 f8067o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2134e7(C2350y7 c2350y7, zzp zzpVar) {
        this.f8067o = c2350y7;
        this.f8066n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8067o.f8787d;
        if (interfaceC0990d == null) {
            this.f8067o.f8118a.mo9765d().m10048r().m9893a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C5984j.m21286j(this.f8066n);
            interfaceC0990d.mo6218q0(this.f8066n);
            this.f8067o.f8118a.m10104C().m9800t();
            this.f8067o.m10382r(interfaceC0990d, null, this.f8066n);
            this.f8067o.m10358E();
        } catch (RemoteException e10) {
            this.f8067o.f8118a.mo9765d().m10048r().m9894b("Failed to send app launch to the service", e10);
        }
    }
}
