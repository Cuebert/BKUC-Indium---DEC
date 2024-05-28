package p003a2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import java.util.Objects;
import p003a2.AbstractC0014i;

/* renamed from: a2.b */
/* loaded from: classes.dex */
final class C0007b extends AbstractC0014i {

    /* renamed from: a */
    private final String f119a;

    /* renamed from: b */
    private final Integer f120b;

    /* renamed from: c */
    private final C0013h f121c;

    /* renamed from: d */
    private final long f122d;

    /* renamed from: e */
    private final long f123e;

    /* renamed from: f */
    private final Map<String, String> f124f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0014i.a {

        /* renamed from: a */
        private String f125a;

        /* renamed from: b */
        private Integer f126b;

        /* renamed from: c */
        private C0013h f127c;

        /* renamed from: d */
        private Long f128d;

        /* renamed from: e */
        private Long f129e;

        /* renamed from: f */
        private Map<String, String> f130f;

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: d */
        public AbstractC0014i mo93d() {
            String str = this.f125a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " transportName";
            }
            if (this.f127c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f128d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f129e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f130f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C0007b(this.f125a, this.f126b, this.f127c, this.f128d.longValue(), this.f129e.longValue(), this.f130f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: e */
        protected Map<String, String> mo94e() {
            Map<String, String> map = this.f130f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p003a2.AbstractC0014i.a
        /* renamed from: f */
        public AbstractC0014i.a mo95f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f130f = map;
            return this;
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: g */
        public AbstractC0014i.a mo96g(Integer num) {
            this.f126b = num;
            return this;
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: h */
        public AbstractC0014i.a mo97h(C0013h c0013h) {
            Objects.requireNonNull(c0013h, "Null encodedPayload");
            this.f127c = c0013h;
            return this;
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: i */
        public AbstractC0014i.a mo98i(long j10) {
            this.f128d = Long.valueOf(j10);
            return this;
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: j */
        public AbstractC0014i.a mo99j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f125a = str;
            return this;
        }

        @Override // p003a2.AbstractC0014i.a
        /* renamed from: k */
        public AbstractC0014i.a mo100k(long j10) {
            this.f129e = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p003a2.AbstractC0014i
    /* renamed from: c */
    public Map<String, String> mo87c() {
        return this.f124f;
    }

    @Override // p003a2.AbstractC0014i
    /* renamed from: d */
    public Integer mo88d() {
        return this.f120b;
    }

    @Override // p003a2.AbstractC0014i
    /* renamed from: e */
    public C0013h mo89e() {
        return this.f121c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0014i)) {
            return false;
        }
        AbstractC0014i abstractC0014i = (AbstractC0014i) obj;
        return this.f119a.equals(abstractC0014i.mo91j()) && ((num = this.f120b) != null ? num.equals(abstractC0014i.mo88d()) : abstractC0014i.mo88d() == null) && this.f121c.equals(abstractC0014i.mo89e()) && this.f122d == abstractC0014i.mo90f() && this.f123e == abstractC0014i.mo92k() && this.f124f.equals(abstractC0014i.mo87c());
    }

    @Override // p003a2.AbstractC0014i
    /* renamed from: f */
    public long mo90f() {
        return this.f122d;
    }

    public int hashCode() {
        int hashCode = (this.f119a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f120b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f121c.hashCode()) * 1000003;
        long j10 = this.f122d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f123e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f124f.hashCode();
    }

    @Override // p003a2.AbstractC0014i
    /* renamed from: j */
    public String mo91j() {
        return this.f119a;
    }

    @Override // p003a2.AbstractC0014i
    /* renamed from: k */
    public long mo92k() {
        return this.f123e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f119a + ", code=" + this.f120b + ", encodedPayload=" + this.f121c + ", eventMillis=" + this.f122d + ", uptimeMillis=" + this.f123e + ", autoMetadata=" + this.f124f + "}";
    }

    private C0007b(String str, Integer num, C0013h c0013h, long j10, long j11, Map<String, String> map) {
        this.f119a = str;
        this.f120b = num;
        this.f121c = c0013h;
        this.f122d = j10;
        this.f123e = j11;
        this.f124f = map;
    }
}
