package com.roblox.client;

import android.content.Context;
import android.content.Intent;
import p035c9.C1151k;
import p076f9.C3213g;
import p325z6.AsyncTaskC6013a;

/* loaded from: classes.dex */
public class XAPKUpdateReceiver extends C2843l0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m12222b(int i10) {
        C1151k.m6712f("rbx.xapkmanager", String.format("Assets have been updated with status code %d", Integer.valueOf(i10)));
    }

    @Override // com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        C1151k.m6712f("rbx.xapkmanager", "Unpack after update is enabled.");
        String action = intent.getAction();
        if (action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
            C1151k.m6712f("rbx.xapkmanager", "Roblox app has been updated");
            C3213g.m14269i().m14283p(context);
            AsyncTaskC6013a.m21329b(new AsyncTaskC6013a.a() { // from class: com.roblox.client.e1
                @Override // p325z6.AsyncTaskC6013a.a
                /* renamed from: a */
                public final void mo12478a(int i10) {
                    XAPKUpdateReceiver.m12222b(i10);
                }
            }).mo12448a();
            return;
        }
        C1151k.m6709c("rbx.xapkmanager", String.format("Unauthorized intent action %s has triggered APK updater receiver", action));
    }
}
