package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p018b4.InterfaceC0990d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes.dex */
public final class RunnableC2145f7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2276r6 f8089n;

    /* renamed from: o */
    final /* synthetic */ C2350y7 f8090o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2145f7(C2350y7 c2350y7, C2276r6 c2276r6) {
        this.f8090o = c2350y7;
        this.f8089n = c2276r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8090o.f8787d;
        if (interfaceC0990d == null) {
            this.f8090o.f8118a.mo9765d().m10048r().m9893a("Failed to send current screen to service");
            return;
        }
        try {
            C2276r6 c2276r6 = this.f8089n;
            if (c2276r6 == null) {
                interfaceC0990d.mo6219r(0L, null, null, this.f8090o.f8118a.mo9763c().getPackageName());
            } else {
                interfaceC0990d.mo6219r(c2276r6.f8507c, c2276r6.f8505a, c2276r6.f8506b, this.f8090o.f8118a.mo9763c().getPackageName());
            }
            this.f8090o.m10358E();
        } catch (RemoteException e10) {
            this.f8090o.f8118a.mo9765d().m10048r().m9894b("Failed to send current screen to the service", e10);
        }
    }
}
