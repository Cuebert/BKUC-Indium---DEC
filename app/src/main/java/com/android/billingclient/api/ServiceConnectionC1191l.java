package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractBinderC1902a2;
import com.google.android.gms.internal.play_billing.C1907b0;
import com.google.android.gms.internal.play_billing.C1926d5;
import java.util.concurrent.Callable;
import p171n1.C4035n;
import p171n1.C4045u;
import p171n1.InterfaceC4015d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.l */
/* loaded from: classes.dex */
public final class ServiceConnectionC1191l implements ServiceConnection {

    /* renamed from: a */
    private final Object f5663a = new Object();

    /* renamed from: b */
    private boolean f5664b = false;

    /* renamed from: c */
    private InterfaceC4015d f5665c;

    /* renamed from: d */
    final /* synthetic */ C1175d f5666d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC1191l(C1175d c1175d, InterfaceC4015d interfaceC4015d, C4035n c4035n) {
        this.f5666d = c1175d;
        this.f5665c = interfaceC4015d;
    }

    /* renamed from: c */
    private final void m6947c(C1179f c1179f) {
        synchronized (this.f5663a) {
            InterfaceC4015d interfaceC4015d = this.f5665c;
            if (interfaceC4015d != null) {
                interfaceC4015d.mo14191a(c1179f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m6948a() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ServiceConnectionC1191l.m6948a():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m6949b() {
        C1175d.m6835T(this.f5666d, 0);
        C1175d.m6850o(this.f5666d, null);
        InterfaceC1195n m6831M = C1175d.m6831M(this.f5666d);
        C1179f c1179f = C1197o.f5694n;
        m6831M.mo6954c(C4045u.m16836a(24, 6, c1179f));
        m6947c(c1179f);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1907b0.m9249h("BillingClient", "Billing service connected.");
        C1175d.m6850o(this.f5666d, AbstractBinderC1902a2.m9200i(iBinder));
        C1175d c1175d = this.f5666d;
        if (C1175d.m6834S(c1175d, new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ServiceConnectionC1191l.this.m6948a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1191l.this.m6949b();
            }
        }, C1175d.m6829K(c1175d)) == null) {
            C1179f m6832N = C1175d.m6832N(this.f5666d);
            C1175d.m6831M(this.f5666d).mo6954c(C4045u.m16836a(25, 6, m6832N));
            m6947c(m6832N);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1907b0.m9250i("BillingClient", "Billing service disconnected.");
        C1175d.m6831M(this.f5666d).mo6953b(C1926d5.m9318x());
        C1175d.m6850o(this.f5666d, null);
        C1175d.m6835T(this.f5666d, 0);
        synchronized (this.f5663a) {
            InterfaceC4015d interfaceC4015d = this.f5665c;
            if (interfaceC4015d != null) {
                interfaceC4015d.mo14192b();
            }
        }
    }
}
