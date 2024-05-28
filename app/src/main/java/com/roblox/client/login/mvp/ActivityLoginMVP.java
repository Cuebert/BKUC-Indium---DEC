package com.roblox.client.login.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.DialogC0152b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0839f;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2816d0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2905t;
import com.roblox.client.C2906t0;
import com.roblox.client.C2915y;
import com.roblox.client.captcha.C2754a;
import com.roblox.client.captcha.LoginCaptchaConfig;
import com.roblox.client.login.mvp.C2862a;
import com.roblox.client.resetpassword.ResetPasswordActivity;
import p010a9.ViewOnClickListenerC0060a;
import p023b9.C1078b;
import p023b9.C1079c;
import p035c9.C1151k;
import p035c9.C1156p;
import p250t7.C4736a;
import p264u8.C4870a;
import p274v6.C4987b;
import p300x7.C5563e;
import p326z7.ActivityC6019f;
import p326z7.InterfaceC6014a;

/* loaded from: classes.dex */
public class ActivityLoginMVP extends ActivityC6019f implements C2862a.m, ViewOnClickListenerC0060a.e, InterfaceC2865d, C2754a.a {

    /* renamed from: U */
    protected InterfaceC2864c f11337U;

    /* renamed from: V */
    protected DialogInterface.OnDismissListener f11338V = new DialogInterfaceOnDismissListenerC2851b();

