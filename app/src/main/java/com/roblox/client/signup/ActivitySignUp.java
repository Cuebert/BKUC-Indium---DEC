package com.roblox.client.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2905t;
import com.roblox.client.C2915y;
import com.roblox.client.captcha.C2754a;
import com.roblox.client.captcha.SignUpCaptchaConfig;
import com.roblox.client.signup.C2897a;
import p035c9.C1151k;
import p264u8.C4870a;
import p274v6.C4987b;
import p274v6.C4989d;
import p274v6.InterfaceC4986a;

/* loaded from: classes.dex */
public class ActivitySignUp extends AbstractActivityC2837i0 implements C2897a.x, C2754a.a {

    /* renamed from: S */
    InterfaceC4986a f11514S;

    /* renamed from: com.roblox.client.signup.ActivitySignUp$a */
    /* loaded from: classes.dex */
    class C2895a implements InterfaceC4986a.a {
        C2895a() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: a */
        public void mo12238a() {
            ActivitySignUp.this.m13052B1(102);
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: b */
        public void mo12239b() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: c */
        public void mo12240c() {
            ActivitySignUp.this.m13052B1(102);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public void m13052B1(int i10) {
        if (i10 == 0) {
            C2822f0.m12481c("signup", "close");
        }
        setResult(i10);
        finish();
        overridePendingTransition(0, C2905t.f11657a);
    }

    /* renamed from: C1 */
    private Fragment m13053C1() {
        return m4617y0().m4498j0("signup_window");
    }

    /* renamed from: D1 */
    private void m13054D1(int i10) {
        if (i10 == -1) {
            C1151k.m6707a("ActivitySignUp", "SAVE: Credentials saved.");
            this.f11514S.mo19073a();
        } else {
            C1151k.m6712f("ActivitySignUp", "SAVE: Canceled by user or NEVER was clicked. ResultCode: " + i10);
            this.f11514S.mo19077e();
        }
        m13052B1(102);
    }

    /* renamed from: E1 */
    private void m13055E1() {
        this.f11514S = new C4870a(this, new C4987b());
    }

    /* renamed from: F1 */
    private void m13056F1(String str, String str2) {
        Fragment m13053C1 = m13053C1();
        if (m13053C1 != null) {
            ((C2897a) m13053C1).m13127B3(false, str, str2);
        }
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: M */
    public void mo12259M() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.roblox.client.signup.C2897a.x
    /* renamed from: c */
    public void mo13057c() {
        m13052B1(0);
    }

    @Override // com.roblox.client.captcha.C2754a.a
    public void dismiss() {
        Fragment m13053C1;
        if (isFinishing() || (m13053C1 = m13053C1()) == null) {
            return;
        }
        ((C2897a) m13053C1).m13131L3();
    }

    @Override // com.roblox.client.signup.C2897a.x
    /* renamed from: i */
    public void mo13058i(String str, String str2) {
        this.f11514S.mo19078f(this, 20122, new C4989d(str, str2), new C2895a());
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: l0 */
    public void mo12261l0(String str, String str2) {
        C1151k.m6707a("ActivitySignUp", "Invisible captcha success. Sign up again.");
        m4617y0().m4476W0();
        m13056F1(str, str2);
    }

    @Override // com.roblox.client.signup.C2897a.x
    /* renamed from: m0 */
    public void mo13059m0() {
        C1151k.m6707a("ActivitySignUp", "Try invisible captcha.");
        m4617y0().m4504m().m4747c(C2915y.f11866h1, C2754a.m12268k3(new SignUpCaptchaConfig()), "FragmentFunCaptcha").m4751g(null).mo4559h();
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        C1151k.m6712f("ActivitySignUp", "onActivityResult: resultCode = " + i11);
        if (i10 != 20122) {
            return;
        }
        m13054D1(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2738a0.f10415f);
        C2897a c2897a = (C2897a) m4617y0().m4498j0("signup_window");
        if (c2897a == null) {
            m4617y0().m4504m().m4747c(C2915y.f11869i1, C2897a.m13125z3(), "signup_window").mo4559h();
        } else {
            C1151k.m6712f("ActivitySignUp", "FragmentSignUp not null. isAdded=" + c2897a.m4342g0() + ". isVisible=" + c2897a.m4370r0() + ".");
        }
        m13055E1();
    }

    @Override // com.roblox.client.signup.C2897a.x
    /* renamed from: r */
    public void mo13060r() {
        m13052B1(103);
    }
}
