package p168mb;

import kotlin.jvm.internal.C3844i;

/* renamed from: mb.n */
/* loaded from: classes.dex */
public final class C3992n {

    /* renamed from: a */
    private static final Object f16394a = new C3971a0("CONDITION_FALSE");

    /* renamed from: a */
    public static final Object m16766a() {
        return f16394a;
    }

    /* renamed from: b */
    public static final C3993o m16767b(Object obj) {
        C3993o c3993o;
        C4001w c4001w = obj instanceof C4001w ? (C4001w) obj : null;
        if (c4001w != null && (c3993o = c4001w.f16416a) != null) {
            return c3993o;
        }
        C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C3993o) obj;
    }
}
