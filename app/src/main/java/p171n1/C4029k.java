package p171n1;

/* renamed from: n1.k */
/* loaded from: classes.dex */
public final class C4029k {

    /* renamed from: a */
    private final String f16443a;

    /* renamed from: n1.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f16444a;

        /* synthetic */ a(C4026i0 c4026i0) {
        }

        /* renamed from: a */
        public C4029k m16829a() {
            if (this.f16444a != null) {
                return new C4029k(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public a m16830b(String str) {
            this.f16444a = str;
            return this;
        }
    }

    /* synthetic */ C4029k(a aVar, C4028j0 c4028j0) {
        this.f16443a = aVar.f16444a;
    }

    /* renamed from: a */
    public static a m16826a() {
        return new a(null);
    }

    /* renamed from: b */
    public final String m16827b() {
        return this.f16443a;
    }
}
