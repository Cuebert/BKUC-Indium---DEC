package p003a2;

import p307y1.AbstractC5594c;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;
import p307y1.InterfaceC5597f;
import p307y1.InterfaceC5599h;

/* renamed from: a2.r */
/* loaded from: classes.dex */
final class C0023r<T> implements InterfaceC5597f<T> {

    /* renamed from: a */
    private final AbstractC0020o f171a;

    /* renamed from: b */
    private final String f172b;

    /* renamed from: c */
    private final C5593b f173c;

    /* renamed from: d */
    private final InterfaceC5596e<T, byte[]> f174d;

    /* renamed from: e */
    private final InterfaceC0024s f175e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0023r(AbstractC0020o abstractC0020o, String str, C5593b c5593b, InterfaceC5596e<T, byte[]> interfaceC5596e, InterfaceC0024s interfaceC0024s) {
        this.f171a = abstractC0020o;
        this.f172b = str;
        this.f173c = c5593b;
        this.f174d = interfaceC5596e;
        this.f175e = interfaceC0024s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m154c(Exception exc) {
    }

    @Override // p307y1.InterfaceC5597f
    /* renamed from: a */
    public void mo155a(AbstractC5594c<T> abstractC5594c) {
        m156d(abstractC5594c, new InterfaceC5599h() { // from class: a2.q
            @Override // p307y1.InterfaceC5599h
            /* renamed from: a */
            public final void mo152a(Exception exc) {
                C0023r.m154c(exc);
            }
        });
    }

    /* renamed from: d */
    public void m156d(AbstractC5594c<T> abstractC5594c, InterfaceC5599h interfaceC5599h) {
        this.f175e.mo157a(AbstractC0019n.m146a().mo110e(this.f171a).mo108c(abstractC5594c).mo111f(this.f172b).mo109d(this.f174d).mo107b(this.f173c).mo106a(), interfaceC5599h);
    }
}
