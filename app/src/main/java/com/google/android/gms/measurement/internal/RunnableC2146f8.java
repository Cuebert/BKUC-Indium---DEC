package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
/* loaded from: classes.dex */
final class RunnableC2146f8 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ long f8091n;

    /* renamed from: o */
    final /* synthetic */ C2234n8 f8092o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2146f8(C2234n8 c2234n8, long j10) {
        this.f8092o = c2234n8;
        this.f8091n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2234n8.m10188q(this.f8092o, this.f8091n);
    }
}
