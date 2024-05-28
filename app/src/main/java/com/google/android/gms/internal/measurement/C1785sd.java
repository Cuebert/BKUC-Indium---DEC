package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sd */
/* loaded from: classes.dex */
public final class C1785sd implements InterfaceC1769rd {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7235a;

    /* renamed from: b */
    public static final AbstractC1666l6<Long> f7236b;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7235a = c1618i6.m8302e("measurement.validation.internal_limits_internal_event_params", false);
        f7236b = c1618i6.m8300c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1769rd
    public final boolean zza() {
        return f7235a.m8380b().booleanValue();
    }
}
