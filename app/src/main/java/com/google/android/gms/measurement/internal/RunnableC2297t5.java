package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* loaded from: classes.dex */
public final class RunnableC2297t5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8569n;

    /* renamed from: o */
    final /* synthetic */ String f8570o;

    /* renamed from: p */
    final /* synthetic */ Object f8571p;

    /* renamed from: q */
    final /* synthetic */ long f8572q;

    /* renamed from: r */
    final /* synthetic */ C2221m6 f8573r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2297t5(C2221m6 c2221m6, String str, String str2, Object obj, long j10) {
        this.f8573r = c2221m6;
        this.f8569n = str;
        this.f8570o = str2;
        this.f8571p = obj;
        this.f8572q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8573r.m10154N(this.f8569n, this.f8570o, this.f8571p, this.f8572q);
    }
}
