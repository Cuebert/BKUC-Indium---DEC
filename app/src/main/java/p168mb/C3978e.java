package p168mb;

import java.util.Iterator;
import p145kb.C3830x;
import p145kb.InterfaceC3828w;
import p253ta.C4745b;
import va.InterfaceC5001e;

/* renamed from: mb.e */
/* loaded from: classes.dex */
public final class C3978e {
    /* renamed from: a */
    public static final void m16721a(InterfaceC5001e interfaceC5001e, Throwable th) {
        Iterator<InterfaceC3828w> it = C3976d.m16713a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo16234Y(interfaceC5001e, th);
            } catch (Throwable th2) {
                C3976d.m16714b(C3830x.m16236b(th, th2));
            }
        }
        try {
            C4745b.m18896a(th, new C3980f(interfaceC5001e));
        } catch (Throwable unused) {
        }
        C3976d.m16714b(th);
    }
}
