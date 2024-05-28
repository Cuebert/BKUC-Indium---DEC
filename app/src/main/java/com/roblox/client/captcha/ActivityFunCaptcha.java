package com.roblox.client.captcha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2911w;
import com.roblox.client.C2915y;
import com.roblox.client.captcha.C2754a;

/* loaded from: classes.dex */
public class ActivityFunCaptcha extends AbstractActivityC2837i0 implements C2754a.a {
    /* renamed from: A1 */
    public static Intent m12257A1(Context context, CaptchaConfig captchaConfig) {
        Intent intent = new Intent(context, (Class<?>) ActivityFunCaptcha.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfigKey", captchaConfig);
        intent.putExtra("captchaConfigKey", bundle);
        return intent;
    }

    /* renamed from: B1 */
    private void m12258B1(int i10) {
        setResult(i10);
        finish();
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: M */
    public void mo12259M() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0
    /* renamed from: S0 */
    public void mo12260S0() {
    }

    @Override // com.roblox.client.captcha.C2754a.a
    public void dismiss() {
        m12258B1(102);
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: l0 */
    public void mo12261l0(String str, String str2) {
        m12258B1(101);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m12258B1(102);
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2738a0.f10410a);
        CaptchaConfig captchaConfig = (CaptchaConfig) getIntent().getBundleExtra("captchaConfigKey").getParcelable("captchaConfigKey");
        float f10 = getResources().getDisplayMetrics().widthPixels;
        int applyDimension = (int) TypedValue.applyDimension(1, getResources().getDimension(C2911w.f11721a), getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 330.0f, getResources().getDisplayMetrics());
        if (f10 < applyDimension) {
            applyDimension = (int) f10;
        }
        getWindow().setLayout(applyDimension, applyDimension2);
        FragmentManager m4617y0 = m4617y0();
        if (m4617y0.m4498j0("FragmentFunCaptcha") == null) {
            m4617y0.m4504m().m4747c(C2915y.f11864h, C2754a.m12268k3(captchaConfig), "FragmentFunCaptcha").mo4559h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
