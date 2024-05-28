package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
/* loaded from: classes.dex */
final class C1653k9 implements InterfaceC1781s9 {

    /* renamed from: a */
    private final InterfaceC1781s9[] f6934a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1653k9(InterfaceC1781s9... interfaceC1781s9Arr) {
        this.f6934a = interfaceC1781s9Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1781s9
    /* renamed from: a */
    public final InterfaceC1749q9 mo8334a(Class<?> cls) {
        InterfaceC1781s9[] interfaceC1781s9Arr = this.f6934a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC1781s9 interfaceC1781s9 = interfaceC1781s9Arr[i10];
            if (interfaceC1781s9.mo8335b(cls)) {
                return interfaceC1781s9.mo8334a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1781s9
    /* renamed from: b */
    public final boolean mo8335b(Class<?> cls) {
        InterfaceC1781s9[] interfaceC1781s9Arr = this.f6934a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC1781s9Arr[i10].mo8335b(cls)) {
                return true;
            }
        }
        return false;
    }
}
