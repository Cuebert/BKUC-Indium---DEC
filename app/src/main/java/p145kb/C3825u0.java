package p145kb;

import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* renamed from: kb.u0 */
/* loaded from: classes.dex */
final class C3825u0 extends AbstractC3772a1 {

    /* renamed from: r */
    private final InterfaceC3041l<Throwable, C4755l> f15884r;

    /* JADX WARN: Multi-variable type inference failed */
    public C3825u0(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        this.f15884r = interfaceC3041l;
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
        mo16100s(th);
        return C4755l.f18582a;
    }

    @Override // p145kb.AbstractC3818r
    /* renamed from: s */
    public void mo16100s(Throwable th) {
        this.f15884r.invoke(th);
    }
}
