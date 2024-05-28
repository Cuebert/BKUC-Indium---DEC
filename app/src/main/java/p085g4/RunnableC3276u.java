package p085g4;

/* renamed from: g4.u */
/* loaded from: classes.dex */
final class RunnableC3276u implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13721n;

    /* renamed from: o */
    final /* synthetic */ C3277v f13722o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3276u(C3277v c3277v, AbstractC3263l abstractC3263l) {
        this.f13722o = c3277v;
        this.f13721n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3268n0 c3268n0;
        C3268n0 c3268n02;
        C3268n0 c3268n03;
        InterfaceC3245c interfaceC3245c;
        C3268n0 c3268n04;
        C3268n0 c3268n05;
        if (this.f13721n.mo14506m()) {
            c3268n05 = this.f13722o.f13725c;
            c3268n05.m14523t();
            return;
        }
        try {
            interfaceC3245c = this.f13722o.f13724b;
            Object mo11930a = interfaceC3245c.mo11930a(this.f13721n);
            c3268n04 = this.f13722o.f13725c;
            c3268n04.m14522s(mo11930a);
        } catch (C3259j e10) {
            if (e10.getCause() instanceof Exception) {
                c3268n03 = this.f13722o.f13725c;
                c3268n03.m14521r((Exception) e10.getCause());
            } else {
                c3268n02 = this.f13722o.f13725c;
                c3268n02.m14521r(e10);
            }
        } catch (Exception e11) {
            c3268n0 = this.f13722o.f13725c;
            c3268n0.m14521r(e11);
        }
    }
}
