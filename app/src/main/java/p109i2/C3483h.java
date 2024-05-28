package p109i2;

import android.content.Context;
import p028c2.C1126d;
import p028c2.InterfaceC1124b;
import sa.InterfaceC4551a;

/* renamed from: i2.h */
/* loaded from: classes.dex */
public final class C3483h implements InterfaceC1124b<String> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f14433a;

    public C3483h(InterfaceC4551a<Context> interfaceC4551a) {
        this.f14433a = interfaceC4551a;
    }

    /* renamed from: a */
    public static C3483h m15222a(InterfaceC4551a<Context> interfaceC4551a) {
        return new C3483h(interfaceC4551a);
    }

    /* renamed from: c */
    public static String m15223c(Context context) {
        return (String) C1126d.m6514c(AbstractC3479f.m15215b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m15223c(this.f14433a.get());
    }
}
