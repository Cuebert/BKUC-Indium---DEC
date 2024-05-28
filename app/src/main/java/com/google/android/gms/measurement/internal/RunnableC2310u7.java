package com.google.android.gms.measurement.internal;

import p018b4.InterfaceC0990d;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes.dex */
final class RunnableC2310u7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC0990d f8600n;

    /* renamed from: o */
    final /* synthetic */ ServiceConnectionC2340x7 f8601o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2310u7(ServiceConnectionC2340x7 serviceConnectionC2340x7, InterfaceC0990d interfaceC0990d) {
        this.f8601o = serviceConnectionC2340x7;
        this.f8600n = interfaceC0990d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8601o) {
            this.f8601o.f8756a = false;
            if (!this.f8601o.f8758c.m10390z()) {
                this.f8601o.f8758c.f8118a.mo9765d().m10047q().m9893a("Connected to remote service");
                this.f8601o.f8758c.m10388x(this.f8600n);
            }
        }
    }
}
