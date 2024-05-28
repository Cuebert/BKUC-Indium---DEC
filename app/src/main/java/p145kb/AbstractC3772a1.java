package p145kb;

import kotlin.jvm.internal.C3844i;

/* renamed from: kb.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC3772a1 extends AbstractC3818r implements InterfaceC3792h0, InterfaceC3817q0 {

    /* renamed from: q */
    public C3775b1 f15810q;

    @Override // p145kb.InterfaceC3792h0
    /* renamed from: b */
    public void mo16042b() {
        m16045t().m16088a0(this);
    }

    @Override // p145kb.InterfaceC3817q0
    /* renamed from: c */
    public boolean mo16043c() {
        return true;
    }

    @Override // p145kb.InterfaceC3817q0
    /* renamed from: d */
    public C3784e1 mo16044d() {
        return null;
    }

    /* renamed from: t */
    public final C3775b1 m16045t() {
        C3775b1 c3775b1 = this.f15810q;
        if (c3775b1 != null) {
            return c3775b1;
        }
        C3844i.m16265r("job");
        return null;
    }

    @Override // p168mb.C3993o
    public String toString() {
        return C3834z.m16239a(this) + '@' + C3834z.m16240b(this) + "[job@" + C3834z.m16240b(m16045t()) + ']';
    }

    /* renamed from: u */
    public final void m16046u(C3775b1 c3775b1) {
        this.f15810q = c3775b1;
    }
}
