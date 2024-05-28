package ua;

import java.util.Collection;
import kotlin.jvm.internal.C3844i;

/* renamed from: ua.n */
/* loaded from: classes.dex */
public class C4896n extends C4895m {
    /* renamed from: g */
    public static <T> int m19144g(Iterable<? extends T> iterable, int i10) {
        C3844i.m16253f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
