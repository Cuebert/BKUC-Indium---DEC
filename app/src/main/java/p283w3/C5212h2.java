package p283w3;

import java.io.IOException;
import p152l5.C3875b;
import p152l5.C3876c;
import p152l5.InterfaceC3880g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.h2 */
/* loaded from: classes.dex */
public final class C5212h2 implements InterfaceC3880g {

    /* renamed from: a */
    private boolean f19715a = false;

    /* renamed from: b */
    private boolean f19716b = false;

    /* renamed from: c */
    private C3876c f19717c;

    /* renamed from: d */
    private final C5159d2 f19718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5212h2(C5159d2 c5159d2) {
        this.f19718d = c5159d2;
    }

    /* renamed from: d */
    private final void m19840d() {
        if (this.f19715a) {
            throw new C3875b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19715a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m19841a(C3876c c3876c, boolean z10) {
        this.f19715a = false;
        this.f19717c = c3876c;
        this.f19716b = z10;
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: b */
    public final InterfaceC3880g mo16486b(String str) throws IOException {
        m19840d();
        this.f19718d.m19783e(this.f19717c, str, this.f19716b);
        return this;
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: c */
    public final InterfaceC3880g mo16487c(boolean z10) throws IOException {
        m19840d();
        this.f19718d.m19784f(this.f19717c, z10 ? 1 : 0, this.f19716b);
        return this;
    }
}
