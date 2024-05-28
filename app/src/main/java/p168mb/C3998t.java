package p168mb;

import java.util.List;
import p145kb.AbstractC3781d1;
import p253ta.C4746c;

/* renamed from: mb.t */
/* loaded from: classes.dex */
public final class C3998t {

    /* renamed from: a */
    private static final boolean f16413a = true;

    /* renamed from: a */
    private static final C3999u m16802a(Throwable th, String str) {
        if (f16413a) {
            return new C3999u(th, str);
        }
        if (th != null) {
            throw th;
        }
        m16805d();
        throw new C4746c();
    }

    /* renamed from: b */
    public static /* synthetic */ C3999u m16803b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m16802a(th, str);
    }

    /* renamed from: c */
    public static final boolean m16804c(AbstractC3781d1 abstractC3781d1) {
        return abstractC3781d1.mo16122m0() instanceof C3999u;
    }

    /* renamed from: d */
    public static final Void m16805d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC3781d1 m16806e(InterfaceC3996r interfaceC3996r, List<? extends InterfaceC3996r> list) {
        try {
            return interfaceC3996r.mo16573b(list);
        } catch (Throwable th) {
            return m16802a(th, interfaceC3996r.mo16572a());
        }
    }
}
