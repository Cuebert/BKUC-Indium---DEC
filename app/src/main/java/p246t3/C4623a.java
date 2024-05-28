package p246t3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: t3.a */
/* loaded from: classes.dex */
public class C4623a implements IInterface {

    /* renamed from: c */
    private final IBinder f18414c;

    /* renamed from: d */
    private final String f18415d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4623a(IBinder iBinder, String str) {
        this.f18414c = iBinder;
        this.f18415d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18414c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m18714i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18415d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m18715l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18414c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
