package p173n3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n3.f */
/* loaded from: classes.dex */
public final class C4060f extends C4055a implements InterfaceC4058d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4060f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p173n3.InterfaceC4058d
    /* renamed from: b */
    public final String mo16858b() throws RemoteException {
        Parcel m16855l = m16855l(1, m16854i());
        String readString = m16855l.readString();
        m16855l.recycle();
        return readString;
    }

    @Override // p173n3.InterfaceC4058d
    /* renamed from: i0 */
    public final boolean mo16859i0(boolean z10) throws RemoteException {
        Parcel m16854i = m16854i();
        C4057c.m16856a(m16854i, true);
        Parcel m16855l = m16855l(2, m16854i);
        boolean m16857b = C4057c.m16857b(m16855l);
        m16855l.recycle();
        return m16857b;
    }
}
