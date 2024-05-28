package p171n1;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C4009a {

    /* renamed from: a */
    private String f16437a;

    /* renamed from: n1.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f16438a;

        /* synthetic */ a(C4033m c4033m) {
        }

        /* renamed from: a */
        public C4009a m16816a() {
            String str = this.f16438a;
            if (str != null) {
                C4009a c4009a = new C4009a(null);
                c4009a.f16437a = str;
                return c4009a;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public a m16817b(String str) {
            this.f16438a = str;
            return this;
        }
    }

    /* synthetic */ C4009a(C4010a0 c4010a0) {
    }

    /* renamed from: b */
    public static a m16813b() {
        return new a(null);
    }

    /* renamed from: a */
    public String m16815a() {
        return this.f16437a;
    }
}
