package p309y3;

/* renamed from: y3.p7 */
/* loaded from: classes.dex */
public final class C5791p7 {

    /* renamed from: a */
    private static C5782o7 f21274a;

    /* renamed from: a */
    public static synchronized C5695f7 m20740a(AbstractC5880z6 abstractC5880z6) {
        C5695f7 m14551b;
        synchronized (C5791p7.class) {
            if (f21274a == null) {
                f21274a = new C5782o7(null);
            }
            m14551b = f21274a.m14551b(abstractC5880z6);
        }
        return m14551b;
    }

    /* renamed from: b */
    public static synchronized C5695f7 m20741b(String str) {
        C5695f7 m20740a;
        synchronized (C5791p7.class) {
            m20740a = m20740a(AbstractC5880z6.m20786d("vision-common").mo20778c());
        }
        return m20740a;
    }
}
