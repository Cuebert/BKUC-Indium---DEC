package com.roblox.client.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.roblox.client.C2843l0;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p008a7.C0057o;
import p024bc.C1100c;
import p033c7.C1134c;
import p035c9.C1151k;

/* loaded from: classes.dex */
public class SMSBroadcastReceiver extends C2843l0 {

    /* renamed from: a */
    final Pattern f11641a = Pattern.compile("(\\d{6})");

    @Override // com.roblox.client.C2843l0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            C1151k.m6712f("SMSBroadcastReceiver", "Status: " + status);
            int m7415y = status.m7415y();
            if (m7415y != 0) {
                if (m7415y != 15) {
                    return;
                }
                C1151k.m6712f("SMSBroadcastReceiver", "Timeout");
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            C1151k.m6712f("SMSBroadcastReceiver", "Message: " + str);
            if (!TextUtils.isEmpty(str) && (NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetSMSOTPTemp") || C1134c.m6537a().mo6549F() || str.startsWith("<#>"))) {
                Matcher matcher = this.f11641a.matcher(str);
                if (matcher.find()) {
                    String group = matcher.group(0);
                    if (TextUtils.isEmpty(group) || group.length() != 6) {
                        return;
                    }
                    C1151k.m6712f("SMSBroadcastReceiver", "code: " + group);
                    C1100c.m6458d().m6469j(new C0057o(group));
                    return;
                }
                return;
            }
            C1151k.m6712f("SMSBroadcastReceiver", "Wrong format. Message: " + str);
        }
    }
}
