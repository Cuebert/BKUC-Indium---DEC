package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C2124d8;
import p018b4.InterfaceC1008v;
import p041d1.AbstractC2959a;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1008v {

    /* renamed from: n */
    private C2124d8<AppMeasurementService> f7934n;

    /* renamed from: d */
    private final C2124d8<AppMeasurementService> m9714d() {
        if (this.f7934n == null) {
            this.f7934n = new C2124d8<>(this);
        }
        return this.f7934n;
    }

    @Override // p018b4.InterfaceC1008v
    /* renamed from: a */
    public final void mo6248a(Intent intent) {
        AbstractC2959a.m13386b(intent);
    }

    @Override // p018b4.InterfaceC1008v
    /* renamed from: b */
    public final boolean mo6249b(int i10) {
        return stopSelfResult(i10);
    }

    @Override // p018b4.InterfaceC1008v
    /* renamed from: c */
    public final void mo6250c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m9714d().m9815b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m9714d().m9818e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m9714d().m9819f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m9714d().m9820g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        m9714d().m9814a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m9714d().m9823j(intent);
        return true;
    }
}
