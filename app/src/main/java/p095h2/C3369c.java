package p095h2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import java.util.Set;
import p095h2.AbstractC3372f;

/* renamed from: h2.c */
/* loaded from: classes.dex */
final class C3369c extends AbstractC3372f.b {

    /* renamed from: a */
    private final long f14128a;

    /* renamed from: b */
    private final long f14129b;

    /* renamed from: c */
    private final Set<AbstractC3372f.c> f14130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3372f.b.a {

        /* renamed from: a */
        private Long f14131a;

        /* renamed from: b */
        private Long f14132b;

        /* renamed from: c */
        private Set<AbstractC3372f.c> f14133c;

        @Override // p095h2.AbstractC3372f.b.a
        /* renamed from: a */
        public AbstractC3372f.b mo14892a() {
            Long l10 = this.f14131a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " delta";
            }
            if (this.f14132b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f14133c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3369c(this.f14131a.longValue(), this.f14132b.longValue(), this.f14133c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p095h2.AbstractC3372f.b.a
        /* renamed from: b */
        public AbstractC3372f.b.a mo14893b(long j10) {
            this.f14131a = Long.valueOf(j10);
            return this;
        }

        @Override // p095h2.AbstractC3372f.b.a
        /* renamed from: c */
        public AbstractC3372f.b.a mo14894c(Set<AbstractC3372f.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f14133c = set;
            return this;
        }

        @Override // p095h2.AbstractC3372f.b.a
        /* renamed from: d */
        public AbstractC3372f.b.a mo14895d(long j10) {
            this.f14132b = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C3369c(long j10, long j11, Set set, a aVar) {
        this(j10, j11, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p095h2.AbstractC3372f.b
    /* renamed from: b */
    public long mo14889b() {
        return this.f14128a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p095h2.AbstractC3372f.b
    /* renamed from: c */
    public Set<AbstractC3372f.c> mo14890c() {
        return this.f14130c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p095h2.AbstractC3372f.b
    /* renamed from: d */
    public long mo14891d() {
        return this.f14129b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3372f.b)) {
            return false;
        }
        AbstractC3372f.b bVar = (AbstractC3372f.b) obj;
        return this.f14128a == bVar.mo14889b() && this.f14129b == bVar.mo14891d() && this.f14130c.equals(bVar.mo14890c());
    }

    public int hashCode() {
        long j10 = this.f14128a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f14129b;
        return this.f14130c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f14128a + ", maxAllowedDelay=" + this.f14129b + ", flags=" + this.f14130c + "}";
    }

    private C3369c(long j10, long j11, Set<AbstractC3372f.c> set) {
        this.f14128a = j10;
        this.f14129b = j11;
        this.f14130c = set;
    }
}
