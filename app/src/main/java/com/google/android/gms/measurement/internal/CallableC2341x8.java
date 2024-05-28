package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p018b4.C0987a;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes.dex */
public final class CallableC2341x8 implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ zzp f8759a;

    /* renamed from: b */
    final /* synthetic */ C2103b9 f8760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2341x8(C2103b9 c2103b9, zzp zzpVar) {
        this.f8760b = c2103b9;
        this.f8759a = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        if (this.f8760b.m9754U((String) C5984j.m21286j(this.f8759a.f8858n)).m6203k() && C0987a.m6189b(this.f8759a.f8857I).m6203k()) {
            return this.f8760b.m9751R(this.f8759a).m10265f0();
        }
        this.f8760b.mo9765d().m10052v().m9893a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
