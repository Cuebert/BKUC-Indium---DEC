package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
/* loaded from: classes.dex */
public final class C1745q5 {
    /* renamed from: a */
    public static double m8715a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    /* renamed from: b */
    public static int m8716b(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    /* renamed from: c */
    public static int m8717c(C1728p4 c1728p4) {
        int m8716b = m8716b(c1728p4.m8657d("runtime.counter").mo8131d().doubleValue() + 1.0d);
        if (m8716b <= 1000000) {
            c1728p4.m8660g("runtime.counter", new C1611i(Double.valueOf(m8716b)));
            return m8716b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m8718d(double d10) {
        return m8716b(d10) & 4294967295L;
    }

    /* renamed from: e */
    public static EnumC1692n0 m8719e(String str) {
        EnumC1692n0 enumC1692n0 = null;
        if (str != null && !str.isEmpty()) {
            enumC1692n0 = EnumC1692n0.m8484b(Integer.parseInt(str));
        }
        if (enumC1692n0 != null) {
            return enumC1692n0;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m8720f(InterfaceC1739q interfaceC1739q) {
        if (InterfaceC1739q.f7166c.equals(interfaceC1739q)) {
            return null;
        }
        if (InterfaceC1739q.f7165b.equals(interfaceC1739q)) {
            return BuildConfig.FLAVOR;
        }
        if (interfaceC1739q instanceof C1691n) {
            return m8721g((C1691n) interfaceC1739q);
        }
        if (interfaceC1739q instanceof C1560f) {
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC1739q> it = ((C1560f) interfaceC1739q).iterator();
            while (it.hasNext()) {
                Object m8720f = m8720f(it.next());
                if (m8720f != null) {
                    arrayList.add(m8720f);
                }
            }
            return arrayList;
        }
        if (!interfaceC1739q.mo8131d().isNaN()) {
            return interfaceC1739q.mo8131d();
        }
        return interfaceC1739q.mo8132e();
    }

    /* renamed from: g */
    public static Map<String, Object> m8721g(C1691n c1691n) {
        HashMap hashMap = new HashMap();
        for (String str : c1691n.m8483a()) {
            Object m8720f = m8720f(c1691n.mo8135l(str));
            if (m8720f != null) {
                hashMap.put(str, m8720f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m8722h(String str, int i10, List<InterfaceC1739q> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m8723i(String str, int i10, List<InterfaceC1739q> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m8724j(String str, int i10, List<InterfaceC1739q> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m8725k(InterfaceC1739q interfaceC1739q) {
        if (interfaceC1739q == null) {
            return false;
        }
        Double mo8131d = interfaceC1739q.mo8131d();
        return !mo8131d.isNaN() && mo8131d.doubleValue() >= 0.0d && mo8131d.equals(Double.valueOf(Math.floor(mo8131d.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m8726l(InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        if (!interfaceC1739q.getClass().equals(interfaceC1739q2.getClass())) {
            return false;
        }
        if ((interfaceC1739q instanceof C1819v) || (interfaceC1739q instanceof C1707o)) {
            return true;
        }
        if (interfaceC1739q instanceof C1611i) {
            if (Double.isNaN(interfaceC1739q.mo8131d().doubleValue()) || Double.isNaN(interfaceC1739q2.mo8131d().doubleValue())) {
                return false;
            }
            return interfaceC1739q.mo8131d().equals(interfaceC1739q2.mo8131d());
        }
        if (interfaceC1739q instanceof C1803u) {
            return interfaceC1739q.mo8132e().equals(interfaceC1739q2.mo8132e());
        }
        if (interfaceC1739q instanceof C1577g) {
            return interfaceC1739q.mo8136m().equals(interfaceC1739q2.mo8136m());
        }
        return interfaceC1739q == interfaceC1739q2;
    }
}
