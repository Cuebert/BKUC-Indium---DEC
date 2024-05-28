package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes.dex */
public final class RunnableC2287s6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ Bundle f8546n;

    /* renamed from: o */
    final /* synthetic */ C2276r6 f8547o;

    /* renamed from: p */
    final /* synthetic */ C2276r6 f8548p;

    /* renamed from: q */
    final /* synthetic */ long f8549q;

    /* renamed from: r */
    final /* synthetic */ C2349y6 f8550r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2287s6(C2349y6 c2349y6, Bundle bundle, C2276r6 c2276r6, C2276r6 c2276r62, long j10) {
        this.f8550r = c2349y6;
        this.f8546n = bundle;
        this.f8547o = c2276r6;
        this.f8548p = c2276r62;
        this.f8549q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2349y6.m10343x(this.f8550r, this.f8546n, this.f8547o, this.f8548p, this.f8549q);
    }
}
