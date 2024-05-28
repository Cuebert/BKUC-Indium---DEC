package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.play_billing.e5 */
/* loaded from: classes.dex */
public class C1933e5 implements IInterface {

    /* renamed from: c */
    private final IBinder f7661c;

    /* renamed from: d */
    private final String f7662d = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C1933e5(IBinder iBinder, String str) {
        this.f7661c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7661c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m9342i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7662d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final Parcel m9343l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7661c.transact(i10, parcel, obtain, 0);
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
}
