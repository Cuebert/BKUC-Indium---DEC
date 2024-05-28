package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* loaded from: classes.dex */
public final class C1628j0 extends AbstractC1851x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1628j0() {
        this.f7285a.add(EnumC1692n0.FOR_IN);
        this.f7285a.add(EnumC1692n0.FOR_IN_CONST);
        this.f7285a.add(EnumC1692n0.FOR_IN_LET);
        this.f7285a.add(EnumC1692n0.FOR_LET);
        this.f7285a.add(EnumC1692n0.FOR_OF);
        this.f7285a.add(EnumC1692n0.FOR_OF_CONST);
        this.f7285a.add(EnumC1692n0.FOR_OF_LET);
        this.f7285a.add(EnumC1692n0.WHILE);
    }

    /* renamed from: c */
    private static InterfaceC1739q m8313c(InterfaceC1595h0 interfaceC1595h0, Iterator<InterfaceC1739q> it, InterfaceC1739q interfaceC1739q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1739q m8656c = interfaceC1595h0.mo8148a(it.next()).m8656c((C1560f) interfaceC1739q);
                if (m8656c instanceof C1594h) {
                    C1594h c1594h = (C1594h) m8656c;
                    if ("break".equals(c1594h.m8204b())) {
                        return InterfaceC1739q.f7165b;
                    }
                    if ("return".equals(c1594h.m8204b())) {
                        return c1594h;
                    }
                }
            }
        }
        return InterfaceC1739q.f7165b;
    }

    /* renamed from: d */
    private static InterfaceC1739q m8314d(InterfaceC1595h0 interfaceC1595h0, InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        return m8313c(interfaceC1595h0, interfaceC1739q.mo8133i(), interfaceC1739q2);
    }

    /* renamed from: e */
    private static InterfaceC1739q m8315e(InterfaceC1595h0 interfaceC1595h0, InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        if (interfaceC1739q instanceof Iterable) {
            return m8313c(interfaceC1595h0, ((Iterable) interfaceC1739q).iterator(), interfaceC1739q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        EnumC1692n0 enumC1692n0 = EnumC1692n0.ADD;
        int ordinal = C1745q5.m8719e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C1745q5.m8722h(EnumC1692n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e = list.get(0).mo8132e();
                        return m8314d(new C1612i0(c1728p4, mo8132e), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C1745q5.m8722h(EnumC1692n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e2 = list.get(0).mo8132e();
                        return m8314d(new C1561f0(c1728p4, mo8132e2), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C1745q5.m8722h(EnumC1692n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e3 = list.get(0).mo8132e();
                        return m8314d(new C1578g0(c1728p4, mo8132e3), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C1745q5.m8722h(EnumC1692n0.FOR_LET.name(), 4, list);
                    InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
                    if (m8655b instanceof C1560f) {
                        C1560f c1560f = (C1560f) m8655b;
                        InterfaceC1739q interfaceC1739q = list.get(1);
                        InterfaceC1739q interfaceC1739q2 = list.get(2);
                        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(3));
                        C1728p4 m8654a = c1728p4.m8654a();
                        for (int i10 = 0; i10 < c1560f.m8140r(); i10++) {
                            String mo8132e4 = c1560f.m8141s(i10).mo8132e();
                            m8654a.m8660g(mo8132e4, c1728p4.m8657d(mo8132e4));
                        }
                        while (c1728p4.m8655b(interfaceC1739q).mo8136m().booleanValue()) {
                            InterfaceC1739q m8656c = c1728p4.m8656c((C1560f) m8655b2);
                            if (m8656c instanceof C1594h) {
                                C1594h c1594h = (C1594h) m8656c;
                                if ("break".equals(c1594h.m8204b())) {
                                    return InterfaceC1739q.f7165b;
                                }
                                if ("return".equals(c1594h.m8204b())) {
                                    return c1594h;
                                }
                            }
                            C1728p4 m8654a2 = c1728p4.m8654a();
                            for (int i11 = 0; i11 < c1560f.m8140r(); i11++) {
                                String mo8132e5 = c1560f.m8141s(i11).mo8132e();
                                m8654a2.m8660g(mo8132e5, m8654a.m8657d(mo8132e5));
                            }
                            m8654a2.m8655b(interfaceC1739q2);
                            m8654a = m8654a2;
                        }
                        return InterfaceC1739q.f7165b;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C1745q5.m8722h(EnumC1692n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e6 = list.get(0).mo8132e();
                        return m8315e(new C1612i0(c1728p4, mo8132e6), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C1745q5.m8722h(EnumC1692n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e7 = list.get(0).mo8132e();
                        return m8315e(new C1561f0(c1728p4, mo8132e7), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C1745q5.m8722h(EnumC1692n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C1803u) {
                        String mo8132e8 = list.get(0).mo8132e();
                        return m8315e(new C1578g0(c1728p4, mo8132e8), c1728p4.m8655b(list.get(1)), c1728p4.m8655b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.m8953b(str);
            }
        }
        C1745q5.m8722h(EnumC1692n0.WHILE.name(), 4, list);
        InterfaceC1739q interfaceC1739q3 = list.get(0);
        InterfaceC1739q interfaceC1739q4 = list.get(1);
        InterfaceC1739q interfaceC1739q5 = list.get(2);
        InterfaceC1739q m8655b3 = c1728p4.m8655b(list.get(3));
        if (c1728p4.m8655b(interfaceC1739q5).mo8136m().booleanValue()) {
            InterfaceC1739q m8656c2 = c1728p4.m8656c((C1560f) m8655b3);
            if (m8656c2 instanceof C1594h) {
                C1594h c1594h2 = (C1594h) m8656c2;
                if ("break".equals(c1594h2.m8204b())) {
                    return InterfaceC1739q.f7165b;
                }
                if ("return".equals(c1594h2.m8204b())) {
                    return c1594h2;
                }
            }
        }
        while (c1728p4.m8655b(interfaceC1739q3).mo8136m().booleanValue()) {
            InterfaceC1739q m8656c3 = c1728p4.m8656c((C1560f) m8655b3);
            if (m8656c3 instanceof C1594h) {
                C1594h c1594h3 = (C1594h) m8656c3;
                if ("break".equals(c1594h3.m8204b())) {
                    return InterfaceC1739q.f7165b;
                }
                if ("return".equals(c1594h3.m8204b())) {
                    return c1594h3;
                }
            }
            c1728p4.m8655b(interfaceC1739q4);
        }
        return InterfaceC1739q.f7165b;
    }
}
