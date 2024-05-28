package p158m0;

import java.util.ArrayList;
import p147l0.C3860e;
import p147l0.C3862g;
import p147l0.C3864i;

/* renamed from: m0.i */
/* loaded from: classes.dex */
public class C3921i {
    /* renamed from: a */
    public static C3927o m16633a(C3860e c3860e, int i10, ArrayList<C3927o> arrayList, C3927o c3927o) {
        int i11;
        int m16462b1;
        if (i10 == 0) {
            i11 = c3860e.f15965A0;
        } else {
            i11 = c3860e.f15967B0;
        }
        if (i11 != -1 && (c3927o == null || i11 != c3927o.f16285b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                C3927o c3927o2 = arrayList.get(i12);
                if (c3927o2.m16650c() == i11) {
                    if (c3927o != null) {
                        c3927o.m16653g(i10, c3927o2);
                        arrayList.remove(c3927o);
                    }
                    c3927o = c3927o2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return c3927o;
        }
        if (c3927o == null) {
            if ((c3860e instanceof C3864i) && (m16462b1 = ((C3864i) c3860e).m16462b1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    C3927o c3927o3 = arrayList.get(i13);
                    if (c3927o3.m16650c() == m16462b1) {
                        c3927o = c3927o3;
                        break;
                    }
                    i13++;
                }
            }
            if (c3927o == null) {
                c3927o = new C3927o(i10);
            }
            arrayList.add(c3927o);
        }
        if (c3927o.m16648a(c3860e)) {
            if (c3860e instanceof C3862g) {
                C3862g c3862g = (C3862g) c3860e;
                c3862g.m16448a1().m16302b(c3862g.m16449b1() == 0 ? 1 : 0, arrayList, c3927o);
            }
            if (i10 == 0) {
                c3860e.f15965A0 = c3927o.m16650c();
                c3860e.f15973H.m16302b(i10, arrayList, c3927o);
                c3860e.f15975J.m16302b(i10, arrayList, c3927o);
            } else {
                c3860e.f15967B0 = c3927o.m16650c();
                c3860e.f15974I.m16302b(i10, arrayList, c3927o);
                c3860e.f15977L.m16302b(i10, arrayList, c3927o);
                c3860e.f15976K.m16302b(i10, arrayList, c3927o);
            }
            c3860e.f15980O.m16302b(i10, arrayList, c3927o);
        }
        return c3927o;
    }

    /* renamed from: b */
    private static C3927o m16634b(ArrayList<C3927o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3927o c3927o = arrayList.get(i11);
            if (i10 == c3927o.f16285b) {
                return c3927o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0380 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m16635c(p147l0.C3861f r16, p158m0.C3914b.b r17) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m0.C3921i.m16635c(l0.f, m0.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m16636d(C3860e.b bVar, C3860e.b bVar2, C3860e.b bVar3, C3860e.b bVar4) {
        C3860e.b bVar5;
        C3860e.b bVar6;
        C3860e.b bVar7 = C3860e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C3860e.b.WRAP_CONTENT) || (bVar3 == C3860e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C3860e.b.WRAP_CONTENT) || (bVar4 == C3860e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
