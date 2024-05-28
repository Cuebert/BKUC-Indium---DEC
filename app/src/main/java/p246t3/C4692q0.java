package p246t3;

/* renamed from: t3.q0 */
/* loaded from: classes.dex */
public final class C4692q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m18809a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m18810b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m18809a(objArr[i11], i11);
        }
        return objArr;
    }
}
