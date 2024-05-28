package p275v7;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v7.a */
/* loaded from: classes.dex */
public class C4990a {

    /* renamed from: a */
    private String f19082a;

    /* renamed from: b */
    private String f19083b;

    /* renamed from: c */
    private String f19084c;

    public C4990a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.isNull("signupAndLogin") ? null : jSONObject.getJSONObject("signupAndLogin");
        if (jSONObject2 != null) {
            m19433e(jSONObject2.isNull("locale") ? null : jSONObject2.getString("locale"));
        }
        JSONObject jSONObject3 = jSONObject.isNull("generalExperience") ? null : jSONObject.getJSONObject("generalExperience");
        if (jSONObject3 != null) {
            m19432d(jSONObject3.isNull("locale") ? null : jSONObject3.getString("locale"));
        }
        JSONObject jSONObject4 = jSONObject.isNull("ugc") ? null : jSONObject.getJSONObject("ugc");
        if (jSONObject4 != null) {
            m19437f(jSONObject4.isNull("locale") ? null : jSONObject4.getString("locale"));
        }
    }

    /* renamed from: d */
    private void m19432d(String str) {
        this.f19083b = str;
    }

    /* renamed from: e */
    private void m19433e(String str) {
        this.f19082a = str;
    }

    /* renamed from: a */
    public String m19434a() {
        return this.f19083b;
    }

    /* renamed from: b */
    public String m19435b() {
        return this.f19082a;
    }

    /* renamed from: c */
    public String m19436c() {
        return this.f19084c;
    }

    /* renamed from: f */
    public void m19437f(String str) {
        this.f19084c = str;
    }
}
