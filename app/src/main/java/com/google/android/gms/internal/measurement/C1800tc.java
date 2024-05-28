package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tc */
/* loaded from: classes.dex */
public final class C1800tc implements InterfaceC1784sc {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7245a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7246b;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7245a = c1618i6.m8302e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f7246b = c1618i6.m8302e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1784sc
    /* renamed from: a */
    public final boolean mo8816a() {
        return f7246b.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1784sc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1784sc
    public final boolean zzb() {
        return f7245a.m8380b().booleanValue();
    }
}
