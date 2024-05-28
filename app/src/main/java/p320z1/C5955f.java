package p320z1;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import p320z1.AbstractC5961l;

/* renamed from: z1.f */
/* loaded from: classes.dex */
final class C5955f extends AbstractC5961l {

    /* renamed from: a */
    private final long f21929a;

    /* renamed from: b */
    private final Integer f21930b;

    /* renamed from: c */
    private final long f21931c;

    /* renamed from: d */
    private final byte[] f21932d;

    /* renamed from: e */
    private final String f21933e;

    /* renamed from: f */
    private final long f21934f;

    /* renamed from: g */
    private final AbstractC5964o f21935g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5961l.a {

        /* renamed from: a */
        private Long f21936a;

        /* renamed from: b */
        private Integer f21937b;

        /* renamed from: c */
        private Long f21938c;

        /* renamed from: d */
        private byte[] f21939d;

        /* renamed from: e */
        private String f21940e;

        /* renamed from: f */
        private Long f21941f;

        /* renamed from: g */
        private AbstractC5964o f21942g;

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: a */
        public AbstractC5961l mo21193a() {
            Long l10 = this.f21936a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " eventTimeMs";
            }
            if (this.f21938c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f21941f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C5955f(this.f21936a.longValue(), this.f21937b, this.f21938c.longValue(), this.f21939d, this.f21940e, this.f21941f.longValue(), this.f21942g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: b */
        public AbstractC5961l.a mo21194b(Integer num) {
            this.f21937b = num;
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: c */
        public AbstractC5961l.a mo21195c(long j10) {
            this.f21936a = Long.valueOf(j10);
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: d */
        public AbstractC5961l.a mo21196d(long j10) {
            this.f21938c = Long.valueOf(j10);
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: e */
        public AbstractC5961l.a mo21197e(AbstractC5964o abstractC5964o) {
            this.f21942g = abstractC5964o;
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: f */
        AbstractC5961l.a mo21198f(byte[] bArr) {
            this.f21939d = bArr;
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: g */
        AbstractC5961l.a mo21199g(String str) {
            this.f21940e = str;
            return this;
        }

        @Override // p320z1.AbstractC5961l.a
        /* renamed from: h */
        public AbstractC5961l.a mo21200h(long j10) {
            this.f21941f = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C5955f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC5964o abstractC5964o, a aVar) {
        this(j10, num, j11, bArr, str, j12, abstractC5964o);
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: b */
    public Integer mo21186b() {
        return this.f21930b;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: c */
    public long mo21187c() {
        return this.f21929a;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: d */
    public long mo21188d() {
        return this.f21931c;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: e */
    public AbstractC5964o mo21189e() {
        return this.f21935g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5961l)) {
            return false;
        }
        AbstractC5961l abstractC5961l = (AbstractC5961l) obj;
        if (this.f21929a == abstractC5961l.mo21187c() && ((num = this.f21930b) != null ? num.equals(abstractC5961l.mo21186b()) : abstractC5961l.mo21186b() == null) && this.f21931c == abstractC5961l.mo21188d()) {
            if (Arrays.equals(this.f21932d, abstractC5961l instanceof C5955f ? ((C5955f) abstractC5961l).f21932d : abstractC5961l.mo21190f()) && ((str = this.f21933e) != null ? str.equals(abstractC5961l.mo21191g()) : abstractC5961l.mo21191g() == null) && this.f21934f == abstractC5961l.mo21192h()) {
                AbstractC5964o abstractC5964o = this.f21935g;
                if (abstractC5964o == null) {
                    if (abstractC5961l.mo21189e() == null) {
                        return true;
                    }
                } else if (abstractC5964o.equals(abstractC5961l.mo21189e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: f */
    public byte[] mo21190f() {
        return this.f21932d;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: g */
    public String mo21191g() {
        return this.f21933e;
    }

    @Override // p320z1.AbstractC5961l
    /* renamed from: h */
    public long mo21192h() {
        return this.f21934f;
    }

    public int hashCode() {
        long j10 = this.f21929a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21930b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f21931c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21932d)) * 1000003;
        String str = this.f21933e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f21934f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC5964o abstractC5964o = this.f21935g;
        return i11 ^ (abstractC5964o != null ? abstractC5964o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f21929a + ", eventCode=" + this.f21930b + ", eventUptimeMs=" + this.f21931c + ", sourceExtension=" + Arrays.toString(this.f21932d) + ", sourceExtensionJsonProto3=" + this.f21933e + ", timezoneOffsetSeconds=" + this.f21934f + ", networkConnectionInfo=" + this.f21935g + "}";
    }

    private C5955f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC5964o abstractC5964o) {
        this.f21929a = j10;
        this.f21930b = num;
        this.f21931c = j11;
        this.f21932d = bArr;
        this.f21933e = str;
        this.f21934f = j12;
        this.f21935g = abstractC5964o;
    }
}
