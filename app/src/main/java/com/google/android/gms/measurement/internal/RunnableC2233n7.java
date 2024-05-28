package com.google.android.gms.measurement.internal;

import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* loaded from: classes.dex */
public final class RunnableC2233n7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8367n;

    /* renamed from: o */
    final /* synthetic */ boolean f8368o;

    /* renamed from: p */
    final /* synthetic */ zzat f8369p;

    /* renamed from: q */
    final /* synthetic */ String f8370q;

    /* renamed from: r */
    final /* synthetic */ C2350y7 f8371r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2233n7(C2350y7 c2350y7, boolean z10, zzp zzpVar, boolean z11, zzat zzatVar, String str) {
        this.f8371r = c2350y7;
        this.f8367n = zzpVar;
        this.f8368o = z11;
        this.f8369p = zzatVar;
        this.f8370q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0990d interfaceC0990d;
        interfaceC0990d = this.f8371r.f8787d;
        if (interfaceC0990d == null) {
            this.f8371r.f8118a.mo9765d().m10048r().m9893a("Discarding data. Failed to send event to service");
            return;
        }
        C5984j.m21286j(this.f8367n);
        this.f8371r.m10382r(interfaceC0990d, this.f8368o ? null : this.f8369p, this.f8367n);
        this.f8371r.m10358E();
    }
}
