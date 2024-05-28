package p308y2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p222r3.BinderC4423b;
import p222r3.C4424c;

/* renamed from: y2.e */
/* loaded from: classes.dex */
public interface InterfaceC5608e extends IInterface {

    /* renamed from: y2.e$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC4423b implements InterfaceC5608e {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // p222r3.BinderC4423b
        /* renamed from: J0 */
        protected final boolean mo13534J0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            mo17675b0((Status) C4424c.m18225a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: b0 */
    void mo17675b0(Status status) throws RemoteException;
}
