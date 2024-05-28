package p327z8;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z8.b */
/* loaded from: classes.dex */
public class C6023b {

    /* renamed from: a */
    private String f22102a;

    public C6023b(JSONObject jSONObject) throws JSONException {
        this.f22102a = jSONObject.isNull("themeType") ? null : jSONObject.getString("themeType");
    }

    /* renamed from: a */
    public String m21340a() {
        return this.f22102a;
    }
}
