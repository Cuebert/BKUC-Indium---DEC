package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1545e1;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import com.google.android.gms.internal.measurement.InterfaceC1645k1;
import com.google.android.gms.internal.measurement.InterfaceC1677m1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p018b4.C1007u;
import p018b4.InterfaceC1004r;
import p093h0.C3356a;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p321z2.C5984j;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1545e1 {

    /* renamed from: c */
    C2219m4 f7938c = null;

    /* renamed from: d */
    private final Map<Integer, InterfaceC1004r> f7939d = new C3356a();

    /* renamed from: l */
    private final void m9715l() {
        if (this.f7938c == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: n */
    private final void m9716n(InterfaceC1613i1 interfaceC1613i1, String str) {
        m9715l();
        this.f7938c.m10114N().m9950I(interfaceC1613i1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10133y().m10397l(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10168h0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10150J(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10133y().m10398m(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void generateEventId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        long m9976r0 = this.f7938c.m10114N().m9976r0();
        m9715l();
        this.f7938c.m10114N().m9949H(interfaceC1613i1, m9976r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getAppInstanceId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        this.f7938c.mo9761b().m10081z(new RunnableC2220m5(this, interfaceC1613i1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getCachedAppInstanceId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        m9716n(interfaceC1613i1, this.f7938c.m10109I().m10161X());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getConditionalUserProperties(String str, String str2, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        this.f7938c.mo9761b().m10081z(new RunnableC2180i9(this, interfaceC1613i1, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getCurrentScreenClass(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        m9716n(interfaceC1613i1, this.f7938c.m10109I().m10162Y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getCurrentScreenName(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        m9716n(interfaceC1613i1, this.f7938c.m10109I().m10163Z());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getGmpAppId(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        String str;
        m9715l();
        C2221m6 m10109I = this.f7938c.m10109I();
        if (m10109I.f8118a.m10115O() != null) {
            str = m10109I.f8118a.m10115O();
        } else {
            try {
                str = C1007u.m6247b(m10109I.f8118a.mo9763c(), "google_app_id", m10109I.f8118a.m10118R());
            } catch (IllegalStateException e10) {
                m10109I.f8118a.mo9765d().m10048r().m9894b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        m9716n(interfaceC1613i1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getMaxUserProperties(String str, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10156S(str);
        m9715l();
        this.f7938c.m10114N().m9948G(interfaceC1613i1, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getTestFlag(InterfaceC1613i1 interfaceC1613i1, int i10) throws RemoteException {
        m9715l();
        if (i10 == 0) {
            this.f7938c.m10114N().m9950I(interfaceC1613i1, this.f7938c.m10109I().m10164a0());
            return;
        }
        if (i10 == 1) {
            this.f7938c.m10114N().m9949H(interfaceC1613i1, this.f7938c.m10109I().m10160W().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f7938c.m10114N().m9948G(interfaceC1613i1, this.f7938c.m10109I().m10159V().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f7938c.m10114N().m9944C(interfaceC1613i1, this.f7938c.m10109I().m10157T().booleanValue());
                return;
            }
        }
        C2169h9 m10114N = this.f7938c.m10114N();
        double doubleValue = this.f7938c.m10109I().m10158U().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            m10114N.f8118a.mo9765d().m10053w().m9894b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        this.f7938c.mo9761b().m10081z(new RunnableC2189j7(this, interfaceC1613i1, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void initForTests(Map map) throws RemoteException {
        m9715l();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void initialize(InterfaceC3516a interfaceC3516a, zzcl zzclVar, long j10) throws RemoteException {
        C2219m4 c2219m4 = this.f7938c;
        if (c2219m4 == null) {
            this.f7938c = C2219m4.m10096H((Context) C5984j.m21286j((Context) BinderC3517b.m15329n(interfaceC3516a)), zzclVar, Long.valueOf(j10));
        } else {
            c2219m4.mo9765d().m10053w().m9893a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void isDataCollectionEnabled(InterfaceC1613i1 interfaceC1613i1) throws RemoteException {
        m9715l();
        this.f7938c.mo9761b().m10081z(new RunnableC2191j9(this, interfaceC1613i1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10173s(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException {
        Bundle bundle2;
        m9715l();
        C5984j.m21282f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f7938c.mo9761b().m10081z(new RunnableC2210l6(this, interfaceC1613i1, new zzat(str2, new zzar(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void logHealthData(int i10, String str, InterfaceC3516a interfaceC3516a, InterfaceC3516a interfaceC3516a2, InterfaceC3516a interfaceC3516a3) throws RemoteException {
        m9715l();
        this.f7938c.mo9765d().m10046F(i10, true, false, str, interfaceC3516a == null ? null : BinderC3517b.m15329n(interfaceC3516a), interfaceC3516a2 == null ? null : BinderC3517b.m15329n(interfaceC3516a2), interfaceC3516a3 != null ? BinderC3517b.m15329n(interfaceC3516a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityCreated(InterfaceC3516a interfaceC3516a, Bundle bundle, long j10) throws RemoteException {
        m9715l();
        C2199k6 c2199k6 = this.f7938c.m10109I().f8331c;
        if (c2199k6 != null) {
            this.f7938c.m10109I().m10169o();
            c2199k6.onActivityCreated((Activity) BinderC3517b.m15329n(interfaceC3516a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityDestroyed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        m9715l();
        C2199k6 c2199k6 = this.f7938c.m10109I().f8331c;
        if (c2199k6 != null) {
            this.f7938c.m10109I().m10169o();
            c2199k6.onActivityDestroyed((Activity) BinderC3517b.m15329n(interfaceC3516a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityPaused(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        m9715l();
        C2199k6 c2199k6 = this.f7938c.m10109I().f8331c;
        if (c2199k6 != null) {
            this.f7938c.m10109I().m10169o();
            c2199k6.onActivityPaused((Activity) BinderC3517b.m15329n(interfaceC3516a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityResumed(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        m9715l();
        C2199k6 c2199k6 = this.f7938c.m10109I().f8331c;
        if (c2199k6 != null) {
            this.f7938c.m10109I().m10169o();
            c2199k6.onActivityResumed((Activity) BinderC3517b.m15329n(interfaceC3516a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivitySaveInstanceState(InterfaceC3516a interfaceC3516a, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException {
        m9715l();
        C2199k6 c2199k6 = this.f7938c.m10109I().f8331c;
        Bundle bundle = new Bundle();
        if (c2199k6 != null) {
            this.f7938c.m10109I().m10169o();
            c2199k6.onActivitySaveInstanceState((Activity) BinderC3517b.m15329n(interfaceC3516a), bundle);
        }
        try {
            interfaceC1613i1.mo7941m(bundle);
        } catch (RemoteException e10) {
            this.f7938c.mo9765d().m10053w().m9894b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityStarted(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        m9715l();
        if (this.f7938c.m10109I().f8331c != null) {
            this.f7938c.m10109I().m10169o();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void onActivityStopped(InterfaceC3516a interfaceC3516a, long j10) throws RemoteException {
        m9715l();
        if (this.f7938c.m10109I().f8331c != null) {
            this.f7938c.m10109I().m10169o();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void performAction(Bundle bundle, InterfaceC1613i1 interfaceC1613i1, long j10) throws RemoteException {
        m9715l();
        interfaceC1613i1.mo7941m(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void registerOnMeasurementEventListener(InterfaceC1645k1 interfaceC1645k1) throws RemoteException {
        InterfaceC1004r interfaceC1004r;
        m9715l();
        synchronized (this.f7939d) {
            interfaceC1004r = this.f7939d.get(Integer.valueOf(interfaceC1645k1.mo8316c()));
            if (interfaceC1004r == null) {
                interfaceC1004r = new C2213l9(this, interfaceC1645k1);
                this.f7939d.put(Integer.valueOf(interfaceC1645k1.mo8316c()), interfaceC1004r);
            }
        }
        this.f7938c.m10109I().m10178x(interfaceC1004r);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void resetAnalyticsData(long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10179y(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        m9715l();
        if (bundle == null) {
            this.f7938c.mo9765d().m10048r().m9893a("Conditional user property must not be null");
        } else {
            this.f7938c.m10109I().m10145E(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10148H(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10146F(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setCurrentScreen(InterfaceC3516a interfaceC3516a, String str, String str2, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10111K().m10349E((Activity) BinderC3517b.m15329n(interfaceC3516a), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        m9715l();
        C2221m6 m10109I = this.f7938c.m10109I();
        m10109I.m10313i();
        m10109I.f8118a.mo9761b().m10081z(new RunnableC2253p5(m10109I, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setDefaultEventParameters(Bundle bundle) {
        m9715l();
        final C2221m6 m10109I = this.f7938c.m10109I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        m10109I.f8118a.mo9761b().m10081z(new Runnable() { // from class: com.google.android.gms.measurement.internal.n5
            @Override // java.lang.Runnable
            public final void run() {
                C2221m6.this.m10171q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setEventInterceptor(InterfaceC1645k1 interfaceC1645k1) throws RemoteException {
        m9715l();
        C2202k9 c2202k9 = new C2202k9(this, interfaceC1645k1);
        if (this.f7938c.mo9761b().m10076C()) {
            this.f7938c.m10109I().m10149I(c2202k9);
        } else {
            this.f7938c.mo9761b().m10081z(new RunnableC2190j8(this, c2202k9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setInstanceIdProvider(InterfaceC1677m1 interfaceC1677m1) throws RemoteException {
        m9715l();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10150J(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        m9715l();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        m9715l();
        C2221m6 m10109I = this.f7938c.m10109I();
        m10109I.f8118a.mo9761b().m10081z(new RunnableC2275r5(m10109I, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setUserId(String str, long j10) throws RemoteException {
        m9715l();
        if (str != null && str.length() == 0) {
            this.f7938c.mo9765d().m10053w().m9893a("User ID must be non-empty");
        } else {
            this.f7938c.m10109I().m10153M(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void setUserProperty(String str, String str2, InterfaceC3516a interfaceC3516a, boolean z10, long j10) throws RemoteException {
        m9715l();
        this.f7938c.m10109I().m10153M(str, str2, BinderC3517b.m15329n(interfaceC3516a), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1562f1
    public void unregisterOnMeasurementEventListener(InterfaceC1645k1 interfaceC1645k1) throws RemoteException {
        InterfaceC1004r remove;
        m9715l();
        synchronized (this.f7939d) {
            remove = this.f7939d.remove(Integer.valueOf(interfaceC1645k1.mo8316c()));
        }
        if (remove == null) {
            remove = new C2213l9(this, interfaceC1645k1);
        }
        this.f7938c.m10109I().m10155O(remove);
    }
}
