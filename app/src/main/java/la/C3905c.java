package la;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.universalapp.linking.JNILinkingProtocol;
import com.roblox.universalapp.messagebus.C2947b;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.InterfaceC2946a;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: la.c */
/* loaded from: classes.dex */
public class C3905c {

    /* renamed from: k */
    private static C3905c f16185k;

    /* renamed from: l */
    private static AtomicInteger f16186l = new AtomicInteger();

    /* renamed from: c */
    private WeakReference<Context> f16189c;

    /* renamed from: d */
    private Context f16190d;

    /* renamed from: i */
    private Connection f16195i;

    /* renamed from: j */
    private Connection f16196j;

    /* renamed from: a */
    private HashMap<String, Object> f16187a = new HashMap<>();

    /* renamed from: b */
    private MessageBus f16188b = MessageBus.m13364e();

    /* renamed from: e */
    private boolean f16191e = false;

    /* renamed from: f */
    private ArrayList<Connection> f16192f = new ArrayList<>();

    /* renamed from: g */
    private Connection f16193g = null;

    /* renamed from: h */
    private Intent f16194h = null;

    /* renamed from: la.c$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC2946a {
        a() {
        }

        @Override // com.roblox.universalapp.messagebus.InterfaceC2946a
        /* renamed from: a */
        public C2947b mo282a(JSONObject jSONObject) {
            return C3905c.this.m16560n(jSONObject);
        }
    }

    /* renamed from: la.c$b */
    /* loaded from: classes.dex */
    class b implements Callback {
        b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            C3905c.this.m16559k(jSONObject);
        }
    }

    /* renamed from: la.c$c */
    /* loaded from: classes.dex */
    class c implements Callback {

        /* renamed from: a */
        final /* synthetic */ d f16199a;

        c(d dVar) {
            this.f16199a = dVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                this.f16199a.mo12241a(jSONObject.getBoolean(JNILinkingProtocol.getIsRegisteredKey()));
            } catch (JSONException e10) {
                Log.e("LinkingProtocol", "Failed to check whether this URL is registered due to: " + e10.getMessage());
            }
        }
    }

    /* renamed from: la.c$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo12241a(boolean z10);
    }

    private C3905c() {
        if (m16556g()) {
            this.f16195i = this.f16188b.m13374o("Linking", "supportsSwitchToSettingsApp", new Callback() { // from class: la.a
                @Override // com.roblox.universalapp.messagebus.Callback
                /* renamed from: a */
                public final void mo6401a(JSONObject jSONObject) {
                    C3905c.this.m16557i(jSONObject);
                }
            });
            this.f16196j = this.f16188b.m13374o("Linking", "switchToSettingsApp", new Callback() { // from class: la.b
                @Override // com.roblox.universalapp.messagebus.Callback
                /* renamed from: a */
                public final void mo6401a(JSONObject jSONObject) {
                    C3905c.this.m16558j(jSONObject);
                }
            });
        }
    }

    /* renamed from: g */
    private static boolean m16556g() {
        return NativeSettingsInterface.nativeGetFFlag("EnableAndroidLinkingProtocolSwitchToSettingsApp2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m16559k(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            String string = jSONObject.getString(JNILinkingProtocol.getUrlKey());
            Log.i("LinkingProtocol", "Opening URL: " + string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            WeakReference<Context> weakReference = this.f16189c;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context != null) {
                context.startActivity(intent);
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), true);
            } else {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            }
            this.f16188b.m13369h(JNILinkingProtocol.getOpenURLResponseId(), jSONObject2);
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found: " + e10.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
                this.f16188b.m13369h(JNILinkingProtocol.getOpenURLResponseId(), jSONObject2);
            } catch (JSONException unused) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e10.getMessage());
            }
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Retrieving URL from JSON params for Open URL Request failed with error: " + e11.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
                this.f16188b.m13369h(JNILinkingProtocol.getOpenURLResponseId(), jSONObject2);
            } catch (JSONException unused2) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public C2947b m16560n(JSONObject jSONObject) {
        C2947b c2947b = new C2947b();
        JSONObject jSONObject2 = new JSONObject();
        try {
            String string = jSONObject.getString(JNILinkingProtocol.getUrlKey());
            Log.i("LinkingProtocol", "Opening URL: " + string);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            WeakReference<Context> weakReference = this.f16189c;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context != null) {
                context.startActivity(intent);
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), true);
            } else {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e("LinkingProtocol", "Activity not found: " + e10.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e10.getMessage());
            }
        } catch (JSONException e11) {
            Log.e("LinkingProtocol", "Retrieving URL from JSON params for Open URL Request failed with error: " + e11.getMessage());
            try {
                jSONObject2.put(JNILinkingProtocol.getSuccessKey(), false);
            } catch (JSONException unused2) {
                Log.e("LinkingProtocol", "Failed to write failure JSON with error: " + e11.getMessage());
            }
        }
        c2947b.f12129a = jSONObject2;
        return c2947b;
    }

    /* renamed from: r */
    public static C3905c m16561r() {
        if (f16186l.getAndIncrement() == 0) {
            f16185k = new C3905c();
        }
        return f16185k;
    }

    /* renamed from: e */
    public void m16562e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            this.f16188b.m13369h(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    /* renamed from: f */
    public void m16563f(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            jSONObject.put(JNILinkingProtocol.getAttributionUrlKey(), str2);
            this.f16188b.m13369h(JNILinkingProtocol.getDetectURLId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Constructing JSON params for URL detection failed with error: " + e10.getMessage());
        }
    }

    /* renamed from: h */
    public void m16564h(String str, d dVar) {
        this.f16193g = this.f16188b.m13373n(JNILinkingProtocol.getIsURLRegisteredResponseId(), new c(dVar), true);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNILinkingProtocol.getUrlKey(), str);
            this.f16188b.m13369h(JNILinkingProtocol.getIsURLRegisteredRequestId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "Failed to construt IsURLRegisteredRequest JSON due to: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m16557i(JSONObject jSONObject) {
        Log.d("LinkingProtocol", "onSupportsSwitchToSettingsApp: " + jSONObject.toString());
        boolean m16556g = m16556g();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", m16556g);
            this.f16188b.m13370i("Linking", "supportsSwitchToSettingsApp", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("LinkingProtocol", "JSON exception while handling supports switch to settings app request: " + e10.toString());
            this.f16188b.m13370i("Linking", "supportsSwitchToSettingsApp", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m16558j(JSONObject jSONObject) {
        Log.d("LinkingProtocol", "onSwitchToSettingsApp: " + jSONObject.toString());
        if (m16556g()) {
            try {
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.setFlags(268435456);
                this.f16190d.startActivity(intent);
            } catch (ActivityNotFoundException e10) {
                Log.e("LinkingProtocol", "Activity not found exception while handling switch to settings app request Activity Not Found: " + e10.toString());
            } catch (Exception e11) {
                Log.e("LinkingProtocol", "Exception while handling switch to settings app request: " + e11.toString());
            }
            new JSONObject();
            this.f16188b.m13370i("Linking", "switchToSettingsApp", new JSONObject(), 0, new HashMap());
        }
    }

    /* renamed from: o */
    public void m16567o() {
        Intent intent = this.f16194h;
        if (intent != null) {
            m16562e(intent.getDataString());
        }
    }

    /* renamed from: p */
    public void m16568p(Context context) {
        this.f16190d = context;
    }

    /* renamed from: q */
    public void m16569q(Intent intent) {
        this.f16194h = intent;
    }

    /* renamed from: s */
    public void m16570s(Context context) {
        if (this.f16191e) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Already started.");
            return;
        }
        this.f16191e = true;
        this.f16189c = new WeakReference<>(context);
        if (NativeSettingsInterface.nativeGetFFlag("OpenURLUseRequestResponse")) {
            this.f16188b.m13371l(JNILinkingProtocol.getProtocolName(), JNILinkingProtocol.getOpenURLId(), new a());
        } else {
            this.f16192f.add(this.f16188b.m13372m(JNILinkingProtocol.getOpenURLRequestId(), new b()));
        }
    }

    /* renamed from: t */
    public void m16571t() {
        if (!this.f16191e) {
            Log.w("LinkingProtocol", "Unbalanced calls to start and stop. Not started.");
            return;
        }
        this.f16191e = false;
        Iterator<Connection> it = this.f16192f.iterator();
        while (it.hasNext()) {
            it.next().m13359a();
        }
        this.f16192f.clear();
        this.f16187a.clear();
        this.f16189c = null;
    }
}
