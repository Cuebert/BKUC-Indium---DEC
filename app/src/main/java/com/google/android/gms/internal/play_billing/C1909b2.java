package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.b2 */
/* loaded from: classes.dex */
public final class C1909b2 {
    /* renamed from: a */
    public static final int m9254a(int i10, Object obj, Object obj2) {
        C2074z1 c2074z1 = (C2074z1) obj;
        if (c2074z1.isEmpty()) {
            return 0;
        }
        Iterator it = c2074z1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m9255b(Object obj, Object obj2) {
        C2074z1 c2074z1 = (C2074z1) obj;
        C2074z1 c2074z12 = (C2074z1) obj2;
        if (!c2074z12.isEmpty()) {
            if (!c2074z1.m9705h()) {
                c2074z1 = c2074z1.m9702d();
            }
            c2074z1.m9704g(c2074z12);
        }
        return c2074z1;
    }
}
