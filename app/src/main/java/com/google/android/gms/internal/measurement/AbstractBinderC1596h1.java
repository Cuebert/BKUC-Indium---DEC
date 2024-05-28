package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1596h1 extends BinderC1724p0 implements InterfaceC1613i1 {
    public AbstractBinderC1596h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC1724p0
    /* renamed from: i */
    protected final boolean mo6205i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        mo7941m((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
