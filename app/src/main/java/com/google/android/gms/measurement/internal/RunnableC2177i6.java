package com.google.android.gms.measurement.internal;

import p018b4.C0987a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes.dex */
public final class RunnableC2177i6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C0987a f8182n;

    /* renamed from: o */
    final /* synthetic */ int f8183o;

    /* renamed from: p */
    final /* synthetic */ long f8184p;

    /* renamed from: q */
    final /* synthetic */ boolean f8185q;

    /* renamed from: r */
    final /* synthetic */ C2221m6 f8186r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2177i6(C2221m6 c2221m6, C0987a c0987a, int i10, long j10, boolean z10) {
        this.f8186r = c2221m6;
        this.f8182n = c0987a;
        this.f8183o = i10;
        this.f8184p = j10;
        this.f8185q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8186r.m10151K(this.f8182n);
        C2221m6.m10138d0(this.f8186r, this.f8182n, this.f8183o, this.f8184p, false, this.f8185q);
    }
}
