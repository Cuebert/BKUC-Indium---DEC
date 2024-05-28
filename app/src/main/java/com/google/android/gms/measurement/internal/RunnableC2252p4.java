package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* loaded from: classes.dex */
final class RunnableC2252p4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzab f8427n;

    /* renamed from: o */
    final /* synthetic */ BinderC2143f5 f8428o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2252p4(BinderC2143f5 binderC2143f5, zzab zzabVar) {
        this.f8428o = binderC2143f5;
        this.f8427n = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        C2103b9 c2103b93;
        c2103b9 = this.f8428o.f8084c;
        c2103b9.m9760a();
        if (this.f8427n.f8828p.m10411x() == null) {
            c2103b93 = this.f8428o.f8084c;
            c2103b93.m9785r(this.f8427n);
        } else {
            c2103b92 = this.f8428o.f8084c;
            c2103b92.m9790w(this.f8427n);
        }
    }
}
