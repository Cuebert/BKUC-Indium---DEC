package com.google.android.gms.measurement.internal;

import p018b4.C0987a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes.dex */
public final class RunnableC2166h6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C0987a f8137n;

    /* renamed from: o */
    final /* synthetic */ int f8138o;

    /* renamed from: p */
    final /* synthetic */ long f8139p;

    /* renamed from: q */
    final /* synthetic */ boolean f8140q;

    /* renamed from: r */
    final /* synthetic */ C2221m6 f8141r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2166h6(C2221m6 c2221m6, C0987a c0987a, int i10, long j10, boolean z10) {
        this.f8141r = c2221m6;
        this.f8137n = c0987a;
        this.f8138o = i10;
        this.f8139p = j10;
        this.f8140q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8141r.m10151K(this.f8137n);
        C2221m6.m10138d0(this.f8141r, this.f8137n, this.f8138o, this.f8139p, false, this.f8140q);
    }
}
