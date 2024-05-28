package p266ub;

import ac.C0073c;
import ac.C0076f;
import ac.C0082l;
import ac.InterfaceC0075e;
import ac.InterfaceC0090t;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ub.d */
/* loaded from: classes.dex */
public final class C4912d {

    /* renamed from: a */
    static final C4911c[] f18803a;

    /* renamed from: b */
    static final Map<C0076f, Integer> f18804b;

    /* renamed from: ub.d$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        private final List<C4911c> f18805a;

        /* renamed from: b */
        private final InterfaceC0075e f18806b;

        /* renamed from: c */
        private final int f18807c;

        /* renamed from: d */
        private int f18808d;

        /* renamed from: e */
        C4911c[] f18809e;

        /* renamed from: f */
        int f18810f;

        /* renamed from: g */
        int f18811g;

        /* renamed from: h */
        int f18812h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, InterfaceC0090t interfaceC0090t) {
            this(i10, i10, interfaceC0090t);
        }

        /* renamed from: a */
        private void m19170a() {
            int i10 = this.f18808d;
            int i11 = this.f18812h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m19171b();
                } else {
                    m19173d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        private void m19171b() {
            Arrays.fill(this.f18809e, (Object) null);
            this.f18810f = this.f18809e.length - 1;
            this.f18811g = 0;
            this.f18812h = 0;
        }

        /* renamed from: c */
        private int m19172c(int i10) {
            return this.f18810f + 1 + i10;
        }

        /* renamed from: d */
        private int m19173d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f18809e.length;
                while (true) {
                    length--;
                    i11 = this.f18810f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C4911c[] c4911cArr = this.f18809e;
                    i10 -= c4911cArr[length].f18802c;
                    this.f18812h -= c4911cArr[length].f18802c;
                    this.f18811g--;
                    i12++;
                }
                C4911c[] c4911cArr2 = this.f18809e;
                System.arraycopy(c4911cArr2, i11 + 1, c4911cArr2, i11 + 1 + i12, this.f18811g);
                this.f18810f += i12;
            }
            return i12;
        }

        /* renamed from: f */
        private C0076f m19174f(int i10) throws IOException {
            if (m19176h(i10)) {
                return C4912d.f18803a[i10].f18800a;
            }
            int m19172c = m19172c(i10 - C4912d.f18803a.length);
            if (m19172c >= 0) {
                C4911c[] c4911cArr = this.f18809e;
                if (m19172c < c4911cArr.length) {
                    return c4911cArr[m19172c].f18800a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: g */
        private void m19175g(int i10, C4911c c4911c) {
            this.f18805a.add(c4911c);
            int i11 = c4911c.f18802c;
            if (i10 != -1) {
                i11 -= this.f18809e[m19172c(i10)].f18802c;
            }
            int i12 = this.f18808d;
            if (i11 > i12) {
                m19171b();
                return;
            }
            int m19173d = m19173d((this.f18812h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f18811g + 1;
                C4911c[] c4911cArr = this.f18809e;
                if (i13 > c4911cArr.length) {
                    C4911c[] c4911cArr2 = new C4911c[c4911cArr.length * 2];
                    System.arraycopy(c4911cArr, 0, c4911cArr2, c4911cArr.length, c4911cArr.length);
                    this.f18810f = this.f18809e.length - 1;
                    this.f18809e = c4911cArr2;
                }
                int i14 = this.f18810f;
                this.f18810f = i14 - 1;
                this.f18809e[i14] = c4911c;
                this.f18811g++;
            } else {
                this.f18809e[i10 + m19172c(i10) + m19173d] = c4911c;
            }
            this.f18812h += i11;
        }

        /* renamed from: h */
        private boolean m19176h(int i10) {
            return i10 >= 0 && i10 <= C4912d.f18803a.length - 1;
        }

        /* renamed from: i */
        private int m19177i() throws IOException {
            return this.f18806b.readByte() & 255;
        }

        /* renamed from: l */
        private void m19178l(int i10) throws IOException {
            if (m19176h(i10)) {
                this.f18805a.add(C4912d.f18803a[i10]);
                return;
            }
            int m19172c = m19172c(i10 - C4912d.f18803a.length);
            if (m19172c >= 0) {
                C4911c[] c4911cArr = this.f18809e;
                if (m19172c < c4911cArr.length) {
                    this.f18805a.add(c4911cArr[m19172c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: n */
        private void m19179n(int i10) throws IOException {
            m19175g(-1, new C4911c(m19174f(i10), m19184j()));
        }

        /* renamed from: o */
        private void m19180o() throws IOException {
            m19175g(-1, new C4911c(C4912d.m19168a(m19184j()), m19184j()));
        }

        /* renamed from: p */
        private void m19181p(int i10) throws IOException {
            this.f18805a.add(new C4911c(m19174f(i10), m19184j()));
        }

        /* renamed from: q */
        private void m19182q() throws IOException {
            this.f18805a.add(new C4911c(C4912d.m19168a(m19184j()), m19184j()));
        }

        /* renamed from: e */
        public List<C4911c> m19183e() {
            ArrayList arrayList = new ArrayList(this.f18805a);
            this.f18805a.clear();
            return arrayList;
        }

        /* renamed from: j */
        C0076f m19184j() throws IOException {
            int m19177i = m19177i();
            boolean z10 = (m19177i & 128) == 128;
            int m19186m = m19186m(m19177i, 127);
            if (z10) {
                return C0076f.m389m(C4919k.m19308f().m19309c(this.f18806b.mo333I(m19186m)));
            }
            return this.f18806b.mo366p(m19186m);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public void m19185k() throws IOException {
            while (!this.f18806b.mo328F()) {
                int readByte = this.f18806b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m19178l(m19186m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m19180o();
                } else if ((readByte & 64) == 64) {
                    m19179n(m19186m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m19186m = m19186m(readByte, 31);
                    this.f18808d = m19186m;
                    if (m19186m >= 0 && m19186m <= this.f18807c) {
                        m19170a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f18808d);
                    }
                } else if (readByte != 16 && readByte != 0) {
                    m19181p(m19186m(readByte, 15) - 1);
                } else {
                    m19182q();
                }
            }
        }

        /* renamed from: m */
        int m19186m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m19177i = m19177i();
                if ((m19177i & 128) == 0) {
                    return i11 + (m19177i << i13);
                }
                i11 += (m19177i & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, InterfaceC0090t interfaceC0090t) {
            this.f18805a = new ArrayList();
            this.f18809e = new C4911c[8];
            this.f18810f = r0.length - 1;
            this.f18811g = 0;
            this.f18812h = 0;
            this.f18807c = i10;
            this.f18808d = i11;
            this.f18806b = C0082l.m425d(interfaceC0090t);
        }
    }

    /* renamed from: ub.d$b */
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a */
        private final C0073c f18813a;

        /* renamed from: b */
        private final boolean f18814b;

        /* renamed from: c */
        private int f18815c;

        /* renamed from: d */
        private boolean f18816d;

        /* renamed from: e */
        int f18817e;

        /* renamed from: f */
        int f18818f;

        /* renamed from: g */
        C4911c[] f18819g;

        /* renamed from: h */
        int f18820h;

        /* renamed from: i */
        int f18821i;

        /* renamed from: j */
        int f18822j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C0073c c0073c) {
            this(4096, true, c0073c);
        }

        /* renamed from: a */
        private void m19187a() {
            int i10 = this.f18818f;
            int i11 = this.f18822j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m19188b();
                } else {
                    m19189c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        private void m19188b() {
            Arrays.fill(this.f18819g, (Object) null);
            this.f18820h = this.f18819g.length - 1;
            this.f18821i = 0;
            this.f18822j = 0;
        }

        /* renamed from: c */
        private int m19189c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f18819g.length;
                while (true) {
                    length--;
                    i11 = this.f18820h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C4911c[] c4911cArr = this.f18819g;
                    i10 -= c4911cArr[length].f18802c;
                    this.f18822j -= c4911cArr[length].f18802c;
                    this.f18821i--;
                    i12++;
                }
                C4911c[] c4911cArr2 = this.f18819g;
                System.arraycopy(c4911cArr2, i11 + 1, c4911cArr2, i11 + 1 + i12, this.f18821i);
                C4911c[] c4911cArr3 = this.f18819g;
                int i13 = this.f18820h;
                Arrays.fill(c4911cArr3, i13 + 1, i13 + 1 + i12, (Object) null);
                this.f18820h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        private void m19190d(C4911c c4911c) {
            int i10 = c4911c.f18802c;
            int i11 = this.f18818f;
            if (i10 > i11) {
                m19188b();
                return;
            }
            m19189c((this.f18822j + i10) - i11);
            int i12 = this.f18821i + 1;
            C4911c[] c4911cArr = this.f18819g;
            if (i12 > c4911cArr.length) {
                C4911c[] c4911cArr2 = new C4911c[c4911cArr.length * 2];
                System.arraycopy(c4911cArr, 0, c4911cArr2, c4911cArr.length, c4911cArr.length);
                this.f18820h = this.f18819g.length - 1;
                this.f18819g = c4911cArr2;
            }
            int i13 = this.f18820h;
            this.f18820h = i13 - 1;
            this.f18819g[i13] = c4911c;
            this.f18821i++;
            this.f18822j += i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public void m19191e(int i10) {
            this.f18817e = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f18818f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f18815c = Math.min(this.f18815c, min);
            }
            this.f18816d = true;
            this.f18818f = min;
            m19187a();
        }

        /* renamed from: f */
        void m19192f(C0076f c0076f) throws IOException {
            if (this.f18814b && C4919k.m19308f().m19311e(c0076f) < c0076f.mo399r()) {
                C0073c c0073c = new C0073c();
                C4919k.m19308f().m19310d(c0076f, c0073c);
                C0076f m370r0 = c0073c.m370r0();
                m19194h(m370r0.mo399r(), 127, 128);
                this.f18813a.mo326E(m370r0);
                return;
            }
            m19194h(c0076f.mo399r(), 127, 0);
            this.f18813a.mo326E(c0076f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m19193g(List<C4911c> list) throws IOException {
            int i10;
            int i11;
            if (this.f18816d) {
                int i12 = this.f18815c;
                if (i12 < this.f18818f) {
                    m19194h(i12, 31, 32);
                }
                this.f18816d = false;
                this.f18815c = Integer.MAX_VALUE;
                m19194h(this.f18818f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C4911c c4911c = list.get(i13);
                C0076f mo402u = c4911c.f18800a.mo402u();
                C0076f c0076f = c4911c.f18801b;
                Integer num = C4912d.f18804b.get(mo402u);
                if (num != null) {
                    i10 = num.intValue() + 1;
                    if (i10 > 1 && i10 < 8) {
                        C4911c[] c4911cArr = C4912d.f18803a;
                        if (Objects.equals(c4911cArr[i10 - 1].f18801b, c0076f)) {
                            i11 = i10;
                        } else if (Objects.equals(c4911cArr[i10].f18801b, c0076f)) {
                            i11 = i10;
                            i10++;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f18820h + 1;
                    int length = this.f18819g.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f18819g[i14].f18800a, mo402u)) {
                            if (Objects.equals(this.f18819g[i14].f18801b, c0076f)) {
                                i10 = C4912d.f18803a.length + (i14 - this.f18820h);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f18820h) + C4912d.f18803a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    m19194h(i10, 127, 128);
                } else if (i11 == -1) {
                    this.f18813a.mo330G(64);
                    m19192f(mo402u);
                    m19192f(c0076f);
                    m19190d(c4911c);
                } else if (mo402u.m400s(C4911c.f18794d) && !C4911c.f18799i.equals(mo402u)) {
                    m19194h(i11, 15, 0);
                    m19192f(c0076f);
                } else {
                    m19194h(i11, 63, 64);
                    m19192f(c0076f);
                    m19190d(c4911c);
                }
            }
        }

        /* renamed from: h */
        void m19194h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f18813a.mo330G(i10 | i12);
                return;
            }
            this.f18813a.mo330G(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f18813a.mo330G(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f18813a.mo330G(i13);
        }

        b(int i10, boolean z10, C0073c c0073c) {
            this.f18815c = Integer.MAX_VALUE;
            this.f18819g = new C4911c[8];
            this.f18820h = r0.length - 1;
            this.f18821i = 0;
            this.f18822j = 0;
            this.f18817e = i10;
            this.f18818f = i10;
            this.f18814b = z10;
            this.f18813a = c0073c;
        }
    }

    static {
        C0076f c0076f = C4911c.f18796f;
        C0076f c0076f2 = C4911c.f18797g;
        C0076f c0076f3 = C4911c.f18798h;
        C0076f c0076f4 = C4911c.f18795e;
        f18803a = new C4911c[]{new C4911c(C4911c.f18799i, BuildConfig.FLAVOR), new C4911c(c0076f, "GET"), new C4911c(c0076f, "POST"), new C4911c(c0076f2, "/"), new C4911c(c0076f2, "/index.html"), new C4911c(c0076f3, "http"), new C4911c(c0076f3, "https"), new C4911c(c0076f4, "200"), new C4911c(c0076f4, "204"), new C4911c(c0076f4, "206"), new C4911c(c0076f4, "304"), new C4911c(c0076f4, "400"), new C4911c(c0076f4, "404"), new C4911c(c0076f4, "500"), new C4911c("accept-charset", BuildConfig.FLAVOR), new C4911c("accept-encoding", "gzip, deflate"), new C4911c("accept-language", BuildConfig.FLAVOR), new C4911c("accept-ranges", BuildConfig.FLAVOR), new C4911c("accept", BuildConfig.FLAVOR), new C4911c("access-control-allow-origin", BuildConfig.FLAVOR), new C4911c("age", BuildConfig.FLAVOR), new C4911c("allow", BuildConfig.FLAVOR), new C4911c("authorization", BuildConfig.FLAVOR), new C4911c("cache-control", BuildConfig.FLAVOR), new C4911c("content-disposition", BuildConfig.FLAVOR), new C4911c("content-encoding", BuildConfig.FLAVOR), new C4911c("content-language", BuildConfig.FLAVOR), new C4911c("content-length", BuildConfig.FLAVOR), new C4911c("content-location", BuildConfig.FLAVOR), new C4911c("content-range", BuildConfig.FLAVOR), new C4911c("content-type", BuildConfig.FLAVOR), new C4911c("cookie", BuildConfig.FLAVOR), new C4911c("date", BuildConfig.FLAVOR), new C4911c("etag", BuildConfig.FLAVOR), new C4911c("expect", BuildConfig.FLAVOR), new C4911c("expires", BuildConfig.FLAVOR), new C4911c("from", BuildConfig.FLAVOR), new C4911c("host", BuildConfig.FLAVOR), new C4911c("if-match", BuildConfig.FLAVOR), new C4911c("if-modified-since", BuildConfig.FLAVOR), new C4911c("if-none-match", BuildConfig.FLAVOR), new C4911c("if-range", BuildConfig.FLAVOR), new C4911c("if-unmodified-since", BuildConfig.FLAVOR), new C4911c("last-modified", BuildConfig.FLAVOR), new C4911c("link", BuildConfig.FLAVOR), new C4911c("location", BuildConfig.FLAVOR), new C4911c("max-forwards", BuildConfig.FLAVOR), new C4911c("proxy-authenticate", BuildConfig.FLAVOR), new C4911c("proxy-authorization", BuildConfig.FLAVOR), new C4911c("range", BuildConfig.FLAVOR), new C4911c("referer", BuildConfig.FLAVOR), new C4911c("refresh", BuildConfig.FLAVOR), new C4911c("retry-after", BuildConfig.FLAVOR), new C4911c("server", BuildConfig.FLAVOR), new C4911c("set-cookie", BuildConfig.FLAVOR), new C4911c("strict-transport-security", BuildConfig.FLAVOR), new C4911c("transfer-encoding", BuildConfig.FLAVOR), new C4911c("user-agent", BuildConfig.FLAVOR), new C4911c("vary", BuildConfig.FLAVOR), new C4911c("via", BuildConfig.FLAVOR), new C4911c("www-authenticate", BuildConfig.FLAVOR)};
        f18804b = m19169b();
    }

    /* renamed from: a */
    static C0076f m19168a(C0076f c0076f) throws IOException {
        int mo399r = c0076f.mo399r();
        for (int i10 = 0; i10 < mo399r; i10++) {
            byte mo392j = c0076f.mo392j(i10);
            if (mo392j >= 65 && mo392j <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c0076f.mo404w());
            }
        }
        return c0076f;
    }

    /* renamed from: b */
    private static Map<C0076f, Integer> m19169b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f18803a.length);
        int i10 = 0;
        while (true) {
            C4911c[] c4911cArr = f18803a;
            if (i10 < c4911cArr.length) {
                if (!linkedHashMap.containsKey(c4911cArr[i10].f18800a)) {
                    linkedHashMap.put(c4911cArr[i10].f18800a, Integer.valueOf(i10));
                }
                i10++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
