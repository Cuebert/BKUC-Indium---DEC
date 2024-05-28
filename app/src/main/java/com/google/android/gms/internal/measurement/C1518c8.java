package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* loaded from: classes.dex */
public final class C1518c8 {

    /* renamed from: b */
    private static volatile C1518c8 f6726b;

    /* renamed from: c */
    private static volatile C1518c8 f6727c;

    /* renamed from: d */
    static final C1518c8 f6728d = new C1518c8(true);

    /* renamed from: a */
    private final Map<C1501b8, C1716o8<?, ?>> f6729a;

    C1518c8() {
        this.f6729a = new HashMap();
    }

    /* renamed from: a */
    public static C1518c8 m8001a() {
        C1518c8 c1518c8 = f6726b;
        if (c1518c8 == null) {
            synchronized (C1518c8.class) {
                c1518c8 = f6726b;
                if (c1518c8 == null) {
                    c1518c8 = f6728d;
                    f6726b = c1518c8;
                }
            }
        }
        return c1518c8;
    }

    /* renamed from: b */
    public static C1518c8 m8002b() {
        C1518c8 c1518c8 = f6727c;
        if (c1518c8 != null) {
            return c1518c8;
        }
        synchronized (C1518c8.class) {
            C1518c8 c1518c82 = f6727c;
            if (c1518c82 != null) {
                return c1518c82;
            }
            C1518c8 m8354b = AbstractC1652k8.m8354b(C1518c8.class);
            f6727c = m8354b;
            return m8354b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends InterfaceC1813u9> C1716o8<ContainingType, ?> m8003c(ContainingType containingtype, int i10) {
        return (C1716o8) this.f6729a.get(new C1501b8(containingtype, i10));
    }

    C1518c8(boolean z10) {
        this.f6729a = Collections.emptyMap();
    }
}
