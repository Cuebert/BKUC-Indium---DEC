package p158m0;

import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.InterfaceC3863h;
import p158m0.AbstractC3928p;
import p158m0.C3918f;

/* renamed from: m0.n */
/* loaded from: classes.dex */
public class C3926n extends AbstractC3928p {

    /* renamed from: k */
    public C3918f f16280k;

    /* renamed from: l */
    C3919g f16281l;

    /* renamed from: m0.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16282a;

        static {
            int[] iArr = new int[AbstractC3928p.b.values().length];
            f16282a = iArr;
            try {
                iArr[AbstractC3928p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16282a[AbstractC3928p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16282a[AbstractC3928p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3926n(C3860e c3860e) {
        super(c3860e);
        C3918f c3918f = new C3918f(this);
        this.f16280k = c3918f;
        this.f16281l = null;
        this.f16305h.f16251e = C3918f.a.TOP;
        this.f16306i.f16251e = C3918f.a.BOTTOM;
        c3918f.f16251e = C3918f.a.BASELINE;
        this.f16303f = 1;
    }

    @Override // p158m0.AbstractC3928p, p158m0.InterfaceC3916d
    /* renamed from: a */
    public void mo16601a(InterfaceC3916d interfaceC3916d) {
        float f10;
        float m16403t;
        float f11;
        int i10;
        int i11 = a.f16282a[this.f16307j.ordinal()];
        if (i11 == 1) {
            m16665p(interfaceC3916d);
        } else if (i11 == 2) {
            m16664o(interfaceC3916d);
        } else if (i11 == 3) {
            C3860e c3860e = this.f16299b;
            m16663n(interfaceC3916d, c3860e.f15974I, c3860e.f15976K, 1);
            return;
        }
        C3919g c3919g = this.f16302e;
        if (c3919g.f16249c && !c3919g.f16256j && this.f16301d == C3860e.b.MATCH_CONSTRAINT) {
            C3860e c3860e2 = this.f16299b;
            int i12 = c3860e2.f16024q;
            if (i12 != 2) {
                if (i12 == 3 && c3860e2.f16000e.f16302e.f16256j) {
                    int m16405u = c3860e2.m16405u();
                    if (m16405u == -1) {
                        C3860e c3860e3 = this.f16299b;
                        f10 = c3860e3.f16000e.f16302e.f16253g;
                        m16403t = c3860e3.m16403t();
                    } else if (m16405u == 0) {
                        f11 = r7.f16000e.f16302e.f16253g * this.f16299b.m16403t();
                        i10 = (int) (f11 + 0.5f);
                        this.f16302e.mo16623d(i10);
                    } else if (m16405u == 1) {
                        C3860e c3860e4 = this.f16299b;
                        f10 = c3860e4.f16000e.f16302e.f16253g;
                        m16403t = c3860e4.m16403t();
                    } else {
                        i10 = 0;
                        this.f16302e.mo16623d(i10);
                    }
                    f11 = f10 / m16403t;
                    i10 = (int) (f11 + 0.5f);
                    this.f16302e.mo16623d(i10);
                }
            } else {
                C3860e m16339I = c3860e2.m16339I();
                if (m16339I != null) {
                    if (m16339I.f16002f.f16302e.f16256j) {
                        this.f16302e.mo16623d((int) ((r7.f16253g * this.f16299b.f16038x) + 0.5f));
                    }
                }
            }
        }
        C3918f c3918f = this.f16305h;
        if (c3918f.f16249c) {
            C3918f c3918f2 = this.f16306i;
            if (c3918f2.f16249c) {
                if (c3918f.f16256j && c3918f2.f16256j && this.f16302e.f16256j) {
                    return;
                }
                if (!this.f16302e.f16256j && this.f16301d == C3860e.b.MATCH_CONSTRAINT) {
                    C3860e c3860e5 = this.f16299b;
                    if (c3860e5.f16022p == 0 && !c3860e5.m16375b0()) {
                        C3918f c3918f3 = this.f16305h.f16258l.get(0);
                        C3918f c3918f4 = this.f16306i.f16258l.get(0);
                        int i13 = c3918f3.f16253g;
                        C3918f c3918f5 = this.f16305h;
                        int i14 = i13 + c3918f5.f16252f;
                        int i15 = c3918f4.f16253g + this.f16306i.f16252f;
                        c3918f5.mo16623d(i14);
                        this.f16306i.mo16623d(i15);
                        this.f16302e.mo16623d(i15 - i14);
                        return;
                    }
                }
                if (!this.f16302e.f16256j && this.f16301d == C3860e.b.MATCH_CONSTRAINT && this.f16298a == 1 && this.f16305h.f16258l.size() > 0 && this.f16306i.f16258l.size() > 0) {
                    C3918f c3918f6 = this.f16305h.f16258l.get(0);
                    int i16 = (this.f16306i.f16258l.get(0).f16253g + this.f16306i.f16252f) - (c3918f6.f16253g + this.f16305h.f16252f);
                    C3919g c3919g2 = this.f16302e;
                    int i17 = c3919g2.f16268m;
                    if (i16 < i17) {
                        c3919g2.mo16623d(i16);
                    } else {
                        c3919g2.mo16623d(i17);
                    }
                }
                if (this.f16302e.f16256j && this.f16305h.f16258l.size() > 0 && this.f16306i.f16258l.size() > 0) {
                    C3918f c3918f7 = this.f16305h.f16258l.get(0);
                    C3918f c3918f8 = this.f16306i.f16258l.get(0);
                    int i18 = c3918f7.f16253g + this.f16305h.f16252f;
                    int i19 = c3918f8.f16253g + this.f16306i.f16252f;
                    float m16347M = this.f16299b.m16347M();
                    if (c3918f7 == c3918f8) {
                        i18 = c3918f7.f16253g;
                        i19 = c3918f8.f16253g;
                        m16347M = 0.5f;
                    }
                    this.f16305h.mo16623d((int) (i18 + 0.5f + (((i19 - i18) - this.f16302e.f16253g) * m16347M)));
                    this.f16306i.mo16623d(this.f16305h.f16253g + this.f16302e.f16253g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: d */
    public void mo16602d() {
        C3860e m16339I;
        C3860e m16339I2;
        C3860e c3860e = this.f16299b;
        if (c3860e.f15992a) {
            this.f16302e.mo16623d(c3860e.m16407v());
        }
        if (!this.f16302e.f16256j) {
            this.f16301d = this.f16299b.m16351O();
            if (this.f16299b.m16363U()) {
                this.f16281l = new C3913a(this);
            }
            C3860e.b bVar = this.f16301d;
            if (bVar != C3860e.b.MATCH_CONSTRAINT) {
                if (bVar == C3860e.b.MATCH_PARENT && (m16339I2 = this.f16299b.m16339I()) != null && m16339I2.m16351O() == C3860e.b.FIXED) {
                    int m16407v = (m16339I2.m16407v() - this.f16299b.f15974I.m16305e()) - this.f16299b.f15976K.m16305e();
                    m16657b(this.f16305h, m16339I2.f16002f.f16305h, this.f16299b.f15974I.m16305e());
                    m16657b(this.f16306i, m16339I2.f16002f.f16306i, -this.f16299b.f15976K.m16305e());
                    this.f16302e.mo16623d(m16407v);
                    return;
                }
                if (this.f16301d == C3860e.b.FIXED) {
                    this.f16302e.mo16623d(this.f16299b.m16407v());
                }
            }
        } else if (this.f16301d == C3860e.b.MATCH_PARENT && (m16339I = this.f16299b.m16339I()) != null && m16339I.m16351O() == C3860e.b.FIXED) {
            m16657b(this.f16305h, m16339I.f16002f.f16305h, this.f16299b.f15974I.m16305e());
            m16657b(this.f16306i, m16339I.f16002f.f16306i, -this.f16299b.f15976K.m16305e());
            return;
        }
        C3919g c3919g = this.f16302e;
        boolean z10 = c3919g.f16256j;
        if (z10) {
            C3860e c3860e2 = this.f16299b;
            if (c3860e2.f15992a) {
                C3859d[] c3859dArr = c3860e2.f15981P;
                if (c3859dArr[2].f15948f != null && c3859dArr[3].f15948f != null) {
                    if (c3860e2.m16375b0()) {
                        this.f16305h.f16252f = this.f16299b.f15981P[2].m16305e();
                        this.f16306i.f16252f = -this.f16299b.f15981P[3].m16305e();
                    } else {
                        C3918f m16660h = m16660h(this.f16299b.f15981P[2]);
                        if (m16660h != null) {
                            m16657b(this.f16305h, m16660h, this.f16299b.f15981P[2].m16305e());
                        }
                        C3918f m16660h2 = m16660h(this.f16299b.f15981P[3]);
                        if (m16660h2 != null) {
                            m16657b(this.f16306i, m16660h2, -this.f16299b.f15981P[3].m16305e());
                        }
                        this.f16305h.f16248b = true;
                        this.f16306i.f16248b = true;
                    }
                    if (this.f16299b.m16363U()) {
                        m16657b(this.f16280k, this.f16305h, this.f16299b.m16391n());
                        return;
                    }
                    return;
                }
                if (c3859dArr[2].f15948f != null) {
                    C3918f m16660h3 = m16660h(c3859dArr[2]);
                    if (m16660h3 != null) {
                        m16657b(this.f16305h, m16660h3, this.f16299b.f15981P[2].m16305e());
                        m16657b(this.f16306i, this.f16305h, this.f16302e.f16253g);
                        if (this.f16299b.m16363U()) {
                            m16657b(this.f16280k, this.f16305h, this.f16299b.m16391n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c3859dArr[3].f15948f != null) {
                    C3918f m16660h4 = m16660h(c3859dArr[3]);
                    if (m16660h4 != null) {
                        m16657b(this.f16306i, m16660h4, -this.f16299b.f15981P[3].m16305e());
                        m16657b(this.f16305h, this.f16306i, -this.f16302e.f16253g);
                    }
                    if (this.f16299b.m16363U()) {
                        m16657b(this.f16280k, this.f16305h, this.f16299b.m16391n());
                        return;
                    }
                    return;
                }
                if (c3859dArr[4].f15948f != null) {
                    C3918f m16660h5 = m16660h(c3859dArr[4]);
                    if (m16660h5 != null) {
                        m16657b(this.f16280k, m16660h5, 0);
                        m16657b(this.f16305h, this.f16280k, -this.f16299b.m16391n());
                        m16657b(this.f16306i, this.f16305h, this.f16302e.f16253g);
                        return;
                    }
                    return;
                }
                if ((c3860e2 instanceof InterfaceC3863h) || c3860e2.m16339I() == null || this.f16299b.mo16389m(C3859d.b.CENTER).f15948f != null) {
                    return;
                }
                m16657b(this.f16305h, this.f16299b.m16339I().f16002f.f16305h, this.f16299b.m16361T());
                m16657b(this.f16306i, this.f16305h, this.f16302e.f16253g);
                if (this.f16299b.m16363U()) {
                    m16657b(this.f16280k, this.f16305h, this.f16299b.m16391n());
                    return;
                }
                return;
            }
        }
        if (!z10 && this.f16301d == C3860e.b.MATCH_CONSTRAINT) {
            C3860e c3860e3 = this.f16299b;
            int i10 = c3860e3.f16024q;
            if (i10 != 2) {
                if (i10 == 3 && !c3860e3.m16375b0()) {
                    C3860e c3860e4 = this.f16299b;
                    if (c3860e4.f16022p != 3) {
                        C3919g c3919g2 = c3860e4.f16000e.f16302e;
                        this.f16302e.f16258l.add(c3919g2);
                        c3919g2.f16257k.add(this.f16302e);
                        C3919g c3919g3 = this.f16302e;
                        c3919g3.f16248b = true;
                        c3919g3.f16257k.add(this.f16305h);
                        this.f16302e.f16257k.add(this.f16306i);
                    }
                }
            } else {
                C3860e m16339I3 = c3860e3.m16339I();
                if (m16339I3 != null) {
                    C3919g c3919g4 = m16339I3.f16002f.f16302e;
                    this.f16302e.f16258l.add(c3919g4);
                    c3919g4.f16257k.add(this.f16302e);
                    C3919g c3919g5 = this.f16302e;
                    c3919g5.f16248b = true;
                    c3919g5.f16257k.add(this.f16305h);
                    this.f16302e.f16257k.add(this.f16306i);
                }
            }
        } else {
            c3919g.m16621b(this);
        }
        C3860e c3860e5 = this.f16299b;
        C3859d[] c3859dArr2 = c3860e5.f15981P;
        if (c3859dArr2[2].f15948f != null && c3859dArr2[3].f15948f != null) {
            if (c3860e5.m16375b0()) {
                this.f16305h.f16252f = this.f16299b.f15981P[2].m16305e();
                this.f16306i.f16252f = -this.f16299b.f15981P[3].m16305e();
            } else {
                C3918f m16660h6 = m16660h(this.f16299b.f15981P[2]);
                C3918f m16660h7 = m16660h(this.f16299b.f15981P[3]);
                m16660h6.m16621b(this);
                m16660h7.m16621b(this);
                this.f16307j = AbstractC3928p.b.CENTER;
            }
            if (this.f16299b.m16363U()) {
                m16658c(this.f16280k, this.f16305h, 1, this.f16281l);
            }
        } else if (c3859dArr2[2].f15948f != null) {
            C3918f m16660h8 = m16660h(c3859dArr2[2]);
            if (m16660h8 != null) {
                m16657b(this.f16305h, m16660h8, this.f16299b.f15981P[2].m16305e());
                m16658c(this.f16306i, this.f16305h, 1, this.f16302e);
                if (this.f16299b.m16363U()) {
                    m16658c(this.f16280k, this.f16305h, 1, this.f16281l);
                }
                C3860e.b bVar2 = this.f16301d;
                C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f16299b.m16403t() > 0.0f) {
                    C3924l c3924l = this.f16299b.f16000e;
                    if (c3924l.f16301d == bVar3) {
                        c3924l.f16302e.f16257k.add(this.f16302e);
                        this.f16302e.f16258l.add(this.f16299b.f16000e.f16302e);
                        this.f16302e.f16247a = this;
                    }
                }
            }
        } else if (c3859dArr2[3].f15948f != null) {
            C3918f m16660h9 = m16660h(c3859dArr2[3]);
            if (m16660h9 != null) {
                m16657b(this.f16306i, m16660h9, -this.f16299b.f15981P[3].m16305e());
                m16658c(this.f16305h, this.f16306i, -1, this.f16302e);
                if (this.f16299b.m16363U()) {
                    m16658c(this.f16280k, this.f16305h, 1, this.f16281l);
                }
            }
        } else if (c3859dArr2[4].f15948f != null) {
            C3918f m16660h10 = m16660h(c3859dArr2[4]);
            if (m16660h10 != null) {
                m16657b(this.f16280k, m16660h10, 0);
                m16658c(this.f16305h, this.f16280k, -1, this.f16281l);
                m16658c(this.f16306i, this.f16305h, 1, this.f16302e);
            }
        } else if (!(c3860e5 instanceof InterfaceC3863h) && c3860e5.m16339I() != null) {
            m16657b(this.f16305h, this.f16299b.m16339I().f16002f.f16305h, this.f16299b.m16361T());
            m16658c(this.f16306i, this.f16305h, 1, this.f16302e);
            if (this.f16299b.m16363U()) {
                m16658c(this.f16280k, this.f16305h, 1, this.f16281l);
            }
            C3860e.b bVar4 = this.f16301d;
            C3860e.b bVar5 = C3860e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f16299b.m16403t() > 0.0f) {
                C3924l c3924l2 = this.f16299b.f16000e;
                if (c3924l2.f16301d == bVar5) {
                    c3924l2.f16302e.f16257k.add(this.f16302e);
                    this.f16302e.f16258l.add(this.f16299b.f16000e.f16302e);
                    this.f16302e.f16247a = this;
                }
            }
        }
        if (this.f16302e.f16258l.size() == 0) {
            this.f16302e.f16249c = true;
        }
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: e */
    public void mo16603e() {
        C3918f c3918f = this.f16305h;
        if (c3918f.f16256j) {
            this.f16299b.m16368W0(c3918f.f16253g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: f */
    public void mo16604f() {
        this.f16300c = null;
        this.f16305h.m16622c();
        this.f16306i.m16622c();
        this.f16280k.m16622c();
        this.f16302e.m16622c();
        this.f16304g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: m */
    public boolean mo16606m() {
        return this.f16301d != C3860e.b.MATCH_CONSTRAINT || this.f16299b.f16024q == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m16645q() {
        this.f16304g = false;
        this.f16305h.m16622c();
        this.f16305h.f16256j = false;
        this.f16306i.m16622c();
        this.f16306i.f16256j = false;
        this.f16280k.m16622c();
        this.f16280k.f16256j = false;
        this.f16302e.f16256j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f16299b.m16399r();
    }
}
