package p168mb;

import p132jb.C3694k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mb.d0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C3977d0 {
    /* renamed from: a */
    public static final int m16715a(String str, int i10, int i11, int i12) {
        return (int) C3973b0.m16705c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m16716b(String str, long j10, long j11, long j12) {
        Long m15670a;
        String m16706d = C3973b0.m16706d(str);
        if (m16706d == null) {
            return j10;
        }
        m15670a = C3694k.m15670a(m16706d);
        if (m15670a == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m16706d + '\'').toString());
        }
        long longValue = m15670a.longValue();
        boolean z10 = false;
        if (j11 <= longValue && longValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m16717c(String str, String str2) {
        String m16706d = C3973b0.m16706d(str);
        return m16706d == null ? str2 : m16706d;
    }

    /* renamed from: d */
    public static final boolean m16718d(String str, boolean z10) {
        String m16706d = C3973b0.m16706d(str);
        return m16706d != null ? Boolean.parseBoolean(m16706d) : z10;
    }

    /* renamed from: e */
    public static /* synthetic */ int m16719e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return C3973b0.m16704b(str, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ long m16720f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C3973b0.m16705c(str, j10, j13, j12);
    }
}
