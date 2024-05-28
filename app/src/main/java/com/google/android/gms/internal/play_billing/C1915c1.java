package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.play_billing.c1 */
/* loaded from: classes.dex */
public final class C1915c1 extends C1933e5 implements InterfaceC1910b3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1915c1(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: A0 */
    public final Bundle mo9256A0(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(9);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(902, m9342i);
        Bundle bundle2 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: C */
    public final int mo9257C(int i10, String str, String str2) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(3);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        Parcel m9343l = m9343l(5, m9342i);
        int readInt = m9343l.readInt();
        m9343l.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: F */
    public final Bundle mo9258F(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(9);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(12, m9342i);
        Bundle bundle2 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: K */
    public final Bundle mo9259K(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(i10);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        m9342i.writeString(str3);
        m9342i.writeString(null);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(8, m9342i);
        Bundle bundle2 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: M */
    public final Bundle mo9260M(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(6);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        m9342i.writeString(str3);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(9, m9342i);
        Bundle bundle2 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: T */
    public final int mo9261T(int i10, String str, String str2) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(i10);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        Parcel m9343l = m9343l(1, m9342i);
        int readInt = m9343l.readInt();
        m9343l.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: l0 */
    public final int mo9262l0(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(i10);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(10, m9342i);
        int readInt = m9343l.readInt();
        m9343l.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: p0 */
    public final Bundle mo9263p0(int i10, String str, String str2, String str3) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(3);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        m9342i.writeString(str3);
        Parcel m9343l = m9343l(4, m9342i);
        Bundle bundle = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: s0 */
    public final Bundle mo9264s0(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(i10);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        m9342i.writeString(str3);
        C1947g5.m9356b(m9342i, bundle);
        Parcel m9343l = m9343l(11, m9342i);
        Bundle bundle2 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: t0 */
    public final Bundle mo9265t0(int i10, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(3);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        m9342i.writeString(str3);
        m9342i.writeString(null);
        Parcel m9343l = m9343l(3, m9342i);
        Bundle bundle = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1910b3
    /* renamed from: z */
    public final Bundle mo9266z(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel m9342i = m9342i();
        m9342i.writeInt(i10);
        m9342i.writeString(str);
        m9342i.writeString(str2);
        C1947g5.m9356b(m9342i, bundle);
        C1947g5.m9356b(m9342i, bundle2);
        Parcel m9343l = m9343l(901, m9342i);
        Bundle bundle3 = (Bundle) C1947g5.m9355a(m9343l, Bundle.CREATOR);
        m9343l.recycle();
        return bundle3;
    }
}
