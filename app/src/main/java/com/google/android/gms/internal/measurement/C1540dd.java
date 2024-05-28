package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dd */
/* loaded from: classes.dex */
public final class C1540dd implements InterfaceC1523cd {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f6750a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f6751b;

    /* renamed from: c */
    public static final AbstractC1666l6<Long> f6752c;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f6750a = c1618i6.m8302e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f6751b = c1618i6.m8302e("measurement.collection.redundant_engagement_removal_enabled", false);
        f6752c = c1618i6.m8300c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1523cd
    public final boolean zza() {
        return f6751b.m8380b().booleanValue();
    }
}
