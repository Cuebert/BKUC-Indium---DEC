package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ec */
/* loaded from: classes.dex */
public final class C1556ec implements InterfaceC1539dc {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f6777a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f6778b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f6779c;

    /* renamed from: d */
    public static final AbstractC1666l6<Long> f6780d;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f6777a = c1618i6.m8302e("measurement.client.consent_state_v1", true);
        f6778b = c1618i6.m8302e("measurement.client.3p_consent_state_v1", true);
        f6779c = c1618i6.m8302e("measurement.service.consent_state_v1_W36", true);
        f6780d = c1618i6.m8300c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1539dc
    public final long zza() {
        return f6780d.m8380b().longValue();
    }
}
