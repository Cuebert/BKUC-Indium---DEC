package ua;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.i */
/* loaded from: classes.dex */
public class C4889i extends C4887h {
    /* renamed from: f */
    public static final <T> int m19122f(T[] tArr) {
        C3844i.m16253f(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: g */
    public static char m19123g(char[] cArr) {
        C3844i.m16253f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: h */
    public static <T> T m19124h(T[] tArr) {
        C3844i.m16253f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m19125i(T[] tArr, C destination) {
        C3844i.m16253f(tArr, "<this>");
        C3844i.m16253f(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    /* renamed from: j */
    public static final <T> Set<T> m19126j(T[] tArr) {
        Set<T> m19127b;
        int m19088a;
        C3844i.m16253f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            m19127b = C4890i0.m19127b();
            return m19127b;
        }
        if (length != 1) {
            m19088a = C4878c0.m19088a(tArr.length);
            return (Set) m19125i(tArr, new LinkedHashSet(m19088a));
        }
        return C4888h0.m19121a(tArr[0]);
    }
}
