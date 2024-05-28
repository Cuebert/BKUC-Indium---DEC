package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* loaded from: classes.dex */
public final class C1520ca {

    /* renamed from: c */
    private static final C1520ca f6733c = new C1520ca();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC1571fa<?>> f6735b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC1588ga f6734a = new C1669l9();

    private C1520ca() {
    }

    /* renamed from: a */
    public static C1520ca m8011a() {
        return f6733c;
    }

    /* renamed from: b */
    public final <T> InterfaceC1571fa<T> m8012b(Class<T> cls) {
        C1860x8.m9010f(cls, "messageType");
        InterfaceC1571fa<T> interfaceC1571fa = (InterfaceC1571fa) this.f6735b.get(cls);
        if (interfaceC1571fa == null) {
            interfaceC1571fa = this.f6734a.mo8198a(cls);
            C1860x8.m9010f(cls, "messageType");
            C1860x8.m9010f(interfaceC1571fa, "schema");
            InterfaceC1571fa<T> interfaceC1571fa2 = (InterfaceC1571fa) this.f6735b.putIfAbsent(cls, interfaceC1571fa);
            if (interfaceC1571fa2 != null) {
                return interfaceC1571fa2;
            }
        }
        return interfaceC1571fa;
    }
}
