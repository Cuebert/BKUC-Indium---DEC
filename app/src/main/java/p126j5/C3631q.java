package p126j5;

/* renamed from: j5.q */
/* loaded from: classes.dex */
public final class C3631q {

    /* renamed from: a */
    private final Class<?> f15301a;

    /* renamed from: b */
    private final int f15302b;

    /* renamed from: c */
    private final int f15303c;

    private C3631q(Class<?> cls, int i10, int i11) {
        this.f15301a = (Class) C3616c0.m15458c(cls, "Null dependency anInterface.");
        this.f15302b = i10;
        this.f15303c = i11;
    }

    /* renamed from: a */
    private static String m15527a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    /* renamed from: g */
    public static C3631q m15528g(Class<?> cls) {
        return new C3631q(cls, 0, 1);
    }

    /* renamed from: h */
    public static C3631q m15529h(Class<?> cls) {
        return new C3631q(cls, 1, 0);
    }

    /* renamed from: i */
    public static C3631q m15530i(Class<?> cls) {
        return new C3631q(cls, 1, 1);
    }

    /* renamed from: j */
    public static C3631q m15531j(Class<?> cls) {
        return new C3631q(cls, 2, 0);
    }

    /* renamed from: b */
    public Class<?> m15532b() {
        return this.f15301a;
    }

    /* renamed from: c */
    public boolean m15533c() {
        return this.f15303c == 2;
    }

    /* renamed from: d */
    public boolean m15534d() {
        return this.f15303c == 0;
    }

    /* renamed from: e */
    public boolean m15535e() {
        return this.f15302b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3631q)) {
            return false;
        }
        C3631q c3631q = (C3631q) obj;
        return this.f15301a == c3631q.f15301a && this.f15302b == c3631q.f15302b && this.f15303c == c3631q.f15303c;
    }

    /* renamed from: f */
    public boolean m15536f() {
        return this.f15302b == 2;
    }

    public int hashCode() {
        return ((((this.f15301a.hashCode() ^ 1000003) * 1000003) ^ this.f15302b) * 1000003) ^ this.f15303c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f15301a);
        sb2.append(", type=");
        int i10 = this.f15302b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m15527a(this.f15303c));
        sb2.append("}");
        return sb2.toString();
    }
}
