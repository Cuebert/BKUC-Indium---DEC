package p283w3;

/* renamed from: w3.bb */
/* loaded from: classes.dex */
public final class C5140bb {

    /* renamed from: a */
    private static C5140bb f19422a;

    private C5140bb() {
    }

    /* renamed from: a */
    public static synchronized C5140bb m19764a() {
        C5140bb c5140bb;
        synchronized (C5140bb.class) {
            if (f19422a == null) {
                f19422a = new C5140bb();
            }
            c5140bb = f19422a;
        }
        return c5140bb;
    }
}
