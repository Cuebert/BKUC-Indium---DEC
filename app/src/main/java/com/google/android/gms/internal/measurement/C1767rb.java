package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rb */
/* loaded from: classes.dex */
public final class C1767rb implements InterfaceC1751qb {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7208a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7209b;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7208a = c1618i6.m8302e("measurement.androidId.delete_feature", true);
        f7209b = c1618i6.m8302e("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1751qb
    public final boolean zza() {
        return f7208a.m8380b().booleanValue();
    }
}
