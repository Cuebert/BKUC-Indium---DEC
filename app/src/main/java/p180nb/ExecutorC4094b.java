package p180nb;

import gb.C3328f;
import java.util.concurrent.Executor;
import p145kb.AbstractC3813o0;
import p145kb.AbstractC3826v;
import p168mb.C3973b0;
import p168mb.C3977d0;
import va.C5002f;
import va.InterfaceC5001e;

/* renamed from: nb.b */
/* loaded from: classes.dex */
public final class ExecutorC4094b extends AbstractC3813o0 implements Executor {

    /* renamed from: q */
    public static final ExecutorC4094b f16646q = new ExecutorC4094b();

    /* renamed from: r */
    private static final AbstractC3826v f16647r;

    static {
        int m14622a;
        int m16719e;
        C4105m c4105m = C4105m.f16667p;
        m14622a = C3328f.m14622a(64, C3973b0.m16703a());
        m16719e = C3977d0.m16719e("kotlinx.coroutines.io.parallelism", m14622a, 0, 0, 12, null);
        f16647r = c4105m.mo16228l0(m16719e);
    }

    private ExecutorC4094b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo16197j0(C5002f.f19102n, runnable);
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        f16647r.mo16197j0(interfaceC5001e, runnable);
    }

    @Override // p145kb.AbstractC3826v
    public String toString() {
        return "Dispatchers.IO";
    }
}
