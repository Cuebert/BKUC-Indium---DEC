package com.roblox.client.game;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0803d;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2827g;
import com.roblox.client.C2871m0;
import com.roblox.client.C2877p0;
import com.roblox.client.app.AppInputFocusLifecycleObserver;
import com.roblox.client.game.C2832c;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import la.C3905c;
import org.json.JSONObject;
import p008a7.C0045c;
import p008a7.C0050h;
import p008a7.C0051i;
import p024bc.C1100c;
import p033c7.C1134c;
import p035c9.C1151k;
import p077fa.C3214a;
import p176n6.C4070d;
import p176n6.C4072f;
import p276v8.InterfaceC4994d;
import p288w8.C5476k;
import p300x7.C5560b;
import p300x7.C5565g;
import p313y7.C5900b;
import p313y7.C5901c;
import p313y7.C5902d;
import p313y7.C5903e;

/* renamed from: com.roblox.client.game.c */
/* loaded from: classes.dex */
public class C2832c extends OnAppBridgeNotificationListener {

    /* renamed from: c */
    private a f11256c;

    /* renamed from: d */
    private b f11257d;

    /* renamed from: a */
    private final String f11254a = "rbx.datamodel";

    /* renamed from: b */
    private final String f11255b = "OPEN_YOUTUBE_VIDEO";

    /* renamed from: e */
    private AppInputFocusLifecycleObserver f11258e = new AppInputFocusLifecycleObserver();

