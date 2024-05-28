package p285w5;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import p285w5.AbstractC5461d;
import p285w5.C5460c;

/* renamed from: w5.a */
/* loaded from: classes.dex */
final class C5458a extends AbstractC5461d {

    /* renamed from: b */
    private final String f20350b;

    /* renamed from: c */
    private final C5460c.a f20351c;

    /* renamed from: d */
    private final String f20352d;

    /* renamed from: e */
    private final String f20353e;

    /* renamed from: f */
    private final long f20354f;

    /* renamed from: g */
    private final long f20355g;

    /* renamed from: h */
    private final String f20356h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w5.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5461d.a {

        /* renamed from: a */
        private String f20357a;

        /* renamed from: b */
        private C5460c.a f20358b;

        /* renamed from: c */
        private String f20359c;

        /* renamed from: d */
        private String f20360d;

        /* renamed from: e */
        private Long f20361e;

        /* renamed from: f */
        private Long f20362f;

        /* renamed from: g */
        private String f20363g;

        /* synthetic */ b(AbstractC5461d abstractC5461d, a aVar) {
            this(abstractC5461d);
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: a */
        public AbstractC5461d mo20057a() {
            C5460c.a aVar = this.f20358b;
            String str = BuildConfig.FLAVOR;
            if (aVar == null) {
                str = BuildConfig.FLAVOR + " registrationStatus";
            }
            if (this.f20361e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f20362f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5458a(this.f20357a, this.f20358b, this.f20359c, this.f20360d, this.f20361e.longValue(), this.f20362f.longValue(), this.f20363g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: b */
        public AbstractC5461d.a mo20058b(String str) {
            this.f20359c = str;
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: c */
        public AbstractC5461d.a mo20059c(long j10) {
            this.f20361e = Long.valueOf(j10);
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: d */
        public AbstractC5461d.a mo20060d(String str) {
            this.f20357a = str;
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: e */
        public AbstractC5461d.a mo20061e(String str) {
            this.f20363g = str;
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: f */
        public AbstractC5461d.a mo20062f(String str) {
            this.f20360d = str;
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: g */
        public AbstractC5461d.a mo20063g(C5460c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f20358b = aVar;
            return this;
        }

        @Override // p285w5.AbstractC5461d.a
        /* renamed from: h */
        public AbstractC5461d.a mo20064h(long j10) {
            this.f20362f = Long.valueOf(j10);
            return this;
        }

        public b() {
        }

        private b(AbstractC5461d abstractC5461d) {
            this.f20357a = abstractC5461d.mo20051d();
            this.f20358b = abstractC5461d.mo20054g();
            this.f20359c = abstractC5461d.mo20049b();
            this.f20360d = abstractC5461d.mo20053f();
            this.f20361e = Long.valueOf(abstractC5461d.mo20050c());
            this.f20362f = Long.valueOf(abstractC5461d.mo20055h());
            this.f20363g = abstractC5461d.mo20052e();
        }
    }

    /* synthetic */ C5458a(String str, C5460c.a aVar, String str2, String str3, long j10, long j11, String str4, a aVar2) {
        this(str, aVar, str2, str3, j10, j11, str4);
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: b */
    public String mo20049b() {
        return this.f20352d;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: c */
    public long mo20050c() {
        return this.f20354f;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: d */
    public String mo20051d() {
        return this.f20350b;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: e */
    public String mo20052e() {
        return this.f20356h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5461d)) {
            return false;
        }
        AbstractC5461d abstractC5461d = (AbstractC5461d) obj;
        String str3 = this.f20350b;
        if (str3 != null ? str3.equals(abstractC5461d.mo20051d()) : abstractC5461d.mo20051d() == null) {
            if (this.f20351c.equals(abstractC5461d.mo20054g()) && ((str = this.f20352d) != null ? str.equals(abstractC5461d.mo20049b()) : abstractC5461d.mo20049b() == null) && ((str2 = this.f20353e) != null ? str2.equals(abstractC5461d.mo20053f()) : abstractC5461d.mo20053f() == null) && this.f20354f == abstractC5461d.mo20050c() && this.f20355g == abstractC5461d.mo20055h()) {
                String str4 = this.f20356h;
                if (str4 == null) {
                    if (abstractC5461d.mo20052e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC5461d.mo20052e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: f */
    public String mo20053f() {
        return this.f20353e;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: g */
    public C5460c.a mo20054g() {
        return this.f20351c;
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: h */
    public long mo20055h() {
        return this.f20355g;
    }

    public int hashCode() {
        String str = this.f20350b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20351c.hashCode()) * 1000003;
        String str2 = this.f20352d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20353e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f20354f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f20355g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f20356h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p285w5.AbstractC5461d
    /* renamed from: n */
    public AbstractC5461d.a mo20056n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f20350b + ", registrationStatus=" + this.f20351c + ", authToken=" + this.f20352d + ", refreshToken=" + this.f20353e + ", expiresInSecs=" + this.f20354f + ", tokenCreationEpochInSecs=" + this.f20355g + ", fisError=" + this.f20356h + "}";
    }

    private C5458a(String str, C5460c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f20350b = str;
        this.f20351c = aVar;
        this.f20352d = str2;
        this.f20353e = str3;
        this.f20354f = j10;
        this.f20355g = j11;
        this.f20356h = str4;
    }
}
