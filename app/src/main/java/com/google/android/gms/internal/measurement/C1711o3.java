package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
/* loaded from: classes.dex */
public final class C1711o3 {

    /* renamed from: a */
    final C1867y f7113a;

    /* renamed from: b */
    final C1728p4 f7114b;

    /* renamed from: c */
    final C1728p4 f7115c;

    /* renamed from: d */
    final C1779s7 f7116d;

    public C1711o3() {
        C1867y c1867y = new C1867y();
        this.f7113a = c1867y;
        C1728p4 c1728p4 = new C1728p4(null, c1867y);
        this.f7115c = c1728p4;
        this.f7114b = c1728p4.m8654a();
        C1779s7 c1779s7 = new C1779s7();
        this.f7116d = c1779s7;
        c1728p4.m8660g("require", new C1559ef(c1779s7));
        c1779s7.m8813a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.n2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1593gf();
            }
        });
        c1728p4.m8660g("runtime.counter", new C1611i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final InterfaceC1739q m8636a(C1728p4 c1728p4, C1633j5... c1633j5Arr) {
        InterfaceC1739q interfaceC1739q = InterfaceC1739q.f7165b;
        for (C1633j5 c1633j5 : c1633j5Arr) {
            interfaceC1739q = C1762r6.m8764a(c1633j5);
            C1745q5.m8717c(this.f7115c);
            if ((interfaceC1739q instanceof C1755r) || (interfaceC1739q instanceof C1723p)) {
                interfaceC1739q = this.f7113a.m9057a(c1728p4, interfaceC1739q);
            }
        }
        return interfaceC1739q;
    }
}
