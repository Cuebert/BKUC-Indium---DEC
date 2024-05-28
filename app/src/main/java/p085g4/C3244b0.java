package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.b0 */
/* loaded from: classes.dex */
final class C3244b0 implements InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13684a;

    /* renamed from: b */
    private final Object f13685b = new Object();

    /* renamed from: c */
    private InterfaceC3251f f13686c;

    public C3244b0(Executor executor, InterfaceC3251f interfaceC3251f) {
        this.f13684a = executor;
        this.f13686c = interfaceC3251f;
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        synchronized (this.f13685b) {
            if (this.f13686c == null) {
                return;
            }
            this.f13684a.execute(new RunnableC3242a0(this, abstractC3263l));
        }
    }
}
