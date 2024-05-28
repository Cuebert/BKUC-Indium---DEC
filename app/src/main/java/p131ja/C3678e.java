package p131ja;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.IntentSenderRequest;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ma.C3969a;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p131ja.C3683j;
import p328z9.C6027d;

/* renamed from: ja.e */
/* loaded from: classes.dex */
public class C3678e {

    /* renamed from: a */
    private MessageBus f15418a;

    /* renamed from: b */
    private Context f15419b;

    /* renamed from: c */
    private WeakReference<AbstractC0141b<IntentSenderRequest>> f15420c;

    /* renamed from: d */
    private Connection f15421d;

    /* renamed from: e */
    private Connection f15422e;

    /* renamed from: f */
    private Connection f15423f;

    /* renamed from: g */
    private Connection f15424g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ja.e$a */
    /* loaded from: classes.dex */
    public class a implements C3683j.b {
        a() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("supportsGetSMSOTP_" + str);
            C3678e.this.m15630s("supportsGetSMSOTP", "support", false);
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
            C3678e.this.m15630s("supportsGetSMSOTP", "support", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ja.e$b */
    /* loaded from: classes.dex */
    public class b implements C3683j.b {
        b() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("getPhoneNumber_" + str);
            C3678e.this.m15629r("getPhoneNumber");
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ja.e$c */
    /* loaded from: classes.dex */
    public class c implements C3683j.b {
        c() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("supportsGetPhoneNumber_" + str);
            C3678e.this.m15630s("supportsGetPhoneNumber", "support", false);
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
            C3678e.this.m15630s("supportsGetPhoneNumber", "support", true);
        }
    }

    /* renamed from: ja.e$d */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        private static C3678e f15428a = new C3678e(MessageBus.m13364e(), null);
    }

    /* synthetic */ C3678e(MessageBus messageBus, a aVar) {
        this(messageBus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m15629r(String str) {
        this.f15418a.m13370i("IdentityProtocol", str, new JSONObject(), 13, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m15630s(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, z10);
            this.f15418a.m13370i("IdentityProtocol", str, jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("IdentityProtocol", "JSON exception in " + str + ": " + e10.toString());
            this.f15418a.m13370i("IdentityProtocol", str, new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: w */
    public static C3678e m15631w() {
        return d.f15428a;
    }

    /* renamed from: g */
    void m15632g(Context context, C6027d c6027d) {
        if (C1134c.m6537a().mo6549F()) {
            if (context == null) {
                this.f15418a.m13370i("IdentityProtocol", "getSMSOTP", new JSONObject(), 13, new HashMap());
            } else {
                c6027d.m21351a(context, "IdentityProtocol");
            }
        }
    }

    /* renamed from: l */
    public void m15633l(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", str);
            this.f15418a.m13370i("IdentityProtocol", "getSMSOTP", jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("IdentityProtocol", "JSON exception while handling supports get sms otp: " + e10.toString());
            m15629r("getSMSOTP");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m15627j(JSONObject jSONObject) {
        WeakReference<AbstractC0141b<IntentSenderRequest>> weakReference;
        Log.d("IdentityProtocol", "onGetPhoneNumber: " + jSONObject.toString());
        if (C1134c.m6537a().mo6637p0()) {
            if (this.f15419b != null && (weakReference = this.f15420c) != null && weakReference.get() != null) {
                C3683j.m15648f().m15656m(this.f15419b, this.f15420c.get(), new b());
            } else {
                Log.e("IdentityProtocol", "Context or launcher is null while getting phone number!");
                m15640u(BuildConfig.FLAVOR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m15625h(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onGetSMSOTP: " + jSONObject.toString());
        m15632g(this.f15419b, new C6027d());
    }

    /* renamed from: o */
    public void m15636o(Context context, Intent intent) {
        if (!C1134c.m6537a().mo6637p0() || context == null || intent == null) {
            return;
        }
        m15640u(C3683j.m15648f().m15653e(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m15628k(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetPhoneNumber: " + jSONObject.toString());
        if (C1134c.m6537a().mo6637p0() && this.f15419b != null) {
            C3683j.m15648f().m15654g(this.f15419b, new c());
        } else {
            m15630s("supportsGetPhoneNumber", "support", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m15626i(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetSMSOTP: " + jSONObject.toString());
        if (C1134c.m6537a().mo6549F() && this.f15419b != null) {
            C3683j.m15648f().m15654g(this.f15419b, new a());
        } else {
            m15630s("supportsGetSMSOTP", "support", false);
        }
    }

    /* renamed from: t */
    public void m15639t(Context context) {
        this.f15419b = context;
    }

    /* renamed from: u */
    void m15640u(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", str);
                    this.f15418a.m13370i("IdentityProtocol", "getPhoneNumber", jSONObject, 0, new HashMap());
                    return;
                }
            } catch (JSONException e10) {
                Log.e("IdentityProtocol", "Exception while handling get phone number request", e10);
            }
        }
        m15629r("getPhoneNumber");
    }

    /* renamed from: v */
    public void m15641v(AbstractC0141b<IntentSenderRequest> abstractC0141b) {
        this.f15420c = new WeakReference<>(abstractC0141b);
    }

    private C3678e(MessageBus messageBus) {
        this.f15418a = messageBus;
        this.f15421d = messageBus.m13374o("IdentityProtocol", "getSMSOTP", new Callback() { // from class: ja.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3678e.this.m15625h(jSONObject);
            }
        });
        this.f15422e = messageBus.m13374o("IdentityProtocol", "supportsGetSMSOTP", new Callback() { // from class: ja.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3678e.this.m15626i(jSONObject);
            }
        });
        this.f15423f = messageBus.m13374o("IdentityProtocol", "getPhoneNumber", new Callback() { // from class: ja.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3678e.this.m15627j(jSONObject);
            }
        });
        this.f15424g = messageBus.m13374o("IdentityProtocol", "supportsGetPhoneNumber", new Callback() { // from class: ja.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3678e.this.m15628k(jSONObject);
            }
        });
    }
}
