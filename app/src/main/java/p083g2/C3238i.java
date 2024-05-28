package p083g2;

import android.content.Context;
import p028c2.C1126d;
import p028c2.InterfaceC1124b;
import p095h2.AbstractC3372f;
import p095h2.InterfaceC3390x;
import p109i2.InterfaceC3475d;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: g2.i */
/* loaded from: classes.dex */
public final class C3238i implements InterfaceC1124b<InterfaceC3390x> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f13674a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC3475d> f13675b;

    /* renamed from: c */
    private final InterfaceC4551a<AbstractC3372f> f13676c;

    /* renamed from: d */
    private final InterfaceC4551a<InterfaceC3749a> f13677d;

    public C3238i(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC3475d> interfaceC4551a2, InterfaceC4551a<AbstractC3372f> interfaceC4551a3, InterfaceC4551a<InterfaceC3749a> interfaceC4551a4) {
        this.f13674a = interfaceC4551a;
        this.f13675b = interfaceC4551a2;
        this.f13676c = interfaceC4551a3;
        this.f13677d = interfaceC4551a4;
    }

    /* renamed from: a */
    public static C3238i m14474a(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<InterfaceC3475d> interfaceC4551a2, InterfaceC4551a<AbstractC3372f> interfaceC4551a3, InterfaceC4551a<InterfaceC3749a> interfaceC4551a4) {
        return new C3238i(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4);
    }

    /* renamed from: c */
    public static InterfaceC3390x m14475c(Context context, InterfaceC3475d interfaceC3475d, AbstractC3372f abstractC3372f, InterfaceC3749a interfaceC3749a) {
        return (InterfaceC3390x) C1126d.m6514c(AbstractC3237h.m14473a(context, interfaceC3475d, abstractC3372f, interfaceC3749a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3390x get() {
        return m14475c(this.f13674a.get(), this.f13675b.get(), this.f13676c.get(), this.f13677d.get());
    }
}
