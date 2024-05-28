package p058e4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zak;
import p222r3.BinderC4423b;
import p222r3.C4424c;

/* renamed from: e4.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3066b extends BinderC4423b implements InterfaceC3067c {
    public AbstractBinderC3066b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p222r3.BinderC4423b
    /* renamed from: J0 */
    protected final boolean mo13534J0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                mo13535R((zak) C4424c.m18225a(parcel, zak.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
