package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.x6 */
/* loaded from: classes.dex */
public final class C1858x6 {
    /* renamed from: a */
    public static <T> InterfaceC1794t6<T> m8990a(InterfaceC1794t6<T> interfaceC1794t6) {
        if ((interfaceC1794t6 instanceof C1826v6) || (interfaceC1794t6 instanceof C1810u6)) {
            return interfaceC1794t6;
        }
        if (interfaceC1794t6 instanceof Serializable) {
            return new C1810u6(interfaceC1794t6);
        }
        return new C1826v6(interfaceC1794t6);
    }

    /* renamed from: b */
    public static <T> InterfaceC1794t6<T> m8991b(T t10) {
        return new C1842w6(t10);
    }
}
