package p279w;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w.g2 */
/* loaded from: classes.dex */
public final class C5031g2 {

    /* renamed from: a */
    private final List<AbstractC5035h2> f19183a = new ArrayList();

    /* renamed from: b */
    private static void m19563b(List<int[]> list, int i10, int[] iArr, int i11) {
        boolean z10;
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    z10 = false;
                    break;
                } else {
                    if (i12 == iArr[i13]) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (!z10) {
                iArr[i11] = i12;
                m19563b(list, i10, iArr, i11 + 1);
            }
        }
    }

    /* renamed from: c */
    private List<int[]> m19564c(int i10) {
        ArrayList arrayList = new ArrayList();
        m19563b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    /* renamed from: a */
    public boolean m19565a(AbstractC5035h2 abstractC5035h2) {
        return this.f19183a.add(abstractC5035h2);
    }

    /* renamed from: d */
    public boolean m19566d(List<AbstractC5035h2> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f19183a.size()) {
            return false;
        }
        for (int[] iArr : m19564c(this.f19183a.size())) {
            boolean z10 = true;
            for (int i10 = 0; i10 < this.f19183a.size() && (iArr[i10] >= list.size() || ((z10 = z10 & this.f19183a.get(i10).m19569d(list.get(iArr[i10]))))); i10++) {
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
