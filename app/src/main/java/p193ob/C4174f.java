package p193ob;

import com.appsflyer.oaid.BuildConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: ob.f */
/* loaded from: classes.dex */
public final class C4174f {

    /* renamed from: n */
    public static final C4174f f17090n = new a().m17373c().m17371a();

    /* renamed from: o */
    public static final C4174f f17091o = new a().m17374d().m17372b(Integer.MAX_VALUE, TimeUnit.SECONDS).m17371a();

    /* renamed from: a */
    private final boolean f17092a;

    /* renamed from: b */
    private final boolean f17093b;

    /* renamed from: c */
    private final int f17094c;

    /* renamed from: d */
    private final int f17095d;

    /* renamed from: e */
    private final boolean f17096e;

    /* renamed from: f */
    private final boolean f17097f;

    /* renamed from: g */
    private final boolean f17098g;

    /* renamed from: h */
    private final int f17099h;

    /* renamed from: i */
    private final int f17100i;

    /* renamed from: j */
    private final boolean f17101j;

    /* renamed from: k */
    private final boolean f17102k;

    /* renamed from: l */
    private final boolean f17103l;

    /* renamed from: m */
    String f17104m;

    /* renamed from: ob.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f17105a;

        /* renamed from: b */
        boolean f17106b;

        /* renamed from: c */
        int f17107c = -1;

        /* renamed from: d */
        int f17108d = -1;

        /* renamed from: e */
        int f17109e = -1;

        /* renamed from: f */
        boolean f17110f;

        /* renamed from: g */
        boolean f17111g;

        /* renamed from: h */
        boolean f17112h;

        /* renamed from: a */
        public C4174f m17371a() {
            return new C4174f(this);
        }

        /* renamed from: b */
        public a m17372b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f17108d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        /* renamed from: c */
        public a m17373c() {
            this.f17105a = true;
            return this;
        }

        /* renamed from: d */
        public a m17374d() {
            this.f17110f = true;
            return this;
        }
    }

    private C4174f(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f17092a = z10;
        this.f17093b = z11;
        this.f17094c = i10;
        this.f17095d = i11;
        this.f17096e = z12;
        this.f17097f = z13;
        this.f17098g = z14;
        this.f17099h = i12;
        this.f17100i = i13;
        this.f17101j = z15;
        this.f17102k = z16;
        this.f17103l = z17;
        this.f17104m = str;
    }

    /* renamed from: a */
    private String m17360a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f17092a) {
            sb2.append("no-cache, ");
        }
        if (this.f17093b) {
            sb2.append("no-store, ");
        }
        if (this.f17094c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f17094c);
            sb2.append(", ");
        }
        if (this.f17095d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f17095d);
            sb2.append(", ");
        }
        if (this.f17096e) {
            sb2.append("private, ");
        }
        if (this.f17097f) {
            sb2.append("public, ");
        }
        if (this.f17098g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f17099h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f17099h);
            sb2.append(", ");
        }
        if (this.f17100i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f17100i);
            sb2.append(", ");
        }
        if (this.f17101j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f17102k) {
            sb2.append("no-transform, ");
        }
        if (this.f17103l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p193ob.C4174f m17361k(p193ob.C4200y r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p193ob.C4174f.m17361k(ob.y):ob.f");
    }

    /* renamed from: b */
    public boolean m17362b() {
        return this.f17096e;
    }

    /* renamed from: c */
    public boolean m17363c() {
        return this.f17097f;
    }

    /* renamed from: d */
    public int m17364d() {
        return this.f17094c;
    }

    /* renamed from: e */
    public int m17365e() {
        return this.f17099h;
    }

    /* renamed from: f */
    public int m17366f() {
        return this.f17100i;
    }

    /* renamed from: g */
    public boolean m17367g() {
        return this.f17098g;
    }

    /* renamed from: h */
    public boolean m17368h() {
        return this.f17092a;
    }

    /* renamed from: i */
    public boolean m17369i() {
        return this.f17093b;
    }

    /* renamed from: j */
    public boolean m17370j() {
        return this.f17101j;
    }

    public String toString() {
        String str = this.f17104m;
        if (str != null) {
            return str;
        }
        String m17360a = m17360a();
        this.f17104m = m17360a;
        return m17360a;
    }

    C4174f(a aVar) {
        this.f17092a = aVar.f17105a;
        this.f17093b = aVar.f17106b;
        this.f17094c = aVar.f17107c;
        this.f17095d = -1;
        this.f17096e = false;
        this.f17097f = false;
        this.f17098g = false;
        this.f17099h = aVar.f17108d;
        this.f17100i = aVar.f17109e;
        this.f17101j = aVar.f17110f;
        this.f17102k = aVar.f17111g;
        this.f17103l = aVar.f17112h;
    }
}
