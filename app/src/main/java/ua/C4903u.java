package ua;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.u */
/* loaded from: classes.dex */
public class C4903u extends C4902t {
    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m19146i(Iterable<? extends T> iterable, C destination) {
        C3844i.m16253f(iterable, "<this>");
        C3844i.m16253f(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: j */
    public static <T> List<T> m19147j(Iterable<? extends T> iterable) {
        List<T> m19142e;
        C3844i.m16253f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C4895m.m19139b();
            }
            if (size != 1) {
                return m19149l(collection);
            }
            return C4894l.m19138a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        m19142e = C4895m.m19142e(m19148k(iterable));
        return m19142e;
    }

    /* renamed from: k */
    public static final <T> List<T> m19148k(Iterable<? extends T> iterable) {
        C3844i.m16253f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m19149l((Collection) iterable);
        }
        return (List) m19146i(iterable, new ArrayList());
    }

    /* renamed from: l */
    public static final <T> List<T> m19149l(Collection<? extends T> collection) {
        C3844i.m16253f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: m */
    public static <T> Set<T> m19150m(Iterable<? extends T> iterable) {
        Set<T> m19127b;
        int m19088a;
        C3844i.m16253f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m19127b = C4890i0.m19127b();
                return m19127b;
            }
            if (size == 1) {
                return C4888h0.m19121a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            m19088a = C4878c0.m19088a(collection.size());
            return (Set) m19146i(iterable, new LinkedHashSet(m19088a));
        }
        return C4890i0.m19128c((Set) m19146i(iterable, new LinkedHashSet()));
    }
}
