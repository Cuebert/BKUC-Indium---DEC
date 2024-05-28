package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC1772s0;
import com.google.android.gms.internal.measurement.InterfaceC1788t0;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2346y3 implements ServiceConnection {

    /* renamed from: a */
    private final String f8765a;

    /* renamed from: b */
    final /* synthetic */ C2356z3 f8766b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC2346y3(C2356z3 c2356z3, String str) {
        this.f8766b = c2356z3;
        this.f8765a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                InterfaceC1788t0 m8772l = AbstractBinderC1772s0.m8772l(iBinder);
                if (m8772l == null) {
                    this.f8766b.f8802a.mo9765d().m10053w().m9893a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.f8766b.f8802a.mo9765d().m10052v().m9893a("Install Referrer Service connected");
                    this.f8766b.f8802a.mo9761b().m10081z(new RunnableC2336x3(this, m8772l, this));
                    return;
                }
            } catch (RuntimeException e10) {
                this.f8766b.f8802a.mo9765d().m10053w().m9894b("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        this.f8766b.f8802a.mo9765d().m10053w().m9893a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8766b.f8802a.mo9765d().m10052v().m9893a("Install Referrer Service disconnected");
    }
}
