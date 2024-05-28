package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p018b4.C1005s;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes.dex */
public final class C2199k6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n */
    final /* synthetic */ C2221m6 f8248n;

    public /* synthetic */ C2199k6(C2221m6 c2221m6, C1005s c1005s) {
        this.f8248n = c2221m6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C2219m4 c2219m4;
        try {
            try {
                this.f8248n.f8118a.mo9765d().m10052v().m9893a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c2219m4 = this.f8248n.f8118a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f8248n.f8118a.m10114N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.f8248n.f8118a.mo9761b().m10081z(new RunnableC2188j6(this, z10, data, str, queryParameter));
                        c2219m4 = this.f8248n.f8118a;
                    }
                    c2219m4 = this.f8248n.f8118a;
                }
            } catch (RuntimeException e10) {
                this.f8248n.f8118a.mo9765d().m10048r().m9894b("Throwable caught in onActivityCreated", e10);
                c2219m4 = this.f8248n.f8118a;
            }
            c2219m4.m10111K().m10355z(activity, bundle);
        } catch (Throwable th) {
            this.f8248n.f8118a.m10111K().m10355z(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8248n.f8118a.m10111K().m10345A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8248n.f8118a.m10111K().m10346B(activity);
        C2234n8 m10113M = this.f8248n.f8118a.m10113M();
        m10113M.f8118a.mo9761b().m10081z(new RunnableC2146f8(m10113M, m10113M.f8118a.mo9767e().mo13782b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C2234n8 m10113M = this.f8248n.f8118a.m10113M();
        m10113M.f8118a.mo9761b().m10081z(new RunnableC2135e8(m10113M, m10113M.f8118a.mo9767e().mo13782b()));
        this.f8248n.f8118a.m10111K().m10347C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f8248n.f8118a.m10111K().m10348D(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
