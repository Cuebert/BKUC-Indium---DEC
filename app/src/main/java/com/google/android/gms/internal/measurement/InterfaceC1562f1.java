package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p110i3.InterfaceC3516a;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes.dex */
public interface InterfaceC1562f1 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getAppInstanceId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getCurrentScreenClass(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getCurrentScreenName(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getGmpAppId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void getTestFlag(InterfaceC1613i1 interfaceC1613i1, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC3516a interfaceC3516a, zzcl zzclVar, long j10) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC1613i1 interfaceC1613i1) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException;

    void logHealthData(int i10, String str, InterfaceC3516a interfaceC3516a, InterfaceC3516a interfaceC3516a2, InterfaceC3516a interfaceC3516a3) throws RemoteException;

    void onActivityCreated(InterfaceC3516a interfaceC3516a, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException;

    void onActivityPaused(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException;

    void onActivityResumed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC3516a interfaceC3516a, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException;

    void onActivityStarted(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException;

    void onActivityStopped(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC1645k1 interfaceC1645k1) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(InterfaceC3516a interfaceC3516a, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC1645k1 interfaceC1645k1) throws RemoteException;

    void setInstanceIdProvider(InterfaceC1677m1 interfaceC1677m1) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC3516a interfaceC3516a, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC1645k1 interfaceC1645k1) throws RemoteException;
}
