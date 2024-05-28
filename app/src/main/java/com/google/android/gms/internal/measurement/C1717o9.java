package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o9 */
/* loaded from: classes.dex */
public final class C1717o9 {
    /* renamed from: a */
    public static final int m8640a(int i10, Object obj, Object obj2) {
        C1701n9 c1701n9 = (C1701n9) obj;
        if (c1701n9.isEmpty()) {
            return 0;
        }
        Iterator it = c1701n9.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m8641b(Object obj, Object obj2) {
        C1701n9 c1701n9 = (C1701n9) obj;
        C1701n9 c1701n92 = (C1701n9) obj2;
        if (!c1701n92.isEmpty()) {
            if (!c1701n9.m8624h()) {
                c1701n9 = c1701n9.m8621d();
            }
            c1701n9.m8623g(c1701n92);
        }
        return c1701n9;
    }
}
