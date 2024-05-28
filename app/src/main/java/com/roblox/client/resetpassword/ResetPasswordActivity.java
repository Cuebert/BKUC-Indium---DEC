package com.roblox.client.resetpassword;

import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2877p0;
import com.roblox.client.RobloxWebActivity;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0046d;
import p024bc.InterfaceC1107j;

/* loaded from: classes.dex */
public class ResetPasswordActivity extends RobloxWebActivity {
    @Override // com.roblox.client.RobloxWebActivity
    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(C0046d c0046d) {
        finish();
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        intent.putExtra("USING_LOGIN_WEB_URL", true);
        intent.putExtra("URL_EXTRA", C2877p0.m12855B0());
        intent.putExtra("TITLE_EXTRA", BuildConfig.FLAVOR);
        super.onCreate(bundle);
    }
}
