package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p057e3.C3062a;
import p070f3.C3137k;
import p321z2.C5993n0;
import p321z2.InterfaceC5997p0;

/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes.dex */
final class ServiceConnectionC1406t implements ServiceConnection, InterfaceC5997p0 {

    /* renamed from: a */
    private final Map f6367a = new HashMap();

    /* renamed from: b */
    private int f6368b = 2;

    /* renamed from: c */
    private boolean f6369c;

    /* renamed from: d */
    private IBinder f6370d;

    /* renamed from: e */
    private final C5993n0 f6371e;

    /* renamed from: f */
    private ComponentName f6372f;

    /* renamed from: g */
    final /* synthetic */ C1408v f6373g;

    public ServiceConnectionC1406t(C1408v c1408v, C5993n0 c5993n0) {
        this.f6373g = c1408v;
        this.f6371e = c5993n0;
    }

    /* renamed from: a */
    public final int m7709a() {
        return this.f6368b;
    }

    /* renamed from: b */
    public final ComponentName m7710b() {
        return this.f6372f;
    }

    /* renamed from: c */
    public final IBinder m7711c() {
        return this.f6370d;
    }

    /* renamed from: d */
    public final void m7712d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f6367a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m7713e(String str, Executor executor) {
        C3062a c3062a;
        Context context;
        Context context2;
        C3062a c3062a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f6368b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C3137k.m13808l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C1408v c1408v = this.f6373g;
            c3062a = c1408v.f6379j;
            context = c1408v.f6376g;
            C5993n0 c5993n0 = this.f6371e;
            context2 = c1408v.f6376g;
            boolean m13529d = c3062a.m13529d(context, str, c5993n0.m21300b(context2), this, 4225, executor);
            this.f6369c = m13529d;
            if (m13529d) {
                handler = this.f6373g.f6377h;
                Message obtainMessage = handler.obtainMessage(1, this.f6371e);
                handler2 = this.f6373g.f6377h;
                j10 = this.f6373g.f6381l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f6368b = 2;
                try {
                    C1408v c1408v2 = this.f6373g;
                    c3062a2 = c1408v2.f6379j;
                    context3 = c1408v2.f6376g;
                    c3062a2.m13528c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m7714f(ServiceConnection serviceConnection, String str) {
        this.f6367a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m7715g(String str) {
        Handler handler;
        C3062a c3062a;
        Context context;
        handler = this.f6373g.f6377h;
        handler.removeMessages(1, this.f6371e);
        C1408v c1408v = this.f6373g;
        c3062a = c1408v.f6379j;
        context = c1408v.f6376g;
        c3062a.m13528c(context, this);
        this.f6369c = false;
        this.f6368b = 2;
    }

    /* renamed from: h */
    public final boolean m7716h(ServiceConnection serviceConnection) {
        return this.f6367a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m7717i() {
        return this.f6367a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m7718j() {
        return this.f6369c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6373g.f6375f;
        synchronized (hashMap) {
            handler = this.f6373g.f6377h;
            handler.removeMessages(1, this.f6371e);
            this.f6370d = iBinder;
            this.f6372f = componentName;
            Iterator it = this.f6367a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f6368b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6373g.f6375f;
        synchronized (hashMap) {
            handler = this.f6373g.f6377h;
            handler.removeMessages(1, this.f6371e);
            this.f6370d = null;
            this.f6372f = componentName;
            Iterator it = this.f6367a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f6368b = 2;
        }
    }
}
