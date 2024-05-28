package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;
import p235s3.C4518a;
import p235s3.C4520c;

/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes.dex */
public final class C1440m extends C4518a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1440m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: J0 */
    public final int m7769J0(InterfaceC3516a interfaceC3516a, String str, boolean z10) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(z10 ? 1 : 0);
        Parcel m18538i = m18538i(3, m18539l);
        int readInt = m18538i.readInt();
        m18538i.recycle();
        return readInt;
    }

    /* renamed from: K0 */
    public final int m7770K0(InterfaceC3516a interfaceC3516a, String str, boolean z10) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(z10 ? 1 : 0);
        Parcel m18538i = m18538i(5, m18539l);
        int readInt = m18538i.readInt();
        m18538i.recycle();
        return readInt;
    }

    /* renamed from: L0 */
    public final InterfaceC3516a m7771L0(InterfaceC3516a interfaceC3516a, String str, int i10) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(i10);
        Parcel m18538i = m18538i(2, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }

    /* renamed from: M0 */
    public final InterfaceC3516a m7772M0(InterfaceC3516a interfaceC3516a, String str, int i10, InterfaceC3516a interfaceC3516a2) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(i10);
        C4520c.m18544d(m18539l, interfaceC3516a2);
        Parcel m18538i = m18538i(8, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }

    /* renamed from: N0 */
    public final InterfaceC3516a m7773N0(InterfaceC3516a interfaceC3516a, String str, int i10) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(i10);
        Parcel m18538i = m18538i(4, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }

    /* renamed from: O0 */
    public final InterfaceC3516a m7774O0(InterfaceC3516a interfaceC3516a, String str, boolean z10, long j10) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(z10 ? 1 : 0);
        m18539l.writeLong(j10);
        Parcel m18538i = m18538i(7, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }

    /* renamed from: n */
    public final int m7775n() throws RemoteException {
        Parcel m18538i = m18538i(6, m18539l());
        int readInt = m18538i.readInt();
        m18538i.recycle();
        return readInt;
    }
}
