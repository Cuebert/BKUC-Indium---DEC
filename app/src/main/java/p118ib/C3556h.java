package p118ib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3844i;
import ua.C4895m;

/* renamed from: ib.h */
/* loaded from: classes.dex */
public class C3556h extends C3555g {
    /* renamed from: c */
    public static final <T, C extends Collection<? super T>> C m15365c(InterfaceC3550b<? extends T> interfaceC3550b, C destination) {
        C3844i.m16253f(interfaceC3550b, "<this>");
        C3844i.m16253f(destination, "destination");
        Iterator<? extends T> it = interfaceC3550b.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: d */
    public static <T> List<T> m15366d(InterfaceC3550b<? extends T> interfaceC3550b) {
        List<T> m19142e;
        C3844i.m16253f(interfaceC3550b, "<this>");
        m19142e = C4895m.m19142e(m15367e(interfaceC3550b));
        return m19142e;
    }

    /* renamed from: e */
    public static final <T> List<T> m15367e(InterfaceC3550b<? extends T> interfaceC3550b) {
        C3844i.m16253f(interfaceC3550b, "<this>");
        return (List) m15365c(interfaceC3550b, new ArrayList());
    }
}
