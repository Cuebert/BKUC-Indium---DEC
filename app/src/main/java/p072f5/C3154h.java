package p072f5;

import java.util.Objects;
import p059e5.C3075g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f5.h */
/* loaded from: classes.dex */
public class C3154h<E> extends AbstractC3149c<E> {

    /* renamed from: r */
    static final AbstractC3149c<Object> f13186r = new C3154h(new Object[0], 0);

    /* renamed from: p */
    final transient Object[] f13187p;

    /* renamed from: q */
    private final transient int f13188q;

    public C3154h(Object[] objArr, int i10) {
        this.f13187p = objArr;
        this.f13188q = i10;
    }

    @Override // p072f5.AbstractC3149c, p072f5.AbstractC3148b
    /* renamed from: c */
    int mo13829c(Object[] objArr, int i10) {
        System.arraycopy(this.f13187p, 0, objArr, i10, this.f13188q);
        return i10 + this.f13188q;
    }

    @Override // p072f5.AbstractC3148b
    /* renamed from: e */
    public Object[] mo13830e() {
        return this.f13187p;
    }

    @Override // java.util.List
    public E get(int i10) {
        C3075g.m13549d(i10, this.f13188q);
        E e10 = (E) this.f13187p[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // p072f5.AbstractC3148b
    /* renamed from: i */
    int mo13831i() {
        return this.f13188q;
    }

    @Override // p072f5.AbstractC3148b
    /* renamed from: k */
    public int mo13832k() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13188q;
    }
}
