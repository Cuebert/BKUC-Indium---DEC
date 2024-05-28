package p075f8;

import org.json.JSONObject;

/* renamed from: f8.b */
/* loaded from: classes.dex */
public class C3199b {

    /* renamed from: a */
    private String f13343a;

    /* renamed from: b */
    private String f13344b;

    /* renamed from: c */
    private String f13345c;

    /* renamed from: d */
    private boolean f13346d;

    public C3199b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13343a = jSONObject.getString("providerProductId");
            this.f13344b = jSONObject.getString("providerProductType");
            this.f13345c = jSONObject.getString("chargeRequestId");
            this.f13346d = !this.f13343a.isEmpty() && (this.f13344b.equalsIgnoreCase("subs") || this.f13344b.equalsIgnoreCase("inapp")) && !this.f13345c.isEmpty();
        } catch (Exception unused) {
            this.f13346d = false;
        }
    }

    /* renamed from: a */
    public String m14070a() {
        return this.f13345c;
    }

    /* renamed from: b */
    public boolean m14071b() {
        return this.f13346d;
    }

    /* renamed from: c */
    public boolean m14072c() {
        return this.f13344b.equals("subs");
    }

    /* renamed from: d */
    public String m14073d() {
        return this.f13343a;
    }

    /* renamed from: e */
    public String m14074e() {
        return this.f13344b;
    }

    public String toString() {
        return "{ providerProductId: " + this.f13343a + ", providerProductType: " + this.f13344b + ", chargeRequestId: " + this.f13345c + " }";
    }
}
