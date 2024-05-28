package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f8 */
/* loaded from: classes.dex */
final class C1569f8 {

    /* renamed from: a */
    private static final AbstractC1535d8<?> f6791a = new C1552e8();

    /* renamed from: b */
    private static final AbstractC1535d8<?> f6792b;

    static {
        AbstractC1535d8<?> abstractC1535d8;
        try {
            abstractC1535d8 = (AbstractC1535d8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC1535d8 = null;
        }
        f6792b = abstractC1535d8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC1535d8<?> m8154a() {
        AbstractC1535d8<?> abstractC1535d8 = f6792b;
        if (abstractC1535d8 != null) {
            return abstractC1535d8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC1535d8<?> m8155b() {
        return f6791a;
    }
}
