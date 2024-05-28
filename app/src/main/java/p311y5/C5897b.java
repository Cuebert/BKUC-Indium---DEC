package p311y5;

/* renamed from: y5.b */
/* loaded from: classes.dex */
public class C5897b implements InterfaceC5896a {

    /* renamed from: a */
    private static C5897b f21735a;

    private C5897b() {
    }

    /* renamed from: b */
    public static C5897b m20983b() {
        if (f21735a == null) {
            f21735a = new C5897b();
        }
        return f21735a;
    }

    @Override // p311y5.InterfaceC5896a
    /* renamed from: a */
    public long mo20982a() {
        return System.currentTimeMillis();
    }
}
