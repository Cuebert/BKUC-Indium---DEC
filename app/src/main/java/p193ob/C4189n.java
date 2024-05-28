package p193ob;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p205pb.C4286e;

/* renamed from: ob.n */
/* loaded from: classes.dex */
public final class C4189n {

    /* renamed from: e */
    private static final C4184k[] f17315e;

    /* renamed from: f */
    private static final C4184k[] f17316f;

    /* renamed from: g */
    public static final C4189n f17317g;

    /* renamed from: h */
    public static final C4189n f17318h;

    /* renamed from: i */
    public static final C4189n f17319i;

    /* renamed from: j */
    public static final C4189n f17320j;

    /* renamed from: a */
    final boolean f17321a;

    /* renamed from: b */
    final boolean f17322b;

    /* renamed from: c */
    final String[] f17323c;

    /* renamed from: d */
    final String[] f17324d;

    static {
        C4184k c4184k = C4184k.f17274n1;
        C4184k c4184k2 = C4184k.f17277o1;
        C4184k c4184k3 = C4184k.f17280p1;
        C4184k c4184k4 = C4184k.f17233Z0;
        C4184k c4184k5 = C4184k.f17244d1;
        C4184k c4184k6 = C4184k.f17235a1;
        C4184k c4184k7 = C4184k.f17247e1;
        C4184k c4184k8 = C4184k.f17265k1;
        C4184k c4184k9 = C4184k.f17262j1;
        C4184k[] c4184kArr = {c4184k, c4184k2, c4184k3, c4184k4, c4184k5, c4184k6, c4184k7, c4184k8, c4184k9};
        f17315e = c4184kArr;
        C4184k[] c4184kArr2 = {c4184k, c4184k2, c4184k3, c4184k4, c4184k5, c4184k6, c4184k7, c4184k8, c4184k9, C4184k.f17203K0, C4184k.f17205L0, C4184k.f17258i0, C4184k.f17261j0, C4184k.f17194G, C4184k.f17202K, C4184k.f17263k};
        f17316f = c4184kArr2;
        a m17488c = new a(true).m17488c(c4184kArr);
        EnumC4187l0 enumC4187l0 = EnumC4187l0.TLS_1_3;
        EnumC4187l0 enumC4187l02 = EnumC4187l0.TLS_1_2;
        f17317g = m17488c.m17491f(enumC4187l0, enumC4187l02).m17489d(true).m17486a();
        f17318h = new a(true).m17488c(c4184kArr2).m17491f(enumC4187l0, enumC4187l02).m17489d(true).m17486a();
        f17319i = new a(true).m17488c(c4184kArr2).m17491f(enumC4187l0, enumC4187l02, EnumC4187l0.TLS_1_1, EnumC4187l0.TLS_1_0).m17489d(true).m17486a();
        f17320j = new a(false).m17486a();
    }

    C4189n(a aVar) {
        this.f17321a = aVar.f17325a;
        this.f17323c = aVar.f17326b;
        this.f17324d = aVar.f17327c;
        this.f17322b = aVar.f17328d;
    }

    /* renamed from: e */
    private C4189n m17479e(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f17323c != null) {
            enabledCipherSuites = C4286e.m17762z(C4184k.f17236b, sSLSocket.getEnabledCipherSuites(), this.f17323c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f17324d != null) {
            enabledProtocols = C4286e.m17762z(C4286e.f17500j, sSLSocket.getEnabledProtocols(), this.f17324d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int m17759w = C4286e.m17759w(C4184k.f17236b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && m17759w != -1) {
            enabledCipherSuites = C4286e.m17745i(enabledCipherSuites, supportedCipherSuites[m17759w]);
        }
        return new a(this).m17487b(enabledCipherSuites).m17490e(enabledProtocols).m17486a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17480a(SSLSocket sSLSocket, boolean z10) {
        C4189n m17479e = m17479e(sSLSocket, z10);
        String[] strArr = m17479e.f17324d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = m17479e.f17323c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<C4184k> m17481b() {
        String[] strArr = this.f17323c;
        if (strArr != null) {
            return C4184k.m17466c(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m17482c(SSLSocket sSLSocket) {
        if (!this.f17321a) {
            return false;
        }
        String[] strArr = this.f17324d;
        if (strArr != null && !C4286e.m17726C(C4286e.f17500j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f17323c;
        return strArr2 == null || C4286e.m17726C(C4184k.f17236b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: d */
    public boolean m17483d() {
        return this.f17321a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4189n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4189n c4189n = (C4189n) obj;
        boolean z10 = this.f17321a;
        if (z10 != c4189n.f17321a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f17323c, c4189n.f17323c) && Arrays.equals(this.f17324d, c4189n.f17324d) && this.f17322b == c4189n.f17322b);
    }

    /* renamed from: f */
    public boolean m17484f() {
        return this.f17322b;
    }

    /* renamed from: g */
    public List<EnumC4187l0> m17485g() {
        String[] strArr = this.f17324d;
        if (strArr != null) {
            return EnumC4187l0.m17477c(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f17321a) {
            return ((((527 + Arrays.hashCode(this.f17323c)) * 31) + Arrays.hashCode(this.f17324d)) * 31) + (!this.f17322b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f17321a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m17481b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m17485g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f17322b + ")";
    }

    /* renamed from: ob.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f17325a;

        /* renamed from: b */
        String[] f17326b;

        /* renamed from: c */
        String[] f17327c;

        /* renamed from: d */
        boolean f17328d;

        a(boolean z10) {
            this.f17325a = z10;
        }

        /* renamed from: a */
        public C4189n m17486a() {
            return new C4189n(this);
        }

        /* renamed from: b */
        public a m17487b(String... strArr) {
            if (this.f17325a) {
                if (strArr.length != 0) {
                    this.f17326b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: c */
        public a m17488c(C4184k... c4184kArr) {
            if (this.f17325a) {
                String[] strArr = new String[c4184kArr.length];
                for (int i10 = 0; i10 < c4184kArr.length; i10++) {
                    strArr[i10] = c4184kArr[i10].f17303a;
                }
                return m17487b(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public a m17489d(boolean z10) {
            if (this.f17325a) {
                this.f17328d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public a m17490e(String... strArr) {
            if (this.f17325a) {
                if (strArr.length != 0) {
                    this.f17327c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: f */
        public a m17491f(EnumC4187l0... enumC4187l0Arr) {
            if (this.f17325a) {
                String[] strArr = new String[enumC4187l0Arr.length];
                for (int i10 = 0; i10 < enumC4187l0Arr.length; i10++) {
                    strArr[i10] = enumC4187l0Arr[i10].f17313n;
                }
                return m17490e(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(C4189n c4189n) {
            this.f17325a = c4189n.f17321a;
            this.f17326b = c4189n.f17323c;
            this.f17327c = c4189n.f17324d;
            this.f17328d = c4189n.f17322b;
        }
    }
}
