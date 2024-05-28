package p246t3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: t3.a3 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4627a3 extends BinderC4629b0 implements InterfaceC4632b3 {
    public AbstractBinderC4627a3() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // p246t3.BinderC4629b0
    /* renamed from: i */
    protected final boolean mo18739i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C4625a1.m18724a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) C4625a1.m18724a(parcel, PendingIntent.CREATOR);
        C4625a1.m18725b(parcel);
        mo16474n0(status, pendingIntent);
        return true;
    }
}
