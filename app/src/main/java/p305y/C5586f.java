package p305y;

import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p169n.InterfaceC4005a;
import p292x.C5493a;
import p305y.AbstractC5587g;

/* renamed from: y.f */
/* loaded from: classes.dex */
public final class C5586f {

    /* renamed from: a */
    private static final InterfaceC4005a<?, ?> f20701a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.f$a */
    /* loaded from: classes.dex */
    public class a<I, O> implements InterfaceC5581a<I, O> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4005a f20702a;

        a(InterfaceC4005a interfaceC4005a) {
            this.f20702a = interfaceC4005a;
        }

        @Override // p305y.InterfaceC5581a
        /* renamed from: a */
        public InterfaceFutureC2565m<O> mo1404a(I i10) {
            return C5586f.m20508h(this.f20702a.mo1403a(i10));
        }
    }

    /* renamed from: y.f$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC4005a<Object, Object> {
        b() {
        }

        @Override // p169n.InterfaceC4005a
        /* renamed from: a */
        public Object mo1403a(Object obj) {
            return obj;
        }
    }

    /* renamed from: y.f$c */
    /* loaded from: classes.dex */
    public class c<I> implements InterfaceC5583c<I> {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f20703a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC4005a f20704b;

        c(C0541c.a aVar, InterfaceC4005a interfaceC4005a) {
            this.f20703a = aVar;
            this.f20704b = interfaceC4005a;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            this.f20703a.m2521f(th);
        }

        @Override // p305y.InterfaceC5583c
        public void onSuccess(I i10) {
            try {
                this.f20703a.m2519c(this.f20704b.mo1403a(i10));
            } catch (Throwable th) {
                this.f20703a.m2521f(th);
            }
        }
    }

    /* renamed from: y.f$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceFutureC2565m f20705n;

        d(InterfaceFutureC2565m interfaceFutureC2565m) {
            this.f20705n = interfaceFutureC2565m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20705n.cancel(true);
        }
    }

    /* renamed from: y.f$e */
    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: n */
        final Future<V> f20706n;

        /* renamed from: o */
        final InterfaceC5583c<? super V> f20707o;

        e(Future<V> future, InterfaceC5583c<? super V> interfaceC5583c) {
            this.f20706n = future;
            this.f20707o = interfaceC5583c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20707o.onSuccess(C5586f.m20504d(this.f20706n));
            } catch (Error e10) {
                e = e10;
                this.f20707o.mo1361a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f20707o.mo1361a(e);
            } catch (ExecutionException e12) {
                this.f20707o.mo1361a(e12.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f20707o;
        }
    }

    /* renamed from: b */
    public static <V> void m20502b(InterfaceFutureC2565m<V> interfaceFutureC2565m, InterfaceC5583c<? super V> interfaceC5583c, Executor executor) {
        C0654h.m3467f(interfaceC5583c);
        interfaceFutureC2565m.mo2501b(new e(interfaceFutureC2565m, interfaceC5583c), executor);
    }

    /* renamed from: c */
    public static <V> InterfaceFutureC2565m<List<V>> m20503c(Collection<? extends InterfaceFutureC2565m<? extends V>> collection) {
        return new C5588h(new ArrayList(collection), true, C5493a.m20219a());
    }

    /* renamed from: d */
    public static <V> V m20504d(Future<V> future) throws ExecutionException {
        C0654h.m3470i(future.isDone(), "Future was expected to be done, " + future);
        return (V) m20505e(future);
    }

    /* renamed from: e */
    public static <V> V m20505e(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* renamed from: f */
    public static <V> InterfaceFutureC2565m<V> m20506f(Throwable th) {
        return new AbstractC5587g.a(th);
    }

    /* renamed from: g */
    public static <V> ScheduledFuture<V> m20507g(Throwable th) {
        return new AbstractC5587g.b(th);
    }

    /* renamed from: h */
    public static <V> InterfaceFutureC2565m<V> m20508h(V v10) {
        if (v10 == null) {
            return AbstractC5587g.m20517c();
        }
        return new AbstractC5587g.c(v10);
    }

    /* renamed from: i */
    public static /* synthetic */ Object m20509i(InterfaceFutureC2565m interfaceFutureC2565m, C0541c.a aVar) throws Exception {
        m20513m(false, interfaceFutureC2565m, f20701a, aVar, C5493a.m20219a());
        return "nonCancellationPropagating[" + interfaceFutureC2565m + "]";
    }

    /* renamed from: j */
    public static <V> InterfaceFutureC2565m<V> m20510j(InterfaceFutureC2565m<V> interfaceFutureC2565m) {
        C0654h.m3467f(interfaceFutureC2565m);
        return interfaceFutureC2565m.isDone() ? interfaceFutureC2565m : C0541c.m2515a(new C0541c.c() { // from class: y.e
            public /* synthetic */ C5585e() {
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m20509i;
                m20509i = C5586f.m20509i(InterfaceFutureC2565m.this, aVar);
                return m20509i;
            }
        });
    }

    /* renamed from: k */
    public static <V> void m20511k(InterfaceFutureC2565m<V> interfaceFutureC2565m, C0541c.a<V> aVar) {
        m20512l(interfaceFutureC2565m, f20701a, aVar, C5493a.m20219a());
    }

    /* renamed from: l */
    public static <I, O> void m20512l(InterfaceFutureC2565m<I> interfaceFutureC2565m, InterfaceC4005a<? super I, ? extends O> interfaceC4005a, C0541c.a<O> aVar, Executor executor) {
        m20513m(true, interfaceFutureC2565m, interfaceC4005a, aVar, executor);
    }

    /* renamed from: m */
    private static <I, O> void m20513m(boolean z10, InterfaceFutureC2565m<I> interfaceFutureC2565m, InterfaceC4005a<? super I, ? extends O> interfaceC4005a, C0541c.a<O> aVar, Executor executor) {
        C0654h.m3467f(interfaceFutureC2565m);
        C0654h.m3467f(interfaceC4005a);
        C0654h.m3467f(aVar);
        C0654h.m3467f(executor);
        m20502b(interfaceFutureC2565m, new c(aVar, interfaceC4005a), executor);
        if (z10) {
            aVar.m2517a(new d(interfaceFutureC2565m), C5493a.m20219a());
        }
    }

    /* renamed from: n */
    public static <V> InterfaceFutureC2565m<List<V>> m20514n(Collection<? extends InterfaceFutureC2565m<? extends V>> collection) {
        return new C5588h(new ArrayList(collection), false, C5493a.m20219a());
    }

    /* renamed from: o */
    public static <I, O> InterfaceFutureC2565m<O> m20515o(InterfaceFutureC2565m<I> interfaceFutureC2565m, InterfaceC4005a<? super I, ? extends O> interfaceC4005a, Executor executor) {
        C0654h.m3467f(interfaceC4005a);
        return m20516p(interfaceFutureC2565m, new a(interfaceC4005a), executor);
    }

    /* renamed from: p */
    public static <I, O> InterfaceFutureC2565m<O> m20516p(InterfaceFutureC2565m<I> interfaceFutureC2565m, InterfaceC5581a<? super I, ? extends O> interfaceC5581a, Executor executor) {
        RunnableC5582b runnableC5582b = new RunnableC5582b(interfaceC5581a, interfaceFutureC2565m);
        interfaceFutureC2565m.mo2501b(runnableC5582b, executor);
        return runnableC5582b;
    }
}
