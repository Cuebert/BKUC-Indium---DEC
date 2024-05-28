package p258u2;

import android.os.Parcel;
import android.os.RemoteException;
import p198p3.BinderC4258s;

/* renamed from: u2.o */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4833o extends BinderC4258s implements InterfaceC4834p {
    public AbstractBinderC4833o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            mo19027P();
        } else {
            if (i10 != 2) {
                return false;
            }
            mo19026B();
        }
        return true;
    }
}
