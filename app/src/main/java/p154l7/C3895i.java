package p154l7;

import com.roblox.client.realtime.RealtimeService;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p156l9.AbstractC3900a;
import p156l9.C3901b;
import p178n8.C4076b;

/* renamed from: l7.i */
/* loaded from: classes.dex */
public class C3895i extends C3901b {

    /* renamed from: l7.i$b */
    /* loaded from: classes.dex */
    private class b implements C3901b.b {
        private b() {
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.m13042e());
                jSONObject.put("sequenceNumber", RealtimeService.m13041d());
                jSONObject.put("namespaceSequenceNumbers", C4076b.m16963a().m16964b());
                C1151k.m6714h("rbx.signalr", "RBHybridModuleRealtime IsConnectedFunction.execute() command:" + abstractC3900a.m16542f() + " callback:" + jSONObject);
                abstractC3900a.mo16537a(true, jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
                abstractC3900a.mo16537a(false, null);
            }
        }
    }

    public C3895i() {
        super("RealTime");
        m16549d("isConnected", new b());
    }
}
