package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.h0 */
/* loaded from: classes.dex */
final class C3256h0<TResult, TContinuationResult> implements InterfaceC3255h<TContinuationResult>, InterfaceC3253g, InterfaceC3249e, InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13699a;

    /* renamed from: b */
    private final InterfaceC3261k f13700b;

    /* renamed from: c */
    private final C3268n0 f13701c;

    public C3256h0(Executor executor, InterfaceC3261k interfaceC3261k, C3268n0 c3268n0) {
        this.f13699a = executor;
        this.f13700b = interfaceC3261k;
        this.f13701c = c3268n0;
    }

    @Override // p085g4.InterfaceC3249e
    /* renamed from: a */
    public final void mo14487a() {
        this.f13701c.m14523t();
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        this.f13699a.execute(new RunnableC3254g0(this, abstractC3263l));
    }

    @Override // p085g4.InterfaceC3253g
    public final void onFailure(Exception exc) {
        this.f13701c.m14521r(exc);
    }

    @Override // p085g4.InterfaceC3255h
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f13701c.m14522s(tcontinuationresult);
    }
}
