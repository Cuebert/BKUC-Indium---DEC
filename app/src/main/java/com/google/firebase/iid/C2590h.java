package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import p224r5.C4440l;

/* renamed from: com.google.firebase.iid.h */
/* loaded from: classes.dex */
public final class C2590h {

    /* renamed from: e */
    private static C2590h f10189e;

    /* renamed from: a */
    private String f10190a = null;

    /* renamed from: b */
    private Boolean f10191b = null;

    /* renamed from: c */
    private Boolean f10192c = null;

    /* renamed from: d */
    private final Queue<Intent> f10193d = new ArrayDeque();

    private C2590h() {
    }

    /* renamed from: b */
    public static synchronized C2590h m11959b() {
        C2590h c2590h;
        synchronized (C2590h.class) {
            if (f10189e == null) {
                f10189e = new C2590h();
            }
            c2590h = f10189e;
        }
        return c2590h;
    }

    /* renamed from: d */
    private final int m11960d(Context context, Intent intent) {
        ComponentName startService;
        String m11961g = m11961g(context, intent);
        if (m11961g != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", m11961g.length() != 0 ? "Restricting intent to a specific service: ".concat(m11961g) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), m11961g);
        }
        try {
            if (m11963c(context)) {
                startService = C4440l.m18248a(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf);
            Log.e("FirebaseInstanceId", sb2.toString());
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    /* renamed from: g */
    private final synchronized String m11961g(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f10190a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f10190a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f10190a = serviceInfo.name;
                }
                return this.f10190a;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb2.append(str3);
            sb2.append("/");
            sb2.append(str4);
            Log.e("FirebaseInstanceId", sb2.toString());
            return null;
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: a */
    public final int m11962a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f10193d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m11960d(context, intent2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m11963c(Context context) {
        if (this.f10191b == null) {
            this.f10191b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f10191b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10191b.booleanValue();
    }

    /* renamed from: e */
    public final Intent m11964e() {
        return this.f10193d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m11965f(Context context) {
        if (this.f10192c == null) {
            this.f10192c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f10191b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10192c.booleanValue();
    }
}
