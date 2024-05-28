package p168mb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p145kb.AbstractC3826v;
import p145kb.C3774b0;
import p145kb.C3830x;
import p145kb.InterfaceC3777c0;
import va.C5002f;
import va.InterfaceC5001e;

/* renamed from: mb.k */
/* loaded from: classes.dex */
public final class C3989k extends AbstractC3826v implements InterfaceC3777c0 {

    /* renamed from: u */
    private static final AtomicIntegerFieldUpdater f16386u = AtomicIntegerFieldUpdater.newUpdater(C3989k.class, "runningWorkers");

    /* renamed from: p */
    private final AbstractC3826v f16387p;

    /* renamed from: q */
    private final int f16388q;

    /* renamed from: r */
    private final /* synthetic */ InterfaceC3777c0 f16389r;
    private volatile int runningWorkers;

    /* renamed from: s */
    private final C3994p<Runnable> f16390s;

    /* renamed from: t */
    private final Object f16391t;

    /* renamed from: mb.k$a */
    /* loaded from: classes.dex */
    private final class a implements Runnable {

        /* renamed from: n */
        private Runnable f16392n;

        public a(Runnable runnable) {
            this.f16392n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f16392n.run();
                } catch (Throwable th) {
                    C3830x.m16235a(C5002f.f19102n, th);
                }
                Runnable m16762o0 = C3989k.this.m16762o0();
                if (m16762o0 == null) {
                    return;
                }
                this.f16392n = m16762o0;
                i10++;
                if (i10 >= 16 && C3989k.this.f16387p.mo16205k0(C3989k.this)) {
                    C3989k.this.f16387p.mo16197j0(C3989k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3989k(AbstractC3826v abstractC3826v, int i10) {
        this.f16387p = abstractC3826v;
        this.f16388q = i10;
        InterfaceC3777c0 interfaceC3777c0 = abstractC3826v instanceof InterfaceC3777c0 ? (InterfaceC3777c0) abstractC3826v : null;
        this.f16389r = interfaceC3777c0 == null ? C3774b0.m16047a() : interfaceC3777c0;
        this.f16390s = new C3994p<>(false);
        this.f16391t = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final Runnable m16762o0() {
        while (true) {
            Runnable m16785d = this.f16390s.m16785d();
            if (m16785d != null) {
                return m16785d;
            }
            synchronized (this.f16391t) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16386u;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f16390s.m16784c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: p0 */
    private final boolean m16763p0() {
        synchronized (this.f16391t) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16386u;
            if (atomicIntegerFieldUpdater.get(this) >= this.f16388q) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        Runnable m16762o0;
        this.f16390s.m16782a(runnable);
        if (f16386u.get(this) >= this.f16388q || !m16763p0() || (m16762o0 = m16762o0()) == null) {
            return;
        }
        this.f16387p.mo16197j0(this, new a(m16762o0));
    }
}
