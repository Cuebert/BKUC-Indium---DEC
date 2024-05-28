package p129j8;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p101h8.C3433g;
import p101h8.C3443q;

/* renamed from: j8.i */
/* loaded from: classes.dex */
public class C3666i {

    /* renamed from: a */
    private String f15394a;

    /* renamed from: b */
    private String f15395b;

    /* renamed from: c */
    private JSONObject f15396c;

    /* renamed from: d */
    private boolean f15397d;

    public C3666i(JSONObject jSONObject) throws JSONException, C3433g {
        this.f15394a = jSONObject.isNull("notificationId") ? null : jSONObject.getString("notificationId");
        this.f15395b = jSONObject.isNull("type") ? null : jSONObject.getString("type");
        this.f15396c = jSONObject.isNull("detail") ? null : jSONObject.getJSONObject("detail");
        this.f15397d = jSONObject.getBoolean("fallbackDelivered");
        m15604a();
    }

    /* renamed from: a */
    private void m15604a() throws C3433g {
        if (this.f15396c != null) {
            String str = this.f15395b;
            if (str != null && !TextUtils.isEmpty(str)) {
                if (!C3443q.m15153a(this.f15394a)) {
                    throw new C3433g("PushNotificationMetadata notificationId is invalid");
                }
                return;
            }
            throw new C3433g("PushNotificationMetadata notificationType is null or empty");
        }
        throw new C3433g("PushNotificationMetadata details object is null");
    }

    /* renamed from: b */
    public JSONObject m15605b() {
        return this.f15396c;
    }

    /* renamed from: c */
    public String m15606c() {
        return this.f15394a;
    }

    /* renamed from: d */
    public String m15607d() {
        return this.f15395b;
    }
}
