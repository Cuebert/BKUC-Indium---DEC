package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1613i1;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes.dex */
final class RunnableC2180i9 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1613i1 f8193n;

    /* renamed from: o */
    final /* synthetic */ String f8194o;

    /* renamed from: p */
    final /* synthetic */ String f8195p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f8196q;

    public RunnableC2180i9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1613i1 interfaceC1613i1, String str, String str2) {
        this.f8196q = appMeasurementDynamiteService;
        this.f8193n = interfaceC1613i1;
        this.f8194o = str;
        this.f8195p = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8196q.f7938c.m10112L().m10375T(this.f8193n, this.f8194o, this.f8195p);
    }
}
