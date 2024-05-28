package p316ya;

/* renamed from: ya.c */
/* loaded from: classes.dex */
public final class C5927c {
    /* renamed from: a */
    private static final int m21089a(int i10, int i11, int i12) {
        return m21091c(m21091c(i10, i12) - m21091c(i11, i12), i12);
    }

    /* renamed from: b */
    public static final int m21090b(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - m21089a(i11, i10, i12);
        }
        if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + m21089a(i10, i11, -i12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m21091c(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }
}
