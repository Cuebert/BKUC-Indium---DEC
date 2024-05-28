package ua;

import java.util.Set;
import kotlin.jvm.internal.C3844i;

/* renamed from: ua.i0 */
/* loaded from: classes.dex */
public class C4890i0 extends C4888h0 {
    /* renamed from: b */
    public static <T> Set<T> m19127b() {
        return C4907y.f18780n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> Set<T> m19128c(Set<? extends T> set) {
        Set<T> m19127b;
        C3844i.m16253f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : C4888h0.m19121a(set.iterator().next());
        }
        m19127b = m19127b();
        return m19127b;
    }

    /* renamed from: d */
    public static <T> Set<T> m19129d(T... elements) {
        Set<T> m19127b;
        C3844i.m16253f(elements, "elements");
        if (elements.length > 0) {
            return C4889i.m19126j(elements);
        }
        m19127b = m19127b();
        return m19127b;
    }
}
