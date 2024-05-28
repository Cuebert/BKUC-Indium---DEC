package p156l9;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: l9.a */
/* loaded from: classes.dex */
public abstract class AbstractC3900a {

    /* renamed from: a */
    private String f16168a;

    /* renamed from: b */
    private String f16169b;

    /* renamed from: c */
    private JSONObject f16170c;

    /* renamed from: d */
    private String f16171d;

    /* renamed from: a */
    public abstract void mo16537a(boolean z10, JSONObject jSONObject);

    /* renamed from: b */
    public String m16538b() {
        return this.f16171d;
    }

    /* renamed from: c */
    public abstract Context mo16539c();

    /* renamed from: d */
    public String m16540d() {
        return this.f16169b;
    }

    /* renamed from: e */
    public String m16541e() {
        return this.f16168a;
    }

    /* renamed from: f */
    public JSONObject m16542f() {
        if (this.f16170c == null) {
            this.f16170c = new JSONObject();
        }
        return this.f16170c;
    }

    /* renamed from: g */
    public void m16543g(String str) {
        this.f16171d = str;
    }

    /* renamed from: h */
    public void m16544h(String str) {
        this.f16169b = str;
    }

    /* renamed from: i */
    public void m16545i(String str) {
        this.f16168a = str;
    }

    /* renamed from: j */
    public void m16546j(JSONObject jSONObject) {
        this.f16170c = jSONObject;
    }
}
