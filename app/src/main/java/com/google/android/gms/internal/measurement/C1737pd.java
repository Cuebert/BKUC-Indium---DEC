package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pd */
/* loaded from: classes.dex */
public final class C1737pd implements InterfaceC1721od {

    /* renamed from: a */
    public static final AbstractC1666l6<Long> f7158a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7159b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f7160c;

    /* renamed from: d */
    public static final AbstractC1666l6<Boolean> f7161d;

    /* renamed from: e */
    public static final AbstractC1666l6<Long> f7162e;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7158a = c1618i6.m8300c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f7159b = c1618i6.m8302e("measurement.lifecycle.app_backgrounded_engagement", false);
        f7160c = c1618i6.m8302e("measurement.lifecycle.app_backgrounded_tracking", true);
        f7161d = c1618i6.m8302e("measurement.lifecycle.app_in_background_parameter", false);
        f7162e = c1618i6.m8300c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1721od
    public final boolean zza() {
        return f7159b.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1721od
    public final boolean zzb() {
        return f7161d.m8380b().booleanValue();
    }
}
