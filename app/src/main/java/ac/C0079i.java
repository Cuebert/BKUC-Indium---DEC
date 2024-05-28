package ac;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ac.i */
/* loaded from: classes.dex */
public class C0079i extends C0091u {

    /* renamed from: e */
    private C0091u f280e;

    public C0079i(C0091u c0091u) {
        if (c0091u != null) {
            this.f280e = c0091u;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ac.C0091u
    /* renamed from: a */
    public C0091u mo407a() {
        return this.f280e.mo407a();
    }

    @Override // ac.C0091u
    /* renamed from: b */
    public C0091u mo408b() {
        return this.f280e.mo408b();
    }

    @Override // ac.C0091u
    /* renamed from: c */
    public long mo409c() {
        return this.f280e.mo409c();
    }

    @Override // ac.C0091u
    /* renamed from: d */
    public C0091u mo410d(long j10) {
        return this.f280e.mo410d(j10);
    }

    @Override // ac.C0091u
    /* renamed from: e */
    public boolean mo411e() {
        return this.f280e.mo411e();
    }

    @Override // ac.C0091u
    /* renamed from: f */
    public void mo412f() throws IOException {
        this.f280e.mo412f();
    }

    @Override // ac.C0091u
    /* renamed from: g */
    public C0091u mo413g(long j10, TimeUnit timeUnit) {
        return this.f280e.mo413g(j10, timeUnit);
    }

    /* renamed from: i */
    public final C0091u m414i() {
        return this.f280e;
    }

    /* renamed from: j */
    public final C0079i m415j(C0091u c0091u) {
        if (c0091u != null) {
            this.f280e = c0091u;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
