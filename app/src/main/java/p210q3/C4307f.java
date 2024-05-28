package p210q3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: q3.f */
/* loaded from: classes.dex */
public final class C4307f extends C4302a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4307f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: n */
    public final void m17821n(InterfaceC4309h interfaceC4309h) throws RemoteException {
        Parcel m17815i = m17815i();
        C4306e.m17820b(m17815i, interfaceC4309h);
        m17816l(1, m17815i);
    }
}
