package p198p3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: p3.i */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4238i extends BinderC4258s implements InterfaceC4240j {
    public AbstractBinderC4238i() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) C4229d0.m17656a(parcel, SavePasswordResult.CREATOR);
        C4229d0.m17657b(parcel);
        mo17666o0(status, savePasswordResult);
        return true;
    }
}
