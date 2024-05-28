package p134k0;

import java.util.ArrayList;
import p134k0.C3708d;
import p134k0.C3713i;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public class C3706b implements C3708d.a {

    /* renamed from: e */
    public a f15488e;

    /* renamed from: a */
    C3713i f15484a = null;

    /* renamed from: b */
    float f15485b = 0.0f;

    /* renamed from: c */
    boolean f15486c = false;

    /* renamed from: d */
    ArrayList<C3713i> f15487d = new ArrayList<>();

    /* renamed from: f */
    boolean f15489f = false;

    /* renamed from: k0.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        float mo15709a(int i10);

        /* renamed from: b */
        void mo15710b(C3713i c3713i, float f10, boolean z10);

        /* renamed from: c */
        float mo15711c(C3713i c3713i, boolean z10);

        void clear();

        /* renamed from: d */
        float mo15712d(C3706b c3706b, boolean z10);

        /* renamed from: e */
        boolean mo15713e(C3713i c3713i);

        /* renamed from: f */
        int mo15714f();

        /* renamed from: g */
        float mo15715g(C3713i c3713i);

        /* renamed from: h */
        C3713i mo15716h(int i10);

        /* renamed from: i */
        void mo15717i(float f10);

        /* renamed from: j */
        void mo15718j(C3713i c3713i, float f10);

        /* renamed from: k */
        void mo15719k();
    }

    public C3706b() {
    }

    /* renamed from: u */
    private boolean m15720u(C3713i c3713i, C3708d c3708d) {
        return c3713i.f15545m <= 1;
    }

    /* renamed from: w */
    private C3713i m15721w(boolean[] zArr, C3713i c3713i) {
        C3713i.a aVar;
        int mo15714f = this.f15488e.mo15714f();
        C3713i c3713i2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < mo15714f; i10++) {
            float mo15709a = this.f15488e.mo15709a(i10);
            if (mo15709a < 0.0f) {
                C3713i mo15716h = this.f15488e.mo15716h(i10);
                if ((zArr == null || !zArr[mo15716h.f15535c]) && mo15716h != c3713i && (((aVar = mo15716h.f15542j) == C3713i.a.SLACK || aVar == C3713i.a.ERROR) && mo15709a < f10)) {
                    f10 = mo15709a;
                    c3713i2 = mo15716h;
                }
            }
        }
        return c3713i2;
    }

    /* renamed from: A */
    public void m15722A(C3708d c3708d, C3713i c3713i, boolean z10) {
        if (c3713i.f15539g) {
            this.f15485b += c3713i.f15538f * this.f15488e.mo15715g(c3713i);
            this.f15488e.mo15711c(c3713i, z10);
            if (z10) {
                c3713i.m15794c(this);
            }
            if (C3708d.f15496t && this.f15488e.mo15714f() == 0) {
                this.f15489f = true;
                c3708d.f15502a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo15723B(C3708d c3708d, C3706b c3706b, boolean z10) {
        this.f15485b += c3706b.f15485b * this.f15488e.mo15712d(c3706b, z10);
        if (z10) {
            c3706b.f15484a.m15794c(this);
        }
        if (C3708d.f15496t && this.f15484a != null && this.f15488e.mo15714f() == 0) {
            this.f15489f = true;
            c3708d.f15502a = true;
        }
    }

    /* renamed from: C */
    public void m15724C(C3708d c3708d, C3713i c3713i, boolean z10) {
        if (c3713i.f15546n) {
            float mo15715g = this.f15488e.mo15715g(c3713i);
            this.f15485b += c3713i.f15548p * mo15715g;
            this.f15488e.mo15711c(c3713i, z10);
            if (z10) {
                c3713i.m15794c(this);
            }
            this.f15488e.mo15710b(c3708d.f15515n.f15493d[c3713i.f15547o], mo15715g, z10);
            if (C3708d.f15496t && this.f15488e.mo15714f() == 0) {
                this.f15489f = true;
                c3708d.f15502a = true;
            }
        }
    }

    /* renamed from: D */
    public void m15725D(C3708d c3708d) {
        if (c3708d.f15508g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int mo15714f = this.f15488e.mo15714f();
            for (int i10 = 0; i10 < mo15714f; i10++) {
                C3713i mo15716h = this.f15488e.mo15716h(i10);
                if (mo15716h.f15536d != -1 || mo15716h.f15539g || mo15716h.f15546n) {
                    this.f15487d.add(mo15716h);
                }
            }
            int size = this.f15487d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C3713i c3713i = this.f15487d.get(i11);
                    if (c3713i.f15539g) {
                        m15722A(c3708d, c3713i, true);
                    } else if (c3713i.f15546n) {
                        m15724C(c3708d, c3713i, true);
                    } else {
                        mo15723B(c3708d, c3708d.f15508g[c3713i.f15536d], true);
                    }
                }
                this.f15487d.clear();
            } else {
                z10 = true;
            }
        }
        if (C3708d.f15496t && this.f15484a != null && this.f15488e.mo15714f() == 0) {
            this.f15489f = true;
            c3708d.f15502a = true;
        }
    }

    @Override // p134k0.C3708d.a
    /* renamed from: a */
    public C3713i mo15726a(C3708d c3708d, boolean[] zArr) {
        return m15721w(zArr, null);
    }

    @Override // p134k0.C3708d.a
    /* renamed from: b */
    public void mo15727b(C3708d.a aVar) {
        if (aVar instanceof C3706b) {
            C3706b c3706b = (C3706b) aVar;
            this.f15484a = null;
            this.f15488e.clear();
            for (int i10 = 0; i10 < c3706b.f15488e.mo15714f(); i10++) {
                this.f15488e.mo15710b(c3706b.f15488e.mo15716h(i10), c3706b.f15488e.mo15709a(i10), true);
            }
        }
    }

    @Override // p134k0.C3708d.a
    /* renamed from: c */
    public void mo15728c(C3713i c3713i) {
        int i10 = c3713i.f15537e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f15488e.mo15718j(c3713i, f10);
    }

    @Override // p134k0.C3708d.a
    public void clear() {
        this.f15488e.clear();
        this.f15484a = null;
        this.f15485b = 0.0f;
    }

    /* renamed from: d */
    public C3706b m15729d(C3708d c3708d, int i10) {
        this.f15488e.mo15718j(c3708d.m15772o(i10, "ep"), 1.0f);
        this.f15488e.mo15718j(c3708d.m15772o(i10, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C3706b m15730e(C3713i c3713i, int i10) {
        this.f15488e.mo15718j(c3713i, i10);
        return this;
    }

    /* renamed from: f */
    public boolean m15731f(C3708d c3708d) {
        boolean z10;
        C3713i m15732g = m15732g(c3708d);
        if (m15732g == null) {
            z10 = true;
        } else {
            m15747x(m15732g);
            z10 = false;
        }
        if (this.f15488e.mo15714f() == 0) {
            this.f15489f = true;
        }
        return z10;
    }

    /* renamed from: g */
    C3713i m15732g(C3708d c3708d) {
        boolean m15720u;
        boolean m15720u2;
        int mo15714f = this.f15488e.mo15714f();
        C3713i c3713i = null;
        C3713i c3713i2 = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < mo15714f; i10++) {
            float mo15709a = this.f15488e.mo15709a(i10);
            C3713i mo15716h = this.f15488e.mo15716h(i10);
            if (mo15716h.f15542j == C3713i.a.UNRESTRICTED) {
                if (c3713i == null) {
                    m15720u2 = m15720u(mo15716h, c3708d);
                } else if (f10 > mo15709a) {
                    m15720u2 = m15720u(mo15716h, c3708d);
                } else if (!z10 && m15720u(mo15716h, c3708d)) {
                    f10 = mo15709a;
                    c3713i = mo15716h;
                    z10 = true;
                }
                z10 = m15720u2;
                f10 = mo15709a;
                c3713i = mo15716h;
            } else if (c3713i == null && mo15709a < 0.0f) {
                if (c3713i2 == null) {
                    m15720u = m15720u(mo15716h, c3708d);
                } else if (f11 > mo15709a) {
                    m15720u = m15720u(mo15716h, c3708d);
                } else if (!z11 && m15720u(mo15716h, c3708d)) {
                    f11 = mo15709a;
                    c3713i2 = mo15716h;
                    z11 = true;
                }
                z11 = m15720u;
                f11 = mo15709a;
                c3713i2 = mo15716h;
            }
        }
        return c3713i != null ? c3713i : c3713i2;
    }

    @Override // p134k0.C3708d.a
    public C3713i getKey() {
        return this.f15484a;
    }

    /* renamed from: h */
    public C3706b m15733h(C3713i c3713i, C3713i c3713i2, int i10, float f10, C3713i c3713i3, C3713i c3713i4, int i11) {
        if (c3713i2 == c3713i3) {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i4, 1.0f);
            this.f15488e.mo15718j(c3713i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15488e.mo15718j(c3713i3, -1.0f);
            this.f15488e.mo15718j(c3713i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f15485b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f15488e.mo15718j(c3713i, -1.0f);
            this.f15488e.mo15718j(c3713i2, 1.0f);
            this.f15485b = i10;
        } else if (f10 >= 1.0f) {
            this.f15488e.mo15718j(c3713i4, -1.0f);
            this.f15488e.mo15718j(c3713i3, 1.0f);
            this.f15485b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f15488e.mo15718j(c3713i, f11 * 1.0f);
            this.f15488e.mo15718j(c3713i2, f11 * (-1.0f));
            this.f15488e.mo15718j(c3713i3, (-1.0f) * f10);
            this.f15488e.mo15718j(c3713i4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f15485b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C3706b m15734i(C3713i c3713i, int i10) {
        this.f15484a = c3713i;
        float f10 = i10;
        c3713i.f15538f = f10;
        this.f15485b = f10;
        this.f15489f = true;
        return this;
    }

    @Override // p134k0.C3708d.a
    public boolean isEmpty() {
        return this.f15484a == null && this.f15485b == 0.0f && this.f15488e.mo15714f() == 0;
    }

    /* renamed from: j */
    public C3706b m15735j(C3713i c3713i, C3713i c3713i2, float f10) {
        this.f15488e.mo15718j(c3713i, -1.0f);
        this.f15488e.mo15718j(c3713i2, f10);
        return this;
    }

    /* renamed from: k */
    public C3706b m15736k(C3713i c3713i, C3713i c3713i2, C3713i c3713i3, C3713i c3713i4, float f10) {
        this.f15488e.mo15718j(c3713i, -1.0f);
        this.f15488e.mo15718j(c3713i2, 1.0f);
        this.f15488e.mo15718j(c3713i3, f10);
        this.f15488e.mo15718j(c3713i4, -f10);
        return this;
    }

    /* renamed from: l */
    public C3706b m15737l(float f10, float f11, float f12, C3713i c3713i, C3713i c3713i2, C3713i c3713i3, C3713i c3713i4) {
        this.f15485b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15488e.mo15718j(c3713i4, 1.0f);
            this.f15488e.mo15718j(c3713i3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f15488e.mo15718j(c3713i3, 1.0f);
            this.f15488e.mo15718j(c3713i4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15488e.mo15718j(c3713i4, f13);
            this.f15488e.mo15718j(c3713i3, -f13);
        }
        return this;
    }

    /* renamed from: m */
    public C3706b m15738m(C3713i c3713i, int i10) {
        if (i10 < 0) {
            this.f15485b = i10 * (-1);
            this.f15488e.mo15718j(c3713i, 1.0f);
        } else {
            this.f15485b = i10;
            this.f15488e.mo15718j(c3713i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C3706b m15739n(C3713i c3713i, C3713i c3713i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f15485b = i10;
        }
        if (!z10) {
            this.f15488e.mo15718j(c3713i, -1.0f);
            this.f15488e.mo15718j(c3713i2, 1.0f);
        } else {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C3706b m15740o(C3713i c3713i, C3713i c3713i2, C3713i c3713i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f15485b = i10;
        }
        if (!z10) {
            this.f15488e.mo15718j(c3713i, -1.0f);
            this.f15488e.mo15718j(c3713i2, 1.0f);
            this.f15488e.mo15718j(c3713i3, 1.0f);
        } else {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15488e.mo15718j(c3713i3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C3706b m15741p(C3713i c3713i, C3713i c3713i2, C3713i c3713i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f15485b = i10;
        }
        if (!z10) {
            this.f15488e.mo15718j(c3713i, -1.0f);
            this.f15488e.mo15718j(c3713i2, 1.0f);
            this.f15488e.mo15718j(c3713i3, -1.0f);
        } else {
            this.f15488e.mo15718j(c3713i, 1.0f);
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15488e.mo15718j(c3713i3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C3706b m15742q(C3713i c3713i, C3713i c3713i2, C3713i c3713i3, C3713i c3713i4, float f10) {
        this.f15488e.mo15718j(c3713i3, 0.5f);
        this.f15488e.mo15718j(c3713i4, 0.5f);
        this.f15488e.mo15718j(c3713i, -0.5f);
        this.f15488e.mo15718j(c3713i2, -0.5f);
        this.f15485b = -f10;
        return this;
    }

    /* renamed from: r */
    public void m15743r() {
        float f10 = this.f15485b;
        if (f10 < 0.0f) {
            this.f15485b = f10 * (-1.0f);
            this.f15488e.mo15719k();
        }
    }

    /* renamed from: s */
    public boolean m15744s() {
        C3713i c3713i = this.f15484a;
        return c3713i != null && (c3713i.f15542j == C3713i.a.UNRESTRICTED || this.f15485b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m15745t(C3713i c3713i) {
        return this.f15488e.mo15713e(c3713i);
    }

    public String toString() {
        return m15749z();
    }

    /* renamed from: v */
    public C3713i m15746v(C3713i c3713i) {
        return m15721w(null, c3713i);
    }

    /* renamed from: x */
    public void m15747x(C3713i c3713i) {
        C3713i c3713i2 = this.f15484a;
        if (c3713i2 != null) {
            this.f15488e.mo15718j(c3713i2, -1.0f);
            this.f15484a.f15536d = -1;
            this.f15484a = null;
        }
        float mo15711c = this.f15488e.mo15711c(c3713i, true) * (-1.0f);
        this.f15484a = c3713i;
        if (mo15711c == 1.0f) {
            return;
        }
        this.f15485b /= mo15711c;
        this.f15488e.mo15717i(mo15711c);
    }

    /* renamed from: y */
    public void m15748y() {
        this.f15484a = null;
        this.f15488e.clear();
        this.f15485b = 0.0f;
        this.f15489f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m15749z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p134k0.C3706b.m15749z():java.lang.String");
    }

    public C3706b(C3707c c3707c) {
        this.f15488e = new C3705a(this, c3707c);
    }
}
