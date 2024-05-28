package p145kb;

import java.util.concurrent.locks.LockSupport;
import p145kb.AbstractC3801k0;

/* renamed from: kb.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC3804l0 extends AbstractC3798j0 {
    /* renamed from: v0 */
    protected abstract Thread mo16040v0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo16041w0(long j10, AbstractC3801k0.a aVar) {
        RunnableC3771a0.f15808v.m16196I0(j10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x0 */
    public final void m16206x0() {
        Thread mo16040v0 = mo16040v0();
        if (Thread.currentThread() != mo16040v0) {
            C3776c.m16114a();
            LockSupport.unpark(mo16040v0);
        }
    }
}
