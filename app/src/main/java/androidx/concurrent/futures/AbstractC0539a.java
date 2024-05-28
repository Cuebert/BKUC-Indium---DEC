package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC0539a<V> implements InterfaceFutureC2565m<V> {

    /* renamed from: q */
    static final boolean f2376q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: r */
    private static final Logger f2377r = Logger.getLogger(AbstractC0539a.class.getName());

    /* renamed from: s */
    static final b f2378s;

    /* renamed from: t */
    private static final Object f2379t;

    /* renamed from: n */
    volatile Object f2380n;

    /* renamed from: o */
    volatile e f2381o;

    /* renamed from: p */
    volatile i f2382p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo2507a(AbstractC0539a<?> abstractC0539a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo2508b(AbstractC0539a<?> abstractC0539a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo2509c(AbstractC0539a<?> abstractC0539a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo2510d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo2511e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f2383c;

        /* renamed from: d */
        static final c f2384d;

        /* renamed from: a */
        final boolean f2385a;

        /* renamed from: b */
        final Throwable f2386b;

        static {
            if (AbstractC0539a.f2376q) {
                f2384d = null;
                f2383c = null;
            } else {
                f2384d = new c(false, null);
                f2383c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f2385a = z10;
            this.f2386b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f2387b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f2388a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: classes.dex */
        static class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f2388a = (Throwable) AbstractC0539a.m2491e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f2389d = new e(null, null);

        /* renamed from: a */
        final Runnable f2390a;

        /* renamed from: b */
        final Executor f2391b;

        /* renamed from: c */
        e f2392c;

        e(Runnable runnable, Executor executor) {
            this.f2390a = runnable;
            this.f2391b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f2393a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f2394b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0539a, i> f2395c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0539a, e> f2396d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0539a, Object> f2397e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0539a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0539a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0539a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2393a = atomicReferenceFieldUpdater;
            this.f2394b = atomicReferenceFieldUpdater2;
            this.f2395c = atomicReferenceFieldUpdater3;
            this.f2396d = atomicReferenceFieldUpdater4;
            this.f2397e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: a */
        boolean mo2507a(AbstractC0539a<?> abstractC0539a, e eVar, e eVar2) {
            return C0540b.m2514a(this.f2396d, abstractC0539a, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: b */
        boolean mo2508b(AbstractC0539a<?> abstractC0539a, Object obj, Object obj2) {
            return C0540b.m2514a(this.f2397e, abstractC0539a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: c */
        boolean mo2509c(AbstractC0539a<?> abstractC0539a, i iVar, i iVar2) {
            return C0540b.m2514a(this.f2395c, abstractC0539a, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: d */
        void mo2510d(i iVar, i iVar2) {
            this.f2394b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: e */
        void mo2511e(i iVar, Thread thread) {
            this.f2393a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: n */
        final AbstractC0539a<V> f2398n;

        /* renamed from: o */
        final InterfaceFutureC2565m<? extends V> f2399o;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2398n.f2380n != this) {
                return;
            }
            if (AbstractC0539a.f2378s.mo2508b(this.f2398n, this, AbstractC0539a.m2496j(this.f2399o))) {
                AbstractC0539a.m2493g(this.f2398n);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: a */
        boolean mo2507a(AbstractC0539a<?> abstractC0539a, e eVar, e eVar2) {
            synchronized (abstractC0539a) {
                if (abstractC0539a.f2381o != eVar) {
                    return false;
                }
                abstractC0539a.f2381o = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: b */
        boolean mo2508b(AbstractC0539a<?> abstractC0539a, Object obj, Object obj2) {
            synchronized (abstractC0539a) {
                if (abstractC0539a.f2380n != obj) {
                    return false;
                }
                abstractC0539a.f2380n = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: c */
        boolean mo2509c(AbstractC0539a<?> abstractC0539a, i iVar, i iVar2) {
            synchronized (abstractC0539a) {
                if (abstractC0539a.f2382p != iVar) {
                    return false;
                }
                abstractC0539a.f2382p = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: d */
        void mo2510d(i iVar, i iVar2) {
            iVar.f2402b = iVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC0539a.b
        /* renamed from: e */
        void mo2511e(i iVar, Thread thread) {
            iVar.f2401a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f2400c = new i(false);

        /* renamed from: a */
        volatile Thread f2401a;

        /* renamed from: b */
        volatile i f2402b;

        i(boolean z10) {
        }

        /* renamed from: a */
        void m2512a(i iVar) {
            AbstractC0539a.f2378s.mo2510d(this, iVar);
        }

        /* renamed from: b */
        void m2513b() {
            Thread thread = this.f2401a;
            if (thread != null) {
                this.f2401a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC0539a.f2378s.mo2511e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0539a.class, i.class, "p"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0539a.class, e.class, "o"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0539a.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f2378s = hVar;
        if (th != null) {
            f2377r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2379t = new Object();
    }

    /* renamed from: a */
    private void m2489a(StringBuilder sb2) {
        try {
            Object m2497k = m2497k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m2500r(m2497k));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    /* renamed from: d */
    private static CancellationException m2490d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m2491e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: f */
    private e m2492f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2381o;
        } while (!f2378s.mo2507a(this, eVar2, e.f2389d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2392c;
            eVar4.f2392c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: g */
    static void m2493g(AbstractC0539a<?> abstractC0539a) {
        e eVar = null;
        while (true) {
            abstractC0539a.m2498n();
            abstractC0539a.m2502c();
            e m2492f = abstractC0539a.m2492f(eVar);
            while (m2492f != null) {
                eVar = m2492f.f2392c;
                Runnable runnable = m2492f.f2390a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC0539a = gVar.f2398n;
                    if (abstractC0539a.f2380n == gVar) {
                        if (f2378s.mo2508b(abstractC0539a, gVar, m2496j(gVar.f2399o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m2494h(runnable, m2492f.f2391b);
                }
                m2492f = eVar;
            }
            return;
        }
    }

    /* renamed from: h */
    private static void m2494h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f2377r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private V m2495i(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f2379t) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f2388a);
        }
        throw m2490d("Task was cancelled.", ((c) obj).f2386b);
    }

    /* renamed from: j */
    static Object m2496j(InterfaceFutureC2565m<?> interfaceFutureC2565m) {
        if (interfaceFutureC2565m instanceof AbstractC0539a) {
            Object obj = ((AbstractC0539a) interfaceFutureC2565m).f2380n;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f2385a ? cVar.f2386b != null ? new c(false, cVar.f2386b) : c.f2384d : obj;
        }
        boolean isCancelled = interfaceFutureC2565m.isCancelled();
        if ((!f2376q) & isCancelled) {
            return c.f2384d;
        }
        try {
            Object m2497k = m2497k(interfaceFutureC2565m);
            return m2497k == null ? f2379t : m2497k;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2565m, e10));
            }
            return new c(false, e10);
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: k */
    private static <V> V m2497k(Future<V> future) throws ExecutionException {
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

    /* renamed from: n */
    private void m2498n() {
        i iVar;
        do {
            iVar = this.f2382p;
        } while (!f2378s.mo2509c(this, iVar, i.f2400c));
        while (iVar != null) {
            iVar.m2513b();
            iVar = iVar.f2402b;
        }
    }

    /* renamed from: o */
    private void m2499o(i iVar) {
        iVar.f2401a = null;
        while (true) {
            i iVar2 = this.f2382p;
            if (iVar2 == i.f2400c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2402b;
                if (iVar2.f2401a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2402b = iVar4;
                    if (iVar3.f2401a == null) {
                        break;
                    }
                } else if (!f2378s.mo2509c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m2500r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
    /* renamed from: b */
    public final void mo2501b(Runnable runnable, Executor executor) {
        m2491e(runnable);
        m2491e(executor);
        e eVar = this.f2381o;
        if (eVar != e.f2389d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2392c = eVar;
                if (f2378s.mo2507a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f2381o;
                }
            } while (eVar != e.f2389d);
        }
        m2494h(runnable, executor);
    }

    /* renamed from: c */
    protected void m2502c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f2380n;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f2376q ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f2383c : c.f2384d;
        boolean z11 = false;
        AbstractC0539a<V> abstractC0539a = this;
        while (true) {
            if (f2378s.mo2508b(abstractC0539a, obj, cVar)) {
                if (z10) {
                    abstractC0539a.m2503l();
                }
                m2493g(abstractC0539a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC2565m<? extends V> interfaceFutureC2565m = ((g) obj).f2399o;
                if (interfaceFutureC2565m instanceof AbstractC0539a) {
                    abstractC0539a = (AbstractC0539a) interfaceFutureC2565m;
                    obj = abstractC0539a.f2380n;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    interfaceFutureC2565m.cancel(z10);
                    return true;
                }
            } else {
                obj = abstractC0539a.f2380n;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f2380n;
            if ((obj != null) & (!(obj instanceof g))) {
                return m2495i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f2382p;
                if (iVar != i.f2400c) {
                    i iVar2 = new i();
                    do {
                        iVar2.m2512a(iVar);
                        if (f2378s.mo2509c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2380n;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return m2495i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m2499o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m2499o(iVar2);
                        } else {
                            iVar = this.f2382p;
                        }
                    } while (iVar != i.f2400c);
                }
                return m2495i(this.f2380n);
            }
            while (nanos > 0) {
                Object obj3 = this.f2380n;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return m2495i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC0539a = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractC0539a);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2380n instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f2380n != null);
    }

    /* renamed from: l */
    protected void m2503l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    protected String mo2504m() {
        Object obj = this.f2380n;
        if (obj instanceof g) {
            return "setFuture=[" + m2500r(((g) obj).f2399o) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo2505p(V v10) {
        if (v10 == null) {
            v10 = (V) f2379t;
        }
        if (!f2378s.mo2508b(this, null, v10)) {
            return false;
        }
        m2493g(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo2506q(Throwable th) {
        if (!f2378s.mo2508b(this, null, new d((Throwable) m2491e(th)))) {
            return false;
        }
        m2493g(this);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m2489a(sb2);
        } else {
            try {
                str = mo2504m();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m2489a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2380n;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m2495i(obj2);
            }
            i iVar = this.f2382p;
            if (iVar != i.f2400c) {
                i iVar2 = new i();
                do {
                    iVar2.m2512a(iVar);
                    if (f2378s.mo2509c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2380n;
                            } else {
                                m2499o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m2495i(obj);
                    }
                    iVar = this.f2382p;
                } while (iVar != i.f2400c);
            }
            return m2495i(this.f2380n);
        }
        throw new InterruptedException();
    }
}
