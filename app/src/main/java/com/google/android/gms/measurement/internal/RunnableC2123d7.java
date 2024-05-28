package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* loaded from: classes.dex */
public final class RunnableC2123d7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ zzp f8051n;

    /* renamed from: o */
    final /* synthetic */ InterfaceC1613i1 f8052o;

    /* renamed from: p */
    final /* synthetic */ C2350y7 f8053p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2123d7(C2350y7 c2350y7, zzp zzpVar, InterfaceC1613i1 interfaceC1613i1) {
        this.f8053p = c2350y7;
        this.f8051n = zzpVar;
        this.f8052o = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219m4 c2219m4;
        InterfaceC0990d interfaceC0990d;
        String str = null;
        try {
            try {
                if (this.f8053p.f8118a.m10107F().m10321q().m6203k()) {
                    interfaceC0990d = this.f8053p.f8787d;
                    if (interfaceC0990d == null) {
                        this.f8053p.f8118a.mo9765d().m10048r().m9893a("Failed to get app instance id");
                        c2219m4 = this.f8053p.f8118a;
                    } else {
                        C5984j.m21286j(this.f8051n);
                        str = interfaceC0990d.mo6210N(this.f8051n);
                        if (str != null) {
                            this.f8053p.f8118a.m10109I().m10143C(str);
                            this.f8053p.f8118a.m10107F().f8634g.m10312b(str);
                        }
                        this.f8053p.m10358E();
                        c2219m4 = this.f8053p.f8118a;
                    }
                } else {
                    this.f8053p.f8118a.mo9765d().m10054x().m9893a("Analytics storage consent denied; will not get app instance id");
                    this.f8053p.f8118a.m10109I().m10143C(null);
                    this.f8053p.f8118a.m10107F().f8634g.m10312b(null);
                    c2219m4 = this.f8053p.f8118a;
                }
            } catch (RemoteException e10) {
                this.f8053p.f8118a.mo9765d().m10048r().m9894b("Failed to get app instance id", e10);
                c2219m4 = this.f8053p.f8118a;
            }
            c2219m4.m10114N().m9950I(this.f8052o, str);
        } catch (Throwable th) {
            this.f8053p.f8118a.m10114N().m9950I(this.f8052o, null);
            throw th;
        }
    }
}
