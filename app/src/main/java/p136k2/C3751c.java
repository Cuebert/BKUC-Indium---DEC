package p136k2;

import p028c2.C1126d;
import p028c2.InterfaceC1124b;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public final class C3751c implements InterfaceC1124b<InterfaceC3749a> {

    /* renamed from: k2.c$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3751c f15732a = new C3751c();
    }

    /* renamed from: a */
    public static C3751c m15958a() {
        return a.f15732a;
    }

    /* renamed from: b */
    public static InterfaceC3749a m15959b() {
        return (InterfaceC3749a) C1126d.m6514c(AbstractC3750b.m15956a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3749a get() {
        return m15959b();
    }
}
