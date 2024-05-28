package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* loaded from: classes.dex */
public final class C1528d1 extends C1708o0 implements InterfaceC1562f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1528d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeLong(j10);
        m8635n(23, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8707d(m8633i, bundle);
        m8635n(9, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeLong(j10);
        m8635n(24, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void generateEventId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(22, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getCachedAppInstanceId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(19, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(10, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getCurrentScreenClass(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(17, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getCurrentScreenName(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(16, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getGmpAppId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(21, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getMaxUserProperties(String str, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(6, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8706c(m8633i, z10);
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8635n(5, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void initialize(InterfaceC3516a interfaceC3516a, zzcl zzclVar, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        C1740q0.m8707d(m8633i, zzclVar);
        m8633i.writeLong(j10);
        m8635n(1, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8707d(m8633i, bundle);
        C1740q0.m8706c(m8633i, z10);
        C1740q0.m8706c(m8633i, z11);
        m8633i.writeLong(j10);
        m8635n(2, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void logHealthData(int i10, String str, InterfaceC3516a interfaceC3516a, InterfaceC3516a interfaceC3516a2, InterfaceC3516a interfaceC3516a3) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeInt(5);
        m8633i.writeString(str);
        C1740q0.m8708e(m8633i, interfaceC3516a);
        C1740q0.m8708e(m8633i, interfaceC3516a2);
        C1740q0.m8708e(m8633i, interfaceC3516a3);
        m8635n(33, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityCreated(InterfaceC3516a interfaceC3516a, Bundle bundle, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        C1740q0.m8707d(m8633i, bundle);
        m8633i.writeLong(j10);
        m8635n(27, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityDestroyed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeLong(j10);
        m8635n(28, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityPaused(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeLong(j10);
        m8635n(29, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityResumed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeLong(j10);
        m8635n(30, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivitySaveInstanceState(InterfaceC3516a interfaceC3516a, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        C1740q0.m8708e(m8633i, interfaceC1613i1);
        m8633i.writeLong(j10);
        m8635n(31, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityStarted(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeLong(j10);
        m8635n(25, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void onActivityStopped(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeLong(j10);
        m8635n(26, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8707d(m8633i, bundle);
        m8633i.writeLong(j10);
        m8635n(8, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void setCurrentScreen(InterfaceC3516a interfaceC3516a, String str, String str2, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8708e(m8633i, interfaceC3516a);
        m8633i.writeString(str);
        m8633i.writeString(str2);
        m8633i.writeLong(j10);
        m8635n(15, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel m8633i = m8633i();
        C1740q0.m8706c(m8633i, z10);
        m8635n(39, m8633i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public final void setUserProperty(String str, String str2, InterfaceC3516a interfaceC3516a, boolean z10, long j10) throws RemoteException {
        Parcel m8633i = m8633i();
        m8633i.writeString(str);
        m8633i.writeString(str2);
        C1740q0.m8708e(m8633i, interfaceC3516a);
        C1740q0.m8706c(m8633i, z10);
        m8633i.writeLong(j10);
        m8635n(4, m8633i);
    }
}
