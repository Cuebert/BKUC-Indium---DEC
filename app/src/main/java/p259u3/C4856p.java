package p259u3;

import java.util.Objects;

/* renamed from: u3.p */
/* loaded from: classes.dex */
final class C4856p extends AbstractC4855o {

    /* renamed from: b */
    private final C4854n f18728b = new C4854n();

    @Override // p259u3.AbstractC4855o
    /* renamed from: a */
    public final void mo19041a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f18728b.m19043a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
