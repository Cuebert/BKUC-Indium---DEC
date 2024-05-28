package p019b5;

import p019b5.InterfaceC1016c;

/* renamed from: b5.h0 */
/* loaded from: classes.dex */
final class C1027h0 extends InterfaceC1016c.d {

    /* renamed from: a */
    private final String f5201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1027h0(String str, C1025g0 c1025g0) {
        this.f5201a = str;
    }

    @Override // p019b5.InterfaceC1016c.d
    /* renamed from: a */
    public final String mo6260a() {
        return this.f5201a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1016c.d)) {
            return false;
        }
        InterfaceC1016c.d dVar = (InterfaceC1016c.d) obj;
        String str = this.f5201a;
        return str == null ? dVar.mo6260a() == null : str.equals(dVar.mo6260a());
    }

    public final int hashCode() {
        String str = this.f5201a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f5201a + "}";
    }
}
