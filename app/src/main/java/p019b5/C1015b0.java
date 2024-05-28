package p019b5;

import p019b5.InterfaceC1016c;

/* renamed from: b5.b0 */
/* loaded from: classes.dex */
final class C1015b0 extends InterfaceC1016c.a {

    /* renamed from: a */
    private final long f5192a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1015b0(long j10, C1013a0 c1013a0) {
        this.f5192a = j10;
    }

    @Override // p019b5.InterfaceC1016c.a
    /* renamed from: a */
    public final long mo6252a() {
        return this.f5192a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InterfaceC1016c.a) && this.f5192a == ((InterfaceC1016c.a) obj).mo6252a();
    }

    public final int hashCode() {
        long j10 = this.f5192a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f5192a + "}";
    }
}
