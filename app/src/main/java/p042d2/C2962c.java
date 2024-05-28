package p042d2;

import p187o5.InterfaceC4136c;
import p187o5.InterfaceC4137d;

/* renamed from: d2.c */
/* loaded from: classes.dex */
public final class C2962c {

    /* renamed from: c */
    private static final C2962c f12611c = new a().m13406a();

    /* renamed from: a */
    private final long f12612a;

    /* renamed from: b */
    private final b f12613b;

    /* renamed from: d2.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f12614a = 0;

        /* renamed from: b */
        private b f12615b = b.REASON_UNKNOWN;

        a() {
        }

        /* renamed from: a */
        public C2962c m13406a() {
            return new C2962c(this.f12614a, this.f12615b);
        }

        /* renamed from: b */
        public a m13407b(long j10) {
            this.f12614a = j10;
            return this;
        }

        /* renamed from: c */
        public a m13408c(b bVar) {
            this.f12615b = bVar;
            return this;
        }
    }

    /* renamed from: d2.c$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC4136c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: n */
        private final int f12624n;

        b(int i10) {
            this.f12624n = i10;
        }

        @Override // p187o5.InterfaceC4136c
        /* renamed from: b */
        public int mo13409b() {
            return this.f12624n;
        }
    }

    C2962c(long j10, b bVar) {
        this.f12612a = j10;
        this.f12613b = bVar;
    }

    /* renamed from: c */
    public static a m13403c() {
        return new a();
    }

    @InterfaceC4137d(tag = 1)
    /* renamed from: a */
    public long m13404a() {
        return this.f12612a;
    }

    @InterfaceC4137d(tag = 3)
    /* renamed from: b */
    public b m13405b() {
        return this.f12613b;
    }
}
