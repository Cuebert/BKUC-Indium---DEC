package p246t3;

/* renamed from: t3.q */
/* loaded from: classes.dex */
public final class C4691q {
    /* renamed from: a */
    public static int m18803a(int i10, int i11, String str) {
        String m18811a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m18811a = C4695r.m18811a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            m18811a = C4695r.m18811a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m18811a);
    }

    /* renamed from: b */
    public static int m18804b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m18808f(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static void m18805c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m18806d(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(C4695r.m18811a(str, Character.valueOf(c10)));
        }
    }

    /* renamed from: e */
    public static void m18807e(int i10, int i11, int i12) {
        String m18808f;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                m18808f = (i11 < 0 || i11 > i12) ? m18808f(i11, i12, "end index") : C4695r.m18811a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                m18808f = m18808f(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(m18808f);
        }
    }

    /* renamed from: f */
    private static String m18808f(int i10, int i11, String str) {
        if (i10 < 0) {
            return C4695r.m18811a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4695r.m18811a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
