package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ha */
/* loaded from: classes.dex */
public final class C1605ha {

    /* renamed from: a */
    private static final Class<?> f6827a;

    /* renamed from: b */
    private static final AbstractC1814ua<?, ?> f6828b;

    /* renamed from: c */
    private static final AbstractC1814ua<?, ?> f6829c;

    /* renamed from: d */
    private static final AbstractC1814ua<?, ?> f6830d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f6827a = cls;
        f6828b = m8239C(false);
        f6829c = m8239C(true);
        f6830d = new C1846wa();
    }

    /* renamed from: A */
    public static int m8237A(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1859x7.m8996a(i10 << 3) + 1);
    }

    /* renamed from: B */
    public static void m8238B(int i10, List<Long> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9091k(i10, list, z10);
    }

    /* renamed from: C */
    private static AbstractC1814ua<?, ?> m8239C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC1814ua) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m8240D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m8241E(int i10, List<AbstractC1731p7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8995D = size * AbstractC1859x7.m8995D(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m8995D += AbstractC1859x7.m9000x(list.get(i11));
        }
        return m8995D;
    }

    /* renamed from: F */
    public static int m8242F(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8243G(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: G */
    public static int m8243G(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1748q8) {
            C1748q8 c1748q8 = (C1748q8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m9002z(c1748q8.m8732e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m9002z(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: H */
    public static int m8244H(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1859x7.m8996a(i10 << 3) + 4);
    }

    /* renamed from: I */
    public static int m8245I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m8246J(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1859x7.m8996a(i10 << 3) + 8);
    }

    /* renamed from: K */
    public static int m8247K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m8248L(int i10, List<InterfaceC1813u9> list, InterfaceC1571fa interfaceC1571fa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC1859x7.m9001y(i10, list.get(i12), interfaceC1571fa);
        }
        return i11;
    }

    /* renamed from: M */
    public static int m8249M(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8250N(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: N */
    public static int m8250N(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1748q8) {
            C1748q8 c1748q8 = (C1748q8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m9002z(c1748q8.m8732e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m9002z(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: O */
    public static int m8251O(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return m8252P(list) + (list.size() * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: P */
    public static int m8252P(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1621i9) {
            C1621i9 c1621i9 = (C1621i9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8997b(c1621i9.mo8306f(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8997b(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: Q */
    public static int m8253Q(int i10, Object obj, InterfaceC1571fa interfaceC1571fa) {
        if (obj instanceof C1502b9) {
            int m8996a = AbstractC1859x7.m8996a(i10 << 3);
            int m7953a = ((C1502b9) obj).m7953a();
            return m8996a + AbstractC1859x7.m8996a(m7953a) + m7953a;
        }
        return AbstractC1859x7.m8996a(i10 << 3) + AbstractC1859x7.m8993B((InterfaceC1813u9) obj, interfaceC1571fa);
    }

    /* renamed from: R */
    public static int m8254R(int i10, List<?> list, InterfaceC1571fa interfaceC1571fa) {
        int m8993B;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8995D = AbstractC1859x7.m8995D(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C1502b9) {
                m8993B = AbstractC1859x7.m8992A((C1502b9) obj);
            } else {
                m8993B = AbstractC1859x7.m8993B((InterfaceC1813u9) obj, interfaceC1571fa);
            }
            m8995D += m8993B;
        }
        return m8995D;
    }

    /* renamed from: S */
    public static int m8255S(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8256T(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: T */
    public static int m8256T(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1748q8) {
            C1748q8 c1748q8 = (C1748q8) list;
            i10 = 0;
            while (i11 < size) {
                int m8732e = c1748q8.m8732e(i11);
                i10 += AbstractC1859x7.m8996a((m8732e >> 31) ^ (m8732e + m8732e));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += AbstractC1859x7.m8996a((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: U */
    public static int m8257U(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8258V(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: V */
    public static int m8258V(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1621i9) {
            C1621i9 c1621i9 = (C1621i9) list;
            i10 = 0;
            while (i11 < size) {
                long mo8306f = c1621i9.mo8306f(i11);
                i10 += AbstractC1859x7.m8997b((mo8306f >> 63) ^ (mo8306f + mo8306f));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += AbstractC1859x7.m8997b((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: W */
    public static int m8259W(int i10, List<?> list) {
        int m8994C;
        int m8994C2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m8995D = AbstractC1859x7.m8995D(i10) * size;
        if (list instanceof InterfaceC1536d9) {
            InterfaceC1536d9 interfaceC1536d9 = (InterfaceC1536d9) list;
            while (i11 < size) {
                Object mo8009h = interfaceC1536d9.mo8009h(i11);
                if (mo8009h instanceof AbstractC1731p7) {
                    m8994C2 = AbstractC1859x7.m9000x((AbstractC1731p7) mo8009h);
                } else {
                    m8994C2 = AbstractC1859x7.m8994C((String) mo8009h);
                }
                m8995D += m8994C2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC1731p7) {
                    m8994C = AbstractC1859x7.m9000x((AbstractC1731p7) obj);
                } else {
                    m8994C = AbstractC1859x7.m8994C((String) obj);
                }
                m8995D += m8994C;
                i11++;
            }
        }
        return m8995D;
    }

    /* renamed from: X */
    public static int m8260X(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8261Y(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: Y */
    public static int m8261Y(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1748q8) {
            C1748q8 c1748q8 = (C1748q8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8996a(c1748q8.m8732e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8996a(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: Z */
    public static int m8262Z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8264a0(list) + (size * AbstractC1859x7.m8995D(i10));
    }

    /* renamed from: a */
    public static AbstractC1814ua<?, ?> m8263a() {
        return f6829c;
    }

    /* renamed from: a0 */
    public static int m8264a0(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1621i9) {
            C1621i9 c1621i9 = (C1621i9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8997b(c1621i9.mo8306f(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1859x7.m8997b(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: b */
    public static AbstractC1814ua<?, ?> m8265b() {
        return f6830d;
    }

    /* renamed from: b0 */
    public static AbstractC1814ua<?, ?> m8266b0() {
        return f6828b;
    }

    /* renamed from: c */
    public static <UT, UB> UB m8267c(int i10, List<Integer> list, InterfaceC1796t8 interfaceC1796t8, UB ub2, AbstractC1814ua<UT, UB> abstractC1814ua) {
        if (interfaceC1796t8 == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (interfaceC1796t8.mo7980f(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m8268d(i10, intValue, ub2, abstractC1814ua);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub2;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC1796t8.mo7980f(intValue2)) {
                    ub2 = (UB) m8268d(i10, intValue2, ub2, abstractC1814ua);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    /* renamed from: d */
    static <UT, UB> UB m8268d(int i10, int i11, UB ub2, AbstractC1814ua<UT, UB> abstractC1814ua) {
        if (ub2 == null) {
            ub2 = abstractC1814ua.mo8869e();
        }
        abstractC1814ua.mo8870f(ub2, i10, i11);
        return ub2;
    }

    /* renamed from: e */
    public static <T, FT extends InterfaceC1586g8<FT>> void m8269e(AbstractC1535d8<FT> abstractC1535d8, T t10, T t11) {
        abstractC1535d8.mo8054a(t11);
        throw null;
    }

    /* renamed from: f */
    public static <T, UT, UB> void m8270f(AbstractC1814ua<UT, UB> abstractC1814ua, T t10, T t11) {
        abstractC1814ua.mo8872h(t10, abstractC1814ua.mo8868d(abstractC1814ua.mo8867c(t10), abstractC1814ua.mo8867c(t11)));
    }

    /* renamed from: g */
    public static void m8271g(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC1732p8.class.isAssignableFrom(cls) && (cls2 = f6827a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m8272h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    public static <T> void m8273i(C1717o9 c1717o9, T t10, T t11, long j10) {
        C1555eb.m8123x(t10, j10, C1717o9.m8641b(C1555eb.m8110k(t10, j10), C1555eb.m8110k(t11, j10)));
    }

    /* renamed from: j */
    public static void m8274j(int i10, List<Boolean> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9093n(i10, list, z10);
    }

    /* renamed from: k */
    public static void m8275k(int i10, List<AbstractC1731p7> list, C1875y7 c1875y7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9095p(i10, list);
    }

    /* renamed from: l */
    public static void m8276l(int i10, List<Double> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9097r(i10, list, z10);
    }

    /* renamed from: m */
    public static void m8277m(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9100u(i10, list, z10);
    }

    /* renamed from: n */
    public static void m8278n(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9102w(i10, list, z10);
    }

    /* renamed from: o */
    public static void m8279o(int i10, List<Long> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9104y(i10, list, z10);
    }

    /* renamed from: p */
    public static void m8280p(int i10, List<Float> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9070A(i10, list, z10);
    }

    /* renamed from: q */
    public static void m8281q(int i10, List<?> list, C1875y7 c1875y7, InterfaceC1571fa interfaceC1571fa) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1875y7.m9071B(i10, list.get(i11), interfaceC1571fa);
        }
    }

    /* renamed from: r */
    public static void m8282r(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9073D(i10, list, z10);
    }

    /* renamed from: s */
    public static void m8283s(int i10, List<Long> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9075F(i10, list, z10);
    }

    /* renamed from: t */
    public static void m8284t(int i10, List<?> list, C1875y7 c1875y7, InterfaceC1571fa interfaceC1571fa) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1875y7.m9076G(i10, list.get(i11), interfaceC1571fa);
        }
    }

    /* renamed from: u */
    public static void m8285u(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9078I(i10, list, z10);
    }

    /* renamed from: v */
    public static void m8286v(int i10, List<Long> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9080K(i10, list, z10);
    }

    /* renamed from: w */
    public static void m8287w(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9082b(i10, list, z10);
    }

    /* renamed from: x */
    public static void m8288x(int i10, List<Long> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9084d(i10, list, z10);
    }

    /* renamed from: y */
    public static void m8289y(int i10, List<String> list, C1875y7 c1875y7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9087g(i10, list);
    }

    /* renamed from: z */
    public static void m8290z(int i10, List<Integer> list, C1875y7 c1875y7, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1875y7.m9089i(i10, list, z10);
    }
}
