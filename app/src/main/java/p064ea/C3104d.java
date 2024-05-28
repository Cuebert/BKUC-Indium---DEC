package p064ea;

import android.app.Activity;
import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p064ea.C3105e;

/* renamed from: ea.d */
/* loaded from: classes.dex */
public class C3104d {

    /* renamed from: g */
    private static final String f13027g = "d";

    /* renamed from: a */
    private final MessageBus f13028a;

    /* renamed from: b */
    private final Connection f13029b;

    /* renamed from: c */
    private final Connection f13030c;

    /* renamed from: d */
    private final Connection f13031d;

    /* renamed from: e */
    private WeakReference<Activity> f13032e;

    /* renamed from: f */
    private final C3105e f13033f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ea.d$a */
    /* loaded from: classes.dex */
    public class a implements C3105e.c {

        /* renamed from: a */
        final /* synthetic */ MessageBus f13034a;

        a(MessageBus messageBus) {
            this.f13034a = messageBus;
        }

        @Override // p064ea.C3105e.c
        /* renamed from: a */
        public void mo13647a(String str, String str2) {
            this.f13034a.m13369h("Credentials.registerCredentialsResponse", C3104d.this.m13645s(str));
        }

        @Override // p064ea.C3105e.c
        /* renamed from: b */
        public void mo13648b(int i10, String str) {
            this.f13034a.m13369h("Credentials.registerCredentialsResponse", C3104d.this.m13630f(i10, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ea.d$b */
    /* loaded from: classes.dex */
    public class b implements C3105e.c {

        /* renamed from: a */
        final /* synthetic */ MessageBus f13036a;

        b(MessageBus messageBus) {
            this.f13036a = messageBus;
        }

        @Override // p064ea.C3105e.c
        /* renamed from: a */
        public void mo13647a(String str, String str2) {
            this.f13036a.m13369h("Credentials.getCredentialsResponse", C3104d.this.m13640e(str, str2));
        }

        @Override // p064ea.C3105e.c
        /* renamed from: b */
        public void mo13648b(int i10, String str) {
            this.f13036a.m13369h("Credentials.getCredentialsResponse", C3104d.this.m13630f(i10, str));
        }
    }

    /* renamed from: ea.d$c */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a */
        private static final C3104d f13038a = new C3104d(MessageBus.m13364e(), null);
    }

    /* synthetic */ C3104d(MessageBus messageBus, a aVar) {
        this(messageBus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public JSONObject m13630f(int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i10);
            if (str != null) {
                jSONObject.put("errorMsg", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            Log.e(f13027g, "JSON exception when creating error response!");
            return jSONObject;
        }
    }

    /* renamed from: g */
    private JSONObject m13631g(boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAvailable", z10);
            jSONObject.put("supportsDeviceBoundOnly", z11);
        } catch (JSONException e10) {
            Log.e(f13027g, "JSON exception on checking credentials availability: " + e10);
        }
        return jSONObject;
    }

    /* renamed from: h */
    private JSONObject m13632h(boolean z10, boolean z11, boolean z12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAvailable", z10);
            jSONObject.put("supportsDeviceBoundOnly", z11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isAvailable", z10);
            jSONObject2.put("supportsDeviceBoundOnly", z11);
            jSONObject.put("FIDO2", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("isAvailable", z12);
            jSONObject.put("password", jSONObject3);
        } catch (JSONException e10) {
            Log.e(f13027g, "JSON exception on checking credentials availability: " + e10);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m13635l(JSONObject jSONObject) {
        String str = f13027g;
        Log.v(str, "getCredentials request: " + jSONObject.toString());
        if (!m13641i(this.f13032e, this.f13033f)) {
            Log.e(str, "CredentialManager not available while getting credentials.");
            this.f13028a.m13369h("Credentials.getCredentialsResponse", m13630f(5, null));
        } else {
            m13642n(jSONObject, this.f13032e, this.f13033f, this.f13028a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m13633j(JSONObject jSONObject) {
        Log.v(f13027g, "isAvailable request: " + jSONObject.toString());
        m13643p(jSONObject, this.f13032e, this.f13033f, this.f13028a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m13634k(JSONObject jSONObject) {
        String str = f13027g;
        Log.v(str, "registerCredentials request: " + jSONObject.toString());
        if (!m13641i(this.f13032e, this.f13033f)) {
            Log.e(str, "CredentialManager not available while registering credentials.");
            this.f13028a.m13369h("Credentials.registerCredentialsResponse", m13630f(5, null));
        } else {
            m13644r(jSONObject, this.f13032e, this.f13033f, this.f13028a);
        }
    }

    /* renamed from: u */
    public static C3104d m13639u() {
        return c.f13038a;
    }

    /* renamed from: e */
    JSONObject m13640e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null || str.isEmpty()) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject2.has("id")) {
                jSONObject3.put("id", jSONObject2.getString("id"));
            }
            if (jSONObject2.has("rawId")) {
                jSONObject3.put("rawId", jSONObject2.getString("rawId"));
            }
            if (jSONObject2.has("type")) {
                jSONObject3.put("type", jSONObject2.getString("type"));
            }
            if (jSONObject2.has("response")) {
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = jSONObject2.getJSONObject("response");
                if (jSONObject5.has("authenticatorData")) {
                    jSONObject4.put("authenticatorData", jSONObject5.getString("authenticatorData"));
                }
                if (jSONObject5.has("clientDataJSON")) {
                    jSONObject4.put("clientDataJSON", jSONObject5.getString("clientDataJSON"));
                }
                if (jSONObject5.has("signature")) {
                    jSONObject4.put("signature", jSONObject5.getString("signature"));
                }
                if (jSONObject5.has("userHandle")) {
                    jSONObject4.put("userHandle", jSONObject5.getString("userHandle"));
                }
                jSONObject3.put("response", jSONObject4);
            }
            if (!C1134c.m6537a().mo6593a1() || str2 == null || !str2.equalsIgnoreCase("all")) {
                return jSONObject3;
            }
            JSONObject jSONObject6 = new JSONObject();
            if (jSONObject2.has("username")) {
                jSONObject6.put("username", jSONObject2.getString("username"));
            }
            if (jSONObject2.has("password")) {
                jSONObject6.put("password", jSONObject2.getString("password"));
            }
            if (jSONObject6.length() > 0) {
                jSONObject.put("credentialType", "password");
                jSONObject.put("response", jSONObject6);
                return jSONObject;
            }
            if (jSONObject3.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("credentialType", "FIDO2");
            jSONObject.put("response", jSONObject3);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(f13027g, "JSON exception on getting credentials: ", e10);
            return jSONObject;
        }
    }

    /* renamed from: i */
    boolean m13641i(WeakReference<Activity> weakReference, C3105e c3105e) {
        if (weakReference != null && weakReference.get() != null) {
            if (C1134c.m6537a().mo6593a1()) {
                return true;
            }
            return c3105e.m13659j();
        }
        Log.e(f13027g, "Activity is not available!");
        return false;
    }

    /* renamed from: n */
    void m13642n(JSONObject jSONObject, WeakReference<Activity> weakReference, C3105e c3105e, MessageBus messageBus) {
        c3105e.m13655e(weakReference.get(), jSONObject, new b(messageBus));
    }

    /* renamed from: p */
    void m13643p(JSONObject jSONObject, WeakReference<Activity> weakReference, C3105e c3105e, MessageBus messageBus) {
        if (!m13641i(weakReference, c3105e)) {
            if (C1134c.m6537a().mo6593a1()) {
                messageBus.m13369h("Credentials.isAvailableResponse", m13632h(false, false, false));
                return;
            } else {
                messageBus.m13369h("Credentials.isAvailableResponse", m13631g(false, false));
                return;
            }
        }
        if (C1134c.m6537a().mo6593a1()) {
            boolean m13659j = c3105e.m13659j();
            messageBus.m13369h("Credentials.isAvailableResponse", m13632h(m13659j, m13659j, true));
        } else {
            messageBus.m13369h("Credentials.isAvailableResponse", m13631g(true, true));
        }
    }

    /* renamed from: r */
    void m13644r(JSONObject jSONObject, WeakReference<Activity> weakReference, C3105e c3105e, MessageBus messageBus) {
        Activity activity = weakReference.get();
        String str = null;
        if (C1134c.m6537a().mo6593a1()) {
            try {
                if (jSONObject.has("credentialType")) {
                    String string = jSONObject.getString("credentialType");
                    if (!string.isEmpty()) {
                        if (string.equalsIgnoreCase("FIDO2") && !c3105e.m13659j()) {
                            messageBus.m13369h("Credentials.registerCredentialsResponse", m13630f(5, null));
                            return;
                        }
                        str = string;
                    }
                }
                messageBus.m13369h("Credentials.registerCredentialsResponse", m13630f(3, "Credential type not specified!"));
                return;
            } catch (JSONException unused) {
                messageBus.m13369h("Credentials.registerCredentialsResponse", m13630f(4, null));
                return;
            }
        }
        try {
            jSONObject = jSONObject.getJSONObject("parameters").getJSONObject("publicKey");
        } catch (JSONException e10) {
            Log.e(f13027g, "JSON exception on registering credentials: ", e10);
            messageBus.m13369h("Credentials.registerCredentialsResponse", new JSONObject());
            return;
        }
        c3105e.m13652b(activity, jSONObject, str, new a(messageBus));
    }

    /* renamed from: s */
    JSONObject m13645s(String str) {
        JSONObject jSONObject = new JSONObject();
        Log.v(f13027g, "register credential result: " + str);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("id")) {
                    jSONObject.put("id", jSONObject2.getString("id"));
                }
                if (jSONObject2.has("rawId")) {
                    jSONObject.put("rawId", jSONObject2.getString("rawId"));
                }
                if (jSONObject2.has("type")) {
                    jSONObject.put("type", jSONObject2.getString("type"));
                }
                if (jSONObject2.has("response")) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("response");
                    if (jSONObject4.has("clientDataJSON")) {
                        jSONObject3.put("clientDataJSON", jSONObject4.getString("clientDataJSON"));
                    }
                    if (jSONObject4.has("attestationObject")) {
                        jSONObject3.put("attestationObject", jSONObject4.getString("attestationObject"));
                    }
                    jSONObject.put("response", jSONObject3);
                }
                if (jSONObject2.has("authenticatorAttachment")) {
                    jSONObject.put("authenticatorAttachment", jSONObject2.getString("authenticatorAttachment"));
                }
            } catch (JSONException e10) {
                Log.e(f13027g, "JSON exception on registering credentials: ", e10);
            }
        }
        return jSONObject;
    }

    /* renamed from: t */
    public void m13646t(Activity activity) {
        this.f13032e = new WeakReference<>(activity);
    }

    private C3104d(MessageBus messageBus) {
        this.f13028a = messageBus;
        this.f13033f = new C3105e();
        this.f13029b = messageBus.m13372m("Credentials.isAvailableRequest", new Callback() { // from class: ea.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3104d.this.m13633j(jSONObject);
            }
        });
        this.f13030c = messageBus.m13372m("Credentials.registerCredentialsRequest", new Callback() { // from class: ea.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3104d.this.m13634k(jSONObject);
            }
        });
        this.f13031d = messageBus.m13372m("Credentials.getCredentialsRequest", new Callback() { // from class: ea.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C3104d.this.m13635l(jSONObject);
            }
        });
    }
}
