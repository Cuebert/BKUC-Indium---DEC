package p291wb;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p193ob.EnumC4173e0;

/* renamed from: wb.c */
/* loaded from: classes.dex */
public class C5489c extends C5492f {
    private C5489c() {
    }

    /* renamed from: v */
    public static C5489c m20204v() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C5489c();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: w */
    private Provider m20205w() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // p291wb.C5492f
    /* renamed from: f */
    public void mo20206f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C5492f.m20210b(list).toArray(new String[0]));
            return;
        }
        super.mo20185g(sSLSocket, str, list);
    }

    @Override // p291wb.C5492f
    /* renamed from: n */
    public SSLContext mo20194n() {
        try {
            return SSLContext.getInstance("TLSv1.3", m20205w());
        } catch (NoSuchAlgorithmException e10) {
            try {
                return SSLContext.getInstance("TLS", m20205w());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e10);
            }
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo20186o(sSLSocket);
    }
}
