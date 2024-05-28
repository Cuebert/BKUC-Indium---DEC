package com.roblox.client.app;

import android.os.Handler;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;

/* renamed from: com.roblox.client.app.a */
/* loaded from: classes.dex */
public class C2740a {

    /* renamed from: a */
    private final String f10443a = "rbx.browserservice";

    /* renamed from: b */
    private Handler f10444b;

    /* renamed from: c */
    private d f10445c;

    /* renamed from: d */
    private Connection f10446d;

    /* renamed from: e */
    private Connection f10447e;

    /* renamed from: f */
    private Connection f10448f;

    /* renamed from: com.roblox.client.app.a$a */
    /* loaded from: classes.dex */
    class a implements Callback {

        /* renamed from: com.roblox.client.app.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6046a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ C2743d f10450n;

            RunnableC6046a(C2743d c2743d) {
                this.f10450n = c2743d;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2740a.this.f10445c.mo12168o0(this.f10450n);
            }
        }

        a() {
        }

        public void onItemSet(String str) {
            C1151k.m6707a("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            C2740a.this.m12225d(new RunnableC6046a(new C2743d(str)));
        }
    }

    /* renamed from: com.roblox.client.app.a$b */
    /* loaded from: classes.dex */
    class b implements Callback {

        /* renamed from: com.roblox.client.app.a$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2740a.this.f10445c.mo12151Q();
            }
        }

        b() {
        }

        public void onItemSet(String str) {
            C1151k.m6707a("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            C2740a.this.m12225d(new a());
        }
    }

    /* renamed from: com.roblox.client.app.a$c */
    /* loaded from: classes.dex */
    class c implements Callback {

        /* renamed from: com.roblox.client.app.a$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ C2743d f10455n;

            a(C2743d c2743d) {
                this.f10455n = c2743d;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2740a.this.f10445c.mo12168o0(this.f10455n);
            }
        }

        /* renamed from: com.roblox.client.app.a$c$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: n */
            final /* synthetic */ C2743d f10457n;

            b(C2743d c2743d) {
                this.f10457n = c2743d;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2740a.this.f10445c.mo12173x(this.f10457n);
            }
        }

        c() {
        }

        public void onItemSet(String str) {
            C1151k.m6707a("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    C2740a.this.m12225d(new a(new C2743d(jSONObject.getString("url"), jSONObject.optString("title", BuildConfig.FLAVOR), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)))));
                    return;
                }
                if (string.equals("config")) {
                    C2740a.this.m12225d(new b(new C2743d(null, jSONObject.has("title") ? jSONObject.optString("title") : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null)));
                    return;
                }
                C1151k.m6709c("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
            } catch (JSONException unused) {
                C1151k.m6709c("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    /* renamed from: com.roblox.client.app.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: Q */
        void mo12151Q();

        /* renamed from: o0 */
        void mo12168o0(C2743d c2743d);

        /* renamed from: x */
        void mo12173x(C2743d c2743d);
    }

    public C2740a(d dVar, Handler handler) {
        this.f10445c = dVar;
        this.f10444b = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12225d(Runnable runnable) {
        this.f10444b.post(runnable);
    }

    /* renamed from: c */
    public void m12226c() {
        this.f10446d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f10447e = MemStorage.bind("BrowserService.CloseBrowserWindow", new b());
        this.f10448f = MemStorage.bind("BrowserService.SendCommand", new c());
    }

    /* renamed from: e */
    public void m12227e() {
        Connection connection = this.f10446d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f10447e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f10448f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
