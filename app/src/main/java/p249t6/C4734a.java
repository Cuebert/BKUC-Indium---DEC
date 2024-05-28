package p249t6;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: t6.a */
/* loaded from: classes.dex */
public class C4734a {

    /* renamed from: a */
    private long f18559a;

    /* renamed from: b */
    private String f18560b;

    /* renamed from: c */
    private String f18561c;

    /* renamed from: d */
    private String f18562d;

    public C4734a(long j10, String str) {
        this.f18559a = j10;
        this.f18560b = str == null ? BuildConfig.FLAVOR : str;
        this.f18561c = BuildConfig.FLAVOR;
        this.f18562d = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public String m18865a() {
        return this.f18562d;
    }

    /* renamed from: b */
    public long m18866b() {
        return this.f18559a;
    }

    /* renamed from: c */
    public String m18867c() {
        return this.f18561c;
    }

    /* renamed from: d */
    public String m18868d() {
        String str = this.f18560b;
        if (str != null) {
            return str;
        }
        return "User " + m18866b();
    }

    /* renamed from: e */
    public void m18869e(String str) {
        this.f18562d = str;
    }

    /* renamed from: f */
    public void m18870f(long j10) {
        this.f18559a = j10;
    }

    /* renamed from: g */
    public void m18871g(String str) {
        this.f18561c = str;
    }

    /* renamed from: h */
    public void m18872h(String str) {
        this.f18560b = str;
    }

    /* renamed from: i */
    public void m18873i(C4734a c4734a) {
        if (c4734a == this) {
            return;
        }
        if (this.f18559a != c4734a.m18866b() && c4734a.m18866b() != -1) {
            m18870f(c4734a.m18866b());
        }
        if (!this.f18560b.equals(c4734a.m18868d()) && !c4734a.m18868d().isEmpty()) {
            m18872h(c4734a.m18868d());
        }
        if (!this.f18561c.equals(c4734a.m18867c()) && !c4734a.m18867c().isEmpty()) {
            m18871g(c4734a.m18867c());
        }
        if (this.f18562d.equals(c4734a.m18865a()) || c4734a.m18865a().isEmpty()) {
            return;
        }
        m18869e(c4734a.m18865a());
    }
}
