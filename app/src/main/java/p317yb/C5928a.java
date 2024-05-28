package p317yb;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: yb.a */
/* loaded from: classes.dex */
public final class C5928a extends AbstractC5930c {

    /* renamed from: a */
    private final InterfaceC5932e f21817a;

    public C5928a(InterfaceC5932e interfaceC5932e) {
        this.f21817a = interfaceC5932e;
    }

    /* renamed from: c */
    private boolean m21092c(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p317yb.AbstractC5930c
    /* renamed from: a */
    public List<Certificate> mo20199a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate mo20203a = this.f21817a.mo20203a(x509Certificate);
            if (mo20203a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(mo20203a)) {
                    arrayList.add(mo20203a);
                }
                if (m21092c(mo20203a, mo20203a)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m21092c(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C5928a) && ((C5928a) obj).f21817a.equals(this.f21817a);
    }

    public int hashCode() {
        return this.f21817a.hashCode();
    }
}
