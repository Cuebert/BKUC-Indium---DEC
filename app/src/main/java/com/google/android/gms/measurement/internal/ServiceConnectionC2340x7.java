package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1388b;
import p018b4.InterfaceC0990d;
import p057e3.C3062a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2340x7 implements ServiceConnection, AbstractC1388b.a, AbstractC1388b.b {

    /* renamed from: a */
    private volatile boolean f8756a;

    /* renamed from: b */
    private volatile C2130e3 f8757b;

    /* renamed from: c */
    final /* synthetic */ C2350y7 f8758c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC2340x7(C2350y7 c2350y7) {
        this.f8758c = c2350y7;
    }

    /* renamed from: b */
    public final void m10332b(Intent intent) {
        ServiceConnectionC2340x7 serviceConnectionC2340x7;
        this.f8758c.mo9917h();
        Context mo9763c = this.f8758c.f8118a.mo9763c();
        C3062a m13522b = C3062a.m13522b();
        synchronized (this) {
            if (this.f8756a) {
                this.f8758c.f8118a.mo9765d().m10052v().m9893a("Connection attempt already in progress");
                return;
            }
            this.f8758c.f8118a.mo9765d().m10052v().m9893a("Using local app measurement service");
            this.f8756a = true;
            serviceConnectionC2340x7 = this.f8758c.f8786c;
            m13522b.m13527a(mo9763c, intent, serviceConnectionC2340x7, 129);
        }
    }

    /* renamed from: c */
    public final void m10333c() {
        this.f8758c.mo9917h();
        Context mo9763c = this.f8758c.f8118a.mo9763c();
        synchronized (this) {
            if (this.f8756a) {
                this.f8758c.f8118a.mo9765d().m10052v().m9893a("Connection attempt already in progress");
                return;
            }
            if (this.f8757b != null && (this.f8757b.m7666i() || this.f8757b.m7661b())) {
                this.f8758c.f8118a.mo9765d().m10052v().m9893a("Already awaiting connection attempt");
                return;
            }
            this.f8757b = new C2130e3(mo9763c, Looper.getMainLooper(), this, this);
            this.f8758c.f8118a.mo9765d().m10052v().m9893a("Connecting to remote service");
            this.f8756a = true;
            C5984j.m21286j(this.f8757b);
            this.f8757b.m7673q();
        }
    }

    /* renamed from: d */
    public final void m10334d() {
        if (this.f8757b != null && (this.f8757b.m7661b() || this.f8757b.m7666i())) {
            this.f8757b.m7671n();
        }
        this.f8757b = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b.a
    /* renamed from: i */
    public final void mo7681i(int i10) {
        C5984j.m21281e("MeasurementServiceConnection.onConnectionSuspended");
        this.f8758c.f8118a.mo9765d().m10047q().m9893a("Service connection suspended");
        this.f8758c.f8118a.mo9761b().m10081z(new RunnableC2320v7(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b.b
    /* renamed from: l */
    public final void mo7683l(ConnectionResult connectionResult) {
        C5984j.m21281e("MeasurementServiceConnection.onConnectionFailed");
        C2174i3 m10106E = this.f8758c.f8118a.m10106E();
        if (m10106E != null) {
            m10106E.m10053w().m9894b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f8756a = false;
            this.f8757b = null;
        }
        this.f8758c.f8118a.mo9761b().m10081z(new RunnableC2330w7(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b.a
    /* renamed from: n */
    public final void mo7682n(Bundle bundle) {
        C5984j.m21281e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C5984j.m21286j(this.f8757b);
                this.f8758c.f8118a.mo9761b().m10081z(new RunnableC2310u7(this, this.f8757b.m7646D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f8757b = null;
                this.f8756a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC2340x7 serviceConnectionC2340x7;
        InterfaceC0990d c2345y2;
        C5984j.m21281e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f8756a = false;
                this.f8758c.f8118a.mo9765d().m10048r().m9893a("Service connected with null binder");
                return;
            }
            InterfaceC0990d interfaceC0990d = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC0990d) {
                        c2345y2 = (InterfaceC0990d) queryLocalInterface;
                    } else {
                        c2345y2 = new C2345y2(iBinder);
                    }
                    interfaceC0990d = c2345y2;
                    this.f8758c.f8118a.mo9765d().m10052v().m9893a("Bound to IMeasurementService interface");
                } else {
                    this.f8758c.f8118a.mo9765d().m10048r().m9894b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f8758c.f8118a.mo9765d().m10048r().m9893a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC0990d == null) {
                this.f8756a = false;
                try {
                    C3062a m13522b = C3062a.m13522b();
                    Context mo9763c = this.f8758c.f8118a.mo9763c();
                    serviceConnectionC2340x7 = this.f8758c.f8786c;
                    m13522b.m13528c(mo9763c, serviceConnectionC2340x7);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f8758c.f8118a.mo9761b().m10081z(new RunnableC2288s7(this, interfaceC0990d));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5984j.m21281e("MeasurementServiceConnection.onServiceDisconnected");
        this.f8758c.f8118a.mo9765d().m10047q().m9893a("Service disconnected");
        this.f8758c.f8118a.mo9761b().m10081z(new RunnableC2299t7(this, componentName));
    }
}
