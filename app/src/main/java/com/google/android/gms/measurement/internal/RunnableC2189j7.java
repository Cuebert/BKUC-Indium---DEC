package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1613i1;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* loaded from: classes.dex */
final class RunnableC2189j7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1613i1 f8214n;

    /* renamed from: o */
    final /* synthetic */ String f8215o;

    /* renamed from: p */
    final /* synthetic */ String f8216p;

    /* renamed from: q */
    final /* synthetic */ boolean f8217q;

    /* renamed from: r */
    final /* synthetic */ AppMeasurementDynamiteService f8218r;

    public RunnableC2189j7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1613i1 interfaceC1613i1, String str, String str2, boolean z10) {
        this.f8218r = appMeasurementDynamiteService;
        this.f8214n = interfaceC1613i1;
        this.f8215o = str;
        this.f8216p = str2;
        this.f8217q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8218r.f7938c.m10112L().m10377V(this.f8214n, this.f8215o, this.f8216p, this.f8217q);
    }
}
