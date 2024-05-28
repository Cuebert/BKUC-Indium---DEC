package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
/* loaded from: classes.dex */
public class C1502b9 {

    /* renamed from: c */
    private static final C1518c8 f6664c = C1518c8.m8001a();

    /* renamed from: a */
    protected volatile InterfaceC1813u9 f6665a;

    /* renamed from: b */
    private volatile AbstractC1731p7 f6666b;

    /* renamed from: a */
    public final int m7953a() {
        if (this.f6666b != null) {
            return ((C1699n7) this.f6666b).f7097r.length;
        }
        if (this.f6665a != null) {
            return this.f6665a.mo8680g();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC1731p7 m7954b() {
        if (this.f6666b != null) {
            return this.f6666b;
        }
        synchronized (this) {
            if (this.f6666b != null) {
                return this.f6666b;
            }
            if (this.f6665a == null) {
                this.f6666b = AbstractC1731p7.f7144o;
            } else {
                this.f6666b = this.f6665a.mo8864f();
            }
            return this.f6666b;
        }
    }

    /* renamed from: c */
    protected final void m7955c(InterfaceC1813u9 interfaceC1813u9) {
        if (this.f6665a != null) {
            return;
        }
        synchronized (this) {
            if (this.f6665a == null) {
                try {
                    this.f6665a = interfaceC1813u9;
                    this.f6666b = AbstractC1731p7.f7144o;
                } catch (C1892z8 unused) {
                    this.f6665a = interfaceC1813u9;
                    this.f6666b = AbstractC1731p7.f7144o;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1502b9)) {
            return false;
        }
        C1502b9 c1502b9 = (C1502b9) obj;
        InterfaceC1813u9 interfaceC1813u9 = this.f6665a;
        InterfaceC1813u9 interfaceC1813u92 = c1502b9.f6665a;
        if (interfaceC1813u9 == null && interfaceC1813u92 == null) {
            return m7954b().equals(c1502b9.m7954b());
        }
        if (interfaceC1813u9 != null && interfaceC1813u92 != null) {
            return interfaceC1813u9.equals(interfaceC1813u92);
        }
        if (interfaceC1813u9 != null) {
            c1502b9.m7955c(interfaceC1813u9.mo8462h());
            return interfaceC1813u9.equals(c1502b9.f6665a);
        }
        m7955c(interfaceC1813u92.mo8462h());
        return this.f6665a.equals(interfaceC1813u92);
    }

    public int hashCode() {
        return 1;
    }
}
