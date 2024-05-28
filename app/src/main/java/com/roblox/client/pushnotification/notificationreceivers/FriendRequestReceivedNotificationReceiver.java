package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.core.app.C0578k;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;
import p035c9.C1151k;
import p035c9.C1153m;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p179n9.C4083g;
import p193ob.AbstractC4183j0;
import p277v9.C4996b;

/* loaded from: classes.dex */
public class FriendRequestReceivedNotificationReceiver extends AbstractC2881a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$a */
    /* loaded from: classes.dex */
    public class C2879a implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ Context f11461a;

        /* renamed from: b */
        final /* synthetic */ Intent f11462b;

        C2879a(Context context, Intent intent) {
            this.f11461a = context;
            this.f11462b = intent;
        }

        /* renamed from: c */
        private void m12979c(int i10, String str) {
            Toast.makeText(this.f11461a, i10, 0).show();
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Context context = this.f11461a;
            friendRequestReceivedNotificationReceiver.m12991d(str, context, this.f11462b, "Accept", C1153m.m6738a(context), true, "FriendRequestReceived");
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            C4996b c4996b = new C4996b(c3348t);
            if (!c4996b.m19447b()) {
                int i10 = C2748c0.f10639d4;
                String str = "code_" + c4996b.f19094a + "error_" + c4996b.m19446a();
                if (c4996b.f19094a == 401) {
                    i10 = C2748c0.f10700o;
                    str = "unauthenticated";
                }
                m12979c(i10, str);
            }
            FriendRequestReceivedNotificationReceiver.this.m12994g(this.f11461a, this.f11462b);
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            m12979c(C2748c0.f10639d4, "client_failure");
            FriendRequestReceivedNotificationReceiver.this.m12994g(this.f11461a, this.f11462b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$b */
    /* loaded from: classes.dex */
    public class C2880b implements InterfaceC3332d<AbstractC4183j0> {

        /* renamed from: a */
        final /* synthetic */ Context f11464a;

        /* renamed from: b */
        final /* synthetic */ Intent f11465b;

        /* renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2880b.this.m12983d();
            }
        }

        C2880b(Context context, Intent intent) {
            this.f11464a = context;
            this.f11465b = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m12983d() {
            FriendRequestReceivedNotificationReceiver.this.m12988a(this.f11464a, 0);
            FriendRequestReceivedNotificationReceiver.this.m12990c(this.f11464a);
        }

        /* renamed from: e */
        private void m12984e(int i10, String str) {
            Toast.makeText(this.f11464a, i10, 0).show();
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Context context = this.f11464a;
            friendRequestReceivedNotificationReceiver.m12991d(str, context, this.f11465b, "Decline", C1153m.m6738a(context), false, "FriendRequestReceived");
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            C4996b c4996b = new C4996b(c3348t);
            if (c4996b.m19447b()) {
                ((NotificationManager) this.f11464a.getSystemService("notification")).notify(0, new C0578k.e(this.f11464a, "channel_general").m2862z(C2913x.f11756e).m2849l(new RemoteViews(this.f11464a.getPackageName(), C2738a0.f10434y)).m2844g(true).m2842c());
                new Handler().postDelayed(new a(), 6000L);
                return;
            }
            int i10 = C2748c0.f10639d4;
            String str = "code_" + c4996b.f19094a + "error_" + c4996b.m19446a();
            if (c4996b.f19094a == 401) {
                i10 = C2748c0.f10700o;
                str = "unauthenticated";
            }
            m12984e(i10, str);
            m12983d();
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
            m12984e(C2748c0.f10639d4, "client_failure");
            m12983d();
        }
    }

    /* renamed from: o */
    private void m12977o(Intent intent, Context context) {
        long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
        if (longExtra == -1) {
            m12994g(context, intent);
        } else {
            C4083g.m16979d().mo16969b().m18289a(longExtra).mo14636W(new C2879a(context, intent));
        }
    }

    /* renamed from: p */
    private void m12978p(Intent intent, Context context) {
        long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
        if (longExtra == -1) {
            m12988a(context, 0);
            m12990c(context);
        } else {
            C4083g.m16979d().mo16969b().m18290b(longExtra).mo14636W(new C2880b(context, intent));
        }
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: n */
    protected Intent mo12974n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a, com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        if ("friend_request_received_accepted".equals(action)) {
            C1151k.m6714h("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
            m12995k("FriendRequestReceived", context, intent, "Accept");
            m12990c(context);
            m12988a(context, 0);
            m12977o(intent, context);
            return;
        }
        if ("friend_request_received_ignored".equals(action)) {
            m12995k("FriendRequestReceived", context, intent, "Decline");
            m12978p(intent, context);
        }
    }
}
