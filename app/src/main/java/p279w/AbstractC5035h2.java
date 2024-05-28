package p279w;

/* renamed from: w.h2 */
/* loaded from: classes.dex */
public abstract class AbstractC5035h2 {

    /* renamed from: w.h2$a */
    /* loaded from: classes.dex */
    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);


        /* renamed from: n */
        final int f19190n;

        a(int i10) {
            this.f19190n = i10;
        }

        /* renamed from: b */
        int m19570b() {
            return this.f19190n;
        }
    }

    /* renamed from: w.h2$b */
    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* renamed from: a */
    public static AbstractC5035h2 m19568a(b bVar, a aVar) {
        return new C5020e(bVar, aVar);
    }

    /* renamed from: b */
    public abstract a mo19536b();

    /* renamed from: c */
    public abstract b mo19537c();

    /* renamed from: d */
    public final boolean m19569d(AbstractC5035h2 abstractC5035h2) {
        return abstractC5035h2.mo19536b().m19570b() <= mo19536b().m19570b() && abstractC5035h2.mo19537c() == mo19537c();
    }
}
