package p283w3;

/* renamed from: w3.p */
/* loaded from: classes.dex */
public final class C5313p {
    /* renamed from: a */
    public static int m19882a(int i10, int i11, String str) {
        String m19910a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m19910a = C5326q.m19910a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            m19910a = C5326q.m19910a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m19910a);
    }

    /* renamed from: b */
    public static int m19883b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m19886e(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static void m19884c(int i10, int i11, int i12) {
        String m19886e;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                m19886e = (i11 < 0 || i11 > i12) ? m19886e(i11, i12, "end index") : C5326q.m19910a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                m19886e = m19886e(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(m19886e);
        }
    }

    /* renamed from: d */
    public static void m19885d(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: e */
    private static String m19886e(int i10, int i11, String str) {
        if (i10 < 0) {
            return C5326q.m19910a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C5326q.m19910a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
