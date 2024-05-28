package p171n1;

/* renamed from: n1.l */
/* loaded from: classes.dex */
public final class C4031l {

    /* renamed from: a */
    private final String f16445a;

    /* renamed from: n1.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f16446a;

        /* synthetic */ a(C4030k0 c4030k0) {
        }

        /* renamed from: a */
        public C4031l m16834a() {
            if (this.f16446a != null) {
                return new C4031l(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public a m16835b(String str) {
            this.f16446a = str;
            return this;
        }
    }

    /* synthetic */ C4031l(a aVar, C4032l0 c4032l0) {
        this.f16445a = aVar.f16446a;
    }

    /* renamed from: a */
    public static a m16831a() {
        return new a(null);
    }

    /* renamed from: b */
    public final String m16832b() {
        return this.f16445a;
    }
}
