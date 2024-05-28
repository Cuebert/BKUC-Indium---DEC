package p085g4;

/* renamed from: g4.a0 */
/* loaded from: classes.dex */
final class RunnableC3242a0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13681n;

    /* renamed from: o */
    final /* synthetic */ C3244b0 f13682o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3242a0(C3244b0 c3244b0, AbstractC3263l abstractC3263l) {
        this.f13682o = c3244b0;
        this.f13681n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3251f interfaceC3251f;
        InterfaceC3251f interfaceC3251f2;
        obj = this.f13682o.f13685b;
        synchronized (obj) {
            C3244b0 c3244b0 = this.f13682o;
            interfaceC3251f = c3244b0.f13686c;
            if (interfaceC3251f != null) {
                interfaceC3251f2 = c3244b0.f13686c;
                interfaceC3251f2.mo7517a(this.f13681n);
            }
        }
    }
}
