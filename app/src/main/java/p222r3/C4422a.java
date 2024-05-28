package p222r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public class C4422a implements IInterface {

    /* renamed from: c */
    private final IBinder f18005c;

    /* renamed from: d */
    private final String f18006d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4422a(IBinder iBinder, String str) {
        this.f18005c = iBinder;
        this.f18006d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18005c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m18222i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18006d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m18223l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18005c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m18224n(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f18005c.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
