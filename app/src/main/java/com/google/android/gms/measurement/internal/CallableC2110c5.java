package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes.dex */
final class CallableC2110c5 implements Callable<List<C2147f9>> {

    /* renamed from: a */
    final /* synthetic */ String f8028a;

    /* renamed from: b */
    final /* synthetic */ BinderC2143f5 f8029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2110c5(BinderC2143f5 binderC2143f5, String str) {
        this.f8029b = binderC2143f5;
        this.f8028a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C2147f9> call() throws Exception {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8029b.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8029b.f8084c;
        return c2103b92.m9755V().m10017e0(this.f8028a);
    }
}
