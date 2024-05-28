package ua;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C3844i;
import p253ta.C4750g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.c0 */
/* loaded from: classes.dex */
public class C4878c0 extends C4876b0 {
    /* renamed from: a */
    public static int m19088a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m19089b(C4750g<? extends K, ? extends V> pair) {
        C3844i.m16253f(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.m18902c(), pair.m18903d());
        C3844i.m16252e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m19090c(Map<? extends K, ? extends V> map) {
        C3844i.m16253f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C3844i.m16252e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
