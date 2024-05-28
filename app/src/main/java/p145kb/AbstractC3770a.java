package p145kb;

import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.a */
/* loaded from: classes.dex */
public abstract class AbstractC3770a<T> extends C3775b1 implements InterfaceC4999c<T> {

    /* renamed from: p */
    private final InterfaceC5001e f15807p;

    @Override // p145kb.C3775b1
    /* renamed from: H */
    public final void mo16024H(Throwable th) {
        C3830x.m16235a(this.f15807p, th);
    }

    @Override // p145kb.C3775b1
    /* renamed from: M */
    public String mo16025M() {
        String m16223a = C3824u.m16223a(this.f15807p);
        if (m16223a == null) {
            return super.mo16025M();
        }
        return '\"' + m16223a + "\":" + super.mo16025M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p145kb.C3775b1
    /* renamed from: U */
    protected final void mo16026U(Object obj) {
        if (obj instanceof C3814p) {
            C3814p c3814p = (C3814p) obj;
            m16030n0(c3814p.f15876a, c3814p.m16217a());
        } else {
            m16031o0(obj);
        }
    }

    @Override // p145kb.C3775b1, p145kb.InterfaceC3827v0
    /* renamed from: c */
    public boolean mo16027c() {
        return super.mo16027c();
    }

    @Override // va.InterfaceC4999c
    /* renamed from: d */
    public final void mo16028d(Object obj) {
        Object m16083K = m16083K(C3822t.m16222d(obj, null, 1, null));
        if (m16083K == C3778c1.f15826b) {
            return;
        }
        mo16029m0(m16083K);
    }

    @Override // va.InterfaceC4999c
    public final InterfaceC5001e getContext() {
        return this.f15807p;
    }

    /* renamed from: m0 */
    protected void mo16029m0(Object obj) {
        mo16096m(obj);
    }

    /* renamed from: n0 */
    protected void m16030n0(Throwable th, boolean z10) {
    }

    /* renamed from: o0 */
    protected void m16031o0(T t10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p145kb.C3775b1
    /* renamed from: r */
    public String mo16032r() {
        return C3834z.m16239a(this) + " was cancelled";
    }
}
