package p193ob;

import ac.C0073c;
import com.appsflyer.oaid.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p205pb.C4286e;

/* renamed from: ob.z */
/* loaded from: classes.dex */
public final class C4201z {

    /* renamed from: j */
    private static final char[] f17366j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f17367a;

    /* renamed from: b */
    private final String f17368b;

    /* renamed from: c */
    private final String f17369c;

    /* renamed from: d */
    final String f17370d;

    /* renamed from: e */
    final int f17371e;

    /* renamed from: f */
    private final List<String> f17372f;

    /* renamed from: g */
    private final List<String> f17373g;

    /* renamed from: h */
    private final String f17374h;

    /* renamed from: i */
    private final String f17375i;

    /* renamed from: ob.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        String f17376a;

        /* renamed from: d */
        String f17379d;

        /* renamed from: f */
        final List<String> f17381f;

        /* renamed from: g */
        List<String> f17382g;

        /* renamed from: h */
        String f17383h;

        /* renamed from: b */
        String f17377b = BuildConfig.FLAVOR;

        /* renamed from: c */
        String f17378c = BuildConfig.FLAVOR;

        /* renamed from: e */
        int f17380e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f17381f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        /* renamed from: d */
        private static String m17600d(String str, int i10, int i11) {
            return C4286e.m17740d(C4201z.m17578t(str, i10, i11, false));
        }

        /* renamed from: h */
        private boolean m17601h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: i */
        private boolean m17602i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: k */
        private static int m17603k(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(C4201z.m17570a(str, i10, i11, BuildConfig.FLAVOR, false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: m */
        private void m17604m() {
            if (this.f17381f.remove(r0.size() - 1).isEmpty() && !this.f17381f.isEmpty()) {
                this.f17381f.set(r0.size() - 1, BuildConfig.FLAVOR);
            } else {
                this.f17381f.add(BuildConfig.FLAVOR);
            }
        }

        /* renamed from: o */
        private static int m17605o(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt != '[') {
                    i10++;
                }
                do {
                    i10++;
                    if (i10 < i11) {
                    }
                    i10++;
                } while (str.charAt(i10) != ']');
                i10++;
            }
            return i11;
        }

        /* renamed from: p */
        private void m17606p(String str, int i10, int i11, boolean z10, boolean z11) {
            String m17570a = C4201z.m17570a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (m17601h(m17570a)) {
                return;
            }
            if (m17602i(m17570a)) {
                m17604m();
                return;
            }
            if (this.f17381f.get(r11.size() - 1).isEmpty()) {
                this.f17381f.set(r11.size() - 1, m17570a);
            } else {
                this.f17381f.add(m17570a);
            }
            if (z10) {
                this.f17381f.add(BuildConfig.FLAVOR);
            }
        }

        /* renamed from: r */
        private void m17607r(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f17381f;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            } else {
                this.f17381f.clear();
                this.f17381f.add(BuildConfig.FLAVOR);
                i10++;
            }
            while (true) {
                int i12 = i10;
                if (i12 >= i11) {
                    return;
                }
                i10 = C4286e.m17751o(str, i12, i11, "/\\");
                boolean z10 = i10 < i11;
                m17606p(str, i12, i10, z10, true);
                if (z10) {
                    i10++;
                }
            }
        }

