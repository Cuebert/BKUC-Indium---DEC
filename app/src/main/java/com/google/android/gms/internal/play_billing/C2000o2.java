package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.play_billing.o2 */
/* loaded from: classes.dex */
public final class C2000o2 {

    /* renamed from: c */
    private static final C2000o2 f7757c = new C2000o2();

    /* renamed from: b */
    private final ConcurrentMap f7759b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC2021r2 f7758a = new C2062x1();

    private C2000o2() {
    }

    /* renamed from: a */
    public static C2000o2 m9515a() {
        return f7757c;
    }

    /* renamed from: b */
    public final InterfaceC2014q2 m9516b(Class cls) {
        C1950h1.m9379c(cls, "messageType");
        InterfaceC2014q2 interfaceC2014q2 = (InterfaceC2014q2) this.f7759b.get(cls);
        if (interfaceC2014q2 == null) {
            interfaceC2014q2 = this.f7758a.mo9557a(cls);
            C1950h1.m9379c(cls, "messageType");
            InterfaceC2014q2 interfaceC2014q22 = (InterfaceC2014q2) this.f7759b.putIfAbsent(cls, interfaceC2014q2);
            if (interfaceC2014q22 != null) {
                return interfaceC2014q22;
            }
        }
        return interfaceC2014q2;
    }
}