    /* renamed from: com.roblox.client.game.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: d */
        void mo12556d(String str);
    }

    /* renamed from: com.roblox.client.game.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        C2871m0 mo12566a();
    }

    public C2832c(a aVar, b bVar) {
        this.f11256c = aVar;
        this.f11257d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m12605c(JSONObject jSONObject) {
        C2827g.m12519b(jSONObject, this.f11257d.mo12566a().m4363p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
    /* renamed from: a */
    public void mo12606a(String str, String str2) {
        String str3;
        ActivityC0803d m4363p;
        long j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        C1151k.m6712f("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            C0051i m248b = C0051i.m248b("PROFILE_TAG");
            m248b.m255i(str2);
            m248b.m256j(true);
            C1100c.m6458d().m6469j(m248b);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            C1100c.m6458d().m6469j(new C0051i("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            C0051i c0051i = new C0051i("ABUSE_REPORT_TAG");
            c0051i.m255i(str2);
            c0051i.m256j(true);
            C1100c.m6458d().m6469j(c0051i);
            return;
        }
        if (str.equals("VIEW_GAME_DETAILS")) {
            C0051i m248b2 = C0051i.m248b("GAME_DETAILS_TAG");
            m248b2.m255i(str2);
            m248b2.m256j(true);
            C1100c.m6458d().m6469j(m248b2);
            return;
        }
        if (str.equals("PRIVACY_SETTINGS")) {
            C0051i m248b3 = C0051i.m248b("SETTINGS_TAG");
            m248b3.m255i(C2877p0.m12894V());
            m248b3.m256j(true);
            C1100c.m6458d().m6469j(m248b3);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            C1100c.m6458d().m6469j(new C0045c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new C5903e(this.f11257d.mo12566a(), "tabAvatar").m21010g(this.f11258e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new C5902d(this.f11257d.mo12566a()).m21004f(this.f11258e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f11256c.mo12556d(str2);
            if (C1134c.m6537a().mo6608f1() || this.f11257d.mo12566a().m4363p() == null) {
                return;
            }
            C3905c.m16561r().m16570s(this.f11257d.mo12566a().m4363p());
            return;
        }
        if (str.equals("CLOSE_MODAL")) {
            return;
        }
        if (str.equals("VIEW_GAME_DETAILS_ANIMATED")) {
            C0051i m248b4 = C0051i.m248b("ANIMATED_ASSET_DETAILS_TAG");
            m248b4.m255i(str2);
            m248b4.m256j(true);
            C1100c.m6458d().m6469j(m248b4);
            return;
        }
        if (!str.equals("OPEN_CUSTOM_WEBVIEW") && !str.equals("OPEN_SETTINGS_WEBVIEW")) {
            if (str.equals("OPEN_BUILDERS_CLUB")) {
                new C5900b(this.f11257d.mo12566a(), "tabMore").m20992c(this.f11258e);
                return;
            }
            if (str.equals("VIEW_MY_FEED")) {
                C0051i m248b5 = C0051i.m248b("MY_FEED_TAG");
                m248b5.m256j(true);
                C1100c.m6458d().m6469j(m248b5);
                return;
            }
            if (str.equals("SEARCH_GAMES")) {
                C0051i m248b6 = C0051i.m248b("SEARCH_GAMES_TAG");
                m248b6.m255i(str2);
                m248b6.m256j(true);
                C1100c.m6458d().m6469j(m248b6);
                return;
            }
            if (str.equals("GAMES_SEE_ALL")) {
                C0051i m248b7 = C0051i.m248b("GAMES_SEE_ALL_TAG");
                m248b7.m255i(str2);
                m248b7.m256j(true);
                C1100c.m6458d().m6469j(m248b7);
                return;
            }
            if (str.equals("ACTION_LOG_OUT")) {
                new C5901c(this.f11257d.mo12566a()).m20995c(this.f11258e);
                return;
            }
            if (str.equals("LUA_HOME_PAGE_LOADED")) {
                C4070d.m16926b().m16927c(true);
                C4072f.m16936a("LuaHomePageLoaded");
                C4072f.m16939d();
                return;
            }
            if (str.equals("LAUNCH_CONVERSATION")) {
                try {
                    j10 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                    C1151k.m6716j("rbx.datamodel", "could not parse data");
                    j10 = -1;
                }
                if (j10 != -1) {
                    C1100c.m6458d().m6469j(new C0050h(j10));
                    return;
                }
                return;
            }
            if (str.equals("UNIVERSAL_FRIENDS")) {
                C1100c.m6458d().m6469j(new C0051i("UNIVERSAL_FRIENDS_TAG"));
                return;
            }
            if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
                C0051i m247a = C0051i.m247a("YOUTUBE_TAG", str2);
                m247a.m256j(true);
                C1100c.m6458d().m6469j(m247a);
                return;
            }
            if (str.equals("ACTION_LOG_IN")) {
                C4070d.m16926b().m16931g();
                ActivityC0803d m4363p2 = this.f11257d.mo12566a().m4363p();
                if (m4363p2 != null) {
                    C5476k.m20155t(m4363p2).m20163K();
                    return;
                }
                return;
            }
            if (str.equals("DID_LOG_IN")) {
                ActivityC0803d m4363p3 = this.f11257d.mo12566a().m4363p();
                if (m4363p3 != null) {
                    C5476k.m20132H(m4363p3, str2);
                    return;
                }
                return;
            }
            if (str.equals("DID_SIGN_UP")) {
                C4070d.m16926b().m16931g();
                ActivityC0803d m4363p4 = this.f11257d.mo12566a().m4363p();
                if (m4363p4 != null) {
                    C5476k.m20155t(m4363p4).m20162J(str2);
                    return;
                }
                return;
            }
            if (str.equals("DID_LOG_OUT")) {
                ActivityC0803d m4363p5 = this.f11257d.mo12566a().m4363p();
                if (m4363p5 == null || !C5565g.m20445e().m20457f()) {
                    return;
                }
                C5560b.m20357e().m20364h(m4363p5, C5560b.f.LOGOUT_BY_USER_IN_LUA);
                C3214a.m14292a().m14294c();
                if (C1134c.m6537a().mo6558J0()) {
                    NativeGLInterface.screenTimeStop();
                    return;
                }
                return;
            }
            if (str.equals("DID_SWITCH_ACCOUNT")) {
                ActivityC0803d m4363p6 = this.f11257d.mo12566a().m4363p();
                if (m4363p6 != null) {
                    C5560b.m20357e().m20365i(m4363p6);
                    C3214a.m14292a().m14294c();
                    return;
                }
                return;
            }
            if (str.equals("OPEN_CAPTCHA_VIEW")) {
                C0051i m248b8 = C0051i.m248b("CAPTCHA_TAG");
                m248b8.m253g(str2);
                m248b8.m256j(true);
                C1100c.m6458d().m6469j(m248b8);
                return;
            }
            if (str.equals("LUA_UNAUTHORIZED_LOG_OUT")) {
                ActivityC0803d m4363p7 = this.f11257d.mo12566a().m4363p();
                if (m4363p7 == null || !C5565g.m20445e().m20457f()) {
                    return;
                }
                C5560b.m20357e().m20364h(m4363p7, C5560b.f.LOGOUT_BY_401_ERROR_IN_LUA);
                return;
            }
            if (!str.equals("NATIVE_SHARE") || (m4363p = this.f11257d.mo12566a().m4363p()) == 0 || m4363p.isFinishing() || !(m4363p instanceof InterfaceC4994d)) {
                return;
            }
            ((InterfaceC4994d) m4363p).mo12172s(str2);
            return;
        }
        C0051i m248b9 = C0051i.m248b("CUSTOM_WEBVIEW_TAG");
        m248b9.m253g(str2);
        m248b9.m256j(true);
        C1100c.m6458d().m6469j(m248b9);
    }

    /* renamed from: d */
    public void m12607d() {
        if (this.f11257d.mo12566a().m4363p() != null) {
            C3214a.m14292a().m14293b(new C3214a.b() { // from class: f7.g
                @Override // p077fa.C3214a.b
                /* renamed from: a */
                public final void mo12242a(JSONObject jSONObject) {
                    C2832c.this.m12605c(jSONObject);
                }
            });
            if (C1134c.m6537a().mo6608f1()) {
                return;
            }
            C3905c.m16561r().m16570s(this.f11257d.mo12566a().m4363p());
        }
    }
}
