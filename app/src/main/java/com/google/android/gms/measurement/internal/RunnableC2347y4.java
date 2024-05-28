package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1490ae;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes.dex */
final class RunnableC2347y4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzat f8767n;

    /* renamed from: o */
    final /* synthetic */ zzp f8768o;

    /* renamed from: p */
    final /* synthetic */ BinderC2143f5 f8769p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2347y4(BinderC2143f5 binderC2143f5, zzat zzatVar, zzp zzpVar) {
        this.f8769p = binderC2143f5;
        this.f8767n = zzatVar;
        this.f8768o = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        zzat m9889J0 = this.f8769p.m9889J0(this.f8767n, this.f8768o);
        C1490ae.m7927b();
        c2103b9 = this.f8769p.f8084c;
        if (c2103b9.m9753T().m9861B(null, C2335x2.f8739v0)) {
            this.f8769p.m9890M0(m9889J0, this.f8768o);
        } else {
            this.f8769p.m9888n(m9889J0, this.f8768o);
        }
    }
}
