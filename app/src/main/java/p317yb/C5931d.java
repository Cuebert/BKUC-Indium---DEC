package p317yb;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p205pb.C4286e;

/* renamed from: yb.d */
/* loaded from: classes.dex */
public final class C5931d implements HostnameVerifier {

    /* renamed from: a */
    public static final C5931d f21819a = new C5931d();

    private C5931d() {
    }

    /* renamed from: a */
    public static List<String> m21094a(X509Certificate x509Certificate) {
        List<String> m21095b = m21095b(x509Certificate, 7);
        List<String> m21095b2 = m21095b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m21095b.size() + m21095b2.size());
        arrayList.addAll(m21095b);
        arrayList.addAll(m21095b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m21095b(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    private boolean m21096e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m21095b(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m21099d(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m21097f(String str, X509Certificate x509Certificate) {
        List<String> m21095b = m21095b(x509Certificate, 7);
        int size = m21095b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(m21095b.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m21098c(String str, X509Certificate x509Certificate) {
        if (C4286e.m17736M(str)) {
            return m21097f(str, x509Certificate);
        }
        return m21096e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean m21099d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m21098c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
