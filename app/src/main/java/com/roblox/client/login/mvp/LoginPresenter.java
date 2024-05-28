package com.roblox.client.login.mvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import com.roblox.client.C2748c0;
import com.roblox.client.captcha.LoginCaptchaConfig;
import java.lang.ref.WeakReference;
import p035c9.C1151k;
import p274v6.C4989d;
import p274v6.InterfaceC4986a;
import p300x7.C5563e;
import p326z7.C6016c;
import p326z7.InterfaceC6014a;
import p326z7.InterfaceC6021h;

/* loaded from: classes.dex */
public class LoginPresenter implements InterfaceC2864c, InterfaceC6014a, InterfaceC0844k {

    /* renamed from: v */
    private static final InterfaceC2865d f11349v = new C2857a();

    /* renamed from: n */
    private WeakReference<InterfaceC2865d> f11350n;

    /* renamed from: o */
    protected InterfaceC2863b f11351o;

    /* renamed from: p */
    private AbstractC0839f f11352p;

    /* renamed from: q */
    private C5563e f11353q;

    /* renamed from: r */
    private InterfaceC4986a f11354r;

    /* renamed from: s */
    private boolean f11355s;

    /* renamed from: t */
    private boolean f11356t;

    /* renamed from: u */
    private final InterfaceC2869h f11357u = new C2861e();

