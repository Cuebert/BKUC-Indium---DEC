package p109i2;

import p028c2.C1126d;
import p028c2.InterfaceC1124b;

/* renamed from: i2.g */
/* loaded from: classes.dex */
public final class C3481g implements InterfaceC1124b<String> {

    /* renamed from: i2.g$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3481g f14431a = new C3481g();
    }

    /* renamed from: a */
    public static C3481g m15218a() {
        return a.f14431a;
    }

    /* renamed from: b */
    public static String m15219b() {
        return (String) C1126d.m6514c(AbstractC3479f.m15214a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m15219b();
    }
}
