package p283w3;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.x0 */
/* loaded from: classes.dex */
final class C5418x0<K, V> extends AbstractC5184f0<K, V> implements Serializable {

    /* renamed from: n */
    @NullableDecl
    final K f20253n;

    /* renamed from: o */
    @NullableDecl
    final V f20254o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5418x0(@NullableDecl K k10, @NullableDecl V v10) {
        this.f20253n = k10;
        this.f20254o = v10;
    }

    @Override // p283w3.AbstractC5184f0, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f20253n;
    }

    @Override // p283w3.AbstractC5184f0, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f20254o;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
