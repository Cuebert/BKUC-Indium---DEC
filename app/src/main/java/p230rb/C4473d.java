package p230rb;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import p193ob.AbstractC4197v;
import p193ob.C4164a;
import p193ob.C4171d0;
import p193ob.C4185k0;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4176g;
import p205pb.C4286e;
import p230rb.C4479j;
import sb.InterfaceC4554c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.d */
/* loaded from: classes.dex */
public final class C4473d {

    /* renamed from: a */
    private final C4480k f18103a;

    /* renamed from: b */
    private final C4164a f18104b;

    /* renamed from: c */
    private final C4476g f18105c;

    /* renamed from: d */
    private final InterfaceC4176g f18106d;

    /* renamed from: e */
    private final AbstractC4197v f18107e;

    /* renamed from: f */
    private C4479j.a f18108f;

    /* renamed from: g */
    private final C4479j f18109g;

    /* renamed from: h */
    private C4474e f18110h;

    /* renamed from: i */
    private boolean f18111i;

    /* renamed from: j */
    private C4185k0 f18112j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4473d(C4480k c4480k, C4476g c4476g, C4164a c4164a, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v) {
        this.f18103a = c4480k;
        this.f18105c = c4476g;
        this.f18104b = c4164a;
        this.f18106d = interfaceC4176g;
        this.f18107e = abstractC4197v;
        this.f18109g = new C4479j(c4164a, c4476g.f18135e, interfaceC4176g, abstractC4197v);
    }

    /* renamed from: c */
    private C4474e m18358c(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        C4474e c4474e;
        Socket socket;
        Socket m18426n;
        C4474e c4474e2;
        C4185k0 c4185k0;
        boolean z11;
        boolean z12;
        List<C4185k0> list;
        C4479j.a aVar;
        synchronized (this.f18105c) {
            if (!this.f18103a.m18422i()) {
                this.f18111i = false;
                C4480k c4480k = this.f18103a;
                c4474e = c4480k.f18158i;
                socket = null;
                m18426n = (c4474e == null || !c4474e.f18122k) ? null : c4480k.m18426n();
                C4480k c4480k2 = this.f18103a;
                c4474e2 = c4480k2.f18158i;
                if (c4474e2 != null) {
                    c4474e = null;
                } else {
                    c4474e2 = null;
                }
                if (c4474e2 == null) {
                    if (this.f18105c.m18395h(this.f18104b, c4480k2, null, false)) {
                        c4474e2 = this.f18103a.f18158i;
                        c4185k0 = null;
                        z11 = true;
                    } else {
                        c4185k0 = this.f18112j;
                        if (c4185k0 != null) {
                            this.f18112j = null;
                        } else if (m18360g()) {
                            c4185k0 = this.f18103a.f18158i.m18384r();
                        }
                        z11 = false;
                    }
                }
                c4185k0 = null;
                z11 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C4286e.m17744h(m18426n);
        if (c4474e != null) {
            this.f18107e.mo17525i(this.f18106d, c4474e);
        }
        if (z11) {
            this.f18107e.mo17524h(this.f18106d, c4474e2);
        }
        if (c4474e2 != null) {
            return c4474e2;
        }
        if (c4185k0 != null || ((aVar = this.f18108f) != null && aVar.m18410b())) {
            z12 = false;
        } else {
            this.f18108f = this.f18109g.m18408d();
            z12 = true;
        }
        synchronized (this.f18105c) {
            if (this.f18103a.m18422i()) {
                throw new IOException("Canceled");
            }
            if (z12) {
                list = this.f18108f.m18409a();
                if (this.f18105c.m18395h(this.f18104b, this.f18103a, list, false)) {
                    c4474e2 = this.f18103a.f18158i;
                    z11 = true;
                }
            } else {
                list = null;
            }
            if (!z11) {
                if (c4185k0 == null) {
                    c4185k0 = this.f18108f.m18411c();
                }
                c4474e2 = new C4474e(this.f18105c, c4185k0);
                this.f18110h = c4474e2;
            }
        }
        if (z11) {
            this.f18107e.mo17524h(this.f18106d, c4474e2);
            return c4474e2;
        }
        c4474e2.m18377e(i10, i11, i12, i13, z10, this.f18106d, this.f18107e);
        this.f18105c.f18135e.m18396a(c4474e2.m18384r());
        synchronized (this.f18105c) {
            this.f18110h = null;
            if (this.f18105c.m18395h(this.f18104b, this.f18103a, list, true)) {
                c4474e2.f18122k = true;
                socket = c4474e2.m18385t();
                c4474e2 = this.f18103a.f18158i;
                this.f18112j = c4185k0;
            } else {
                this.f18105c.m18394g(c4474e2);
                this.f18103a.m18415a(c4474e2);
            }
        }
        C4286e.m17744h(socket);
        this.f18107e.mo17524h(this.f18106d, c4474e2);
        return c4474e2;
    }

    /* renamed from: d */
    private C4474e m18359d(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            C4474e m18358c = m18358c(i10, i11, i12, i13, z10);
            synchronized (this.f18105c) {
                if (m18358c.f18124m == 0 && !m18358c.m18381o()) {
                    return m18358c;
                }
                if (m18358c.m18380n(z11)) {
                    return m18358c;
                }
                m18358c.m18383q();
            }
        }
    }

    /* renamed from: g */
    private boolean m18360g() {
        C4474e c4474e = this.f18103a.f18158i;
        return c4474e != null && c4474e.f18123l == 0 && C4286e.m17728E(c4474e.m18384r().m17471a().m17269l(), this.f18104b.m17269l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4474e m18361a() {
        return this.f18110h;
    }

    /* renamed from: b */
    public InterfaceC4554c m18362b(C4171d0 c4171d0, InterfaceC4165a0.a aVar, boolean z10) {
        try {
            return m18359d(aVar.mo17273c(), aVar.mo17274d(), aVar.mo17276f(), c4171d0.m17318y(), c4171d0.m17296F(), z10).m18382p(c4171d0, aVar);
        } catch (IOException e10) {
            m18365h();
            throw new C4478i(e10);
        } catch (C4478i e11) {
            m18365h();
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m18363e() {
        synchronized (this.f18105c) {
            boolean z10 = true;
            if (this.f18112j != null) {
                return true;
            }
            if (m18360g()) {
                this.f18112j = this.f18103a.f18158i.m18384r();
                return true;
            }
            C4479j.a aVar = this.f18108f;
            if ((aVar == null || !aVar.m18410b()) && !this.f18109g.m18407b()) {
                z10 = false;
            }
            return z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m18364f() {
        boolean z10;
        synchronized (this.f18105c) {
            z10 = this.f18111i;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m18365h() {
        synchronized (this.f18105c) {
            this.f18111i = true;
        }
    }
}
