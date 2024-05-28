package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p057e3.C3062a;
import p084g3.ThreadFactoryC3239a;

/* renamed from: com.google.firebase.iid.q */
/* loaded from: classes.dex */
public final class ServiceConnectionC2602q implements ServiceConnection {

    /* renamed from: a */
    private final Context f10217a;

    /* renamed from: b */
    private final Intent f10218b;

    /* renamed from: c */
    private final ScheduledExecutorService f10219c;

    /* renamed from: d */
    private final Queue<C2604s> f10220d;

    /* renamed from: e */
    private BinderC2601p f10221e;

    /* renamed from: f */
    private boolean f10222f;

    public ServiceConnectionC2602q(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC3239a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private final synchronized void m11992a() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f10220d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            BinderC2601p binderC2601p = this.f10221e;
            if (binderC2601p != null && binderC2601p.isBinderAlive()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.f10221e.m11991a(this.f10220d.poll());
            } else {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z10 = !this.f10222f;
                    StringBuilder sb2 = new StringBuilder(39);
                    sb2.append("binder is dead. start connection? ");
                    sb2.append(z10);
                    Log.d("FirebaseInstanceId", sb2.toString());
                }
                if (!this.f10222f) {
                    this.f10222f = true;
                    try {
                    } catch (SecurityException e10) {
                        Log.e("FirebaseInstanceId", "Exception while binding the service", e10);
                    }
                    if (C3062a.m13522b().m13527a(this.f10217a, this.f10218b, this, 65)) {
                        return;
                    }
                    Log.e("FirebaseInstanceId", "binding to the service failed");
                    this.f10222f = false;
                    m11993c();
                }
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m11993c() {
        while (!this.f10220d.isEmpty()) {
            this.f10220d.poll().m11995a();
        }
    }

    /* renamed from: b */
    public final synchronized void m11994b(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        this.f10220d.add(new C2604s(intent, pendingResult, this.f10219c));
        m11992a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("onServiceConnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        this.f10222f = false;
        if (!(iBinder instanceof BinderC2601p)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e("FirebaseInstanceId", sb3.toString());
            m11993c();
            return;
        }
        this.f10221e = (BinderC2601p) iBinder;
        m11992a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("onServiceDisconnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        m11992a();
    }

    private ServiceConnectionC2602q(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f10220d = new ArrayDeque();
        this.f10222f = false;
        Context applicationContext = context.getApplicationContext();
        this.f10217a = applicationContext;
        this.f10218b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f10219c = scheduledExecutorService;
    }
}
