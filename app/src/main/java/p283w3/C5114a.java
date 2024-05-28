package p283w3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: w3.a */
/* loaded from: classes.dex */
public class C5114a implements IInterface {

    /* renamed from: c */
    private final IBinder f19378c;

    /* renamed from: d */
    private final String f19379d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5114a(IBinder iBinder, String str) {
        this.f19378c = iBinder;
        this.f19379d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19378c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m19747i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19379d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final Parcel m19748l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f19378c.transact(i10, parcel, obtain, 0);
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
    public final void m19749n(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f19378c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
