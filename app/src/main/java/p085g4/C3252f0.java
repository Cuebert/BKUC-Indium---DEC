package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.f0 */
/* loaded from: classes.dex */
final class C3252f0 implements InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13694a;

    /* renamed from: b */
    private final Object f13695b = new Object();

    /* renamed from: c */
    private InterfaceC3255h f13696c;

    public C3252f0(Executor executor, InterfaceC3255h interfaceC3255h) {
        this.f13694a = executor;
        this.f13696c = interfaceC3255h;
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        if (abstractC3263l.mo14508o()) {
            synchronized (this.f13695b) {
                if (this.f13696c == null) {
                    return;
                }
                this.f13694a.execute(new RunnableC3250e0(this, abstractC3263l));
            }
        }
    }
}
