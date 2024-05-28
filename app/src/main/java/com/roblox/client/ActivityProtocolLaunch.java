package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import la.C3905c;
import p033c7.C1134c;
import p035c9.C1151k;
import p288w8.C5469d;
import p288w8.EnumC5480o;

/* loaded from: classes.dex */
public class ActivityProtocolLaunch extends AbstractActivityC2837i0 {
    /* renamed from: A1 */
    protected void m12181A1() {
        startActivity(C2872n.m12830h().m12838i(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (C5469d.m20104h()) {
            C1151k.m6712f("rbx.externallaunch", "onCreate() activity on existing stack - checking to launch data");
            m12181A1();
            C3905c.m16561r().m16562e(intent.getDataString());
            C2872n.m12830h().m12836f().m13866g(false);
        } else {
            C1151k.m6712f("rbx.externallaunch", "onCreate() activity is root - starting splash (regular start-up flow)");
            String dataString = intent.getDataString();
            JNIBaseUrlProtocol.maybeHandleColdStartProtocolLaunch(dataString);
            if (C1134c.m6537a().mo6607f0()) {
                JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(dataString);
            }
            startActivity(ActivitySplash.m13160C1(this, EnumC5480o.PROTOCOL_LAUNCH));
            C3905c.m16561r().m16569q(intent);
            C2872n.m12830h().m12834d().m20369h(intent);
        }
        finish();
    }
}
