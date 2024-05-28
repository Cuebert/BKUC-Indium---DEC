package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes.dex */
public final class RunnableC2311u8 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2114c9 f8602n;

    /* renamed from: o */
    final /* synthetic */ C2103b9 f8603o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2311u8(C2103b9 c2103b9, C2114c9 c2114c9) {
        this.f8603o = c2103b9;
        this.f8602n = c2114c9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9.m9746j0(this.f8603o, this.f8602n);
        this.f8603o.m9789v();
    }
}
