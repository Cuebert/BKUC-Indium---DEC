package p132jb;

/* renamed from: jb.b */
/* loaded from: classes.dex */
class C3685b extends C3684a {
    /* renamed from: d */
    public static final boolean m15661d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
