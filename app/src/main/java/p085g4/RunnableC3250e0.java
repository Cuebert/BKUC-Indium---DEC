package p085g4;

/* renamed from: g4.e0 */
/* loaded from: classes.dex */
final class RunnableC3250e0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13692n;

    /* renamed from: o */
    final /* synthetic */ C3252f0 f13693o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3250e0(C3252f0 c3252f0, AbstractC3263l abstractC3263l) {
        this.f13693o = c3252f0;
        this.f13692n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3255h interfaceC3255h;
        InterfaceC3255h interfaceC3255h2;
        obj = this.f13693o.f13695b;
        synchronized (obj) {
            C3252f0 c3252f0 = this.f13693o;
            interfaceC3255h = c3252f0.f13696c;
            if (interfaceC3255h != null) {
                interfaceC3255h2 = c3252f0.f13696c;
                interfaceC3255h2.onSuccess(this.f13692n.mo14504k());
            }
        }
    }
}
