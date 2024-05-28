package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1720oc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes.dex */
public final class C2223m8 {

    /* renamed from: a */
    final /* synthetic */ C2234n8 f8347a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2223m8(C2234n8 c2234n8) {
        this.f8347a = c2234n8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10181a() {
        this.f8347a.mo9917h();
        if (this.f8347a.f8118a.m10107F().m10326v(this.f8347a.f8118a.mo9767e().mo13781a())) {
            this.f8347a.f8118a.m10107F().f8639l.m10212a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f8347a.f8118a.mo9765d().m10052v().m9893a("Detected application was in foreground");
                m10183c(this.f8347a.f8118a.mo9767e().mo13781a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10182b(long j10, boolean z10) {
        this.f8347a.mo9917h();
        this.f8347a.m10190s();
        if (this.f8347a.f8118a.m10107F().m10326v(j10)) {
            this.f8347a.f8118a.m10107F().f8639l.m10212a(true);
        }
        this.f8347a.f8118a.m10107F().f8642o.m10299b(j10);
        if (this.f8347a.f8118a.m10107F().f8639l.m10213b()) {
            m10183c(j10, z10);
        }
    }

    /* renamed from: c */
    final void m10183c(long j10, boolean z10) {
        this.f8347a.mo9917h();
        if (this.f8347a.f8118a.m10127o()) {
            this.f8347a.f8118a.m10107F().f8642o.m10299b(j10);
            this.f8347a.f8118a.mo9765d().m10052v().m9894b("Session started, time", Long.valueOf(this.f8347a.f8118a.mo9767e().mo13782b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f8347a.f8118a.m10109I().m10154N("auto", "_sid", valueOf, j10);
            this.f8347a.f8118a.m10107F().f8639l.m10212a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f8347a.f8118a.m10134z().m9861B(null, C2335x2.f8707f0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f8347a.f8118a.m10109I().m10176v("auto", "_s", j10, bundle);
            C1720oc.m8642b();
            if (this.f8347a.f8118a.m10134z().m9861B(null, C2335x2.f8715j0)) {
                String m10311a = this.f8347a.f8118a.m10107F().f8647t.m10311a();
                if (TextUtils.isEmpty(m10311a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m10311a);
                this.f8347a.f8118a.m10109I().m10176v("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
