package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.x */
/* loaded from: classes.dex */
final class C3279x<TResult, TContinuationResult> implements InterfaceC3255h<TContinuationResult>, InterfaceC3253g, InterfaceC3249e, InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13728a;

    /* renamed from: b */
    private final InterfaceC3245c f13729b;

    /* renamed from: c */
    private final C3268n0 f13730c;

    public C3279x(Executor executor, InterfaceC3245c interfaceC3245c, C3268n0 c3268n0) {
        this.f13728a = executor;
        this.f13729b = interfaceC3245c;
        this.f13730c = c3268n0;
    }

    @Override // p085g4.InterfaceC3249e
    /* renamed from: a */
    public final void mo14487a() {
        this.f13730c.m14523t();
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        this.f13728a.execute(new RunnableC3278w(this, abstractC3263l));
    }

    @Override // p085g4.InterfaceC3253g
    public final void onFailure(Exception exc) {
        this.f13730c.m14521r(exc);
    }

    @Override // p085g4.InterfaceC3255h
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f13730c.m14522s(tcontinuationresult);
    }
}
