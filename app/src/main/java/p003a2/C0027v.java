package p003a2;

import p028c2.InterfaceC1124b;
import p083g2.InterfaceC3234e;
import p095h2.C3384r;
import p095h2.C3388v;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: a2.v */
/* loaded from: classes.dex */
public final class C0027v implements InterfaceC1124b<C0025t> {

    /* renamed from: a */
    private final InterfaceC4551a<InterfaceC3749a> f181a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC3749a> f182b;

    /* renamed from: c */
    private final InterfaceC4551a<InterfaceC3234e> f183c;

    /* renamed from: d */
    private final InterfaceC4551a<C3384r> f184d;

    /* renamed from: e */
    private final InterfaceC4551a<C3388v> f185e;

    public C0027v(InterfaceC4551a<InterfaceC3749a> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<InterfaceC3234e> interfaceC4551a3, InterfaceC4551a<C3384r> interfaceC4551a4, InterfaceC4551a<C3388v> interfaceC4551a5) {
        this.f181a = interfaceC4551a;
        this.f182b = interfaceC4551a2;
        this.f183c = interfaceC4551a3;
        this.f184d = interfaceC4551a4;
        this.f185e = interfaceC4551a5;
    }

    /* renamed from: a */
    public static C0027v m164a(InterfaceC4551a<InterfaceC3749a> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<InterfaceC3234e> interfaceC4551a3, InterfaceC4551a<C3384r> interfaceC4551a4, InterfaceC4551a<C3388v> interfaceC4551a5) {
        return new C0027v(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4, interfaceC4551a5);
    }

    /* renamed from: c */
    public static C0025t m165c(InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, InterfaceC3234e interfaceC3234e, C3384r c3384r, C3388v c3388v) {
        return new C0025t(interfaceC3749a, interfaceC3749a2, interfaceC3234e, c3384r, c3388v);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0025t get() {
        return m165c(this.f181a.get(), this.f182b.get(), this.f183c.get(), this.f184d.get(), this.f185e.get());
    }
}
