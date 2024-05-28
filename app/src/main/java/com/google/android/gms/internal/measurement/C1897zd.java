package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zd */
/* loaded from: classes.dex */
public final class C1897zd implements InterfaceC1881yd {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7352a;

    /* renamed from: b */
    public static final AbstractC1666l6<Double> f7353b;

    /* renamed from: c */
    public static final AbstractC1666l6<Long> f7354c;

    /* renamed from: d */
    public static final AbstractC1666l6<Long> f7355d;

    /* renamed from: e */
    public static final AbstractC1666l6<String> f7356e;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f7352a = c1618i6.m8302e("measurement.test.boolean_flag", false);
        f7353b = c1618i6.m8299b("measurement.test.double_flag", -3.0d);
        f7354c = c1618i6.m8300c("measurement.test.int_flag", -2L);
        f7355d = c1618i6.m8300c("measurement.test.long_flag", -1L);
        f7356e = c1618i6.m8301d("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881yd
    /* renamed from: a */
    public final long mo9110a() {
        return f7355d.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881yd
    /* renamed from: b */
    public final boolean mo9111b() {
        return f7352a.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881yd
    /* renamed from: c */
    public final String mo9112c() {
        return f7356e.m8380b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881yd
    public final double zza() {
        return f7353b.m8380b().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881yd
    public final long zzb() {
        return f7354c.m8380b().longValue();
    }
}
