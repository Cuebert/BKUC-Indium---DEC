package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes.dex */
public final class C1883z extends AbstractC1851x {
    public C1883z() {
        this.f7285a.add(EnumC1692n0.EQUALS);
        this.f7285a.add(EnumC1692n0.GREATER_THAN);
        this.f7285a.add(EnumC1692n0.GREATER_THAN_EQUALS);
        this.f7285a.add(EnumC1692n0.IDENTITY_EQUALS);
        this.f7285a.add(EnumC1692n0.IDENTITY_NOT_EQUALS);
        this.f7285a.add(EnumC1692n0.LESS_THAN);
        this.f7285a.add(EnumC1692n0.LESS_THAN_EQUALS);
        this.f7285a.add(EnumC1692n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m9113c(InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        if (interfaceC1739q.getClass().equals(interfaceC1739q2.getClass())) {
            if ((interfaceC1739q instanceof C1819v) || (interfaceC1739q instanceof C1707o)) {
                return true;
            }
            if (interfaceC1739q instanceof C1611i) {
                return (Double.isNaN(interfaceC1739q.mo8131d().doubleValue()) || Double.isNaN(interfaceC1739q2.mo8131d().doubleValue()) || interfaceC1739q.mo8131d().doubleValue() != interfaceC1739q2.mo8131d().doubleValue()) ? false : true;
            }
            if (interfaceC1739q instanceof C1803u) {
                return interfaceC1739q.mo8132e().equals(interfaceC1739q2.mo8132e());
            }
            if (interfaceC1739q instanceof C1577g) {
                return interfaceC1739q.mo8136m().equals(interfaceC1739q2.mo8136m());
            }
            return interfaceC1739q == interfaceC1739q2;
        }
        if (((interfaceC1739q instanceof C1819v) || (interfaceC1739q instanceof C1707o)) && ((interfaceC1739q2 instanceof C1819v) || (interfaceC1739q2 instanceof C1707o))) {
            return true;
        }
        boolean z10 = interfaceC1739q instanceof C1611i;
        if (z10 && (interfaceC1739q2 instanceof C1803u)) {
            return m9113c(interfaceC1739q, new C1611i(interfaceC1739q2.mo8131d()));
        }
        boolean z11 = interfaceC1739q instanceof C1803u;
        if (z11 && (interfaceC1739q2 instanceof C1611i)) {
            return m9113c(new C1611i(interfaceC1739q.mo8131d()), interfaceC1739q2);
        }
        if (interfaceC1739q instanceof C1577g) {
            return m9113c(new C1611i(interfaceC1739q.mo8131d()), interfaceC1739q2);
        }
        if (interfaceC1739q2 instanceof C1577g) {
            return m9113c(interfaceC1739q, new C1611i(interfaceC1739q2.mo8131d()));
        }
        if ((!z11 && !z10) || !(interfaceC1739q2 instanceof InterfaceC1675m)) {
            if ((interfaceC1739q instanceof InterfaceC1675m) && ((interfaceC1739q2 instanceof C1803u) || (interfaceC1739q2 instanceof C1611i))) {
                return m9113c(new C1803u(interfaceC1739q.mo8132e()), interfaceC1739q2);
            }
            return false;
        }
        return m9113c(interfaceC1739q, new C1803u(interfaceC1739q2.mo8132e()));
    }

    /* renamed from: d */
    private static boolean m9114d(InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        if (interfaceC1739q instanceof InterfaceC1675m) {
            interfaceC1739q = new C1803u(interfaceC1739q.mo8132e());
        }
        if (interfaceC1739q2 instanceof InterfaceC1675m) {
            interfaceC1739q2 = new C1803u(interfaceC1739q2.mo8132e());
        }
        if ((interfaceC1739q instanceof C1803u) && (interfaceC1739q2 instanceof C1803u)) {
            return interfaceC1739q.mo8132e().compareTo(interfaceC1739q2.mo8132e()) < 0;
        }
        double doubleValue = interfaceC1739q.mo8131d().doubleValue();
        double doubleValue2 = interfaceC1739q2.mo8131d().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: e */
    private static boolean m9115e(InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        if (interfaceC1739q instanceof InterfaceC1675m) {
            interfaceC1739q = new C1803u(interfaceC1739q.mo8132e());
        }
        if (interfaceC1739q2 instanceof InterfaceC1675m) {
            interfaceC1739q2 = new C1803u(interfaceC1739q2.mo8132e());
        }
        return (((interfaceC1739q instanceof C1803u) && (interfaceC1739q2 instanceof C1803u)) || !(Double.isNaN(interfaceC1739q.mo8131d().doubleValue()) || Double.isNaN(interfaceC1739q2.mo8131d().doubleValue()))) && !m9114d(interfaceC1739q2, interfaceC1739q);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        boolean m9113c;
        boolean m9113c2;
        C1745q5.m8722h(C1745q5.m8719e(str).name(), 2, list);
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(1));
        int ordinal = C1745q5.m8719e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                m9113c2 = m9113c(m8655b, m8655b2);
            } else if (ordinal == 42) {
                m9113c = m9114d(m8655b, m8655b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        m9113c = m9114d(m8655b2, m8655b);
                        break;
                    case 38:
                        m9113c = m9115e(m8655b2, m8655b);
                        break;
                    case 39:
                        m9113c = C1745q5.m8726l(m8655b, m8655b2);
                        break;
                    case 40:
                        m9113c2 = C1745q5.m8726l(m8655b, m8655b2);
                        break;
                    default:
                        return super.m8953b(str);
                }
            } else {
                m9113c = m9115e(m8655b, m8655b2);
            }
            m9113c = !m9113c2;
        } else {
            m9113c = m9113c(m8655b, m8655b2);
        }
        return m9113c ? InterfaceC1739q.f7170g : InterfaceC1739q.f7171h;
    }
}
