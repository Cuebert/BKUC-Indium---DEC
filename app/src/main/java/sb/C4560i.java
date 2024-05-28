package sb;

import java.net.Proxy;
import p193ob.C4177g0;
import p193ob.C4201z;

/* renamed from: sb.i */
/* loaded from: classes.dex */
public final class C4560i {
    /* renamed from: a */
    public static String m18636a(C4177g0 c4177g0, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4177g0.m17397g());
        sb2.append(' ');
        if (m18637b(c4177g0, type)) {
            sb2.append(c4177g0.m17400j());
        } else {
            sb2.append(m18638c(c4177g0.m17400j()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    /* renamed from: b */
    private static boolean m18637b(C4177g0 c4177g0, Proxy.Type type) {
        return !c4177g0.m17396f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m18638c(C4201z c4201z) {
        String m17589h = c4201z.m17589h();
        String m17591j = c4201z.m17591j();
        if (m17591j == null) {
            return m17589h;
        }
        return m17589h + '?' + m17591j;
    }
}