    /* renamed from: com.roblox.client.login.mvp.LoginPresenter$a */
    /* loaded from: classes.dex */
    class C2857a implements InterfaceC2865d {
        C2857a() {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: C */
        public void mo12708C(int i10) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: I */
        public void mo12711I(int i10) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: N */
        public void mo12715N(int i10) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: O */
        public void mo12717O(String str, String str2, String str3) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: P */
        public void mo12719P(int i10) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: V */
        public void mo12722V(String str) {
        }

        @Override // p326z7.InterfaceC6015b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12727h0(InterfaceC2864c interfaceC2864c) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: g */
        public void mo12726g() {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: j0 */
        public void mo12728j0(LoginCaptchaConfig loginCaptchaConfig) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: k0 */
        public void mo12729k0(String str, String str2) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: m */
        public void mo12730m(Bundle bundle) {
        }

        @Override // p326z7.InterfaceC6015b
        /* renamed from: u */
        public void mo12732u(InterfaceC6014a interfaceC6014a) {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2865d
        /* renamed from: w */
        public void mo12733w() {
        }
    }

    /* renamed from: com.roblox.client.login.mvp.LoginPresenter$b */
    /* loaded from: classes.dex */
    class C2858b implements InterfaceC4986a.b {
        C2858b() {
        }

        @Override // p274v6.InterfaceC4986a.b
        /* renamed from: a */
        public void mo12237a(C4989d c4989d) {
            LoginPresenter.this.m12744z(c4989d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.LoginPresenter$c */
    /* loaded from: classes.dex */
    public class C2859c implements InterfaceC4986a.a {
        C2859c() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: a */
        public void mo12238a() {
            LoginPresenter.this.m12758w();
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: b */
        public void mo12239b() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: c */
        public void mo12240c() {
            LoginPresenter.this.m12758w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.login.mvp.LoginPresenter$d */
    /* loaded from: classes.dex */
    public class C2860d implements InterfaceC4986a.a {
        C2860d() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: a */
        public void mo12238a() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: b */
        public void mo12239b() {
        }

        @Override // p274v6.InterfaceC4986a.a
        /* renamed from: c */
        public void mo12240c() {
        }
    }

    /* renamed from: com.roblox.client.login.mvp.LoginPresenter$e */
    /* loaded from: classes.dex */
    class C2861e implements InterfaceC2869h {
        C2861e() {
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: a */
        public void mo12761a(C2866e c2866e) {
            C1151k.m6712f("rbx.authlogin", "onLoginFailure: errorCode=" + c2866e.f11392c + ".");
            LoginPresenter.this.m12755s(c2866e);
            int i10 = c2866e.f11392c;
            if (i10 != -2021) {
                LoginPresenter.this.m12757v().mo12733w();
            }
            switch (i10) {
                case -2023:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10546M);
                    return;
                case -2022:
                    return;
                case -2021:
                    LoginPresenter.this.m12735A();
                    return;
                case -2020:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10601X);
                    return;
                case -2019:
                default:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10728s3);
                    return;
                case -2018:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10629c0);
                    return;
                case -2017:
                    LoginPresenter.this.f11355s = true;
                    int i11 = C2748c0.f10541L;
                    if ("Email".equals(LoginPresenter.this.f11351o.mo12793c())) {
                        i11 = C2748c0.f10635d0;
                    } else if ("PhoneNumber".equals(LoginPresenter.this.f11351o.mo12793c())) {
                        i11 = C2748c0.f10641e0;
                    }
                    LoginPresenter.this.m12757v().mo12719P(i11);
                    return;
                case -2016:
                    LoginPresenter.this.f11355s = true;
                    int i12 = C2748c0.f10541L;
                    if ("Email".equals(LoginPresenter.this.f11351o.mo12793c())) {
                        i12 = C2748c0.f10576S;
                    }
                    LoginPresenter.this.m12757v().mo12719P(i12);
                    return;
                case -2015:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10536K);
                    return;
                case -2014:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10566Q);
                    return;
                case -2013:
                    int i13 = C2748c0.f10561P;
                    if ("Email".equals(LoginPresenter.this.f11351o.mo12793c())) {
                        i13 = C2748c0.f10551N;
                    } else if ("PhoneNumber".equals(LoginPresenter.this.f11351o.mo12793c())) {
                        i13 = C2748c0.f10556O;
                    }
                    LoginPresenter.this.f11354r.mo19076d(LoginPresenter.this.m12742u());
                    LoginPresenter.this.m12757v().mo12708C(i13);
                    return;
                case -2012:
                    LoginPresenter.this.f11355s = true;
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10541L);
                    return;
                case -2011:
                    LoginPresenter.this.m12757v().mo12711I(C2748c0.f10571R);
                    return;
            }
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: b */
        public void mo12762b(String str, String str2, String str3) {
            LoginPresenter.this.m12757v().mo12733w();
            LoginPresenter.this.m12757v().mo12717O(str, str2, str3);
            LoginPresenter.this.m12759y();
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: c */
        public void mo12763c() {
            C1151k.m6712f("rbx.authlogin", "onFloodCheck.");
            LoginPresenter.this.m12757v().mo12733w();
            Bundle bundle = new Bundle();
            bundle.putInt("DialogTitle", C2748c0.f10734t3);
            bundle.putInt("PositiveButton", C2748c0.f10659h0);
            bundle.putInt("NegativeButton", C2748c0.f10519G2);
            bundle.putInt("DialogMessage", C2748c0.f10606Y);
            bundle.putString("CallContext", "FloodcheckedResetPassword");
            LoginPresenter.this.m12757v().mo12730m(bundle);
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: d */
        public void mo12764d() {
            LoginPresenter.this.m12743x();
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: e */
        public void mo12765e() {
            C1151k.m6712f("rbx.authlogin", "onPasswordResetRequested: ");
            LoginPresenter.this.m12757v().mo12733w();
            LoginPresenter.this.m12757v().mo12726g();
        }

        @Override // com.roblox.client.login.mvp.InterfaceC2869h
        /* renamed from: f */
        public void mo12766f() {
            C1151k.m6712f("rbx.authlogin", "onTooManyFailedCredentials.");
            LoginPresenter.this.m12757v().mo12733w();
            Bundle bundle = new Bundle();
            bundle.putInt("DialogTitle", C2748c0.f10591V);
            bundle.putInt("PositiveButton", C2748c0.f10748w);
            bundle.putInt("NegativeButton", C2748c0.f10519G2);
            int i10 = C2748c0.f10623b0;
            String mo12793c = LoginPresenter.this.f11351o.mo12793c();
            if ("PhoneNumber".equals(mo12793c)) {
                i10 = C2748c0.f10617a0;
            } else if ("Email".equals(mo12793c)) {
                i10 = C2748c0.f10611Z;
            }
            bundle.putInt("DialogMessage", i10);
            bundle.putString("CallContext", "WrongCredentialsForgotPassword");
            LoginPresenter.this.m12757v().mo12730m(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginPresenter(InterfaceC2865d interfaceC2865d, C5563e c5563e, InterfaceC2863b interfaceC2863b, AbstractC0839f abstractC0839f, InterfaceC4986a interfaceC4986a) {
        this.f11350n = new WeakReference<>(interfaceC2865d);
        this.f11351o = interfaceC2863b;
        this.f11352p = abstractC0839f;
        this.f11353q = c5563e;
        this.f11354r = interfaceC4986a;
        abstractC0839f.mo4889a(this);
        m12757v().mo12727h0(this);
        m12757v().mo12732u(this);
        this.f11355s = false;
        this.f11356t = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m12735A() {
        char c10;
        LoginCaptchaConfig.EnumC2752c enumC2752c;
        String mo12793c = this.f11351o.mo12793c();
        int hashCode = mo12793c.hashCode();
        if (hashCode == -201069322) {
            if (mo12793c.equals("Username")) {
                c10 = 2;
            }
            c10 = 65535;
        } else if (hashCode != 67066748) {
            if (hashCode == 474898999 && mo12793c.equals("PhoneNumber")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (mo12793c.equals("Email")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            enumC2752c = LoginCaptchaConfig.EnumC2752c.EMAIL;
        } else if (c10 != 1) {
            enumC2752c = LoginCaptchaConfig.EnumC2752c.USERNAME;
        } else {
            enumC2752c = LoginCaptchaConfig.EnumC2752c.PHONE_NUMBER;
        }
        m12757v().mo12728j0(new LoginCaptchaConfig(enumC2752c, this.f11351o.mo12792b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public C4989d m12742u() {
        return new C4989d(this.f11351o.mo12792b(), this.f11351o.mo12795e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m12743x() {
        this.f11354r.mo19078f((Activity) m12757v(), 20119, m12742u(), new C2859c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m12744z(C4989d c4989d) {
        String str = c4989d.f19079a;
        String str2 = c4989d.f19080b;
        this.f11351o.mo12797g(m12756t(str), str, str2);
        m12757v().mo12729k0(str, str2);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: a */
    public void mo12745a() {
        this.f11354r.mo19073a();
        m12758w();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: b */
    public void mo12746b() {
        this.f11354r.mo19074b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    public void cleanup() {
        this.f11352p.mo4891c(this);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: d */
    public void mo12747d(boolean z10, String str, String str2) {
        if (z10) {
            this.f11356t = true;
            InterfaceC2863b interfaceC2863b = this.f11351o;
            interfaceC2863b.mo12796f(interfaceC2863b.mo12792b(), this.f11351o.mo12793c(), this.f11351o.mo12795e(), str, str2, this.f11357u);
            return;
        }
        m12757v().mo12733w();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: f */
    public void mo12748f(int i10) {
        if (i10 == -1) {
            this.f11354r.mo19073a();
        } else {
            this.f11354r.mo19077e();
        }
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: g */
    public void mo12749g(Activity activity) {
        this.f11354r.mo19075c(activity, 20121, new C2858b());
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: h */
    public void mo12750h(long j10) {
        C1151k.m6712f("rbx.authlogin", "on2SVCodeVerified: userId => " + j10);
        this.f11351o.mo12791a();
        m12758w();
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: i */
    public void mo12751i(String str, String str2) {
        this.f11351o.mo12796f(str, m12756t(str), str2, null, null, this.f11357u);
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: j */
    public void mo12752j(Intent intent) {
        this.f11354r.mo19080h();
        m12744z(this.f11354r.mo19079g(intent));
    }

    @Override // p326z7.InterfaceC6014a
    /* renamed from: k */
    public void mo12753k(InterfaceC6021h interfaceC6021h, C6016c c6016c) {
    }

    @Override // com.roblox.client.login.mvp.InterfaceC2864c
    /* renamed from: l */
    public void mo12754l() {
        this.f11351o.mo12794d();
    }

    /* renamed from: s */
    protected void m12755s(C2866e c2866e) {
        this.f11353q.m20418c(c2866e.f11390a, c2866e.f11391b, c2866e.f11393d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0853t(AbstractC0839f.b.ON_RESUME)
    public void setStoreCredentialValue() {
        m12757v().mo12722V(this.f11351o.mo12792b());
    }

    /* renamed from: t */
    protected String m12756t(String str) {
        return this.f11355s ? "Username" : str.contains("@") ? "Email" : Patterns.PHONE.matcher(str).matches() ? "PhoneNumber" : "Username";
    }

    /* renamed from: v */
    protected InterfaceC2865d m12757v() {
        if (this.f11350n.get() != null) {
            return this.f11350n.get();
        }
        return f11349v;
    }

    /* renamed from: w */
    protected void m12758w() {
        C1151k.m6712f("rbx.authlogin", "onLoginSuccess: Will finish the view as success...");
        this.f11353q.m20420d();
        m12757v().mo12715N(104);
    }

    /* renamed from: y */
    protected void m12759y() {
        this.f11354r.mo19078f((Activity) m12757v(), 20120, m12742u(), new C2860d());
    }
}
