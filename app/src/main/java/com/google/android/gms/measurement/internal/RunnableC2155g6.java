package com.google.android.gms.measurement.internal;

import p018b4.C0987a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes.dex */
public final class RunnableC2155g6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C0987a f8119n;

    /* renamed from: o */
    final /* synthetic */ long f8120o;

    /* renamed from: p */
    final /* synthetic */ int f8121p;

    /* renamed from: q */
    final /* synthetic */ long f8122q;

    /* renamed from: r */
    final /* synthetic */ boolean f8123r;

    /* renamed from: s */
    final /* synthetic */ C2221m6 f8124s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2155g6(C2221m6 c2221m6, C0987a c0987a, long j10, int i10, long j11, boolean z10) {
        this.f8124s = c2221m6;
        this.f8119n = c0987a;
        this.f8120o = j10;
        this.f8121p = i10;
        this.f8122q = j11;
        this.f8123r = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8124s.m10151K(this.f8119n);
        this.f8124s.m10180z(this.f8120o, false);
        C2221m6.m10138d0(this.f8124s, this.f8119n, this.f8121p, this.f8122q, true, this.f8123r);
    }
}
