package p045d5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d5.q */
/* loaded from: classes.dex */
public final class C2998q extends AbstractC2999r {

    /* renamed from: a */
    private final int f12692a;

    /* renamed from: b */
    private final long f12693b;

    public C2998q(int i10, long j10) {
        this.f12692a = i10;
        this.f12693b = j10;
    }

    @Override // p045d5.AbstractC2999r
    /* renamed from: a */
    public final int mo13470a() {
        return this.f12692a;
    }

    @Override // p045d5.AbstractC2999r
    /* renamed from: b */
    public final long mo13471b() {
        return this.f12693b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2999r) {
            AbstractC2999r abstractC2999r = (AbstractC2999r) obj;
            if (this.f12692a == abstractC2999r.mo13470a() && this.f12693b == abstractC2999r.mo13471b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12692a ^ 1000003;
        long j10 = this.f12693b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12692a + ", eventTimestamp=" + this.f12693b + "}";
    }
}
