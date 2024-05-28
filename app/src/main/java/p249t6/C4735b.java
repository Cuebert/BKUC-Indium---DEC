package p249t6;

import p093h0.C3359d;

/* renamed from: t6.b */
/* loaded from: classes.dex */
public class C4735b {

    /* renamed from: d */
    private static C4735b f18563d;

    /* renamed from: b */
    private int f18565b;

    /* renamed from: c */
    private Object f18566c = new Object();

    /* renamed from: a */
    private C3359d<C4734a> f18564a = new C3359d<>();

    private C4735b() {
    }

    /* renamed from: b */
    public static C4735b m18874b() {
        if (f18563d == null) {
            synchronized (C4735b.class) {
                if (f18563d == null) {
                    f18563d = new C4735b();
                }
            }
        }
        return f18563d;
    }

    /* renamed from: a */
    public void m18875a() {
        this.f18564a.m14803d();
        this.f18565b = 0;
    }

    /* renamed from: c */
    public int m18876c() {
        return this.f18565b;
    }

    /* renamed from: d */
    public C4734a m18877d(long j10) {
        return this.f18564a.m14805h(j10);
    }

    /* renamed from: e */
    public void m18878e(C4734a c4734a) {
        synchronized (this.f18566c) {
            C4734a m14805h = this.f18564a.m14805h(c4734a.m18866b());
            if (m14805h != null) {
                m14805h.m18873i(c4734a);
            } else {
                this.f18564a.m14809n(c4734a.m18866b(), c4734a);
            }
        }
    }
}
