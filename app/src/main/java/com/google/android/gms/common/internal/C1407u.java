package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import p321z2.C5984j;
import p321z2.C5993n0;
import p321z2.C5995o0;

/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes.dex */
public final class C1407u implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C1408v f6374a;

    public /* synthetic */ C1407u(C1408v c1408v, C5995o0 c5995o0) {
        this.f6374a = c1408v;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f6374a.f6375f;
            synchronized (hashMap) {
                C5993n0 c5993n0 = (C5993n0) message.obj;
                hashMap2 = this.f6374a.f6375f;
                ServiceConnectionC1406t serviceConnectionC1406t = (ServiceConnectionC1406t) hashMap2.get(c5993n0);
                if (serviceConnectionC1406t != null && serviceConnectionC1406t.m7717i()) {
                    if (serviceConnectionC1406t.m7718j()) {
                        serviceConnectionC1406t.m7715g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f6374a.f6375f;
                    hashMap3.remove(c5993n0);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        hashMap4 = this.f6374a.f6375f;
        synchronized (hashMap4) {
            C5993n0 c5993n02 = (C5993n0) message.obj;
            hashMap5 = this.f6374a.f6375f;
            ServiceConnectionC1406t serviceConnectionC1406t2 = (ServiceConnectionC1406t) hashMap5.get(c5993n02);
            if (serviceConnectionC1406t2 != null && serviceConnectionC1406t2.m7709a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c5993n02), new Exception());
                ComponentName m7710b = serviceConnectionC1406t2.m7710b();
                if (m7710b == null) {
                    m7710b = c5993n02.m21299a();
                }
                if (m7710b == null) {
                    String m21301c = c5993n02.m21301c();
                    C5984j.m21286j(m21301c);
                    m7710b = new ComponentName(m21301c, "unknown");
                }
                serviceConnectionC1406t2.onServiceDisconnected(m7710b);
            }
        }
        return true;
    }
}
