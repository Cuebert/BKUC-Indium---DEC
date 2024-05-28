package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C1804u0;
import com.google.android.gms.internal.measurement.C1820v0;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* loaded from: classes.dex */
public final class C2267q8 extends AbstractC2289s8 {

    /* renamed from: d */
    private final AlarmManager f8459d;

    /* renamed from: e */
    private AbstractC2203l f8460e;

    /* renamed from: f */
    private Integer f8461f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2267q8(C2103b9 c2103b9) {
        super(c2103b9);
        this.f8459d = (AlarmManager) this.f8118a.mo9763c().getSystemService("alarm");
    }

    /* renamed from: o */
    private final int m10215o() {
        if (this.f8461f == null) {
            String valueOf = String.valueOf(this.f8118a.mo9763c().getPackageName());
            this.f8461f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f8461f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m10216p() {
        Context mo9763c = this.f8118a.mo9763c();
        return C1804u0.m8855a(mo9763c, 0, new Intent().setClassName(mo9763c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C1804u0.f7250a);
    }

    /* renamed from: q */
    private final AbstractC2203l m10217q() {
        if (this.f8460e == null) {
            this.f8460e = new C2256p8(this, this.f8517b.m9762b0());
        }
        return this.f8460e;
    }

    @TargetApi(24)
    /* renamed from: r */
    private final void m10218r() {
        JobScheduler jobScheduler = (JobScheduler) this.f8118a.mo9763c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m10215o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        AlarmManager alarmManager = this.f8459d;
        if (alarmManager != null) {
            alarmManager.cancel(m10216p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m10218r();
        return false;
    }

    /* renamed from: m */
    public final void m10219m() {
        m10300i();
        this.f8118a.mo9765d().m10052v().m9893a("Unscheduling upload");
        AlarmManager alarmManager = this.f8459d;
        if (alarmManager != null) {
            alarmManager.cancel(m10216p());
        }
        m10217q().m10084b();
        if (Build.VERSION.SDK_INT >= 24) {
            m10218r();
        }
    }

    /* renamed from: n */
    public final void m10220n(long j10) {
        m10300i();
        this.f8118a.mo9768f();
        Context mo9763c = this.f8118a.mo9763c();
        if (!C2169h9.m9928X(mo9763c)) {
            this.f8118a.mo9765d().m10047q().m9893a("Receiver not registered/enabled");
        }
        if (!C2169h9.m9929Y(mo9763c, false)) {
            this.f8118a.mo9765d().m10047q().m9893a("Service not registered/enabled");
        }
        m10219m();
        this.f8118a.mo9765d().m10052v().m9894b("Scheduling upload, millis", Long.valueOf(j10));
        long mo13782b = this.f8118a.mo9767e().mo13782b() + j10;
        this.f8118a.m10134z();
        if (j10 < Math.max(0L, C2335x2.f8744y.m10317a(null).longValue()) && !m10217q().m10086e()) {
            m10217q().m10085d(j10);
        }
        this.f8118a.mo9768f();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f8459d;
            if (alarmManager != null) {
                this.f8118a.m10134z();
                alarmManager.setInexactRepeating(2, mo13782b, Math.max(C2335x2.f8734t.m10317a(null).longValue(), j10), m10216p());
                return;
            }
            return;
        }
        Context mo9763c2 = this.f8118a.mo9763c();
        ComponentName componentName = new ComponentName(mo9763c2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m10215o = m10215o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C1820v0.m8875a(mo9763c2, new JobInfo.Builder(m10215o, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
