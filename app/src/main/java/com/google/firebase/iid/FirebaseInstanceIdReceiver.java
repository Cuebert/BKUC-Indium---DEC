package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import p041d1.AbstractC2959a;
import p070f3.C3137k;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2959a {

    /* renamed from: c */
    private static ServiceConnectionC2602q f10162c;

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static int m11912d(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z10 = C3137k.m13804h() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return m11915g(broadcastReceiver, context, intent);
        }
        int m11962a = C2590h.m11959b().m11962a(context, intent);
        if (!C3137k.m13804h() || m11962a != 402) {
            return m11962a;
        }
        m11915g(broadcastReceiver, context, intent);
        return 403;
    }

    /* renamed from: e */
    private static synchronized ServiceConnectionC2602q m11913e(Context context, String str) {
        ServiceConnectionC2602q serviceConnectionC2602q;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (f10162c == null) {
                f10162c = new ServiceConnectionC2602q(context, str);
            }
            serviceConnectionC2602q = f10162c;
        }
        return serviceConnectionC2602q;
    }

    /* renamed from: f */
    private final void m11914f(Context context, Intent intent) {
        int m11912d;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb2 = new StringBuilder(stringExtra.length() + 21 + valueOf.length());
                    sb2.append("Received command: ");
                    sb2.append(stringExtra);
                    sb2.append(" - ");
                    sb2.append(valueOf);
                    Log.d("FirebaseInstanceId", sb2.toString());
                }
                if (!"RST".equals(stringExtra) && !"RST_FULL".equals(stringExtra)) {
                    if ("SYNC".equals(stringExtra)) {
                        FirebaseInstanceId.m11882a().m11906y();
                    }
                } else {
                    FirebaseInstanceId.m11882a().m11904w();
                }
            }
            m11912d = -1;
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            m11912d = m11912d(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(m11912d);
        }
    }

    /* renamed from: g */
    private static int m11915g(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m11913e(context, "com.google.firebase.MESSAGING_EVENT").m11994b(intent, broadcastReceiver.goAsync());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            m11914f(context, intent2);
        } else {
            m11914f(context, intent);
        }
    }
}
