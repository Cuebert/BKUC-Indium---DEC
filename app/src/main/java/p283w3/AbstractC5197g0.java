package p283w3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC5197g0<K, V> implements InterfaceC5263l1<K, V> {

    /* renamed from: n */
    @NullableDecl
    private transient Set<K> f19691n;

    /* renamed from: o */
    @NullableDecl
    private transient Map<K, Collection<V>> f19692o;

    /* renamed from: c */
    abstract Map<K, Collection<V>> mo19794c();

    /* renamed from: d */
    abstract Set<K> mo19795d();

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC5263l1) {
            return mo19825h().equals(((InterfaceC5263l1) obj).mo19825h());
        }
        return false;
    }

    @Override // p283w3.InterfaceC5263l1
    /* renamed from: h */
    public final Map<K, Collection<V>> mo19825h() {
        Map<K, Collection<V>> map = this.f19692o;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mo19794c = mo19794c();
        this.f19692o = mo19794c;
        return mo19794c;
    }

    public final int hashCode() {
        return mo19825h().hashCode();
    }

    @Override // p283w3.InterfaceC5263l1
    /* renamed from: j */
    public final Set<K> mo19826j() {
        Set<K> set = this.f19691n;
        if (set != null) {
            return set;
        }
        Set<K> mo19795d = mo19795d();
        this.f19691n = mo19795d;
        return mo19795d;
    }

    public final String toString() {
        return ((C5391v) mo19825h()).f20189p.toString();
    }
}
