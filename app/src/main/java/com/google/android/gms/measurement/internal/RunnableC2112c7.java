package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes.dex */
public final class RunnableC2112c7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8032n;

    /* renamed from: o */
    final /* synthetic */ zzp f8033o;

    /* renamed from: p */
    final /* synthetic */ C2350y7 f8034p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2112c7(C2350y7 c2350y7, AtomicReference atomicReference, zzp zzpVar) {
        this.f8034p = c2350y7;
        this.f8032n = atomicReference;
        this.f8033o = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0990d interfaceC0990d;
        synchronized (this.f8032n) {
            try {
                try {
                } catch (RemoteException e10) {
                    this.f8034p.f8118a.mo9765d().m10048r().m9894b("Failed to get app instance id", e10);
                    atomicReference = this.f8032n;
                }
                if (!this.f8034p.f8118a.m10107F().m10321q().m6203k()) {
                    this.f8034p.f8118a.mo9765d().m10054x().m9893a("Analytics storage consent denied; will not get app instance id");
                    this.f8034p.f8118a.m10109I().m10143C(null);
                    this.f8034p.f8118a.m10107F().f8634g.m10312b(null);
                    this.f8032n.set(null);
                    return;
                }
                interfaceC0990d = this.f8034p.f8787d;
                if (interfaceC0990d == null) {
                    this.f8034p.f8118a.mo9765d().m10048r().m9893a("Failed to get app instance id");
                    return;
                }
                C5984j.m21286j(this.f8033o);
                this.f8032n.set(interfaceC0990d.mo6210N(this.f8033o));
                String str = (String) this.f8032n.get();
                if (str != null) {
                    this.f8034p.f8118a.m10109I().m10143C(str);
                    this.f8034p.f8118a.m10107F().f8634g.m10312b(str);
                }
                this.f8034p.m10358E();
                atomicReference = this.f8032n;
                atomicReference.notify();
            } finally {
                this.f8032n.notify();
            }
        }
    }
}
