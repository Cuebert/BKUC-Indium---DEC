package p230rb;

import java.util.LinkedHashSet;
import java.util.Set;
import p193ob.C4185k0;

/* renamed from: rb.h */
/* loaded from: classes.dex */
final class C4477h {

    /* renamed from: a */
    private final Set<C4185k0> f18137a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m18396a(C4185k0 c4185k0) {
        this.f18137a.remove(c4185k0);
    }

    /* renamed from: b */
    public synchronized void m18397b(C4185k0 c4185k0) {
        this.f18137a.add(c4185k0);
    }

    /* renamed from: c */
    public synchronized boolean m18398c(C4185k0 c4185k0) {
        return this.f18137a.contains(c4185k0);
    }
}
