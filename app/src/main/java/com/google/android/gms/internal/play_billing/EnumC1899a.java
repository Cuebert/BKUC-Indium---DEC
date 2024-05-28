package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.a */
/* loaded from: classes.dex */
public enum EnumC1899a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* renamed from: D */
    private static final AbstractC2045u5 f7614D;

    /* renamed from: n */
    private final int f7628n;

    static {
        C2038t5 c2038t5 = new C2038t5();
        for (EnumC1899a enumC1899a : values()) {
            c2038t5.m9653a(Integer.valueOf(enumC1899a.f7628n), enumC1899a);
        }
        f7614D = c2038t5.m9654b();
    }

    EnumC1899a(int i10) {
        this.f7628n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static EnumC1899a m9199b(int i10) {
        AbstractC2045u5 abstractC2045u5 = f7614D;
        Integer valueOf = Integer.valueOf(i10);
        return !abstractC2045u5.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC1899a) abstractC2045u5.get(valueOf);
    }
}
