package com.roblox.client.fcm;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.C0581n;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p101h8.InterfaceC3440n;
import p129j8.EnumC3668k;

/* renamed from: com.roblox.client.fcm.a */
/* loaded from: classes.dex */
public class C2825a implements InterfaceC3440n {
    @Override // p101h8.InterfaceC3440n
    /* renamed from: a */
    public EnumC3668k mo12506a() {
        return EnumC3668k.FIREBASE_CLOUD_MESSAGING;
    }

    @Override // p101h8.InterfaceC3440n
    /* renamed from: b */
    public String mo12507b() {
        return "GcmPlatform";
    }

    @Override // p101h8.InterfaceC3440n
    /* renamed from: c */
    public String mo12508c() {
        return "GcmToken";
    }

    @Override // p101h8.InterfaceC3440n
    /* renamed from: d */
    public void mo12509d(Context context, boolean z10) {
        m12511f(context, z10, m12510e(context));
    }

    /* renamed from: e */
    public boolean m12510e(Context context) {
        return C1152l.m6731b(context);
    }

    /* renamed from: f */
    void m12511f(Context context, boolean z10, boolean z11) {
        if (z11 && C1134c.m6537a().mo6642r() && Build.VERSION.SDK_INT >= 33 && !C0581n.m2959b(context).m2963a()) {
            C1151k.m6712f("rbx.push", "New token but notifications disabled. Not registering.");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) RegistrationIntentService.class);
        intent.putExtra("AuthorizePushNotificationsForUser", z10);
        RegistrationIntentService.m12504i(context, intent);
    }
}
