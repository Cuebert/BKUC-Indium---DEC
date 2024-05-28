package p298x5;

import com.appsflyer.oaid.BuildConfig;
import p298x5.AbstractC5554f;

/* renamed from: x5.b */
/* loaded from: classes.dex */
final class C5550b extends AbstractC5554f {

    /* renamed from: a */
    private final String f20583a;

    /* renamed from: b */
    private final long f20584b;

    /* renamed from: c */
    private final AbstractC5554f.b f20585c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x5.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5554f.a {

        /* renamed from: a */
        private String f20586a;

        /* renamed from: b */
        private Long f20587b;

        /* renamed from: c */
        private AbstractC5554f.b f20588c;

        @Override // p298x5.AbstractC5554f.a
        /* renamed from: a */
        public AbstractC5554f mo20315a() {
            Long l10 = this.f20587b;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5550b(this.f20586a, this.f20587b.longValue(), this.f20588c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p298x5.AbstractC5554f.a
        /* renamed from: b */
        public AbstractC5554f.a mo20316b(AbstractC5554f.b bVar) {
            this.f20588c = bVar;
            return this;
        }

        @Override // p298x5.AbstractC5554f.a
        /* renamed from: c */
        public AbstractC5554f.a mo20317c(String str) {
            this.f20586a = str;
            return this;
        }

        @Override // p298x5.AbstractC5554f.a
        /* renamed from: d */
        public AbstractC5554f.a mo20318d(long j10) {
            this.f20587b = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C5550b(String str, long j10, AbstractC5554f.b bVar, a aVar) {
        this(str, j10, bVar);
    }

    @Override // p298x5.AbstractC5554f
    /* renamed from: b */
    public AbstractC5554f.b mo20312b() {
        return this.f20585c;
    }

    @Override // p298x5.AbstractC5554f
    /* renamed from: c */
    public String mo20313c() {
        return this.f20583a;
    }

    @Override // p298x5.AbstractC5554f
    /* renamed from: d */
    public long mo20314d() {
        return this.f20584b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5554f)) {
            return false;
        }
        AbstractC5554f abstractC5554f = (AbstractC5554f) obj;
        String str = this.f20583a;
        if (str != null ? str.equals(abstractC5554f.mo20313c()) : abstractC5554f.mo20313c() == null) {
            if (this.f20584b == abstractC5554f.mo20314d()) {
                AbstractC5554f.b bVar = this.f20585c;
                if (bVar == null) {
                    if (abstractC5554f.mo20312b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC5554f.mo20312b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20583a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f20584b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC5554f.b bVar = this.f20585c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f20583a + ", tokenExpirationTimestamp=" + this.f20584b + ", responseCode=" + this.f20585c + "}";
    }

    private C5550b(String str, long j10, AbstractC5554f.b bVar) {
        this.f20583a = str;
        this.f20584b = j10;
        this.f20585c = bVar;
    }
}
