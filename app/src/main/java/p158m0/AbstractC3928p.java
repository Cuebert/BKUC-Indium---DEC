package p158m0;

import p147l0.C3859d;
import p147l0.C3860e;

/* renamed from: m0.p */
/* loaded from: classes.dex */
public abstract class AbstractC3928p implements InterfaceC3916d {

    /* renamed from: a */
    public int f16298a;

    /* renamed from: b */
    C3860e f16299b;

    /* renamed from: c */
    C3925m f16300c;

    /* renamed from: d */
    protected C3860e.b f16301d;

    /* renamed from: e */
    C3919g f16302e = new C3919g(this);

    /* renamed from: f */
    public int f16303f = 0;

    /* renamed from: g */
    boolean f16304g = false;

    /* renamed from: h */
    public C3918f f16305h = new C3918f(this);

    /* renamed from: i */
    public C3918f f16306i = new C3918f(this);

    /* renamed from: j */
    protected b f16307j = b.NONE;

    /* renamed from: m0.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16308a;

        static {
            int[] iArr = new int[C3859d.b.values().length];
            f16308a = iArr;
            try {
                iArr[C3859d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16308a[C3859d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16308a[C3859d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16308a[C3859d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16308a[C3859d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0.p$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC3928p(C3860e c3860e) {
        this.f16299b = c3860e;
    }

    /* renamed from: l */
    private void m16656l(int i10, int i11) {
        int i12;
        int i13 = this.f16298a;
        if (i13 == 0) {
            this.f16302e.mo16623d(m16659g(i11, i10));
            return;
        }
        if (i13 == 1) {
            this.f16302e.mo16623d(Math.min(m16659g(this.f16302e.f16268m, i10), i11));
            return;
        }
        if (i13 == 2) {
            C3860e m16339I = this.f16299b.m16339I();
            if (m16339I != null) {
                if ((i10 == 0 ? m16339I.f16000e : m16339I.f16002f).f16302e.f16256j) {
                    C3860e c3860e = this.f16299b;
                    this.f16302e.mo16623d(m16659g((int) ((r9.f16253g * (i10 == 0 ? c3860e.f16032u : c3860e.f16038x)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i13 != 3) {
            return;
        }
        C3860e c3860e2 = this.f16299b;
        AbstractC3928p abstractC3928p = c3860e2.f16000e;
        C3860e.b bVar = abstractC3928p.f16301d;
        C3860e.b bVar2 = C3860e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC3928p.f16298a == 3) {
            C3926n c3926n = c3860e2.f16002f;
            if (c3926n.f16301d == bVar2 && c3926n.f16298a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            abstractC3928p = c3860e2.f16002f;
        }
        if (abstractC3928p.f16302e.f16256j) {
            float m16403t = c3860e2.m16403t();
            if (i10 == 1) {
                i12 = (int) ((abstractC3928p.f16302e.f16253g / m16403t) + 0.5f);
            } else {
                i12 = (int) ((m16403t * abstractC3928p.f16302e.f16253g) + 0.5f);
            }
            this.f16302e.mo16623d(i12);
        }
    }

    @Override // p158m0.InterfaceC3916d
    /* renamed from: a */
    public void mo16601a(InterfaceC3916d interfaceC3916d) {
    }

    /* renamed from: b */
    public final void m16657b(C3918f c3918f, C3918f c3918f2, int i10) {
        c3918f.f16258l.add(c3918f2);
        c3918f.f16252f = i10;
        c3918f2.f16257k.add(c3918f);
    }

    /* renamed from: c */
    public final void m16658c(C3918f c3918f, C3918f c3918f2, int i10, C3919g c3919g) {
        c3918f.f16258l.add(c3918f2);
        c3918f.f16258l.add(this.f16302e);
        c3918f.f16254h = i10;
        c3918f.f16255i = c3919g;
        c3918f2.f16257k.add(c3918f);
        c3919g.f16257k.add(c3918f);
    }

    /* renamed from: d */
    public abstract void mo16602d();

    /* renamed from: e */
    public abstract void mo16603e();

    /* renamed from: f */
    public abstract void mo16604f();

    /* renamed from: g */
    public final int m16659g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            C3860e c3860e = this.f16299b;
            int i12 = c3860e.f16030t;
            max = Math.max(c3860e.f16028s, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            C3860e c3860e2 = this.f16299b;
            int i13 = c3860e2.f16036w;
            max = Math.max(c3860e2.f16034v, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final C3918f m16660h(C3859d c3859d) {
        C3859d c3859d2 = c3859d.f15948f;
        if (c3859d2 == null) {
            return null;
        }
        C3860e c3860e = c3859d2.f15946d;
        int i10 = a.f16308a[c3859d2.f15947e.ordinal()];
        if (i10 == 1) {
            return c3860e.f16000e.f16305h;
        }
        if (i10 == 2) {
            return c3860e.f16000e.f16306i;
        }
        if (i10 == 3) {
            return c3860e.f16002f.f16305h;
        }
        if (i10 == 4) {
            return c3860e.f16002f.f16280k;
        }
        if (i10 != 5) {
            return null;
        }
        return c3860e.f16002f.f16306i;
    }

    /* renamed from: i */
    public final C3918f m16661i(C3859d c3859d, int i10) {
        C3859d c3859d2 = c3859d.f15948f;
        if (c3859d2 == null) {
            return null;
        }
        C3860e c3860e = c3859d2.f15946d;
        AbstractC3928p abstractC3928p = i10 == 0 ? c3860e.f16000e : c3860e.f16002f;
        int i11 = a.f16308a[c3859d2.f15947e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return abstractC3928p.f16306i;
        }
        return abstractC3928p.f16305h;
    }

    /* renamed from: j */
    public long mo16605j() {
        if (this.f16302e.f16256j) {
            return r0.f16253g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m16662k() {
        return this.f16304g;
    }

    /* renamed from: m */
    public abstract boolean mo16606m();

    /* renamed from: n */
    public void m16663n(InterfaceC3916d interfaceC3916d, C3859d c3859d, C3859d c3859d2, int i10) {
        C3918f m16660h = m16660h(c3859d);
        C3918f m16660h2 = m16660h(c3859d2);
        if (m16660h.f16256j && m16660h2.f16256j) {
            int m16305e = m16660h.f16253g + c3859d.m16305e();
            int m16305e2 = m16660h2.f16253g - c3859d2.m16305e();
            int i11 = m16305e2 - m16305e;
            if (!this.f16302e.f16256j && this.f16301d == C3860e.b.MATCH_CONSTRAINT) {
                m16656l(i10, i11);
            }
            C3919g c3919g = this.f16302e;
            if (c3919g.f16256j) {
                if (c3919g.f16253g == i11) {
                    this.f16305h.mo16623d(m16305e);
                    this.f16306i.mo16623d(m16305e2);
                    return;
                }
                C3860e c3860e = this.f16299b;
                float m16409w = i10 == 0 ? c3860e.m16409w() : c3860e.m16347M();
                if (m16660h == m16660h2) {
                    m16305e = m16660h.f16253g;
                    m16305e2 = m16660h2.f16253g;
                    m16409w = 0.5f;
                }
                this.f16305h.mo16623d((int) (m16305e + 0.5f + (((m16305e2 - m16305e) - this.f16302e.f16253g) * m16409w)));
                this.f16306i.mo16623d(this.f16305h.f16253g + this.f16302e.f16253g);
            }
        }
    }

    /* renamed from: o */
    public void m16664o(InterfaceC3916d interfaceC3916d) {
    }

    /* renamed from: p */
    public void m16665p(InterfaceC3916d interfaceC3916d) {
    }
}
