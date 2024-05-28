package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes.dex */
final class CallableC2296t4 implements Callable<List<zzab>> {

    /* renamed from: a */
    final /* synthetic */ String f8565a;

    /* renamed from: b */
    final /* synthetic */ String f8566b;

    /* renamed from: c */
    final /* synthetic */ String f8567c;

    /* renamed from: d */
    final /* synthetic */ BinderC2143f5 f8568d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2296t4(BinderC2143f5 binderC2143f5, String str, String str2, String str3) {
        this.f8568d = binderC2143f5;
        this.f8565a = str;
        this.f8566b = str2;
        this.f8567c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<zzab> call() throws Exception {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        c2103b9 = this.f8568d.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f8568d.f8084c;
        return c2103b92.m9755V().m10015c0(this.f8565a, this.f8566b, this.f8567c);
    }
}
