package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import kotlin.jvm.internal.C3844i;
import p145kb.InterfaceC3827v0;

/* loaded from: classes.dex */
final class LifecycleController$observer$1 implements InterfaceC0843j {

    /* renamed from: n */
    final /* synthetic */ InterfaceC3827v0 f4227n;

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public final void mo592e(InterfaceC0845l source, AbstractC0839f.b bVar) {
        C3844i.m16254g(source, "source");
        C3844i.m16254g(bVar, "<anonymous parameter 1>");
        AbstractC0839f mo583f = source.mo583f();
        C3844i.m16249b(mo583f, "source.lifecycle");
        if (mo583f.mo4890b() != AbstractC0839f.c.DESTROYED) {
            AbstractC0839f mo583f2 = source.mo583f();
            C3844i.m16249b(mo583f2, "source.lifecycle");
            if (mo583f2.mo4890b().compareTo(C0840g.m4897b(null)) < 0) {
                C0840g.m4896a(null);
                throw null;
            }
            C0840g.m4896a(null);
            throw null;
        }
        InterfaceC3827v0.a.m16230a(this.f4227n, null, 1, null);
        throw null;
    }
}
