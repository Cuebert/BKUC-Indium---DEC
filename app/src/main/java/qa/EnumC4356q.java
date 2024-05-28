package qa;

/* renamed from: qa.q */
/* loaded from: classes.dex */
public enum EnumC4356q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);


    /* renamed from: n */
    final int f17731n;

    EnumC4356q(int i10) {
        this.f17731n = i10;
    }

    /* renamed from: b */
    public static boolean m17995b(int i10) {
        return (i10 & OFFLINE.f17731n) != 0;
    }

    /* renamed from: c */
    public static boolean m17996c(int i10) {
        return (i10 & NO_CACHE.f17731n) == 0;
    }

    /* renamed from: d */
    public static boolean m17997d(int i10) {
        return (i10 & NO_STORE.f17731n) == 0;
    }
}
