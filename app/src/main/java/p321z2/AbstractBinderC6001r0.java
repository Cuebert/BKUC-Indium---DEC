package p321z2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;
import p235s3.BinderC4519b;
import p235s3.C4520c;

/* renamed from: z2.r0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6001r0 extends BinderC4519b implements InterfaceC5975e0 {
    public AbstractBinderC6001r0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: l */
    public static InterfaceC5975e0 m21306l(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC5975e0 ? (InterfaceC5975e0) queryLocalInterface : new C5999q0(iBinder);
    }

    @Override // p235s3.BinderC4519b
    /* renamed from: i */
    protected final boolean mo18540i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            InterfaceC3516a mo7733c = mo7733c();
            parcel2.writeNoException();
            C4520c.m18544d(parcel2, mo7733c);
        } else {
            if (i10 != 2) {
                return false;
            }
            int mo7732a = mo7732a();
            parcel2.writeNoException();
            parcel2.writeInt(mo7732a);
        }
        return true;
    }
}
