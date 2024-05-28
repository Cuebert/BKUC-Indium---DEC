package p158m0;

import p158m0.C3918f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m0.g */
/* loaded from: classes.dex */
public class C3919g extends C3918f {

    /* renamed from: m */
    public int f16268m;

    public C3919g(AbstractC3928p abstractC3928p) {
        super(abstractC3928p);
        if (abstractC3928p instanceof C3924l) {
            this.f16251e = C3918f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f16251e = C3918f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p158m0.C3918f
    /* renamed from: d */
    public void mo16623d(int i10) {
        if (this.f16256j) {
            return;
        }
        this.f16256j = true;
        this.f16253g = i10;
        for (InterfaceC3916d interfaceC3916d : this.f16257k) {
            interfaceC3916d.mo16601a(interfaceC3916d);
        }
    }
}
