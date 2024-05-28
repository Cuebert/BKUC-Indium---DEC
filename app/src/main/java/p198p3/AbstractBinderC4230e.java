package p198p3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: p3.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4230e extends BinderC4258s implements InterfaceC4232f {
    public AbstractBinderC4230e() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // p198p3.BinderC4258s
    /* renamed from: i */
    protected final boolean mo17652i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C4229d0.m17656a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) C4229d0.m17656a(parcel, PendingIntent.CREATOR);
        C4229d0.m17657b(parcel);
        mo17662h(status, pendingIntent);
        return true;
    }
}
