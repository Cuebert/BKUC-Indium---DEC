package p317yb;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: yb.b */
/* loaded from: classes.dex */
public final class C5929b implements InterfaceC5932e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f21818a = new LinkedHashMap();

    public C5929b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f21818a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f21818a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // p317yb.InterfaceC5932e
    /* renamed from: a */
    public X509Certificate mo20203a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f21818a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C5929b) && ((C5929b) obj).f21818a.equals(this.f21818a);
    }

    public int hashCode() {
        return this.f21818a.hashCode();
    }
}
