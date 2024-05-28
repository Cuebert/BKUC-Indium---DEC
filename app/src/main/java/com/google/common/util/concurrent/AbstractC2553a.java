package com.google.common.util.concurrent;

import androidx.concurrent.futures.C0540b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import p059e5.C3075g;
import p059e5.C3077i;
import p059e5.C3078j;
import p086g5.AbstractC3282a;
import p086g5.C3283b;
import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.a */
/* loaded from: classes.dex */
public abstract class AbstractC2553a<V> extends AbstractC3282a implements InterfaceFutureC2565m<V> {

    /* renamed from: q */
    static final boolean f10072q;

    /* renamed from: r */
    private static final Logger f10073r;

    /* renamed from: s */
    private static final b f10074s;

    /* renamed from: t */
    private static final Object f10075t;

    /* renamed from: n */
    private volatile Object f10076n;

    /* renamed from: o */
    private volatile e f10077o;

    /* renamed from: p */
    private volatile l f10078p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo11808a(AbstractC2553a<?> abstractC2553a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo11809b(AbstractC2553a<?> abstractC2553a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo11810c(AbstractC2553a<?> abstractC2553a, l lVar, l lVar2);

        /* renamed from: d */
        abstract e mo11811d(AbstractC2553a<?> abstractC2553a, e eVar);

        /* renamed from: e */
        abstract l mo11812e(AbstractC2553a<?> abstractC2553a, l lVar);

        /* renamed from: f */
        abstract void mo11813f(l lVar, l lVar2);

        /* renamed from: g */
        abstract void mo11814g(l lVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f10079c;

        /* renamed from: d */
        static final c f10080d;

        /* renamed from: a */
        final boolean f10081a;

        /* renamed from: b */
        final Throwable f10082b;

        static {
            if (AbstractC2553a.f10072q) {
                f10080d = null;
                f10079c = null;
            } else {
                f10080d = new c(false, null);
                f10079c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f10081a = z10;
            this.f10082b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f10083b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f10084a;

        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* loaded from: classes.dex */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f10084a = (Throwable) C3075g.m13551f(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<l, Thread> f10089a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<l, l> f10090b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC2553a, l> f10091c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC2553a, e> f10092d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC2553a, Object> f10093e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC2553a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC2553a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC2553a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f10089a = atomicReferenceFieldUpdater;
            this.f10090b = atomicReferenceFieldUpdater2;
            this.f10091c = atomicReferenceFieldUpdater3;
            this.f10092d = atomicReferenceFieldUpdater4;
            this.f10093e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: a */
        boolean mo11808a(AbstractC2553a<?> abstractC2553a, e eVar, e eVar2) {
            return C0540b.m2514a(this.f10092d, abstractC2553a, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: b */
        boolean mo11809b(AbstractC2553a<?> abstractC2553a, Object obj, Object obj2) {
            return C0540b.m2514a(this.f10093e, abstractC2553a, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: c */
        boolean mo11810c(AbstractC2553a<?> abstractC2553a, l lVar, l lVar2) {
            return C0540b.m2514a(this.f10091c, abstractC2553a, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: d */
        e mo11811d(AbstractC2553a<?> abstractC2553a, e eVar) {
            return this.f10092d.getAndSet(abstractC2553a, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: e */
        l mo11812e(AbstractC2553a<?> abstractC2553a, l lVar) {
            return this.f10091c.getAndSet(abstractC2553a, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: f */
        void mo11813f(l lVar, l lVar2) {
            this.f10090b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: g */
        void mo11814g(l lVar, Thread thread) {
            this.f10089a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: n */
        final AbstractC2553a<V> f10094n;

        /* renamed from: o */
        final InterfaceFutureC2565m<? extends V> f10095o;

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC2553a) this.f10094n).f10076n != this) {
                return;
            }
            if (AbstractC2553a.f10074s.mo11809b(this.f10094n, this, AbstractC2553a.m11798v(this.f10095o))) {
                AbstractC2553a.m11795s(this.f10094n);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    /* loaded from: classes.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: a */
        boolean mo11808a(AbstractC2553a<?> abstractC2553a, e eVar, e eVar2) {
            synchronized (abstractC2553a) {
                if (((AbstractC2553a) abstractC2553a).f10077o != eVar) {
                    return false;
                }
                ((AbstractC2553a) abstractC2553a).f10077o = eVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: b */
        boolean mo11809b(AbstractC2553a<?> abstractC2553a, Object obj, Object obj2) {
            synchronized (abstractC2553a) {
                if (((AbstractC2553a) abstractC2553a).f10076n != obj) {
                    return false;
                }
                ((AbstractC2553a) abstractC2553a).f10076n = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: c */
        boolean mo11810c(AbstractC2553a<?> abstractC2553a, l lVar, l lVar2) {
            synchronized (abstractC2553a) {
                if (((AbstractC2553a) abstractC2553a).f10078p != lVar) {
                    return false;
                }
                ((AbstractC2553a) abstractC2553a).f10078p = lVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: d */
        e mo11811d(AbstractC2553a<?> abstractC2553a, e eVar) {
            e eVar2;
            synchronized (abstractC2553a) {
                eVar2 = ((AbstractC2553a) abstractC2553a).f10077o;
                if (eVar2 != eVar) {
                    ((AbstractC2553a) abstractC2553a).f10077o = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: e */
        l mo11812e(AbstractC2553a<?> abstractC2553a, l lVar) {
            l lVar2;
            synchronized (abstractC2553a) {
                lVar2 = ((AbstractC2553a) abstractC2553a).f10078p;
                if (lVar2 != lVar) {
                    ((AbstractC2553a) abstractC2553a).f10078p = lVar;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: f */
        void mo11813f(l lVar, l lVar2) {
            lVar.f10104b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: g */
        void mo11814g(l lVar, Thread thread) {
            lVar.f10103a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.a$i */
    /* loaded from: classes.dex */
    public interface i<V> extends InterfaceFutureC2565m<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.a$j */
    /* loaded from: classes.dex */
    public static abstract class j<V> extends AbstractC2553a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.AbstractC2553a, com.google.common.util.concurrent.InterfaceFutureC2565m
        /* renamed from: b */
        public void mo2501b(Runnable runnable, Executor executor) {
            super.mo2501b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a, java.util.concurrent.Future
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$k */
    /* loaded from: classes.dex */
    private static final class k extends b {

        /* renamed from: a */
        static final Unsafe f10096a;

        /* renamed from: b */
        static final long f10097b;

        /* renamed from: c */
        static final long f10098c;

        /* renamed from: d */
        static final long f10099d;

        /* renamed from: e */
        static final long f10100e;

        /* renamed from: f */
        static final long f10101f;

        /* renamed from: com.google.common.util.concurrent.a$k$a */
        /* loaded from: classes.dex */
        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f10098c = unsafe.objectFieldOffset(AbstractC2553a.class.getDeclaredField("p"));
                    f10097b = unsafe.objectFieldOffset(AbstractC2553a.class.getDeclaredField("o"));
                    f10099d = unsafe.objectFieldOffset(AbstractC2553a.class.getDeclaredField("n"));
                    f10100e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f10101f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f10096a = unsafe;
                } catch (Exception e10) {
                    C3078j.m13566e(e10);
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: a */
        boolean mo11808a(AbstractC2553a<?> abstractC2553a, e eVar, e eVar2) {
            return C2554b.m11818a(f10096a, abstractC2553a, f10097b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: b */
        boolean mo11809b(AbstractC2553a<?> abstractC2553a, Object obj, Object obj2) {
            return C2554b.m11818a(f10096a, abstractC2553a, f10099d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: c */
        boolean mo11810c(AbstractC2553a<?> abstractC2553a, l lVar, l lVar2) {
            return C2554b.m11818a(f10096a, abstractC2553a, f10098c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: d */
        e mo11811d(AbstractC2553a<?> abstractC2553a, e eVar) {
            e eVar2;
            do {
                eVar2 = ((AbstractC2553a) abstractC2553a).f10077o;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!mo11808a(abstractC2553a, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: e */
        l mo11812e(AbstractC2553a<?> abstractC2553a, l lVar) {
            l lVar2;
            do {
                lVar2 = ((AbstractC2553a) abstractC2553a).f10078p;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!mo11810c(abstractC2553a, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: f */
        void mo11813f(l lVar, l lVar2) {
            f10096a.putObject(lVar, f10101f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC2553a.b
        /* renamed from: g */
        void mo11814g(l lVar, Thread thread) {
            f10096a.putObject(lVar, f10100e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$l */
    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: c */
        static final l f10102c = new l(false);

        /* renamed from: a */
        volatile Thread f10103a;

        /* renamed from: b */
        volatile l f10104b;

        l() {
            AbstractC2553a.f10074s.mo11814g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        /* renamed from: a */
        void m11816a(l lVar) {
            AbstractC2553a.f10074s.mo11813f(this, lVar);
        }

        /* renamed from: b */
        void m11817b() {
            Thread thread = this.f10103a;
            if (thread != null) {
                this.f10103a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.util.concurrent.a$a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.common.util.concurrent.a$k] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.common.util.concurrent.a$f] */
    static {
        boolean z10;
        h hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f10072q = z10;
        f10073r = Logger.getLogger(AbstractC2553a.class.getName());
        ?? r12 = 0;
        r12 = 0;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2553a.class, l.class, "p"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2553a.class, e.class, "o"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2553a.class, Object.class, "n"));
            } catch (Throwable th2) {
                hVar = new h();
                r12 = th2;
            }
        }
        f10074s = hVar;
        if (r12 != 0) {
            ?? r02 = f10073r;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", th);
            r02.log(level, "SafeAtomicHelper is broken!", r12);
        }
        f10075t = new Object();
    }

    protected AbstractC2553a() {
    }

    /* renamed from: A */
    private void m11779A(l lVar) {
        lVar.f10103a = null;
        while (true) {
            l lVar2 = this.f10078p;
            if (lVar2 == l.f10102c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f10104b;
                if (lVar2.f10103a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f10104b = lVar4;
                    if (lVar3.f10103a == null) {
                        break;
                    }
                } else if (!f10074s.mo11810c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* renamed from: l */
    private void m11789l(StringBuilder sb2) {
        try {
            Object m11799w = m11799w(this);
            sb2.append("SUCCESS, result=[");
            m11791o(sb2, m11799w);
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

    /* renamed from: m */
    private void m11790m(StringBuilder sb2) {
        String sb3;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f10076n;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            m11792p(sb2, ((g) obj).f10095o);
            sb2.append("]");
        } else {
            try {
                sb3 = C3077i.m13558a(mo11807y());
            } catch (RuntimeException | StackOverflowError e10) {
                String valueOf = String.valueOf(e10.getClass());
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                sb4.append("Exception thrown from implementation: ");
                sb4.append(valueOf);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                sb2.append(", info=[");
                sb2.append(sb3);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m11789l(sb2);
        }
    }

    /* renamed from: o */
    private void m11791o(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: p */
    private void m11792p(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    /* renamed from: q */
    private static CancellationException m11793q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: r */
    private e m11794r(e eVar) {
        e eVar2 = eVar;
        e mo11811d = f10074s.mo11811d(this, e.f10085d);
        while (mo11811d != null) {
            e eVar3 = mo11811d.f10088c;
            mo11811d.f10088c = eVar2;
            eVar2 = mo11811d;
            mo11811d = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static void m11795s(AbstractC2553a<?> abstractC2553a) {
        e eVar = null;
        while (true) {
            abstractC2553a.m11800z();
            abstractC2553a.mo11805n();
            e m11794r = abstractC2553a.m11794r(eVar);
            while (m11794r != null) {
                eVar = m11794r.f10088c;
                Runnable runnable = m11794r.f10086a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC2553a = gVar.f10094n;
                    if (((AbstractC2553a) abstractC2553a).f10076n == gVar) {
                        if (f10074s.mo11809b(abstractC2553a, gVar, m11798v(gVar.f10095o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m11794r.f10087b;
                    Objects.requireNonNull(executor);
                    m11796t(runnable2, executor);
                }
                m11794r = eVar;
            }
            return;
        }
    }

    /* renamed from: t */
    private static void m11796t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f10073r;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private V m11797u(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f10084a);
            }
            return obj == f10075t ? (V) C2567o.m11861b() : obj;
        }
        throw m11793q("Task was cancelled.", ((c) obj).f10082b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static Object m11798v(InterfaceFutureC2565m<?> interfaceFutureC2565m) {
        Throwable m14543a;
        if (interfaceFutureC2565m instanceof i) {
            Object obj = ((AbstractC2553a) interfaceFutureC2565m).f10076n;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f10081a) {
                    obj = cVar.f10082b != null ? new c(false, cVar.f10082b) : c.f10080d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((interfaceFutureC2565m instanceof AbstractC3282a) && (m14543a = C3283b.m14543a((AbstractC3282a) interfaceFutureC2565m)) != null) {
            return new d(m14543a);
        }
        boolean isCancelled = interfaceFutureC2565m.isCancelled();
        if ((!f10072q) & isCancelled) {
            c cVar2 = c.f10080d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object m11799w = m11799w(interfaceFutureC2565m);
            if (!isCancelled) {
                return m11799w == null ? f10075t : m11799w;
            }
            String valueOf = String.valueOf(interfaceFutureC2565m);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(valueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e10) {
            if (!isCancelled) {
                String valueOf2 = String.valueOf(interfaceFutureC2565m);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf2);
                return new d(new IllegalArgumentException(sb3.toString(), e10));
            }
            return new c(false, e10);
        } catch (ExecutionException e11) {
            if (isCancelled) {
                String valueOf3 = String.valueOf(interfaceFutureC2565m);
                StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
                sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb4.append(valueOf3);
                return new c(false, new IllegalArgumentException(sb4.toString(), e11));
            }
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: w */
    private static <V> V m11799w(Future<V> future) throws ExecutionException {
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

    /* renamed from: z */
    private void m11800z() {
        for (l mo11812e = f10074s.mo11812e(this, l.f10102c); mo11812e != null; mo11812e = mo11812e.f10104b) {
            mo11812e.m11817b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo11801B(V v10) {
        if (v10 == null) {
            v10 = (V) f10075t;
        }
        if (!f10074s.mo11809b(this, null, v10)) {
            return false;
        }
        m11795s(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public boolean m11802C(Throwable th) {
        if (!f10074s.mo11809b(this, null, new d((Throwable) C3075g.m13551f(th)))) {
            return false;
        }
        m11795s(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean m11803D() {
        Object obj = this.f10076n;
        return (obj instanceof c) && ((c) obj).f10081a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p086g5.AbstractC3282a
    /* renamed from: a */
    public final Throwable mo11804a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f10076n;
        if (obj instanceof d) {
            return ((d) obj).f10084a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
    /* renamed from: b */
    public void mo2501b(Runnable runnable, Executor executor) {
        e eVar;
        C3075g.m13552g(runnable, "Runnable was null.");
        C3075g.m13552g(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f10077o) != e.f10085d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f10088c = eVar;
                if (f10074s.mo11808a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f10077o;
                }
            } while (eVar != e.f10085d);
        }
        m11796t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f10076n;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f10072q) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            if (z10) {
                cVar = c.f10079c;
            } else {
                cVar = c.f10080d;
            }
            Objects.requireNonNull(cVar);
        }
        boolean z11 = false;
        AbstractC2553a<V> abstractC2553a = this;
        while (true) {
            if (f10074s.mo11809b(abstractC2553a, obj, cVar)) {
                if (z10) {
                    abstractC2553a.mo11806x();
                }
                m11795s(abstractC2553a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC2565m<? extends V> interfaceFutureC2565m = ((g) obj).f10095o;
                if (interfaceFutureC2565m instanceof i) {
                    abstractC2553a = (AbstractC2553a) interfaceFutureC2565m;
                    obj = abstractC2553a.f10076n;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    interfaceFutureC2565m.cancel(z10);
                    return true;
                }
            } else {
                obj = abstractC2553a.f10076n;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f10076n;
            if ((obj != null) & (!(obj instanceof g))) {
                return m11797u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l lVar = this.f10078p;
                if (lVar != l.f10102c) {
                    l lVar2 = new l();
                    do {
                        lVar2.m11816a(lVar);
                        if (f10074s.mo11810c(this, lVar, lVar2)) {
                            do {
                                C2568p.m11862a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f10076n;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return m11797u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m11779A(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m11779A(lVar2);
                        } else {
                            lVar = this.f10078p;
                        }
                    } while (lVar != l.f10102c);
                }
                Object obj3 = this.f10076n;
                Objects.requireNonNull(obj3);
                return m11797u(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f10076n;
                if ((obj4 != null) & (!(obj4 instanceof g))) {
                    return m11797u(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC2553a = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb2.append("Waited ");
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb3).concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z10) {
                        sb5 = String.valueOf(sb5).concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z10) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(abstractC2553a).length());
            sb7.append(sb3);
            sb7.append(" for ");
            sb7.append(abstractC2553a);
            throw new TimeoutException(sb7.toString());
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10076n instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f10076n != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo11805n() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m11789l(sb2);
        } else {
            m11790m(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: x */
    protected void mo11806x() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public String mo11807y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f10085d = new e();

        /* renamed from: a */
        final Runnable f10086a;

        /* renamed from: b */
        final Executor f10087b;

        /* renamed from: c */
        e f10088c;

        e(Runnable runnable, Executor executor) {
            this.f10086a = runnable;
            this.f10087b = executor;
        }

        e() {
            this.f10086a = null;
            this.f10087b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10076n;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m11797u(obj2);
            }
            l lVar = this.f10078p;
            if (lVar != l.f10102c) {
                l lVar2 = new l();
                do {
                    lVar2.m11816a(lVar);
                    if (f10074s.mo11810c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10076n;
                            } else {
                                m11779A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m11797u(obj);
                    }
                    lVar = this.f10078p;
                } while (lVar != l.f10102c);
            }
            Object obj3 = this.f10076n;
            Objects.requireNonNull(obj3);
            return m11797u(obj3);
        }
        throw new InterruptedException();
    }
}
