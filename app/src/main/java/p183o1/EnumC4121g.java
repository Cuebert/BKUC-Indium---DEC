package p183o1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o1.g */
/* loaded from: classes.dex */
public enum EnumC4121g {
    ALL,
    ANY;

    /* renamed from: b */
    public boolean m17120b(Collection<String> collection, Set<String> set) {
        if (this == ANY) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Iterator<String> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean m17121c(String[] strArr, Set<String> set) {
        if (this == ANY) {
            for (String str : strArr) {
                if (set.contains(str)) {
                    return true;
                }
            }
            return false;
        }
        for (String str2 : strArr) {
            if (!set.contains(str2)) {
                return false;
            }
        }
        return true;
    }
}
