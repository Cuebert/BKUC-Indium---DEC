package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes.dex */
public final class RunnableC2328w5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ Bundle f8653n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8654o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2328w5(C2221m6 c2221m6, Bundle bundle) {
        this.f8654o = c2221m6;
        this.f8653n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2221m6 c2221m6 = this.f8654o;
        Bundle bundle = this.f8653n;
        c2221m6.mo9917h();
        c2221m6.m10313i();
        C5984j.m21286j(bundle);
        String m21282f = C5984j.m21282f(bundle.getString("name"));
        if (!c2221m6.f8118a.m10127o()) {
            c2221m6.f8118a.mo9765d().m10052v().m9893a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2221m6.f8118a.m10112L().m10383s(new zzab(bundle.getString("app_id"), BuildConfig.FLAVOR, new zzkv(m21282f, 0L, null, BuildConfig.FLAVOR), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2221m6.f8118a.m10114N().m9984w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
