package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes.dex */
public class C1708o0 implements IInterface {

    /* renamed from: c */
    private final IBinder f7107c;

    /* renamed from: d */
    private final String f7108d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1708o0(IBinder iBinder, String str) {
        this.f7107c = iBinder;
        this.f7108d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7107c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m8633i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7108d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final Parcel m8634l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7107c.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m8635n(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7107c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
