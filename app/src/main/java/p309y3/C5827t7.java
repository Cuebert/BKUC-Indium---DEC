package p309y3;

/* renamed from: y3.t7 */
/* loaded from: classes.dex */
public final class C5827t7 {

    /* renamed from: a */
    private static C5827t7 f21366a;

    private C5827t7() {
    }

    /* renamed from: a */
    public static synchronized C5827t7 m20771a() {
        C5827t7 c5827t7;
        synchronized (C5827t7.class) {
            if (f21366a == null) {
                f21366a = new C5827t7();
            }
            c5827t7 = f21366a;
        }
        return c5827t7;
    }

    /* renamed from: b */
    public static final boolean m20772b() {
        return C5818s7.m20759a("mlkit-dev-profiling");
    }
}
