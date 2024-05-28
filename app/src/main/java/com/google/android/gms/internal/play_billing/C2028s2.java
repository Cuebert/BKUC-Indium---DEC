package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.s2 */
/* loaded from: classes.dex */
public final class C2028s2 {

    /* renamed from: a */
    private static final Class f7785a;

    /* renamed from: b */
    private static final AbstractC1959i3 f7786b;

    /* renamed from: c */
    private static final AbstractC1959i3 f7787c;

    /* renamed from: d */
    public static final /* synthetic */ int f7788d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC1959i3 abstractC1959i3 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7785a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC1959i3 = (AbstractC1959i3) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f7786b = abstractC1959i3;
        f7787c = new C1973k3();
    }

    /* renamed from: A */
    public static int m9564A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1970k0.m9481y(i10 << 3) + 4);
    }

    /* renamed from: B */
    public static int m9565B(List list) {
        return list.size() * 4;
    }

    /* renamed from: C */
    public static int m9566C(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1970k0.m9481y(i10 << 3) + 8);
    }

    /* renamed from: D */
    public static int m9567D(List list) {
        return list.size() * 8;
    }

    /* renamed from: E */
    public static int m9568E(int i10, List list, InterfaceC2014q2 interfaceC2014q2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC1970k0.m9477u(i10, (InterfaceC1944g2) list.get(i12), interfaceC2014q2);
        }
        return i11;
    }

    /* renamed from: F */
    public static int m9569F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9570G(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: G */
    public static int m9570G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1929e1) {
            C1929e1 c1929e1 = (C1929e1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9478v(c1929e1.m9323e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9478v(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: H */
    public static int m9571H(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return m9572I(list) + (list.size() * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: I */
    public static int m9572I(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2041u1) {
            C2041u1 c2041u1 = (C2041u1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9482z(c2041u1.m9661e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9482z(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: J */
    public static int m9573J(int i10, Object obj, InterfaceC2014q2 interfaceC2014q2) {
        if (obj instanceof C1978l1) {
            int i11 = AbstractC1970k0.f7708d;
            int m9490a = ((C1978l1) obj).m9490a();
            return AbstractC1970k0.m9481y(i10 << 3) + AbstractC1970k0.m9481y(m9490a) + m9490a;
        }
        return AbstractC1970k0.m9481y(i10 << 3) + AbstractC1970k0.m9479w((InterfaceC1944g2) obj, interfaceC2014q2);
    }

    /* renamed from: K */
    public static int m9574K(int i10, List list, InterfaceC2014q2 interfaceC2014q2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9481y = AbstractC1970k0.m9481y(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C1978l1) {
                int m9490a = ((C1978l1) obj).m9490a();
                m9481y += AbstractC1970k0.m9481y(m9490a) + m9490a;
            } else {
                m9481y += AbstractC1970k0.m9479w((InterfaceC1944g2) obj, interfaceC2014q2);
            }
        }
        return m9481y;
    }

    /* renamed from: L */
    public static int m9575L(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9576M(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: M */
    public static int m9576M(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1929e1) {
            C1929e1 c1929e1 = (C1929e1) list;
            i10 = 0;
            while (i11 < size) {
                int m9323e = c1929e1.m9323e(i11);
                i10 += AbstractC1970k0.m9481y((m9323e >> 31) ^ (m9323e + m9323e));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC1970k0.m9481y((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: N */
    public static int m9577N(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9578O(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: O */
    public static int m9578O(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2041u1) {
            C2041u1 c2041u1 = (C2041u1) list;
            i10 = 0;
            while (i11 < size) {
                long m9661e = c2041u1.m9661e(i11);
                i10 += AbstractC1970k0.m9482z((m9661e >> 63) ^ (m9661e + m9661e));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += AbstractC1970k0.m9482z((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: P */
    public static int m9579P(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof InterfaceC1992n1;
        int m9481y = AbstractC1970k0.m9481y(i10 << 3) * size;
        if (z10) {
            InterfaceC1992n1 interfaceC1992n1 = (InterfaceC1992n1) list;
            while (i11 < size) {
                Object mo9507h = interfaceC1992n1.mo9507h(i11);
                if (mo9507h instanceof AbstractC1914c0) {
                    int mo9271i = ((AbstractC1914c0) mo9507h).mo9271i();
                    m9481y += AbstractC1970k0.m9481y(mo9271i) + mo9271i;
                } else {
                    m9481y += AbstractC1970k0.m9480x((String) mo9507h);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC1914c0) {
                    int mo9271i2 = ((AbstractC1914c0) obj).mo9271i();
                    m9481y += AbstractC1970k0.m9481y(mo9271i2) + mo9271i2;
                } else {
                    m9481y += AbstractC1970k0.m9480x((String) obj);
                }
                i11++;
            }
        }
        return m9481y;
    }

    /* renamed from: Q */
    public static int m9580Q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9581R(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: R */
    public static int m9581R(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1929e1) {
            C1929e1 c1929e1 = (C1929e1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9481y(c1929e1.m9323e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9481y(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: S */
    public static int m9582S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9583T(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: T */
    public static int m9583T(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2041u1) {
            C2041u1 c2041u1 = (C2041u1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9482z(c2041u1.m9661e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9482z(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: U */
    public static AbstractC1959i3 m9584U() {
        return f7786b;
    }

    /* renamed from: V */
    public static AbstractC1959i3 m9585V() {
        return f7787c;
    }

    /* renamed from: a */
    public static Object m9586a(Object obj, int i10, int i11, Object obj2, AbstractC1959i3 abstractC1959i3) {
        if (obj2 == null) {
            obj2 = abstractC1959i3.mo9392c(obj);
        }
        abstractC1959i3.mo9395f(obj2, i10, i11);
        return obj2;
    }

    /* renamed from: b */
    public static void m9587b(AbstractC1959i3 abstractC1959i3, Object obj, Object obj2) {
        abstractC1959i3.mo9397h(obj, abstractC1959i3.mo9394e(abstractC1959i3.mo9393d(obj), abstractC1959i3.mo9393d(obj2)));
    }

    /* renamed from: c */
    public static void m9588c(Class cls) {
        Class cls2;
        if (!AbstractC1922d1.class.isAssignableFrom(cls) && (cls2 = f7785a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: d */
    public static void m9589d(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9229s(i10, list, z10);
    }

    /* renamed from: e */
    public static void m9590e(int i10, List list, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9215e(i10, list);
    }

    /* renamed from: f */
    public static void m9591f(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9232v(i10, list, z10);
    }

    /* renamed from: g */
    public static void m9592g(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9207G(i10, list, z10);
    }

    /* renamed from: h */
    public static void m9593h(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9235y(i10, list, z10);
    }

    /* renamed from: i */
    public static void m9594i(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9216f(i10, list, z10);
    }

    /* renamed from: j */
    public static void m9595j(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9202B(i10, list, z10);
    }

    /* renamed from: k */
    public static void m9596k(int i10, List list, InterfaceC1904a4 interfaceC1904a4, InterfaceC2014q2 interfaceC2014q2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C1977l0) interfaceC1904a4).mo9221k(i10, list.get(i11), interfaceC2014q2);
        }
    }

    /* renamed from: l */
    public static void m9597l(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9203C(i10, list, z10);
    }

    /* renamed from: m */
    public static void m9598m(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9220j(i10, list, z10);
    }

    /* renamed from: n */
    public static void m9599n(int i10, List list, InterfaceC1904a4 interfaceC1904a4, InterfaceC2014q2 interfaceC2014q2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C1977l0) interfaceC1904a4).mo9225o(i10, list.get(i11), interfaceC2014q2);
        }
    }

    /* renamed from: o */
    public static void m9600o(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9231u(i10, list, z10);
    }

    /* renamed from: p */
    public static void m9601p(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9214d(i10, list, z10);
    }

    /* renamed from: q */
    public static void m9602q(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9219i(i10, list, z10);
    }

    /* renamed from: r */
    public static void m9603r(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9205E(i10, list, z10);
    }

    /* renamed from: s */
    public static void m9604s(int i10, List list, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9211a(i10, list);
    }

    /* renamed from: t */
    public static void m9605t(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9234x(i10, list, z10);
    }

    /* renamed from: u */
    public static void m9606u(int i10, List list, InterfaceC1904a4 interfaceC1904a4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1904a4.mo9224n(i10, list, z10);
    }

    /* renamed from: v */
    public static boolean m9607v(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: w */
    public static int m9608w(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1970k0.m9481y(i10 << 3) + 1);
    }

    /* renamed from: x */
    public static int m9609x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9481y = size * AbstractC1970k0.m9481y(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int mo9271i = ((AbstractC1914c0) list.get(i11)).mo9271i();
            m9481y += AbstractC1970k0.m9481y(mo9271i) + mo9271i;
        }
        return m9481y;
    }

    /* renamed from: y */
    public static int m9610y(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9611z(list) + (size * AbstractC1970k0.m9481y(i10 << 3));
    }

    /* renamed from: z */
    public static int m9611z(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1929e1) {
            C1929e1 c1929e1 = (C1929e1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9478v(c1929e1.m9323e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1970k0.m9478v(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }
}
