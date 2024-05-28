package p142k8;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.core.app.C0578k;
import androidx.core.app.C0581n;
import androidx.core.app.C0582o;
import androidx.core.app.C0583p;
import androidx.core.content.C0587a;
import ba.C1086g;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.pushnotification.p038v2.RealtimeNotificationForegroundService;
import com.roblox.client.pushnotification.p038v2.SendrChatMessageReplyHandler;
import com.roblox.client.startup.ActivitySplash;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p035c9.C1151k;
import p101h8.C3438l;
import p155l8.EnumC3898b;
import p155l8.InterfaceC3899c;
import p288w8.C5469d;
import p288w8.C5476k;
import p288w8.EnumC5480o;
import p288w8.InterfaceC5473h;

/* renamed from: k8.d */
/* loaded from: classes.dex */
public class C3765d implements InterfaceC3763b {

    /* renamed from: k8.d$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5473h {

        /* renamed from: a */
        final /* synthetic */ Context f15787a;

        /* renamed from: b */
        final /* synthetic */ C0578k.e f15788b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3899c f15789c;

        /* renamed from: d */
        final /* synthetic */ C5476k f15790d;

        a(Context context, C0578k.e eVar, InterfaceC3899c interfaceC3899c, C5476k c5476k) {
            this.f15787a = context;
            this.f15788b = eVar;
            this.f15789c = interfaceC3899c;
            this.f15790d = c5476k;
        }

        @Override // p288w8.InterfaceC5473h
        /* renamed from: a */
        public void mo16008a() {
            C3765d.this.m16007g(this.f15787a, this.f15788b, this.f15789c);
            this.f15790d.m20169T(this);
        }

