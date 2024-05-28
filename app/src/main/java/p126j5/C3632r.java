package p126j5;

import java.util.Arrays;
import java.util.List;

/* renamed from: j5.r */
/* loaded from: classes.dex */
public class C3632r extends C3633s {

    /* renamed from: n */
    private final List<C3617d<?>> f15304n;

    public C3632r(List<C3617d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f15304n = list;
    }
}
