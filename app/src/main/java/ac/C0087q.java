package ac;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ac.q */
/* loaded from: classes.dex */
public final class C0087q {

    /* renamed from: a */
    static C0086p f312a;

    /* renamed from: b */
    static long f313b;

    private C0087q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m447a(C0086p c0086p) {
        if (c0086p.f310f == null && c0086p.f311g == null) {
            if (c0086p.f308d) {
                return;
            }
            synchronized (C0087q.class) {
                long j10 = f313b;
                if (j10 + 8192 > 65536) {
                    return;
                }
                f313b = j10 + 8192;
                c0086p.f310f = f312a;
                c0086p.f307c = 0;
                c0086p.f306b = 0;
                f312a = c0086p;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0086p m448b() {
        synchronized (C0087q.class) {
            C0086p c0086p = f312a;
            if (c0086p != null) {
                f312a = c0086p.f310f;
                c0086p.f310f = null;
                f313b -= 8192;
                return c0086p;
            }
            return new C0086p();
        }
    }
}
