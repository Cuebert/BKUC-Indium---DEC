package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes.dex */
final class RunnableC2317v4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8609n;

    /* renamed from: o */
    final /* synthetic */ BinderC2143f5 f8610o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2317v4(BinderC2143f5 binderC2143f5, zzp zzpVar) {
        this.f8610o = binderC2143f5;
        this.f8609n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8610o.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8610o.f8084c;
        c2103b92.m9788u(this.f8609n);
    }
}
