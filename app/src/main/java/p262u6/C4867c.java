package p262u6;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u6.c */
/* loaded from: classes.dex */
public class C4867c {

    /* renamed from: a */
    private JSONObject f18749a;

    /* renamed from: b */
    private String f18750b;

    /* renamed from: c */
    private String f18751c;

    /* renamed from: d */
    private String f18752d;

    /* renamed from: e */
    private String f18753e;

    /* renamed from: f */
    private String f18754f;

    /* renamed from: g */
    private String f18755g;

    /* renamed from: h */
    private String f18756h;

    /* renamed from: u6.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6669a(String str);

        /* renamed from: b */
        void mo6670b(String str);

        /* renamed from: c */
        void mo6671c(String str);

        /* renamed from: d */
        C4867c mo6672d();

        /* renamed from: e */
        void mo6673e(String str);

        /* renamed from: f */
        void mo6674f(String str);
    }

    public C4867c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f18750b = str;
        this.f18751c = str2;
        this.f18752d = str3;
        this.f18753e = str4;
        m19058j(str5);
        this.f18754f = str6;
        this.f18755g = str7;
        this.f18756h = str8;
    }

    /* renamed from: a */
    public String m19049a() {
        return this.f18752d;
    }

    /* renamed from: b */
    public String m19050b() {
        return this.f18753e;
    }

    /* renamed from: c */
    public String m19051c() {
        return this.f18751c;
    }

    /* renamed from: d */
    public String m19052d() {
        return this.f18755g;
    }

    /* renamed from: e */
    public String m19053e() {
        return this.f18756h;
    }

    /* renamed from: f */
    public String m19054f() {
        return this.f18750b;
    }

    /* renamed from: g */
    public JSONObject m19055g() {
        return this.f18749a;
    }

    /* renamed from: h */
    public String m19056h() {
        return this.f18749a.toString();
    }

    /* renamed from: i */
    public String m19057i() {
        return this.f18754f;
    }

    /* renamed from: j */
    public void m19058j(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f18749a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f18749a == null) {
            this.f18749a = new JSONObject();
        }
    }

    /* renamed from: k */
    public void m19059k(String str) {
        this.f18752d = str;
    }

    /* renamed from: l */
    public void m19060l(String str) {
        this.f18756h = str;
    }

    /* renamed from: m */
    public void m19061m(String str) {
        this.f18750b = str;
    }

    /* renamed from: n */
    public void m19062n(String str) {
        this.f18754f = str;
    }
}
