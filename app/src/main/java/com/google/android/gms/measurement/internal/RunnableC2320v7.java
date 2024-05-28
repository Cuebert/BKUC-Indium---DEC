package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes.dex */
final class RunnableC2320v7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ ServiceConnectionC2340x7 f8615n;

    public RunnableC2320v7(ServiceConnectionC2340x7 serviceConnectionC2340x7) {
        this.f8615n = serviceConnectionC2340x7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2350y7 c2350y7 = this.f8615n.f8758c;
        Context mo9763c = c2350y7.f8118a.mo9763c();
        this.f8615n.f8758c.f8118a.mo9768f();
        C2350y7.m10365M(c2350y7, new ComponentName(mo9763c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
