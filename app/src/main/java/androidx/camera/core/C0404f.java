package androidx.camera.core;

import androidx.camera.core.AbstractC0473t;
import java.util.Objects;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public final class C0404f extends AbstractC0473t {

    /* renamed from: a */
    private final AbstractC0473t.b f1874a;

    /* renamed from: b */
    private final AbstractC0473t.a f1875b;

    public C0404f(AbstractC0473t.b bVar, AbstractC0473t.a aVar) {
        Objects.requireNonNull(bVar, "Null type");
        this.f1874a = bVar;
        this.f1875b = aVar;
    }

    @Override // androidx.camera.core.AbstractC0473t
    /* renamed from: c */
    public AbstractC0473t.a mo2008c() {
        return this.f1875b;
    }

    @Override // androidx.camera.core.AbstractC0473t
    /* renamed from: d */
    public AbstractC0473t.b mo2009d() {
        return this.f1874a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0473t)) {
            return false;
        }
        AbstractC0473t abstractC0473t = (AbstractC0473t) obj;
        if (this.f1874a.equals(abstractC0473t.mo2009d())) {
            AbstractC0473t.a aVar = this.f1875b;
            if (aVar == null) {
                if (abstractC0473t.mo2008c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC0473t.mo2008c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f1874a.hashCode() ^ 1000003) * 1000003;
        AbstractC0473t.a aVar = this.f1875b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f1874a + ", error=" + this.f1875b + "}";
    }
}
