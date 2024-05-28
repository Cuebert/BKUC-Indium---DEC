package p042d2;

import p187o5.InterfaceC4137d;

/* renamed from: d2.f */
/* loaded from: classes.dex */
public final class C2965f {

    /* renamed from: c */
    private static final C2965f f12635c = new a().m13425a();

    /* renamed from: a */
    private final long f12636a;

    /* renamed from: b */
    private final long f12637b;

    /* renamed from: d2.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f12638a = 0;

        /* renamed from: b */
        private long f12639b = 0;

        a() {
        }

        /* renamed from: a */
        public C2965f m13425a() {
            return new C2965f(this.f12638a, this.f12639b);
        }

        /* renamed from: b */
        public a m13426b(long j10) {
            this.f12639b = j10;
            return this;
        }

        /* renamed from: c */
        public a m13427c(long j10) {
            this.f12638a = j10;
            return this;
        }
    }

    C2965f(long j10, long j11) {
        this.f12636a = j10;
        this.f12637b = j11;
    }

    /* renamed from: c */
    public static a m13422c() {
        return new a();
    }

    @InterfaceC4137d(tag = 2)
    /* renamed from: a */
    public long m13423a() {
        return this.f12637b;
    }

    @InterfaceC4137d(tag = 1)
    /* renamed from: b */
    public long m13424b() {
        return this.f12636a;
    }
}
