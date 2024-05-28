package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import java.util.List;
import p018b4.InterfaceC0990d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes.dex */
public final class RunnableC2359z6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8811n;

    /* renamed from: o */
    final /* synthetic */ String f8812o;

    /* renamed from: p */
    final /* synthetic */ zzp f8813p;

    /* renamed from: q */
    final /* synthetic */ boolean f8814q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC1613i1 f8815r;

    /* renamed from: s */
    final /* synthetic */ C2350y7 f8816s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2359z6(C2350y7 c2350y7, String str, String str2, zzp zzpVar, boolean z10, InterfaceC1613i1 interfaceC1613i1) {
        this.f8816s = c2350y7;
        this.f8811n = str;
        this.f8812o = str2;
        this.f8813p = zzpVar;
        this.f8814q = z10;
        this.f8815r = interfaceC1613i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        InterfaceC0990d interfaceC0990d;
        Bundle bundle2 = new Bundle();
        try {
            interfaceC0990d = this.f8816s.f8787d;
            if (interfaceC0990d == null) {
                this.f8816s.f8118a.mo9765d().m10048r().m9895c("Failed to get user properties; not connected to service", this.f8811n, this.f8812o);
                this.f8816s.f8118a.m10114N().m9946E(this.f8815r, bundle2);
                return;
            }
            C5984j.m21286j(this.f8813p);
            List<zzkv> mo6222x = interfaceC0990d.mo6222x(this.f8811n, this.f8812o, this.f8814q, this.f8813p);
            bundle = new Bundle();
            if (mo6222x != null) {
                for (zzkv zzkvVar : mo6222x) {
                    String str = zzkvVar.f8846r;
                    if (str != null) {
                        bundle.putString(zzkvVar.f8843o, str);
                    } else {
                        Long l10 = zzkvVar.f8845q;
                        if (l10 != null) {
                            bundle.putLong(zzkvVar.f8843o, l10.longValue());
                        } else {
                            Double d10 = zzkvVar.f8848t;
                            if (d10 != null) {
                                bundle.putDouble(zzkvVar.f8843o, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f8816s.m10358E();
                    this.f8816s.f8118a.m10114N().m9946E(this.f8815r, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.f8816s.f8118a.m10114N().m9946E(this.f8815r, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.f8816s.f8118a.mo9765d().m10048r().m9895c("Failed to get user properties; remote exception", this.f8811n, e10);
                this.f8816s.f8118a.m10114N().m9946E(this.f8815r, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.f8816s.f8118a.m10114N().m9946E(this.f8815r, bundle2);
            throw th;
        }
    }
}
