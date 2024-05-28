package p198p3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: p3.p0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4253p0 extends BinderC4258s implements InterfaceC4255q0 {
    public AbstractBinderC4253p0() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
            Credential credential = (Credential) C4229d0.m17656a(parcel, Credential.CREATOR);
            C4229d0.m17657b(parcel);
            mo17661m0(status, credential);
        } else if (i10 == 2) {
            Status status2 = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
            C4229d0.m17657b(parcel);
            mo17663g(status2);
        } else {
            if (i10 != 3) {
                return false;
            }
            Status status3 = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
            String readString = parcel.readString();
            C4229d0.m17657b(parcel);
            mo17660e0(status3, readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
