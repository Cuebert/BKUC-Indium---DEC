package com.roblox.client.app;

import android.app.Activity;
import android.content.Intent;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p264u8.C4870a;
import p274v6.C4987b;
import p274v6.C4989d;
import p274v6.InterfaceC4986a;

/* renamed from: com.roblox.client.app.c */
/* loaded from: classes.dex */
public class C2742c {

    /* renamed from: a */
    private InterfaceC4986a f10462a;

    /* renamed from: b */
    private Connection f10463b;

    /* renamed from: c */
    private Activity f10464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.app.c$a */
    /* loaded from: classes.dex */
    public class a implements Callback {
        a() {
        }

        public void onItemSet(String str) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                C1151k.m6709c("rbx.LuaSmartLockBridge", "Failed to convert JSON");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("cvalue");
                String optString2 = jSONObject.optString("password");
                String optString3 = jSONObject.optString("authType");
                if (optString.isEmpty() || optString2.isEmpty()) {
                    return;
                }
                C2742c.this.m12231f(new C4989d(optString, optString2, BuildConfig.FLAVOR), optString3.equals("signup") ? 20122 : 20119);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.app.c$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4986a.b {
        b() {
        }

        @Override // p274v6.InterfaceC4986a.b
        /* renamed from: a */
        public void mo12237a(C4989d c4989d) {
            C2742c.this.m12232g(c4989d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.app.c$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC4986a.a {
        c() {
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

    public C2742c(Activity activity) {
        this.f10464c = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m12231f(C4989d c4989d, int i10) {
        this.f10462a.mo19078f(this.f10464c, i10, c4989d, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m12232g(C4989d c4989d) {
        MemStorage.setItem("AutoFillCredentials", c4989d.m19431a());
    }

    /* renamed from: c */
    public void m12233c() {
        this.f10462a = new C4870a(this.f10464c, new C4987b());
        this.f10463b = MemStorage.bind("AuthenticatedCredentials", new a());
    }

    /* renamed from: d */
    public void m12234d(int i10, Intent intent) {
        if (i10 == -1) {
            this.f10462a.mo19080h();
            m12232g(this.f10462a.mo19079g(intent));
        }
    }

    /* renamed from: e */
    public void m12235e() {
        this.f10462a.mo19075c(this.f10464c, 20121, new b());
    }

    /* renamed from: h */
    public void m12236h() {
        Connection connection = this.f10463b;
        if (connection != null) {
            connection.disconnect();
            this.f10463b = null;
        }
    }
}
