package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import p018b4.InterfaceC0990d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes.dex */
public final class RunnableC2178i7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzat f8187n;

    /* renamed from: o */
    final /* synthetic */ String f8188o;

    /* renamed from: p */
    final /* synthetic */ InterfaceC1613i1 f8189p;

    /* renamed from: q */
    final /* synthetic */ C2350y7 f8190q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2178i7(C2350y7 c2350y7, zzat zzatVar, String str, InterfaceC1613i1 interfaceC1613i1) {
        this.f8190q = c2350y7;
        this.f8187n = zzatVar;
        this.f8188o = str;
        this.f8189p = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219m4 c2219m4;
        InterfaceC0990d interfaceC0990d;
        byte[] bArr = null;
        try {
            try {
                interfaceC0990d = this.f8190q.f8787d;
                if (interfaceC0990d == null) {
                    this.f8190q.f8118a.mo9765d().m10048r().m9893a("Discarding data. Failed to send event to service to bundle");
                    c2219m4 = this.f8190q.f8118a;
                } else {
                    bArr = interfaceC0990d.mo6214f0(this.f8187n, this.f8188o);
                    this.f8190q.m10358E();
                    c2219m4 = this.f8190q.f8118a;
                }
            } catch (RemoteException e10) {
                this.f8190q.f8118a.mo9765d().m10048r().m9894b("Failed to send event to the service to bundle", e10);
                c2219m4 = this.f8190q.f8118a;
            }
            c2219m4.m10114N().m9947F(this.f8189p, bArr);
        } catch (Throwable th) {
            this.f8190q.f8118a.m10114N().m9947F(this.f8189p, bArr);
            throw th;
        }
    }
}
