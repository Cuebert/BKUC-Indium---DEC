package p271v3;

/* renamed from: v3.i */
/* loaded from: classes.dex */
public final class C4957i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m19381a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
