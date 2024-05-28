package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes.dex */
public final class RunnableC2255p7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8431n;

    /* renamed from: o */
    final /* synthetic */ String f8432o;

    /* renamed from: p */
    final /* synthetic */ String f8433p;

    /* renamed from: q */
    final /* synthetic */ zzp f8434q;

    /* renamed from: r */
    final /* synthetic */ C2350y7 f8435r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2255p7(C2350y7 c2350y7, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.f8435r = c2350y7;
        this.f8431n = atomicReference;
        this.f8432o = str2;
        this.f8433p = str3;
        this.f8434q = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0990d interfaceC0990d;
        synchronized (this.f8431n) {
            try {
                try {
                    interfaceC0990d = this.f8435r.f8787d;
                } catch (RemoteException e10) {
                    this.f8435r.f8118a.mo9765d().m10048r().m9896d("(legacy) Failed to get conditional properties; remote exception", null, this.f8432o, e10);
                    this.f8431n.set(Collections.emptyList());
                    atomicReference = this.f8431n;
                }
                if (interfaceC0990d == null) {
                    this.f8435r.f8118a.mo9765d().m10048r().m9896d("(legacy) Failed to get conditional properties; not connected to service", null, this.f8432o, this.f8433p);
                    this.f8431n.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C5984j.m21286j(this.f8434q);
                    this.f8431n.set(interfaceC0990d.mo6220r0(this.f8432o, this.f8433p, this.f8434q));
                } else {
                    this.f8431n.set(interfaceC0990d.mo6212Z(null, this.f8432o, this.f8433p));
                }
                this.f8435r.m10358E();
                atomicReference = this.f8431n;
                atomicReference.notify();
            } finally {
                this.f8431n.notify();
            }
        }
    }
}
