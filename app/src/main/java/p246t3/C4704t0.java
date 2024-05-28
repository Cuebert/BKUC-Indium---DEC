package p246t3;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.t0 */
/* loaded from: classes.dex */
public final class C4704t0 extends AbstractC4644e0 {

    /* renamed from: u */
    private static final Object[] f18500u;

    /* renamed from: v */
    static final C4704t0 f18501v;

    /* renamed from: p */
    final transient Object[] f18502p;

    /* renamed from: q */
    private final transient int f18503q;

    /* renamed from: r */
    final transient Object[] f18504r;

    /* renamed from: s */
    private final transient int f18505s;

    /* renamed from: t */
    private final transient int f18506t;

    static {
        Object[] objArr = new Object[0];
        f18500u = objArr;
        f18501v = new C4704t0(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4704t0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f18502p = objArr;
        this.f18503q = i10;
        this.f18504r = objArr2;
        this.f18505s = i11;
        this.f18506t = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: c */
    public final int mo18719c(Object[] objArr, int i10) {
        System.arraycopy(this.f18502p, 0, objArr, 0, this.f18506t);
        return this.f18506t;
    }

    @Override // p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f18504r;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m18837a = C4711v.m18837a(obj.hashCode());
        while (true) {
            int i10 = m18837a & this.f18505s;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m18837a = i10 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: e */
    public final int mo18813e() {
        return this.f18506t;
    }

    @Override // p246t3.AbstractC4644e0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18503q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: i */
    public final int mo18814i() {
        return 0;
    }

    @Override // p246t3.AbstractC4644e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo18752q().listIterator(0);
    }

    @Override // p246t3.AbstractC4644e0, p246t3.AbstractC4715w
    /* renamed from: k */
    public final AbstractC4635c1 iterator() {
        return mo18752q().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: l */
    public final Object[] mo18815l() {
        return this.f18502p;
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: o */
    final boolean mo18746o() {
        return true;
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: r */
    final AbstractC4624a0 mo18753r() {
        return AbstractC4624a0.m18716p(this.f18502p, this.f18506t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18506t;
    }
}
