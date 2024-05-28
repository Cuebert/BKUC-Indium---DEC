package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.l1 */
/* loaded from: classes.dex */
public class C1978l1 {

    /* renamed from: c */
    private static final C2005p0 f7730c = C2005p0.f7762c;

    /* renamed from: a */
    protected volatile InterfaceC1944g2 f7731a;

    /* renamed from: b */
    private volatile AbstractC1914c0 f7732b;

    /* renamed from: a */
    public final int m9490a() {
        if (this.f7732b != null) {
            return ((C2066y) this.f7732b).f7889r.length;
        }
        if (this.f7731a != null) {
            return this.f7731a.mo9297b();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC1914c0 m9491b() {
        if (this.f7732b != null) {
            return this.f7732b;
        }
        synchronized (this) {
            if (this.f7732b != null) {
                return this.f7732b;
            }
            if (this.f7731a == null) {
                this.f7732b = AbstractC1914c0.f7634o;
            } else {
                this.f7732b = this.f7731a.zzb();
            }
            return this.f7732b;
        }
    }

    /* renamed from: c */
    protected final void m9492c(InterfaceC1944g2 interfaceC1944g2) {
        if (this.f7731a != null) {
            return;
        }
        synchronized (this) {
            if (this.f7731a == null) {
                try {
                    this.f7731a = interfaceC1944g2;
                    this.f7732b = AbstractC1914c0.f7634o;
                } catch (C1964j1 unused) {
                    this.f7731a = interfaceC1944g2;
                    this.f7732b = AbstractC1914c0.f7634o;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1978l1)) {
            return false;
        }
        C1978l1 c1978l1 = (C1978l1) obj;
        InterfaceC1944g2 interfaceC1944g2 = this.f7731a;
        InterfaceC1944g2 interfaceC1944g22 = c1978l1.f7731a;
        if (interfaceC1944g2 == null && interfaceC1944g22 == null) {
            return m9491b().equals(c1978l1.m9491b());
        }
        if (interfaceC1944g2 != null && interfaceC1944g22 != null) {
            return interfaceC1944g2.equals(interfaceC1944g22);
        }
        if (interfaceC1944g2 != null) {
            c1978l1.m9492c(interfaceC1944g2.mo9300f());
            return interfaceC1944g2.equals(c1978l1.f7731a);
        }
        m9492c(interfaceC1944g22.mo9300f());
        return this.f7731a.equals(interfaceC1944g22);
    }

    public int hashCode() {
        return 1;
    }
}
