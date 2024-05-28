package com.roblox.client.implementation;

import android.content.Context;
import android.content.Intent;
import na.AbstractC4089d;
import na.C4092g;
import p009a8.InterfaceC0059a;
import p022b8.InterfaceC1076a;
import p030c4.C1128a;
import p035c9.C1151k;
import p131ja.C3678e;
import p165m7.InterfaceC3959a;
import p201p6.C4273a;
import p213q6.C4323c;
import p213q6.InterfaceC4321a;
import p213q6.InterfaceC4322b;
import p240s8.InterfaceC4538a;
import p288w8.InterfaceC5479n;
import p300x7.C5561c;
import p315y9.C5924i;

/* loaded from: classes.dex */
public class AppImplementations implements InterfaceC4538a, InterfaceC5479n, InterfaceC1076a, InterfaceC3959a, InterfaceC0059a, InterfaceC4322b, C1128a.a {
    private static final String TAG = "AppImplementations";

    @Override // p240s8.InterfaceC4538a
    public C5561c getAppsFlyerManager() {
        return C4273a.m17694p();
    }

    @Override // p165m7.InterfaceC3959a
    public C3678e getIdentityProtocol() {
        return C3678e.m15631w();
    }

    @Override // p009a8.InterfaceC0059a
    public C5924i getNativeUtilProtocol() {
        return C5924i.m21048O();
    }

    @Override // p022b8.InterfaceC1076a
    public AbstractC4089d getPermissionsProtocol() {
        return C4092g.m17032C();
    }

    @Override // p213q6.InterfaceC4322b
    public InterfaceC4321a getRtcAudioManager(Context context) {
        return new C4323c(context);
    }

    @Override // p288w8.InterfaceC5479n
    public void installSecurityProviderIfNeeded(Context context) {
        C1128a.m6520b(context, this);
    }

    @Override // p030c4.C1128a.a
    public void onProviderInstallFailed(int i10, Intent intent) {
        C1151k.m6709c(TAG, "Android Security Provider could not be updated or installed. Please install or update Google Play Services.");
    }

    @Override // p030c4.C1128a.a
    public void onProviderInstalled() {
    }
}
