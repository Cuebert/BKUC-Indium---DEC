package p109i2;

import p028c2.C1126d;
import p028c2.InterfaceC1124b;

/* renamed from: i2.j */
/* loaded from: classes.dex */
public final class C3487j implements InterfaceC1124b<AbstractC3477e> {

    /* renamed from: i2.j$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3487j f14438a = new C3487j();
    }

    /* renamed from: a */
    public static C3487j m15229a() {
        return a.f14438a;
    }

    /* renamed from: c */
    public static AbstractC3477e m15230c() {
        return (AbstractC3477e) C1126d.m6514c(AbstractC3479f.m15217d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3477e get() {
        return m15230c();
    }
}
