package p016b2;

import android.content.Context;
import p028c2.InterfaceC1124b;
import sa.InterfaceC4551a;

/* renamed from: b2.l */
/* loaded from: classes.dex */
public final class C0980l implements InterfaceC1124b<C0979k> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f5166a;

    /* renamed from: b */
    private final InterfaceC4551a<C0977i> f5167b;

    public C0980l(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<C0977i> interfaceC4551a2) {
        this.f5166a = interfaceC4551a;
        this.f5167b = interfaceC4551a2;
    }

    /* renamed from: a */
    public static C0980l m6172a(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<C0977i> interfaceC4551a2) {
        return new C0980l(interfaceC4551a, interfaceC4551a2);
    }

    /* renamed from: c */
    public static C0979k m6173c(Context context, Object obj) {
        return new C0979k(context, (C0977i) obj);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0979k get() {
        return m6173c(this.f5166a.get(), this.f5167b.get());
    }
}
