package p132jb;

import gb.C3325c;

/* renamed from: jb.a */
/* loaded from: classes.dex */
class C3684a {
    /* renamed from: a */
    public static final int m15658a(int i10) {
        if (new C3325c(2, 36).m14616l(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C3325c(2, 36));
    }

    /* renamed from: b */
    public static final int m15659b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static final boolean m15660c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
