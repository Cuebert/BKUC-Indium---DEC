package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import kotlin.jvm.internal.C3844i;
import p145kb.C3835z0;
import va.InterfaceC5001e;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0841h implements InterfaceC0843j {

    /* renamed from: n */
    private final AbstractC0839f f4228n;

    /* renamed from: o */
    private final InterfaceC5001e f4229o;

    /* renamed from: a */
    public InterfaceC5001e m4853a() {
        return this.f4229o;
    }

    /* renamed from: b */
    public AbstractC0839f m4854b() {
        return this.f4228n;
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l source, AbstractC0839f.b event) {
        C3844i.m16254g(source, "source");
        C3844i.m16254g(event, "event");
        if (m4854b().mo4890b().compareTo(AbstractC0839f.c.DESTROYED) <= 0) {
            m4854b().mo4891c(this);
            C3835z0.m16243b(m4853a(), null, 1, null);
        }
    }
}
