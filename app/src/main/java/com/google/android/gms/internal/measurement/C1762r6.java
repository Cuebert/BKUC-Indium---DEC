package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r6 */
/* loaded from: classes.dex */
public final class C1762r6 {
    /* renamed from: a */
    public static InterfaceC1739q m8764a(C1633j5 c1633j5) {
        if (c1633j5 == null) {
            return InterfaceC1739q.f7165b;
        }
        int m8325F = c1633j5.m8325F() - 1;
        if (m8325F == 1) {
            if (c1633j5.m8324E()) {
                return new C1803u(c1633j5.m8328z());
            }
            return InterfaceC1739q.f7172i;
        }
        if (m8325F == 2) {
            if (c1633j5.m8323D()) {
                return new C1611i(Double.valueOf(c1633j5.m8326w()));
            }
            return new C1611i(null);
        }
        if (m8325F == 3) {
            if (c1633j5.m8322C()) {
                return new C1577g(Boolean.valueOf(c1633j5.m8321B()));
            }
            return new C1577g(null);
        }
        if (m8325F == 4) {
            List<C1633j5> m8320A = c1633j5.m8320A();
            ArrayList arrayList = new ArrayList();
            Iterator<C1633j5> it = m8320A.iterator();
            while (it.hasNext()) {
                arrayList.add(m8764a(it.next()));
            }
            return new C1755r(c1633j5.m8327y(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    /* renamed from: b */
    public static InterfaceC1739q m8765b(Object obj) {
        if (obj == null) {
            return InterfaceC1739q.f7166c;
        }
        if (obj instanceof String) {
            return new C1803u((String) obj);
        }
        if (obj instanceof Double) {
            return new C1611i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1611i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1611i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1577g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C1691n c1691n = new C1691n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC1739q m8765b = m8765b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c1691n.mo8137o((String) obj2, m8765b);
                }
            }
            return c1691n;
        }
        if (obj instanceof List) {
            C1560f c1560f = new C1560f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1560f.m8128A(c1560f.m8140r(), m8765b(it.next()));
            }
            return c1560f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
