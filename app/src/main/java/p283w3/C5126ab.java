package p283w3;

/* renamed from: w3.ab */
/* loaded from: classes.dex */
public final class C5126ab {

    /* renamed from: a */
    private static C5454za f19392a;

    /* renamed from: a */
    public static synchronized C5324pa m19753a(AbstractC5233ia abstractC5233ia) {
        C5324pa m14551b;
        synchronized (C5126ab.class) {
            if (f19392a == null) {
                f19392a = new C5454za(null);
            }
            m14551b = f19392a.m14551b(abstractC5233ia);
        }
        return m14551b;
    }

    /* renamed from: b */
    public static synchronized C5324pa m19754b(String str) {
        C5324pa m19753a;
        synchronized (C5126ab.class) {
            m19753a = m19753a(AbstractC5233ia.m19842d(str).mo19822c());
        }
        return m19753a;
    }
}
