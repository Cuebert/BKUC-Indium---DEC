package ua;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3844i;
import p253ta.C4750g;

/* renamed from: ua.d0 */
/* loaded from: classes.dex */
public class C4880d0 extends C4878c0 {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m19104d() {
        C4906x c4906x = C4906x.f18779n;
        C3844i.m16251d(c4906x, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c4906x;
    }

    /* renamed from: e */
    public static <K, V> LinkedHashMap<K, V> m19105e(C4750g<? extends K, ? extends V>... pairs) {
        int m19088a;
        C3844i.m16253f(pairs, "pairs");
        m19088a = C4878c0.m19088a(pairs.length);
        return (LinkedHashMap) m19111k(pairs, new LinkedHashMap(m19088a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final <K, V> Map<K, V> m19106f(Map<K, ? extends V> map) {
        C3844i.m16253f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : C4878c0.m19090c(map);
        }
        return m19104d();
    }

    /* renamed from: g */
    public static final <K, V> void m19107g(Map<? super K, ? super V> map, Iterable<? extends C4750g<? extends K, ? extends V>> pairs) {
        C3844i.m16253f(map, "<this>");
        C3844i.m16253f(pairs, "pairs");
        for (C4750g<? extends K, ? extends V> c4750g : pairs) {
            map.put(c4750g.m18900a(), c4750g.m18901b());
        }
    }

    /* renamed from: h */
    public static final <K, V> void m19108h(Map<? super K, ? super V> map, C4750g<? extends K, ? extends V>[] pairs) {
        C3844i.m16253f(map, "<this>");
        C3844i.m16253f(pairs, "pairs");
        for (C4750g<? extends K, ? extends V> c4750g : pairs) {
            map.put(c4750g.m18900a(), c4750g.m18901b());
        }
    }

    /* renamed from: i */
    public static <K, V> Map<K, V> m19109i(Iterable<? extends C4750g<? extends K, ? extends V>> iterable) {
        int m19088a;
        C3844i.m16253f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return m19104d();
            }
            if (size == 1) {
                return C4878c0.m19089b(iterable instanceof List ? (C4750g<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            m19088a = C4878c0.m19088a(collection.size());
            return m19110j(iterable, new LinkedHashMap(m19088a));
        }
        return m19106f(m19110j(iterable, new LinkedHashMap()));
    }

    /* renamed from: j */
    public static final <K, V, M extends Map<? super K, ? super V>> M m19110j(Iterable<? extends C4750g<? extends K, ? extends V>> iterable, M destination) {
        C3844i.m16253f(iterable, "<this>");
        C3844i.m16253f(destination, "destination");
        m19107g(destination, iterable);
        return destination;
    }

    /* renamed from: k */
    public static final <K, V, M extends Map<? super K, ? super V>> M m19111k(C4750g<? extends K, ? extends V>[] c4750gArr, M destination) {
        C3844i.m16253f(c4750gArr, "<this>");
        C3844i.m16253f(destination, "destination");
        m19108h(destination, c4750gArr);
        return destination;
    }
}
