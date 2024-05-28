package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p032c6.C1131a;
import p085g4.AbstractC3241a;
import p085g4.AbstractC3263l;
import p085g4.C3243b;
import p085g4.C3265m;
import p085g4.C3269o;
import p321z2.C5984j;

/* renamed from: g6.k */
/* loaded from: classes.dex */
public abstract class AbstractC3300k {

    /* renamed from: b */
    private final AtomicInteger f13759b = new AtomicInteger(0);

    /* renamed from: a */
    @RecentlyNonNull
    protected final C3304o f13758a = new C3304o();

    /* renamed from: c */
    private final AtomicBoolean f13760c = new AtomicBoolean(false);

    @RecentlyNonNull
    /* renamed from: a */
    public <T> AbstractC3263l<T> m14568a(@RecentlyNonNull final Executor executor, @RecentlyNonNull final Callable<T> callable, @RecentlyNonNull final AbstractC3241a abstractC3241a) {
        C5984j.m21289m(this.f13759b.get() > 0);
        if (abstractC3241a.mo14477a()) {
            return C3269o.m14529d();
        }
        final C3243b c3243b = new C3243b();
        final C3265m c3265m = new C3265m(c3243b.m14480b());
        this.f13758a.m14583a(new Executor() { // from class: g6.a0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                AbstractC3241a abstractC3241a2 = abstractC3241a;
                C3243b c3243b2 = c3243b;
                C3265m c3265m2 = c3265m;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC3241a2.mo14477a()) {
                        c3243b2.m14479a();
                    } else {
                        c3265m2.m14513b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: g6.z
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3300k.this.m14573f(abstractC3241a, c3243b, callable, c3265m);
            }
        });
        return c3265m.m14512a();
    }

    /* renamed from: b */
    public abstract void mo14569b() throws C1131a;

    /* renamed from: c */
    public void m14570c() {
        this.f13759b.incrementAndGet();
    }

    /* renamed from: d */
    protected abstract void mo14571d();

    /* renamed from: e */
    public void m14572e(@RecentlyNonNull Executor executor) {
        C5984j.m21289m(this.f13759b.get() > 0);
        this.f13758a.m14583a(executor, new Runnable() { // from class: g6.y
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3300k.this.m14574g();
            }
        });
    }

    /* renamed from: f */
    public final /* synthetic */ void m14573f(@RecentlyNonNull AbstractC3241a abstractC3241a, @RecentlyNonNull C3243b c3243b, @RecentlyNonNull Callable callable, @RecentlyNonNull C3265m c3265m) {
        try {
            if (abstractC3241a.mo14477a()) {
                c3243b.m14479a();
                return;
            }
            try {
                if (!this.f13760c.get()) {
                    mo14569b();
                    this.f13760c.set(true);
                }
                if (abstractC3241a.mo14477a()) {
                    c3243b.m14479a();
                    return;
                }
                Object call = callable.call();
                if (abstractC3241a.mo14477a()) {
                    c3243b.m14479a();
                } else {
                    c3265m.m14514c(call);
                }
            } catch (RuntimeException e10) {
                throw new C1131a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC3241a.mo14477a()) {
                c3243b.m14479a();
            } else {
                c3265m.m14513b(e11);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m14574g() {
        int decrementAndGet = this.f13759b.decrementAndGet();
        C5984j.m21289m(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo14571d();
            this.f13760c.set(false);
        }
    }
}
