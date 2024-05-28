package p016b2;

/* renamed from: b2.g */
/* loaded from: classes.dex */
public abstract class AbstractC0975g {

    /* renamed from: b2.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC0975g m6159a() {
        return new C0970b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC0975g m6160d() {
        return new C0970b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC0975g m6161e(long j10) {
        return new C0970b(a.OK, j10);
    }

    /* renamed from: f */
    public static AbstractC0975g m6162f() {
        return new C0970b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo6151b();

    /* renamed from: c */
    public abstract a mo6152c();
}
