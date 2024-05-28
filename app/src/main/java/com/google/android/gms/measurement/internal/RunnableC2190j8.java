package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* loaded from: classes.dex */
final class RunnableC2190j8 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2202k9 f8219n;

    /* renamed from: o */
    final /* synthetic */ AppMeasurementDynamiteService f8220o;

    public RunnableC2190j8(AppMeasurementDynamiteService appMeasurementDynamiteService, C2202k9 c2202k9) {
        this.f8220o = appMeasurementDynamiteService;
        this.f8219n = c2202k9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8220o.f7938c.m10109I().m10149I(this.f8219n);
    }
}
