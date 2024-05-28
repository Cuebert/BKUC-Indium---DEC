package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.y0 */
/* loaded from: classes.dex */
final class C2067y0 implements InterfaceC1930e2 {

    /* renamed from: a */
    private static final C2067y0 f7890a = new C2067y0();

    private C2067y0() {
    }

    /* renamed from: c */
    public static C2067y0 m9688c() {
        return f7890a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1930e2
    /* renamed from: a */
    public final InterfaceC1923d2 mo9326a(Class cls) {
        if (AbstractC1922d1.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC1923d2) AbstractC1922d1.m9289i(cls.asSubclass(AbstractC1922d1.class)).mo9309t(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1930e2
    /* renamed from: b */
    public final boolean mo9327b(Class cls) {
        return AbstractC1922d1.class.isAssignableFrom(cls);
    }
}
