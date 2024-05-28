package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes.dex */
final class RunnableC2357z4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzat f8803n;

    /* renamed from: o */
    final /* synthetic */ String f8804o;

    /* renamed from: p */
    final /* synthetic */ BinderC2143f5 f8805p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2357z4(BinderC2143f5 binderC2143f5, zzat zzatVar, String str) {
        this.f8805p = binderC2143f5;
        this.f8803n = zzatVar;
        this.f8804o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8805p.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8805p.f8084c;
        c2103b92.m9776j(this.f8803n, this.f8804o);
    }
}
