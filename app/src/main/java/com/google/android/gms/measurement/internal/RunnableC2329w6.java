package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* loaded from: classes.dex */
public final class RunnableC2329w6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2276r6 f8655n;

    /* renamed from: o */
    final /* synthetic */ long f8656o;

    /* renamed from: p */
    final /* synthetic */ C2349y6 f8657p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2329w6(C2349y6 c2349y6, C2276r6 c2276r6, long j10) {
        this.f8657p = c2349y6;
        this.f8655n = c2276r6;
        this.f8656o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8657p.m10339q(this.f8655n, false, this.f8656o);
        C2349y6 c2349y6 = this.f8657p;
        c2349y6.f8776e = null;
        c2349y6.f8118a.m10112L().m10385u(null);
    }
}
