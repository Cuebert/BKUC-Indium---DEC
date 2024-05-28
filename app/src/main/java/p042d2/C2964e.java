package p042d2;

import p187o5.InterfaceC4137d;

/* renamed from: d2.e */
/* loaded from: classes.dex */
public final class C2964e {

    /* renamed from: c */
    private static final C2964e f12630c = new a().m13419a();

    /* renamed from: a */
    private final long f12631a;

    /* renamed from: b */
    private final long f12632b;

    /* renamed from: d2.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f12633a = 0;

        /* renamed from: b */
        private long f12634b = 0;

        a() {
        }

        /* renamed from: a */
        public C2964e m13419a() {
            return new C2964e(this.f12633a, this.f12634b);
        }

        /* renamed from: b */
        public a m13420b(long j10) {
            this.f12633a = j10;
            return this;
        }

        /* renamed from: c */
        public a m13421c(long j10) {
            this.f12634b = j10;
            return this;
        }
    }

    C2964e(long j10, long j11) {
        this.f12631a = j10;
        this.f12632b = j11;
    }

    /* renamed from: c */
    public static a m13416c() {
        return new a();
    }

    @InterfaceC4137d(tag = 1)
    /* renamed from: a */
    public long m13417a() {
        return this.f12631a;
    }

    @InterfaceC4137d(tag = 2)
    /* renamed from: b */
    public long m13418b() {
        return this.f12632b;
    }
}
