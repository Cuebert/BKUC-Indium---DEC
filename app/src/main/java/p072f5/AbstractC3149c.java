package p072f5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p059e5.C3075g;

/* renamed from: f5.c */
/* loaded from: classes.dex */
public abstract class AbstractC3149c<E> extends AbstractC3148b<E> implements List<E>, RandomAccess {

    /* renamed from: o */
    private static final AbstractC3157k<Object> f13181o = new a(C3154h.f13186r, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f5.c$a */
    /* loaded from: classes.dex */
    public static class a<E> extends AbstractC3147a<E> {

        /* renamed from: p */
        private final AbstractC3149c<E> f13182p;

        a(AbstractC3149c<E> abstractC3149c, int i10) {
            super(abstractC3149c.size(), i10);
            this.f13182p = abstractC3149c;
        }

        @Override // p072f5.AbstractC3147a
        /* renamed from: a */
        protected E mo13828a(int i10) {
            return this.f13182p.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f5.c$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3149c<E> {

        /* renamed from: p */
        final transient int f13183p;

        /* renamed from: q */
        final transient int f13184q;

        b(int i10, int i11) {
            this.f13183p = i10;
            this.f13184q = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p072f5.AbstractC3148b
        /* renamed from: e */
        public Object[] mo13830e() {
            return AbstractC3149c.this.mo13830e();
        }

        @Override // java.util.List
        public E get(int i10) {
            C3075g.m13549d(i10, this.f13184q);
            return AbstractC3149c.this.get(i10 + this.f13183p);
        }

        @Override // p072f5.AbstractC3148b
        /* renamed from: i */
        int mo13831i() {
            return AbstractC3149c.this.mo13832k() + this.f13183p + this.f13184q;
        }

        @Override // p072f5.AbstractC3149c, p072f5.AbstractC3148b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p072f5.AbstractC3148b
        /* renamed from: k */
        public int mo13832k() {
            return AbstractC3149c.this.mo13832k() + this.f13183p;
        }

        @Override // p072f5.AbstractC3149c, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13184q;
        }

        @Override // p072f5.AbstractC3149c, java.util.List
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public AbstractC3149c<E> subList(int i10, int i11) {
            C3075g.m13555j(i10, i11, this.f13184q);
            AbstractC3149c abstractC3149c = AbstractC3149c.this;
            int i12 = this.f13183p;
            return abstractC3149c.subList(i10 + i12, i11 + i12);
        }

        @Override // p072f5.AbstractC3149c, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* renamed from: m */
    static <E> AbstractC3149c<E> m13834m(Object[] objArr) {
        return m13835o(objArr, objArr.length);
    }

    /* renamed from: o */
    static <E> AbstractC3149c<E> m13835o(Object[] objArr, int i10) {
        if (i10 == 0) {
            return m13838u();
        }
        return new C3154h(objArr, i10);
    }

    /* renamed from: p */
    private static <E> AbstractC3149c<E> m13836p(Object... objArr) {
        return m13834m(C3152f.m13850b(objArr));
    }

    /* renamed from: q */
    public static <E> AbstractC3149c<E> m13837q(E[] eArr) {
        if (eArr.length == 0) {
            return m13838u();
        }
        return m13836p((Object[]) eArr.clone());
    }

    /* renamed from: u */
    public static <E> AbstractC3149c<E> m13838u() {
        return (AbstractC3149c<E>) C3154h.f13186r;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p072f5.AbstractC3148b
    /* renamed from: c */
    int mo13829c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C3151e.m13844a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C3151e.m13845b(this, obj);
    }

    @Override // p072f5.AbstractC3148b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public AbstractC3156j<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C3151e.m13847d(this, obj);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC3157k<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC3157k<E> listIterator(int i10) {
        C3075g.m13553h(i10, size());
        if (isEmpty()) {
            return (AbstractC3157k<E>) f13181o;
        }
        return new a(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v */
    public AbstractC3149c<E> subList(int i10, int i11) {
        C3075g.m13555j(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return m13838u();
        }
        return m13842w(i10, i11);
    }

    /* renamed from: w */
    AbstractC3149c<E> m13842w(int i10, int i11) {
        return new b(i10, i11 - i10);
    }
}
