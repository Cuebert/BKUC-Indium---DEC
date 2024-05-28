package p315y9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.IntentSenderRequest;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
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

/* renamed from: y9.i */
/* loaded from: classes.dex */
public class C5924i {

    /* renamed from: a */
    private MessageBus f21798a;

    /* renamed from: b */
    private Context f21799b;

    /* renamed from: c */
    private WeakReference<AbstractC0141b<IntentSenderRequest>> f21800c;

    /* renamed from: d */
    private Connection f21801d;

    /* renamed from: e */
    private Connection f21802e;

    /* renamed from: f */
    private Connection f21803f;

    /* renamed from: g */
    private Connection f21804g;

    /* renamed from: h */
    private Connection f21805h;

    /* renamed from: i */
    private Connection f21806i;

    /* renamed from: j */
    private Connection f21807j;

    /* renamed from: k */
    private Connection f21808k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.i$a */
    /* loaded from: classes.dex */
    public class a implements C3683j.b {
        a() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("supportsGetSMSOTP_" + str);
            C5924i.this.m21047K("supportsGetSMSOTP", "support", false);
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
            C5924i.this.m21047K("supportsGetSMSOTP", "support", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.i$b */
    /* loaded from: classes.dex */
    public class b implements C3683j.b {
        b() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("getPhoneNumber_" + str);
            C5924i.this.m21046J("getPhoneNumber");
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9.i$c */
    /* loaded from: classes.dex */
    public class c implements C3683j.b {
        c() {
        }

        @Override // p131ja.C3683j.b
        /* renamed from: a */
        public void mo15642a(String str) {
            C3969a.m16695e().m16697b("supportsGetPhoneNumber_" + str);
            C5924i.this.m21047K("supportsGetPhoneNumber", "support", false);
        }

        @Override // p131ja.C3683j.b
        public void onSuccess() {
            C5924i.this.m21047K("supportsGetPhoneNumber", "support", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.i$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private static C5924i f21812a = new C5924i(MessageBus.m13364e(), null);
    }

    /* synthetic */ C5924i(MessageBus messageBus, a aVar) {
        this(messageBus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m21046J(String str) {
        this.f21798a.m13370i("NativeUtilProtocol", str, new JSONObject(), 13, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m21047K(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, z10);
            this.f21798a.m13370i("NativeUtilProtocol", str, jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("NativeUtilProtocol", "JSON exception in " + str + ": " + e10.toString());
            this.f21798a.m13370i("NativeUtilProtocol", str, new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: O */
    public static C5924i m21048O() {
        return d.f21812a;
    }

    /* renamed from: k */
    private static boolean m21059k() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetPhoneNumberTemp");
    }

    /* renamed from: l */
    private static boolean m21060l() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetSMSOTPTemp");
    }

    /* renamed from: m */
    private static boolean m21061m() {
        return C1134c.m6537a().mo6637p0();
    }

    /* renamed from: n */
    private static boolean m21062n() {
        return C1134c.m6537a().mo6549F();
    }

    /* renamed from: o */
    private static boolean m21063o() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidSwitchToSettingsApp");
    }

    /* renamed from: p */
    private static boolean m21064p() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidNativeUtilProtocol");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m21071x(JSONObject jSONObject) {
        WeakReference<AbstractC0141b<IntentSenderRequest>> weakReference;
        Log.d("NativeUtilProtocol", "onGetPhoneNumber: " + jSONObject.toString());
        if (m21064p() && m21059k() && !m21061m()) {
            if (this.f21799b != null && (weakReference = this.f21800c) != null && weakReference.get() != null) {
                C3683j.m15648f().m15656m(this.f21799b, this.f21800c.get(), new b());
            } else {
                Log.e("NativeUtilProtocol", "Context or launcher is null while getting phone number!");
                m21083M(BuildConfig.FLAVOR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m21069v(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onGetSMSOTP: " + jSONObject.toString());
        m21085q(this.f21799b, new C6027d());
    }

    /* renamed from: C */
    public void m21075C(Context context, Intent intent) {
        if (!m21064p() || !m21059k() || m21061m() || context == null || intent == null) {
            return;
        }
        m21083M(C3683j.m15648f().m15653e(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m21065r(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSendSMS: " + jSONObject.toString());
        if (m21064p()) {
            boolean z10 = false;
            try {
                String string = jSONObject.getString("address");
                String string2 = jSONObject.getString("message");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", string, null));
                intent.addFlags(268468224);
                intent.putExtra("sms_body", string2);
                this.f21799b.startActivity(intent);
                z10 = true;
            } catch (ActivityNotFoundException e10) {
                Log.e("NativeUtilProtocol", "Exception while handling send SMS request: " + e10.toString());
            } catch (JSONException e11) {
                Log.e("NativeUtilProtocol", "Exception while handling send SMS request: " + e11.toString());
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sent", z10);
                this.f21798a.m13370i("NativeUtilProtocol", "sendSMS", jSONObject2, 0, new HashMap());
            } catch (JSONException e12) {
                Log.e("NativeUtilProtocol", "Exception while handling send SMS request: " + e12.toString());
                this.f21798a.m13370i("NativeUtilProtocol", "sendSMS", new JSONObject(), 13, new HashMap());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m21072y(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSupportsGetPhoneNumber: " + jSONObject.toString());
        if (m21064p() && m21059k() && !m21061m() && this.f21799b != null) {
            C3683j.m15648f().m15654g(this.f21799b, new c());
        } else {
            m21047K("supportsGetPhoneNumber", "support", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m21070w(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSupportsGetSMSOTP: " + jSONObject.toString());
        if (m21064p() && m21060l() && !m21062n() && this.f21799b != null) {
            C3683j.m15648f().m15654g(this.f21799b, new a());
        } else {
            m21047K("supportsGetSMSOTP", "support", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m21066s(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSupportsSMS: " + jSONObject.toString());
        boolean hasSystemFeature = m21064p() ? this.f21799b.getPackageManager().hasSystemFeature("android.hardware.telephony") : false;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", hasSystemFeature);
            this.f21798a.m13370i("NativeUtilProtocol", "supportsSMS", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("NativeUtilProtocol", "JSON exception while handling supports sms request: " + e10.toString());
            this.f21798a.m13370i("NativeUtilProtocol", "supportsSMS", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m21067t(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        boolean m21063o = m21063o();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", m21063o);
            this.f21798a.m13370i("NativeUtilProtocol", "supportsSwitchToSettingsApp", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("NativeUtilProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
            this.f21798a.m13370i("NativeUtilProtocol", "supportsSwitchToSettingsApp", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m21068u(JSONObject jSONObject) {
        Log.d("NativeUtilProtocol", "onSwitchToSettingsApp: " + jSONObject.toString());
        if (m21063o()) {
            try {
                this.f21799b.startActivity(new Intent("android.settings.SETTINGS"));
            } catch (ActivityNotFoundException e10) {
                Log.e("NativeUtilProtocol", "Exception while handling switch to settings app request: " + e10.toString());
            }
            new JSONObject();
            this.f21798a.m13370i("NativeUtilProtocol", "switchToSettingsApp", new JSONObject(), 0, new HashMap());
        }
    }

    /* renamed from: L */
    public void m21082L(Context context) {
        this.f21799b = context;
    }

    /* renamed from: M */
    void m21083M(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", str);
                    this.f21798a.m13370i("NativeUtilProtocol", "getPhoneNumber", jSONObject, 0, new HashMap());
                    return;
                }
            } catch (JSONException e10) {
                Log.e("NativeUtilProtocol", "Exception while handling get phone number request", e10);
            }
        }
        m21046J("getPhoneNumber");
    }

    /* renamed from: N */
    public void m21084N(AbstractC0141b<IntentSenderRequest> abstractC0141b) {
        this.f21800c = new WeakReference<>(abstractC0141b);
    }

    /* renamed from: q */
    void m21085q(Context context, C6027d c6027d) {
        if (m21064p() && m21060l() && !m21062n()) {
            if (context == null) {
                this.f21798a.m13370i("NativeUtilProtocol", "getSMSOTP", new JSONObject(), 13, new HashMap());
            } else {
                c6027d.m21351a(context, "NativeUtilProtocol");
            }
        }
    }

    /* renamed from: z */
    public void m21086z(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", str);
            this.f21798a.m13370i("NativeUtilProtocol", "getSMSOTP", jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("NativeUtilProtocol", "JSON exception while handling supports get sms otp: " + e10.toString());
            m21046J("getSMSOTP");
        }
    }

    private C5924i(MessageBus messageBus) {
        this.f21798a = messageBus;
        this.f21801d = messageBus.m13374o("NativeUtilProtocol", "sendSMS", new Callback() { // from class: y9.f
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21065r(jSONObject);
            }
        });
        this.f21802e = messageBus.m13374o("NativeUtilProtocol", "supportsSMS", new Callback() { // from class: y9.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21066s(jSONObject);
            }
        });
        this.f21803f = messageBus.m13374o("NativeUtilProtocol", "supportsSwitchToSettingsApp", new Callback() { // from class: y9.g
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21067t(jSONObject);
            }
        });
        this.f21804g = messageBus.m13374o("NativeUtilProtocol", "switchToSettingsApp", new Callback() { // from class: y9.e
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21068u(jSONObject);
            }
        });
        this.f21805h = messageBus.m13374o("NativeUtilProtocol", "getSMSOTP", new Callback() { // from class: y9.h
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21069v(jSONObject);
            }
        });
        this.f21806i = messageBus.m13374o("NativeUtilProtocol", "supportsGetSMSOTP", new Callback() { // from class: y9.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21070w(jSONObject);
            }
        });
        this.f21807j = messageBus.m13374o("NativeUtilProtocol", "getPhoneNumber", new Callback() { // from class: y9.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21071x(jSONObject);
            }
        });
        this.f21808k = messageBus.m13374o("NativeUtilProtocol", "supportsGetPhoneNumber", new Callback() { // from class: y9.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C5924i.this.m21072y(jSONObject);
            }
        });
    }
}
