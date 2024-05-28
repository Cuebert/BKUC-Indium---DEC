package p155l8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.C2877p0;
import com.roblox.client.C2913x;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.p038v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.startup.ActivitySplash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;
import p035c9.C1150j;
import p035c9.C1151k;
import p059e5.C3077i;
import p288w8.EnumC5480o;

/* renamed from: l8.a */
/* loaded from: classes.dex */
public class C3897a implements InterfaceC3899c {

    /* renamed from: a */
    private String f16141a;

    /* renamed from: b */
    private String f16142b;

    /* renamed from: c */
    private String f16143c;

    /* renamed from: d */
    private String f16144d;

    /* renamed from: e */
    private String f16145e;

    /* renamed from: f */
    private String f16146f;

    /* renamed from: g */
    private String f16147g;

    /* renamed from: h */
    private String f16148h;

    /* renamed from: i */
    private int f16149i;

    /* renamed from: j */
    private String f16150j;

    /* renamed from: k */
    private boolean f16151k;

    /* renamed from: l */
    private long f16152l;

    /* renamed from: m */
    private String f16153m;

    /* renamed from: n */
    private String f16154n;

    /* renamed from: o */
    private int f16155o;

    /* renamed from: p */
    private String f16156p;

    /* renamed from: q */
    private boolean f16157q;

    /* renamed from: r */
    private final Map<String, InterfaceC3899c> f16158r;

    /* renamed from: s */
    private EnumC3898b f16159s;

    /* renamed from: t */
    private long f16160t;

    /* renamed from: u */
    private String f16161u;

    /* renamed from: v */
    private boolean f16162v;

    /* renamed from: w */
    private List<NameValuePair> f16163w = new ArrayList();

    public C3897a(Map<String, String> map) {
        this.f16141a = map.get("version");
        this.f16142b = map.get("notificationType");
        this.f16143c = map.get("notificationId");
        this.f16144d = map.get("body");
        this.f16145e = map.get("title");
        this.f16146f = map.get("iconUrl");
        this.f16147g = map.get("tag");
        this.f16148h = map.get("sound");
        this.f16149i = C1150j.m6706a(map.get("badge"), 1);
        this.f16150j = map.get("linkOnInteraction");
        this.f16154n = map.get("importanceChannel");
        this.f16155o = C1150j.m6706a(map.get("visibility"), 1);
        for (String str : map.keySet()) {
            if (str.startsWith("ClientEventField.")) {
                this.f16163w.add(new NameValuePair(str, map.get(str)));
            }
        }
        this.f16156p = map.get("notificationTypeData");
        this.f16157q = "CallReceived".equals(this.f16142b);
        if (!C2877p0.m12935m0() && C1134c.m6537a().mo6567O()) {
            this.f16158r = m16510B(map.get("states"));
        } else {
            this.f16158r = new HashMap();
        }
        if (C1134c.m6537a().mo6621k()) {
            try {
                Map<String, String> m16509A = m16509A(map.get("parameters"));
                if (m16509A.containsKey("IsChatReplyEnabled")) {
                    this.f16151k = Boolean.parseBoolean(m16509A.get("IsChatReplyEnabled"));
                }
                if (m16509A.containsKey("ConversationId")) {
                    this.f16152l = Long.parseLong(m16509A.get("ConversationId"));
                }
                if (m16509A.containsKey("MessageId")) {
                    this.f16153m = m16509A.get("MessageId");
                }
            } catch (Exception unused) {
                this.f16151k = false;
                C1151k.m6712f("PushNotification", "Could not build notification reply payload");
            }
        }
        if (C1134c.m6537a().mo6589Z()) {
            try {
                this.f16159s = EnumC3898b.valueOf(map.get("thumbnailType"));
                this.f16160t = Long.parseLong(map.get("thumbnailId"));
                this.f16161u = map.get("thumbnailDefaultUrl");
            } catch (Exception e10) {
                this.f16159s = EnumC3898b.none;
                this.f16160t = 0L;
                C1151k.m6712f("PushNotification", "Could not build thumbnail data from payload. Exception : " + e10);
            }
        }
        if (C1134c.m6537a().mo6603e()) {
            try {
                Map<String, String> m16509A2 = m16509A(map.get("parameters"));
                if (m16509A2.containsKey("IsForegroundDisabled")) {
                    this.f16162v = Boolean.parseBoolean(m16509A2.get("IsForegroundDisabled"));
                } else {
                    this.f16162v = false;
                }
            } catch (Exception unused2) {
                this.f16162v = false;
                C1151k.m6712f("PushNotification", "Could not build notification isForegroundPushDisabled payload");
            }
        }
    }

