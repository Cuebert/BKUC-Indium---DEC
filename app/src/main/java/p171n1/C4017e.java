package p171n1;

/* renamed from: n1.e */
/* loaded from: classes.dex */
public final class C4017e {

    /* renamed from: a */
    private String f16441a;

    /* renamed from: n1.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f16442a;

        /* synthetic */ a(C4047w c4047w) {
        }

        /* renamed from: a */
        public C4017e m16824a() {
            String str = this.f16442a;
            if (str != null) {
                C4017e c4017e = new C4017e(null);
                c4017e.f16441a = str;
                return c4017e;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public a m16825b(String str) {
            this.f16442a = str;
            return this;
        }
    }

    /* synthetic */ C4017e(C4048x c4048x) {
    }

    /* renamed from: b */
    public static a m16821b() {
        return new a(null);
    }

    /* renamed from: a */
    public String m16823a() {
        return this.f16441a;
    }
}
