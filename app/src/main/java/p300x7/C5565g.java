package p300x7;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2822f0;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import org.json.JSONException;
import org.json.JSONObject;
import p023b9.C1077a;
import p023b9.C1078b;
import p023b9.C1079c;
import p035c9.C1151k;
import p100h7.C3414g;
import p100h7.C3416i;
import p100h7.C3417j;
import p100h7.InterfaceC3413f;
import p100h7.InterfaceC3420m;
import p101h8.C3442p;
import p191o9.C4161i;
import p249t6.C4735b;
import p287w7.HandlerC5465a;
import p313y7.C5901c;

/* renamed from: x7.g */
/* loaded from: classes.dex */
public class C5565g {

    /* renamed from: a */
    private long f20662a = -1;

    /* renamed from: b */
    private boolean f20663b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x7.g$a */
    /* loaded from: classes.dex */
    public class a extends C3416i {

        /* renamed from: a */
        final /* synthetic */ d f20664a;

        a(d dVar) {
            this.f20664a = dVar;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            C1079c m6380c = C1079c.m6380c();
            int m6385f = m6380c.m6385f();
            boolean z10 = false;
            if (!c3417j.m15026a().isEmpty()) {
                try {
                    m6385f = new JSONObject(c3417j.m15026a()).optInt("robux");
                    m6380c.m6397r(m6385f);
                    z10 = true;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            d dVar = this.f20664a;
            if (dVar != null) {
                dVar.mo13586a(z10, m6385f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x7.g$b */
    /* loaded from: classes.dex */
    public class b implements HandlerC5465a.e {

        /* renamed from: a */
        final /* synthetic */ f f20666a;

        b(f fVar) {
            this.f20666a = fVar;
        }

        @Override // p287w7.HandlerC5465a.e
        /* renamed from: a */
        public void mo20096a() {
            this.f20666a.mo20174a();
        }
    }

    /* renamed from: x7.g$c */
    /* loaded from: classes.dex */
    public class c extends C3416i {

        /* renamed from: a */
        final /* synthetic */ C5901c.b f20668a;

        c(C5901c.b bVar) {
            this.f20668a = bVar;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            C1151k.m6712f("rbx.login", "Logout: " + c3417j);
            if (c3417j.m15027b() != 200) {
                C2822f0.m12484f("logout", c3417j.m15031f(), c3417j.m15027b(), -1);
                C4161i.m17249e().m17252g(C2877p0.m12872K(), C2877p0.m12926i());
            }
            C5901c.b bVar = this.f20668a;
            if (bVar != null) {
                bVar.mo20368a();
            }
        }
    }

    /* renamed from: x7.g$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo13586a(boolean z10, int i10);
    }

    /* renamed from: x7.g$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        static final C5565g f20670a = new C5565g();
    }

    /* renamed from: x7.g$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo20174a();
    }

    public C5565g() {
        m20447l();
    }

    /* renamed from: a */
    private void m20443a(C5901c.b bVar) {
        c cVar = new c(bVar);
        C3414g.m15025a().mo15023a(C2877p0.m12951u0(), null, null, cVar).mo15006c();
    }

    /* renamed from: b */
    private void m20444b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    /* renamed from: e */
    public static C5565g m20445e() {
        return e.f20670a;
    }

    /* renamed from: h */
    public static boolean m20446h() {
        return C2877p0.m12882P().getLong("userid_long", -1L) != -1;
    }

    /* renamed from: l */
    private void m20447l() {
        SharedPreferences m12882P = C2877p0.m12882P();
        String string = m12882P.getString("username", BuildConfig.FLAVOR);
        String string2 = m12882P.getString("displayName", BuildConfig.FLAVOR);
        long j10 = m12882P.getLong("userid_long", -1L);
        this.f20662a = j10;
        if (j10 == -1) {
            this.f20662a = m12882P.getInt("userid", -1);
        }
        C1079c.m6380c().m6394o(m12882P.getBoolean("under13", true));
        C1079c.m6380c().m6400u(string);
        C1079c.m6380c().m6393n(string2);
    }

    /* renamed from: m */
    public static JSONObject m20448m() {
        SharedPreferences m12882P = C2877p0.m12882P();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", m12882P.getLong("userid_long", -1L));
            jSONObject.put("isUnder13", m12882P.getBoolean("under13", true));
            jSONObject.put("username", m12882P.getString("username", BuildConfig.FLAVOR));
            jSONObject.put("displayName", m12882P.getString("displayName", BuildConfig.FLAVOR));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    /* renamed from: o */
    private void m20449o(Context context) {
        this.f20663b = false;
        m20464s(-1L);
        m20453u();
        m20452t();
        m20454v(true);
        C4735b.m18874b().m18875a();
        C1079c.m6380c().m6381a();
        C3442p.m15144c().m15145a();
        m20444b(context);
    }

    /* renamed from: q */
    private void m20450q(long j10) {
        this.f20662a = j10;
        this.f20663b = true;
        m20451r();
        C1078b.m6375c().m6378d(C1079c.m6380c().m6390k(), "Username");
    }

    /* renamed from: r */
    private void m20451r() {
        C2877p0.m12882P().edit().putLong("user_logged_in_time", System.currentTimeMillis()).apply();
    }

    /* renamed from: t */
    private void m20452t() {
        C2877p0.m12882P().edit().remove("last_auth_cookie_expir_key").apply();
    }

    /* renamed from: u */
    private void m20453u() {
        C2877p0.m12882P().edit().remove("user_logged_in_time").apply();
    }

    /* renamed from: v */
    private void m20454v(boolean z10) {
        SharedPreferences.Editor edit = C2877p0.m12882P().edit();
        edit.remove("userid");
        if (z10) {
            edit.remove("userid_long");
            edit.remove("displayName");
            edit.remove("under13");
        } else {
            edit.putString("username", C1079c.m6380c().m6390k());
            edit.putString("displayName", C1079c.m6380c().m6382b());
            edit.putLong("userid_long", this.f20662a);
            edit.putBoolean("under13", C1079c.m6380c().m6392m());
        }
        edit.apply();
    }

    /* renamed from: c */
    public void m20455c(Context context, boolean z10, C5901c.b bVar) {
        if (z10) {
            m20443a(bVar);
        }
        m20449o(context);
        C2872n.m12830h().m12846q().m17715c();
    }

    /* renamed from: d */
    public void m20456d(InterfaceC3420m interfaceC3420m) {
        C1077a c1077a = new C1077a(interfaceC3420m);
        c1077a.m6371b();
        C5563e.m20377e("activeSession");
        c1077a.m6372c();
    }

    /* renamed from: f */
    public boolean m20457f() {
        return this.f20663b;
    }

    /* renamed from: g */
    public long m20458g() {
        return this.f20662a;
    }

    /* renamed from: i */
    public boolean m20459i() {
        return this.f20662a != -1;
    }

    /* renamed from: j */
    public void m20460j(Context context, String str, f fVar) {
        C1151k.m6712f("SessionManager", "didLoggedIn");
        this.f20663b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f20662a = jSONObject.optLong("userId", this.f20662a);
                C1079c.m6380c().m6399t(this.f20662a);
                C1079c.m6380c().m6394o(jSONObject.optBoolean("isUnder13"));
                C1079c.m6380c().m6400u(jSONObject.optString("username", C1079c.m6380c().m6390k()));
                C1079c.m6380c().m6393n(jSONObject.optString("displayName", BuildConfig.FLAVOR));
                m20454v(false);
                C1079c.m6380c().m6395p(jSONObject.optInt("membershipType", 0));
                jSONObject.optString("countryCode", BuildConfig.FLAVOR);
            } catch (JSONException e10) {
                C1151k.m6715i("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        HandlerC5465a handlerC5465a = new HandlerC5465a(context, "PostLogin", this.f20662a, C1079c.m6380c().m6390k());
        handlerC5465a.m20094g(new b(fVar));
        handlerC5465a.m12419e();
    }

    /* renamed from: k */
    public void m20461k(String str, long j10) {
        C1151k.m6712f("rbx.login", "onSignUpOK: username:" + str + ", userId:" + j10);
        m20450q(j10);
    }

    /* renamed from: n */
    public void m20462n(d dVar, InterfaceC3413f interfaceC3413f) {
        interfaceC3413f.mo15024b(C2877p0.m12924h(), null, new a(dVar)).mo15006c();
    }

    /* renamed from: p */
    public void m20463p(boolean z10) {
        this.f20663b = z10;
        if (z10) {
            C2877p0.m12893U0();
        }
    }

    /* renamed from: s */
    public void m20464s(long j10) {
        this.f20662a = j10;
    }
}
