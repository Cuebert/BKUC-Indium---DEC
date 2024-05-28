package p109i2;

import java.util.Objects;
import p003a2.AbstractC0014i;
import p003a2.AbstractC0020o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C3471b extends AbstractC3489k {

    /* renamed from: a */
    private final long f14421a;

    /* renamed from: b */
    private final AbstractC0020o f14422b;

    /* renamed from: c */
    private final AbstractC0014i f14423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3471b(long j10, AbstractC0020o abstractC0020o, AbstractC0014i abstractC0014i) {
        this.f14421a = j10;
        Objects.requireNonNull(abstractC0020o, "Null transportContext");
        this.f14422b = abstractC0020o;
        Objects.requireNonNull(abstractC0014i, "Null event");
        this.f14423c = abstractC0014i;
    }

    @Override // p109i2.AbstractC3489k
    /* renamed from: b */
    public AbstractC0014i mo15197b() {
        return this.f14423c;
    }

    @Override // p109i2.AbstractC3489k
    /* renamed from: c */
    public long mo15198c() {
        return this.f14421a;
    }

    @Override // p109i2.AbstractC3489k
    /* renamed from: d */
    public AbstractC0020o mo15199d() {
        return this.f14422b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3489k)) {
            return false;
        }
        AbstractC3489k abstractC3489k = (AbstractC3489k) obj;
        return this.f14421a == abstractC3489k.mo15198c() && this.f14422b.equals(abstractC3489k.mo15199d()) && this.f14423c.equals(abstractC3489k.mo15197b());
    }

    public int hashCode() {
        long j10 = this.f14421a;
        return this.f14423c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14422b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f14421a + ", transportContext=" + this.f14422b + ", event=" + this.f14423c + "}";
    }
}
