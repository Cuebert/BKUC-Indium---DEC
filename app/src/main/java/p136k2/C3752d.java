package p136k2;

import p028c2.C1126d;
import p028c2.InterfaceC1124b;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C3752d implements InterfaceC1124b<InterfaceC3749a> {

    /* renamed from: k2.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3752d f15733a = new C3752d();
    }

    /* renamed from: a */
    public static C3752d m15962a() {
        return a.f15733a;
    }

    /* renamed from: c */
    public static InterfaceC3749a m15963c() {
        return (InterfaceC3749a) C1126d.m6514c(AbstractC3750b.m15957b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3749a get() {
        return m15963c();
    }
}
