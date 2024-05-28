package p193ob;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p193ob.C4201z;
import p205pb.C4286e;

/* renamed from: ob.a */
/* loaded from: classes.dex */
public final class C4164a {

    /* renamed from: a */
    final C4201z f16953a;

    /* renamed from: b */
    final InterfaceC4195t f16954b;

    /* renamed from: c */
    final SocketFactory f16955c;

    /* renamed from: d */
    final InterfaceC4170d f16956d;

    /* renamed from: e */
    final List<EnumC4173e0> f16957e;

    /* renamed from: f */
    final List<C4189n> f16958f;

    /* renamed from: g */
    final ProxySelector f16959g;

    /* renamed from: h */
    final Proxy f16960h;

    /* renamed from: i */
    final SSLSocketFactory f16961i;

    /* renamed from: j */
    final HostnameVerifier f16962j;

    /* renamed from: k */
    final C4180i f16963k;

    public C4164a(String str, int i10, InterfaceC4195t interfaceC4195t, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4180i c4180i, InterfaceC4170d interfaceC4170d, Proxy proxy, List<EnumC4173e0> list, List<C4189n> list2, ProxySelector proxySelector) {
        this.f16953a = new C4201z.a().m17620s(sSLSocketFactory != null ? "https" : "http").m17615g(str).m17618n(i10).m17612c();
        Objects.requireNonNull(interfaceC4195t, "dns == null");
        this.f16954b = interfaceC4195t;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f16955c = socketFactory;
        Objects.requireNonNull(interfaceC4170d, "proxyAuthenticator == null");
        this.f16956d = interfaceC4170d;
        Objects.requireNonNull(list, "protocols == null");
        this.f16957e = C4286e.m17756t(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f16958f = C4286e.m17756t(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f16959g = proxySelector;
        this.f16960h = proxy;
        this.f16961i = sSLSocketFactory;
        this.f16962j = hostnameVerifier;
        this.f16963k = c4180i;
    }

    /* renamed from: a */
    public C4180i m17258a() {
        return this.f16963k;
    }

    /* renamed from: b */
    public List<C4189n> m17259b() {
        return this.f16958f;
    }

    /* renamed from: c */
    public InterfaceC4195t m17260c() {
        return this.f16954b;
    }

    /* renamed from: d */
    public boolean m17261d(C4164a c4164a) {
        return this.f16954b.equals(c4164a.f16954b) && this.f16956d.equals(c4164a.f16956d) && this.f16957e.equals(c4164a.f16957e) && this.f16958f.equals(c4164a.f16958f) && this.f16959g.equals(c4164a.f16959g) && Objects.equals(this.f16960h, c4164a.f16960h) && Objects.equals(this.f16961i, c4164a.f16961i) && Objects.equals(this.f16962j, c4164a.f16962j) && Objects.equals(this.f16963k, c4164a.f16963k) && m17269l().m17598y() == c4164a.m17269l().m17598y();
    }

    /* renamed from: e */
    public HostnameVerifier m17262e() {
        return this.f16962j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4164a) {
            C4164a c4164a = (C4164a) obj;
            if (this.f16953a.equals(c4164a.f16953a) && m17261d(c4164a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public List<EnumC4173e0> m17263f() {
        return this.f16957e;
    }

    /* renamed from: g */
    public Proxy m17264g() {
        return this.f16960h;
    }

    /* renamed from: h */
    public InterfaceC4170d m17265h() {
        return this.f16956d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f16953a.hashCode()) * 31) + this.f16954b.hashCode()) * 31) + this.f16956d.hashCode()) * 31) + this.f16957e.hashCode()) * 31) + this.f16958f.hashCode()) * 31) + this.f16959g.hashCode()) * 31) + Objects.hashCode(this.f16960h)) * 31) + Objects.hashCode(this.f16961i)) * 31) + Objects.hashCode(this.f16962j)) * 31) + Objects.hashCode(this.f16963k);
    }

    /* renamed from: i */
    public ProxySelector m17266i() {
        return this.f16959g;
    }

    /* renamed from: j */
    public SocketFactory m17267j() {
        return this.f16955c;
    }

    /* renamed from: k */
    public SSLSocketFactory m17268k() {
        return this.f16961i;
    }

    /* renamed from: l */
    public C4201z m17269l() {
        return this.f16953a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f16953a.m17593m());
        sb2.append(":");
        sb2.append(this.f16953a.m17598y());
        if (this.f16960h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f16960h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f16959g);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
