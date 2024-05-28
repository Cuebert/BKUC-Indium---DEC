package p246t3;

import java.util.Iterator;
import java.util.Set;

/* renamed from: t3.x0 */
/* loaded from: classes.dex */
public final class C4720x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m18859a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
