package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1613i1;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* loaded from: classes.dex */
final class RunnableC2210l6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1613i1 f8269n;

    /* renamed from: o */
    final /* synthetic */ zzat f8270o;

    /* renamed from: p */
    final /* synthetic */ String f8271p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f8272q;

    public RunnableC2210l6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1613i1 interfaceC1613i1, zzat zzatVar, String str) {
        this.f8272q = appMeasurementDynamiteService;
        this.f8269n = interfaceC1613i1;
        this.f8270o = zzatVar;
        this.f8271p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8272q.f7938c.m10112L().m10380p(this.f8269n, this.f8270o, this.f8271p);
    }
}
