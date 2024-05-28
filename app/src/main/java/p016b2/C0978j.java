package p016b2;

import android.content.Context;
import p028c2.InterfaceC1124b;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: b2.j */
/* loaded from: classes.dex */
public final class C0978j implements InterfaceC1124b<C0977i> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f5158a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC3749a> f5159b;

    /* renamed from: c */
    private final InterfaceC4551a<InterfaceC3749a> f5160c;

    public C0978j(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<InterfaceC3749a> interfaceC4551a3) {
        this.f5158a = interfaceC4551a;
        this.f5159b = interfaceC4551a2;
        this.f5160c = interfaceC4551a3;
    }

    /* renamed from: a */
    public static C0978j m6165a(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<InterfaceC3749a> interfaceC4551a3) {
        return new C0978j(interfaceC4551a, interfaceC4551a2, interfaceC4551a3);
    }

    /* renamed from: c */
    public static C0977i m6166c(Context context, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2) {
        return new C0977i(context, interfaceC3749a, interfaceC3749a2);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0977i get() {
        return m6166c(this.f5158a.get(), this.f5159b.get(), this.f5160c.get());
    }
}
