package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes.dex */
public final class C1756r0 extends C1708o0 implements InterfaceC1788t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1756r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1788t0
    /* renamed from: m */
    public final Bundle mo8739m(Bundle bundle) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, bundle);
        Parcel m8634l = m8634l(1, m8633i);
        Bundle bundle2 = (Bundle) C1740q0.m8704a(m8634l, Bundle.CREATOR);
        m8634l.recycle();
        return bundle2;
    }
}
