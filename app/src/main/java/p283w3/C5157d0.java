package p283w3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.d0 */
/* loaded from: classes.dex */
public class C5157d0 extends C5129b0 implements List {

    /* renamed from: s */
    final /* synthetic */ AbstractC5171e0 f19489s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5157d0(@NullableDecl AbstractC5171e0 abstractC5171e0, Object obj, @NullableDecl List list, C5129b0 c5129b0) {
        super(abstractC5171e0, obj, list, c5129b0);
        this.f19489s = abstractC5171e0;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean isEmpty = this.f19394o.isEmpty();
        ((List) this.f19394o).add(i10, obj);
        AbstractC5171e0.m19787g(this.f19489s);
        if (isEmpty) {
            m19755c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f19394o).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        AbstractC5171e0.m19789k(this.f19489s, this.f19394o.size() - size);
        if (size != 0) {
            return addAll;
        }
        m19755c();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f19394o).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f19394o).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f19394o).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C5143c0(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object remove = ((List) this.f19394o).remove(i10);
        AbstractC5171e0.m19788i(this.f19489s);
        m19756e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f19394o).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        AbstractC5171e0 abstractC5171e0 = this.f19489s;
        Object obj = this.f19393n;
        List subList = ((List) this.f19394o).subList(i10, i11);
        C5129b0 c5129b0 = this.f19395p;
        if (c5129b0 == null) {
            c5129b0 = this;
        }
        return abstractC5171e0.m19799n(obj, subList, c5129b0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new C5143c0(this, i10);
    }
}
