package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import java.util.ArrayList;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* loaded from: classes.dex */
public final class RunnableC2266q7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8454n;

    /* renamed from: o */
    final /* synthetic */ String f8455o;

    /* renamed from: p */
    final /* synthetic */ zzp f8456p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC1613i1 f8457q;

    /* renamed from: r */
    final /* synthetic */ C2350y7 f8458r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2266q7(C2350y7 c2350y7, String str, String str2, zzp zzpVar, InterfaceC1613i1 interfaceC1613i1) {
        this.f8458r = c2350y7;
        this.f8454n = str;
        this.f8455o = str2;
        this.f8456p = zzpVar;
        this.f8457q = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219m4 c2219m4;
        InterfaceC0990d interfaceC0990d;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                interfaceC0990d = this.f8458r.f8787d;
                if (interfaceC0990d == null) {
                    this.f8458r.f8118a.mo9765d().m10048r().m9895c("Failed to get conditional properties; not connected to service", this.f8454n, this.f8455o);
                    c2219m4 = this.f8458r.f8118a;
                } else {
                    C5984j.m21286j(this.f8456p);
                    arrayList = C2169h9.m9940u(interfaceC0990d.mo6220r0(this.f8454n, this.f8455o, this.f8456p));
                    this.f8458r.m10358E();
                    c2219m4 = this.f8458r.f8118a;
                }
            } catch (RemoteException e10) {
                this.f8458r.f8118a.mo9765d().m10048r().m9896d("Failed to get conditional properties; remote exception", this.f8454n, this.f8455o, e10);
                c2219m4 = this.f8458r.f8118a;
            }
            c2219m4.m10114N().m9945D(this.f8457q, arrayList);
        } catch (Throwable th) {
            this.f8458r.f8118a.m10114N().m9945D(this.f8457q, arrayList);
            throw th;
        }
    }
}
