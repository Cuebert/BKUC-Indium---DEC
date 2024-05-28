package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* loaded from: classes.dex */
public final class RunnableC2222m7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8345n;

    /* renamed from: o */
    final /* synthetic */ C2350y7 f8346o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2222m7(C2350y7 c2350y7, zzp zzpVar) {
        this.f8346o = c2350y7;
        this.f8345n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8346o.f8787d;
        if (interfaceC0990d == null) {
            this.f8346o.f8118a.mo9765d().m10048r().m9893a("Failed to send consent settings to service");
            return;
        }
        try {
            C5984j.m21286j(this.f8345n);
            interfaceC0990d.mo6217q(this.f8345n);
            this.f8346o.m10358E();
        } catch (RemoteException e10) {
            this.f8346o.f8118a.mo9765d().m10048r().m9894b("Failed to send consent settings to the service", e10);
        }
    }
}
