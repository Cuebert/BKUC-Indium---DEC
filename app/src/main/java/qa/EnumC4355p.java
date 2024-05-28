package qa;

/* renamed from: qa.p */
/* loaded from: classes.dex */
public enum EnumC4355p {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: n */
    final int f17726n;

    EnumC4355p(int i10) {
        this.f17726n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m17993b(int i10) {
        return (i10 & NO_CACHE.f17726n) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m17994c(int i10) {
        return (i10 & NO_STORE.f17726n) == 0;
    }
}
