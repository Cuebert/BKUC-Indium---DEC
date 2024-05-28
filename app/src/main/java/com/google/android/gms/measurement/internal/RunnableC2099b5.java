package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes.dex */
final class RunnableC2099b5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzkv f7982n;

    /* renamed from: o */
    final /* synthetic */ zzp f7983o;

    /* renamed from: p */
    final /* synthetic */ BinderC2143f5 f7984p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2099b5(BinderC2143f5 binderC2143f5, zzkv zzkvVar, zzp zzpVar) {
        this.f7984p = binderC2143f5;
        this.f7982n = zzkvVar;
        this.f7983o = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        C2103b9 c2103b93;
        c2103b9 = this.f7984p.f8084c;
        c2103b9.m9760a();
        if (this.f7982n.m10411x() == null) {
            c2103b93 = this.f7984p.f8084c;
            c2103b93.m9787t(this.f7982n, this.f7983o);
        } else {
            c2103b92 = this.f7984p.f8084c;
            c2103b92.m9793z(this.f7982n, this.f7983o);
        }
    }
}
