package ua;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C3844i;

/* renamed from: ua.r */
/* loaded from: classes.dex */
public class C4900r extends C4899q {
    /* renamed from: h */
    public static <T> boolean m19145h(Collection<? super T> collection, Iterable<? extends T> elements) {
        C3844i.m16253f(collection, "<this>");
        C3844i.m16253f(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z10 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
