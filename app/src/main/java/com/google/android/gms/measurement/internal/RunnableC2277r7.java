package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes.dex */
public final class RunnableC2277r7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8511n;

    /* renamed from: o */
    final /* synthetic */ String f8512o;

    /* renamed from: p */
    final /* synthetic */ String f8513p;

    /* renamed from: q */
    final /* synthetic */ zzp f8514q;

    /* renamed from: r */
    final /* synthetic */ boolean f8515r;

    /* renamed from: s */
    final /* synthetic */ C2350y7 f8516s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2277r7(C2350y7 c2350y7, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z10) {
        this.f8516s = c2350y7;
        this.f8511n = atomicReference;
        this.f8512o = str2;
        this.f8513p = str3;
        this.f8514q = zzpVar;
        this.f8515r = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0990d interfaceC0990d;
        synchronized (this.f8511n) {
            try {
                try {
                    interfaceC0990d = this.f8516s.f8787d;
                } catch (RemoteException e10) {
                    this.f8516s.f8118a.mo9765d().m10048r().m9896d("(legacy) Failed to get user properties; remote exception", null, this.f8512o, e10);
                    this.f8511n.set(Collections.emptyList());
                    atomicReference = this.f8511n;
                }
                if (interfaceC0990d == null) {
                    this.f8516s.f8118a.mo9765d().m10048r().m9896d("(legacy) Failed to get user properties; not connected to service", null, this.f8512o, this.f8513p);
                    this.f8511n.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C5984j.m21286j(this.f8514q);
                    this.f8511n.set(interfaceC0990d.mo6222x(this.f8512o, this.f8513p, this.f8515r, this.f8514q));
                } else {
                    this.f8511n.set(interfaceC0990d.mo6207E(null, this.f8512o, this.f8513p, this.f8515r));
                }
                this.f8516s.m10358E();
                atomicReference = this.f8511n;
                atomicReference.notify();
            } finally {
                this.f8511n.notify();
            }
        }
    }
}
