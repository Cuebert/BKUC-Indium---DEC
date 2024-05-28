package p019b5;

import p019b5.InterfaceC1016c;

/* renamed from: b5.e0 */
/* loaded from: classes.dex */
final class C1021e0 extends InterfaceC1016c.b {

    /* renamed from: a */
    private final String f5195a;

    @Override // p019b5.InterfaceC1016c.b
    /* renamed from: a */
    public final String mo6257a() {
        return this.f5195a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1016c.b) {
            return this.f5195a.equals(((InterfaceC1016c.b) obj).mo6257a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5195a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityToken{token=" + this.f5195a + "}";
    }
}
