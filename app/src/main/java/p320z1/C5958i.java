package p320z1;

import p320z1.AbstractC5964o;

/* renamed from: z1.i */
/* loaded from: classes.dex */
final class C5958i extends AbstractC5964o {

    /* renamed from: a */
    private final AbstractC5964o.c f21958a;

    /* renamed from: b */
    private final AbstractC5964o.b f21959b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5964o.a {

        /* renamed from: a */
        private AbstractC5964o.c f21960a;

        /* renamed from: b */
        private AbstractC5964o.b f21961b;

        @Override // p320z1.AbstractC5964o.a
        /* renamed from: a */
        public AbstractC5964o mo21219a() {
            return new C5958i(this.f21960a, this.f21961b);
        }

        @Override // p320z1.AbstractC5964o.a
        /* renamed from: b */
        public AbstractC5964o.a mo21220b(AbstractC5964o.b bVar) {
            this.f21961b = bVar;
            return this;
        }

        @Override // p320z1.AbstractC5964o.a
        /* renamed from: c */
        public AbstractC5964o.a mo21221c(AbstractC5964o.c cVar) {
            this.f21960a = cVar;
            return this;
        }
    }

    /* synthetic */ C5958i(AbstractC5964o.c cVar, AbstractC5964o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // p320z1.AbstractC5964o
    /* renamed from: b */
    public AbstractC5964o.b mo21217b() {
        return this.f21959b;
    }

    @Override // p320z1.AbstractC5964o
    /* renamed from: c */
    public AbstractC5964o.c mo21218c() {
        return this.f21958a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5964o)) {
            return false;
        }
        AbstractC5964o abstractC5964o = (AbstractC5964o) obj;
        AbstractC5964o.c cVar = this.f21958a;
        if (cVar != null ? cVar.equals(abstractC5964o.mo21218c()) : abstractC5964o.mo21218c() == null) {
            AbstractC5964o.b bVar = this.f21959b;
            if (bVar == null) {
                if (abstractC5964o.mo21217b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC5964o.mo21217b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC5964o.c cVar = this.f21958a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5964o.b bVar = this.f21959b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21958a + ", mobileSubtype=" + this.f21959b + "}";
    }

    private C5958i(AbstractC5964o.c cVar, AbstractC5964o.b bVar) {
        this.f21958a = cVar;
        this.f21959b = bVar;
    }
}
