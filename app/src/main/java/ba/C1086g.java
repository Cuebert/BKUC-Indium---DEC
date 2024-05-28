package ba;

import android.util.Log;
import com.roblox.universalapp.call.JNICallProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ba.g */
/* loaded from: classes.dex */
public class C1086g {

    /* renamed from: j */
    private static final AtomicInteger f5330j = new AtomicInteger();

    /* renamed from: k */
    private static C1086g f5331k;

    /* renamed from: a */
    private final MessageBus f5332a;

    /* renamed from: b */
    private Connection f5333b;

    /* renamed from: c */
    private Connection f5334c;

    /* renamed from: d */
    private Connection f5335d;

    /* renamed from: e */
    private Connection f5336e;

    /* renamed from: f */
    private Connection f5337f;

    /* renamed from: g */
    private Connection f5338g;

    /* renamed from: h */
    private boolean f5339h;

    /* renamed from: i */
    private Set<a> f5340i = new HashSet();

    /* renamed from: ba.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: K */
        void mo6428K(String str);

        /* renamed from: T */
        void mo6429T(String str, String str2, String str3, String str4, String str5, String str6);

        /* renamed from: W */
        void mo6430W(String str, String str2, String str3, String str4, String str5, String str6);

        /* renamed from: a0 */
        void mo6431a0(String str);

        /* renamed from: g0 */
        void mo6432g0(String str, String str2);

        /* renamed from: p */
        void mo6433p(String str, boolean z10);
    }

    C1086g(MessageBus messageBus) {
        messageBus = messageBus == null ? MessageBus.m13364e() : messageBus;
        this.f5332a = messageBus;
        this.f5338g = messageBus.m13372m(JNICallProtocol.getHandleConnectingCallId(), new Callback() { // from class: ba.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6408j(jSONObject);
            }
        });
        this.f5333b = messageBus.m13372m(JNICallProtocol.getHandleReceiveCallId(), new Callback() { // from class: ba.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6409k(jSONObject);
            }
        });
        this.f5334c = messageBus.m13372m(JNICallProtocol.getHandleAnswerCallId(), new Callback() { // from class: ba.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6410l(jSONObject);
            }
        });
        this.f5335d = messageBus.m13372m(JNICallProtocol.getHandleEndCallId(), new Callback() { // from class: ba.f
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6411m(jSONObject);
            }
        });
        this.f5336e = messageBus.m13372m(JNICallProtocol.getHandleActiveCallId(), new Callback() { // from class: ba.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6412n(jSONObject);
            }
        });
        this.f5337f = messageBus.m13372m(JNICallProtocol.getHandleRemovePendingReceivedCall(), new Callback() { // from class: ba.e
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1086g.this.m6413o(jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m6412n(JSONObject jSONObject) {
        String optString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String optString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String optString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String optString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String optString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6430W(optString, optString2, optString3, optString5, optString4, optString6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m6410l(JSONObject jSONObject) {
        String optString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6428K(optString);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m6408j(JSONObject jSONObject) {
        this.f5339h = true;
        String optString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String optString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String optString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String optString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String optString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6429T(optString, optString2, optString3, optString5, optString4, optString6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m6411m(JSONObject jSONObject) {
        this.f5339h = false;
        String optString = jSONObject.optString(JNICallProtocol.getCallActionKey());
        String optString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6432g0(optString2, optString);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m6409k(JSONObject jSONObject) {
        this.f5339h = true;
        String optString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        boolean optBoolean = jSONObject.optBoolean(JNICallProtocol.getIsDuplicateKey());
        boolean optBoolean2 = jSONObject.optBoolean(JNICallProtocol.getIsExpiredKey());
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6433p(optString, (optBoolean || optBoolean2) ? false : true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m6413o(JSONObject jSONObject) {
        synchronized (this) {
            Iterator it = new HashSet(this.f5340i).iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo6431a0(jSONObject.optString(JNICallProtocol.getNotificationIdKey()));
            }
        }
    }

    /* renamed from: y */
    public static C1086g m6420y() {
        if (f5330j.getAndIncrement() == 0) {
            f5331k = new C1086g(null);
        }
        return f5331k;
    }

    /* renamed from: g */
    public void m6421g(a aVar) {
        synchronized (this) {
            this.f5340i.add(aVar);
        }
    }

    /* renamed from: h */
    public void m6422h(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f5332a.m13369h(JNICallProtocol.getFinishCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for finish call failed with error: " + e10.getMessage());
        }
    }

    /* renamed from: i */
    public boolean m6423i() {
        return this.f5339h;
    }

    /* renamed from: v */
    public void m6424v(String str, long j10, String str2, long j11, String str3, long j12, String str4, String str5, long j13, boolean z10, String str6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            jSONObject.put(JNICallProtocol.getCallerUserIdKey(), j10);
            jSONObject.put(JNICallProtocol.getCallerCombinedNameKey(), str2);
            jSONObject.put(JNICallProtocol.getCalleeUserIdKey(), j11);
            jSONObject.put(JNICallProtocol.getCalleeCombinedNameKey(), str3);
            jSONObject.put(JNICallProtocol.getPlaceIdKey(), j12);
            jSONObject.put(JNICallProtocol.getGameInstanceIdKey(), str4);
            jSONObject.put(JNICallProtocol.getReservedServerAccessCodeKey(), str5);
            jSONObject.put(JNICallProtocol.getCreatedUtcKey(), j13);
            jSONObject.put(JNICallProtocol.getIsCalleeMicEnabledKey(), z10);
            jSONObject.put(JNICallProtocol.getNotificationIdKey(), str6);
            JNICallProtocol.receiveCall(jSONObject.toString());
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for receive call failed with error.", e10);
        }
    }

    /* renamed from: w */
    public void m6425w(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f5332a.m13369h(JNICallProtocol.getRejectCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for reject call failed with error: " + e10.getMessage());
        }
    }

    /* renamed from: x */
    public void m6426x(a aVar) {
        synchronized (this) {
            this.f5340i.remove(aVar);
        }
    }

    /* renamed from: z */
    public void m6427z(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f5332a.m13369h(JNICallProtocol.getSuppressCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for suppress call failed with error: " + e10.getMessage());
        }
    }
}
