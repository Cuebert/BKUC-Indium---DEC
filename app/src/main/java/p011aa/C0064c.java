package p011aa;

import android.util.Log;
import com.roblox.universalapp.account.JNIAccountProtocol;
import com.roblox.universalapp.messagebus.C2947b;
import com.roblox.universalapp.messagebus.InterfaceC2946a;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aa.c */
/* loaded from: classes.dex */
public class C0064c {

    /* renamed from: a */
    private MessageBus f240a;

    /* renamed from: aa.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private static C0064c f241a = new C0064c(MessageBus.m13364e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C2947b m285c(JSONObject jSONObject) {
        C2947b c2947b = new C2947b();
        try {
            c2947b.f12129a.put(JNIAccountProtocol.getSupportKey(), true);
        } catch (JSONException e10) {
            Log.e("AccountProtocol", "Exception while handling DeviceIntegrityAvailable request: " + e10.toString());
        }
        return c2947b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C2947b m286d(JSONObject jSONObject) {
        return C0067f.m293h().m294c(jSONObject);
    }

    /* renamed from: e */
    public static C0064c m287e() {
        return b.f241a;
    }

    private C0064c(MessageBus messageBus) {
        this.f240a = messageBus;
        messageBus.m13371l(JNIAccountProtocol.getProtocolName(), JNIAccountProtocol.getDeviceIntegrityAvailableMethodName(), new InterfaceC2946a() { // from class: aa.b
            @Override // com.roblox.universalapp.messagebus.InterfaceC2946a
            /* renamed from: a */
            public final C2947b mo282a(JSONObject jSONObject) {
                C2947b m285c;
                m285c = C0064c.m285c(jSONObject);
                return m285c;
            }
        });
        messageBus.m13371l(JNIAccountProtocol.getProtocolName(), JNIAccountProtocol.getGetIntegrityTokenMethodName(), new InterfaceC2946a() { // from class: aa.a
            @Override // com.roblox.universalapp.messagebus.InterfaceC2946a
            /* renamed from: a */
            public final C2947b mo282a(JSONObject jSONObject) {
                C2947b m286d;
                m286d = C0064c.m286d(jSONObject);
                return m286d;
            }
        });
    }
}
