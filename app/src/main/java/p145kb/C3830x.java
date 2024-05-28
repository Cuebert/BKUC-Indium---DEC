package p145kb;

import p168mb.C3978e;
import p253ta.C4745b;
import va.InterfaceC5001e;

/* renamed from: kb.x */
/* loaded from: classes.dex */
public final class C3830x {
    /* renamed from: a */
    public static final void m16235a(InterfaceC5001e interfaceC5001e, Throwable th) {
        try {
            InterfaceC3828w interfaceC3828w = (InterfaceC3828w) interfaceC5001e.mo16094i(InterfaceC3828w.f15889j);
            if (interfaceC3828w != null) {
                interfaceC3828w.mo16234Y(interfaceC5001e, th);
            } else {
                C3978e.m16721a(interfaceC5001e, th);
            }
        } catch (Throwable th2) {
            C3978e.m16721a(interfaceC5001e, m16236b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m16236b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C4745b.m18896a(runtimeException, th);
        return runtimeException;
    }
}
