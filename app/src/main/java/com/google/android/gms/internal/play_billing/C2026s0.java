package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s0 */
/* loaded from: classes.dex */
final class C2026s0 {

    /* renamed from: a */
    private static final AbstractC2012q0 f7783a = new C2019r0();

    /* renamed from: b */
    private static final AbstractC2012q0 f7784b;

    static {
        AbstractC2012q0 abstractC2012q0;
        try {
            abstractC2012q0 = (AbstractC2012q0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC2012q0 = null;
        }
        f7784b = abstractC2012q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC2012q0 m9562a() {
        AbstractC2012q0 abstractC2012q0 = f7784b;
        if (abstractC2012q0 != null) {
            return abstractC2012q0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC2012q0 m9563b() {
        return f7783a;
    }
}
