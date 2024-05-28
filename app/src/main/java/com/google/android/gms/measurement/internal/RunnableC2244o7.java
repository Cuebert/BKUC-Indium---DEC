package com.google.android.gms.measurement.internal;

import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes.dex */
public final class RunnableC2244o7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8403n;

    /* renamed from: o */
    final /* synthetic */ boolean f8404o;

    /* renamed from: p */
    final /* synthetic */ zzab f8405p;

    /* renamed from: q */
    final /* synthetic */ zzab f8406q;

    /* renamed from: r */
    final /* synthetic */ C2350y7 f8407r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2244o7(C2350y7 c2350y7, boolean z10, zzp zzpVar, boolean z11, zzab zzabVar, zzab zzabVar2) {
        this.f8407r = c2350y7;
        this.f8403n = zzpVar;
        this.f8404o = z11;
        this.f8405p = zzabVar;
        this.f8406q = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8407r.f8787d;
        if (interfaceC0990d == null) {
            this.f8407r.f8118a.mo9765d().m10048r().m9893a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C5984j.m21286j(this.f8403n);
        this.f8407r.m10382r(interfaceC0990d, this.f8404o ? null : this.f8405p, this.f8403n);
        this.f8407r.m10358E();
    }
}
