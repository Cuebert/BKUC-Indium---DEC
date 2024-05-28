package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1613i1;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* loaded from: classes.dex */
final class RunnableC2191j9 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1613i1 f8221n;

    /* renamed from: o */
    final /* synthetic */ AppMeasurementDynamiteService f8222o;

    public RunnableC2191j9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1613i1 interfaceC1613i1) {
        this.f8222o = appMeasurementDynamiteService;
        this.f8221n = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8222o.f7938c.m10114N().m9944C(this.f8221n, this.f8222o.f7938c.m10126n());
    }
}
