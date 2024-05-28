package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes.dex */
final class RunnableC2253p5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ boolean f8429n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8430o;

    public RunnableC2253p5(C2221m6 c2221m6, boolean z10) {
        this.f8430o = c2221m6;
        this.f8429n = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m10127o = this.f8430o.f8118a.m10127o();
        boolean m10126n = this.f8430o.f8118a.m10126n();
        this.f8430o.f8118a.m10123k(this.f8429n);
        if (m10126n == this.f8429n) {
            this.f8430o.f8118a.mo9765d().m10052v().m9894b("Default data collection state already set to", Boolean.valueOf(this.f8429n));
        }
        if (this.f8430o.f8118a.m10127o() == m10127o || this.f8430o.f8118a.m10127o() != this.f8430o.f8118a.m10126n()) {
            this.f8430o.f8118a.mo9765d().m10054x().m9895c("Default data collection is different than actual status", Boolean.valueOf(this.f8429n), Boolean.valueOf(m10127o));
        }
        this.f8430o.m10137R();
    }
}
