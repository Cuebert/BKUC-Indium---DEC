package p271v3;

/* renamed from: v3.e0 */
/* loaded from: classes.dex */
public final class C4950e0 {

    /* renamed from: a */
    private static C4948d0 f19016a;

    /* renamed from: a */
    public static synchronized C4975w m19374a(AbstractC4970r abstractC4970r) {
        C4975w m14551b;
        synchronized (C4950e0.class) {
            if (f19016a == null) {
                f19016a = new C4948d0(null);
            }
            m14551b = f19016a.m14551b(abstractC4970r);
        }
        return m14551b;
    }

    /* renamed from: b */
    public static synchronized C4975w m19375b(String str) {
        C4975w m19374a;
        synchronized (C4950e0.class) {
            m19374a = m19374a(AbstractC4970r.m19397d("common").mo19392c());
        }
        return m19374a;
    }
}
