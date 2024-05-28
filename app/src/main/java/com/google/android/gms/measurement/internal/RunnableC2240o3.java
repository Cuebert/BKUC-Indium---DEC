package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* loaded from: classes.dex */
final class RunnableC2240o3 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ boolean f8391n;

    /* renamed from: o */
    final /* synthetic */ C2251p3 f8392o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2240o3(C2251p3 c2251p3, boolean z10) {
        this.f8392o = c2251p3;
        this.f8391n = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        c2103b9 = this.f8392o.f8424a;
        c2103b9.m9781n(this.f8391n);
    }
}
