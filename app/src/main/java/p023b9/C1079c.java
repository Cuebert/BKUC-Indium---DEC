package p023b9;

import androidx.lifecycle.C0851r;
import androidx.lifecycle.LiveData;
import com.appsflyer.oaid.BuildConfig;
import p314y8.EnumC5912f;

/* renamed from: b9.c */
/* loaded from: classes.dex */
public class C1079c {

    /* renamed from: j */
    public static final EnumC5912f f5313j = EnumC5912f.LIGHT;

    /* renamed from: a */
    private long f5314a;

    /* renamed from: b */
    private int f5315b;

    /* renamed from: c */
    private String f5316c;

    /* renamed from: d */
    private String f5317d;

    /* renamed from: e */
    private String f5318e;

    /* renamed from: f */
    private boolean f5319f;

    /* renamed from: g */
    private int f5320g;

    /* renamed from: h */
    private int f5321h;

    /* renamed from: i */
    private C0851r<EnumC5912f> f5322i;

    /* renamed from: b9.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        public static final C1079c f5323a = new C1079c();
    }

    /* renamed from: c */
    public static C1079c m6380c() {
        return b.f5323a;
    }

    /* renamed from: a */
    public void m6381a() {
        this.f5315b = 0;
        this.f5320g = 0;
        this.f5318e = BuildConfig.FLAVOR;
        this.f5316c = null;
        this.f5319f = true;
        this.f5314a = -1L;
        m6398s(f5313j);
    }

    /* renamed from: b */
    public String m6382b() {
        String str = this.f5318e;
        return (str == null || str.equals("null")) ? BuildConfig.FLAVOR : this.f5318e;
    }

    /* renamed from: d */
    public int m6383d() {
        return this.f5321h;
    }

    /* renamed from: e */
    public int m6384e() {
        return this.f5315b;
    }

    /* renamed from: f */
    public int m6385f() {
        return this.f5320g;
    }

    /* renamed from: g */
    public EnumC5912f m6386g() {
        EnumC5912f mo1579f = this.f5322i.mo1579f();
        return mo1579f != null ? mo1579f : f5313j;
    }

    /* renamed from: h */
    public LiveData<EnumC5912f> m6387h() {
        return this.f5322i;
    }

    /* renamed from: i */
    public String m6388i() {
        return m6386g().toString();
    }

    /* renamed from: j */
    public long m6389j() {
        return this.f5314a;
    }

    /* renamed from: k */
    public String m6390k() {
        String str = this.f5317d;
        return (str == null || str.equals("null")) ? BuildConfig.FLAVOR : this.f5317d;
    }

    /* renamed from: l */
    public void m6391l() {
        if (this.f5322i.mo1579f() == null) {
            m6398s(f5313j);
        }
    }

    /* renamed from: m */
    public boolean m6392m() {
        return this.f5319f;
    }

    /* renamed from: n */
    public void m6393n(String str) {
        this.f5318e = str;
    }

    /* renamed from: o */
    public void m6394o(boolean z10) {
        this.f5319f = z10;
    }

    /* renamed from: p */
    public void m6395p(int i10) {
        this.f5321h = i10;
    }

    /* renamed from: q */
    public void m6396q(int i10) {
        this.f5315b = i10;
    }

    /* renamed from: r */
    public void m6397r(int i10) {
        this.f5320g = i10;
    }

    /* renamed from: s */
    public void m6398s(EnumC5912f enumC5912f) {
        this.f5322i.mo4867o(enumC5912f);
    }

    /* renamed from: t */
    public void m6399t(long j10) {
        this.f5314a = j10;
    }

    /* renamed from: u */
    public void m6400u(String str) {
        this.f5317d = str;
    }

    private C1079c() {
        this.f5314a = -1L;
        this.f5319f = true;
        this.f5322i = new C0851r<>();
    }
}
