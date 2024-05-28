package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes.dex */
final class RunnableC2275r5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ long f8503n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8504o;

    public RunnableC2275r5(C2221m6 c2221m6, long j10) {
        this.f8504o = c2221m6;
        this.f8503n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8504o.f8118a.m10107F().f8638k.m10299b(this.f8503n);
        this.f8504o.f8118a.mo9765d().m10047q().m9894b("Session timeout duration set", Long.valueOf(this.f8503n));
    }
}
