package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* loaded from: classes.dex */
public final class RunnableC2319v6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ long f8613n;

    /* renamed from: o */
    final /* synthetic */ C2349y6 f8614o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2319v6(C2349y6 c2349y6, long j10) {
        this.f8614o = c2349y6;
        this.f8613n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8614o.f8118a.m10133y().m10399n(this.f8613n);
        this.f8614o.f8776e = null;
    }
}
