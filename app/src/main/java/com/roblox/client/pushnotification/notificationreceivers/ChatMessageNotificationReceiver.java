package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import p033c7.C1134c;
import p035c9.C1151k;
import p101h8.C3428b;
import p101h8.C3434h;
import p101h8.C3442p;
import p214q7.C4324a;
import p214q7.C4325b;
import p300x7.C5564f;

/* loaded from: classes.dex */
public class ChatMessageNotificationReceiver extends AbstractC2881a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$a */
    /* loaded from: classes.dex */
    public class C2878a implements C4325b.c {

        /* renamed from: a */
        final /* synthetic */ Context f11456a;

        /* renamed from: b */
        final /* synthetic */ String f11457b;

        /* renamed from: c */
        final /* synthetic */ long f11458c;

        /* renamed from: d */
        final /* synthetic */ String f11459d;

        C2878a(Context context, String str, long j10, String str2) {
            this.f11456a = context;
            this.f11457b = str;
            this.f11458c = j10;
            this.f11459d = str2;
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
            new C3434h().m15111e(this.f11456a, this.f11457b, this.f11458c, this.f11459d, equals);
        }

        @Override // p214q7.C4325b.c
        /* renamed from: b */
        public void mo12976b(String str) {
        }
    }

    /* renamed from: o */
    private void m12970o(long j10, String str) {
        C1151k.m6714h("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j10 + " ,messageId: " + str);
        C5564f.m20442b().m7100c(new C4324a(j10, str, null));
    }

    /* renamed from: p */
    private void m12971p(long j10, String str, Context context, String str2, String str3) {
        C5564f.m20442b().m7100c(new C4325b(j10, str, new C2878a(context, str2, j10, str3)));
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: l */
    protected void mo12972l(Context context, Intent intent) {
        C3442p.m15144c().m15152i(intent.getStringExtra("EXTRA_CATEGORY"));
        m12994g(context, intent);
        m12992e("clicked", context, intent, true, "ChatNewMessage");
    }

    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: m */
    protected void mo12973m(Context context, Intent intent) {
        C3442p.m15144c().m15152i(intent.getStringExtra("EXTRA_CATEGORY"));
        m12992e("dismissed", context, intent, false, "ChatNewMessage");
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
        if (intent == null || !"chat_message_replied".equals(intent.getAction())) {
            return;
        }
        C1151k.m6714h("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
        m12988a(context, (int) longExtra);
        CharSequence m15078z = C3428b.m15078z(intent);
        if (m15078z != null) {
            String stringExtra = intent.getStringExtra("EXTRA_CATEGORY");
            String stringExtra2 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
            String stringExtra3 = intent.getStringExtra("EXTRA_MESSAGE_ID");
            m12971p(longExtra, m15078z.toString(), context, stringExtra, stringExtra2);
            C3442p.m15144c().m15152i(stringExtra);
            m12970o(longExtra, stringExtra3);
            m12992e("chat message replied", context, intent, true, "ChatNewMessage");
        }
    }
}
