package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.h */
/* loaded from: classes.dex */
public final class C1948h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m9357a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
