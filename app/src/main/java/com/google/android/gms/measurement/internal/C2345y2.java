package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1708o0;
import com.google.android.gms.internal.measurement.C1740q0;
import java.util.ArrayList;
import java.util.List;
import p018b4.InterfaceC0990d;

/* renamed from: com.google.android.gms.measurement.internal.y2 */
/* loaded from: classes.dex */
public final class C2345y2 extends C1708o0 implements InterfaceC0990d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2345y2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: A */
    public final void mo6206A(zzab zzabVar, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzabVar);
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(12, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: E */
    public final List<zzkv> mo6207E(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(null);
        m8633i.writeString(str2);
        m8633i.writeString(str3);
        C1740q0.m8706c(m8633i, z10);
        Parcel m8634l = m8634l(15, m8633i);
        ArrayList createTypedArrayList = m8634l.createTypedArrayList(zzkv.CREATOR);
        m8634l.recycle();
        return createTypedArrayList;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: H0 */
    public final void mo6208H0(zzat zzatVar, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzatVar);
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(1, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: J */
    public final void mo6209J(zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(18, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: N */
    public final String mo6210N(zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzpVar);
        Parcel m8634l = m8634l(11, m8633i);
        String readString = m8634l.readString();
        m8634l.recycle();
        return readString;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: Z */
    public final List<zzab> mo6212Z(String str, String str2, String str3) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(null);
        m8633i.writeString(str2);
        m8633i.writeString(str3);
        Parcel m8634l = m8634l(17, m8633i);
        ArrayList createTypedArrayList = m8634l.createTypedArrayList(zzab.CREATOR);
        m8634l.recycle();
        return createTypedArrayList;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: f0 */
    public final byte[] mo6214f0(zzat zzatVar, String str) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzatVar);
        m8633i.writeString(str);
        Parcel m8634l = m8634l(9, m8633i);
        byte[] createByteArray = m8634l.createByteArray();
        m8634l.recycle();
        return createByteArray;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: g0 */
    public final void mo6215g0(zzkv zzkvVar, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzkvVar);
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(2, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: q */
    public final void mo6217q(zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(20, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: q0 */
    public final void mo6218q0(zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(4, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: r */
    public final void mo6219r(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeLong(j10);
        m8633i.writeString(str);
        m8633i.writeString(str2);
        m8633i.writeString(str3);
        m8635n(10, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: r0 */
    public final List<zzab> mo6220r0(String str, String str2, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8707d(m8633i, zzpVar);
        Parcel m8634l = m8634l(16, m8633i);
        ArrayList createTypedArrayList = m8634l.createTypedArrayList(zzab.CREATOR);
        m8634l.recycle();
        return createTypedArrayList;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: v */
    public final void mo6221v(Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, bundle);
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(19, m8633i);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: x */
    public final List<zzkv> mo6222x(String str, String str2, boolean z10, zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8706c(m8633i, z10);
        C1740q0.m8707d(m8633i, zzpVar);
        Parcel m8634l = m8634l(14, m8633i);
        ArrayList createTypedArrayList = m8634l.createTypedArrayList(zzkv.CREATOR);
        m8634l.recycle();
        return createTypedArrayList;
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: y0 */
    public final void mo6223y0(zzp zzpVar) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, zzpVar);
        m8635n(6, m8633i);
    }
}
