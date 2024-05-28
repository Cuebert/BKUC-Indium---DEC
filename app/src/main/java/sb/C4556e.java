package sb;

import ac.C0076f;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4190o;
import p193ob.C4200y;
import p193ob.C4201z;
import p193ob.InterfaceC4191p;
import p205pb.C4286e;

/* renamed from: sb.e */
/* loaded from: classes.dex */
public final class C4556e {

    /* renamed from: a */
    private static final C0076f f18313a = C0076f.m388i("\"\\");

    /* renamed from: b */
    private static final C0076f f18314b = C0076f.m388i("\t ,=");

    /* renamed from: a */
    public static long m18613a(C4200y c4200y) {
        return m18622j(c4200y.m17555c("Content-Length"));
    }

    /* renamed from: b */
    public static long m18614b(C4181i0 c4181i0) {
        return m18613a(c4181i0.m17424O());
    }

    /* renamed from: c */
    public static boolean m18615c(C4181i0 c4181i0) {
        if (c4181i0.m17436k0().m17397g().equals("HEAD")) {
            return false;
        }
        int m17432e = c4181i0.m17432e();
        return (((m17432e >= 100 && m17432e < 200) || m17432e == 204 || m17432e == 304) && m18614b(c4181i0) == -1 && !"chunked".equalsIgnoreCase(c4181i0.m17437l("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static boolean m18616d(C4200y c4200y) {
        return m18623k(c4200y).contains("*");
    }

    /* renamed from: e */
    public static boolean m18617e(C4181i0 c4181i0) {
        return m18616d(c4181i0.m17424O());
    }

    /* renamed from: f */
    public static int m18618f(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: g */
    public static void m18619g(InterfaceC4191p interfaceC4191p, C4201z c4201z, C4200y c4200y) {
        if (interfaceC4191p == InterfaceC4191p.f17342a) {
            return;
        }
        List<C4190o> m17496f = C4190o.m17496f(c4201z, c4200y);
        if (m17496f.isEmpty()) {
            return;
        }
        interfaceC4191p.mo15045a(c4201z, m17496f);
    }

    /* renamed from: h */
    public static int m18620h(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    /* renamed from: i */
    public static int m18621i(String str, int i10) {
        char charAt;
        while (i10 < str.length() && ((charAt = str.charAt(i10)) == ' ' || charAt == '\t')) {
            i10++;
        }
        return i10;
    }

    /* renamed from: j */
    private static long m18622j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: k */
    public static Set<String> m18623k(C4200y c4200y) {
        Set<String> emptySet = Collections.emptySet();
        int m17558h = c4200y.m17558h();
        for (int i10 = 0; i10 < m17558h; i10++) {
            if ("Vary".equalsIgnoreCase(c4200y.m17556e(i10))) {
                String m17559i = c4200y.m17559i(i10);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : m17559i.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: l */
    private static Set<String> m18624l(C4181i0 c4181i0) {
        return m18623k(c4181i0.m17424O());
    }

    /* renamed from: m */
    public static C4200y m18625m(C4200y c4200y, C4200y c4200y2) {
        Set<String> m18623k = m18623k(c4200y2);
        if (m18623k.isEmpty()) {
            return C4286e.f17493c;
        }
        C4200y.a aVar = new C4200y.a();
        int m17558h = c4200y.m17558h();
        for (int i10 = 0; i10 < m17558h; i10++) {
            String m17556e = c4200y.m17556e(i10);
            if (m18623k.contains(m17556e)) {
                aVar.m17561a(m17556e, c4200y.m17559i(i10));
            }
        }
        return aVar.m17565e();
    }

    /* renamed from: n */
    public static C4200y m18626n(C4181i0 c4181i0) {
        return m18625m(c4181i0.m17427W().m17436k0().m17395e(), c4181i0.m17424O());
    }

    /* renamed from: o */
    public static boolean m18627o(C4181i0 c4181i0, C4200y c4200y, C4177g0 c4177g0) {
        for (String str : m18624l(c4181i0)) {
            if (!Objects.equals(c4200y.m17560j(str), c4177g0.m17394d(str))) {
                return false;
            }
        }
        return true;
    }
}
