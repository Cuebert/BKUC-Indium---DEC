package p321z2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzk;
import p235s3.BinderC4519b;
import p235s3.C4520c;

/* renamed from: z2.f0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5977f0 extends BinderC4519b implements InterfaceC5974e {
    public AbstractBinderC5977f0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p235s3.BinderC4519b
    /* renamed from: i */
    protected final boolean mo18540i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) C4520c.m18541a(parcel, Bundle.CREATOR);
            C4520c.m18542b(parcel);
            mo7705G0(readInt, readStrongBinder, bundle);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) C4520c.m18541a(parcel, Bundle.CREATOR);
            C4520c.m18542b(parcel);
            mo7706d0(readInt2, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) C4520c.m18541a(parcel, zzk.CREATOR);
            C4520c.m18542b(parcel);
            mo7707u0(readInt3, readStrongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
