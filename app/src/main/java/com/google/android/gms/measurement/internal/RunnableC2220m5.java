package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1613i1;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes.dex */
final class RunnableC2220m5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1613i1 f8329n;

    /* renamed from: o */
    final /* synthetic */ AppMeasurementDynamiteService f8330o;

    public RunnableC2220m5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1613i1 interfaceC1613i1) {
        this.f8330o = appMeasurementDynamiteService;
        this.f8329n = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8330o.f7938c.m10112L().m10373R(this.f8329n);
    }
}
