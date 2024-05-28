package p320z1;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import p320z1.AbstractC5962m;

/* renamed from: z1.g */
/* loaded from: classes.dex */
final class C5956g extends AbstractC5962m {

    /* renamed from: a */
    private final long f21943a;

    /* renamed from: b */
    private final long f21944b;

    /* renamed from: c */
    private final AbstractC5960k f21945c;

    /* renamed from: d */
    private final Integer f21946d;

    /* renamed from: e */
    private final String f21947e;

    /* renamed from: f */
    private final List<AbstractC5961l> f21948f;

    /* renamed from: g */
    private final EnumC5965p f21949g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5962m.a {

        /* renamed from: a */
        private Long f21950a;

        /* renamed from: b */
        private Long f21951b;

        /* renamed from: c */
        private AbstractC5960k f21952c;

        /* renamed from: d */
        private Integer f21953d;

        /* renamed from: e */
        private String f21954e;

        /* renamed from: f */
        private List<AbstractC5961l> f21955f;

        /* renamed from: g */
        private EnumC5965p f21956g;

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: a */
        public AbstractC5962m mo21208a() {
            Long l10 = this.f21950a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " requestTimeMs";
            }
            if (this.f21951b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C5956g(this.f21950a.longValue(), this.f21951b.longValue(), this.f21952c, this.f21953d, this.f21954e, this.f21955f, this.f21956g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: b */
        public AbstractC5962m.a mo21209b(AbstractC5960k abstractC5960k) {
            this.f21952c = abstractC5960k;
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: c */
        public AbstractC5962m.a mo21210c(List<AbstractC5961l> list) {
            this.f21955f = list;
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: d */
        AbstractC5962m.a mo21211d(Integer num) {
            this.f21953d = num;
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: e */
        AbstractC5962m.a mo21212e(String str) {
            this.f21954e = str;
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: f */
        public AbstractC5962m.a mo21213f(EnumC5965p enumC5965p) {
            this.f21956g = enumC5965p;
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: g */
        public AbstractC5962m.a mo21214g(long j10) {
            this.f21950a = Long.valueOf(j10);
            return this;
        }

        @Override // p320z1.AbstractC5962m.a
        /* renamed from: h */
        public AbstractC5962m.a mo21215h(long j10) {
            this.f21951b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: b */
    public AbstractC5960k mo21201b() {
        return this.f21945c;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: c */
    public List<AbstractC5961l> mo21202c() {
        return this.f21948f;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: d */
    public Integer mo21203d() {
        return this.f21946d;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: e */
    public String mo21204e() {
        return this.f21947e;
    }

    public boolean equals(Object obj) {
        AbstractC5960k abstractC5960k;
        Integer num;
        String str;
        List<AbstractC5961l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5962m)) {
            return false;
        }
        AbstractC5962m abstractC5962m = (AbstractC5962m) obj;
        if (this.f21943a == abstractC5962m.mo21206g() && this.f21944b == abstractC5962m.mo21207h() && ((abstractC5960k = this.f21945c) != null ? abstractC5960k.equals(abstractC5962m.mo21201b()) : abstractC5962m.mo21201b() == null) && ((num = this.f21946d) != null ? num.equals(abstractC5962m.mo21203d()) : abstractC5962m.mo21203d() == null) && ((str = this.f21947e) != null ? str.equals(abstractC5962m.mo21204e()) : abstractC5962m.mo21204e() == null) && ((list = this.f21948f) != null ? list.equals(abstractC5962m.mo21202c()) : abstractC5962m.mo21202c() == null)) {
            EnumC5965p enumC5965p = this.f21949g;
            if (enumC5965p == null) {
                if (abstractC5962m.mo21205f() == null) {
                    return true;
                }
            } else if (enumC5965p.equals(abstractC5962m.mo21205f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: f */
    public EnumC5965p mo21205f() {
        return this.f21949g;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: g */
    public long mo21206g() {
        return this.f21943a;
    }

    @Override // p320z1.AbstractC5962m
    /* renamed from: h */
    public long mo21207h() {
        return this.f21944b;
    }

    public int hashCode() {
        long j10 = this.f21943a;
        long j11 = this.f21944b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC5960k abstractC5960k = this.f21945c;
        int hashCode = (i10 ^ (abstractC5960k == null ? 0 : abstractC5960k.hashCode())) * 1000003;
        Integer num = this.f21946d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21947e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC5961l> list = this.f21948f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC5965p enumC5965p = this.f21949g;
        return hashCode4 ^ (enumC5965p != null ? enumC5965p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f21943a + ", requestUptimeMs=" + this.f21944b + ", clientInfo=" + this.f21945c + ", logSource=" + this.f21946d + ", logSourceName=" + this.f21947e + ", logEvents=" + this.f21948f + ", qosTier=" + this.f21949g + "}";
    }

    private C5956g(long j10, long j11, AbstractC5960k abstractC5960k, Integer num, String str, List<AbstractC5961l> list, EnumC5965p enumC5965p) {
        this.f21943a = j10;
        this.f21944b = j11;
        this.f21945c = abstractC5960k;
        this.f21946d = num;
        this.f21947e = str;
        this.f21948f = list;
        this.f21949g = enumC5965p;
    }
}
