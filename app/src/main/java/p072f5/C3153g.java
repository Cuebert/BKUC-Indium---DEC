package p072f5;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: f5.g */
/* loaded from: classes.dex */
final class C3153g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m13853a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m13854b(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }
}
