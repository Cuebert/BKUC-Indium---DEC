package p146l;

import java.util.concurrent.Executor;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C3853a extends AbstractC3855c {

    /* renamed from: c */
    private static volatile C3853a f15907c;

    /* renamed from: d */
    private static final Executor f15908d = new a();

    /* renamed from: e */
    private static final Executor f15909e = new b();

    /* renamed from: a */
    private AbstractC3855c f15910a;

    /* renamed from: b */
    private AbstractC3855c f15911b;

    /* renamed from: l.a$a */
    /* loaded from: classes.dex */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3853a.m16278d().mo16281c(runnable);
        }
    }

    /* renamed from: l.a$b */
    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3853a.m16278d().mo16279a(runnable);
        }
    }

    private C3853a() {
        C3854b c3854b = new C3854b();
        this.f15911b = c3854b;
        this.f15910a = c3854b;
    }

    /* renamed from: d */
    public static C3853a m16278d() {
        if (f15907c != null) {
            return f15907c;
        }
        synchronized (C3853a.class) {
            if (f15907c == null) {
                f15907c = new C3853a();
            }
        }
        return f15907c;
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: a */
    public void mo16279a(Runnable runnable) {
        this.f15910a.mo16279a(runnable);
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: b */
    public boolean mo16280b() {
        return this.f15910a.mo16280b();
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: c */
    public void mo16281c(Runnable runnable) {
        this.f15910a.mo16281c(runnable);
    }
}
