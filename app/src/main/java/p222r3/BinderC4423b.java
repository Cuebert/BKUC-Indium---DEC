package p222r3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: r3.b */
/* loaded from: classes.dex */
public class BinderC4423b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC4423b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: J0 */
    protected boolean mo13534J0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo13534J0(i10, parcel, parcel2, i11);
    }
}
