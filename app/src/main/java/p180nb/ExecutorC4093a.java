package p180nb;

import gb.C3328f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p065eb.AbstractC3108c;
import p145kb.C3776c;
import p145kb.C3834z;
import p168mb.C3971a0;
import p168mb.C4002x;
import p253ta.C4755l;

/* renamed from: nb.a */
/* loaded from: classes.dex */
public final class ExecutorC4093a implements Executor, Closeable {

    /* renamed from: u */
    public static final a f16618u = new a(null);

    /* renamed from: v */
    private static final AtomicLongFieldUpdater f16619v = AtomicLongFieldUpdater.newUpdater(ExecutorC4093a.class, "parkedWorkersStack");

    /* renamed from: w */
    private static final AtomicLongFieldUpdater f16620w = AtomicLongFieldUpdater.newUpdater(ExecutorC4093a.class, "controlState");

    /* renamed from: x */
    private static final AtomicIntegerFieldUpdater f16621x = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4093a.class, "_isTerminated");

    /* renamed from: y */
    public static final C3971a0 f16622y = new C3971a0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: n */
    public final int f16623n;

    /* renamed from: o */
    public final int f16624o;

    /* renamed from: p */
    public final long f16625p;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    public final String f16626q;

    /* renamed from: r */
    public final C4096d f16627r;

    /* renamed from: s */
    public final C4096d f16628s;

    /* renamed from: t */
    public final C4002x<c> f16629t;

    /* renamed from: nb.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    /* renamed from: nb.a$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16630a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16630a = iArr;
        }
    }

    /* renamed from: nb.a$d */
    /* loaded from: classes.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC4093a(int i10, int i11, long j10, String str) {
        this.f16623n = i10;
        this.f16624o = i11;
        this.f16625p = j10;
        this.f16626q = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f16627r = new C4096d();
            this.f16628s = new C4096d();
            this.f16629t = new C4002x<>((i10 + 1) * 2);
            this.controlState = i10 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    /* renamed from: O */
    public static /* synthetic */ void m17034O(ExecutorC4093a executorC4093a, Runnable runnable, InterfaceC4101i interfaceC4101i, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC4101i = C4104l.f16665g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC4093a.m17052z(runnable, interfaceC4101i, z10);
    }

    /* renamed from: Q */
    private final int m17035Q(c cVar) {
        Object m17071i = cVar.m17071i();
        while (m17071i != f16622y) {
            if (m17071i == null) {
                return 0;
            }
            c cVar2 = (c) m17071i;
            int m17070h = cVar2.m17070h();
            if (m17070h != 0) {
                return m17070h;
            }
            m17071i = cVar2.m17071i();
        }
        return -1;
    }

    /* renamed from: T */
    private final c m17036T() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16619v;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c m16810b = this.f16629t.m16810b((int) (2097151 & j10));
            if (m16810b == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int m17035Q = m17035Q(m16810b);
            if (m17035Q >= 0 && f16619v.compareAndSet(this, j10, m17035Q | j11)) {
                m16810b.m17074r(f16622y);
                return m16810b;
            }
        }
    }

    /* renamed from: c */
    private final boolean m17038c(AbstractRunnableC4100h abstractRunnableC4100h) {
        if (abstractRunnableC4100h.f16656o.mo17081b() == 1) {
            return this.f16628s.m16782a(abstractRunnableC4100h);
        }
        return this.f16627r.m16782a(abstractRunnableC4100h);
    }

    /* renamed from: e */
    private final int m17039e() {
        int m14622a;
        synchronized (this.f16629t) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16620w;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            m14622a = C3328f.m14622a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (m14622a >= this.f16623n) {
                return 0;
            }
            if (i10 >= this.f16624o) {
                return 0;
            }
            int i11 = ((int) (f16620w.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f16629t.m16810b(i11) == null) {
                c cVar = new c(this, i11);
                this.f16629t.m16811c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i12 = m14622a + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: j0 */
    private final void m17040j0(long j10, boolean z10) {
        if (z10 || m17045o0() || m17043m0(j10)) {
            return;
        }
        m17045o0();
    }

    /* renamed from: l */
    private final c m17041l() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !C3844i.m16248a(ExecutorC4093a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: l0 */
    private final AbstractRunnableC4100h m17042l0(c cVar, AbstractRunnableC4100h abstractRunnableC4100h, boolean z10) {
        if (cVar == null || cVar.f16634p == d.TERMINATED) {
            return abstractRunnableC4100h;
        }
        if (abstractRunnableC4100h.f16656o.mo17081b() == 0 && cVar.f16634p == d.BLOCKING) {
            return abstractRunnableC4100h;
        }
        cVar.f16638t = true;
        return cVar.f16632n.m17091a(abstractRunnableC4100h, z10);
    }

    /* renamed from: m0 */
    private final boolean m17043m0(long j10) {
        int m14622a;
        m14622a = C3328f.m14622a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (m14622a < this.f16623n) {
            int m17039e = m17039e();
            if (m17039e == 1 && this.f16623n > 1) {
                m17039e();
            }
            if (m17039e > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    static /* synthetic */ boolean m17044n0(ExecutorC4093a executorC4093a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f16620w.get(executorC4093a);
        }
        return executorC4093a.m17043m0(j10);
    }

    /* renamed from: o0 */
    private final boolean m17045o0() {
        c m17036T;
        do {
            m17036T = m17036T();
            if (m17036T == null) {
                return false;
            }
        } while (!c.m17059j().compareAndSet(m17036T, -1, 0));
        LockSupport.unpark(m17036T);
        return true;
    }

    /* renamed from: W */
    public final boolean m17046W(c cVar) {
        long j10;
        int m17070h;
        if (cVar.m17071i() != f16622y) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16619v;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            m17070h = cVar.m17070h();
            cVar.m17074r(this.f16629t.m16810b((int) (2097151 & j10)));
        } while (!f16619v.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | m17070h));
        return true;
    }

    /* renamed from: X */
    public final void m17047X(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16619v;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? m17035Q(cVar) : i11;
            }
            if (i12 >= 0 && f16619v.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    /* renamed from: Y */
    public final void m17048Y(AbstractRunnableC4100h abstractRunnableC4100h) {
        try {
            abstractRunnableC4100h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m17049e0(10000L);
    }

    /* renamed from: e0 */
    public final void m17049e0(long j10) {
        int i10;
        AbstractRunnableC4100h m16785d;
        if (f16621x.compareAndSet(this, 0, 1)) {
            c m17041l = m17041l();
            synchronized (this.f16629t) {
                i10 = (int) (f16620w.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c m16810b = this.f16629t.m16810b(i11);
                    C3844i.m16250c(m16810b);
                    c cVar = m16810b;
                    if (cVar != m17041l) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f16632n.m17093f(this.f16628s);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f16628s.m16783b();
            this.f16627r.m16783b();
            while (true) {
                if (m17041l != null) {
                    m16785d = m17041l.m17069g(true);
                    if (m16785d != null) {
                        continue;
                        m17048Y(m16785d);
                    }
                }
                m16785d = this.f16627r.m16785d();
                if (m16785d == null && (m16785d = this.f16628s.m16785d()) == null) {
                    break;
                }
                m17048Y(m16785d);
            }
            if (m17041l != null) {
                m17041l.m17075u(d.TERMINATED);
            }
            f16619v.set(this, 0L);
            f16620w.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m17034O(this, runnable, null, false, 6, null);
    }

    /* renamed from: i */
    public final AbstractRunnableC4100h m17050i(Runnable runnable, InterfaceC4101i interfaceC4101i) {
        long mo17077a = C4104l.f16664f.mo17077a();
        if (runnable instanceof AbstractRunnableC4100h) {
            AbstractRunnableC4100h abstractRunnableC4100h = (AbstractRunnableC4100h) runnable;
            abstractRunnableC4100h.f16655n = mo17077a;
            abstractRunnableC4100h.f16656o = interfaceC4101i;
            return abstractRunnableC4100h;
        }
        return new C4103k(runnable, mo17077a, interfaceC4101i);
    }

    public final boolean isTerminated() {
        return f16621x.get(this) != 0;
    }

    /* renamed from: k0 */
    public final void m17051k0() {
        if (m17045o0() || m17044n0(this, 0L, 1, null)) {
            return;
        }
        m17045o0();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m16809a = this.f16629t.m16809a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < m16809a; i15++) {
            c m16810b = this.f16629t.m16810b(i15);
            if (m16810b != null) {
                int m17092e = m16810b.f16632n.m17092e();
                int i16 = b.f16630a[m16810b.f16634p.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m17092e);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m17092e);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (m17092e > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m17092e);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f16620w.get(this);
        return this.f16626q + '@' + C3834z.m16240b(this) + "[Pool Size {core = " + this.f16623n + ", max = " + this.f16624o + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f16627r.m16784c() + ", global blocking queue size = " + this.f16628s.m16784c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f16623n - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: z */
    public final void m17052z(Runnable runnable, InterfaceC4101i interfaceC4101i, boolean z10) {
        C3776c.m16114a();
        AbstractRunnableC4100h m17050i = m17050i(runnable, interfaceC4101i);
        boolean z11 = false;
        boolean z12 = m17050i.f16656o.mo17081b() == 1;
        long addAndGet = z12 ? f16620w.addAndGet(this, 2097152L) : 0L;
        c m17041l = m17041l();
        AbstractRunnableC4100h m17042l0 = m17042l0(m17041l, m17050i, z10);
        if (m17042l0 != null && !m17038c(m17042l0)) {
            throw new RejectedExecutionException(this.f16626q + " was terminated");
        }
        if (z10 && m17041l != null) {
            z11 = true;
        }
        if (z12) {
            m17040j0(addAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            m17051k0();
        }
    }

    /* renamed from: nb.a$c */
    /* loaded from: classes.dex */
    public final class c extends Thread {

        /* renamed from: v */
        private static final AtomicIntegerFieldUpdater f16631v = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: n */
        public final C4106n f16632n;
        private volatile Object nextParkedWorker;

        /* renamed from: o */
        private final C3850o<AbstractRunnableC4100h> f16633o;

        /* renamed from: p */
        public d f16634p;

        /* renamed from: q */
        private long f16635q;

        /* renamed from: r */
        private long f16636r;

        /* renamed from: s */
        private int f16637s;

        /* renamed from: t */
        public boolean f16638t;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f16632n = new C4106n();
            this.f16633o = new C3850o<>();
            this.f16634p = d.DORMANT;
            this.nextParkedWorker = ExecutorC4093a.f16622y;
            this.f16637s = AbstractC3108c.f13048n.mo13665b();
        }

        /* renamed from: b */
        private final void m17054b(int i10) {
            if (i10 == 0) {
                return;
            }
            ExecutorC4093a.f16620w.addAndGet(ExecutorC4093a.this, -2097152L);
            if (this.f16634p != d.TERMINATED) {
                this.f16634p = d.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m17055c(int i10) {
            if (i10 != 0 && m17075u(d.BLOCKING)) {
                ExecutorC4093a.this.m17051k0();
            }
        }

        /* renamed from: d */
        private final void m17056d(AbstractRunnableC4100h abstractRunnableC4100h) {
            int mo17081b = abstractRunnableC4100h.f16656o.mo17081b();
            m17060k(mo17081b);
            m17055c(mo17081b);
            ExecutorC4093a.this.m17048Y(abstractRunnableC4100h);
            m17054b(mo17081b);
        }

        /* renamed from: e */
        private final AbstractRunnableC4100h m17057e(boolean z10) {
            AbstractRunnableC4100h m17063o;
            AbstractRunnableC4100h m17063o2;
            if (z10) {
                boolean z11 = m17072m(ExecutorC4093a.this.f16623n * 2) == 0;
                if (z11 && (m17063o2 = m17063o()) != null) {
                    return m17063o2;
                }
                AbstractRunnableC4100h m17094g = this.f16632n.m17094g();
                if (m17094g != null) {
                    return m17094g;
                }
                if (!z11 && (m17063o = m17063o()) != null) {
                    return m17063o;
                }
            } else {
                AbstractRunnableC4100h m17063o3 = m17063o();
                if (m17063o3 != null) {
                    return m17063o3;
                }
            }
            return m17067v(3);
        }

        /* renamed from: f */
        private final AbstractRunnableC4100h m17058f() {
            AbstractRunnableC4100h m17095h = this.f16632n.m17095h();
            if (m17095h != null) {
                return m17095h;
            }
            AbstractRunnableC4100h m16785d = ExecutorC4093a.this.f16628s.m16785d();
            return m16785d == null ? m17067v(1) : m16785d;
        }

        /* renamed from: j */
        public static final AtomicIntegerFieldUpdater m17059j() {
            return f16631v;
        }

        /* renamed from: k */
        private final void m17060k(int i10) {
            this.f16635q = 0L;
            if (this.f16634p == d.PARKING) {
                this.f16634p = d.BLOCKING;
            }
        }

        /* renamed from: l */
        private final boolean m17061l() {
            return this.nextParkedWorker != ExecutorC4093a.f16622y;
        }

        /* renamed from: n */
        private final void m17062n() {
            if (this.f16635q == 0) {
                this.f16635q = System.nanoTime() + ExecutorC4093a.this.f16625p;
            }
            LockSupport.parkNanos(ExecutorC4093a.this.f16625p);
            if (System.nanoTime() - this.f16635q >= 0) {
                this.f16635q = 0L;
                m17068w();
            }
        }

        /* renamed from: o */
        private final AbstractRunnableC4100h m17063o() {
            if (m17072m(2) == 0) {
                AbstractRunnableC4100h m16785d = ExecutorC4093a.this.f16627r.m16785d();
                return m16785d != null ? m16785d : ExecutorC4093a.this.f16628s.m16785d();
            }
            AbstractRunnableC4100h m16785d2 = ExecutorC4093a.this.f16628s.m16785d();
            return m16785d2 != null ? m16785d2 : ExecutorC4093a.this.f16627r.m16785d();
        }

        /* renamed from: p */
        private final void m17064p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC4093a.this.isTerminated() && this.f16634p != d.TERMINATED) {
                    AbstractRunnableC4100h m17069g = m17069g(this.f16638t);
                    if (m17069g != null) {
                        this.f16636r = 0L;
                        m17056d(m17069g);
                    } else {
                        this.f16638t = false;
                        if (this.f16636r == 0) {
                            m17066t();
                        } else if (z10) {
                            m17075u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f16636r);
                            this.f16636r = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            m17075u(d.TERMINATED);
        }

        /* renamed from: s */
        private final boolean m17065s() {
            boolean z10;
            if (this.f16634p != d.CPU_ACQUIRED) {
                ExecutorC4093a executorC4093a = ExecutorC4093a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4093a.f16620w;
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(executorC4093a);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (ExecutorC4093a.f16620w.compareAndSet(executorC4093a, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f16634p = d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: t */
        private final void m17066t() {
            if (!m17061l()) {
                ExecutorC4093a.this.m17046W(this);
                return;
            }
            f16631v.set(this, -1);
            while (m17061l() && f16631v.get(this) == -1 && !ExecutorC4093a.this.isTerminated() && this.f16634p != d.TERMINATED) {
                m17075u(d.PARKING);
                Thread.interrupted();
                m17062n();
            }
        }

        /* renamed from: v */
        private final AbstractRunnableC4100h m17067v(int i10) {
            int i11 = (int) (ExecutorC4093a.f16620w.get(ExecutorC4093a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m17072m = m17072m(i11);
            ExecutorC4093a executorC4093a = ExecutorC4093a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m17072m++;
                if (m17072m > i11) {
                    m17072m = 1;
                }
                c m16810b = executorC4093a.f16629t.m16810b(m17072m);
                if (m16810b != null && m16810b != this) {
                    long m17096n = m16810b.f16632n.m17096n(i10, this.f16633o);
                    if (m17096n == -1) {
                        C3850o<AbstractRunnableC4100h> c3850o = this.f16633o;
                        AbstractRunnableC4100h abstractRunnableC4100h = c3850o.f15904n;
                        c3850o.f15904n = null;
                        return abstractRunnableC4100h;
                    }
                    if (m17096n > 0) {
                        j10 = Math.min(j10, m17096n);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f16636r = j10;
            return null;
        }

        /* renamed from: w */
        private final void m17068w() {
            ExecutorC4093a executorC4093a = ExecutorC4093a.this;
            synchronized (executorC4093a.f16629t) {
                if (executorC4093a.isTerminated()) {
                    return;
                }
                if (((int) (ExecutorC4093a.f16620w.get(executorC4093a) & 2097151)) <= executorC4093a.f16623n) {
                    return;
                }
                if (f16631v.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    m17073q(0);
                    executorC4093a.m17047X(this, i10, 0);
                    int andDecrement = (int) (ExecutorC4093a.f16620w.getAndDecrement(executorC4093a) & 2097151);
                    if (andDecrement != i10) {
                        c m16810b = executorC4093a.f16629t.m16810b(andDecrement);
                        C3844i.m16250c(m16810b);
                        c cVar = m16810b;
                        executorC4093a.f16629t.m16811c(i10, cVar);
                        cVar.m17073q(i10);
                        executorC4093a.m17047X(cVar, andDecrement, i10);
                    }
                    executorC4093a.f16629t.m16811c(andDecrement, null);
                    C4755l c4755l = C4755l.f18582a;
                    this.f16634p = d.TERMINATED;
                }
            }
        }

        /* renamed from: g */
        public final AbstractRunnableC4100h m17069g(boolean z10) {
            return m17065s() ? m17057e(z10) : m17058f();
        }

        /* renamed from: h */
        public final int m17070h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m17071i() {
            return this.nextParkedWorker;
        }

        /* renamed from: m */
        public final int m17072m(int i10) {
            int i11 = this.f16637s;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f16637s = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* renamed from: q */
        public final void m17073q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC4093a.this.f16626q);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: r */
        public final void m17074r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m17064p();
        }

        /* renamed from: u */
        public final boolean m17075u(d dVar) {
            d dVar2 = this.f16634p;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                ExecutorC4093a.f16620w.addAndGet(ExecutorC4093a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f16634p = dVar;
            }
            return z10;
        }

        public c(ExecutorC4093a executorC4093a, int i10) {
            this();
            m17073q(i10);
        }
    }
}
