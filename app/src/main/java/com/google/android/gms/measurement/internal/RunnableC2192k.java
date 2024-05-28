package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes.dex */
public final class RunnableC2192k implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC2176i5 f8223n;

    /* renamed from: o */
    final /* synthetic */ AbstractC2203l f8224o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2192k(AbstractC2203l abstractC2203l, InterfaceC2176i5 interfaceC2176i5) {
        this.f8224o = abstractC2203l;
        this.f8223n = interfaceC2176i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8223n.mo9768f();
        if (C2093b.m9730a()) {
            this.f8223n.mo9761b().m10081z(this);
            return;
        }
        boolean m10086e = this.f8224o.m10086e();
        this.f8224o.f8256c = 0L;
        if (m10086e) {
            this.f8224o.mo9925c();
        }
    }
}
