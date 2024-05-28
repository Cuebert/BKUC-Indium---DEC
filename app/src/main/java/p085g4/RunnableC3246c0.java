package p085g4;

import p321z2.C5984j;

/* renamed from: g4.c0 */
/* loaded from: classes.dex */
final class RunnableC3246c0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13687n;

    /* renamed from: o */
    final /* synthetic */ C3248d0 f13688o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3246c0(C3248d0 c3248d0, AbstractC3263l abstractC3263l) {
        this.f13688o = c3248d0;
        this.f13687n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3253g interfaceC3253g;
        InterfaceC3253g interfaceC3253g2;
        obj = this.f13688o.f13690b;
        synchronized (obj) {
            C3248d0 c3248d0 = this.f13688o;
            interfaceC3253g = c3248d0.f13691c;
            if (interfaceC3253g != null) {
                interfaceC3253g2 = c3248d0.f13691c;
                interfaceC3253g2.onFailure((Exception) C5984j.m21286j(this.f13687n.mo14503j()));
            }
        }
    }
}
