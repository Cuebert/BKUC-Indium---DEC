package p230rb;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p193ob.C4189n;
import p205pb.AbstractC4282a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.b */
/* loaded from: classes.dex */
public final class C4471b {

    /* renamed from: a */
    private final List<C4189n> f18083a;

    /* renamed from: b */
    private int f18084b = 0;

    /* renamed from: c */
    private boolean f18085c;

    /* renamed from: d */
    private boolean f18086d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4471b(List<C4189n> list) {
        this.f18083a = list;
    }

    /* renamed from: c */
    private boolean m18337c(SSLSocket sSLSocket) {
        for (int i10 = this.f18084b; i10 < this.f18083a.size(); i10++) {
            if (this.f18083a.get(i10).m17482c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4189n m18338a(SSLSocket sSLSocket) throws IOException {
        C4189n c4189n;
        int i10 = this.f18084b;
        int size = this.f18083a.size();
        while (true) {
            if (i10 >= size) {
                c4189n = null;
                break;
            }
            c4189n = this.f18083a.get(i10);
            if (c4189n.m17482c(sSLSocket)) {
                this.f18084b = i10 + 1;
                break;
            }
            i10++;
        }
        if (c4189n != null) {
            this.f18085c = m18337c(sSLSocket);
            AbstractC4282a.f17486a.mo17321c(c4189n, sSLSocket, this.f18086d);
            return c4189n;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f18086d + ", modes=" + this.f18083a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m18339b(IOException iOException) {
        this.f18086d = true;
        if (!this.f18085c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
