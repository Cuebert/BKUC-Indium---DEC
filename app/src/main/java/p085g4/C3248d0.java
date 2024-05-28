package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.d0 */
/* loaded from: classes.dex */
final class C3248d0 implements InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13689a;

    /* renamed from: b */
    private final Object f13690b = new Object();

    /* renamed from: c */
    private InterfaceC3253g f13691c;

    public C3248d0(Executor executor, InterfaceC3253g interfaceC3253g) {
        this.f13689a = executor;
        this.f13691c = interfaceC3253g;
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        if (abstractC3263l.mo14508o() || abstractC3263l.mo14506m()) {
            return;
        }
        synchronized (this.f13690b) {
            if (this.f13691c == null) {
                return;
            }
            this.f13689a.execute(new RunnableC3246c0(this, abstractC3263l));
        }
    }
}
