package p277v9;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v9.a */
/* loaded from: classes.dex */
public class C4995a {

    /* renamed from: a */
    public final int f19089a;

    /* renamed from: b */
    public final String f19090b;

    /* renamed from: c */
    public final String f19091c;

    /* renamed from: d */
    public final String f19092d;

    /* renamed from: e */
    private final boolean f19093e;

    public C4995a(String str) {
        JSONObject jSONObject;
        String str2;
        JSONObject optJSONObject;
        this.f19092d = str;
        String str3 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        int i10 = -1;
        if (jSONObject != null) {
            this.f19093e = true;
            JSONArray optJSONArray = jSONObject.optJSONArray("errors");
            if (optJSONArray != null && optJSONArray.length() > 0 && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                int optInt = optJSONObject.optInt("code", -1);
                String optString = optJSONObject.optString("message");
                str2 = optJSONObject.optString("userFacingMessage");
                i10 = optInt;
                str3 = optString;
                this.f19089a = i10;
                this.f19090b = str3;
                this.f19091c = str2;
            }
        } else {
            this.f19093e = false;
        }
        str2 = null;
        this.f19089a = i10;
        this.f19090b = str3;
        this.f19091c = str2;
    }

    /* renamed from: a */
    public boolean m19445a() {
        return this.f19093e;
    }
}
