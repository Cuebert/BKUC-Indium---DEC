package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes.dex */
final class RunnableC2121d5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8047n;

    /* renamed from: o */
    final /* synthetic */ BinderC2143f5 f8048o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2121d5(BinderC2143f5 binderC2143f5, zzp zzpVar) {
        this.f8048o = binderC2143f5;
        this.f8047n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8048o.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8048o.f8084c;
        c2103b92.m9783p(this.f8047n);
    }
}
