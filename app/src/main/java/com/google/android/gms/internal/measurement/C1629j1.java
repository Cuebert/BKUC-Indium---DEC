package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes.dex */
public final class C1629j1 extends C1708o0 implements InterfaceC1645k1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1629j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1645k1
    /* renamed from: c */
    public final int mo8316c() throws RemoteException {
        Parcel m8634l = m8634l(2, m8633i());
        int readInt = m8634l.readInt();
        m8634l.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1645k1
    /* renamed from: t */
    public final void mo8317t(String str, String str2, Bundle bundle, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8707d(m8633i, bundle);
        m8633i.writeLong(j10);
        m8635n(1, m8633i);
    }
}
