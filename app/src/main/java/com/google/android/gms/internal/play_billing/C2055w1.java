package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.w1 */
/* loaded from: classes.dex */
final class C2055w1 implements InterfaceC1930e2 {

    /* renamed from: a */
    private final InterfaceC1930e2[] f7877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2055w1(InterfaceC1930e2... interfaceC1930e2Arr) {
        this.f7877a = interfaceC1930e2Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1930e2
    /* renamed from: a */
    public final InterfaceC1923d2 mo9326a(Class cls) {
        InterfaceC1930e2[] interfaceC1930e2Arr = this.f7877a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC1930e2 interfaceC1930e2 = interfaceC1930e2Arr[i10];
            if (interfaceC1930e2.mo9327b(cls)) {
                return interfaceC1930e2.mo9326a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1930e2
    /* renamed from: b */
    public final boolean mo9327b(Class cls) {
        InterfaceC1930e2[] interfaceC1930e2Arr = this.f7877a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC1930e2Arr[i10].mo9327b(cls)) {
                return true;
            }
        }
        return false;
    }
}
