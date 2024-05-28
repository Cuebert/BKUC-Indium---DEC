package p198p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: p3.a */
/* loaded from: classes.dex */
public class C4222a implements IInterface {

    /* renamed from: c */
    private final IBinder f17410c;

    /* renamed from: d */
    private final String f17411d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4222a(IBinder iBinder, String str) {
        this.f17410c = iBinder;
        this.f17411d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17410c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m17650i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17411d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m17651l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17410c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
