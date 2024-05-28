package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p057e3.C3062a;
import p235s3.HandlerC4526i;
import p321z2.C5984j;
import p321z2.C5993n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public final class C1408v extends AbstractC1390d {

    /* renamed from: f */
    private final HashMap f6375f = new HashMap();

    /* renamed from: g */
    private final Context f6376g;

    /* renamed from: h */
    private volatile Handler f6377h;

    /* renamed from: i */
    private final C1407u f6378i;

    /* renamed from: j */
    private final C3062a f6379j;

    /* renamed from: k */
    private final long f6380k;

    /* renamed from: l */
    private final long f6381l;

    /* renamed from: m */
    private volatile Executor f6382m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1408v(Context context, Looper looper, Executor executor) {
        C1407u c1407u = new C1407u(this, null);
        this.f6378i = c1407u;
        this.f6376g = context.getApplicationContext();
        this.f6377h = new HandlerC4526i(looper, c1407u);
        this.f6379j = C3062a.m13522b();
        this.f6380k = 5000L;
        this.f6381l = 300000L;
        this.f6382m = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1390d
    /* renamed from: d */
    protected final void mo7691d(C5993n0 c5993n0, ServiceConnection serviceConnection, String str) {
        C5984j.m21287k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6375f) {
            ServiceConnectionC1406t serviceConnectionC1406t = (ServiceConnectionC1406t) this.f6375f.get(c5993n0);
            if (serviceConnectionC1406t != null) {
                if (serviceConnectionC1406t.m7716h(serviceConnection)) {
                    serviceConnectionC1406t.m7714f(serviceConnection, str);
                    if (serviceConnectionC1406t.m7717i()) {
                        this.f6377h.sendMessageDelayed(this.f6377h.obtainMessage(0, c5993n0), this.f6380k);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c5993n0.toString());
                }
            } else {
                throw new IllegalStateException("Nonexistent connection status for service config: " + c5993n0.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1390d
    /* renamed from: f */
    public final boolean mo7693f(C5993n0 c5993n0, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m7718j;
        C5984j.m21287k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6375f) {
            ServiceConnectionC1406t serviceConnectionC1406t = (ServiceConnectionC1406t) this.f6375f.get(c5993n0);
            if (executor == null) {
                executor = this.f6382m;
            }
            if (serviceConnectionC1406t == null) {
                serviceConnectionC1406t = new ServiceConnectionC1406t(this, c5993n0);
                serviceConnectionC1406t.m7712d(serviceConnection, serviceConnection, str);
                serviceConnectionC1406t.m7713e(str, executor);
                this.f6375f.put(c5993n0, serviceConnectionC1406t);
            } else {
                this.f6377h.removeMessages(0, c5993n0);
                if (!serviceConnectionC1406t.m7716h(serviceConnection)) {
                    serviceConnectionC1406t.m7712d(serviceConnection, serviceConnection, str);
                    int m7709a = serviceConnectionC1406t.m7709a();
                    if (m7709a == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC1406t.m7710b(), serviceConnectionC1406t.m7711c());
                    } else if (m7709a == 2) {
                        serviceConnectionC1406t.m7713e(str, executor);
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c5993n0.toString());
                }
            }
            m7718j = serviceConnectionC1406t.m7718j();
        }
        return m7718j;
    }
}
