package p145kb;

import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* renamed from: kb.s0 */
/* loaded from: classes.dex */
final class C3821s0 extends AbstractC3785f {

    /* renamed from: n */
    private final InterfaceC3041l<Throwable, C4755l> f15881n;

    /* JADX WARN: Multi-variable type inference failed */
    public C3821s0(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        this.f15881n = interfaceC3041l;
    }

    @Override // p145kb.AbstractC3788g
    /* renamed from: a */
    public void mo16136a(Throwable th) {
        this.f15881n.invoke(th);
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
        mo16136a(th);
        return C4755l.f18582a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C3834z.m16239a(this.f15881n) + '@' + C3834z.m16240b(this) + ']';
    }
}
