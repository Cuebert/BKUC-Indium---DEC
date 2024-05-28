package com.google.android.gms.measurement.internal;

import p018b4.C0987a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* loaded from: classes.dex */
final class RunnableC2337x4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8751n;

    /* renamed from: o */
    final /* synthetic */ BinderC2143f5 f8752o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2337x4(BinderC2143f5 binderC2143f5, zzp zzpVar) {
        this.f8752o = binderC2143f5;
        this.f8751n = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8752o.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8752o.f8084c;
        zzp zzpVar = this.f8751n;
        c2103b92.mo9761b().mo9917h();
        c2103b92.m9770g();
        C5984j.m21282f(zzpVar.f8858n);
        C0987a m6189b = C0987a.m6189b(zzpVar.f8857I);
        C0987a m9754U = c2103b92.m9754U(zzpVar.f8858n);
        c2103b92.mo9765d().m10052v().m9895c("Setting consent, package, consent", zzpVar.f8858n, m6189b);
        c2103b92.m9792y(zzpVar.f8858n, m6189b);
        if (m6189b.m6204m(m9754U)) {
            c2103b92.m9788u(zzpVar);
        }
    }
}
