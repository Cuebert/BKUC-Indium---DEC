package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.p0 */
/* loaded from: classes.dex */
public final class C2005p0 {

    /* renamed from: b */
    private static volatile C2005p0 f7761b;

    /* renamed from: c */
    static final C2005p0 f7762c = new C2005p0(true);

    /* renamed from: a */
    private final Map f7763a;

    C2005p0() {
        this.f7763a = new HashMap();
    }

    /* renamed from: a */
    public static C2005p0 m9537a() {
        C2005p0 c2005p0 = f7761b;
        if (c2005p0 != null) {
            return c2005p0;
        }
        synchronized (C2005p0.class) {
            C2005p0 c2005p02 = f7761b;
            if (c2005p02 != null) {
                return c2005p02;
            }
            C2005p0 m9678b = AbstractC2061x0.m9678b(C2005p0.class);
            f7761b = m9678b;
            return m9678b;
        }
    }

    /* renamed from: b */
    public final C1908b1 m9538b(InterfaceC1944g2 interfaceC1944g2, int i10) {
        return (C1908b1) this.f7763a.get(new C1998o0(interfaceC1944g2, i10));
    }

    C2005p0(boolean z10) {
        this.f7763a = Collections.emptyMap();
    }
}
