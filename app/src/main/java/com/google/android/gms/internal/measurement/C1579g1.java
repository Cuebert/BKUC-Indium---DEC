package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes.dex */
public final class C1579g1 extends C1708o0 implements InterfaceC1613i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1579g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1613i1
    /* renamed from: m */
    public final void mo7941m(Bundle bundle) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, bundle);
        m8635n(1, m8633i);
    }
}
