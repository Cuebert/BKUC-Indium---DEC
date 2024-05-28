package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p110i3.InterfaceC3516a;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1545e1 extends BinderC1724p0 implements InterfaceC1562f1 {
    public AbstractBinderC1545e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1562f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC1562f1 ? (InterfaceC1562f1) queryLocalInterface : new C1528d1(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.BinderC1724p0
    /* renamed from: i */
    protected final boolean mo6205i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC1613i1 c1579g1;
        InterfaceC1613i1 interfaceC1613i1 = null;
        InterfaceC1613i1 interfaceC1613i12 = null;
        InterfaceC1613i1 interfaceC1613i13 = null;
        InterfaceC1645k1 interfaceC1645k1 = null;
        InterfaceC1645k1 interfaceC1645k12 = null;
        InterfaceC1645k1 interfaceC1645k13 = null;
        InterfaceC1613i1 interfaceC1613i14 = null;
        InterfaceC1613i1 interfaceC1613i15 = null;
        InterfaceC1613i1 interfaceC1613i16 = null;
        InterfaceC1613i1 interfaceC1613i17 = null;
        InterfaceC1613i1 interfaceC1613i18 = null;
        InterfaceC1613i1 interfaceC1613i19 = null;
        InterfaceC1677m1 interfaceC1677m1 = null;
        InterfaceC1613i1 interfaceC1613i110 = null;
        InterfaceC1613i1 interfaceC1613i111 = null;
        InterfaceC1613i1 interfaceC1613i112 = null;
        InterfaceC1613i1 interfaceC1613i113 = null;
        switch (i10) {
            case 1:
                initialize(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), (zzcl) C1740q0.m8704a(parcel, zzcl.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), C1740q0.m8709f(parcel), C1740q0.m8709f(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1579g1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1579g1 = queryLocalInterface instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface : new C1579g1(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, c1579g1, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), C1740q0.m8709f(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m8709f = C1740q0.m8709f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i1 = queryLocalInterface2 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface2 : new C1579g1(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, m8709f, interfaceC1613i1);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i113 = queryLocalInterface3 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface3 : new C1579g1(readStrongBinder3);
                }
                getMaxUserProperties(readString5, interfaceC1613i113);
                parcel2.writeNoException();
                return true;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 8:
                setConditionalUserProperty((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i112 = queryLocalInterface4 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface4 : new C1579g1(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, interfaceC1613i112);
                parcel2.writeNoException();
                return true;
            case 11:
                setMeasurementEnabled(C1740q0.m8709f(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 12:
                resetAnalyticsData(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 15:
                setCurrentScreen(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i111 = queryLocalInterface5 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface5 : new C1579g1(readStrongBinder5);
                }
                getCurrentScreenName(interfaceC1613i111);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i110 = queryLocalInterface6 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface6 : new C1579g1(readStrongBinder6);
                }
                getCurrentScreenClass(interfaceC1613i110);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    interfaceC1677m1 = queryLocalInterface7 instanceof InterfaceC1677m1 ? (InterfaceC1677m1) queryLocalInterface7 : new C1661l1(readStrongBinder7);
                }
                setInstanceIdProvider(interfaceC1677m1);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i19 = queryLocalInterface8 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface8 : new C1579g1(readStrongBinder8);
                }
                getCachedAppInstanceId(interfaceC1613i19);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i18 = queryLocalInterface9 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface9 : new C1579g1(readStrongBinder9);
                }
                getAppInstanceId(interfaceC1613i18);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i17 = queryLocalInterface10 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface10 : new C1579g1(readStrongBinder10);
                }
                getGmpAppId(interfaceC1613i17);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i16 = queryLocalInterface11 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface11 : new C1579g1(readStrongBinder11);
                }
                generateEventId(interfaceC1613i16);
                parcel2.writeNoException();
                return true;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                onActivityStarted(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 26:
                onActivityStopped(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 27:
                onActivityCreated(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), (Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 28:
                onActivityDestroyed(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 29:
                onActivityPaused(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 30:
                onActivityResumed(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC3516a m15327l = InterfaceC3516a.a.m15327l(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i15 = queryLocalInterface12 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface12 : new C1579g1(readStrongBinder12);
                }
                onActivitySaveInstanceState(m15327l, interfaceC1613i15, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle2 = (Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i14 = queryLocalInterface13 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface13 : new C1579g1(readStrongBinder13);
                }
                performAction(bundle2, interfaceC1613i14, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), InterfaceC3516a.a.m15327l(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1645k13 = queryLocalInterface14 instanceof InterfaceC1645k1 ? (InterfaceC1645k1) queryLocalInterface14 : new C1629j1(readStrongBinder14);
                }
                setEventInterceptor(interfaceC1645k13);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1645k12 = queryLocalInterface15 instanceof InterfaceC1645k1 ? (InterfaceC1645k1) queryLocalInterface15 : new C1629j1(readStrongBinder15);
                }
                registerOnMeasurementEventListener(interfaceC1645k12);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1645k1 = queryLocalInterface16 instanceof InterfaceC1645k1 ? (InterfaceC1645k1) queryLocalInterface16 : new C1629j1(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(interfaceC1645k1);
                parcel2.writeNoException();
                return true;
            case 37:
                initForTests(C1740q0.m8705b(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i13 = queryLocalInterface17 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface17 : new C1579g1(readStrongBinder17);
                }
                getTestFlag(interfaceC1613i13, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 39:
                setDataCollectionEnabled(C1740q0.m8709f(parcel));
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1613i12 = queryLocalInterface18 instanceof InterfaceC1613i1 ? (InterfaceC1613i1) queryLocalInterface18 : new C1579g1(readStrongBinder18);
                }
                isDataCollectionEnabled(interfaceC1613i12);
                parcel2.writeNoException();
                return true;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 44:
                setConsent((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 45:
                setConsentThirdParty((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
        }
    }
}
