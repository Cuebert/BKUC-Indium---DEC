package com.roblox.client.login.mvp;

import com.roblox.client.C2877p0;
import org.json.JSONException;
import org.json.JSONObject;
import p023b9.C1078b;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1156p;
import p100h7.C3415h;
import p100h7.C3416i;
import p100h7.C3417j;
import p114i7.C3543d;
import p277v9.C4995a;
import p300x7.C5565g;

/* renamed from: com.roblox.client.login.mvp.f */
/* loaded from: classes.dex */
class C2867f {

    /* renamed from: a */
    private int f11394a = 0;

    /* renamed from: b */
    private String f11395b;

    /* renamed from: c */
    private C1079c f11396c;

    /* renamed from: d */
    private C1078b f11397d;

    /* renamed from: e */
    private C1156p f11398e;

    /* renamed from: com.roblox.client.login.mvp.f$a */
    /* loaded from: classes.dex */
    class a extends C3416i {

        /* renamed from: a */
        final /* synthetic */ b f11399a;

        a(b bVar) {
            this.f11399a = bVar;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            JSONObject jSONObject;
            int m15027b = c3417j.m15027b();
            c cVar = null;
            C2866e c2866e = null;
            if (m15027b == 200) {
                C2867f.this.m12810l();
                try {
                    jSONObject = new JSONObject(c3417j.m15026a());
                } catch (JSONException unused) {
                    C1151k.m6709c("rbx.authlogin", "callLoginWithAuthV1. Error parsing server response on 200. msg: " + c3417j.m15026a());
                    jSONObject = null;
                    c2866e = new C2866e("FailureJSON", "Android-AppLogin-Failure-UnknownError", -2010);
                }
                if (c2866e == null && (c2866e = C2867f.this.m12804d(jSONObject)) == null) {
                    if (jSONObject.has("twoStepVerificationData")) {
                        c2866e = C2867f.this.m12808j(jSONObject, this.f11399a);
                    } else {
                        C1151k.m6712f("rbx.authlogin", "callLoginWithAuthV1(). errorCode=200.");
                        C2867f.this.m12809k();
                        this.f11399a.mo12815d();
                    }
                }
            } else {
                try {
                    cVar = new c(c3417j.m15026a());
                } catch (JSONException unused2) {
                    C1151k.m6709c("rbx.authlogin", "Error parsing server error message. msg: " + c3417j.m15026a());
                }
                if (m15027b == 0) {
                    c2866e = new C2866e("FailureUnknownError", "Android-AppLogin-Failure-0-Timeout", -2018);
                } else if (m15027b == 400) {
                    c2866e = C2867f.this.m12800h(cVar);
                } else if (m15027b != 429) {
                    c2866e = m15027b != 500 ? m15027b != 403 ? m15027b != 404 ? new C2866e("FailureUnknownError", "Android-AppLogin-Failure-UnknownError", -2010) : new C2866e("FailureUnknownError", "Android-AppLogin-Failure-404-NotFound", -2019) : C2867f.this.m12801i(cVar, this.f11399a) : new C2866e("FailureUnknownError", "Android-AppLogin-Failure-500-InternalServerError", -2020);
                } else {
                    C2867f.this.m12810l();
                    this.f11399a.mo12814c();
                    c2866e = new C2866e("FailureLoginFloodcheck", "Android-AppLogin-Failure-429-Throttled", -2022);
                }
            }
            if (c2866e != null) {
                c2866e.f11393d = m15027b;
                this.f11399a.mo12812a(c2866e);
            }
        }
    }

    /* renamed from: com.roblox.client.login.mvp.f$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12812a(C2866e c2866e);

        /* renamed from: b */
        void mo12813b(String str, String str2, String str3);

        /* renamed from: c */
        void mo12814c();

        /* renamed from: d */
        void mo12815d();

        /* renamed from: e */
        void mo12816e();

