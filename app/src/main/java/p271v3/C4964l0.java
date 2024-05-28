package p271v3;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: v3.l0 */
/* loaded from: classes.dex */
public final class C4964l0 {
    /* renamed from: a */
    public static int m19386a(int i10, int i11, @NullableDecl String str) {
        String m19368a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m19368a = C4943b.m19368a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            m19368a = C4943b.m19368a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m19368a);
    }

    /* renamed from: b */
    public static int m19387b(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m19389d(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static void m19388c(int i10, int i11, int i12) {
        String m19389d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                m19389d = (i11 < 0 || i11 > i12) ? m19389d(i11, i12, "end index") : C4943b.m19368a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                m19389d = m19389d(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(m19389d);
        }
    }

    /* renamed from: d */
    private static String m19389d(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return C4943b.m19368a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4943b.m19368a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
