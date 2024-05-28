package p019b5;

import java.util.Objects;
import p019b5.InterfaceC1016c;

/* renamed from: b5.c0 */
/* loaded from: classes.dex */
final class C1017c0 extends AbstractC1022f {

    /* renamed from: a */
    private String f5193a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p019b5.AbstractC1022f
    /* renamed from: a */
    public final AbstractC1022f mo6263a(String str) {
        Objects.requireNonNull(str, "Null token");
        this.f5193a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p019b5.AbstractC1022f
    /* renamed from: b */
    public final InterfaceC1016c.b mo6264b() {
        String str = this.f5193a;
        if (str != null) {
            return new C1021e0(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
