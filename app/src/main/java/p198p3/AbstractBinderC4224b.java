package p198p3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: p3.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4224b extends BinderC4258s implements InterfaceC4226c {
    public AbstractBinderC4224b() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) C4229d0.m17656a(parcel, BeginSignInResult.CREATOR);
        C4229d0.m17657b(parcel);
        mo17653O(status, beginSignInResult);
        return true;
    }
}
