package p033c7;

import com.appsflyer.oaid.BuildConfig;
import p059e5.AbstractC3072d;

/* renamed from: c7.a */
/* loaded from: classes.dex */
public class C1132a<T> {

    /* renamed from: a */
    protected int f5467a;

    /* renamed from: b */
    private T[] f5468b;

    /* renamed from: c */
    private AbstractC3072d<String> f5469c;

    /* renamed from: c7.a$b */
    /* loaded from: classes.dex */
    public static class b extends C1132a<Boolean> {
        public b(String str, Boolean bool, boolean z10) {
            super(str, bool, z10);
        }

        /* renamed from: i */
        public Boolean m6534i() {
            if (m6527a()) {
                return Boolean.valueOf(C1137f.m6665c().m6667b(m6528b()));
            }
            return (Boolean) super.m6532g();
        }
    }

    /* renamed from: c7.a$c */
    /* loaded from: classes.dex */
    public static class c extends C1132a<Integer> {
        public c(String str, Integer num, boolean z10) {
            super(str, num, z10);
        }
    }

    /* renamed from: c7.a$d */
    /* loaded from: classes.dex */
    public static class d extends C1132a<Long> {
        public d(String str, Long l10, boolean z10) {
            super(str, l10, z10);
        }
    }

    /* renamed from: c7.a$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public static int m6535a() {
            return 4;
        }
    }

    /* renamed from: c7.a$f */
    /* loaded from: classes.dex */
    public static class f extends C1132a<String> {
        public f(String str, String str2, boolean z10) {
            super(str, str2, z10);
        }
    }

    /* renamed from: f */
    private void m6526f(int i10) {
        while (i10 >= 0) {
            if (this.f5468b[i10] != null) {
                this.f5467a = i10;
                return;
            }
            i10--;
        }
    }

    /* renamed from: a */
    public boolean m6527a() {
        return this.f5469c.mo13538c();
    }

    /* renamed from: b */
    public String m6528b() {
        return this.f5469c.mo13539e(BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public void m6529c(int i10) {
        m6531e(null, i10);
    }

    /* renamed from: d */
    public int m6530d() {
        return this.f5467a;
    }

    /* renamed from: e */
    public void m6531e(T t10, int i10) {
        if (i10 == 0) {
            return;
        }
        this.f5468b[i10] = t10;
        int i11 = this.f5467a;
        if (i10 >= i11) {
            if (t10 == null) {
                m6526f(i11);
            } else {
                this.f5467a = i10;
            }
        }
    }

    /* renamed from: g */
    public T m6532g() {
        return this.f5468b[this.f5467a];
    }

    /* renamed from: h */
    public T m6533h(int i10) {
        return this.f5468b[i10];
    }

    private C1132a(String str, T t10, boolean z10) {
        T[] tArr = (T[]) new Object[e.m6535a()];
        this.f5468b = tArr;
        tArr[0] = t10;
        this.f5467a = 0;
        if (z10) {
            this.f5469c = AbstractC3072d.m13542d(str);
        } else {
            this.f5469c = AbstractC3072d.m13541a();
        }
    }
}
