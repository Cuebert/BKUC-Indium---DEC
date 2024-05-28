package p008a7;

import com.roblox.client.C2877p0;
import org.json.JSONObject;

/* renamed from: a7.i */
/* loaded from: classes.dex */
public class C0051i {

    /* renamed from: a */
    public String f201a;

    /* renamed from: b */
    public String f202b;

    /* renamed from: c */
    private String f203c;

    /* renamed from: d */
    private JSONObject f204d;

    /* renamed from: e */
    public boolean f205e = false;

    /* renamed from: f */
    private boolean f206f;

    public C0051i(String str) {
        this.f201a = str;
    }

    /* renamed from: a */
    public static C0051i m247a(String str, String str2) {
        C0051i c0051i = new C0051i(str);
        c0051i.m253g(str2);
        return c0051i;
    }

    /* renamed from: b */
    public static C0051i m248b(String str) {
        C0051i c0051i = new C0051i(str);
        c0051i.f205e = true;
        return c0051i;
    }

    /* renamed from: c */
    public static String m249c(long j10) {
        if (j10 != -1) {
            return C2877p0.m12926i() + "users/" + j10 + "/profile/";
        }
        return C2877p0.m12859D0();
    }

    /* renamed from: d */
    public String m250d() {
        return this.f203c;
    }

    /* renamed from: e */
    public JSONObject m251e() {
        return this.f204d;
    }

    /* renamed from: f */
    public boolean m252f() {
        return this.f206f;
    }

    /* renamed from: g */
    public void m253g(String str) {
        this.f203c = str;
    }

    /* renamed from: h */
    public void m254h(JSONObject jSONObject) {
        this.f204d = jSONObject;
    }

    /* renamed from: i */
    public void m255i(String str) {
        this.f202b = str;
    }

    /* renamed from: j */
    public void m256j(boolean z10) {
        this.f206f = z10;
    }
}
