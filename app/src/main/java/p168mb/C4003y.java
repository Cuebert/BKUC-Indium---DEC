package p168mb;

import p145kb.AbstractC3770a;
import p145kb.C3822t;
import p290wa.C5485c;
import p303xa.InterfaceC5575d;
import va.InterfaceC4999c;

/* renamed from: mb.y */
/* loaded from: classes.dex */
public class C4003y<T> extends AbstractC3770a<T> implements InterfaceC5575d {

    /* renamed from: q */
    public final InterfaceC4999c<T> f16417q;

    @Override // p145kb.C3775b1
    /* renamed from: I */
    protected final boolean mo16082I() {
        return true;
    }

    @Override // p303xa.InterfaceC5575d
    /* renamed from: a */
    public final InterfaceC5575d mo16161a() {
        InterfaceC4999c<T> interfaceC4999c = this.f16417q;
        if (interfaceC4999c instanceof InterfaceC5575d) {
            return (InterfaceC5575d) interfaceC4999c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p145kb.C3775b1
    /* renamed from: m */
    public void mo16096m(Object obj) {
        InterfaceC4999c m20181a;
        m20181a = C5485c.m20181a(this.f16417q);
        C3984h.m16750c(m20181a, C3822t.m16219a(obj, this.f16417q), null, 2, null);
    }

    @Override // p145kb.AbstractC3770a
    /* renamed from: m0 */
    protected void mo16029m0(Object obj) {
        InterfaceC4999c<T> interfaceC4999c = this.f16417q;
        interfaceC4999c.mo16028d(C3822t.m16219a(obj, interfaceC4999c));
    }
}
