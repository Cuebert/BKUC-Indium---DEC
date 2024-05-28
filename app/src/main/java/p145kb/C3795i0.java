package p145kb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kb.i0 */
/* loaded from: classes.dex */
public final class C3795i0 implements InterfaceC3817q0 {

    /* renamed from: n */
    private final boolean f15846n;

    public C3795i0(boolean z10) {
        this.f15846n = z10;
    }

    @Override // p145kb.InterfaceC3817q0
    /* renamed from: c */
    public boolean mo16043c() {
        return this.f15846n;
    }

    @Override // p145kb.InterfaceC3817q0
    /* renamed from: d */
    public C3784e1 mo16044d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo16043c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
