package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.md */
/* loaded from: classes.dex */
public final class C1689md implements InterfaceC1673ld {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7018a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7019b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f7020c;

    /* renamed from: d */
    public static final AbstractC1666l6<Long> f7021d;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7018a = c1618i6.m8302e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f7019b = c1618i6.m8302e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f7020c = c1618i6.m8302e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f7021d = c1618i6.m8300c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1673ld
    public final boolean zza() {
        return f7018a.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1673ld
    public final boolean zzb() {
        return f7020c.m8380b().booleanValue();
    }
}
