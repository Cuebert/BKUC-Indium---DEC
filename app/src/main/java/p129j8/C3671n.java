package p129j8;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j8.n */
/* loaded from: classes.dex */
public class C3671n {

    /* renamed from: a */
    private String f15408a;

    /* renamed from: b */
    private String f15409b;

    /* renamed from: c */
    private String f15410c;

    /* renamed from: d */
    private String f15411d;

    /* renamed from: e */
    private String f15412e;

    /* renamed from: f */
    private int f15413f;

    public C3671n(JSONObject jSONObject) throws JSONException {
        this.f15410c = jSONObject.getString("statusMessage");
        JSONObject jSONObject2 = jSONObject.getJSONObject("registration");
        this.f15408a = jSONObject2.getString("platform");
        this.f15409b = jSONObject2.getString("name");
        this.f15411d = jSONObject2.getString("notificationToken");
        this.f15412e = jSONObject2.getString("application");
        this.f15413f = jSONObject2.getInt("userPushNotificationDestinationId");
    }

    /* renamed from: a */
    public String m15612a() {
        return this.f15408a;
    }
}
