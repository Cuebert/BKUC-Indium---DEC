package p070f3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: f3.e */
/* loaded from: classes.dex */
public final class C3131e {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m13783a(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m13784b(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }
}
