package p003a2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p083g2.InterfaceC3234e;
import p095h2.C3384r;
import p095h2.C3388v;
import p136k2.InterfaceC3749a;
import p307y1.C5593b;
import p307y1.InterfaceC5598g;
import p307y1.InterfaceC5599h;

/* renamed from: a2.t */
/* loaded from: classes.dex */
public class C0025t implements InterfaceC0024s {

    /* renamed from: e */
    private static volatile AbstractC0026u f176e;

    /* renamed from: a */
    private final InterfaceC3749a f177a;

    /* renamed from: b */
    private final InterfaceC3749a f178b;

    /* renamed from: c */
    private final InterfaceC3234e f179c;

    /* renamed from: d */
    private final C3384r f180d;

    public C0025t(InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, InterfaceC3234e interfaceC3234e, C3384r c3384r, C3388v c3388v) {
        this.f177a = interfaceC3749a;
        this.f178b = interfaceC3749a2;
        this.f179c = interfaceC3234e;
        this.f180d = c3384r;
        c3388v.m14941c();
    }

    /* renamed from: b */
    private AbstractC0014i m158b(AbstractC0019n abstractC0019n) {
        return AbstractC0014i.m130a().mo98i(this.f177a.mo15955a()).mo100k(this.f178b.mo15955a()).mo99j(abstractC0019n.mo105g()).mo97h(new C0013h(abstractC0019n.mo101b(), abstractC0019n.m147d())).mo96g(abstractC0019n.mo102c().mo20613a()).mo93d();
    }

    /* renamed from: c */
    public static C0025t m159c() {
        AbstractC0026u abstractC0026u = f176e;
        if (abstractC0026u != null) {
            return abstractC0026u.mo122c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C5593b> m160d(InterfaceC0011f interfaceC0011f) {
        if (interfaceC0011f instanceof InterfaceC0012g) {
            return Collections.unmodifiableSet(((InterfaceC0012g) interfaceC0011f).mo127a());
        }
        return Collections.singleton(C5593b.m20616b("proto"));
    }

    /* renamed from: f */
    public static void m161f(Context context) {
        if (f176e == null) {
            synchronized (C0025t.class) {
                if (f176e == null) {
                    f176e = C0010e.m119e().mo124b(context).mo123a();
                }
            }
        }
    }

    @Override // p003a2.InterfaceC0024s
    /* renamed from: a */
    public void mo157a(AbstractC0019n abstractC0019n, InterfaceC5599h interfaceC5599h) {
        this.f179c.mo14465a(abstractC0019n.mo104f().m150f(abstractC0019n.mo102c().mo20615c()), m158b(abstractC0019n), interfaceC5599h);
    }

    /* renamed from: e */
    public C3384r m162e() {
        return this.f180d;
    }

    /* renamed from: g */
    public InterfaceC5598g m163g(InterfaceC0011f interfaceC0011f) {
        return new C0021p(m160d(interfaceC0011f), AbstractC0020o.m148a().mo116b(interfaceC0011f.mo126b()).mo117c(interfaceC0011f.getExtras()).mo115a(), this);
    }
}
