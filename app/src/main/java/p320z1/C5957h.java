package p320z1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z1.h */
/* loaded from: classes.dex */
public final class C5957h extends AbstractC5963n {

    /* renamed from: a */
    private final long f21957a;

    public C5957h(long j10) {
        this.f21957a = j10;
    }

    @Override // p320z1.AbstractC5963n
    /* renamed from: c */
    public long mo21216c() {
        return this.f21957a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC5963n) && this.f21957a == ((AbstractC5963n) obj).mo21216c();
    }

    public int hashCode() {
        long j10 = this.f21957a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f21957a + "}";
    }
}
