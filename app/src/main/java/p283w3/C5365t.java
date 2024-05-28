package p283w3;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: w3.t */
/* loaded from: classes.dex */
final class C5365t extends AbstractC5198g1 {

    /* renamed from: n */
    final /* synthetic */ C5391v f20150n;

    public C5365t(C5391v c5391v) {
        this.f20150n = c5391v;
    }

    @Override // p283w3.AbstractC5198g1
    /* renamed from: c */
    final Map mo19827c() {
        return this.f20150n;
    }

    @Override // p283w3.AbstractC5198g1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f20150n.f20189p.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new C5378u(this.f20150n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        AbstractC5171e0.m19792p(this.f20150n.f20190q, ((Map.Entry) obj).getKey());
        return true;
    }
}
