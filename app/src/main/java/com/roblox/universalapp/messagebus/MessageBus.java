package com.roblox.universalapp.messagebus;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MessageBus {

    /* renamed from: a */
    private static AtomicInteger f12122a = new AtomicInteger();

    /* renamed from: b */
    private static MessageBus f12123b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.universalapp.messagebus.MessageBus$a */
    /* loaded from: classes.dex */
    public class C2944a implements RawCallback {

        /* renamed from: a */
        final /* synthetic */ Callback f12124a;

        C2944a(Callback callback) {
            this.f12124a = callback;
        }

        public void run(String str) {
            try {
                this.f12124a.mo6401a(MessageBus.m13363d(str));
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in Do Subscribe failed with error: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.universalapp.messagebus.MessageBus$b */
    /* loaded from: classes.dex */
    public class C2945b implements RequestHandlerRaw {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2946a f12125a;

        /* renamed from: b */
        final /* synthetic */ String f12126b;

        /* renamed from: c */
        final /* synthetic */ String f12127c;

        C2945b(InterfaceC2946a interfaceC2946a, String str, String str2) {
            this.f12125a = interfaceC2946a;
            this.f12126b = str;
            this.f12127c = str2;
        }

        public String run(String str) {
            try {
                C2947b mo282a = this.f12125a.mo282a(MessageBus.m13363d(str));
                MessageBus.this.reportProtocolMethodResponseTelemetryData(this.f12126b, this.f12127c, mo282a.f12131c, MessageBus.m13367j(mo282a.f12130b));
                return MessageBus.m13367j(mo282a.f12129a);
            } catch (JSONException e10) {
                Log.e("MessageBus", "Serializing message params in getRequestHandlerRaw failed with error: " + e10.getMessage());
                return BuildConfig.FLAVOR;
            }
        }
    }

    private MessageBus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static JSONObject m13363d(String str) throws JSONException {
        return new JSONObject(str);
    }

    private native Connection doSubscribeProtocolMethodRequestRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeProtocolMethodResponseRaw(String str, String str2, RawCallback rawCallback, boolean z10);

    private native Connection doSubscribeRaw(String str, RawCallback rawCallback, boolean z10);

    /* renamed from: e */
    public static MessageBus m13364e() {
        if (f12122a.getAndIncrement() == 0) {
            f12123b = new MessageBus();
        }
        return f12123b;
    }

    /* renamed from: f */
    private static RawCallback m13365f(Callback callback) {
        return new C2944a(callback);
    }

    /* renamed from: g */
    private RequestHandlerRaw m13366g(String str, String str2, InterfaceC2946a interfaceC2946a) {
        return new C2945b(interfaceC2946a, str, str2);
    }

    public static native String getMessageId(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static String m13367j(JSONObject jSONObject) {
        return jSONObject.toString();
    }

    /* renamed from: k */
    private static String m13368k(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private native void makeRequestRaw(String str, String str2, String str3, RawCallback rawCallback);

    private native void reportProtocolMethodRequestTelemetryData(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void reportProtocolMethodResponseTelemetryData(String str, String str2, int i10, String str3);

    private native void setRequestHandlerRaw(String str, String str2, RequestHandlerRaw requestHandlerRaw);

    public native String getLastRaw(String str);

    /* renamed from: h */
    public void m13369h(String str, JSONObject jSONObject) {
        publishRaw(str, m13367j(jSONObject));
    }

    /* renamed from: i */
    public void m13370i(String str, String str2, JSONObject jSONObject, int i10, Map<String, String> map) {
        Log.d("MessageBus", String.format("Publish response for protocol: %s, method: %s.", str, str2));
        publishProtocolMethodResponseRaw(str, str2, m13367j(jSONObject), i10, m13368k(map));
    }

    /* renamed from: l */
    public void m13371l(String str, String str2, InterfaceC2946a interfaceC2946a) {
        setRequestHandlerRaw(str, str2, m13366g(str, str2, interfaceC2946a));
    }

    /* renamed from: m */
    public Connection m13372m(String str, Callback callback) {
        return m13373n(str, callback, false);
    }

    /* renamed from: n */
    public Connection m13373n(String str, Callback callback, boolean z10) {
        return doSubscribeRaw(str, m13365f(callback), z10);
    }

    /* renamed from: o */
    public Connection m13374o(String str, String str2, Callback callback) {
        return m13375p(str, str2, callback, false);
    }

    /* renamed from: p */
    public Connection m13375p(String str, String str2, Callback callback, boolean z10) {
        return doSubscribeProtocolMethodRequestRaw(str, str2, m13365f(callback), z10);
    }

    public native void publishProtocolMethodRequestRaw(String str, String str2, String str3, String str4);

    public native void publishProtocolMethodResponseRaw(String str, String str2, String str3, int i10, String str4);

    public native void publishRaw(String str, String str2);
}
