package kotlin.jvm.internal;

import p104hb.InterfaceC3453b;
import p104hb.InterfaceC3457f;

/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractC3847l extends AbstractC3849n implements InterfaceC3457f {
    public AbstractC3847l(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3836a
    protected InterfaceC3453b computeReflected() {
        return C3851p.m16270d(this);
    }

    @Override // p051db.InterfaceC3030a
    public Object invoke() {
        return get();
    }
}
