package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* loaded from: classes.dex */
final class CallableC2307u4 implements Callable<List<zzab>> {

    /* renamed from: a */
    final /* synthetic */ String f8593a;

    /* renamed from: b */
    final /* synthetic */ String f8594b;

    /* renamed from: c */
    final /* synthetic */ String f8595c;

    /* renamed from: d */
    final /* synthetic */ BinderC2143f5 f8596d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2307u4(BinderC2143f5 binderC2143f5, String str, String str2, String str3) {
        this.f8596d = binderC2143f5;
        this.f8593a = str;
        this.f8594b = str2;
        this.f8595c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<zzab> call() throws Exception {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8596d.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8596d.f8084c;
        return c2103b92.m9755V().m10015c0(this.f8593a, this.f8594b, this.f8595c);
    }
}
