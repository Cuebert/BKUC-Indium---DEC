package p258u2;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p198p3.BinderC4258s;
import p198p3.C4229d0;

/* renamed from: u2.q */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4835q extends BinderC4258s implements InterfaceC4836r {
    public AbstractBinderC4835q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C4229d0.m17656a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
                C4229d0.m17657b(parcel);
                mo19015E0(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
                C4229d0.m17657b(parcel);
                mo19016g(status2);
                break;
            case 103:
                Status status3 = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
                C4229d0.m17657b(parcel);
                mo19014C0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
