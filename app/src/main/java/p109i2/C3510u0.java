package p109i2;

import android.content.Context;
import p028c2.InterfaceC1124b;
import sa.InterfaceC4551a;

/* renamed from: i2.u0 */
/* loaded from: classes.dex */
public final class C3510u0 implements InterfaceC1124b<C3508t0> {

    /* renamed from: a */
    private final InterfaceC4551a<Context> f14495a;

    /* renamed from: b */
    private final InterfaceC4551a<String> f14496b;

    /* renamed from: c */
    private final InterfaceC4551a<Integer> f14497c;

    public C3510u0(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<String> interfaceC4551a2, InterfaceC4551a<Integer> interfaceC4551a3) {
        this.f14495a = interfaceC4551a;
        this.f14496b = interfaceC4551a2;
        this.f14497c = interfaceC4551a3;
    }

    /* renamed from: a */
    public static C3510u0 m15324a(InterfaceC4551a<Context> interfaceC4551a, InterfaceC4551a<String> interfaceC4551a2, InterfaceC4551a<Integer> interfaceC4551a3) {
        return new C3510u0(interfaceC4551a, interfaceC4551a2, interfaceC4551a3);
    }

    /* renamed from: c */
    public static C3508t0 m15325c(Context context, String str, int i10) {
        return new C3508t0(context, str, i10);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3508t0 get() {
        return m15325c(this.f14495a.get(), this.f14496b.get(), this.f14497c.get().intValue());
    }
}
