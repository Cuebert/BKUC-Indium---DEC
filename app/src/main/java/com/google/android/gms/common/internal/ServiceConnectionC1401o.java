package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import p321z2.InterfaceC5976f;

/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
public final class ServiceConnectionC1401o implements ServiceConnection {

    /* renamed from: a */
    private final int f6362a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1388b f6363b;

    public ServiceConnectionC1401o(AbstractC1388b abstractC1388b, int i10) {
        this.f6363b = abstractC1388b;
        this.f6362a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC5976f c1397k;
        AbstractC1388b abstractC1388b = this.f6363b;
        if (iBinder == null) {
            AbstractC1388b.m7639d0(abstractC1388b, 16);
            return;
        }
        obj = abstractC1388b.f6328n;
        synchronized (obj) {
            AbstractC1388b abstractC1388b2 = this.f6363b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5976f)) {
                c1397k = (InterfaceC5976f) queryLocalInterface;
            } else {
                c1397k = new C1397k(iBinder);
            }
            abstractC1388b2.f6329o = c1397k;
        }
        this.f6363b.m7663e0(0, null, this.f6362a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f6363b.f6328n;
        synchronized (obj) {
            this.f6363b.f6329o = null;
        }
        Handler handler = this.f6363b.f6326l;
        handler.sendMessage(handler.obtainMessage(6, this.f6362a, 1));
    }
}
