package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.l */
/* loaded from: classes.dex */
final class C2597l extends BroadcastReceiver {

    /* renamed from: a */
    private RunnableC2598m f10207a;

    public C2597l(RunnableC2598m runnableC2598m) {
        this.f10207a = runnableC2598m;
    }

    /* renamed from: a */
    public final void m11982a() {
        if (FirebaseInstanceId.m11890v()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f10207a.m11984a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        RunnableC2598m runnableC2598m = this.f10207a;
        if (runnableC2598m != null && runnableC2598m.m11985b()) {
            if (FirebaseInstanceId.m11890v()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m11886l(this.f10207a, 0L);
            this.f10207a.m11984a().unregisterReceiver(this);
            this.f10207a = null;
        }
    }
}
