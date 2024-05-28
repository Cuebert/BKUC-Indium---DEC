package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0843j {

    /* renamed from: n */
    private final InterfaceC0838e[] f4223n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC0838e[] interfaceC0838eArr) {
        this.f4223n = interfaceC0838eArr;
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        C0850q c0850q = new C0850q();
        for (InterfaceC0838e interfaceC0838e : this.f4223n) {
            interfaceC0838e.mo4888a(interfaceC0845l, bVar, false, c0850q);
        }
        for (InterfaceC0838e interfaceC0838e2 : this.f4223n) {
            interfaceC0838e2.mo4888a(interfaceC0845l, bVar, true, c0850q);
        }
    }
}
