package p045d5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d5.a */
/* loaded from: classes.dex */
public class C2975a implements IInterface {

    /* renamed from: c */
    private final IBinder f12659c;

    /* renamed from: d */
    private final String f12660d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2975a(IBinder iBinder, String str) {
        this.f12659c = iBinder;
        this.f12660d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12659c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m13431i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12660d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m13432l(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f12659c.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
