package p160m2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p294x1.BinderC5504b;
import p294x1.C5503a;
import p294x1.C5505c;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public interface InterfaceC3931a extends IInterface {

    /* renamed from: m2.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC5504b implements InterfaceC3931a {

        /* renamed from: m2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6055a extends C5503a implements InterfaceC3931a {
            C6055a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // p160m2.InterfaceC3931a
            /* renamed from: H */
            public final Bundle mo16677H(Bundle bundle) throws RemoteException {
                Parcel m20239i = m20239i();
                C5505c.m20242b(m20239i, bundle);
                Parcel m20240l = m20240l(m20239i);
                Bundle bundle2 = (Bundle) C5505c.m20241a(m20240l, Bundle.CREATOR);
                m20240l.recycle();
                return bundle2;
            }
        }

        /* renamed from: i */
        public static InterfaceC3931a m16678i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof InterfaceC3931a) {
                return (InterfaceC3931a) queryLocalInterface;
            }
            return new C6055a(iBinder);
        }
    }

    /* renamed from: H */
    Bundle mo16677H(Bundle bundle) throws RemoteException;
}
