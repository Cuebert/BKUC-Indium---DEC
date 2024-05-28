package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes.dex */
final class RunnableC2241o4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzab f8393n;

    /* renamed from: o */
    final /* synthetic */ zzp f8394o;

    /* renamed from: p */
    final /* synthetic */ BinderC2143f5 f8395p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2241o4(BinderC2143f5 binderC2143f5, zzab zzabVar, zzp zzpVar) {
        this.f8395p = binderC2143f5;
        this.f8393n = zzabVar;
        this.f8394o = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        C2103b9 c2103b93;
        c2103b9 = this.f8395p.f8084c;
        c2103b9.m9760a();
        if (this.f8393n.f8828p.m10411x() == null) {
            c2103b93 = this.f8395p.f8084c;
            c2103b93.m9786s(this.f8393n, this.f8394o);
        } else {
            c2103b92 = this.f8395p.f8084c;
            c2103b92.m9791x(this.f8393n, this.f8394o);
        }
    }
}
