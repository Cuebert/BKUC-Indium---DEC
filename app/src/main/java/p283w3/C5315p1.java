package p283w3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: w3.p1 */
/* loaded from: classes.dex */
public final class C5315p1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19888a(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof InterfaceC5276m1) {
            collection = ((InterfaceC5276m1) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator<?> it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return m19889b(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m19889b(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
