package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.s */
/* loaded from: classes.dex */
final class C2604s {

    /* renamed from: a */
    final Intent f10225a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f10226b;

    /* renamed from: c */
    private boolean f10227c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f10228d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2604s(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f10225a = intent;
        this.f10226b = pendingResult;
        this.f10228d = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: com.google.firebase.iid.r

            /* renamed from: n */
            private final C2604s f10223n;

            /* renamed from: o */
            private final Intent f10224o;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10223n = this;
                this.f10224o = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2604s c2604s = this.f10223n;
                String action = this.f10224o.getAction();
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
                sb2.append("Service took too long to process intent: ");
                sb2.append(action);
                sb2.append(" App may get closed.");
                Log.w("FirebaseInstanceId", sb2.toString());
                c2604s.m11995a();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m11995a() {
        if (!this.f10227c) {
            this.f10226b.finish();
            this.f10228d.cancel(false);
            this.f10227c = true;
        }
    }
}