        /* renamed from: f */
        void mo12817f();
    }

    /* renamed from: com.roblox.client.login.mvp.f$c */
    /* loaded from: classes.dex */
    protected static class c extends C4995a {
        c(String str) throws JSONException {
            super(str);
            if (!m19445a()) {
                throw new JSONException("Invalid Error Payload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2867f(C1079c c1079c, C1078b c1078b, C1156p c1156p) {
        this.f11396c = c1079c;
        this.f11397d = c1078b;
        this.f11398e = c1156p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public C2866e m12800h(c cVar) {
        C2866e c2866e = new C2866e();
        int i10 = cVar != null ? cVar.f19089a : 1000;
        if (i10 == 0) {
            c2866e.f11392c = -2010;
            c2866e.f11390a = "FailureServerError";
        } else if (i10 == 3) {
            c2866e.f11392c = -2011;
            c2866e.f11390a = "FailureInvalidUsernamePassword";
        } else if (i10 != 8) {
            c2866e.f11392c = -2010;
            c2866e.f11390a = "FailureUnknownError";
        } else {
            c2866e.f11392c = -2012;
            c2866e.f11390a = "FailureCredentialNotSupported";
        }
        c2866e.f11391b = "Android-AppLogin-Failure-400-BadRequest";
        return c2866e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public C2866e m12801i(c cVar, b bVar) {
        String str;
        String str2;
        int i10 = cVar != null ? cVar.f19089a : 1000;
        int i11 = -2022;
        if (i10 == 1) {
            int i12 = this.f11394a + 1;
            this.f11394a = i12;
            if (i12 > C1134c.m6537a().mo6661y0()) {
                bVar.mo12817f();
            } else {
                i11 = -2013;
            }
            str = "FailureInvalidUsernamePassword";
            str2 = "Android-AppLogin-Failure-403-Credentials";
        } else if (i10 == 2) {
            m12810l();
            i11 = -2021;
            str = "Captcha";
            str2 = "Android-AppLogin-Failure-403-Captcha";
        } else if (i10 == 4) {
            m12810l();
            bVar.mo12816e();
            str = "FailureResetPasswordRequired";
            str2 = "Android-AppLogin-Failure-403-PasswordResetRequired";
        } else if (i10 == 5) {
            i11 = -2014;
            str = "FailureLoginNullPasswordSocialLogin";
            str2 = "Android-AppLogin-Failure-403-NullPassword";
        } else if (i10 == 6) {
            i11 = -2015;
            str = "FailureTwoStepVerification";
            str2 = "Android-AppLogin-Failure-403-TwoStepVerification";
        } else if (i10 == 9) {
            i11 = -2016;
            str = "FailureDefaultLoginRequired";
            str2 = "Android-AppLogin-Failure-403-DefaultLoginRequired";
        } else if (i10 == 10) {
            i11 = -2017;
            str = "FailureUnverifiedCredentials";
            str2 = "Android-AppLogin-Failure-403-UnverifiedCredentials";
        } else if (i10 != 14) {
            i11 = -2010;
            str = "FailureUnknownError";
            str2 = "Android-AppLogin-Failure-UnknownError";
        } else {
            i11 = -2023;
            str = "FailureLuobuUser";
            str2 = "Android-AppLogin-Failure-403-LuobuUser";
        }
        return new C2866e(str, str2, i11);
    }

    /* renamed from: n */
    private void m12802n() {
        this.f11398e.m6748f().edit().putLong("user_logged_in_time", System.currentTimeMillis()).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12803c(String str, String str2, String str3, String str4, String str5, b bVar) {
        m12811m(str2, str, str3);
        a aVar = new a(bVar);
        new C3415h().mo15023a(C2877p0.m12947s0(), new C3543d(str, str2, str3, str4, str5), null, aVar).mo15006c();
    }

    /* renamed from: d */
    protected C2866e m12804d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("user");
            this.f11396c.m6400u(jSONObject2.getString("name"));
            this.f11396c.m6399t(jSONObject2.getLong("id"));
            return null;
        } catch (JSONException unused) {
            return new C2866e("MissingUserInfo", "Android-AppLogin-Failure-UnknownError", -2010);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m12805e() {
        return this.f11397d.m6376a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m12806f() {
        return this.f11397d.m6377b();
    }

    /* renamed from: g */
    public String m12807g() {
        return this.f11395b;
    }

    /* renamed from: j */
    protected C2866e m12808j(JSONObject jSONObject, b bVar) {
        C1151k.m6712f("rbx.authlogin", "callLoginWithAuthV1(). errorCode=200. requires 2 step verification");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("twoStepVerificationData");
            bVar.mo12813b(jSONObject2.getString("ticket"), jSONObject2.getString("mediaType"), this.f11396c.m6390k());
            return null;
        } catch (JSONException unused) {
            C1151k.m6709c("rbx.authlogin", "callLoginWithApi. Error parsing 2SV response.");
            return new C2866e("Failure2SVJSON", "Android-AppLogin-Failure-UnknownError", -2010);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m12809k() {
        C1151k.m6712f("rbx.authlogin", "onLoginOK.");
        C5565g.m20445e().m20464s(this.f11396c.m6389j());
        C5565g.m20445e().m20463p(true);
        m12802n();
        C1078b.m6375c().m6378d(m12806f(), m12805e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m12810l() {
        this.f11394a = 0;
    }

    /* renamed from: m */
    public void m12811m(String str, String str2, String str3) {
        this.f11397d.m6379e(str2, str);
        this.f11395b = str3;
    }
}
