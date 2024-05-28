package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p018b4.InterfaceC1008v;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes.dex */
public final class C2124d8<T extends Context & InterfaceC1008v> {

    /* renamed from: a */
    private final T f8054a;

    public C2124d8(T t10) {
        C5984j.m21286j(t10);
        this.f8054a = t10;
    }

    /* renamed from: k */
    private final C2174i3 m9813k() {
        return C2219m4.m10096H(this.f8054a, null, null).mo9765d();
    }

    /* renamed from: a */
    public final int m9814a(final Intent intent, int i10, final int i11) {
        C2219m4 m10096H = C2219m4.m10096H(this.f8054a, null, null);
        final C2174i3 mo9765d = m10096H.mo9765d();
        if (intent == null) {
            mo9765d.m10053w().m9893a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m10096H.mo9768f();
        mo9765d.m10052v().m9895c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m9821h(new Runnable() { // from class: com.google.android.gms.measurement.internal.a8
                @Override // java.lang.Runnable
                public final void run() {
                    C2124d8.this.m9816c(i11, mo9765d, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m9815b(Intent intent) {
        if (intent == null) {
            m9813k().m10048r().m9893a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2143f5(C2103b9.m9745e0(this.f8054a), null);
        }
        m9813k().m10053w().m9894b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m9816c(int i10, C2174i3 c2174i3, Intent intent) {
        if (this.f8054a.mo6249b(i10)) {
            c2174i3.m10052v().m9894b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            m9813k().m10052v().m9893a("Completed wakeful intent.");
            this.f8054a.mo6248a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m9817d(C2174i3 c2174i3, JobParameters jobParameters) {
        c2174i3.m10052v().m9893a("AppMeasurementJobService processed last upload request.");
        this.f8054a.mo6250c(jobParameters, false);
    }

    /* renamed from: e */
    public final void m9818e() {
        C2219m4 m10096H = C2219m4.m10096H(this.f8054a, null, null);
        C2174i3 mo9765d = m10096H.mo9765d();
        m10096H.mo9768f();
        mo9765d.m10052v().m9893a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m9819f() {
        C2219m4 m10096H = C2219m4.m10096H(this.f8054a, null, null);
        C2174i3 mo9765d = m10096H.mo9765d();
        m10096H.mo9768f();
        mo9765d.m10052v().m9893a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m9820g(Intent intent) {
        if (intent == null) {
            m9813k().m10048r().m9893a("onRebind called with null intent");
        } else {
            m9813k().m10052v().m9894b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: h */
    public final void m9821h(Runnable runnable) {
        C2103b9 m9745e0 = C2103b9.m9745e0(this.f8054a);
        m9745e0.mo9761b().m10081z(new RunnableC2113c8(this, m9745e0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean m9822i(final JobParameters jobParameters) {
        C2219m4 m10096H = C2219m4.m10096H(this.f8054a, null, null);
        final C2174i3 mo9765d = m10096H.mo9765d();
        String string = jobParameters.getExtras().getString("action");
        m10096H.mo9768f();
        mo9765d.m10052v().m9894b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m9821h(new Runnable() { // from class: com.google.android.gms.measurement.internal.b8
            @Override // java.lang.Runnable
            public final void run() {
                C2124d8.this.m9817d(mo9765d, jobParameters);
            }
        });
        return true;
    }

    /* renamed from: j */
    public final boolean m9823j(Intent intent) {
        if (intent == null) {
            m9813k().m10048r().m9893a("onUnbind called with null intent");
            return true;
        }
        m9813k().m10052v().m9894b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
