package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import p098h5.C3399c;
import p112i5.InterfaceC3531a;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
public class C2620b {
    /* renamed from: a */
    public static void m12038a(Intent intent) {
        m12043f("_nd", intent);
    }

    /* renamed from: b */
    public static void m12039b(Intent intent) {
        m12043f("_nf", intent);
    }

    /* renamed from: c */
    public static void m12040c(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                InterfaceC3531a interfaceC3531a = (InterfaceC3531a) C3399c.m14978i().m14986g(InterfaceC3531a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (interfaceC3531a != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    interfaceC3531a.mo15330a("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    interfaceC3531a.mo15331b("fcm", "_cmp", bundle);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        m12043f("_no", intent);
    }

    /* renamed from: d */
    public static void m12041d(Intent intent) {
        m12043f("_nr", intent);
    }

    /* renamed from: e */
    public static boolean m12042e(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: f */
    private static void m12043f(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", (intent.getExtras() == null || !C2632n.m12059d(intent.getExtras())) ? "data" : "display");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + valueOf.length());
            sb2.append("Sending event=");
            sb2.append(str);
            sb2.append(" params=");
            sb2.append(valueOf);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        InterfaceC3531a interfaceC3531a = (InterfaceC3531a) C3399c.m14978i().m14986g(InterfaceC3531a.class);
        if (interfaceC3531a != null) {
            interfaceC3531a.mo15331b("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }
}
