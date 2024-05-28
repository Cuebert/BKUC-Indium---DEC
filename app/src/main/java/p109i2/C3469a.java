package p109i2;

import com.appsflyer.oaid.BuildConfig;
import p109i2.AbstractC3477e;

/* renamed from: i2.a */
/* loaded from: classes.dex */
final class C3469a extends AbstractC3477e {

    /* renamed from: b */
    private final long f14410b;

    /* renamed from: c */
    private final int f14411c;

    /* renamed from: d */
    private final int f14412d;

    /* renamed from: e */
    private final long f14413e;

    /* renamed from: f */
    private final int f14414f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3477e.a {

        /* renamed from: a */
        private Long f14415a;

        /* renamed from: b */
        private Integer f14416b;

        /* renamed from: c */
        private Integer f14417c;

        /* renamed from: d */
        private Long f14418d;

        /* renamed from: e */
        private Integer f14419e;

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: a */
        AbstractC3477e mo15190a() {
            Long l10 = this.f14415a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " maxStorageSizeInBytes";
            }
            if (this.f14416b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f14417c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f14418d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f14419e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3469a(this.f14415a.longValue(), this.f14416b.intValue(), this.f14417c.intValue(), this.f14418d.longValue(), this.f14419e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: b */
        AbstractC3477e.a mo15191b(int i10) {
            this.f14417c = Integer.valueOf(i10);
            return this;
        }

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: c */
        AbstractC3477e.a mo15192c(long j10) {
            this.f14418d = Long.valueOf(j10);
            return this;
        }

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: d */
        AbstractC3477e.a mo15193d(int i10) {
            this.f14416b = Integer.valueOf(i10);
            return this;
        }

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: e */
        AbstractC3477e.a mo15194e(int i10) {
            this.f14419e = Integer.valueOf(i10);
            return this;
        }

        @Override // p109i2.AbstractC3477e.a
        /* renamed from: f */
        AbstractC3477e.a mo15195f(long j10) {
            this.f14415a = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C3469a(long j10, int i10, int i11, long j11, int i12, a aVar) {
        this(j10, i10, i11, j11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p109i2.AbstractC3477e
    /* renamed from: b */
    public int mo15185b() {
        return this.f14412d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p109i2.AbstractC3477e
    /* renamed from: c */
    public long mo15186c() {
        return this.f14413e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p109i2.AbstractC3477e
    /* renamed from: d */
    public int mo15187d() {
        return this.f14411c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p109i2.AbstractC3477e
    /* renamed from: e */
    public int mo15188e() {
        return this.f14414f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3477e)) {
            return false;
        }
        AbstractC3477e abstractC3477e = (AbstractC3477e) obj;
        return this.f14410b == abstractC3477e.mo15189f() && this.f14411c == abstractC3477e.mo15187d() && this.f14412d == abstractC3477e.mo15185b() && this.f14413e == abstractC3477e.mo15186c() && this.f14414f == abstractC3477e.mo15188e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p109i2.AbstractC3477e
    /* renamed from: f */
    public long mo15189f() {
        return this.f14410b;
    }

    public int hashCode() {
        long j10 = this.f14410b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14411c) * 1000003) ^ this.f14412d) * 1000003;
        long j11 = this.f14413e;
        return this.f14414f ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f14410b + ", loadBatchSize=" + this.f14411c + ", criticalSectionEnterTimeoutMs=" + this.f14412d + ", eventCleanUpAge=" + this.f14413e + ", maxBlobByteSizePerRow=" + this.f14414f + "}";
    }

    private C3469a(long j10, int i10, int i11, long j11, int i12) {
        this.f14410b = j10;
        this.f14411c = i10;
        this.f14412d = i11;
        this.f14413e = j11;
        this.f14414f = i12;
    }
}
