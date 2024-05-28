package p283w3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.s */
/* loaded from: classes.dex */
class C5352s<K, V> extends AbstractC5171e0<K, V> implements InterfaceC5172e1<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public C5352s(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p283w3.InterfaceC5172e1
    /* renamed from: b */
    public final List<V> mo19801b(@NullableDecl K k10) {
        return (List<V>) super.m19798m(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p283w3.AbstractC5171e0
    /* renamed from: f */
    public final Collection<V> mo19797f(K k10, Collection<V> collection) {
        return m19799n(k10, (List) collection, null);
    }
}
