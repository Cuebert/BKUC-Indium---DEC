package p320z1;

import p320z1.AbstractC5960k;

/* renamed from: z1.e */
/* loaded from: classes.dex */
final class C5954e extends AbstractC5960k {

    /* renamed from: a */
    private final AbstractC5960k.b f21925a;

    /* renamed from: b */
    private final AbstractC5950a f21926b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5960k.a {

        /* renamed from: a */
        private AbstractC5960k.b f21927a;

        /* renamed from: b */
        private AbstractC5950a f21928b;

        @Override // p320z1.AbstractC5960k.a
        /* renamed from: a */
        public AbstractC5960k mo21183a() {
            return new C5954e(this.f21927a, this.f21928b);
        }

        @Override // p320z1.AbstractC5960k.a
        /* renamed from: b */
        public AbstractC5960k.a mo21184b(AbstractC5950a abstractC5950a) {
            this.f21928b = abstractC5950a;
            return this;
        }

        @Override // p320z1.AbstractC5960k.a
        /* renamed from: c */
        public AbstractC5960k.a mo21185c(AbstractC5960k.b bVar) {
            this.f21927a = bVar;
            return this;
        }
    }

    /* synthetic */ C5954e(AbstractC5960k.b bVar, AbstractC5950a abstractC5950a, a aVar) {
        this(bVar, abstractC5950a);
    }

    @Override // p320z1.AbstractC5960k
    /* renamed from: b */
    public AbstractC5950a mo21181b() {
        return this.f21926b;
    }

    @Override // p320z1.AbstractC5960k
    /* renamed from: c */
    public AbstractC5960k.b mo21182c() {
        return this.f21925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5960k)) {
            return false;
        }
        AbstractC5960k abstractC5960k = (AbstractC5960k) obj;
        AbstractC5960k.b bVar = this.f21925a;
        if (bVar != null ? bVar.equals(abstractC5960k.mo21182c()) : abstractC5960k.mo21182c() == null) {
            AbstractC5950a abstractC5950a = this.f21926b;
            if (abstractC5950a == null) {
                if (abstractC5960k.mo21181b() == null) {
                    return true;
                }
            } else if (abstractC5950a.equals(abstractC5960k.mo21181b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC5960k.b bVar = this.f21925a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5950a abstractC5950a = this.f21926b;
        return hashCode ^ (abstractC5950a != null ? abstractC5950a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f21925a + ", androidClientInfo=" + this.f21926b + "}";
    }

    private C5954e(AbstractC5960k.b bVar, AbstractC5950a abstractC5950a) {
        this.f21925a = bVar;
        this.f21926b = abstractC5950a;
    }
}
