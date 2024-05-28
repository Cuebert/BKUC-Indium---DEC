package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xc */
/* loaded from: classes.dex */
public final class C1864xc implements InterfaceC1848wc {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7317a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7318b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f7319c;

    /* renamed from: d */
    public static final AbstractC1666l6<Boolean> f7320d;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7317a = c1618i6.m8302e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f7318b = c1618i6.m8302e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f7319c = c1618i6.m8302e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f7320d = c1618i6.m8302e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1848wc
    /* renamed from: a */
    public final boolean mo8951a() {
        return f7319c.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1848wc
    /* renamed from: c */
    public final boolean mo8952c() {
        return f7320d.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1848wc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1848wc
    public final boolean zzb() {
        return f7318b.m8380b().booleanValue();
    }
}
