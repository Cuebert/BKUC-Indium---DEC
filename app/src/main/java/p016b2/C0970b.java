package p016b2;

import java.util.Objects;
import p016b2.AbstractC0975g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b2.b */
/* loaded from: classes.dex */
public final class C0970b extends AbstractC0975g {

    /* renamed from: a */
    private final AbstractC0975g.a f5144a;

    /* renamed from: b */
    private final long f5145b;

    public C0970b(AbstractC0975g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f5144a = aVar;
        this.f5145b = j10;
    }

    @Override // p016b2.AbstractC0975g
    /* renamed from: b */
    public long mo6151b() {
        return this.f5145b;
    }

    @Override // p016b2.AbstractC0975g
    /* renamed from: c */
    public AbstractC0975g.a mo6152c() {
        return this.f5144a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0975g)) {
            return false;
        }
        AbstractC0975g abstractC0975g = (AbstractC0975g) obj;
        return this.f5144a.equals(abstractC0975g.mo6152c()) && this.f5145b == abstractC0975g.mo6151b();
    }

    public int hashCode() {
        int hashCode = (this.f5144a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f5145b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5144a + ", nextRequestWaitMillis=" + this.f5145b + "}";
    }
}
