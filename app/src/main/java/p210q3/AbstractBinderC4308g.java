package p210q3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: q3.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4308g extends BinderC4305d implements InterfaceC4309h {
    public AbstractBinderC4308g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p210q3.BinderC4305d
    /* renamed from: i */
    protected final boolean mo17818i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        mo17822c0((Status) C4306e.m17819a(parcel, Status.CREATOR));
        return true;
    }
}
