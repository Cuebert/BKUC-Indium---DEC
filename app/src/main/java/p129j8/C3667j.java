package p129j8;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j8.j */
/* loaded from: classes.dex */
public class C3667j {

    /* renamed from: a */
    private String f15398a;

    /* renamed from: b */
    private JSONObject f15399b;

    public C3667j(JSONObject jSONObject) throws JSONException {
        this.f15398a = jSONObject.getString("statusMessage");
        this.f15399b = jSONObject.getJSONObject("metadata");
    }

    /* renamed from: a */
    public JSONObject m15608a() {
        return this.f15399b;
    }
}
