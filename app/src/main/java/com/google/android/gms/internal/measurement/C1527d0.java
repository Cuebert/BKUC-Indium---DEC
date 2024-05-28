package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes.dex */
public final class C1527d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static InterfaceC1739q m8015a(String str, C1560f c1560f, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        String str2;
        char c10;
        String str3;
        double min;
        AbstractC1627j abstractC1627j;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                InterfaceC1739q mo8130c = c1560f.mo8130c();
                if (!list.isEmpty()) {
                    Iterator<InterfaceC1739q> it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC1739q m8655b = c1728p4.m8655b(it.next());
                        if (!(m8655b instanceof C1594h)) {
                            C1560f c1560f2 = (C1560f) mo8130c;
                            int m8140r = c1560f2.m8140r();
                            if (m8655b instanceof C1560f) {
                                C1560f c1560f3 = (C1560f) m8655b;
                                Iterator<Integer> m8143v = c1560f3.m8143v();
                                while (m8143v.hasNext()) {
                                    Integer next = m8143v.next();
                                    c1560f2.m8128A(next.intValue() + m8140r, c1560f3.m8141s(next.intValue()));
                                }
                            } else {
                                c1560f2.m8128A(m8140r, m8655b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return mo8130c;
            case 1:
                C1745q5.m8722h("every", 1, list);
                InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(0));
                if (m8655b2 instanceof C1723p) {
                    if (c1560f.m8140r() != 0 && m8016b(c1560f, c1728p4, (C1723p) m8655b2, Boolean.FALSE, Boolean.TRUE).m8140r() != c1560f.m8140r()) {
                        return InterfaceC1739q.f7171h;
                    }
                    return InterfaceC1739q.f7170g;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                C1745q5.m8722h("filter", 1, list);
                InterfaceC1739q m8655b3 = c1728p4.m8655b(list.get(0));
                if (m8655b3 instanceof C1723p) {
                    if (c1560f.m8139q() == 0) {
                        return new C1560f();
                    }
                    InterfaceC1739q mo8130c2 = c1560f.mo8130c();
                    C1560f m8016b = m8016b(c1560f, c1728p4, (C1723p) m8655b3, null, Boolean.TRUE);
                    C1560f c1560f4 = new C1560f();
                    Iterator<Integer> m8143v2 = m8016b.m8143v();
                    while (m8143v2.hasNext()) {
                        c1560f4.m8128A(c1560f4.m8140r(), ((C1560f) mo8130c2).m8141s(m8143v2.next().intValue()));
                    }
                    return c1560f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                C1745q5.m8722h("forEach", 1, list);
                InterfaceC1739q m8655b4 = c1728p4.m8655b(list.get(0));
                if (m8655b4 instanceof C1723p) {
                    if (c1560f.m8139q() == 0) {
                        return InterfaceC1739q.f7165b;
                    }
                    m8016b(c1560f, c1728p4, (C1723p) m8655b4, null, null);
                    return InterfaceC1739q.f7165b;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                C1745q5.m8724j("indexOf", 2, list);
                InterfaceC1739q interfaceC1739q = InterfaceC1739q.f7165b;
                if (!list.isEmpty()) {
                    interfaceC1739q = c1728p4.m8655b(list.get(0));
                }
                if (list.size() > 1) {
                    double m8715a = C1745q5.m8715a(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue());
                    if (m8715a >= c1560f.m8140r()) {
                        return new C1611i(Double.valueOf(-1.0d));
                    }
                    d10 = m8715a < 0.0d ? c1560f.m8140r() + m8715a : m8715a;
                }
                Iterator<Integer> m8143v3 = c1560f.m8143v();
                while (m8143v3.hasNext()) {
                    int intValue = m8143v3.next().intValue();
                    double d11 = intValue;
                    if (d11 >= d10 && C1745q5.m8726l(c1560f.m8141s(intValue), interfaceC1739q)) {
                        return new C1611i(Double.valueOf(d11));
                    }
                }
                return new C1611i(Double.valueOf(-1.0d));
            case 5:
                C1745q5.m8724j("join", 1, list);
                if (c1560f.m8140r() == 0) {
                    return InterfaceC1739q.f7172i;
                }
                if (list.size() > 0) {
                    InterfaceC1739q m8655b5 = c1728p4.m8655b(list.get(0));
                    str3 = ((m8655b5 instanceof C1707o) || (m8655b5 instanceof C1819v)) ? BuildConfig.FLAVOR : m8655b5.mo8132e();
                } else {
                    str3 = ",";
                }
                return new C1803u(c1560f.m8142u(str3));
            case 6:
                C1745q5.m8724j("lastIndexOf", 2, list);
                InterfaceC1739q interfaceC1739q2 = InterfaceC1739q.f7165b;
                if (!list.isEmpty()) {
                    interfaceC1739q2 = c1728p4.m8655b(list.get(0));
                }
                double m8140r2 = c1560f.m8140r() - 1;
                if (list.size() > 1) {
                    InterfaceC1739q m8655b6 = c1728p4.m8655b(list.get(1));
                    m8140r2 = Double.isNaN(m8655b6.mo8131d().doubleValue()) ? c1560f.m8140r() - 1 : C1745q5.m8715a(m8655b6.mo8131d().doubleValue());
                    if (m8140r2 < 0.0d) {
                        m8140r2 += c1560f.m8140r();
                    }
                }
                if (m8140r2 < 0.0d) {
                    return new C1611i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c1560f.m8140r(), m8140r2); min2 >= 0; min2--) {
                    if (c1560f.m8129B(min2) && C1745q5.m8726l(c1560f.m8141s(min2), interfaceC1739q2)) {
                        return new C1611i(Double.valueOf(min2));
                    }
                }
                return new C1611i(Double.valueOf(-1.0d));
            case 7:
                C1745q5.m8722h("map", 1, list);
                InterfaceC1739q m8655b7 = c1728p4.m8655b(list.get(0));
                if (m8655b7 instanceof C1723p) {
                    if (c1560f.m8140r() == 0) {
                        return new C1560f();
                    }
                    return m8016b(c1560f, c1728p4, (C1723p) m8655b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                C1745q5.m8722h("pop", 0, list);
                int m8140r3 = c1560f.m8140r();
                if (m8140r3 == 0) {
                    return InterfaceC1739q.f7165b;
                }
                int i10 = m8140r3 - 1;
                InterfaceC1739q m8141s = c1560f.m8141s(i10);
                c1560f.m8147z(i10);
                return m8141s;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator<InterfaceC1739q> it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1560f.m8128A(c1560f.m8140r(), c1728p4.m8655b(it2.next()));
                    }
                }
                return new C1611i(Double.valueOf(c1560f.m8140r()));
            case '\n':
                return m8017c(c1560f, c1728p4, list, true);
            case 11:
                return m8017c(c1560f, c1728p4, list, false);
            case '\f':
                C1745q5.m8722h("reverse", 0, list);
                int m8140r4 = c1560f.m8140r();
                if (m8140r4 != 0) {
                    for (int i11 = 0; i11 < m8140r4 / 2; i11++) {
                        if (c1560f.m8129B(i11)) {
                            InterfaceC1739q m8141s2 = c1560f.m8141s(i11);
                            c1560f.m8128A(i11, null);
                            int i12 = (m8140r4 - 1) - i11;
                            if (c1560f.m8129B(i12)) {
                                c1560f.m8128A(i11, c1560f.m8141s(i12));
                            }
                            c1560f.m8128A(i12, m8141s2);
                        }
                    }
                }
                return c1560f;
            case '\r':
                C1745q5.m8722h("shift", 0, list);
                if (c1560f.m8140r() == 0) {
                    return InterfaceC1739q.f7165b;
                }
                InterfaceC1739q m8141s3 = c1560f.m8141s(0);
                c1560f.m8147z(0);
                return m8141s3;
            case 14:
                C1745q5.m8724j("slice", 2, list);
                if (list.isEmpty()) {
                    return c1560f.mo8130c();
                }
                double m8140r5 = c1560f.m8140r();
                double m8715a2 = C1745q5.m8715a(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue());
                if (m8715a2 < 0.0d) {
                    min = Math.max(m8715a2 + m8140r5, 0.0d);
                } else {
                    min = Math.min(m8715a2, m8140r5);
                }
                if (list.size() == 2) {
                    double m8715a3 = C1745q5.m8715a(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue());
                    if (m8715a3 < 0.0d) {
                        m8140r5 = Math.max(m8140r5 + m8715a3, 0.0d);
                    } else {
                        m8140r5 = Math.min(m8140r5, m8715a3);
                    }
                }
                C1560f c1560f5 = new C1560f();
                for (int i13 = (int) min; i13 < m8140r5; i13++) {
                    c1560f5.m8128A(c1560f5.m8140r(), c1560f.m8141s(i13));
                }
                return c1560f5;
            case 15:
                C1745q5.m8722h("some", 1, list);
                InterfaceC1739q m8655b8 = c1728p4.m8655b(list.get(0));
                if (m8655b8 instanceof AbstractC1627j) {
                    if (c1560f.m8140r() == 0) {
                        return InterfaceC1739q.f7171h;
                    }
                    AbstractC1627j abstractC1627j2 = (AbstractC1627j) m8655b8;
                    Iterator<Integer> m8143v4 = c1560f.m8143v();
                    while (m8143v4.hasNext()) {
                        int intValue2 = m8143v4.next().intValue();
                        if (c1560f.m8129B(intValue2) && abstractC1627j2.mo7931a(c1728p4, Arrays.asList(c1560f.m8141s(intValue2), new C1611i(Double.valueOf(intValue2)), c1560f)).mo8136m().booleanValue()) {
                            return InterfaceC1739q.f7170g;
                        }
                    }
                    return InterfaceC1739q.f7171h;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                C1745q5.m8724j("sort", 1, list);
                if (c1560f.m8140r() >= 2) {
                    List<InterfaceC1739q> m8144w = c1560f.m8144w();
                    if (list.isEmpty()) {
                        abstractC1627j = null;
                    } else {
                        InterfaceC1739q m8655b9 = c1728p4.m8655b(list.get(0));
                        if (m8655b9 instanceof AbstractC1627j) {
                            abstractC1627j = (AbstractC1627j) m8655b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(m8144w, new C1510c0(abstractC1627j, c1728p4));
                    c1560f.m8145x();
                    Iterator<InterfaceC1739q> it3 = m8144w.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        c1560f.m8128A(i14, it3.next());
                        i14++;
                    }
                }
                return c1560f;
            case 17:
                if (list.isEmpty()) {
                    return new C1560f();
                }
                int m8715a4 = (int) C1745q5.m8715a(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue());
                if (m8715a4 < 0) {
                    m8715a4 = Math.max(0, m8715a4 + c1560f.m8140r());
                } else if (m8715a4 > c1560f.m8140r()) {
                    m8715a4 = c1560f.m8140r();
                }
                int m8140r6 = c1560f.m8140r();
                C1560f c1560f6 = new C1560f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) C1745q5.m8715a(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()));
                    if (max > 0) {
                        for (int i15 = m8715a4; i15 < Math.min(m8140r6, m8715a4 + max); i15++) {
                            c1560f6.m8128A(c1560f6.m8140r(), c1560f.m8141s(m8715a4));
                            c1560f.m8147z(m8715a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            InterfaceC1739q m8655b10 = c1728p4.m8655b(list.get(i16));
                            if (!(m8655b10 instanceof C1594h)) {
                                c1560f.m8146y((m8715a4 + i16) - 2, m8655b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m8715a4 < m8140r6) {
                        c1560f6.m8128A(c1560f6.m8140r(), c1560f.m8141s(m8715a4));
                        c1560f.m8128A(m8715a4, null);
                        m8715a4++;
                    }
                }
                return c1560f6;
            case 18:
                C1745q5.m8722h(str2, 0, list);
                return new C1803u(c1560f.m8142u(","));
            case 19:
                if (!list.isEmpty()) {
                    C1560f c1560f7 = new C1560f();
                    Iterator<InterfaceC1739q> it4 = list.iterator();
                    while (it4.hasNext()) {
                        InterfaceC1739q m8655b11 = c1728p4.m8655b(it4.next());
                        if (!(m8655b11 instanceof C1594h)) {
                            c1560f7.m8128A(c1560f7.m8140r(), m8655b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m8140r7 = c1560f7.m8140r();
                    Iterator<Integer> m8143v5 = c1560f.m8143v();
                    while (m8143v5.hasNext()) {
                        Integer next2 = m8143v5.next();
                        c1560f7.m8128A(next2.intValue() + m8140r7, c1560f.m8141s(next2.intValue()));
                    }
                    c1560f.m8145x();
                    Iterator<Integer> m8143v6 = c1560f7.m8143v();
                    while (m8143v6.hasNext()) {
                        Integer next3 = m8143v6.next();
                        c1560f.m8128A(next3.intValue(), c1560f7.m8141s(next3.intValue()));
                    }
                }
                return new C1611i(Double.valueOf(c1560f.m8140r()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    private static C1560f m8016b(C1560f c1560f, C1728p4 c1728p4, AbstractC1627j abstractC1627j, Boolean bool, Boolean bool2) {
        C1560f c1560f2 = new C1560f();
        Iterator<Integer> m8143v = c1560f.m8143v();
        while (m8143v.hasNext()) {
            int intValue = m8143v.next().intValue();
            if (c1560f.m8129B(intValue)) {
                InterfaceC1739q mo7931a = abstractC1627j.mo7931a(c1728p4, Arrays.asList(c1560f.m8141s(intValue), new C1611i(Double.valueOf(intValue)), c1560f));
                if (mo7931a.mo8136m().equals(bool)) {
                    return c1560f2;
                }
                if (bool2 == null || mo7931a.mo8136m().equals(bool2)) {
                    c1560f2.m8128A(intValue, mo7931a);
                }
            }
        }
        return c1560f2;
    }

    /* renamed from: c */
    private static InterfaceC1739q m8017c(C1560f c1560f, C1728p4 c1728p4, List<InterfaceC1739q> list, boolean z10) {
        InterfaceC1739q interfaceC1739q;
        C1745q5.m8723i("reduce", 1, list);
        C1745q5.m8724j("reduce", 2, list);
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
        if (m8655b instanceof AbstractC1627j) {
            if (list.size() == 2) {
                interfaceC1739q = c1728p4.m8655b(list.get(1));
                if (interfaceC1739q instanceof C1594h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else {
                if (c1560f.m8140r() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                interfaceC1739q = null;
            }
            AbstractC1627j abstractC1627j = (AbstractC1627j) m8655b;
            int m8140r = c1560f.m8140r();
            int i10 = z10 ? 0 : m8140r - 1;
            int i11 = z10 ? m8140r - 1 : 0;
            int i12 = true == z10 ? 1 : -1;
            if (interfaceC1739q == null) {
                interfaceC1739q = c1560f.m8141s(i10);
                i10 += i12;
            }
            while ((i11 - i10) * i12 >= 0) {
                if (c1560f.m8129B(i10)) {
                    interfaceC1739q = abstractC1627j.mo7931a(c1728p4, Arrays.asList(interfaceC1739q, c1560f.m8141s(i10), new C1611i(Double.valueOf(i10)), c1560f));
                    if (interfaceC1739q instanceof C1594h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i10 += i12;
                } else {
                    i10 += i12;
                }
            }
            return interfaceC1739q;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
