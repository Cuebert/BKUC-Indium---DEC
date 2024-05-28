package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes.dex */
final class RunnableC2132e5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8059n;

    /* renamed from: o */
    final /* synthetic */ String f8060o;

    /* renamed from: p */
    final /* synthetic */ String f8061p;

    /* renamed from: q */
    final /* synthetic */ long f8062q;

    /* renamed from: r */
    final /* synthetic */ BinderC2143f5 f8063r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2132e5(BinderC2143f5 binderC2143f5, String str, String str2, String str3, long j10) {
        this.f8063r = binderC2143f5;
        this.f8059n = str;
        this.f8060o = str2;
        this.f8061p = str3;
        this.f8062q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        String str = this.f8059n;
        if (str == null) {
            c2103b92 = this.f8063r.f8084c;
            c2103b92.m9762b0().m10111K().m10351G(this.f8060o, null);
        } else {
            C2276r6 c2276r6 = new C2276r6(this.f8061p, str, this.f8062q);
            c2103b9 = this.f8063r.f8084c;
            c2103b9.m9762b0().m10111K().m10351G(this.f8060o, c2276r6);
        }
    }
}
