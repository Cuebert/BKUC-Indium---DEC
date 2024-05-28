package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class FriendRequestAcceptedNotificationReceiver extends AbstractC2881a {
    @Override // com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a
    /* renamed from: n */
    protected Intent mo12974n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }
}
