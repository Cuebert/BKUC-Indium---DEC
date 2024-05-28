package com.google.android.gms.measurement.internal;

import p018b4.InterfaceC0990d;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* loaded from: classes.dex */
final class RunnableC2288s7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC0990d f8551n;

    /* renamed from: o */
    final /* synthetic */ ServiceConnectionC2340x7 f8552o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2288s7(ServiceConnectionC2340x7 serviceConnectionC2340x7, InterfaceC0990d interfaceC0990d) {
        this.f8552o = serviceConnectionC2340x7;
        this.f8551n = interfaceC0990d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8552o) {
            this.f8552o.f8756a = false;
            if (!this.f8552o.f8758c.m10390z()) {
                this.f8552o.f8758c.f8118a.mo9765d().m10052v().m9893a("Connected to service");
                this.f8552o.f8758c.m10388x(this.f8551n);
            }
        }
    }
}
