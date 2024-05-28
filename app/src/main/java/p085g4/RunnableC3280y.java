package p085g4;

/* renamed from: g4.y */
/* loaded from: classes.dex */
final class RunnableC3280y implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C3281z f13731n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3280y(C3281z c3281z) {
        this.f13731n = c3281z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3249e interfaceC3249e;
        InterfaceC3249e interfaceC3249e2;
        obj = this.f13731n.f13733b;
        synchronized (obj) {
            C3281z c3281z = this.f13731n;
            interfaceC3249e = c3281z.f13734c;
            if (interfaceC3249e != null) {
                interfaceC3249e2 = c3281z.f13734c;
                interfaceC3249e2.mo14487a();
            }
        }
    }
}
