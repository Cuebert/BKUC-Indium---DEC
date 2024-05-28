package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* loaded from: classes.dex */
public final class C2251p3 extends BroadcastReceiver {

    /* renamed from: d */
    static final String f8423d = C2251p3.class.getName();

    /* renamed from: a */
    private final C2103b9 f8424a;

    /* renamed from: b */
    private boolean f8425b;

    /* renamed from: c */
    private boolean f8426c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2251p3(C2103b9 c2103b9) {
        C5984j.m21286j(c2103b9);
        this.f8424a = c2103b9;
    }

    /* renamed from: b */
    public final void m10209b() {
        this.f8424a.m9770g();
        this.f8424a.mo9761b().mo9917h();
        if (this.f8425b) {
            return;
        }
        this.f8424a.mo9763c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f8426c = this.f8424a.m9757X().m10185m();
        this.f8424a.mo9765d().m10052v().m9894b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f8426c));
        this.f8425b = true;
    }

    /* renamed from: c */
    public final void m10210c() {
        this.f8424a.m9770g();
        this.f8424a.mo9761b().mo9917h();
        this.f8424a.mo9761b().mo9917h();
        if (this.f8425b) {
            this.f8424a.mo9765d().m10052v().m9893a("Unregistering connectivity change receiver");
            this.f8425b = false;
            this.f8426c = false;
            try {
                this.f8424a.mo9763c().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f8424a.mo9765d().m10048r().m9894b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f8424a.m9770g();
        String action = intent.getAction();
        this.f8424a.mo9765d().m10052v().m9894b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m10185m = this.f8424a.m9757X().m10185m();
            if (this.f8426c != m10185m) {
                this.f8426c = m10185m;
                this.f8424a.mo9761b().m10081z(new RunnableC2240o3(this, m10185m));
                return;
            }
            return;
        }
        this.f8424a.mo9765d().m10053w().m9894b("NetworkBroadcastReceiver received unknown action", action);
    }
}
