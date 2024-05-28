package p158m0;

import java.util.ArrayList;
import java.util.Iterator;
import p147l0.C3856a;
import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.C3861f;
import p147l0.C3862g;
import p158m0.C3914b;

/* renamed from: m0.h */
/* loaded from: classes.dex */
public class C3920h {

    /* renamed from: a */
    private static C3914b.a f16269a = new C3914b.a();

    /* renamed from: a */
    private static boolean m16624a(C3860e c3860e) {
        C3860e.b m16413y = c3860e.m16413y();
        C3860e.b m16351O = c3860e.m16351O();
        C3861f c3861f = c3860e.m16339I() != null ? (C3861f) c3860e.m16339I() : null;
        if (c3861f != null) {
            c3861f.m16413y();
            C3860e.b bVar = C3860e.b.FIXED;
        }
        if (c3861f != null) {
            c3861f.m16351O();
            C3860e.b bVar2 = C3860e.b.FIXED;
        }
        C3860e.b bVar3 = C3860e.b.FIXED;
        boolean z10 = m16413y == bVar3 || m16413y == C3860e.b.WRAP_CONTENT || (m16413y == C3860e.b.MATCH_CONSTRAINT && c3860e.f16022p == 0 && c3860e.f15988W == 0.0f && c3860e.m16365V(0)) || c3860e.mo16285e0();
        boolean z11 = m16351O == bVar3 || m16351O == C3860e.b.WRAP_CONTENT || (m16351O == C3860e.b.MATCH_CONSTRAINT && c3860e.f16024q == 0 && c3860e.f15988W == 0.0f && c3860e.m16365V(1)) || c3860e.mo16287f0();
        if (c3860e.f15988W <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* renamed from: b */
    private static void m16625b(C3860e c3860e, C3914b.b bVar, boolean z10) {
        C3859d c3859d;
        C3859d c3859d2;
        C3859d c3859d3;
        C3859d c3859d4;
        C3859d c3859d5;
        if (!(c3860e instanceof C3861f) && c3860e.m16377d0() && m16624a(c3860e)) {
            C3861f.m16417A1(c3860e, bVar, new C3914b.a(), C3914b.a.f16223k);
        }
        C3859d mo16389m = c3860e.mo16389m(C3859d.b.LEFT);
        C3859d mo16389m2 = c3860e.mo16389m(C3859d.b.RIGHT);
        int m16304d = mo16389m.m16304d();
        int m16304d2 = mo16389m2.m16304d();
        if (mo16389m.m16303c() != null && mo16389m.m16313m()) {
            Iterator<C3859d> it = mo16389m.m16303c().iterator();
            while (it.hasNext()) {
                C3859d next = it.next();
                C3860e c3860e2 = next.f15946d;
                boolean m16624a = m16624a(c3860e2);
                if (c3860e2.m16377d0() && m16624a) {
                    C3861f.m16417A1(c3860e2, bVar, new C3914b.a(), C3914b.a.f16223k);
                }
                C3860e.b m16413y = c3860e2.m16413y();
                C3860e.b bVar2 = C3860e.b.MATCH_CONSTRAINT;
                if (m16413y == bVar2 && !m16624a) {
                    if (c3860e2.m16413y() == bVar2 && c3860e2.f16030t >= 0 && c3860e2.f16028s >= 0 && (c3860e2.m16355Q() == 8 || (c3860e2.f16022p == 0 && c3860e2.m16403t() == 0.0f))) {
                        if (!c3860e2.m16372Z() && !c3860e2.m16376c0()) {
                            if (((next == c3860e2.f15973H && (c3859d5 = c3860e2.f15975J.f15948f) != null && c3859d5.m16313m()) || (next == c3860e2.f15975J && (c3859d4 = c3860e2.f15973H.f15948f) != null && c3859d4.m16313m())) && !c3860e2.m16372Z()) {
                                m16628e(c3860e, bVar, c3860e2, z10);
                            }
                        }
                    }
                } else if (!c3860e2.m16377d0()) {
                    C3859d c3859d6 = c3860e2.f15973H;
                    if (next == c3859d6 && c3860e2.f15975J.f15948f == null) {
                        int m16305e = c3859d6.m16305e() + m16304d;
                        c3860e2.m16396p0(m16305e, c3860e2.m16357R() + m16305e);
                        m16625b(c3860e2, bVar, z10);
                    } else {
                        C3859d c3859d7 = c3860e2.f15975J;
                        if (next == c3859d7 && c3859d6.f15948f == null) {
                            int m16305e2 = m16304d - c3859d7.m16305e();
                            c3860e2.m16396p0(m16305e2 - c3860e2.m16357R(), m16305e2);
                            m16625b(c3860e2, bVar, z10);
                        } else if (next == c3859d6 && (c3859d3 = c3859d7.f15948f) != null && c3859d3.m16313m() && !c3860e2.m16372Z()) {
                            m16627d(bVar, c3860e2, z10);
                        }
                    }
                }
            }
        }
        if ((c3860e instanceof C3862g) || mo16389m2.m16303c() == null || !mo16389m2.m16313m()) {
            return;
        }
        Iterator<C3859d> it2 = mo16389m2.m16303c().iterator();
        while (it2.hasNext()) {
            C3859d next2 = it2.next();
            C3860e c3860e3 = next2.f15946d;
            boolean m16624a2 = m16624a(c3860e3);
            if (c3860e3.m16377d0() && m16624a2) {
                C3861f.m16417A1(c3860e3, bVar, new C3914b.a(), C3914b.a.f16223k);
            }
            boolean z11 = (next2 == c3860e3.f15973H && (c3859d2 = c3860e3.f15975J.f15948f) != null && c3859d2.m16313m()) || (next2 == c3860e3.f15975J && (c3859d = c3860e3.f15973H.f15948f) != null && c3859d.m16313m());
            C3860e.b m16413y2 = c3860e3.m16413y();
            C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
            if (m16413y2 == bVar3 && !m16624a2) {
                if (c3860e3.m16413y() == bVar3 && c3860e3.f16030t >= 0 && c3860e3.f16028s >= 0 && (c3860e3.m16355Q() == 8 || (c3860e3.f16022p == 0 && c3860e3.m16403t() == 0.0f))) {
                    if (!c3860e3.m16372Z() && !c3860e3.m16376c0() && z11 && !c3860e3.m16372Z()) {
                        m16628e(c3860e, bVar, c3860e3, z10);
                    }
                }
            } else if (!c3860e3.m16377d0()) {
                C3859d c3859d8 = c3860e3.f15973H;
                if (next2 == c3859d8 && c3860e3.f15975J.f15948f == null) {
                    int m16305e3 = c3859d8.m16305e() + m16304d2;
                    c3860e3.m16396p0(m16305e3, c3860e3.m16357R() + m16305e3);
                    m16625b(c3860e3, bVar, z10);
                } else {
                    C3859d c3859d9 = c3860e3.f15975J;
                    if (next2 == c3859d9 && c3859d8.f15948f == null) {
                        int m16305e4 = m16304d2 - c3859d9.m16305e();
                        c3860e3.m16396p0(m16305e4 - c3860e3.m16357R(), m16305e4);
                        m16625b(c3860e3, bVar, z10);
                    } else if (z11 && !c3860e3.m16372Z()) {
                        m16627d(bVar, c3860e3, z10);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m16626c(C3856a c3856a, C3914b.b bVar, int i10, boolean z10) {
        if (c3856a.m16283c1()) {
            if (i10 == 0) {
                m16625b(c3856a, bVar, z10);
            } else {
                m16632i(c3856a, bVar);
            }
        }
    }

    /* renamed from: d */
    private static void m16627d(C3914b.b bVar, C3860e c3860e, boolean z10) {
        float m16409w = c3860e.m16409w();
        int m16304d = c3860e.f15973H.f15948f.m16304d();
        int m16304d2 = c3860e.f15975J.f15948f.m16304d();
        int m16305e = c3860e.f15973H.m16305e() + m16304d;
        int m16305e2 = m16304d2 - c3860e.f15975J.m16305e();
        if (m16304d == m16304d2) {
            m16409w = 0.5f;
        } else {
            m16304d = m16305e;
            m16304d2 = m16305e2;
        }
        int m16357R = c3860e.m16357R();
        int i10 = (m16304d2 - m16304d) - m16357R;
        if (m16304d > m16304d2) {
            i10 = (m16304d - m16304d2) - m16357R;
        }
        int i11 = ((int) ((m16409w * i10) + 0.5f)) + m16304d;
        int i12 = i11 + m16357R;
        if (m16304d > m16304d2) {
            i12 = i11 - m16357R;
        }
        c3860e.m16396p0(i11, i12);
        m16625b(c3860e, bVar, z10);
    }

    /* renamed from: e */
    private static void m16628e(C3860e c3860e, C3914b.b bVar, C3860e c3860e2, boolean z10) {
        int m16357R;
        float m16409w = c3860e2.m16409w();
        int m16304d = c3860e2.f15973H.f15948f.m16304d() + c3860e2.f15973H.m16305e();
        int m16304d2 = c3860e2.f15975J.f15948f.m16304d() - c3860e2.f15975J.m16305e();
        if (m16304d2 >= m16304d) {
            int m16357R2 = c3860e2.m16357R();
            if (c3860e2.m16355Q() != 8) {
                int i10 = c3860e2.f16022p;
                if (i10 == 2) {
                    if (c3860e instanceof C3861f) {
                        m16357R = c3860e.m16357R();
                    } else {
                        m16357R = c3860e.m16339I().m16357R();
                    }
                    m16357R2 = (int) (c3860e2.m16409w() * 0.5f * m16357R);
                } else if (i10 == 0) {
                    m16357R2 = m16304d2 - m16304d;
                }
                m16357R2 = Math.max(c3860e2.f16028s, m16357R2);
                int i11 = c3860e2.f16030t;
                if (i11 > 0) {
                    m16357R2 = Math.min(i11, m16357R2);
                }
            }
            int i12 = m16304d + ((int) ((m16409w * ((m16304d2 - m16304d) - m16357R2)) + 0.5f));
            c3860e2.m16396p0(i12, m16357R2 + i12);
            m16625b(c3860e2, bVar, z10);
        }
    }

    /* renamed from: f */
    private static void m16629f(C3914b.b bVar, C3860e c3860e) {
        float m16347M = c3860e.m16347M();
        int m16304d = c3860e.f15974I.f15948f.m16304d();
        int m16304d2 = c3860e.f15976K.f15948f.m16304d();
        int m16305e = c3860e.f15974I.m16305e() + m16304d;
        int m16305e2 = m16304d2 - c3860e.f15976K.m16305e();
        if (m16304d == m16304d2) {
            m16347M = 0.5f;
        } else {
            m16304d = m16305e;
            m16304d2 = m16305e2;
        }
        int m16407v = c3860e.m16407v();
        int i10 = (m16304d2 - m16304d) - m16407v;
        if (m16304d > m16304d2) {
            i10 = (m16304d - m16304d2) - m16407v;
        }
        int i11 = (int) ((m16347M * i10) + 0.5f);
        int i12 = m16304d + i11;
        int i13 = i12 + m16407v;
        if (m16304d > m16304d2) {
            i12 = m16304d - i11;
            i13 = i12 - m16407v;
        }
        c3860e.m16402s0(i12, i13);
        m16632i(c3860e, bVar);
    }

    /* renamed from: g */
    private static void m16630g(C3860e c3860e, C3914b.b bVar, C3860e c3860e2) {
        int m16407v;
        float m16347M = c3860e2.m16347M();
        int m16304d = c3860e2.f15974I.f15948f.m16304d() + c3860e2.f15974I.m16305e();
        int m16304d2 = c3860e2.f15976K.f15948f.m16304d() - c3860e2.f15976K.m16305e();
        if (m16304d2 >= m16304d) {
            int m16407v2 = c3860e2.m16407v();
            if (c3860e2.m16355Q() != 8) {
                int i10 = c3860e2.f16024q;
                if (i10 == 2) {
                    if (c3860e instanceof C3861f) {
                        m16407v = c3860e.m16407v();
                    } else {
                        m16407v = c3860e.m16339I().m16407v();
                    }
                    m16407v2 = (int) (m16347M * 0.5f * m16407v);
                } else if (i10 == 0) {
                    m16407v2 = m16304d2 - m16304d;
                }
                m16407v2 = Math.max(c3860e2.f16034v, m16407v2);
                int i11 = c3860e2.f16036w;
                if (i11 > 0) {
                    m16407v2 = Math.min(i11, m16407v2);
                }
            }
            int i12 = m16304d + ((int) ((m16347M * ((m16304d2 - m16304d) - m16407v2)) + 0.5f));
            c3860e2.m16402s0(i12, m16407v2 + i12);
            m16632i(c3860e2, bVar);
        }
    }

    /* renamed from: h */
    public static void m16631h(C3861f c3861f, C3914b.b bVar) {
        C3860e.b m16413y = c3861f.m16413y();
        C3860e.b m16351O = c3861f.m16351O();
        c3861f.m16382i0();
        ArrayList<C3860e> m16467a1 = c3861f.m16467a1();
        int size = m16467a1.size();
        for (int i10 = 0; i10 < size; i10++) {
            m16467a1.get(i10).m16382i0();
        }
        boolean m16445x1 = c3861f.m16445x1();
        if (m16413y == C3860e.b.FIXED) {
            c3861f.m16396p0(0, c3861f.m16357R());
        } else {
            c3861f.m16398q0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C3860e c3860e = m16467a1.get(i11);
            if (c3860e instanceof C3862g) {
                C3862g c3862g = (C3862g) c3860e;
                if (c3862g.m16449b1() == 1) {
                    if (c3862g.m16450c1() != -1) {
                        c3862g.m16453f1(c3862g.m16450c1());
                    } else if (c3862g.m16451d1() != -1 && c3861f.mo16285e0()) {
                        c3862g.m16453f1(c3861f.m16357R() - c3862g.m16451d1());
                    } else if (c3861f.mo16285e0()) {
                        c3862g.m16453f1((int) ((c3862g.m16452e1() * c3861f.m16357R()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((c3860e instanceof C3856a) && ((C3856a) c3860e).m16290g1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C3860e c3860e2 = m16467a1.get(i12);
                if (c3860e2 instanceof C3862g) {
                    C3862g c3862g2 = (C3862g) c3860e2;
                    if (c3862g2.m16449b1() == 1) {
                        m16625b(c3862g2, bVar, m16445x1);
                    }
                }
            }
        }
        m16625b(c3861f, bVar, m16445x1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C3860e c3860e3 = m16467a1.get(i13);
                if (c3860e3 instanceof C3856a) {
                    C3856a c3856a = (C3856a) c3860e3;
                    if (c3856a.m16290g1() == 0) {
                        m16626c(c3856a, bVar, 0, m16445x1);
                    }
                }
            }
        }
        if (m16351O == C3860e.b.FIXED) {
            c3861f.m16402s0(0, c3861f.m16407v());
        } else {
            c3861f.m16400r0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C3860e c3860e4 = m16467a1.get(i14);
            if (c3860e4 instanceof C3862g) {
                C3862g c3862g3 = (C3862g) c3860e4;
                if (c3862g3.m16449b1() == 0) {
                    if (c3862g3.m16450c1() != -1) {
                        c3862g3.m16453f1(c3862g3.m16450c1());
                    } else if (c3862g3.m16451d1() != -1 && c3861f.mo16287f0()) {
                        c3862g3.m16453f1(c3861f.m16407v() - c3862g3.m16451d1());
                    } else if (c3861f.mo16287f0()) {
                        c3862g3.m16453f1((int) ((c3862g3.m16452e1() * c3861f.m16407v()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((c3860e4 instanceof C3856a) && ((C3856a) c3860e4).m16290g1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C3860e c3860e5 = m16467a1.get(i15);
                if (c3860e5 instanceof C3862g) {
                    C3862g c3862g4 = (C3862g) c3860e5;
                    if (c3862g4.m16449b1() == 0) {
                        m16632i(c3862g4, bVar);
                    }
                }
            }
        }
        m16632i(c3861f, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C3860e c3860e6 = m16467a1.get(i16);
                if (c3860e6 instanceof C3856a) {
                    C3856a c3856a2 = (C3856a) c3860e6;
                    if (c3856a2.m16290g1() == 1) {
                        m16626c(c3856a2, bVar, 1, m16445x1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C3860e c3860e7 = m16467a1.get(i17);
            if (c3860e7.m16377d0() && m16624a(c3860e7)) {
                C3861f.m16417A1(c3860e7, bVar, f16269a, C3914b.a.f16223k);
                m16625b(c3860e7, bVar, m16445x1);
                m16632i(c3860e7, bVar);
            }
        }
    }

    /* renamed from: i */
    private static void m16632i(C3860e c3860e, C3914b.b bVar) {
        C3859d c3859d;
        C3859d c3859d2;
        C3859d c3859d3;
        C3859d c3859d4;
        C3859d c3859d5;
        if (!(c3860e instanceof C3861f) && c3860e.m16377d0() && m16624a(c3860e)) {
            C3861f.m16417A1(c3860e, bVar, new C3914b.a(), C3914b.a.f16223k);
        }
        C3859d mo16389m = c3860e.mo16389m(C3859d.b.TOP);
        C3859d mo16389m2 = c3860e.mo16389m(C3859d.b.BOTTOM);
        int m16304d = mo16389m.m16304d();
        int m16304d2 = mo16389m2.m16304d();
        if (mo16389m.m16303c() != null && mo16389m.m16313m()) {
            Iterator<C3859d> it = mo16389m.m16303c().iterator();
            while (it.hasNext()) {
                C3859d next = it.next();
                C3860e c3860e2 = next.f15946d;
                boolean m16624a = m16624a(c3860e2);
                if (c3860e2.m16377d0() && m16624a) {
                    C3861f.m16417A1(c3860e2, bVar, new C3914b.a(), C3914b.a.f16223k);
                }
                C3860e.b m16351O = c3860e2.m16351O();
                C3860e.b bVar2 = C3860e.b.MATCH_CONSTRAINT;
                if (m16351O == bVar2 && !m16624a) {
                    if (c3860e2.m16351O() == bVar2 && c3860e2.f16036w >= 0 && c3860e2.f16034v >= 0 && (c3860e2.m16355Q() == 8 || (c3860e2.f16024q == 0 && c3860e2.m16403t() == 0.0f))) {
                        if (!c3860e2.m16375b0() && !c3860e2.m16376c0()) {
                            if (((next == c3860e2.f15974I && (c3859d5 = c3860e2.f15976K.f15948f) != null && c3859d5.m16313m()) || (next == c3860e2.f15976K && (c3859d4 = c3860e2.f15974I.f15948f) != null && c3859d4.m16313m())) && !c3860e2.m16375b0()) {
                                m16630g(c3860e, bVar, c3860e2);
                            }
                        }
                    }
                } else if (!c3860e2.m16377d0()) {
                    C3859d c3859d6 = c3860e2.f15974I;
                    if (next == c3859d6 && c3860e2.f15976K.f15948f == null) {
                        int m16305e = c3859d6.m16305e() + m16304d;
                        c3860e2.m16402s0(m16305e, c3860e2.m16407v() + m16305e);
                        m16632i(c3860e2, bVar);
                    } else {
                        C3859d c3859d7 = c3860e2.f15976K;
                        if (next == c3859d7 && c3859d7.f15948f == null) {
                            int m16305e2 = m16304d - c3859d7.m16305e();
                            c3860e2.m16402s0(m16305e2 - c3860e2.m16407v(), m16305e2);
                            m16632i(c3860e2, bVar);
                        } else if (next == c3859d6 && (c3859d3 = c3859d7.f15948f) != null && c3859d3.m16313m()) {
                            m16629f(bVar, c3860e2);
                        }
                    }
                }
            }
        }
        if (c3860e instanceof C3862g) {
            return;
        }
        if (mo16389m2.m16303c() != null && mo16389m2.m16313m()) {
            Iterator<C3859d> it2 = mo16389m2.m16303c().iterator();
            while (it2.hasNext()) {
                C3859d next2 = it2.next();
                C3860e c3860e3 = next2.f15946d;
                boolean m16624a2 = m16624a(c3860e3);
                if (c3860e3.m16377d0() && m16624a2) {
                    C3861f.m16417A1(c3860e3, bVar, new C3914b.a(), C3914b.a.f16223k);
                }
                boolean z10 = (next2 == c3860e3.f15974I && (c3859d2 = c3860e3.f15976K.f15948f) != null && c3859d2.m16313m()) || (next2 == c3860e3.f15976K && (c3859d = c3860e3.f15974I.f15948f) != null && c3859d.m16313m());
                C3860e.b m16351O2 = c3860e3.m16351O();
                C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
                if (m16351O2 == bVar3 && !m16624a2) {
                    if (c3860e3.m16351O() == bVar3 && c3860e3.f16036w >= 0 && c3860e3.f16034v >= 0 && (c3860e3.m16355Q() == 8 || (c3860e3.f16024q == 0 && c3860e3.m16403t() == 0.0f))) {
                        if (!c3860e3.m16375b0() && !c3860e3.m16376c0() && z10 && !c3860e3.m16375b0()) {
                            m16630g(c3860e, bVar, c3860e3);
                        }
                    }
                } else if (!c3860e3.m16377d0()) {
                    C3859d c3859d8 = c3860e3.f15974I;
                    if (next2 == c3859d8 && c3860e3.f15976K.f15948f == null) {
                        int m16305e3 = c3859d8.m16305e() + m16304d2;
                        c3860e3.m16402s0(m16305e3, c3860e3.m16407v() + m16305e3);
                        m16632i(c3860e3, bVar);
                    } else {
                        C3859d c3859d9 = c3860e3.f15976K;
                        if (next2 == c3859d9 && c3859d8.f15948f == null) {
                            int m16305e4 = m16304d2 - c3859d9.m16305e();
                            c3860e3.m16402s0(m16305e4 - c3860e3.m16407v(), m16305e4);
                            m16632i(c3860e3, bVar);
                        } else if (z10 && !c3860e3.m16375b0()) {
                            m16629f(bVar, c3860e3);
                        }
                    }
                }
            }
        }
        C3859d mo16389m3 = c3860e.mo16389m(C3859d.b.BASELINE);
        if (mo16389m3.m16303c() == null || !mo16389m3.m16313m()) {
            return;
        }
        int m16304d3 = mo16389m3.m16304d();
        Iterator<C3859d> it3 = mo16389m3.m16303c().iterator();
        while (it3.hasNext()) {
            C3859d next3 = it3.next();
            C3860e c3860e4 = next3.f15946d;
            boolean m16624a3 = m16624a(c3860e4);
            if (c3860e4.m16377d0() && m16624a3) {
                C3861f.m16417A1(c3860e4, bVar, new C3914b.a(), C3914b.a.f16223k);
            }
            if (c3860e4.m16351O() != C3860e.b.MATCH_CONSTRAINT || m16624a3) {
                if (!c3860e4.m16377d0() && next3 == c3860e4.f15977L) {
                    c3860e4.m16394o0(m16304d3);
                    m16632i(c3860e4, bVar);
                }
            }
        }
    }
}
