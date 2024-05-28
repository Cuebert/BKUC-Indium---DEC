package ua;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.h */
/* loaded from: classes.dex */
public class C4887h extends C4885g {
    /* renamed from: b */
    public static final <T> List<T> m19117b(T[] tArr) {
        C3844i.m16253f(tArr, "<this>");
        List<T> m19130a = C4891j.m19130a(tArr);
        C3844i.m16252e(m19130a, "asList(this)");
        return m19130a;
    }

    /* renamed from: c */
    public static final <T> T[] m19118c(T[] tArr, T[] destination, int i10, int i11, int i12) {
        C3844i.m16253f(tArr, "<this>");
        C3844i.m16253f(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: d */
    public static /* synthetic */ Object[] m19119d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m19118c(objArr, objArr2, i10, i11, i12);
    }

    /* renamed from: e */
    public static final <T> void m19120e(T[] tArr, T t10, int i10, int i11) {
        C3844i.m16253f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }
}