    /* renamed from: A */
    private Map<String, String> m16509A(String str) {
        HashMap hashMap = new HashMap();
        if (!C3077i.m13559b(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e10) {
                C1151k.m6710d("PushNotification", "Push notification param parse exception.", e10);
            }
        }
        return hashMap;
    }

    /* renamed from: B */
    private Map<String, InterfaceC3899c> m16510B(String str) {
        HashMap hashMap = new HashMap();
        if (!C3077i.m13559b(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    HashMap hashMap2 = new HashMap();
                    String next = keys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        String string = jSONObject2.getString(next2);
                        if ("notificationId".equals(next2) || "tag".equals(next2) || "notificationType".equals(next2)) {
                            string = String.format("%s-%s", string, next);
                        }
                        hashMap2.put(next2, string);
                    }
                    hashMap.put(next, new C3897a(hashMap2));
                }
            } catch (JSONException e10) {
                C1151k.m6710d("PushNotification", "Push notification states parse exception.", e10);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public String m16511a() {
        return this.f16154n;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: b */
    public String mo16512b() {
        return this.f16143c;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: c */
    public PendingIntent mo16513c(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", mo16512b());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", mo16515e());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", m16536z());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", mo16530t());
        return PendingIntent.getActivity(context, mo16519i(), intent, 301989888);
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: d */
    public List<NameValuePair> mo16514d() {
        return this.f16163w;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: e */
    public String mo16515e() {
        return this.f16142b;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: f */
    public String mo16516f() {
        return "CallReceived".equals(this.f16142b) ? "channel_calls" : m16511a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p155l8.InterfaceC3899c
    /* renamed from: g */
    public int mo16517g() {
        char c10;
        String str = this.f16154n;
        if (str == null) {
            return 0;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -850397647:
                if (str.equals("channel_medium")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -609273347:
                if (str.equals("channel_urgent")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -468778798:
                if (str.equals("channel_minimum")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return -1;
            case 1:
                return 1;
            case 2:
                return -2;
            default:
                return 0;
        }
    }

    @Override // p155l8.InterfaceC3899c
    public String getTitle() {
        return this.f16145e;
    }

    @Override // p155l8.InterfaceC3899c
    public int getVisibility() {
        return this.f16155o;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: h */
    public String mo16518h() {
        return this.f16147g;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: i */
    public int mo16519i() {
        if (!C1134c.m6537a().mo6621k() || C3077i.m13559b(this.f16153m)) {
            return 3;
        }
        return this.f16153m.hashCode();
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: j */
    public String mo16520j() {
        return this.f16144d;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: k */
    public boolean mo16521k() {
        return this.f16157q;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: l */
    public int mo16522l(Context context) {
        String str = this.f16146f;
        if (str == null) {
            return C2913x.f11773v;
        }
        str.hashCode();
        return C2913x.f11773v;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: m */
    public Uri mo16523m(Context context) {
        if (TextUtils.isEmpty(this.f16148h)) {
            if (mo16521k()) {
                return Settings.System.DEFAULT_RINGTONE_URI;
            }
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f16148h.hashCode();
        return null;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: n */
    public boolean mo16524n() {
        return this.f16151k;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: o */
    public String mo16525o() {
        return this.f16153m;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: p */
    public boolean mo16526p() {
        return this.f16162v;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: q */
    public int mo16527q() {
        return this.f16149i;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: r */
    public String mo16528r() {
        return this.f16161u;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: s */
    public PendingIntent mo16529s(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", mo16515e());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", m16536z());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", mo16530t());
        return PendingIntent.getBroadcast(context, mo16519i(), intent, 301989888);
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: t */
    public String mo16530t() {
        return this.f16141a;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: u */
    public long mo16531u() {
        return this.f16152l;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: v */
    public long mo16532v() {
        return this.f16160t;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: w */
    public Map<String, InterfaceC3899c> mo16533w() {
        return this.f16158r;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: x */
    public EnumC3898b mo16534x() {
        return this.f16159s;
    }

    @Override // p155l8.InterfaceC3899c
    /* renamed from: y */
    public String mo16535y() {
        return this.f16156p;
    }

    /* renamed from: z */
    public String m16536z() {
        return this.f16150j;
    }
}
