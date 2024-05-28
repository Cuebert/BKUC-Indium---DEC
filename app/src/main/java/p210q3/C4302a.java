package p210q3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: q3.a */
/* loaded from: classes.dex */
public class C4302a implements IInterface {

    /* renamed from: c */
    private final IBinder f17529c;

    /* renamed from: d */
    private final String f17530d = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C4302a(IBinder iBinder, String str) {
        this.f17529c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17529c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m17815i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17530d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m17816l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17529c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
