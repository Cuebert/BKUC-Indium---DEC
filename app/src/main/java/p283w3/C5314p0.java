package p283w3;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.p0 */
/* loaded from: classes.dex */
final class C5314p0 extends AbstractC5184f0 {

    /* renamed from: n */
    @NullableDecl
    private final Object f19965n;

    /* renamed from: o */
    private int f19966o;

    /* renamed from: p */
    final /* synthetic */ C5340r0 f19967p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5314p0(C5340r0 c5340r0, int i10) {
        this.f19967p = c5340r0;
        this.f19965n = c5340r0.f20078p[i10];
        this.f19966o = i10;
    }

    /* renamed from: a */
    private final void m19887a() {
        int m19931p;
        int i10 = this.f19966o;
        if (i10 == -1 || i10 >= this.f19967p.size() || !C5261l.m19848a(this.f19965n, this.f19967p.f20078p[this.f19966o])) {
            m19931p = this.f19967p.m19931p(this.f19965n);
            this.f19966o = m19931p;
        }
    }

    @Override // p283w3.AbstractC5184f0, java.util.Map.Entry
    @NullableDecl
    public final Object getKey() {
        return this.f19965n;
    }

    @Override // p283w3.AbstractC5184f0, java.util.Map.Entry
    @NullableDecl
    public final Object getValue() {
        Map m19937j = this.f19967p.m19937j();
        if (m19937j != null) {
            return m19937j.get(this.f19965n);
        }
        m19887a();
        int i10 = this.f19966o;
        if (i10 == -1) {
            return null;
        }
        return this.f19967p.f20079q[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m19937j = this.f19967p.m19937j();
        if (m19937j != null) {
            return m19937j.put(this.f19965n, obj);
        }
        m19887a();
        int i10 = this.f19966o;
        if (i10 == -1) {
            this.f19967p.put(this.f19965n, obj);
            return null;
        }
        Object[] objArr = this.f19967p.f20079q;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
