package p246t3;

import java.util.Comparator;

/* renamed from: t3.o1 */
/* loaded from: classes.dex */
final class C4685o1 {

    /* renamed from: a */
    static final String f18483a;

    /* renamed from: b */
    static final Comparator f18484b;

    static {
        Comparator comparator;
        String concat = C4685o1.class.getName().concat("$UnsafeComparator");
        f18483a = concat;
        try {
            Object[] enumConstants = Class.forName(concat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC4681n1.INSTANCE;
        }
        f18484b = comparator;
    }

    C4685o1() {
    }
}
