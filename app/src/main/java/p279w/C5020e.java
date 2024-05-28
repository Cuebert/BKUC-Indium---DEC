package p279w;

import java.util.Objects;
import p279w.AbstractC5035h2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C5020e extends AbstractC5035h2 {

    /* renamed from: a */
    private final AbstractC5035h2.b f19156a;

    /* renamed from: b */
    private final AbstractC5035h2.a f19157b;

    public C5020e(AbstractC5035h2.b bVar, AbstractC5035h2.a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f19156a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f19157b = aVar;
    }

    @Override // p279w.AbstractC5035h2
    /* renamed from: b */
    public AbstractC5035h2.a mo19536b() {
        return this.f19157b;
    }

    @Override // p279w.AbstractC5035h2
    /* renamed from: c */
    public AbstractC5035h2.b mo19537c() {
        return this.f19156a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5035h2)) {
            return false;
        }
        AbstractC5035h2 abstractC5035h2 = (AbstractC5035h2) obj;
        return this.f19156a.equals(abstractC5035h2.mo19537c()) && this.f19157b.equals(abstractC5035h2.mo19536b());
    }

    public int hashCode() {
        return ((this.f19156a.hashCode() ^ 1000003) * 1000003) ^ this.f19157b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f19156a + ", configSize=" + this.f19157b + "}";
    }
}
