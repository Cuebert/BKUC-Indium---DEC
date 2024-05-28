package p158m0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.C3861f;
import p147l0.C3862g;
import p147l0.C3864i;
import p158m0.C3914b;

/* renamed from: m0.e */
/* loaded from: classes.dex */
public class C3917e {

    /* renamed from: a */
    private C3861f f16238a;

    /* renamed from: d */
    private C3861f f16241d;

    /* renamed from: b */
    private boolean f16239b = true;

    /* renamed from: c */
    private boolean f16240c = true;

    /* renamed from: e */
    private ArrayList<AbstractC3928p> f16242e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C3925m> f16243f = new ArrayList<>();

    /* renamed from: g */
    private C3914b.b f16244g = null;

    /* renamed from: h */
    private C3914b.a f16245h = new C3914b.a();

    /* renamed from: i */
    ArrayList<C3925m> f16246i = new ArrayList<>();

    public C3917e(C3861f c3861f) {
        this.f16238a = c3861f;
        this.f16241d = c3861f;
    }

    /* renamed from: a */
    private void m16607a(C3918f c3918f, int i10, int i11, C3918f c3918f2, ArrayList<C3925m> arrayList, C3925m c3925m) {
        AbstractC3928p abstractC3928p = c3918f.f16250d;
        if (abstractC3928p.f16300c == null) {
            C3861f c3861f = this.f16238a;
            if (abstractC3928p == c3861f.f16000e || abstractC3928p == c3861f.f16002f) {
                return;
            }
            if (c3925m == null) {
                c3925m = new C3925m(abstractC3928p, i11);
                arrayList.add(c3925m);
            }
            abstractC3928p.f16300c = c3925m;
            c3925m.m16643a(abstractC3928p);
            for (InterfaceC3916d interfaceC3916d : abstractC3928p.f16305h.f16257k) {
                if (interfaceC3916d instanceof C3918f) {
                    m16607a((C3918f) interfaceC3916d, i10, 0, c3918f2, arrayList, c3925m);
                }
            }
            for (InterfaceC3916d interfaceC3916d2 : abstractC3928p.f16306i.f16257k) {
                if (interfaceC3916d2 instanceof C3918f) {
                    m16607a((C3918f) interfaceC3916d2, i10, 1, c3918f2, arrayList, c3925m);
                }
            }
            if (i10 == 1 && (abstractC3928p instanceof C3926n)) {
                for (InterfaceC3916d interfaceC3916d3 : ((C3926n) abstractC3928p).f16280k.f16257k) {
                    if (interfaceC3916d3 instanceof C3918f) {
                        m16607a((C3918f) interfaceC3916d3, i10, 2, c3918f2, arrayList, c3925m);
                    }
                }
            }
            for (C3918f c3918f3 : abstractC3928p.f16305h.f16258l) {
                if (c3918f3 == c3918f2) {
                    c3925m.f16274b = true;
                }
                m16607a(c3918f3, i10, 0, c3918f2, arrayList, c3925m);
            }
            for (C3918f c3918f4 : abstractC3928p.f16306i.f16258l) {
                if (c3918f4 == c3918f2) {
                    c3925m.f16274b = true;
                }
                m16607a(c3918f4, i10, 1, c3918f2, arrayList, c3925m);
            }
            if (i10 == 1 && (abstractC3928p instanceof C3926n)) {
                Iterator<C3918f> it = ((C3926n) abstractC3928p).f16280k.f16258l.iterator();
                while (it.hasNext()) {
                    m16607a(it.next(), i10, 2, c3918f2, arrayList, c3925m);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m16608b(C3861f c3861f) {
        int i10;
        C3860e.b bVar;
        int i11;
        C3860e.b bVar2;
        C3860e.b bVar3;
        C3860e.b bVar4;
        Iterator<C3860e> it = c3861f.f16103D0.iterator();
        while (it.hasNext()) {
            C3860e next = it.next();
            C3860e.b[] bVarArr = next.f15984S;
            C3860e.b bVar5 = bVarArr[0];
            C3860e.b bVar6 = bVarArr[1];
            if (next.m16355Q() == 8) {
                next.f15992a = true;
            } else {
                if (next.f16032u < 1.0f && bVar5 == C3860e.b.MATCH_CONSTRAINT) {
                    next.f16022p = 2;
                }
                if (next.f16038x < 1.0f && bVar6 == C3860e.b.MATCH_CONSTRAINT) {
                    next.f16024q = 2;
                }
                if (next.m16403t() > 0.0f) {
                    C3860e.b bVar7 = C3860e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == C3860e.b.WRAP_CONTENT || bVar6 == C3860e.b.FIXED)) {
                        next.f16022p = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == C3860e.b.WRAP_CONTENT || bVar5 == C3860e.b.FIXED)) {
                        next.f16024q = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f16022p == 0) {
                            next.f16022p = 3;
                        }
                        if (next.f16024q == 0) {
                            next.f16024q = 3;
                        }
                    }
                }
                C3860e.b bVar8 = C3860e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f16022p == 1 && (next.f15973H.f15948f == null || next.f15975J.f15948f == null)) {
                    bVar5 = C3860e.b.WRAP_CONTENT;
                }
                C3860e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f16024q == 1 && (next.f15974I.f15948f == null || next.f15976K.f15948f == null)) {
                    bVar6 = C3860e.b.WRAP_CONTENT;
                }
                C3860e.b bVar10 = bVar6;
                C3924l c3924l = next.f16000e;
                c3924l.f16301d = bVar9;
                int i12 = next.f16022p;
                c3924l.f16298a = i12;
                C3926n c3926n = next.f16002f;
                c3926n.f16301d = bVar10;
                int i13 = next.f16024q;
                c3926n.f16298a = i13;
                C3860e.b bVar11 = C3860e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == C3860e.b.FIXED || bVar9 == C3860e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == C3860e.b.FIXED || bVar10 == C3860e.b.WRAP_CONTENT)) {
                    int m16357R = next.m16357R();
                    if (bVar9 == bVar11) {
                        i10 = (c3861f.m16357R() - next.f15973H.f15949g) - next.f15975J.f15949g;
                        bVar = C3860e.b.FIXED;
                    } else {
                        i10 = m16357R;
                        bVar = bVar9;
                    }
                    int m16407v = next.m16407v();
                    if (bVar10 == bVar11) {
                        i11 = (c3861f.m16407v() - next.f15974I.f15949g) - next.f15976K.f15949g;
                        bVar2 = C3860e.b.FIXED;
                    } else {
                        i11 = m16407v;
                        bVar2 = bVar10;
                    }
                    m16611l(next, bVar, i10, bVar2, i11);
                    next.f16000e.f16302e.mo16623d(next.m16357R());
                    next.f16002f.f16302e.mo16623d(next.m16407v());
                    next.f15992a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = C3860e.b.WRAP_CONTENT) || bVar10 == C3860e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar10 == bVar4) {
                                m16611l(next, bVar4, 0, bVar4, 0);
                            }
                            int m16407v2 = next.m16407v();
                            int i14 = (int) ((m16407v2 * next.f15988W) + 0.5f);
                            C3860e.b bVar12 = C3860e.b.FIXED;
                            m16611l(next, bVar12, i14, bVar12, m16407v2);
                            next.f16000e.f16302e.mo16623d(next.m16357R());
                            next.f16002f.f16302e.mo16623d(next.m16407v());
                            next.f15992a = true;
                        } else if (i12 == 1) {
                            m16611l(next, bVar4, 0, bVar10, 0);
                            next.f16000e.f16302e.f16268m = next.m16357R();
                        } else if (i12 == 2) {
                            C3860e.b[] bVarArr2 = c3861f.f15984S;
                            C3860e.b bVar13 = bVarArr2[0];
                            C3860e.b bVar14 = C3860e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                m16611l(next, bVar14, (int) ((next.f16032u * c3861f.m16357R()) + 0.5f), bVar10, next.m16407v());
                                next.f16000e.f16302e.mo16623d(next.m16357R());
                                next.f16002f.f16302e.mo16623d(next.m16407v());
                                next.f15992a = true;
                            }
                        } else {
                            C3859d[] c3859dArr = next.f15981P;
                            if (c3859dArr[0].f15948f == null || c3859dArr[1].f15948f == null) {
                                m16611l(next, bVar4, 0, bVar10, 0);
                                next.f16000e.f16302e.mo16623d(next.m16357R());
                                next.f16002f.f16302e.mo16623d(next.m16407v());
                                next.f15992a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = C3860e.b.WRAP_CONTENT) || bVar9 == C3860e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar9 == bVar3) {
                                m16611l(next, bVar3, 0, bVar3, 0);
                            }
                            int m16357R2 = next.m16357R();
                            float f10 = next.f15988W;
                            if (next.m16405u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            C3860e.b bVar15 = C3860e.b.FIXED;
                            m16611l(next, bVar15, m16357R2, bVar15, (int) ((m16357R2 * f10) + 0.5f));
                            next.f16000e.f16302e.mo16623d(next.m16357R());
                            next.f16002f.f16302e.mo16623d(next.m16407v());
                            next.f15992a = true;
                        } else if (i13 == 1) {
                            m16611l(next, bVar9, 0, bVar3, 0);
                            next.f16002f.f16302e.f16268m = next.m16407v();
                        } else if (i13 == 2) {
                            C3860e.b[] bVarArr3 = c3861f.f15984S;
                            C3860e.b bVar16 = bVarArr3[1];
                            C3860e.b bVar17 = C3860e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                m16611l(next, bVar9, next.m16357R(), bVar17, (int) ((next.f16038x * c3861f.m16407v()) + 0.5f));
                                next.f16000e.f16302e.mo16623d(next.m16357R());
                                next.f16002f.f16302e.mo16623d(next.m16407v());
                                next.f15992a = true;
                            }
                        } else {
                            C3859d[] c3859dArr2 = next.f15981P;
                            if (c3859dArr2[2].f15948f == null || c3859dArr2[3].f15948f == null) {
                                m16611l(next, bVar3, 0, bVar10, 0);
                                next.f16000e.f16302e.mo16623d(next.m16357R());
                                next.f16002f.f16302e.mo16623d(next.m16407v());
                                next.f15992a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i12 == 1 || i13 == 1) {
                            C3860e.b bVar18 = C3860e.b.WRAP_CONTENT;
                            m16611l(next, bVar18, 0, bVar18, 0);
                            next.f16000e.f16302e.f16268m = next.m16357R();
                            next.f16002f.f16302e.f16268m = next.m16407v();
                        } else if (i13 == 2 && i12 == 2) {
                            C3860e.b[] bVarArr4 = c3861f.f15984S;
                            C3860e.b bVar19 = bVarArr4[0];
                            C3860e.b bVar20 = C3860e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    m16611l(next, bVar20, (int) ((next.f16032u * c3861f.m16357R()) + 0.5f), bVar20, (int) ((next.f16038x * c3861f.m16407v()) + 0.5f));
                                    next.f16000e.f16302e.mo16623d(next.m16357R());
                                    next.f16002f.f16302e.mo16623d(next.m16407v());
                                    next.f15992a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m16609e(C3861f c3861f, int i10) {
        int size = this.f16246i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f16246i.get(i11).m16644b(c3861f, i10));
        }
        return (int) j10;
    }

    /* renamed from: i */
    private void m16610i(AbstractC3928p abstractC3928p, int i10, ArrayList<C3925m> arrayList) {
        for (InterfaceC3916d interfaceC3916d : abstractC3928p.f16305h.f16257k) {
            if (interfaceC3916d instanceof C3918f) {
                m16607a((C3918f) interfaceC3916d, i10, 0, abstractC3928p.f16306i, arrayList, null);
            } else if (interfaceC3916d instanceof AbstractC3928p) {
                m16607a(((AbstractC3928p) interfaceC3916d).f16305h, i10, 0, abstractC3928p.f16306i, arrayList, null);
            }
        }
        for (InterfaceC3916d interfaceC3916d2 : abstractC3928p.f16306i.f16257k) {
            if (interfaceC3916d2 instanceof C3918f) {
                m16607a((C3918f) interfaceC3916d2, i10, 1, abstractC3928p.f16305h, arrayList, null);
            } else if (interfaceC3916d2 instanceof AbstractC3928p) {
                m16607a(((AbstractC3928p) interfaceC3916d2).f16306i, i10, 1, abstractC3928p.f16305h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC3916d interfaceC3916d3 : ((C3926n) abstractC3928p).f16280k.f16257k) {
                if (interfaceC3916d3 instanceof C3918f) {
                    m16607a((C3918f) interfaceC3916d3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m16611l(C3860e c3860e, C3860e.b bVar, int i10, C3860e.b bVar2, int i11) {
        C3914b.a aVar = this.f16245h;
        aVar.f16226a = bVar;
        aVar.f16227b = bVar2;
        aVar.f16228c = i10;
        aVar.f16229d = i11;
        this.f16244g.mo2552b(c3860e, aVar);
        c3860e.m16364U0(this.f16245h.f16230e);
        c3860e.m16408v0(this.f16245h.f16231f);
        c3860e.m16406u0(this.f16245h.f16233h);
        c3860e.m16386k0(this.f16245h.f16232g);
    }

    /* renamed from: c */
    public void m16612c() {
        m16613d(this.f16242e);
        this.f16246i.clear();
        C3925m.f16272h = 0;
        m16610i(this.f16238a.f16000e, 0, this.f16246i);
        m16610i(this.f16238a.f16002f, 1, this.f16246i);
        this.f16239b = false;
    }

    /* renamed from: d */
    public void m16613d(ArrayList<AbstractC3928p> arrayList) {
        arrayList.clear();
        this.f16241d.f16000e.mo16604f();
        this.f16241d.f16002f.mo16604f();
        arrayList.add(this.f16241d.f16000e);
        arrayList.add(this.f16241d.f16002f);
        Iterator<C3860e> it = this.f16241d.f16103D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3860e next = it.next();
            if (next instanceof C3862g) {
                arrayList.add(new C3922j(next));
            } else {
                if (next.m16372Z()) {
                    if (next.f15996c == null) {
                        next.f15996c = new C3915c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f15996c);
                } else {
                    arrayList.add(next.f16000e);
                }
                if (next.m16375b0()) {
                    if (next.f15998d == null) {
                        next.f15998d = new C3915c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f15998d);
                } else {
                    arrayList.add(next.f16002f);
                }
                if (next instanceof C3864i) {
                    arrayList.add(new C3923k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC3928p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo16604f();
        }
        Iterator<AbstractC3928p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC3928p next2 = it3.next();
            if (next2.f16299b != this.f16241d) {
                next2.mo16602d();
            }
        }
    }

    /* renamed from: f */
    public boolean m16614f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f16239b || this.f16240c) {
            Iterator<C3860e> it = this.f16238a.f16103D0.iterator();
            while (it.hasNext()) {
                C3860e next = it.next();
                next.m16387l();
                next.f15992a = false;
                next.f16000e.m16640r();
                next.f16002f.m16645q();
            }
            this.f16238a.m16387l();
            C3861f c3861f = this.f16238a;
            c3861f.f15992a = false;
            c3861f.f16000e.m16640r();
            this.f16238a.f16002f.m16645q();
            this.f16240c = false;
        }
        if (m16608b(this.f16241d)) {
            return false;
        }
        this.f16238a.m16366V0(0);
        this.f16238a.m16368W0(0);
        C3860e.b m16401s = this.f16238a.m16401s(0);
        C3860e.b m16401s2 = this.f16238a.m16401s(1);
        if (this.f16239b) {
            m16612c();
        }
        int m16359S = this.f16238a.m16359S();
        int m16361T = this.f16238a.m16361T();
        this.f16238a.f16000e.f16305h.mo16623d(m16359S);
        this.f16238a.f16002f.f16305h.mo16623d(m16361T);
        m16619m();
        C3860e.b bVar = C3860e.b.WRAP_CONTENT;
        if (m16401s == bVar || m16401s2 == bVar) {
            if (z13) {
                Iterator<AbstractC3928p> it2 = this.f16242e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo16606m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && m16401s == C3860e.b.WRAP_CONTENT) {
                this.f16238a.m16416z0(C3860e.b.FIXED);
                C3861f c3861f2 = this.f16238a;
                c3861f2.m16364U0(m16609e(c3861f2, 0));
                C3861f c3861f3 = this.f16238a;
                c3861f3.f16000e.f16302e.mo16623d(c3861f3.m16357R());
            }
            if (z13 && m16401s2 == C3860e.b.WRAP_CONTENT) {
                this.f16238a.m16356Q0(C3860e.b.FIXED);
                C3861f c3861f4 = this.f16238a;
                c3861f4.m16408v0(m16609e(c3861f4, 1));
                C3861f c3861f5 = this.f16238a;
                c3861f5.f16002f.f16302e.mo16623d(c3861f5.m16407v());
            }
        }
        C3861f c3861f6 = this.f16238a;
        C3860e.b[] bVarArr = c3861f6.f15984S;
        C3860e.b bVar2 = bVarArr[0];
        C3860e.b bVar3 = C3860e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C3860e.b.MATCH_PARENT) {
            int m16357R = c3861f6.m16357R() + m16359S;
            this.f16238a.f16000e.f16306i.mo16623d(m16357R);
            this.f16238a.f16000e.f16302e.mo16623d(m16357R - m16359S);
            m16619m();
            C3861f c3861f7 = this.f16238a;
            C3860e.b[] bVarArr2 = c3861f7.f15984S;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C3860e.b.MATCH_PARENT) {
                int m16407v = c3861f7.m16407v() + m16361T;
                this.f16238a.f16002f.f16306i.mo16623d(m16407v);
                this.f16238a.f16002f.f16302e.mo16623d(m16407v - m16361T);
            }
            m16619m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<AbstractC3928p> it3 = this.f16242e.iterator();
        while (it3.hasNext()) {
            AbstractC3928p next2 = it3.next();
            if (next2.f16299b != this.f16238a || next2.f16304g) {
                next2.mo16603e();
            }
        }
        Iterator<AbstractC3928p> it4 = this.f16242e.iterator();
        while (it4.hasNext()) {
            AbstractC3928p next3 = it4.next();
            if (z11 || next3.f16299b != this.f16238a) {
                if (!next3.f16305h.f16256j || ((!next3.f16306i.f16256j && !(next3 instanceof C3922j)) || (!next3.f16302e.f16256j && !(next3 instanceof C3915c) && !(next3 instanceof C3922j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f16238a.m16416z0(m16401s);
        this.f16238a.m16356Q0(m16401s2);
        return z12;
    }

    /* renamed from: g */
    public boolean m16615g(boolean z10) {
        if (this.f16239b) {
            Iterator<C3860e> it = this.f16238a.f16103D0.iterator();
            while (it.hasNext()) {
                C3860e next = it.next();
                next.m16387l();
                next.f15992a = false;
                C3924l c3924l = next.f16000e;
                c3924l.f16302e.f16256j = false;
                c3924l.f16304g = false;
                c3924l.m16640r();
                C3926n c3926n = next.f16002f;
                c3926n.f16302e.f16256j = false;
                c3926n.f16304g = false;
                c3926n.m16645q();
            }
            this.f16238a.m16387l();
            C3861f c3861f = this.f16238a;
            c3861f.f15992a = false;
            C3924l c3924l2 = c3861f.f16000e;
            c3924l2.f16302e.f16256j = false;
            c3924l2.f16304g = false;
            c3924l2.m16640r();
            C3926n c3926n2 = this.f16238a.f16002f;
            c3926n2.f16302e.f16256j = false;
            c3926n2.f16304g = false;
            c3926n2.m16645q();
            m16612c();
        }
        if (m16608b(this.f16241d)) {
            return false;
        }
        this.f16238a.m16366V0(0);
        this.f16238a.m16368W0(0);
        this.f16238a.f16000e.f16305h.mo16623d(0);
        this.f16238a.f16002f.f16305h.mo16623d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m16616h(boolean z10, int i10) {
        boolean z11;
        C3860e.b bVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        C3860e.b m16401s = this.f16238a.m16401s(0);
        C3860e.b m16401s2 = this.f16238a.m16401s(1);
        int m16359S = this.f16238a.m16359S();
        int m16361T = this.f16238a.m16361T();
        if (z13 && (m16401s == (bVar = C3860e.b.WRAP_CONTENT) || m16401s2 == bVar)) {
            Iterator<AbstractC3928p> it = this.f16242e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC3928p next = it.next();
                if (next.f16303f == i10 && !next.mo16606m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && m16401s == C3860e.b.WRAP_CONTENT) {
                    this.f16238a.m16416z0(C3860e.b.FIXED);
                    C3861f c3861f = this.f16238a;
                    c3861f.m16364U0(m16609e(c3861f, 0));
                    C3861f c3861f2 = this.f16238a;
                    c3861f2.f16000e.f16302e.mo16623d(c3861f2.m16357R());
                }
            } else if (z13 && m16401s2 == C3860e.b.WRAP_CONTENT) {
                this.f16238a.m16356Q0(C3860e.b.FIXED);
                C3861f c3861f3 = this.f16238a;
                c3861f3.m16408v0(m16609e(c3861f3, 1));
                C3861f c3861f4 = this.f16238a;
                c3861f4.f16002f.f16302e.mo16623d(c3861f4.m16407v());
            }
        }
        if (i10 == 0) {
            C3861f c3861f5 = this.f16238a;
            C3860e.b[] bVarArr = c3861f5.f15984S;
            if (bVarArr[0] == C3860e.b.FIXED || bVarArr[0] == C3860e.b.MATCH_PARENT) {
                int m16357R = c3861f5.m16357R() + m16359S;
                this.f16238a.f16000e.f16306i.mo16623d(m16357R);
                this.f16238a.f16000e.f16302e.mo16623d(m16357R - m16359S);
                z11 = true;
            }
            z11 = false;
        } else {
            C3861f c3861f6 = this.f16238a;
            C3860e.b[] bVarArr2 = c3861f6.f15984S;
            if (bVarArr2[1] == C3860e.b.FIXED || bVarArr2[1] == C3860e.b.MATCH_PARENT) {
                int m16407v = c3861f6.m16407v() + m16361T;
                this.f16238a.f16002f.f16306i.mo16623d(m16407v);
                this.f16238a.f16002f.f16302e.mo16623d(m16407v - m16361T);
                z11 = true;
            }
            z11 = false;
        }
        m16619m();
        Iterator<AbstractC3928p> it2 = this.f16242e.iterator();
        while (it2.hasNext()) {
            AbstractC3928p next2 = it2.next();
            if (next2.f16303f == i10 && (next2.f16299b != this.f16238a || next2.f16304g)) {
                next2.mo16603e();
            }
        }
        Iterator<AbstractC3928p> it3 = this.f16242e.iterator();
        while (it3.hasNext()) {
            AbstractC3928p next3 = it3.next();
            if (next3.f16303f == i10 && (z11 || next3.f16299b != this.f16238a)) {
                if (!next3.f16305h.f16256j || !next3.f16306i.f16256j || (!(next3 instanceof C3915c) && !next3.f16302e.f16256j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f16238a.m16416z0(m16401s);
        this.f16238a.m16356Q0(m16401s2);
        return z12;
    }

    /* renamed from: j */
    public void m16617j() {
        this.f16239b = true;
    }

    /* renamed from: k */
    public void m16618k() {
        this.f16240c = true;
    }

    /* renamed from: m */
    public void m16619m() {
        C3919g c3919g;
        Iterator<C3860e> it = this.f16238a.f16103D0.iterator();
        while (it.hasNext()) {
            C3860e next = it.next();
            if (!next.f15992a) {
                C3860e.b[] bVarArr = next.f15984S;
                boolean z10 = false;
                C3860e.b bVar = bVarArr[0];
                C3860e.b bVar2 = bVarArr[1];
                int i10 = next.f16022p;
                int i11 = next.f16024q;
                C3860e.b bVar3 = C3860e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == C3860e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == C3860e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                C3919g c3919g2 = next.f16000e.f16302e;
                boolean z12 = c3919g2.f16256j;
                C3919g c3919g3 = next.f16002f.f16302e;
                boolean z13 = c3919g3.f16256j;
                if (z12 && z13) {
                    C3860e.b bVar4 = C3860e.b.FIXED;
                    m16611l(next, bVar4, c3919g2.f16253g, bVar4, c3919g3.f16253g);
                    next.f15992a = true;
                } else if (z12 && z10) {
                    m16611l(next, C3860e.b.FIXED, c3919g2.f16253g, bVar3, c3919g3.f16253g);
                    if (bVar2 == C3860e.b.MATCH_CONSTRAINT) {
                        next.f16002f.f16302e.f16268m = next.m16407v();
                    } else {
                        next.f16002f.f16302e.mo16623d(next.m16407v());
                        next.f15992a = true;
                    }
                } else if (z13 && z11) {
                    m16611l(next, bVar3, c3919g2.f16253g, C3860e.b.FIXED, c3919g3.f16253g);
                    if (bVar == C3860e.b.MATCH_CONSTRAINT) {
                        next.f16000e.f16302e.f16268m = next.m16357R();
                    } else {
                        next.f16000e.f16302e.mo16623d(next.m16357R());
                        next.f15992a = true;
                    }
                }
                if (next.f15992a && (c3919g = next.f16002f.f16281l) != null) {
                    c3919g.mo16623d(next.m16391n());
                }
            }
        }
    }

    /* renamed from: n */
    public void m16620n(C3914b.b bVar) {
        this.f16244g = bVar;
    }
}
