package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.j5 */
/* loaded from: classes.dex */
public final class C1968j5 {
    /* renamed from: a */
    public static int m9470a(int i10, int i11, String str) {
        String m9487a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m9487a = C1975k5.m9487a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            m9487a = C1975k5.m9487a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m9487a);
    }

    /* renamed from: b */
    public static int m9471b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m9474e(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static Object m9472c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m9473d(int i10, int i11, int i12) {
        String m9474e;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                m9474e = (i11 < 0 || i11 > i12) ? m9474e(i11, i12, "end index") : C1975k5.m9487a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                m9474e = m9474e(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(m9474e);
        }
    }

    /* renamed from: e */
    private static String m9474e(int i10, int i11, String str) {
        if (i10 < 0) {
            return C1975k5.m9487a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C1975k5.m9487a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
