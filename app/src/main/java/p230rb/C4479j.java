package p230rb;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p193ob.AbstractC4197v;
import p193ob.C4164a;
import p193ob.C4185k0;
import p193ob.C4201z;
import p193ob.InterfaceC4176g;
import p205pb.C4286e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.j */
/* loaded from: classes.dex */
public final class C4479j {

    /* renamed from: a */
    private final C4164a f18140a;

    /* renamed from: b */
    private final C4477h f18141b;

    /* renamed from: c */
    private final InterfaceC4176g f18142c;

    /* renamed from: d */
    private final AbstractC4197v f18143d;

    /* renamed from: f */
    private int f18145f;

    /* renamed from: e */
    private List<Proxy> f18144e = Collections.emptyList();

    /* renamed from: g */
    private List<InetSocketAddress> f18146g = Collections.emptyList();

    /* renamed from: h */
    private final List<C4185k0> f18147h = new ArrayList();

    /* renamed from: rb.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<C4185k0> f18148a;

        /* renamed from: b */
        private int f18149b = 0;

        a(List<C4185k0> list) {
            this.f18148a = list;
        }

        /* renamed from: a */
        public List<C4185k0> m18409a() {
            return new ArrayList(this.f18148a);
        }

        /* renamed from: b */
        public boolean m18410b() {
            return this.f18149b < this.f18148a.size();
        }

        /* renamed from: c */
        public C4185k0 m18411c() {
            if (m18410b()) {
                List<C4185k0> list = this.f18148a;
                int i10 = this.f18149b;
                this.f18149b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4479j(C4164a c4164a, C4477h c4477h, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v) {
        this.f18140a = c4164a;
        this.f18141b = c4477h;
        this.f18142c = interfaceC4176g;
        this.f18143d = abstractC4197v;
        m18406g(c4164a.m17269l(), c4164a.m17264g());
    }

    /* renamed from: a */
    static String m18402a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: c */
    private boolean m18403c() {
        return this.f18145f < this.f18144e.size();
    }

    /* renamed from: e */
    private Proxy m18404e() throws IOException {
        if (m18403c()) {
            List<Proxy> list = this.f18144e;
            int i10 = this.f18145f;
            this.f18145f = i10 + 1;
            Proxy proxy = list.get(i10);
            m18405f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18140a.m17269l().m17593m() + "; exhausted proxy configurations: " + this.f18144e);
    }

    /* renamed from: f */
    private void m18405f(Proxy proxy) throws IOException {
        String m17593m;
        int m17598y;
        this.f18146g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                m17593m = m18402a(inetSocketAddress);
                m17598y = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            m17593m = this.f18140a.m17269l().m17593m();
            m17598y = this.f18140a.m17269l().m17598y();
        }
        if (m17598y >= 1 && m17598y <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f18146g.add(InetSocketAddress.createUnresolved(m17593m, m17598y));
                return;
            }
            this.f18143d.mo17527k(this.f18142c, m17593m);
            List<InetAddress> mo17512a = this.f18140a.m17260c().mo17512a(m17593m);
            if (!mo17512a.isEmpty()) {
                this.f18143d.mo17526j(this.f18142c, m17593m, mo17512a);
                int size = mo17512a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f18146g.add(new InetSocketAddress(mo17512a.get(i10), m17598y));
                }
                return;
            }
            throw new UnknownHostException(this.f18140a.m17260c() + " returned no addresses for " + m17593m);
        }
        throw new SocketException("No route to " + m17593m + ":" + m17598y + "; port is out of range");
    }

    /* renamed from: g */
    private void m18406g(C4201z c4201z, Proxy proxy) {
        if (proxy != null) {
            this.f18144e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f18140a.m17266i().select(c4201z.m17586E());
            this.f18144e = (select == null || select.isEmpty()) ? C4286e.m17757u(Proxy.NO_PROXY) : C4286e.m17756t(select);
        }
        this.f18145f = 0;
    }

    /* renamed from: b */
    public boolean m18407b() {
        return m18403c() || !this.f18147h.isEmpty();
    }

    /* renamed from: d */
    public a m18408d() throws IOException {
        if (m18407b()) {
            ArrayList arrayList = new ArrayList();
            while (m18403c()) {
                Proxy m18404e = m18404e();
                int size = this.f18146g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C4185k0 c4185k0 = new C4185k0(this.f18140a, m18404e, this.f18146g.get(i10));
                    if (this.f18141b.m18398c(c4185k0)) {
                        this.f18147h.add(c4185k0);
                    } else {
                        arrayList.add(c4185k0);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f18147h);
                this.f18147h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
