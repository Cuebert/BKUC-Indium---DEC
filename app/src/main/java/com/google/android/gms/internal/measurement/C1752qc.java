package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qc */
/* loaded from: classes.dex */
public final class C1752qc implements InterfaceC1736pc {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7184a = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement")).m8302e("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1736pc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1736pc
    public final boolean zzb() {
        return f7184a.m8380b().booleanValue();
    }
}
