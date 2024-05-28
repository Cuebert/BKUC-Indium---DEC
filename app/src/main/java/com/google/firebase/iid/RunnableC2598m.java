package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import p224r5.C4438j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.m */
/* loaded from: classes.dex */
public final class RunnableC2598m implements Runnable {

    /* renamed from: n */
    private final long f10208n;

    /* renamed from: o */
    private final PowerManager.WakeLock f10209o;

    /* renamed from: p */
    private final FirebaseInstanceId f10210p;

    /* renamed from: q */
    private final C2599n f10211q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2598m(FirebaseInstanceId firebaseInstanceId, C4438j c4438j, C2599n c2599n, long j10) {
        this.f10210p = firebaseInstanceId;
        this.f10211q = c2599n;
        this.f10208n = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m11984a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10209o = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m11983c() throws IOException {
        C2594j m11900o = this.f10210p.m11900o();
        if (!this.f10210p.m11899n(m11900o)) {
            return true;
        }
        try {
            String m11902s = this.f10210p.m11902s();
            if (m11902s == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((m11900o == null || !m11902s.equals(m11900o.f10198a)) && "[DEFAULT]".equals(this.f10210p.m11896h().m14988j())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f10210p.m11896h().m14988j());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", m11902s);
                Context m11984a = m11984a();
                Intent intent2 = new Intent(m11984a, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                m11984a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                if (e10.getMessage() == null) {
                    String message = e10.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                    sb2.append("Token retrieval failed: ");
                    sb2.append(message);
                    sb2.append(". Will retry token retrieval");
                    Log.e("FirebaseInstanceId", sb2.toString());
                    return false;
                }
                throw e10;
            }
            Log.e("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.e("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context m11984a() {
        return this.f10210p.m11896h().m14987h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m11985b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m11984a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C2590h.m11959b().m11963c(m11984a())) {
            this.f10209o.acquire();
        }
        try {
            try {
                this.f10210p.m11898m(true);
                if (!this.f10210p.m11905x()) {
                    this.f10210p.m11898m(false);
                    if (C2590h.m11959b().m11963c(m11984a())) {
                        this.f10209o.release();
                        return;
                    }
                    return;
                }
                if (C2590h.m11959b().m11965f(m11984a()) && !m11985b()) {
                    new C2597l(this).m11982a();
                    if (C2590h.m11959b().m11963c(m11984a())) {
                        this.f10209o.release();
                        return;
                    }
                    return;
                }
                if (m11983c() && this.f10211q.m11990b(this.f10210p)) {
                    this.f10210p.m11898m(false);
                } else {
                    this.f10210p.m11897k(this.f10208n);
                }
                if (C2590h.m11959b().m11963c(m11984a())) {
                    this.f10209o.release();
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb2.toString());
                this.f10210p.m11898m(false);
                if (C2590h.m11959b().m11963c(m11984a())) {
                    this.f10209o.release();
                }
            }
        } catch (Throwable th) {
            if (C2590h.m11959b().m11963c(m11984a())) {
                this.f10209o.release();
            }
            throw th;
        }
    }
}
