package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1645k1;
import p018b4.InterfaceC1003q;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* loaded from: classes.dex */
public final class C2202k9 implements InterfaceC1003q {

    /* renamed from: a */
    public final InterfaceC1645k1 f8251a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8252b;

    public C2202k9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1645k1 interfaceC1645k1) {
        this.f8252b = appMeasurementDynamiteService;
        this.f8251a = interfaceC1645k1;
    }

    @Override // p018b4.InterfaceC1003q
    /* renamed from: a */
    public final void mo6232a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f8251a.mo8317t(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2219m4 c2219m4 = this.f8252b.f7938c;
            if (c2219m4 != null) {
                c2219m4.mo9765d().m10053w().m9894b("Event interceptor threw exception", e10);
            }
        }
    }
}
