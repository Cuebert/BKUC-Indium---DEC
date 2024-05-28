package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* loaded from: classes.dex */
public final class C1676m0 extends AbstractC1851x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1676m0() {
        this.f7285a.add(EnumC1692n0.ASSIGN);
        this.f7285a.add(EnumC1692n0.CONST);
        this.f7285a.add(EnumC1692n0.CREATE_ARRAY);
        this.f7285a.add(EnumC1692n0.CREATE_OBJECT);
        this.f7285a.add(EnumC1692n0.EXPRESSION_LIST);
        this.f7285a.add(EnumC1692n0.GET);
        this.f7285a.add(EnumC1692n0.GET_INDEX);
        this.f7285a.add(EnumC1692n0.GET_PROPERTY);
        this.f7285a.add(EnumC1692n0.NULL);
        this.f7285a.add(EnumC1692n0.SET_PROPERTY);
        this.f7285a.add(EnumC1692n0.TYPEOF);
        this.f7285a.add(EnumC1692n0.UNDEFINED);
        this.f7285a.add(EnumC1692n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        String str2;
        EnumC1692n0 enumC1692n0 = EnumC1692n0.ADD;
        int ordinal = C1745q5.m8719e(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            C1745q5.m8722h(EnumC1692n0.ASSIGN.name(), 2, list);
            InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
            if (m8655b instanceof C1803u) {
                if (c1728p4.m8661h(m8655b.mo8132e())) {
                    InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(1));
                    c1728p4.m8660g(m8655b.mo8132e(), m8655b2);
                    return m8655b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m8655b.mo8132e()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m8655b.getClass().getCanonicalName()));
        }
        if (ordinal == 14) {
            C1745q5.m8723i(EnumC1692n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                    InterfaceC1739q m8655b3 = c1728p4.m8655b(list.get(i11));
                    if (m8655b3 instanceof C1803u) {
                        c1728p4.m8659f(m8655b3.mo8132e(), c1728p4.m8655b(list.get(i11 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m8655b3.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC1739q.f7165b;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal == 24) {
            C1745q5.m8723i(EnumC1692n0.EXPRESSION_LIST.name(), 1, list);
            InterfaceC1739q interfaceC1739q = InterfaceC1739q.f7165b;
            while (i10 < list.size()) {
                interfaceC1739q = c1728p4.m8655b(list.get(i10));
                if (interfaceC1739q instanceof C1594h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC1739q;
        }
        if (ordinal == 33) {
            C1745q5.m8722h(EnumC1692n0.GET.name(), 1, list);
            InterfaceC1739q m8655b4 = c1728p4.m8655b(list.get(0));
            if (m8655b4 instanceof C1803u) {
                return c1728p4.m8657d(m8655b4.mo8132e());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m8655b4.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            C1745q5.m8722h(EnumC1692n0.NULL.name(), 0, list);
            return InterfaceC1739q.f7166c;
        }
        if (ordinal == 58) {
            C1745q5.m8722h(EnumC1692n0.SET_PROPERTY.name(), 3, list);
            InterfaceC1739q m8655b5 = c1728p4.m8655b(list.get(0));
            InterfaceC1739q m8655b6 = c1728p4.m8655b(list.get(1));
            InterfaceC1739q m8655b7 = c1728p4.m8655b(list.get(2));
            if (m8655b5 != InterfaceC1739q.f7165b && m8655b5 != InterfaceC1739q.f7166c) {
                if ((m8655b5 instanceof C1560f) && (m8655b6 instanceof C1611i)) {
                    ((C1560f) m8655b5).m8128A(m8655b6.mo8131d().intValue(), m8655b7);
                } else if (m8655b5 instanceof InterfaceC1675m) {
                    ((InterfaceC1675m) m8655b5).mo8137o(m8655b6.mo8132e(), m8655b7);
                }
                return m8655b7;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", m8655b6.mo8132e(), m8655b5.mo8132e()));
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new C1560f();
            }
            C1560f c1560f = new C1560f();
            Iterator<InterfaceC1739q> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC1739q m8655b8 = c1728p4.m8655b(it.next());
                if (!(m8655b8 instanceof C1594h)) {
                    c1560f.m8128A(i10, m8655b8);
                    i10++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return c1560f;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C1691n();
            }
            if (list.size() % 2 == 0) {
                C1691n c1691n = new C1691n();
                while (i10 < list.size() - 1) {
                    InterfaceC1739q m8655b9 = c1728p4.m8655b(list.get(i10));
                    InterfaceC1739q m8655b10 = c1728p4.m8655b(list.get(i10 + 1));
                    if (!(m8655b9 instanceof C1594h) && !(m8655b10 instanceof C1594h)) {
                        c1691n.mo8137o(m8655b9.mo8132e(), m8655b10);
                        i10 += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c1691n;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    C1745q5.m8722h(EnumC1692n0.TYPEOF.name(), 1, list);
                    InterfaceC1739q m8655b11 = c1728p4.m8655b(list.get(0));
                    if (m8655b11 instanceof C1819v) {
                        str2 = "undefined";
                    } else if (m8655b11 instanceof C1577g) {
                        str2 = "boolean";
                    } else if (m8655b11 instanceof C1611i) {
                        str2 = "number";
                    } else if (m8655b11 instanceof C1803u) {
                        str2 = "string";
                    } else if (m8655b11 instanceof C1723p) {
                        str2 = "function";
                    } else {
                        if ((m8655b11 instanceof C1755r) || (m8655b11 instanceof C1594h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m8655b11));
                        }
                        str2 = "object";
                    }
                    return new C1803u(str2);
                case 63:
                    C1745q5.m8722h(EnumC1692n0.UNDEFINED.name(), 0, list);
                    return InterfaceC1739q.f7165b;
                case 64:
                    C1745q5.m8723i(EnumC1692n0.VAR.name(), 1, list);
                    Iterator<InterfaceC1739q> it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1739q m8655b12 = c1728p4.m8655b(it2.next());
                        if (m8655b12 instanceof C1803u) {
                            c1728p4.m8658e(m8655b12.mo8132e(), InterfaceC1739q.f7165b);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m8655b12.getClass().getCanonicalName()));
                        }
                    }
                    return InterfaceC1739q.f7165b;
                default:
                    return super.m8953b(str);
            }
        }
        C1745q5.m8722h(EnumC1692n0.GET_PROPERTY.name(), 2, list);
        InterfaceC1739q m8655b13 = c1728p4.m8655b(list.get(0));
        InterfaceC1739q m8655b14 = c1728p4.m8655b(list.get(1));
        if ((m8655b13 instanceof C1560f) && C1745q5.m8725k(m8655b14)) {
            return ((C1560f) m8655b13).m8141s(m8655b14.mo8131d().intValue());
        }
        if (m8655b13 instanceof InterfaceC1675m) {
            return ((InterfaceC1675m) m8655b13).mo8135l(m8655b14.mo8132e());
        }
        if (m8655b13 instanceof C1803u) {
            if ("length".equals(m8655b14.mo8132e())) {
                return new C1611i(Double.valueOf(m8655b13.mo8132e().length()));
            }
            if (C1745q5.m8725k(m8655b14) && m8655b14.mo8131d().doubleValue() < m8655b13.mo8132e().length()) {
                return new C1803u(String.valueOf(m8655b13.mo8132e().charAt(m8655b14.mo8131d().intValue())));
            }
        }
        return InterfaceC1739q.f7165b;
    }
}