        @Override // p288w8.InterfaceC5473h
        /* renamed from: b */
        public void mo16009b() {
            this.f15790d.m20169T(this);
        }
    }

    /* renamed from: k8.d$b */
    /* loaded from: classes.dex */
    class b extends AbstractAsyncTaskC3764c {

        /* renamed from: f */
        final /* synthetic */ C0578k.e f15792f;

        /* renamed from: g */
        final /* synthetic */ Context f15793g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC3899c f15794h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, long j10, EnumC3898b enumC3898b, String str, C0578k.e eVar, Context context2, InterfaceC3899c interfaceC3899c) {
            super(context, j10, enumC3898b, str);
            this.f15792f = eVar;
            this.f15793g = context2;
            this.f15794h = interfaceC3899c;
        }

        @Override // p142k8.AbstractAsyncTaskC3764c
        /* renamed from: d */
        public void mo15997d(Bitmap bitmap) {
            if (bitmap != null) {
                this.f15792f.m2856t(bitmap);
            }
            C0581n.m2959b(this.f15793g).m2965e(this.f15794h.mo16518h(), this.f15794h.mo16519i(), this.f15792f.m2842c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.d$c */
    /* loaded from: classes.dex */
    public class c implements C1086g.a {

        /* renamed from: n */
        final /* synthetic */ String f15796n;

        /* renamed from: o */
        final /* synthetic */ Context f15797o;

        /* renamed from: p */
        final /* synthetic */ Notification f15798p;

        /* renamed from: q */
        final /* synthetic */ boolean f15799q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC3899c f15800r;

        c(String str, Context context, Notification notification, boolean z10, InterfaceC3899c interfaceC3899c) {
            this.f15796n = str;
            this.f15797o = context;
            this.f15798p = notification;
            this.f15799q = z10;
            this.f15800r = interfaceC3899c;
        }

        @Override // ba.C1086g.a
        /* renamed from: K */
        public void mo6428K(String str) {
            if (this.f15796n.equals(str)) {
                C1086g.m6420y().m6426x(this);
            }
        }

        @Override // ba.C1086g.a
        /* renamed from: T */
        public void mo6429T(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // ba.C1086g.a
        /* renamed from: W */
        public void mo6430W(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // ba.C1086g.a
        /* renamed from: a0 */
        public void mo6431a0(String str) {
            if (this.f15796n.equals(str)) {
                C1086g.m6420y().m6426x(this);
            }
        }

        @Override // ba.C1086g.a
        /* renamed from: g0 */
        public void mo6432g0(String str, String str2) {
            if (this.f15796n.equals(str)) {
                String str3 = null;
                if ("Miss".equals(str2)) {
                    str3 = "missed";
                } else if ("Suppress".equals(str2) && !this.f15799q) {
                    str3 = "voice not enabled";
                }
                InterfaceC3899c interfaceC3899c = this.f15800r.mo16533w().get(str3);
                if (interfaceC3899c != null) {
                    C0581n.m2959b(this.f15797o).m2965e(interfaceC3899c.mo16518h(), interfaceC3899c.mo16519i(), C3765d.this.m16004d(this.f15797o, interfaceC3899c).m2842c());
                }
                C1086g.m6420y().m6426x(this);
            }
        }

        @Override // ba.C1086g.a
        /* renamed from: p */
        public void mo6433p(String str, boolean z10) {
            if (this.f15796n.equals(str) && z10) {
                C0587a.m3037k(this.f15797o, RealtimeNotificationForegroundService.m12999d(this.f15797o, this.f15796n, this.f15798p));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public C0578k.e m16004d(Context context, InterfaceC3899c interfaceC3899c) {
        C0578k.e eVar = new C0578k.e(context, interfaceC3899c.mo16516f());
        eVar.m2850m(interfaceC3899c.mo16513c(context));
        eVar.m2854q(interfaceC3899c.mo16529s(context));
        eVar.m2861y(interfaceC3899c.mo16517g());
        eVar.m2838E(interfaceC3899c.getVisibility());
        eVar.m2862z(interfaceC3899c.mo16522l(context));
        eVar.m2852o(interfaceC3899c.getTitle());
        eVar.m2851n(interfaceC3899c.mo16520j());
        eVar.m2844g(true);
        eVar.m2859w(interfaceC3899c.mo16527q());
        eVar.m2834A(interfaceC3899c.mo16523m(context));
        eVar.m2860x(interfaceC3899c.mo16521k());
        if (C1134c.m6537a().mo6621k() && interfaceC3899c.mo16524n()) {
            String string = context.getString(C2748c0.f10565P3);
            eVar.m2841b(new C0578k.a.C6035a(C2913x.f11753b, string, m16006f(context, interfaceC3899c)).m2808a(new C0583p.d("key_reply_message").m3018b(string).m3017a()).m2810d(true).m2809b());
        }
        eVar.m2835B(new C0578k.c().m2825h(interfaceC3899c.mo16520j()));
        return eVar;
    }

    /* renamed from: e */
    private Intent m16005e(Context context, InterfaceC3899c interfaceC3899c, long j10, String str, String str2, String str3) {
        String format;
        if (str2 != null) {
            format = String.format(Locale.ROOT, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s", Long.valueOf(j10), str2, str3);
        } else if (str != null) {
            format = String.format(Locale.ROOT, "roblox://placeId=%d&gameInstanceId=%s&callId=%s", Long.valueOf(j10), str, str3);
        } else {
            format = String.format(Locale.ROOT, "roblox://placeId=%d&callId=%s", Long.valueOf(j10), str3);
        }
        Intent intent = new Intent("push_notification_action");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(format));
        intent.putExtra("STARTED_FOR_INTENT_KEY", EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC3899c.mo16512b());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", interfaceC3899c.mo16515e());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", format);
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC3899c.mo16530t());
        return intent;
    }

    /* renamed from: f */
    private PendingIntent m16006f(Context context, InterfaceC3899c interfaceC3899c) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        intent.putExtra("EXTRA_CONVERSATION_ID", interfaceC3899c.mo16531u());
        intent.putExtra("tag", interfaceC3899c.mo16518h());
        intent.putExtra("EXTRA_MESSAGE_ID", interfaceC3899c.mo16525o());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", interfaceC3899c.getTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC3899c.mo16512b());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC3899c.mo16530t());
        return PendingIntent.getBroadcast(context, interfaceC3899c.mo16519i(), intent, 301989888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m16007g(Context context, C0578k.e eVar, InterfaceC3899c interfaceC3899c) {
        PendingIntent pendingIntent;
        Intent intent;
        String str;
        int i10;
        int i11;
        Intent m13001f;
        PendingIntent service;
        C0578k.e eVar2;
        try {
            JSONObject jSONObject = new JSONObject(interfaceC3899c.mo16535y());
            String string = jSONObject.getString("CallId");
            String string2 = jSONObject.getString("InstanceId");
            String string3 = jSONObject.getString("ReservedServerAccessCode");
            long j10 = jSONObject.getLong("CallerId");
            String string4 = jSONObject.getString("CallerCombinedName");
            long j11 = jSONObject.getLong("CalleeId");
            String string5 = jSONObject.getString("CalleeCombinedName");
            long j12 = jSONObject.getLong("PlaceId");
            long j13 = jSONObject.getLong("CreatedUtc");
            boolean z10 = jSONObject.getBoolean("IsCalleeMicEnabled");
            int i12 = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
            Intent m12998c = RealtimeNotificationForegroundService.m12998c(context, string);
            PendingIntent service2 = PendingIntent.getService(context, 0, m12998c, i12);
            if (z10) {
                pendingIntent = service2;
                i10 = 0;
                intent = m12998c;
                str = string3;
                i11 = i12;
                m13001f = m16005e(context, interfaceC3899c, j12, string2, string3, string);
                service = PendingIntent.getActivity(context, 0, m13001f, i11);
            } else {
                pendingIntent = service2;
                intent = m12998c;
                str = string3;
                i10 = 0;
                i11 = i12;
                m13001f = RealtimeNotificationForegroundService.m13001f(context, string);
                service = PendingIntent.getService(context, 0, m13001f, i11);
            }
            PendingIntent pendingIntent2 = service;
            PendingIntent activity = PendingIntent.getActivity(context, i10, IncomingCallActivity.m12195U0(context, m13001f, intent, j10, string4), i11);
            if (C1134c.m6537a().mo6619j0()) {
                eVar2 = eVar;
                eVar2.m2835B(C0578k.f.m2868h(new C0582o.b().m2995f(string4).m2990a(), pendingIntent, pendingIntent2).m2877q(context.getResources().getColor(C2909v.f11702k)).m2878r(context.getResources().getColor(C2909v.f11703l)));
                eVar2.m2848k(true);
            } else {
                eVar2 = eVar;
                eVar2.m2840a(i10, context.getString(C2748c0.f10560O3), pendingIntent);
                eVar2.m2840a(i10, context.getString(C2748c0.f10555N3), pendingIntent2);
                eVar2.m2845h("call");
            }
            eVar2.m2850m(activity);
            eVar2.m2855s(activity, true);
            eVar2.m2837D(C3438l.f14321a);
            Notification m2842c = eVar.m2842c();
            if (interfaceC3899c.mo16521k()) {
                m2842c.flags |= 36;
            }
            C1086g.m6420y().m6421g(new c(interfaceC3899c.mo16518h(), context, m2842c, z10, interfaceC3899c));
            C1086g.m6420y().m6424v(string, j10, string4, j11, string5, j12, string2, str, j13, z10, interfaceC3899c.mo16512b());
        } catch (JSONException e10) {
            C1151k.m6710d("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e10);
        }
    }

    @Override // p142k8.InterfaceC3763b
    /* renamed from: a */
    public void mo15993a(Context context, InterfaceC3899c interfaceC3899c) {
        if (context == null || interfaceC3899c == null) {
            return;
        }
        C0578k.e m16004d = m16004d(context, interfaceC3899c);
        if (!C2877p0.m12935m0() && C1134c.m6537a().mo6567O() && "CallReceived".equals(interfaceC3899c.mo16515e())) {
            if (C5469d.m20104h()) {
                m16007g(context, m16004d, interfaceC3899c);
                return;
            }
            C5476k m20155t = C5476k.m20155t(context.getApplicationContext());
            m20155t.m20164M(new a(context, m16004d, interfaceC3899c, m20155t));
            m20155t.m20167Q();
            return;
        }
        if (C1134c.m6537a().mo6589Z()) {
            new b(context, interfaceC3899c.mo16532v(), interfaceC3899c.mo16534x(), interfaceC3899c.mo16528r(), m16004d, context, interfaceC3899c).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            C0581n.m2959b(context).m2965e(interfaceC3899c.mo16518h(), interfaceC3899c.mo16519i(), m16004d.m2842c());
        }
    }
}
