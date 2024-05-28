package p158m0;

import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.InterfaceC3863h;
import p158m0.AbstractC3928p;
import p158m0.C3918f;

/* renamed from: m0.l */
/* loaded from: classes.dex */
public class C3924l extends AbstractC3928p {

    /* renamed from: k */
    private static int[] f16270k = new int[2];

    /* renamed from: m0.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16271a;

        static {
            int[] iArr = new int[AbstractC3928p.b.values().length];
            f16271a = iArr;
            try {
                iArr[AbstractC3928p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16271a[AbstractC3928p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16271a[AbstractC3928p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3924l(C3860e c3860e) {
        super(c3860e);
        this.f16305h.f16251e = C3918f.a.LEFT;
        this.f16306i.f16251e = C3918f.a.RIGHT;
        this.f16303f = 0;
    }

    /* renamed from: q */
    private void m16639q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bc, code lost:
    
        if (r14 != 1) goto L324;
     */
    @Override // p158m0.AbstractC3928p, p158m0.InterfaceC3916d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16601a(p158m0.InterfaceC3916d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m0.C3924l.mo16601a(m0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: d */
    public void mo16602d() {
        C3860e m16339I;
        C3860e m16339I2;
        C3860e c3860e = this.f16299b;
        if (c3860e.f15992a) {
            this.f16302e.mo16623d(c3860e.m16357R());
        }
        if (!this.f16302e.f16256j) {
            C3860e.b m16413y = this.f16299b.m16413y();
            this.f16301d = m16413y;
            if (m16413y != C3860e.b.MATCH_CONSTRAINT) {
                C3860e.b bVar = C3860e.b.MATCH_PARENT;
                if (m16413y == bVar && (((m16339I2 = this.f16299b.m16339I()) != null && m16339I2.m16413y() == C3860e.b.FIXED) || m16339I2.m16413y() == bVar)) {
                    int m16357R = (m16339I2.m16357R() - this.f16299b.f15973H.m16305e()) - this.f16299b.f15975J.m16305e();
                    m16657b(this.f16305h, m16339I2.f16000e.f16305h, this.f16299b.f15973H.m16305e());
                    m16657b(this.f16306i, m16339I2.f16000e.f16306i, -this.f16299b.f15975J.m16305e());
                    this.f16302e.mo16623d(m16357R);
                    return;
                }
                if (this.f16301d == C3860e.b.FIXED) {
                    this.f16302e.mo16623d(this.f16299b.m16357R());
                }
            }
        } else {
            C3860e.b bVar2 = this.f16301d;
            C3860e.b bVar3 = C3860e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((m16339I = this.f16299b.m16339I()) != null && m16339I.m16413y() == C3860e.b.FIXED) || m16339I.m16413y() == bVar3)) {
                m16657b(this.f16305h, m16339I.f16000e.f16305h, this.f16299b.f15973H.m16305e());
                m16657b(this.f16306i, m16339I.f16000e.f16306i, -this.f16299b.f15975J.m16305e());
                return;
            }
        }
        C3919g c3919g = this.f16302e;
        if (c3919g.f16256j) {
            C3860e c3860e2 = this.f16299b;
            if (c3860e2.f15992a) {
                C3859d[] c3859dArr = c3860e2.f15981P;
                if (c3859dArr[0].f15948f != null && c3859dArr[1].f15948f != null) {
                    if (c3860e2.m16372Z()) {
                        this.f16305h.f16252f = this.f16299b.f15981P[0].m16305e();
                        this.f16306i.f16252f = -this.f16299b.f15981P[1].m16305e();
                        return;
                    }
                    C3918f m16660h = m16660h(this.f16299b.f15981P[0]);
                    if (m16660h != null) {
                        m16657b(this.f16305h, m16660h, this.f16299b.f15981P[0].m16305e());
                    }
                    C3918f m16660h2 = m16660h(this.f16299b.f15981P[1]);
                    if (m16660h2 != null) {
                        m16657b(this.f16306i, m16660h2, -this.f16299b.f15981P[1].m16305e());
                    }
                    this.f16305h.f16248b = true;
                    this.f16306i.f16248b = true;
                    return;
                }
                if (c3859dArr[0].f15948f != null) {
                    C3918f m16660h3 = m16660h(c3859dArr[0]);
                    if (m16660h3 != null) {
                        m16657b(this.f16305h, m16660h3, this.f16299b.f15981P[0].m16305e());
                        m16657b(this.f16306i, this.f16305h, this.f16302e.f16253g);
                        return;
                    }
                    return;
                }
                if (c3859dArr[1].f15948f != null) {
                    C3918f m16660h4 = m16660h(c3859dArr[1]);
                    if (m16660h4 != null) {
                        m16657b(this.f16306i, m16660h4, -this.f16299b.f15981P[1].m16305e());
                        m16657b(this.f16305h, this.f16306i, -this.f16302e.f16253g);
                        return;
                    }
                    return;
                }
                if ((c3860e2 instanceof InterfaceC3863h) || c3860e2.m16339I() == null || this.f16299b.mo16389m(C3859d.b.CENTER).f15948f != null) {
                    return;
                }
                m16657b(this.f16305h, this.f16299b.m16339I().f16000e.f16305h, this.f16299b.m16359S());
                m16657b(this.f16306i, this.f16305h, this.f16302e.f16253g);
                return;
            }
        }
        if (this.f16301d == C3860e.b.MATCH_CONSTRAINT) {
            C3860e c3860e3 = this.f16299b;
            int i10 = c3860e3.f16022p;
            if (i10 == 2) {
                C3860e m16339I3 = c3860e3.m16339I();
                if (m16339I3 != null) {
                    C3919g c3919g2 = m16339I3.f16002f.f16302e;
                    this.f16302e.f16258l.add(c3919g2);
                    c3919g2.f16257k.add(this.f16302e);
                    C3919g c3919g3 = this.f16302e;
                    c3919g3.f16248b = true;
                    c3919g3.f16257k.add(this.f16305h);
                    this.f16302e.f16257k.add(this.f16306i);
                }
            } else if (i10 == 3) {
                if (c3860e3.f16024q == 3) {
                    this.f16305h.f16247a = this;
                    this.f16306i.f16247a = this;
                    C3926n c3926n = c3860e3.f16002f;
                    c3926n.f16305h.f16247a = this;
                    c3926n.f16306i.f16247a = this;
                    c3919g.f16247a = this;
                    if (c3860e3.m16375b0()) {
                        this.f16302e.f16258l.add(this.f16299b.f16002f.f16302e);
                        this.f16299b.f16002f.f16302e.f16257k.add(this.f16302e);
                        C3926n c3926n2 = this.f16299b.f16002f;
                        c3926n2.f16302e.f16247a = this;
                        this.f16302e.f16258l.add(c3926n2.f16305h);
                        this.f16302e.f16258l.add(this.f16299b.f16002f.f16306i);
                        this.f16299b.f16002f.f16305h.f16257k.add(this.f16302e);
                        this.f16299b.f16002f.f16306i.f16257k.add(this.f16302e);
                    } else if (this.f16299b.m16372Z()) {
                        this.f16299b.f16002f.f16302e.f16258l.add(this.f16302e);
                        this.f16302e.f16257k.add(this.f16299b.f16002f.f16302e);
                    } else {
                        this.f16299b.f16002f.f16302e.f16258l.add(this.f16302e);
                    }
                } else {
                    C3919g c3919g4 = c3860e3.f16002f.f16302e;
                    c3919g.f16258l.add(c3919g4);
                    c3919g4.f16257k.add(this.f16302e);
                    this.f16299b.f16002f.f16305h.f16257k.add(this.f16302e);
                    this.f16299b.f16002f.f16306i.f16257k.add(this.f16302e);
                    C3919g c3919g5 = this.f16302e;
                    c3919g5.f16248b = true;
                    c3919g5.f16257k.add(this.f16305h);
                    this.f16302e.f16257k.add(this.f16306i);
                    this.f16305h.f16258l.add(this.f16302e);
                    this.f16306i.f16258l.add(this.f16302e);
                }
            }
        }
        C3860e c3860e4 = this.f16299b;
        C3859d[] c3859dArr2 = c3860e4.f15981P;
        if (c3859dArr2[0].f15948f != null && c3859dArr2[1].f15948f != null) {
            if (c3860e4.m16372Z()) {
                this.f16305h.f16252f = this.f16299b.f15981P[0].m16305e();
                this.f16306i.f16252f = -this.f16299b.f15981P[1].m16305e();
                return;
            }
            C3918f m16660h5 = m16660h(this.f16299b.f15981P[0]);
            C3918f m16660h6 = m16660h(this.f16299b.f15981P[1]);
            m16660h5.m16621b(this);
            m16660h6.m16621b(this);
            this.f16307j = AbstractC3928p.b.CENTER;
            return;
        }
        if (c3859dArr2[0].f15948f != null) {
            C3918f m16660h7 = m16660h(c3859dArr2[0]);
            if (m16660h7 != null) {
                m16657b(this.f16305h, m16660h7, this.f16299b.f15981P[0].m16305e());
                m16658c(this.f16306i, this.f16305h, 1, this.f16302e);
                return;
            }
            return;
        }
        if (c3859dArr2[1].f15948f != null) {
            C3918f m16660h8 = m16660h(c3859dArr2[1]);
            if (m16660h8 != null) {
                m16657b(this.f16306i, m16660h8, -this.f16299b.f15981P[1].m16305e());
                m16658c(this.f16305h, this.f16306i, -1, this.f16302e);
                return;
            }
            return;
        }
        if ((c3860e4 instanceof InterfaceC3863h) || c3860e4.m16339I() == null) {
            return;
        }
        m16657b(this.f16305h, this.f16299b.m16339I().f16000e.f16305h, this.f16299b.m16359S());
        m16658c(this.f16306i, this.f16305h, 1, this.f16302e);
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: e */
    public void mo16603e() {
        C3918f c3918f = this.f16305h;
        if (c3918f.f16256j) {
            this.f16299b.m16366V0(c3918f.f16253g);
        }
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: f */
    public void mo16604f() {
        this.f16300c = null;
        this.f16305h.m16622c();
        this.f16306i.m16622c();
        this.f16302e.m16622c();
        this.f16304g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: m */
    public boolean mo16606m() {
        return this.f16301d != C3860e.b.MATCH_CONSTRAINT || this.f16299b.f16022p == 0;
    }

    /* renamed from: r */
    public void m16640r() {
        this.f16304g = false;
        this.f16305h.m16622c();
        this.f16305h.f16256j = false;
        this.f16306i.m16622c();
        this.f16306i.f16256j = false;
        this.f16302e.f16256j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f16299b.m16399r();
    }
}
