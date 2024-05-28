package p235s3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: s3.a */
/* loaded from: classes.dex */
public class C4518a implements IInterface {

    /* renamed from: c */
    private final IBinder f18267c;

    /* renamed from: d */
    private final String f18268d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4518a(IBinder iBinder, String str) {
        this.f18267c = iBinder;
        this.f18268d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18267c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m18538i(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f18267c.transact(i10, parcel, obtain, 0);
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
    /* renamed from: l */
    public final Parcel m18539l() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18268d);
        return obtain;
    }
}
