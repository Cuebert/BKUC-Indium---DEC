package p309y3;

import java.io.IOException;
import p152l5.C3875b;
import p152l5.C3876c;
import p152l5.InterfaceC3880g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y3.e */
/* loaded from: classes.dex */
public final class C5677e implements InterfaceC3880g {

    /* renamed from: a */
    private boolean f20912a = false;

    /* renamed from: b */
    private boolean f20913b = false;

    /* renamed from: c */
    private C3876c f20914c;

    /* renamed from: d */
    private final C5746k8 f20915d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5677e(C5746k8 c5746k8) {
        this.f20915d = c5746k8;
    }

    /* renamed from: d */
    private final void m20670d() {
        if (this.f20912a) {
            throw new C3875b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20912a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m20671a(C3876c c3876c, boolean z10) {
        this.f20912a = false;
        this.f20914c = c3876c;
        this.f20913b = z10;
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: b */
    public final InterfaceC3880g mo16486b(String str) throws IOException {
        m20670d();
        this.f20915d.m20704e(this.f20914c, str, this.f20913b);
        return this;
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: c */
    public final InterfaceC3880g mo16487c(boolean z10) throws IOException {
        m20670d();
        this.f20915d.m20705f(this.f20914c, z10 ? 1 : 0, this.f20913b);
        return this;
    }
}
