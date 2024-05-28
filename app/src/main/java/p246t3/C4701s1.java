package p246t3;

import java.util.Comparator;

/* renamed from: t3.s1 */
/* loaded from: classes.dex */
final class C4701s1 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC4626a2 abstractC4626a2 = (AbstractC4626a2) obj;
        AbstractC4626a2 abstractC4626a22 = (AbstractC4626a2) obj2;
        C4697r1 c4697r1 = new C4697r1(abstractC4626a2);
        C4697r1 c4697r12 = new C4697r1(abstractC4626a22);
        while (c4697r1.hasNext() && c4697r12.hasNext()) {
            int compareTo = Integer.valueOf(c4697r1.zza() & 255).compareTo(Integer.valueOf(c4697r12.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC4626a2.mo18731i()).compareTo(Integer.valueOf(abstractC4626a22.mo18731i()));
    }
}
