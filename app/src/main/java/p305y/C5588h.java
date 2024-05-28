package p305y;

import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p292x.C5493a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.h */
/* loaded from: classes.dex */
public class C5588h<V> implements InterfaceFutureC2565m<List<V>> {

    /* renamed from: n */
    List<? extends InterfaceFutureC2565m<? extends V>> f20711n;

    /* renamed from: o */
    List<V> f20712o;

    /* renamed from: p */
    private final boolean f20713p;

    /* renamed from: q */
    private final AtomicInteger f20714q;

    /* renamed from: r */
    private final InterfaceFutureC2565m<List<V>> f20715r = C0541c.m2515a(new a());

    /* renamed from: s */
    C0541c.a<List<V>> f20716s;

    /* renamed from: y.h$a */
    /* loaded from: classes.dex */
    class a implements C0541c.c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.C0541c.c
        /* renamed from: a */
        public Object mo1498a(C0541c.a<List<V>> aVar) {
            C0654h.m3470i(C5588h.this.f20716s == null, "The result can only set once!");
            C5588h.this.f20716s = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.h$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5588h c5588h = C5588h.this;
            c5588h.f20712o = null;
            c5588h.f20711n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.h$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ int f20719n;

        /* renamed from: o */
        final /* synthetic */ InterfaceFutureC2565m f20720o;

        c(int i10, InterfaceFutureC2565m interfaceFutureC2565m) {
            this.f20719n = i10;
            this.f20720o = interfaceFutureC2565m;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5588h.this.m20523f(this.f20719n, this.f20720o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5588h(List<? extends InterfaceFutureC2565m<? extends V>> list, boolean z10, Executor executor) {
        this.f20711n = (List) C0654h.m3467f(list);
        this.f20712o = new ArrayList(list.size());
        this.f20713p = z10;
        this.f20714q = new AtomicInteger(list.size());
        m20520e(executor);
    }

    /* renamed from: a */
    private void m20519a() throws InterruptedException {
        List<? extends InterfaceFutureC2565m<? extends V>> list = this.f20711n;
        if (list == null || isDone()) {
            return;
        }
        for (InterfaceFutureC2565m<? extends V> interfaceFutureC2565m : list) {
            while (!interfaceFutureC2565m.isDone()) {
                try {
                    interfaceFutureC2565m.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f20713p) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m20520e(Executor executor) {
        mo2501b(new b(), C5493a.m20219a());
        if (this.f20711n.isEmpty()) {
            this.f20716s.m2519c(new ArrayList(this.f20712o));
            return;
        }
        for (int i10 = 0; i10 < this.f20711n.size(); i10++) {
            this.f20712o.add(null);
        }
        List<? extends InterfaceFutureC2565m<? extends V>> list = this.f20711n;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceFutureC2565m<? extends V> interfaceFutureC2565m = list.get(i11);
            interfaceFutureC2565m.mo2501b(new c(i11, interfaceFutureC2565m), executor);
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
    /* renamed from: b */
    public void mo2501b(Runnable runnable, Executor executor) {
        this.f20715r.mo2501b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException, ExecutionException {
        m20519a();
        return this.f20715r.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends InterfaceFutureC2565m<? extends V>> list = this.f20711n;
        if (list != null) {
            Iterator<? extends InterfaceFutureC2565m<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f20715r.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f20715r.get(j10, timeUnit);
    }

    /* renamed from: f */
    void m20523f(int i10, Future<? extends V> future) {
        C0541c.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f20712o;
        if (!isDone() && list != null) {
            try {
                try {
                    try {
                        try {
                            C0654h.m3470i(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i10, C5586f.m20505e(future));
                            decrementAndGet = this.f20714q.decrementAndGet();
                            C0654h.m3470i(decrementAndGet >= 0, "Less than 0 remaining futures");
                        } catch (Error e10) {
                            this.f20716s.m2521f(e10);
                            int decrementAndGet2 = this.f20714q.decrementAndGet();
                            C0654h.m3470i(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet2 != 0) {
                                return;
                            }
                            List<V> list2 = this.f20712o;
                            if (list2 != null) {
                                aVar = this.f20716s;
                                arrayList = new ArrayList(list2);
                            }
                        } catch (CancellationException unused) {
                            if (this.f20713p) {
                                cancel(false);
                            }
                            int decrementAndGet3 = this.f20714q.decrementAndGet();
                            C0654h.m3470i(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet3 != 0) {
                                return;
                            }
                            List<V> list3 = this.f20712o;
                            if (list3 != null) {
                                aVar = this.f20716s;
                                arrayList = new ArrayList(list3);
                            }
                        }
                    } catch (RuntimeException e11) {
                        if (this.f20713p) {
                            this.f20716s.m2521f(e11);
                        }
                        int decrementAndGet4 = this.f20714q.decrementAndGet();
                        C0654h.m3470i(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet4 != 0) {
                            return;
                        }
                        List<V> list4 = this.f20712o;
                        if (list4 != null) {
                            aVar = this.f20716s;
                            arrayList = new ArrayList(list4);
                        }
                    }
                } catch (ExecutionException e12) {
                    if (this.f20713p) {
                        this.f20716s.m2521f(e12.getCause());
                    }
                    int decrementAndGet5 = this.f20714q.decrementAndGet();
                    C0654h.m3470i(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet5 != 0) {
                        return;
                    }
                    List<V> list5 = this.f20712o;
                    if (list5 != null) {
                        aVar = this.f20716s;
                        arrayList = new ArrayList(list5);
                    }
                }
                if (decrementAndGet == 0) {
                    List<V> list6 = this.f20712o;
                    if (list6 != null) {
                        aVar = this.f20716s;
                        arrayList = new ArrayList(list6);
                        aVar.m2519c(arrayList);
                        return;
                    }
                    C0654h.m3469h(isDone());
                    return;
                }
                return;
            } catch (Throwable th) {
                int decrementAndGet6 = this.f20714q.decrementAndGet();
                C0654h.m3470i(decrementAndGet6 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List<V> list7 = this.f20712o;
                    if (list7 != null) {
                        this.f20716s.m2519c(new ArrayList(list7));
                    } else {
                        C0654h.m3469h(isDone());
                    }
                }
                throw th;
            }
        }
        C0654h.m3470i(this.f20713p, "Future was done before all dependencies completed");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f20715r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f20715r.isDone();
    }
}
