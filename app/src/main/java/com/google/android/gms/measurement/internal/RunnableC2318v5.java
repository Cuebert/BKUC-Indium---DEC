package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* loaded from: classes.dex */
public final class RunnableC2318v5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ Bundle f8611n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8612o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2318v5(C2221m6 c2221m6, Bundle bundle) {
        this.f8612o = c2221m6;
        this.f8611n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2221m6 c2221m6 = this.f8612o;
        Bundle bundle = this.f8611n;
        c2221m6.mo9917h();
        c2221m6.m10313i();
        C5984j.m21286j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C5984j.m21282f(string);
        C5984j.m21282f(string2);
        C5984j.m21286j(bundle.get("value"));
        if (!c2221m6.f8118a.m10127o()) {
            c2221m6.f8118a.mo9765d().m10052v().m9893a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkv zzkvVar = new zzkv(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzat m9984w0 = c2221m6.f8118a.m10114N().m9984w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2221m6.f8118a.m10112L().m10383s(new zzab(bundle.getString("app_id"), string2, zzkvVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2221m6.f8118a.m10114N().m9984w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m9984w0, bundle.getLong("time_to_live"), c2221m6.f8118a.m10114N().m9984w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
