package p309y3;

/* renamed from: y3.f4 */
/* loaded from: classes.dex */
public final class C5692f4 {
    /* renamed from: a */
    public static int m20675a(int i10, int i11, String str) {
        String m20683a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m20683a = C5703g5.m20683a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            m20683a = C5703g5.m20683a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m20683a);
    }

    /* renamed from: b */
    public static int m20676b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m20678d(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static void m20677c(int i10, int i11, int i12) {
        String m20678d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                m20678d = (i11 < 0 || i11 > i12) ? m20678d(i11, i12, "end index") : C5703g5.m20683a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                m20678d = m20678d(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(m20678d);
        }
    }

    /* renamed from: d */
    private static String m20678d(int i10, int i11, String str) {
        if (i10 < 0) {
            return C5703g5.m20683a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C5703g5.m20683a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
