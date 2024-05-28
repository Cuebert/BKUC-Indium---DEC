package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2124d8;
import p018b4.InterfaceC1008v;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1008v {

    /* renamed from: n */
    private C2124d8<AppMeasurementJobService> f7932n;

    /* renamed from: d */
    private final C2124d8<AppMeasurementJobService> m9713d() {
        if (this.f7932n == null) {
            this.f7932n = new C2124d8<>(this);
        }
        return this.f7932n;
    }

    @Override // p018b4.InterfaceC1008v
    /* renamed from: a */
    public final void mo6248a(Intent intent) {
    }

    @Override // p018b4.InterfaceC1008v
    /* renamed from: b */
    public final boolean mo6249b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p018b4.InterfaceC1008v
    @TargetApi(24)
    /* renamed from: c */
    public final void mo6250c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m9713d().m9818e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m9713d().m9819f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m9713d().m9820g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m9713d().m9822i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m9713d().m9823j(intent);
        return true;
    }
}
