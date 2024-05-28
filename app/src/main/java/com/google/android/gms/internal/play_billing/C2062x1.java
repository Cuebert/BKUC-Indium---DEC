package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.x1 */
/* loaded from: classes.dex */
public final class C2062x1 implements InterfaceC2021r2 {

    /* renamed from: b */
    private static final InterfaceC1930e2 f7882b = new C2048v1();

    /* renamed from: a */
    private final InterfaceC1930e2 f7883a;

    public C2062x1() {
        InterfaceC1930e2 interfaceC1930e2;
        InterfaceC1930e2[] interfaceC1930e2Arr = new InterfaceC1930e2[2];
        interfaceC1930e2Arr[0] = C2067y0.m9688c();
        try {
            interfaceC1930e2 = (InterfaceC1930e2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC1930e2 = f7882b;
        }
        interfaceC1930e2Arr[1] = interfaceC1930e2;
        C2055w1 c2055w1 = new C2055w1(interfaceC1930e2Arr);
        byte[] bArr = C1950h1.f7678d;
        this.f7883a = c2055w1;
    }

    /* renamed from: b */
    private static boolean m9680b(InterfaceC1923d2 interfaceC1923d2) {
        return interfaceC1923d2.mo9310a() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2021r2
    /* renamed from: a */
    public final InterfaceC2014q2 mo9557a(Class cls) {
        C2028s2.m9588c(cls);
        InterfaceC1923d2 mo9326a = this.f7883a.mo9326a(cls);
        if (mo9326a.zzb()) {
            if (AbstractC1922d1.class.isAssignableFrom(cls)) {
                return C1972k2.m9486j(C2028s2.m9585V(), C2026s0.m9563b(), mo9326a.zza());
            }
            return C1972k2.m9486j(C2028s2.m9584U(), C2026s0.m9562a(), mo9326a.zza());
        }
        if (AbstractC1922d1.class.isAssignableFrom(cls)) {
            if (m9680b(mo9326a)) {
                return C1965j2.m9413H(cls, mo9326a, C1986m2.m9509b(), AbstractC2034t1.m9647d(), C2028s2.m9585V(), C2026s0.m9563b(), C1916c2.m9280b());
            }
            return C1965j2.m9413H(cls, mo9326a, C1986m2.m9509b(), AbstractC2034t1.m9647d(), C2028s2.m9585V(), null, C1916c2.m9280b());
        }
        if (m9680b(mo9326a)) {
            return C1965j2.m9413H(cls, mo9326a, C1986m2.m9508a(), AbstractC2034t1.m9646c(), C2028s2.m9584U(), C2026s0.m9562a(), C1916c2.m9279a());
        }
        return C1965j2.m9413H(cls, mo9326a, C1986m2.m9508a(), AbstractC2034t1.m9646c(), C2028s2.m9584U(), null, C1916c2.m9279a());
    }
}
