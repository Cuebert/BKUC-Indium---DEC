package com.google.android.gms.measurement.internal;

import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes.dex */
public final class RunnableC2090a7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f7963n;

    /* renamed from: o */
    final /* synthetic */ boolean f7964o;

    /* renamed from: p */
    final /* synthetic */ zzkv f7965p;

    /* renamed from: q */
    final /* synthetic */ C2350y7 f7966q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2090a7(C2350y7 c2350y7, zzp zzpVar, boolean z10, zzkv zzkvVar) {
        this.f7966q = c2350y7;
        this.f7963n = zzpVar;
        this.f7964o = z10;
        this.f7965p = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f7966q.f8787d;
        if (interfaceC0990d == null) {
            this.f7966q.f8118a.mo9765d().m10048r().m9893a("Discarding data. Failed to set user property");
            return;
        }
        C5984j.m21286j(this.f7963n);
        this.f7966q.m10382r(interfaceC0990d, this.f7964o ? null : this.f7965p, this.f7963n);
        this.f7966q.m10358E();
    }
}
