package com.roblox.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p276v8.C4992b;

/* loaded from: classes.dex */
public class ShareAppChosenReceiver extends C2843l0 {
    @Override // com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("android.intent.extra.CHOSEN_COMPONENT");
            if (obj instanceof ComponentName) {
                C4992b.m19442b(((ComponentName) obj).getPackageName());
            }
        }
    }
}
