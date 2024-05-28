package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class PrivateMessageReceivedNotificationReceiver extends AbstractC2881a {
    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: n */
    protected Intent mo12974n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "PrivateMessageReceived");
        if (!intent2.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            intent.putExtra("EXTRA_CONVERSATION_ID", intent2.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        }
        return intent;
    }
}
