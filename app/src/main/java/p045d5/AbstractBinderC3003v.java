package p045d5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d5.v */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3003v extends BinderC2995n implements InterfaceC3004w {
    public AbstractBinderC3003v() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // p045d5.BinderC2995n
    /* renamed from: i */
    protected final boolean mo13464i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            Bundle bundle = (Bundle) C2996o.m13465a(parcel, Bundle.CREATOR);
            C2996o.m13466b(parcel);
            mo6275D(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) C2996o.m13465a(parcel, Bundle.CREATOR);
            C2996o.m13466b(parcel);
            mo6277h0(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) C2996o.m13465a(parcel, Bundle.CREATOR);
            C2996o.m13466b(parcel);
            mo6276U(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C2996o.m13465a(parcel, Bundle.CREATOR);
        C2996o.m13466b(parcel);
        mo6278z0(bundle4);
        return true;
    }
}