        /* renamed from: t */
        private static int m17608t(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: u */
        private static int m17609u(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        /* renamed from: a */
        public a m17610a(String str, String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.f17382g == null) {
                this.f17382g = new ArrayList();
            }
            this.f17382g.add(C4201z.m17571b(str, " \"'<>#&=", true, false, true, true));
            this.f17382g.add(str2 != null ? C4201z.m17571b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        /* renamed from: b */
        public a m17611b(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            if (this.f17382g == null) {
                this.f17382g = new ArrayList();
            }
            this.f17382g.add(C4201z.m17571b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f17382g.add(str2 != null ? C4201z.m17571b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        /* renamed from: c */
        public C4201z m17612c() {
            if (this.f17376a != null) {
                if (this.f17379d != null) {
                    return new C4201z(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        int m17613e() {
            int i10 = this.f17380e;
            return i10 != -1 ? i10 : C4201z.m17574e(this.f17376a);
        }

        /* renamed from: f */
        public a m17614f(String str) {
            this.f17382g = str != null ? C4201z.m17569A(C4201z.m17571b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public a m17615g(String str) {
            Objects.requireNonNull(str, "host == null");
            String m17600d = m17600d(str, 0, str.length());
            if (m17600d != null) {
                this.f17379d = m17600d;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: j */
        a m17616j(C4201z c4201z, String str) {
            int m17751o;
            int i10;
            int m17730G = C4286e.m17730G(str, 0, str.length());
            int m17731H = C4286e.m17731H(str, m17730G, str.length());
            int m17608t = m17608t(str, m17730G, m17731H);
            if (m17608t != -1) {
                if (str.regionMatches(true, m17730G, "https:", 0, 6)) {
                    this.f17376a = "https";
                    m17730G += 6;
                } else if (str.regionMatches(true, m17730G, "http:", 0, 5)) {
                    this.f17376a = "http";
                    m17730G += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m17608t) + "'");
                }
            } else if (c4201z != null) {
                this.f17376a = c4201z.f17367a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int m17609u = m17609u(str, m17730G, m17731H);
            char c10 = '?';
            char c11 = '#';
            if (m17609u < 2 && c4201z != null && c4201z.f17367a.equals(this.f17376a)) {
                this.f17377b = c4201z.m17592k();
                this.f17378c = c4201z.m17588g();
                this.f17379d = c4201z.f17370d;
                this.f17380e = c4201z.f17371e;
                this.f17381f.clear();
                this.f17381f.addAll(c4201z.m17590i());
                if (m17730G == m17731H || str.charAt(m17730G) == '#') {
                    m17614f(c4201z.m17591j());
                }
            } else {
                int i11 = m17730G + m17609u;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    m17751o = C4286e.m17751o(str, i11, m17731H, "@/\\?#");
                    char charAt = m17751o != m17731H ? str.charAt(m17751o) : (char) 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z10) {
                            int m17750n = C4286e.m17750n(str, i11, m17751o, ':');
                            i10 = m17751o;
                            String m17570a = C4201z.m17570a(str, i11, m17750n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                m17570a = this.f17377b + "%40" + m17570a;
                            }
                            this.f17377b = m17570a;
                            if (m17750n != i10) {
                                this.f17378c = C4201z.m17570a(str, m17750n + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        } else {
                            i10 = m17751o;
                            this.f17378c += "%40" + C4201z.m17570a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i11 = i10 + 1;
                    }
                    c10 = '?';
                    c11 = '#';
                }
                int m17605o = m17605o(str, i11, m17751o);
                int i12 = m17605o + 1;
                if (i12 < m17751o) {
                    this.f17379d = m17600d(str, i11, m17605o);
                    int m17603k = m17603k(str, i12, m17751o);
                    this.f17380e = m17603k;
                    if (m17603k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i12, m17751o) + '\"');
                    }
                } else {
                    this.f17379d = m17600d(str, i11, m17605o);
                    this.f17380e = C4201z.m17574e(this.f17376a);
                }
                if (this.f17379d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, m17605o) + '\"');
                }
                m17730G = m17751o;
            }
            int m17751o2 = C4286e.m17751o(str, m17730G, m17731H, "?#");
            m17607r(str, m17730G, m17751o2);
            if (m17751o2 < m17731H && str.charAt(m17751o2) == '?') {
                int m17750n2 = C4286e.m17750n(str, m17751o2, m17731H, '#');
                this.f17382g = C4201z.m17569A(C4201z.m17570a(str, m17751o2 + 1, m17750n2, " \"'<>#", true, false, true, true, null));
                m17751o2 = m17750n2;
            }
            if (m17751o2 < m17731H && str.charAt(m17751o2) == '#') {
                this.f17383h = C4201z.m17570a(str, 1 + m17751o2, m17731H, BuildConfig.FLAVOR, true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: l */
        public a m17617l(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f17378c = C4201z.m17571b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: n */
        public a m17618n(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f17380e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        /* renamed from: q */
        a m17619q() {
            int size = this.f17381f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17381f.set(i10, C4201z.m17571b(this.f17381f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f17382g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f17382g.get(i11);
                    if (str != null) {
                        this.f17382g.set(i11, C4201z.m17571b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f17383h;
            if (str2 != null) {
                this.f17383h = C4201z.m17571b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: s */
        public a m17620s(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.f17376a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.f17376a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f17376a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f17377b.isEmpty() || !this.f17378c.isEmpty()) {
                sb2.append(this.f17377b);
                if (!this.f17378c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f17378c);
                }
                sb2.append('@');
            }
            String str2 = this.f17379d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f17379d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f17379d);
                }
            }
            if (this.f17380e != -1 || this.f17376a != null) {
                int m17613e = m17613e();
                String str3 = this.f17376a;
                if (str3 == null || m17613e != C4201z.m17574e(str3)) {
                    sb2.append(':');
                    sb2.append(m17613e);
                }
            }
            C4201z.m17577s(sb2, this.f17381f);
            if (this.f17382g != null) {
                sb2.append('?');
                C4201z.m17576o(sb2, this.f17382g);
            }
            if (this.f17383h != null) {
                sb2.append('#');
                sb2.append(this.f17383h);
            }
            return sb2.toString();
        }

        /* renamed from: v */
        public a m17621v(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f17377b = C4201z.m17571b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    C4201z(a aVar) {
        this.f17367a = aVar.f17376a;
        this.f17368b = m17579u(aVar.f17377b, false);
        this.f17369c = m17579u(aVar.f17378c, false);
        this.f17370d = aVar.f17379d;
        this.f17371e = aVar.m17613e();
        this.f17372f = m17580v(aVar.f17381f, false);
        List<String> list = aVar.f17382g;
        this.f17373g = list != null ? m17580v(list, true) : null;
        String str = aVar.f17383h;
        this.f17374h = str != null ? m17579u(str, false) : null;
        this.f17375i = aVar.toString();
    }

    /* renamed from: A */
    static List<String> m17569A(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m17570a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || m17582x(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            C0073c c0073c = new C0073c();
            c0073c.m341N0(str, i10, i12);
            m17573d(c0073c, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return c0073c.m374t0();
        }
        return str.substring(i10, i11);
    }

    /* renamed from: b */
    static String m17571b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return m17570a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m17572c(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return m17570a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    /* renamed from: d */
    static void m17573d(C0073c c0073c, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        C0073c c0073c2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    c0073c.mo350b0(z10 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z13) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z10 && (!z11 || m17582x(str, i10, i11)))))) {
                    c0073c.m342O0(codePointAt);
                } else {
                    if (c0073c2 == null) {
                        c0073c2 = new C0073c();
                    }
                    if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                        c0073c2.m338L0(str, i10, Character.charCount(codePointAt) + i10, charset);
                    } else {
                        c0073c2.m342O0(codePointAt);
                    }
                    while (!c0073c2.mo328F()) {
                        int readByte = c0073c2.readByte() & 255;
                        c0073c.mo330G(37);
                        char[] cArr = f17366j;
                        c0073c.mo330G(cArr[(readByte >> 4) & 15]);
                        c0073c.mo330G(cArr[readByte & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    public static int m17574e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static C4201z m17575l(String str) {
        return new a().m17616j(null, str).m17612c();
    }

    /* renamed from: o */
    static void m17576o(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    /* renamed from: s */
    static void m17577s(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    /* renamed from: t */
    static String m17578t(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                C0073c c0073c = new C0073c();
                c0073c.m341N0(str, i10, i12);
                m17581w(c0073c, str, i12, i11, z10);
                return c0073c.m374t0();
            }
        }
        return str.substring(i10, i11);
    }

    /* renamed from: u */
    static String m17579u(String str, boolean z10) {
        return m17578t(str, 0, str.length(), z10);
    }

    /* renamed from: v */
    private List<String> m17580v(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? m17579u(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: w */
    static void m17581w(C0073c c0073c, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int m17747k = C4286e.m17747k(str.charAt(i10 + 1));
                int m17747k2 = C4286e.m17747k(str.charAt(i12));
                if (m17747k != -1 && m17747k2 != -1) {
                    c0073c.mo330G((m17747k << 4) + m17747k2);
                    i10 = i12;
                }
                c0073c.m342O0(codePointAt);
            } else {
                if (codePointAt == 43 && z10) {
                    c0073c.mo330G(32);
                }
                c0073c.m342O0(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: x */
    static boolean m17582x(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && C4286e.m17747k(str.charAt(i10 + 1)) != -1 && C4286e.m17747k(str.charAt(i12)) != -1;
    }

    /* renamed from: B */
    public String m17583B() {
        return m17596q("/...").m17621v(BuildConfig.FLAVOR).m17617l(BuildConfig.FLAVOR).m17612c().toString();
    }

    /* renamed from: C */
    public C4201z m17584C(String str) {
        a m17596q = m17596q(str);
        if (m17596q != null) {
            return m17596q.m17612c();
        }
        return null;
    }

    /* renamed from: D */
    public String m17585D() {
        return this.f17367a;
    }

    /* renamed from: E */
    public URI m17586E() {
        String aVar = m17595p().m17619q().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4201z) && ((C4201z) obj).f17375i.equals(this.f17375i);
    }

    /* renamed from: f */
    public String m17587f() {
        if (this.f17374h == null) {
            return null;
        }
        return this.f17375i.substring(this.f17375i.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String m17588g() {
        if (this.f17369c.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return this.f17375i.substring(this.f17375i.indexOf(58, this.f17367a.length() + 3) + 1, this.f17375i.indexOf(64));
    }

    /* renamed from: h */
    public String m17589h() {
        int indexOf = this.f17375i.indexOf(47, this.f17367a.length() + 3);
        String str = this.f17375i;
        return this.f17375i.substring(indexOf, C4286e.m17751o(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f17375i.hashCode();
    }

    /* renamed from: i */
    public List<String> m17590i() {
        int indexOf = this.f17375i.indexOf(47, this.f17367a.length() + 3);
        String str = this.f17375i;
        int m17751o = C4286e.m17751o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m17751o) {
            int i10 = indexOf + 1;
            int m17750n = C4286e.m17750n(this.f17375i, i10, m17751o, '/');
            arrayList.add(this.f17375i.substring(i10, m17750n));
            indexOf = m17750n;
        }
        return arrayList;
    }

    /* renamed from: j */
    public String m17591j() {
        if (this.f17373g == null) {
            return null;
        }
        int indexOf = this.f17375i.indexOf(63) + 1;
        String str = this.f17375i;
        return this.f17375i.substring(indexOf, C4286e.m17750n(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String m17592k() {
        if (this.f17368b.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f17367a.length() + 3;
        String str = this.f17375i;
        return this.f17375i.substring(length, C4286e.m17751o(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String m17593m() {
        return this.f17370d;
    }

    /* renamed from: n */
    public boolean m17594n() {
        return this.f17367a.equals("https");
    }

    /* renamed from: p */
    public a m17595p() {
        a aVar = new a();
        aVar.f17376a = this.f17367a;
        aVar.f17377b = m17592k();
        aVar.f17378c = m17588g();
        aVar.f17379d = this.f17370d;
        aVar.f17380e = this.f17371e != m17574e(this.f17367a) ? this.f17371e : -1;
        aVar.f17381f.clear();
        aVar.f17381f.addAll(m17590i());
        aVar.m17614f(m17591j());
        aVar.f17383h = m17587f();
        return aVar;
    }

    /* renamed from: q */
    public a m17596q(String str) {
        try {
            return new a().m17616j(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public List<String> m17597r() {
        return this.f17372f;
    }

    public String toString() {
        return this.f17375i;
    }

    /* renamed from: y */
    public int m17598y() {
        return this.f17371e;
    }

    /* renamed from: z */
    public String m17599z() {
        if (this.f17373g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        m17576o(sb2, this.f17373g);
        return sb2.toString();
    }
}
