package com.roblox.client.pushnotification.p038v2.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2843l0;
import com.roblox.client.C2872n;
import com.roblox.client.startup.ActivitySplash;
import la.C3905c;
import p035c9.C1151k;
import p035c9.C1153m;
import p100h7.C3409b;
import p101h8.C3439m;
import p101h8.C3444r;
import p288w8.C5469d;
import p288w8.EnumC5480o;
import p300x7.C5560b;
import p300x7.C5565g;

/* loaded from: classes.dex */
public class Sendr1PushNotificationReceiver extends C2843l0 {

    /* renamed from: com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC2884a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Context f11478n;

        /* renamed from: o */
        final /* synthetic */ Intent f11479o;

        RunnableC2884a(Context context, Intent intent) {
            this.f11478n = context;
            this.f11479o = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent m13018n = Sendr1PushNotificationReceiver.this.m13018n(C2872n.m12830h().m12838i(this.f11478n), this.f11479o);
            m13018n.setFlags(268435456);
            Bundle extras = m13018n.getExtras();
            if (extras != null) {
                C3439m.m15122c().m15138r(extras);
            }
            String m13011g = Sendr1PushNotificationReceiver.this.m13011g(this.f11479o);
            this.f11478n.startActivity(m13018n);
            C3905c.m16561r().m16562e(m13011g);
            Sendr1PushNotificationReceiver.this.m13008d(this.f11479o, m13011g);
        }
    }

    /* renamed from: d */
    public void m13008d(Intent intent, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C2822f0.m12493o(m13012h(intent), m13010f(intent), m13013i(intent), str);
    }

    /* renamed from: e */
    private void m13009e(String str, Context context, Intent intent, boolean z10) {
        C2822f0.m12495q(str, new C3444r().m15156a(context, "GcmPlatform"), m13012h(intent), m13010f(intent), C1153m.m6738a(context), z10, m13013i(intent));
    }

    /* renamed from: f */
    private String m13010f(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_ID");
    }

    /* renamed from: g */
    public String m13011g(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION");
    }

    /* renamed from: h */
    private String m13012h(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
    }

    /* renamed from: i */
    private String m13013i(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
    }

    /* renamed from: j */
    private void m13014j(Context context, Intent intent) {
        if (C5565g.m20445e().m20457f()) {
            C1151k.m6712f("rbx.push", "loadTheApp: (v2) ...(logged in) launch Main.");
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2884a(context, intent), AbstractActivityC2837i0.f11276R == 0 ? 1000 : 0);
            return;
        }
        C1151k.m6712f("rbx.push", "loadTheApp: (v2) ...(not logged in) launch Splash.");
        Intent m13018n = m13018n(ActivitySplash.m13160C1(context, EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION), intent);
        Bundle extras = m13018n.getExtras();
        if (extras != null) {
            C3439m.m15122c().m15138r(extras);
        }
        m13018n.setFlags(268468224);
        String m13011g = m13011g(intent);
        context.startActivity(m13018n);
        C3905c.m16561r().m16562e(m13011g);
        m13008d(intent, m13011g);
    }

    /* renamed from: k */
    private void m13015k(Intent intent, Context context) {
    }

    /* renamed from: l */
    private void m13016l(Context context, Intent intent) {
        m13014j(context, intent);
        m13015k(intent, context);
        m13009e("clicked", context, intent, true);
    }

    /* renamed from: m */
    private void m13017m(Context context, Intent intent) {
        C1151k.m6714h("rbx.push", "cleared notifications of type: " + m13012h(intent));
        m13009e("dismissed", context, intent, false);
    }

    /* renamed from: n */
    public Intent m13018n(Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", intent2.getStringExtra("EXTRA_NOTIFICATION_TYPE"));
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", intent2.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
        return intent;
    }

    @Override // com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        C5560b.m20357e().m20366k(context, C5560b.d.APP_INIT_TYPE_SHELL);
        C5469d.m20108l(context);
        C3409b.m15015e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                m13017m(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                m13016l(context, intent);
            }
        }
    }
}
