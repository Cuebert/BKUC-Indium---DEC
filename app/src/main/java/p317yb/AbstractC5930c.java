package p317yb;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p291wb.C5492f;

/* renamed from: yb.c */
/* loaded from: classes.dex */
public abstract class AbstractC5930c {
    /* renamed from: b */
    public static AbstractC5930c m21093b(X509TrustManager x509TrustManager) {
        return C5492f.m20215l().mo20191c(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo20199a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
