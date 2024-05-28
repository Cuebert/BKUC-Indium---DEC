package p173n3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class C4055a implements IInterface {

    /* renamed from: c */
    private final IBinder f16466c;

    /* renamed from: d */
    private final String f16467d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4055a(IBinder iBinder, String str) {
        this.f16466c = iBinder;
        this.f16467d = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f16466c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m16854i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16467d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final Parcel m16855l(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f16466c.transact(i10, parcel, obtain, 0);
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
