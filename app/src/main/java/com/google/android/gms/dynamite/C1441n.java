package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;
import p235s3.C4518a;
import p235s3.C4520c;

/* renamed from: com.google.android.gms.dynamite.n */
/* loaded from: classes.dex */
public final class C1441n extends C4518a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1441n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: J0 */
    public final InterfaceC3516a m7776J0(InterfaceC3516a interfaceC3516a, String str, int i10, InterfaceC3516a interfaceC3516a2) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(i10);
        C4520c.m18544d(m18539l, interfaceC3516a2);
        Parcel m18538i = m18538i(3, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }

    /* renamed from: n */
    public final InterfaceC3516a m7777n(InterfaceC3516a interfaceC3516a, String str, int i10, InterfaceC3516a interfaceC3516a2) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18544d(m18539l, interfaceC3516a);
        m18539l.writeString(str);
        m18539l.writeInt(i10);
        C4520c.m18544d(m18539l, interfaceC3516a2);
        Parcel m18538i = m18538i(2, m18539l);
        InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(m18538i.readStrongBinder());
        m18538i.recycle();
        return m15327l;
    }
}
