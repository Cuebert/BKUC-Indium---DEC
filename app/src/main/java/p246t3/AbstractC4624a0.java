package p246t3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: t3.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC4624a0 extends AbstractC4715w implements List, RandomAccess {

    /* renamed from: o */
    private static final AbstractC4640d1 f18416o = new C4719x(C4700s0.f18497s, 0);

    /* renamed from: p */
    public static final /* synthetic */ int f18417p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static AbstractC4624a0 m18716p(Object[] objArr, int i10) {
        if (i10 == 0) {
            return C4700s0.f18497s;
        }
        return new C4700s0(objArr, i10);
    }

    /* renamed from: q */
    public static AbstractC4624a0 m18717q(Object[] objArr) {
        if (objArr.length == 0) {
            return C4700s0.f18497s;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        C4692q0.m18810b(objArr2, length);
        return m18716p(objArr2, length);
    }

    /* renamed from: r */
    public static AbstractC4624a0 m18718r(Object obj) {
        Object[] objArr = {obj};
        C4692q0.m18810b(objArr, 1);
        return m18716p(objArr, 1);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: c */
    public int mo18719c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (C4687p.m18799a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C4687p.m18799a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: k */
    public final AbstractC4635c1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public AbstractC4624a0 mo18721m() {
        return size() <= 1 ? this : new C4723y(this);
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4624a0 subList(int i10, int i11) {
        C4691q.m18807e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return C4700s0.f18497s;
        }
        return new C4727z(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final AbstractC4640d1 listIterator(int i10) {
        C4691q.m18804b(i10, size(), "index");
        return isEmpty() ? f18416o : new C4719x(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
