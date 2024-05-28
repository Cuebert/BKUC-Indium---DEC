package p193ob;

import ac.C0076f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p317yb.AbstractC5930c;

/* renamed from: ob.i */
/* loaded from: classes.dex */
public final class C4180i {

    /* renamed from: c */
    public static final C4180i f17138c = new a().m17422a();

    /* renamed from: a */
    private final Set<b> f17139a;

    /* renamed from: b */
    private final AbstractC5930c f17140b;

    /* renamed from: ob.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<b> f17141a = new ArrayList();

        /* renamed from: a */
        public C4180i m17422a() {
            return new C4180i(new LinkedHashSet(this.f17141a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ob.i$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final String f17142a;

        /* renamed from: b */
        final String f17143b;

        /* renamed from: c */
        final String f17144c;

        /* renamed from: d */
        final C0076f f17145d;

        /* renamed from: a */
        boolean m17423a(String str) {
            if (this.f17142a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == this.f17143b.length()) {
                    String str2 = this.f17143b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        return true;
                    }
                }
                return false;
            }
            return str.equals(this.f17143b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f17142a.equals(bVar.f17142a) && this.f17144c.equals(bVar.f17144c) && this.f17145d.equals(bVar.f17145d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f17142a.hashCode()) * 31) + this.f17144c.hashCode()) * 31) + this.f17145d.hashCode();
        }

        public String toString() {
            return this.f17144c + this.f17145d.mo390b();
        }
    }

    C4180i(Set<b> set, AbstractC5930c abstractC5930c) {
        this.f17139a = set;
        this.f17140b = abstractC5930c;
    }

    /* renamed from: c */
    public static String m17416c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m17418e((X509Certificate) certificate).mo390b();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static C0076f m17417d(X509Certificate x509Certificate) {
        return C0076f.m389m(x509Certificate.getPublicKey().getEncoded()).mo397p();
    }

    /* renamed from: e */
    static C0076f m17418e(X509Certificate x509Certificate) {
        return C0076f.m389m(x509Certificate.getPublicKey().getEncoded()).mo398q();
    }

    /* renamed from: a */
    public void m17419a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> m17420b = m17420b(str);
        if (m17420b.isEmpty()) {
            return;
        }
        AbstractC5930c abstractC5930c = this.f17140b;
        if (abstractC5930c != null) {
            list = abstractC5930c.mo20199a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = m17420b.size();
            C0076f c0076f = null;
            C0076f c0076f2 = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = m17420b.get(i11);
                if (bVar.f17144c.equals("sha256/")) {
                    if (c0076f == null) {
                        c0076f = m17418e(x509Certificate);
                    }
                    if (bVar.f17145d.equals(c0076f)) {
                        return;
                    }
                } else if (bVar.f17144c.equals("sha1/")) {
                    if (c0076f2 == null) {
                        c0076f2 = m17417d(x509Certificate);
                    }
                    if (bVar.f17145d.equals(c0076f2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.f17144c);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb2.append("\n    ");
            sb2.append(m17416c(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        int size4 = m17420b.size();
        for (int i13 = 0; i13 < size4; i13++) {
            b bVar2 = m17420b.get(i13);
            sb2.append("\n    ");
            sb2.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    /* renamed from: b */
    List<b> m17420b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f17139a) {
            if (bVar.m17423a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4180i) {
            C4180i c4180i = (C4180i) obj;
            if (Objects.equals(this.f17140b, c4180i.f17140b) && this.f17139a.equals(c4180i.f17139a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C4180i m17421f(AbstractC5930c abstractC5930c) {
        return Objects.equals(this.f17140b, abstractC5930c) ? this : new C4180i(this.f17139a, abstractC5930c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f17140b) * 31) + this.f17139a.hashCode();
    }
}
