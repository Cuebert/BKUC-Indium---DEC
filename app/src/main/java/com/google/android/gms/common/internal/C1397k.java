package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p321z2.InterfaceC5974e;
import p321z2.InterfaceC5976f;

/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes.dex */
final class C1397k implements InterfaceC5976f {

    /* renamed from: c */
    private final IBinder f6355c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1397k(IBinder iBinder) {
        this.f6355c = iBinder;
    }

    @Override // p321z2.InterfaceC5976f
    /* renamed from: V */
    public final void mo7699V(InterfaceC5974e interfaceC5974e, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC5974e != null ? interfaceC5974e.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C1405s.m7708a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6355c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6355c;
    }
}
