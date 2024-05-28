package p168mb;

import kotlin.jvm.internal.C3844i;
import p145kb.InterfaceC3796i1;
import va.InterfaceC5001e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mb.i0 */
/* loaded from: classes.dex */
public final class C3987i0 {

    /* renamed from: a */
    public final InterfaceC5001e f16381a;

    /* renamed from: b */
    private final Object[] f16382b;

    /* renamed from: c */
    private final InterfaceC3796i1<Object>[] f16383c;

    /* renamed from: d */
    private int f16384d;

    public C3987i0(InterfaceC5001e interfaceC5001e, int i10) {
        this.f16381a = interfaceC5001e;
        this.f16382b = new Object[i10];
        this.f16383c = new InterfaceC3796i1[i10];
    }

    /* renamed from: a */
    public final void m16757a(InterfaceC3796i1<?> interfaceC3796i1, Object obj) {
        Object[] objArr = this.f16382b;
        int i10 = this.f16384d;
        objArr[i10] = obj;
        InterfaceC3796i1<Object>[] interfaceC3796i1Arr = this.f16383c;
        this.f16384d = i10 + 1;
        C3844i.m16251d(interfaceC3796i1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC3796i1Arr[i10] = interfaceC3796i1;
    }

    /* renamed from: b */
    public final void m16758b(InterfaceC5001e interfaceC5001e) {
        int length = this.f16383c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC3796i1<Object> interfaceC3796i1 = this.f16383c[length];
            C3844i.m16250c(interfaceC3796i1);
            interfaceC3796i1.m16169e0(interfaceC5001e, this.f16382b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
