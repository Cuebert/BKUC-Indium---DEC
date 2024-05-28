package ac;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ac.m */
/* loaded from: classes.dex */
public final class C0083m extends AbstractList<C0076f> implements RandomAccess {

    /* renamed from: n */
    final C0076f[] f296n;

    /* renamed from: o */
    final int[] f297o;

    private C0083m(C0076f[] c0076fArr, int[] iArr) {
        this.f296n = c0076fArr;
        this.f297o = iArr;
    }

    /* renamed from: c */
    private static void m436c(long j10, C0073c c0073c, int i10, List<C0076f> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        int i15;
        C0073c c0073c2;
        int i16 = i11;
        if (i16 < i12) {
            for (int i17 = i16; i17 < i12; i17++) {
                if (list.get(i17).mo399r() < i10) {
                    throw new AssertionError();
                }
            }
            C0076f c0076f = list.get(i11);
            C0076f c0076f2 = list.get(i12 - 1);
            int i18 = -1;
            if (i10 == c0076f.mo399r()) {
                i18 = list2.get(i16).intValue();
                i16++;
                c0076f = list.get(i16);
            }
            int i19 = i16;
            if (c0076f.mo392j(i10) != c0076f2.mo392j(i10)) {
                int i20 = 1;
                for (int i21 = i19 + 1; i21 < i12; i21++) {
                    if (list.get(i21 - 1).mo392j(i10) != list.get(i21).mo392j(i10)) {
                        i20++;
                    }
                }
                long m437i = j10 + m437i(c0073c) + 2 + (i20 * 2);
                c0073c.mo379x(i20);
                c0073c.mo379x(i18);
                for (int i22 = i19; i22 < i12; i22++) {
                    byte mo392j = list.get(i22).mo392j(i10);
                    if (i22 == i19 || mo392j != list.get(i22 - 1).mo392j(i10)) {
                        c0073c.mo379x(mo392j & 255);
                    }
                }
                C0073c c0073c3 = new C0073c();
                int i23 = i19;
                while (i23 < i12) {
                    byte mo392j2 = list.get(i23).mo392j(i10);
                    int i24 = i23 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 >= i12) {
                            i14 = i12;
                            break;
                        } else {
                            if (mo392j2 != list.get(i25).mo392j(i10)) {
                                i14 = i25;
                                break;
                            }
                            i25++;
                        }
                    }
                    if (i24 == i14 && i10 + 1 == list.get(i23).mo399r()) {
                        c0073c.mo379x(list2.get(i23).intValue());
                        i15 = i14;
                        c0073c2 = c0073c3;
                    } else {
                        c0073c.mo379x((int) ((m437i(c0073c3) + m437i) * (-1)));
                        i15 = i14;
                        c0073c2 = c0073c3;
                        m436c(m437i, c0073c3, i10 + 1, list, i23, i14, list2);
                    }
                    c0073c3 = c0073c2;
                    i23 = i15;
                }
                C0073c c0073c4 = c0073c3;
                c0073c.mo313C(c0073c4, c0073c4.m381y0());
                return;
            }
            int i26 = 0;
            int min = Math.min(c0076f.mo399r(), c0076f2.mo399r());
            for (int i27 = i10; i27 < min && c0076f.mo392j(i27) == c0076f2.mo392j(i27); i27++) {
                i26++;
            }
            long m437i2 = 1 + j10 + m437i(c0073c) + 2 + i26;
            c0073c.mo379x(-i26);
            c0073c.mo379x(i18);
            int i28 = i10;
            while (true) {
                i13 = i10 + i26;
                if (i28 >= i13) {
                    break;
                }
                c0073c.mo379x(c0076f.mo392j(i28) & 255);
                i28++;
            }
            if (i19 + 1 == i12) {
                if (i13 == list.get(i19).mo399r()) {
                    c0073c.mo379x(list2.get(i19).intValue());
                    return;
                }
                throw new AssertionError();
            }
            C0073c c0073c5 = new C0073c();
            c0073c.mo379x((int) ((m437i(c0073c5) + m437i2) * (-1)));
            m436c(m437i2, c0073c5, i13, list, i19, i12, list2);
            c0073c.mo313C(c0073c5, c0073c5.m381y0());
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    private static int m437i(C0073c c0073c) {
        return (int) (c0073c.m381y0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        continue;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ac.C0083m m438k(ac.C0076f... r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0083m.m438k(ac.f[]):ac.m");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0076f get(int i10) {
        return this.f296n[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f296n.length;
    }
}
