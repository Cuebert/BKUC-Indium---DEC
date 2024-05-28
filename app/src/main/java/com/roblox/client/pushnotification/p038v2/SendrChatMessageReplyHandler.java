package com.roblox.client.pushnotification.p038v2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a;
import p033c7.C1134c;
import p035c9.C1151k;
import p101h8.C3428b;
import p101h8.C3434h;
import p214q7.C4324a;
import p214q7.C4325b;
import p300x7.C5564f;

/* loaded from: classes.dex */
public class SendrChatMessageReplyHandler extends AbstractC2881a {

    /* renamed from: com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler$a */
    /* loaded from: classes.dex */
    public class C2883a implements C4325b.c {

        /* renamed from: a */
        final /* synthetic */ Context f11473a;

        /* renamed from: b */
        final /* synthetic */ long f11474b;

        /* renamed from: c */
        final /* synthetic */ long f11475c;

        /* renamed from: d */
        final /* synthetic */ String f11476d;

        C2883a(Context context, long j10, long j11, String str) {
            this.f11473a = context;
            this.f11474b = j10;
            this.f11475c = j11;
            this.f11476d = str;
        }

        @Override // p214q7.C4325b.c
        /* renamed from: a */
        public void mo12975a(String str, String str2) {
            boolean equals;
            if (C1134c.m6537a().mo6620j1()) {
                equals = "moderated".equals(str);
            } else {
                equals = "Moderated".equals(str);
            }
            C3434h c3434h = new C3434h();
            Context context = this.f11473a;
            c3434h.m15111e(context, "ChatNewMessage_" + this.f11474b, this.f11475c, this.f11476d, equals);
            C1151k.m6709c("rbx.push", "Failed to send Chat Message");
        }

        @Override // p214q7.C4325b.c
        /* renamed from: b */
        public void mo12976b(String str) {
        }
    }

    /* renamed from: o */
    private void m13003o(long j10, String str) {
        C1151k.m6714h("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j10 + " ,messageId: " + str);
        C5564f.m20442b().m7100c(new C4324a(j10, str, null));
    }

    /* renamed from: p */
    private void m13004p(long j10, String str, Context context, long j11, String str2) {
        C5564f.m20442b().m7100c(new C4325b(j10, str, new C2883a(context, j11, j10, str2)));
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: n */
    protected Intent mo12974n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", intent2.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a, com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent != null && "chat_message_replied".equals(intent.getAction())) {
            C1151k.m6714h("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
            String stringExtra = intent.getStringExtra("EXTRA_MESSAGE_ID");
            long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
            String stringExtra2 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
            String stringExtra3 = intent.getStringExtra("tag");
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(stringExtra3, stringExtra.hashCode());
            }
            CharSequence m15078z = C3428b.m15078z(intent);
            if (m15078z != null) {
                m13004p(longExtra, m15078z.toString(), context, longExtra, stringExtra2);
                m13003o(longExtra, stringExtra);
                m12992e("chat message replied", context, intent, true, "ChatNewMessage");
            }
        }
    }
}
