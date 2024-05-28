package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* loaded from: classes.dex */
public final class RunnableC2298t6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2276r6 f8574n;

    /* renamed from: o */
    final /* synthetic */ C2276r6 f8575o;

    /* renamed from: p */
    final /* synthetic */ long f8576p;

    /* renamed from: q */
    final /* synthetic */ boolean f8577q;

    /* renamed from: r */
    final /* synthetic */ C2349y6 f8578r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2298t6(C2349y6 c2349y6, C2276r6 c2276r6, C2276r6 c2276r62, long j10, boolean z10) {
        this.f8578r = c2349y6;
        this.f8574n = c2276r6;
        this.f8575o = c2276r62;
        this.f8576p = j10;
        this.f8577q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8578r.m10338p(this.f8574n, this.f8575o, this.f8576p, this.f8577q, null);
    }
}
