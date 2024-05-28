package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes.dex */
public final class C1511c1 {

    /* renamed from: a */
    final C1711o3 f6713a;

    /* renamed from: b */
    C1728p4 f6714b;

    /* renamed from: c */
    final C1509c f6715c;

    /* renamed from: d */
    private final C1610hf f6716d;

    public C1511c1() {
        C1711o3 c1711o3 = new C1711o3();
        this.f6713a = c1711o3;
        this.f6714b = c1711o3.f7114b.m8654a();
        this.f6715c = new C1509c();
        this.f6716d = new C1610hf();
        c1711o3.f7116d.m8813a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            public /* synthetic */ CallableC1475a() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1511c1.this.m7974b();
            }
        });
        c1711o3.f7116d.m8813a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            public /* synthetic */ CallableC1493b0() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1764r8(C1511c1.this.f6715c);
            }
        });
    }

    /* renamed from: a */
    public final C1509c m7973a() {
        return this.f6715c;
    }

    /* renamed from: b */
    public final /* synthetic */ AbstractC1627j m7974b() throws Exception {
        return new C1542df(this.f6716d);
    }

    /* renamed from: c */
    public final void m7975c(C1549e5 c1549e5) throws C1821v1 {
        AbstractC1627j abstractC1627j;
        try {
            this.f6714b = this.f6713a.f7114b.m8654a();
            if (!(this.f6713a.m8636a(this.f6714b, (C1633j5[]) c1549e5.m8087y().toArray(new C1633j5[0])) instanceof C1594h)) {
                for (C1515c5 c1515c5 : c1549e5.m8086w().m7886z()) {
                    List<C1633j5> m8000y = c1515c5.m8000y();
                    String m7999x = c1515c5.m7999x();
                    Iterator<C1633j5> it = m8000y.iterator();
                    while (it.hasNext()) {
                        InterfaceC1739q m8636a = this.f6713a.m8636a(this.f6714b, it.next());
                        if (m8636a instanceof C1691n) {
                            C1728p4 c1728p4 = this.f6714b;
                            if (c1728p4.m8661h(m7999x)) {
                                InterfaceC1739q m8657d = c1728p4.m8657d(m7999x);
                                if (!(m8657d instanceof AbstractC1627j)) {
                                    String valueOf = String.valueOf(m7999x);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                abstractC1627j = (AbstractC1627j) m8657d;
                            } else {
                                abstractC1627j = null;
                            }
                            if (abstractC1627j == null) {
                                String valueOf2 = String.valueOf(m7999x);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            abstractC1627j.mo7931a(this.f6714b, Collections.singletonList(m8636a));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C1821v1(th);
        }
    }

    /* renamed from: d */
    public final void m7976d(String str, Callable<? extends AbstractC1627j> callable) {
        this.f6713a.f7116d.m8813a(str, callable);
    }

    /* renamed from: e */
    public final boolean m7977e(C1492b c1492b) throws C1821v1 {
        try {
            this.f6715c.m7970d(c1492b);
            this.f6713a.f7115c.m8660g("runtime.counter", new C1611i(Double.valueOf(0.0d)));
            this.f6716d.m8296b(this.f6714b.m8654a(), this.f6715c);
            if (m7979g()) {
                return true;
            }
            return m7978f();
        } catch (Throwable th) {
            throw new C1821v1(th);
        }
    }

    /* renamed from: f */
    public final boolean m7978f() {
        return !this.f6715c.m7969c().isEmpty();
    }

    /* renamed from: g */
    public final boolean m7979g() {
        return !this.f6715c.m7968b().equals(this.f6715c.m7967a());
    }
}
