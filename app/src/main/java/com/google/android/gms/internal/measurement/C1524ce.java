package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ce */
/* loaded from: classes.dex */
public final class C1524ce implements InterfaceC1507be {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f6738a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f6739b;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f6738a = c1618i6.m8302e("measurement.module.pixie.ees", true);
        f6739b = c1618i6.m8302e("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1507be
    /* renamed from: a */
    public final boolean mo7965a() {
        return f6739b.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1507be
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1507be
    public final boolean zzb() {
        return f6738a.m8380b().booleanValue();
    }
}
