package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* loaded from: classes.dex */
final class C1668l8 implements InterfaceC1781s9 {

    /* renamed from: a */
    private static final C1668l8 f6986a = new C1668l8();

    private C1668l8() {
    }

    /* renamed from: c */
    public static C1668l8 m8382c() {
        return f6986a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1781s9
    /* renamed from: a */
    public final InterfaceC1749q9 mo8334a(Class<?> cls) {
        if (!AbstractC1732p8.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC1749q9) AbstractC1732p8.m8672r(cls.asSubclass(AbstractC1732p8.class)).mo7884v(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1781s9
    /* renamed from: b */
    public final boolean mo8335b(Class<?> cls) {
        return AbstractC1732p8.class.isAssignableFrom(cls);
    }
}
