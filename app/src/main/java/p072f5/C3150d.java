package p072f5;

import java.util.Iterator;
import p059e5.C3071c;

/* renamed from: f5.d */
/* loaded from: classes.dex */
public final class C3150d {
    /* renamed from: a */
    public static boolean m13843a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C3071c.m13540a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
