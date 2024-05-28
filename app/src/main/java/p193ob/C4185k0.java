package p193ob;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: ob.k0 */
/* loaded from: classes.dex */
public final class C4185k0 {

    /* renamed from: a */
    final C4164a f17304a;

    /* renamed from: b */
    final Proxy f17305b;

    /* renamed from: c */
    final InetSocketAddress f17306c;

    public C4185k0(C4164a c4164a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(c4164a, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f17304a = c4164a;
        this.f17305b = proxy;
        this.f17306c = inetSocketAddress;
    }

    /* renamed from: a */
    public C4164a m17471a() {
        return this.f17304a;
    }

    /* renamed from: b */
    public Proxy m17472b() {
        return this.f17305b;
    }

    /* renamed from: c */
    public boolean m17473c() {
        return this.f17304a.f16961i != null && this.f17305b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress m17474d() {
        return this.f17306c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4185k0) {
            C4185k0 c4185k0 = (C4185k0) obj;
            if (c4185k0.f17304a.equals(this.f17304a) && c4185k0.f17305b.equals(this.f17305b) && c4185k0.f17306c.equals(this.f17306c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f17304a.hashCode()) * 31) + this.f17305b.hashCode()) * 31) + this.f17306c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f17306c + "}";
    }
}
