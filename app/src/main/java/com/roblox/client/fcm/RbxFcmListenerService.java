package com.roblox.client.fcm;

import android.content.Intent;
import androidx.core.app.C0581n;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import p033c7.C1134c;
import p035c9.C1151k;
import p101h8.C3439m;
import p101h8.C3445s;
import p129j8.EnumC3668k;
import p142k8.C3762a;
import p144ka.C3769a;
import p239s7.C4531b;
import p288w8.C5469d;
import p300x7.C5560b;

/* loaded from: classes.dex */
public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3769a.m16020c(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        C5560b.m20357e().m20366k(getApplicationContext(), C5560b.d.APP_INIT_TYPE_SHELL);
        Map<String, String> m12037x = remoteMessage.m12037x();
        C5469d.m20108l(this);
        String str = m12037x.get("version");
        C1151k.m6712f("rbx.push", "RGLS.onMessageReceived() NotificationVersion: " + str);
        C4531b.m18550f().m18570u(this);
        if (!C1134c.m6537a().mo6560K0() || C0581n.m2959b(this).m2963a()) {
            if (str != null) {
                new C3762a().m15992d(this, m12037x);
                return;
            }
            String str2 = m12037x.get("message");
            C1151k.m6712f("rbx.push", "RGLS.onMessageReceived() Message: " + str2);
            new C3445s().m15165e(this, str2);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        C1151k.m6712f("rbx.push", "Token refresh triggered.");
        if (C3439m.m15122c().m15127f(this) == EnumC3668k.FIREBASE_CLOUD_MESSAGING) {
            RegistrationIntentService.m12504i(this, new Intent(this, (Class<?>) RegistrationIntentService.class));
        }
    }
}
