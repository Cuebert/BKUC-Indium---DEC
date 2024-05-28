package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.C2822f0;
import com.roblox.client.C2843l0;
import com.roblox.client.C2872n;
import com.roblox.client.startup.ActivitySplash;
import p035c9.C1151k;
import p035c9.C1153m;
import p100h7.C3409b;
import p100h7.C3421n;
import p100h7.C3422o;
import p101h8.C3439m;
import p101h8.C3442p;
import p101h8.C3444r;
import p288w8.C5469d;
import p288w8.EnumC5480o;
import p300x7.C5560b;
import p300x7.C5565g;

/* renamed from: com.roblox.client.pushnotification.notificationreceivers.a */
/* loaded from: classes.dex */
public abstract class AbstractC2881a extends C2843l0 {
    /* renamed from: h */
    protected static void m12985h(Context context, String str) {
        new C3422o().m15035a(context, str);
    }

    /* renamed from: i */
    protected static void m12986i(String str, String str2, String str3) {
        new C3421n().m15034a(str, str2, str3);
    }

    /* renamed from: j */
    public static void m12987j(Intent intent, Context context) {
        if (!intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            C1151k.m6714h("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            m12985h(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            return;
        }
        C1151k.m6714h("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        m12986i(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m12988a(Context context, int i10) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i10);
    }

    /* renamed from: b */
    public void m12989b(String str) {
        C3442p.m15144c().m15147d(str).clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m12990c(Context context) {
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m12991d(String str, Context context, Intent intent, String str2, String str3, boolean z10, String str4) {
        C2822f0.m12494p(str, new C3444r().m15156a(context, "GcmPlatform"), str4, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), str2, str3, z10, m12993f(intent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m12992e(String str, Context context, Intent intent, boolean z10, String str2) {
        C2822f0.m12495q(str, new C3444r().m15156a(context, "GcmPlatform"), str2, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), C1153m.m6738a(context), z10, m12993f(intent));
    }

    /* renamed from: f */
    protected String m12993f(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        return (stringExtra == null || stringExtra.isEmpty()) ? "0" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m12994g(Context context, Intent intent) {
        Intent mo12974n;
        if (C5565g.m20445e().m20457f()) {
            C1151k.m6712f("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            mo12974n = mo12974n(context, C2872n.m12830h().m12838i(context), intent);
            mo12974n.setFlags(268435456);
        } else {
            C1151k.m6712f("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            mo12974n = mo12974n(context, ActivitySplash.m13160C1(context, EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION), intent);
            mo12974n.setFlags(268468224);
        }
        Bundle extras = mo12974n.getExtras();
        if (extras != null) {
            C3439m.m15122c().m15138r(extras);
        }
        context.startActivity(mo12974n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m12995k(String str, Context context, Intent intent, String str2) {
        m12989b(str);
        m12985h(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        m12991d("actionTaken", context, intent, str2, C1153m.m6738a(context), true, "FriendRequestReceived");
    }

    /* renamed from: l */
    protected void mo12972l(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C1151k.m6714h("rbx.push", "notification of type " + stringExtra + " clicked");
        m12994g(context, intent);
        m12989b(stringExtra);
        m12987j(intent, context);
        m12992e("clicked", context, intent, true, stringExtra);
    }

    /* renamed from: m */
    protected void mo12973m(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C1151k.m6714h("rbx.push", "cleared notifications of type: " + stringExtra);
        m12989b(stringExtra);
        m12992e("dismissed", context, intent, false, stringExtra);
    }

    /* renamed from: n */
    protected abstract Intent mo12974n(Context context, Intent intent, Intent intent2);

    @Override // com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        C5560b.m20357e().m20366k(context, C5560b.d.APP_INIT_TYPE_SHELL);
        C5469d.m20108l(context);
        C3409b.m15015e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                mo12973m(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                mo12972l(context, intent);
            }
        }
    }
}
