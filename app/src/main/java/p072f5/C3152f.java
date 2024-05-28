package p072f5;

/* renamed from: f5.f */
/* loaded from: classes.dex */
public final class C3152f {
    /* renamed from: a */
    static Object m13849a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m13850b(Object... objArr) {
        m13851c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    static Object[] m13851c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m13849a(objArr[i11], i11);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m13852d(T[] tArr, int i10) {
        return (T[]) C3153g.m13854b(tArr, i10);
    }
}
