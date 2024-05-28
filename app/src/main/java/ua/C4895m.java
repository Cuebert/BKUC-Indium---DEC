package ua;

import java.util.List;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.m */
/* loaded from: classes.dex */
public class C4895m extends C4894l {
    /* renamed from: b */
    public static final <T> List<T> m19139b() {
        return C4905w.f18778n;
    }

    /* renamed from: c */
    public static final <T> int m19140c(List<? extends T> list) {
        C3844i.m16253f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: d */
    public static <T> List<T> m19141d(T... elements) {
        C3844i.m16253f(elements, "elements");
        return elements.length > 0 ? C4887h.m19117b(elements) : m19139b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> List<T> m19142e(List<? extends T> list) {
        C3844i.m16253f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C4894l.m19138a(list.get(0));
        }
        return m19139b();
    }

    /* renamed from: f */
    public static void m19143f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
