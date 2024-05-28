package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l9 */
/* loaded from: classes.dex */
public final class C1669l9 implements InterfaceC1588ga {

    /* renamed from: b */
    private static final InterfaceC1781s9 f6987b = new C1637j9();

    /* renamed from: a */
    private final InterfaceC1781s9 f6988a;

    public C1669l9() {
        InterfaceC1781s9 interfaceC1781s9;
        InterfaceC1781s9[] interfaceC1781s9Arr = new InterfaceC1781s9[2];
        interfaceC1781s9Arr[0] = C1668l8.m8382c();
        try {
            interfaceC1781s9 = (InterfaceC1781s9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC1781s9 = f6987b;
        }
        interfaceC1781s9Arr[1] = interfaceC1781s9;
        C1653k9 c1653k9 = new C1653k9(interfaceC1781s9Arr);
        C1860x8.m9010f(c1653k9, "messageInfoFactory");
        this.f6988a = c1653k9;
    }

    /* renamed from: b */
    private static boolean m8383b(InterfaceC1749q9 interfaceC1749q9) {
        return interfaceC1749q9.mo8092a() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1588ga
    /* renamed from: a */
    public final <T> InterfaceC1571fa<T> mo8198a(Class<T> cls) {
        C1605ha.m8271g(cls);
        InterfaceC1749q9 mo8334a = this.f6988a.mo8334a(cls);
        if (mo8334a.zzb()) {
            if (AbstractC1732p8.class.isAssignableFrom(cls)) {
                return C1877y9.m9106j(C1605ha.m8265b(), C1569f8.m8155b(), mo8334a.zza());
            }
            return C1877y9.m9106j(C1605ha.m8266b0(), C1569f8.m8154a(), mo8334a.zza());
        }
        if (AbstractC1732p8.class.isAssignableFrom(cls)) {
            if (m8383b(mo8334a)) {
                return C1861x9.m9018F(cls, mo8334a, C1486aa.m7892b(), AbstractC1604h9.m8236d(), C1605ha.m8265b(), C1569f8.m8155b(), C1733p9.m8685b());
            }
            return C1861x9.m9018F(cls, mo8334a, C1486aa.m7892b(), AbstractC1604h9.m8236d(), C1605ha.m8265b(), null, C1733p9.m8685b());
        }
        if (m8383b(mo8334a)) {
            return C1861x9.m9018F(cls, mo8334a, C1486aa.m7891a(), AbstractC1604h9.m8235c(), C1605ha.m8266b0(), C1569f8.m8154a(), C1733p9.m8684a());
        }
        return C1861x9.m9018F(cls, mo8334a, C1486aa.m7891a(), AbstractC1604h9.m8235c(), C1605ha.m8263a(), null, C1733p9.m8684a());
    }
}
