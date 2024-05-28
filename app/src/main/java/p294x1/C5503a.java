package p294x1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public class C5503a implements IInterface {

    /* renamed from: c */
    private final IBinder f20532c;

    /* renamed from: d */
    private final String f20533d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5503a(IBinder iBinder, String str) {
        this.f20532c = iBinder;
        this.f20533d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20532c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m20239i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20533d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final Parcel m20240l(Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20532c.transact(1, parcel, obtain, 0);
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
