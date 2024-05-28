package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1645k1;
import p018b4.InterfaceC1004r;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes.dex */
final class C2213l9 implements InterfaceC1004r {

    /* renamed from: a */
    public final InterfaceC1645k1 f8279a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8280b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2213l9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1645k1 interfaceC1645k1) {
        this.f8280b = appMeasurementDynamiteService;
        this.f8279a = interfaceC1645k1;
    }

    @Override // p018b4.InterfaceC1004r
    /* renamed from: a */
    public final void mo6233a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f8279a.mo8317t(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2219m4 c2219m4 = this.f8280b.f7938c;
            if (c2219m4 != null) {
                c2219m4.mo9765d().m10053w().m9894b("Event listener threw exception", e10);
            }
        }
    }
}
