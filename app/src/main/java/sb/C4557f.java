package sb;

/* renamed from: sb.f */
/* loaded from: classes.dex */
public final class C4557f {
    /* renamed from: a */
    public static boolean m18628a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m18629b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: c */
    public static boolean m18630c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m18631d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m18632e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