    /* renamed from: W */
    private DialogInterface.OnDismissListener f11339W = new DialogInterfaceOnDismissListenerC2852c();

    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$a */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC2850a implements DialogInterface.OnClickListener {

        /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$a$a */
        /* loaded from: classes.dex */
        class a implements C2906t0.f {
            a() {
            }

            @Override // com.roblox.client.C2906t0.f
            /* renamed from: a */
            public void mo12734a() {
                ActivityLoginMVP.this.m12705I1("password_reset_requested");
            }
        }

        DialogInterfaceOnClickListenerC2850a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C2906t0 c2906t0 = new C2906t0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("USING_LOGIN_WEB_URL", true);
            c2906t0.m4282H1(bundle);
            c2906t0.m13208d3(new a());
            if (C2877p0.m12939o0()) {
                c2906t0.m4606m2(0, C2816d0.f11007b);
            } else {
                c2906t0.m4606m2(0, C2816d0.f11009d);
            }
            c2906t0.m13203X2(C2877p0.m12853A0());
            c2906t0.mo4608o2(ActivityLoginMVP.this.m4617y0(), "password_reset_requested");
        }
    }

    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$b */
    /* loaded from: classes.dex */
    class DialogInterfaceOnDismissListenerC2851b implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC2851b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C2862a m12702E1 = ActivityLoginMVP.this.m12702E1();
            if (m12702E1 != null) {
                m12702E1.m12785L2();
            }
        }
    }

    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$c */
    /* loaded from: classes.dex */
    class DialogInterfaceOnDismissListenerC2852c implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC2852c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C2862a m12702E1 = ActivityLoginMVP.this.m12702E1();
            if (m12702E1 != null) {
                m12702E1.m12787T2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$d */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2853d implements DialogInterface.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ Bundle f11344n;

        DialogInterfaceOnClickListenerC2853d(Bundle bundle) {
            this.f11344n = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (i10 != -2) {
                if (i10 != -1) {
                    return;
                }
                ActivityLoginMVP.this.m12713L1(this.f11344n.getString("CallContext", BuildConfig.FLAVOR));
                ActivityLoginMVP.this.m12720P1();
                return;
            }
            dialogInterface.dismiss();
            C2862a m12702E1 = ActivityLoginMVP.this.m12702E1();
            if (m12702E1 != null) {
                m12702E1.m12785L2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$e */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnShowListenerC2854e implements DialogInterface.OnShowListener {
        DialogInterfaceOnShowListenerC2854e() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            DialogC0152b dialogC0152b = (DialogC0152b) dialogInterface;
            Button m691e = dialogC0152b.m691e(-2);
            Button m691e2 = dialogC0152b.m691e(-1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 2.0f);
            m691e.setLayoutParams(layoutParams);
            m691e2.setLayoutParams(layoutParams);
            m691e.invalidate();
            m691e2.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$f */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnCancelListenerC2855f implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC2855f() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.ActivityLoginMVP$g */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2856g implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2856g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public C2862a m12702E1() {
        Fragment m4498j0 = m4617y0().m4498j0("login_window_mvp");
        if (m4498j0 instanceof C2862a) {
            return (C2862a) m4498j0;
        }
        return null;
    }

    /* renamed from: G1 */
    private void m12703G1(int i10, Intent intent) {
        C1151k.m6707a("rbx.authlogin", "Result code: " + i10);
        if (i10 == -1) {
            this.f11337U.mo12752j(intent);
        } else {
            this.f11337U.mo12746b();
        }
    }

    /* renamed from: H1 */
    private void m12704H1(int i10, int i11) {
        this.f11337U.mo12748f(i11);
        if (i10 != 20119) {
            if (i10 == 20120) {
                if (i11 == -1) {
                    C1151k.m6707a("rbx.authlogin", "SAVE: Credentials saved.");
                    return;
                } else {
                    C1151k.m6712f("rbx.authlogin", "SAVE: Canceled by user or NEVER was clicked.");
                    return;
                }
            }
            return;
        }
        if (i11 == -1) {
            C1151k.m6707a("rbx.authlogin", "SAVE: Credentials saved.");
        } else {
            C1151k.m6712f("rbx.authlogin", "SAVE: Canceled by user or NEVER was clicked. ResultCode: " + i11);
        }
        this.f11337U.mo12745a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public void m12705I1(String str) {
        Fragment m4498j0 = m4617y0().m4498j0(str);
        if (m4498j0 != null) {
            m4617y0().m4504m().mo4564n(m4498j0).mo4560i();
        }
        new DialogC0152b.a(this).m702h(C4736a.m18881c(this, C2748c0.f10665i0, new Object[0])).m711q(C4736a.m18881c(this, C2748c0.f10519G2, new Object[0]), new DialogInterfaceOnClickListenerC2856g()).m707m(new DialogInterfaceOnCancelListenerC2855f()).m698d(true).m695a().show();
    }

    /* renamed from: J1 */
    private void m12706J1(boolean z10, String str, String str2) {
        C1151k.m6712f("rbx.authlogin", "onCaptchaCallback: success => " + z10);
        this.f11337U.mo12747d(z10, str, str2);
    }

    @Override // com.roblox.client.login.mvp.C2862a.m
    /* renamed from: A */
    public void mo12707A(String str, String str2) {
        C1151k.m6712f("rbx.authlogin", "onLoginClicked:");
        this.f11337U.mo12751i(str, str2);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: C */
    public void mo12708C(int i10) {
        C1151k.m6712f("rbx.authlogin", "showInvalidCredentialsAlert:");
        m12672Y0(C4736a.m18881c(this, i10, new Object[0]), this.f11338V);
    }

    /* renamed from: D1 */
    public LoginPresenter m12709D1() {
        return new LoginPresenter(this, C5563e.m20379h(), new C2868g(new C2867f(C1079c.m6380c(), C1078b.m6375c(), C1156p.m6745e(getApplicationContext()))), mo583f(), new C4870a(this, new C4987b()));
    }

    /* renamed from: F1 */
    protected void m12710F1(int i10) {
        setResult(i10);
        finish();
        overridePendingTransition(0, C2905t.f11657a);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: I */
    public void mo12711I(int i10) {
        m12671X0(C4736a.m18881c(this, i10, new Object[0]));
    }

    /* renamed from: K1 */
    protected void m12712K1() {
        C1151k.m6712f("rbx.authlogin", "onResetPasswordClosed.");
        this.f11337U.mo12754l();
        C2862a m12702E1 = m12702E1();
        if (m12702E1 != null) {
            m12702E1.m12785L2();
        }
    }

    /* renamed from: L1 */
    protected void m12713L1(String str) {
        String str2;
        if (str.equals("WrongCredentialsForgotPassword")) {
            str2 = "Android-AppLogin-ForgotPassword-Pressed";
        } else {
            str2 = str.equals("FloodcheckedResetPassword") ? "Android-AppLogin-ResetPassword-Pressed" : null;
        }
        if (str2 != null) {
            C5563e.m20379h().m20388A(str2);
        }
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: M */
    public void mo12259M() {
    }

    @Override // p326z7.InterfaceC6015b
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public void mo12727h0(InterfaceC2864c interfaceC2864c) {
        this.f11337U = interfaceC2864c;
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: N */
    public void mo12715N(int i10) {
        C1151k.m6712f("rbx.authlogin", "finishViewWithResult: resultCode = " + i10);
        m12710F1(i10);
    }

    /* renamed from: N1 */
    protected void m12716N1(Bundle bundle) {
        if (isDestroyed()) {
            return;
        }
        DialogInterfaceOnClickListenerC2853d dialogInterfaceOnClickListenerC2853d = new DialogInterfaceOnClickListenerC2853d(bundle);
        DialogC0152b m695a = new DialogC0152b.a(this).m714t(C4736a.m18881c(this, bundle.getInt("DialogTitle"), new Object[0])).m702h(C4736a.m18881c(this, bundle.getInt("DialogMessage"), new Object[0])).m711q(C4736a.m18881c(this, bundle.getInt("PositiveButton"), new Object[0]), dialogInterfaceOnClickListenerC2853d).m704j(C4736a.m18881c(this, bundle.getInt("NegativeButton"), new Object[0]), dialogInterfaceOnClickListenerC2853d).m698d(false).m695a();
        m695a.setOnShowListener(new DialogInterfaceOnShowListenerC2854e());
        m695a.show();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: O */
    public void mo12717O(String str, String str2, String str3) {
        C1151k.m6712f("rbx.authlogin", "showTwoStepVerificationUI: username = " + str3);
        m12721Q1(str, str2, str3);
    }

    /* renamed from: O1 */
    protected void m12718O1() {
        C2862a m12702E1 = m12702E1();
        if (m12702E1 == null) {
            C1151k.m6712f("rbx.authlogin", "Create a new FragmentLoginMVP...");
            m12702E1 = C2862a.m12780P2();
        }
        m4617y0().m4504m().m4754p(C2915y.f11790D0, m12702E1, "login_window_mvp").mo4559h();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: P */
    public void mo12719P(int i10) {
        m12672Y0(C4736a.m18881c(this, i10, new Object[0]), this.f11339W);
    }

    /* renamed from: P1 */
    protected void m12720P1() {
        C1151k.m6712f("rbx.authlogin", "showResetPassword:");
        C2822f0.m12481c("login", "forgot_password");
        startActivityForResult(new Intent(this, (Class<?>) ResetPasswordActivity.class), 20113);
    }

    /* renamed from: Q1 */
    protected void m12721Q1(String str, String str2, String str3) {
        m4617y0().m4504m().m4755q(C2905t.f11658b, 0, 0, C2905t.f11657a).m4754p(C2915y.f11790D0, ViewOnClickListenerC0060a.m260B2(str, str2, str3), "Fragment2SV").m4751g(null).mo4559h();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: V */
    public void mo12722V(String str) {
        C2862a m12702E1 = m12702E1();
        if (m12702E1 != null) {
            m12702E1.m12789V2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.roblox.client.login.mvp.C2862a.m
    /* renamed from: b0 */
    public void mo12723b0() {
        C1151k.m6712f("rbx.authlogin", "onForgotPasswordClicked:");
        m12720P1();
    }

    @Override // com.roblox.client.login.mvp.C2862a.m
    /* renamed from: c */
    public void mo12724c() {
        C1151k.m6712f("rbx.authlogin", "onCancelClicked:");
        C2822f0.m12481c("login", "close");
        m12710F1(0);
    }

    @Override // com.roblox.client.login.mvp.C2862a.m
    /* renamed from: c0 */
    public void mo12725c0() {
        C1151k.m6712f("rbx.authlogin", "onSignUpClicked:");
        C2822f0.m12481c("login", "signup");
        m12710F1(105);
    }

    @Override // com.roblox.client.captcha.C2754a.a
    public void dismiss() {
        if (isFinishing()) {
            return;
        }
        m12706J1(false, null, null);
    }

    @Override // p010a9.ViewOnClickListenerC0060a.e
    /* renamed from: e */
    public void mo276e(long j10) {
        C1151k.m6712f("rbx.authlogin", "onCodeVerified: userId => " + j10);
        this.f11337U.mo12750h(j10);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: g */
    public void mo12726g() {
        if (isDestroyed()) {
            return;
        }
        C1151k.m6712f("rbx.authlogin", "showPasswordResetRequestedAlert:");
        new DialogC0152b.a(this).m702h(C4736a.m18881c(this, C2748c0.f10671j0, new Object[0])).m711q(C4736a.m18881c(this, C2748c0.f10519G2, new Object[0]), new DialogInterfaceOnClickListenerC2850a()).m698d(false).m695a().show();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: j0 */
    public void mo12728j0(LoginCaptchaConfig loginCaptchaConfig) {
        if (AbstractC0839f.c.RESUMED == mo583f().mo4890b()) {
            C1151k.m6712f("rbx.authlogin", "showCaptchaUI: config = " + loginCaptchaConfig);
            m4617y0().m4504m().m4747c(C2915y.f11787C0, C2754a.m12268k3(loginCaptchaConfig), "FragmentFunCaptcha").m4751g(null).mo4559h();
            return;
        }
        mo12733w();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: k0 */
    public void mo12729k0(String str, String str2) {
        C2862a m12702E1 = m12702E1();
        if (m12702E1 != null) {
            m12702E1.m12788U2(str, str2);
        }
    }

    @Override // com.roblox.client.captcha.C2754a.a
    /* renamed from: l0 */
    public void mo12261l0(String str, String str2) {
        m4617y0().m4476W0();
        m12706J1(true, str, str2);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: m */
    public void mo12730m(Bundle bundle) {
        C1151k.m6712f("rbx.authlogin", "showForgotPasswordAlert:");
        m12716N1(bundle);
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        C1151k.m6712f("rbx.authlogin", "onActivityResult: resultCode = " + i11);
        if (i10 != 20113) {
            switch (i10) {
                case 20119:
                case 20120:
                    m12704H1(i10, i11);
                    return;
                case 20121:
                    m12703G1(i11, intent);
                    return;
                default:
                    return;
            }
        }
        m12712K1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m4617y0().m4506n0() > 0) {
            super.onBackPressed();
        } else {
            C2822f0.m12481c("login", "close");
            m12710F1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326z7.ActivityC6019f, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1151k.m6712f("rbx.authlogin", "onCreate:");
        setContentView(C2738a0.f10413d);
        m12718O1();
        this.f11337U = m12709D1();
    }

    @Override // com.roblox.client.login.mvp.C2862a.m
    /* renamed from: t */
    public void mo12731t() {
        this.f11337U.mo12749g(this);
    }

    @Override // p326z7.InterfaceC6015b
    /* renamed from: u */
    public void mo12732u(InterfaceC6014a interfaceC6014a) {
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2865d
    /* renamed from: w */
    public void mo12733w() {
        C2862a m12702E1 = m12702E1();
        if (m12702E1 != null) {
            m12702E1.m12790W2();
        }
    }
}
