package p321z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;
import p235s3.C4518a;

/* renamed from: z2.q0 */
/* loaded from: classes.dex */
public final class C5999q0 extends C4518a implements InterfaceC5975e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5999q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p321z2.InterfaceC5975e0
    /* renamed from: a */
    public final int mo7732a() throws RemoteException {
        Parcel m18538i = m18538i(2, m18539l());
        int readInt = m18538i.readInt();
        m18538i.recycle();
        return readInt;
    }

    @Override // p321z2.InterfaceC5975e0
    /* renamed from: c */
    public final InterfaceC3516a mo7733c() throws RemoteException {
        Parcel m18538i = m18538i(1, m18539l());
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }
}
