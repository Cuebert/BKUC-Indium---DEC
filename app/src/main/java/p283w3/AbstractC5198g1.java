package p283w3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC5198g1<K, V> extends AbstractC5302o1<Map.Entry<K, V>> {
    /* renamed from: c */
    abstract Map<K, V> mo19827c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo19827c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo19827c().isEmpty();
    }

    @Override // p283w3.AbstractC5302o1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return C5315p1.m19888a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C5315p1.m19889b(this, collection.iterator());
        }
    }

    @Override // p283w3.AbstractC5302o1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i10;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("expectedSize cannot be negative but was: ");
                    sb2.append(size);
                    throw new IllegalArgumentException(sb2.toString());
                }
                i10 = size + 1;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C5391v) mo19827c()).f20190q.mo19826j().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo19827c().size();
    }
}
