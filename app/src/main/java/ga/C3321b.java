package ga;

import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;

/* renamed from: ga.b */
/* loaded from: classes.dex */
public class C3321b {

    /* renamed from: e */
    private static C3321b f13810e;

    /* renamed from: f */
    private static final AtomicInteger f13811f = new AtomicInteger();

    /* renamed from: g */
    private static final String f13812g = MessageBus.getMessageId("Experimentation", "userLayerLoadingStatusChanged");

    /* renamed from: h */
    private static final String f13813h = MessageBus.getMessageId("Experimentation", "registerUserLayers");

    /* renamed from: i */
    private static final String f13814i = MessageBus.getMessageId("Experimentation", "initializeUserLayers");

    /* renamed from: j */
    private static final String f13815j = MessageBus.getMessageId("Experimentation", "getUserLayerVariablesRequest");

    /* renamed from: k */
    private static final String f13816k = MessageBus.getMessageId("Experimentation", "getUserLayerVariablesResponse");

    /* renamed from: a */
    private final MessageBus f13817a = MessageBus.m13364e();

    /* renamed from: b */
    private final ArrayList<Connection> f13818b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<String> f13819c = new ArrayList<>();

    /* renamed from: d */
    private final Hashtable<String, JSONObject> f13820d = new Hashtable<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.b$a */
    /* loaded from: classes.dex */
    public class a implements Callback {
        a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                if (jSONObject.getString("status").equals("Initialized")) {
                    C3321b.this.m14602c();
                }
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Loading status of IXP User Layers is not returned from the MessageBus. File a bug to NFDN component. Error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga.b$b */
    /* loaded from: classes.dex */
    public class b implements Callback {
        b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3321b.this.f13820d.put(jSONObject.getString("layerName"), new JSONObject(jSONObject.getString("layerVariables")));
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Unable to get variables from layer. Error: " + e10.getMessage());
            }
        }
    }

    private C3321b() {
        m14603e();
        m14604f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m14602c() {
        Iterator<String> it = this.f13819c.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("layerName", next);
                this.f13817a.m13369h(f13815j, jSONObject);
            } catch (JSONException e10) {
                Log.e("ExperimentProtocol", "Failed to construct getUserLayerVariables JSON due to: " + e10.getMessage());
            }
        }
    }

    /* renamed from: e */
    private void m14603e() {
        this.f13818b.add(this.f13817a.m13372m(f13816k, new b()));
    }

    /* renamed from: f */
    private void m14604f() {
        this.f13818b.add(this.f13817a.m13372m(f13812g, new a()));
    }

    /* renamed from: h */
    private void m14605h(String[] strArr) {
        this.f13819c.addAll(Arrays.asList(strArr));
        try {
            JSONArray jSONArray = new JSONArray(strArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userLayers", jSONArray);
            this.f13817a.m13369h(f13813h, jSONObject);
        } catch (JSONException e10) {
            Log.e("ExperimentProtocol", "Failed to construct registerUserLayers JSON due to: " + e10.getMessage());
        }
    }

    /* renamed from: i */
    public static C3321b m14606i() {
        if (f13811f.getAndIncrement() == 0) {
            f13810e = new C3321b();
        }
        return f13810e;
    }

    /* renamed from: d */
    public JSONObject m14607d(String str) {
        return this.f13820d.get(str);
    }

    /* renamed from: g */
    public void m14608g() {
        ArrayList arrayList = new ArrayList();
        if (C1134c.m6537a().mo6639q()) {
            arrayList.add("Backgrounding.General");
        }
        if (C1134c.m6537a().mo6569P()) {
            arrayList.add("Engine.Interactivity.UICreation.NotchScreenSupport");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m14605h((String[]) arrayList.toArray(new String[0]));
    }
}
