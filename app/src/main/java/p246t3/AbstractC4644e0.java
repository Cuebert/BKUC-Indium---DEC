package p246t3;

import java.util.Arrays;
import java.util.Set;

/* renamed from: t3.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC4644e0 extends AbstractC4715w implements Set {

    /* renamed from: o */
    private transient AbstractC4624a0 f18430o;

    /* renamed from: m */
    private static AbstractC4644e0 m18749m(int i10, Object... objArr) {
        if (i10 == 0) {
            return C4704t0.f18501v;
        }
        if (i10 != 1) {
            int m18750p = m18750p(i10);
            Object[] objArr2 = new Object[m18750p];
            int i11 = m18750p - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object obj = objArr[i14];
                C4692q0.m18809a(obj, i14);
                int hashCode = obj.hashCode();
                int m18837a = C4711v.m18837a(hashCode);
                while (true) {
                    int i15 = m18837a & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 == null) {
                        objArr[i13] = obj;
                        objArr2[i15] = obj;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                    if (!obj2.equals(obj)) {
                        m18837a++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C4724y0(obj3);
            }
            if (m18750p(i13) >= m18750p / 2) {
                if (i13 <= 0) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new C4704t0(objArr, i12, objArr2, i11, i13);
            }
            return m18749m(i13, objArr);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new C4724y0(obj4);
    }

    /* renamed from: p */
    static int m18750p(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    /* renamed from: s */
    public static AbstractC4644e0 m18751s(Object obj, Object obj2) {
        return m18749m(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4644e0) && mo18746o() && ((AbstractC4644e0) obj).mo18746o() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C4720x0.m18859a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract AbstractC4635c1 iterator();

    /* renamed from: o */
    boolean mo18746o() {
        return false;
    }

    /* renamed from: q */
    public AbstractC4624a0 mo18752q() {
        AbstractC4624a0 abstractC4624a0 = this.f18430o;
        if (abstractC4624a0 != null) {
            return abstractC4624a0;
        }
        AbstractC4624a0 mo18753r = mo18753r();
        this.f18430o = mo18753r;
        return mo18753r;
    }

    /* renamed from: r */
    AbstractC4624a0 mo18753r() {
        Object[] array = toArray();
        int i10 = AbstractC4624a0.f18417p;
        return AbstractC4624a0.m18716p(array, array.length);
    }
}
