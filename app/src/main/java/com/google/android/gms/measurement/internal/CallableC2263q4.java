package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes.dex */
final class CallableC2263q4 implements Callable<List<C2147f9>> {

    /* renamed from: a */
    final /* synthetic */ String f8449a;

    /* renamed from: b */
    final /* synthetic */ String f8450b;

    /* renamed from: c */
    final /* synthetic */ String f8451c;

    /* renamed from: d */
    final /* synthetic */ BinderC2143f5 f8452d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2263q4(BinderC2143f5 binderC2143f5, String str, String str2, String str3) {
        this.f8452d = binderC2143f5;
        this.f8449a = str;
        this.f8450b = str2;
        this.f8451c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C2147f9> call() throws Exception {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8452d.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8452d.f8084c;
        return c2103b92.m9755V().m10018f0(this.f8449a, this.f8450b, this.f8451c);
    }
}
