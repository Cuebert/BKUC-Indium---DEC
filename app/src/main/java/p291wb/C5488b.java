package p291wb;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p193ob.EnumC4173e0;
import p205pb.C4286e;
import p317yb.AbstractC5930c;
import p317yb.InterfaceC5932e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wb.b */
/* loaded from: classes.dex */
public class C5488b extends C5492f {

    /* renamed from: c */
    private final Class<?> f20458c;

    /* renamed from: d */
    private final Class<?> f20459d;

    /* renamed from: e */
    private final Method f20460e;

    /* renamed from: f */
    private final Method f20461f;

    /* renamed from: g */
    private final Method f20462g;

    /* renamed from: h */
    private final Method f20463h;

    /* renamed from: i */
    private final b f20464i = b.m20200b();

    /* renamed from: wb.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5930c {

        /* renamed from: a */
        private final Object f20465a;

        /* renamed from: b */
        private final Method f20466b;

        a(Object obj, Method method) {
            this.f20465a = obj;
            this.f20466b = method;
        }

        @Override // p317yb.AbstractC5930c
        /* renamed from: a */
        public List<Certificate> mo20199a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f20466b.invoke(this.f20465a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: wb.b$b */
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a */
        private final Method f20467a;

        /* renamed from: b */
        private final Method f20468b;

        /* renamed from: c */
        private final Method f20469c;

        b(Method method, Method method2, Method method3) {
            this.f20467a = method;
            this.f20468b = method2;
            this.f20469c = method3;
        }

        /* renamed from: b */
        static b m20200b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }

        /* renamed from: a */
        Object m20201a(String str) {
            Method method = this.f20467a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f20468b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: c */
        boolean m20202c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f20469c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: wb.b$c */
    /* loaded from: classes.dex */
    static final class c implements InterfaceC5932e {

        /* renamed from: a */
        private final X509TrustManager f20470a;

        /* renamed from: b */
        private final Method f20471b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.f20471b = method;
            this.f20470a = x509TrustManager;
        }

        @Override // p317yb.InterfaceC5932e
        /* renamed from: a */
        public X509Certificate mo20203a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f20471b.invoke(this.f20470a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20470a.equals(cVar.f20470a) && this.f20471b.equals(cVar.f20471b);
        }

        public int hashCode() {
            return this.f20470a.hashCode() + (this.f20471b.hashCode() * 31);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5488b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f20458c = cls;
        this.f20459d = cls2;
        this.f20460e = method;
        this.f20461f = method2;
        this.f20462g = method3;
        this.f20463h = method4;
    }

    /* renamed from: v */
    private boolean m20187v(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo20196r(str);
        }
    }

    /* renamed from: w */
    private boolean m20188w(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m20187v(str, cls, obj);
        }
    }

    /* renamed from: x */
    public static C5492f m20189x() {
        if (!C5492f.m20216q()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new C5488b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m20190y() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: c */
    public AbstractC5930c mo20191c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo20191c(x509TrustManager);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: d */
    public InterfaceC5932e mo20192d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo20192d(x509TrustManager);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: g */
    public void mo20185g(SSLSocket sSLSocket, String str, List<EnumC4173e0> list) throws IOException {
        if (this.f20459d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f20460e.invoke(sSLSocket, Boolean.TRUE);
                    this.f20461f.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new AssertionError(e10);
                }
            }
            this.f20463h.invoke(sSLSocket, C5492f.m20211e(list));
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: h */
    public void mo20193h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!C4286e.m17724A(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e11);
            }
            throw e11;
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: n */
    public SSLContext mo20194n() {
        boolean z10 = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z10 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z10) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: o */
    public String mo20186o(SSLSocket sSLSocket) {
        if (!this.f20459d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f20462g.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: p */
    public Object mo20195p(String str) {
        return this.f20464i.m20201a(str);
    }

    @Override // p291wb.C5492f
    /* renamed from: r */
    public boolean mo20196r(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m20188w(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo20196r(str);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: t */
    public void mo20197t(int i10, String str, Throwable th) {
        int min;
        int i11 = i10 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i12 = min;
                }
            }
            i12 = min + 1;
        }
    }

    @Override // p291wb.C5492f
    /* renamed from: u */
    public void mo20198u(String str, Object obj) {
        if (this.f20464i.m20202c(obj)) {
            return;
        }
        mo20197t(5, str, null);
    }
}
