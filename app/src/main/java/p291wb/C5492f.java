package p291wb;

import ac.C0073c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p193ob.C4171d0;
import p193ob.EnumC4173e0;
import p205pb.C4286e;
import p317yb.AbstractC5930c;
import p317yb.C5928a;
import p317yb.C5929b;
import p317yb.InterfaceC5932e;

/* renamed from: wb.f */
/* loaded from: classes.dex */
public class C5492f {

    /* renamed from: a */
    private static final C5492f f20482a = m20214k();

    /* renamed from: b */
    private static final Logger f20483b = Logger.getLogger(C4171d0.class.getName());

    /* renamed from: b */
    public static List<String> m20210b(List<EnumC4173e0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC4173e0 enumC4173e0 = list.get(i10);
            if (enumC4173e0 != EnumC4173e0.HTTP_1_0) {
                arrayList.add(enumC4173e0.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static byte[] m20211e(List<EnumC4173e0> list) {
        C0073c c0073c = new C0073c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC4173e0 enumC4173e0 = list.get(i10);
            if (enumC4173e0 != EnumC4173e0.HTTP_1_0) {
                c0073c.mo330G(enumC4173e0.toString().length());
                c0073c.mo350b0(enumC4173e0.toString());
            }
        }
        return c0073c.m368q0();
    }

    /* renamed from: i */
    private static C5492f m20212i() {
        C5492f m20183x = C5487a.m20183x();
        if (m20183x != null) {
            return m20183x;
        }
        C5492f m20189x = C5488b.m20189x();
        Objects.requireNonNull(m20189x, "No platform found on Android");
        return m20189x;
    }

    /* renamed from: j */
    private static C5492f m20213j() {
        C5489c m20204v;
        if (m20217s() && (m20204v = C5489c.m20204v()) != null) {
            return m20204v;
        }
        C5491e m20209v = C5491e.m20209v();
        if (m20209v != null) {
            return m20209v;
        }
        C5492f m20207v = C5490d.m20207v();
        return m20207v != null ? m20207v : new C5492f();
    }

    /* renamed from: k */
    private static C5492f m20214k() {
        if (m20216q()) {
            return m20212i();
        }
        return m20213j();
    }

    /* renamed from: l */
    public static C5492f m20215l() {
        return f20482a;
    }

    /* renamed from: q */
    public static boolean m20216q() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: s */
    public static boolean m20217s() {
        if ("conscrypt".equals(C4286e.m17754r("okhttp.platform", null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo20208a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public AbstractC5930c mo20191c(X509TrustManager x509TrustManager) {
        return new C5928a(mo20192d(x509TrustManager));
    }

    /* renamed from: d */
    public InterfaceC5932e mo20192d(X509TrustManager x509TrustManager) {
        return new C5929b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo20206f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) throws IOException {
    }

    /* renamed from: h */
    public void mo20193h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    /* renamed from: m */
    public String m20218m() {
        return "OkHttp";
    }

    /* renamed from: n */
    public SSLContext mo20194n() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: p */
    public Object mo20195p(String str) {
        if (f20483b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: r */
    public boolean mo20196r(String str) {
        return true;
    }

    /* renamed from: t */
    public void mo20197t(int i10, String str, Throwable th) {
        f20483b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: u */
    public void mo20198u(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo20197t(5, str, (Throwable) obj);
    }
}
