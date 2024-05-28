package p168mb;

/* renamed from: mb.c0 */
/* loaded from: classes.dex */
final /* synthetic */ class C3975c0 {

    /* renamed from: a */
    private static final int f16361a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m16711a() {
        return f16361a;
    }

    /* renamed from: b */
    public static final String m16712b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
