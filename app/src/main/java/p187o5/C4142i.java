package p187o5;

import java.io.IOException;
import p152l5.C3875b;
import p152l5.C3876c;
import p152l5.InterfaceC3880g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o5.i */
/* loaded from: classes.dex */
public class C4142i implements InterfaceC3880g {

    /* renamed from: a */
    private boolean f16869a = false;

    /* renamed from: b */
    private boolean f16870b = false;

    /* renamed from: c */
    private C3876c f16871c;

    /* renamed from: d */
    private final C4139f f16872d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4142i(C4139f c4139f) {
        this.f16872d = c4139f;
    }

    /* renamed from: a */
    private void m17166a() {
        if (!this.f16869a) {
            this.f16869a = true;
            return;
        }
        throw new C3875b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: b */
    public InterfaceC3880g mo16486b(String str) throws IOException {
        m17166a();
        this.f16872d.m17151f(this.f16871c, str, this.f16870b);
        return this;
    }

    @Override // p152l5.InterfaceC3880g
    /* renamed from: c */
    public InterfaceC3880g mo16487c(boolean z10) throws IOException {
        m17166a();
        this.f16872d.m17156k(this.f16871c, z10, this.f16870b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17167d(C3876c c3876c, boolean z10) {
        this.f16869a = false;
        this.f16871c = c3876c;
        this.f16870b = z10;
    }
}
