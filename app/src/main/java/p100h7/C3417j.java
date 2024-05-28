package p100h7;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: h7.j */
/* loaded from: classes.dex */
public class C3417j {

    /* renamed from: a */
    public a f14281a;

    /* renamed from: e */
    int f14285e;

    /* renamed from: g */
    boolean f14287g;

    /* renamed from: b */
    private String f14282b = null;

    /* renamed from: c */
    String f14283c = null;

    /* renamed from: d */
    private byte[] f14284d = null;

    /* renamed from: f */
    long f14286f = 0;

    /* renamed from: h */
    String f14288h = BuildConfig.FLAVOR;

    /* renamed from: h7.j$a */
    /* loaded from: classes.dex */
    enum a {
        GET,
        POST
    }

    /* renamed from: a */
    public String m15026a() {
        String str = this.f14282b;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: b */
    public int m15027b() {
        return this.f14285e;
    }

    /* renamed from: c */
    public long m15028c() {
        return this.f14286f;
    }

    /* renamed from: d */
    public void m15029d(String str) {
        this.f14288h = str;
    }

    /* renamed from: e */
    public void m15030e(String str) {
        this.f14282b = str;
    }

    /* renamed from: f */
    public String m15031f() {
        return this.f14283c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f14283c + "\nRequest Type: " + this.f14281a + "\nResponse Body: " + this.f14282b + "\nResponse Code: " + this.f14285e;
    }
}
