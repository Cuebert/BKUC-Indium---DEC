package p193ob;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p205pb.C4286e;

/* renamed from: ob.x */
/* loaded from: classes.dex */
public final class C4199x {

    /* renamed from: a */
    private final EnumC4187l0 f17360a;

    /* renamed from: b */
    private final C4184k f17361b;

    /* renamed from: c */
    private final List<Certificate> f17362c;

    /* renamed from: d */
    private final List<Certificate> f17363d;

    private C4199x(EnumC4187l0 enumC4187l0, C4184k c4184k, List<Certificate> list, List<Certificate> list2) {
        this.f17360a = enumC4187l0;
        this.f17361b = c4184k;
        this.f17362c = list;
        this.f17363d = list2;
    }

    /* renamed from: b */
    public static C4199x m17544b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                C4184k m17465b = C4184k.m17465b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        EnumC4187l0 m17476b = EnumC4187l0.m17476b(protocol);
                        try {
                            certificateArr = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                            certificateArr = null;
                        }
                        if (certificateArr != null) {
                            emptyList = C4286e.m17757u(certificateArr);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            emptyList2 = C4286e.m17757u(localCertificates);
                        } else {
                            emptyList2 = Collections.emptyList();
                        }
                        return new C4199x(m17476b, m17465b, emptyList, emptyList2);
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: c */
    public static C4199x m17545c(EnumC4187l0 enumC4187l0, C4184k c4184k, List<Certificate> list, List<Certificate> list2) {
        Objects.requireNonNull(enumC4187l0, "tlsVersion == null");
        Objects.requireNonNull(c4184k, "cipherSuite == null");
        return new C4199x(enumC4187l0, c4184k, C4286e.m17756t(list), C4286e.m17756t(list2));
    }

    /* renamed from: e */
    private List<String> m17546e(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C4184k m17547a() {
        return this.f17361b;
    }

    /* renamed from: d */
    public List<Certificate> m17548d() {
        return this.f17363d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4199x)) {
            return false;
        }
        C4199x c4199x = (C4199x) obj;
        return this.f17360a.equals(c4199x.f17360a) && this.f17361b.equals(c4199x.f17361b) && this.f17362c.equals(c4199x.f17362c) && this.f17363d.equals(c4199x.f17363d);
    }

    /* renamed from: f */
    public List<Certificate> m17549f() {
        return this.f17362c;
    }

    /* renamed from: g */
    public EnumC4187l0 m17550g() {
        return this.f17360a;
    }

    public int hashCode() {
        return ((((((527 + this.f17360a.hashCode()) * 31) + this.f17361b.hashCode()) * 31) + this.f17362c.hashCode()) * 31) + this.f17363d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f17360a + " cipherSuite=" + this.f17361b + " peerCertificates=" + m17546e(this.f17362c) + " localCertificates=" + m17546e(this.f17363d) + '}';
    }
}
