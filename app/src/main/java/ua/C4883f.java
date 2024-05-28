package ua;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C3844i;

/* renamed from: ua.f */
/* loaded from: classes.dex */
class C4883f {
    /* renamed from: a */
    public static final <T> T[] m19114a(T[] reference, int i10) {
        C3844i.m16253f(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        C3844i.m16251d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }
}
