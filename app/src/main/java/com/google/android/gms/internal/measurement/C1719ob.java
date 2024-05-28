package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ob */
/* loaded from: classes.dex */
public final class C1719ob implements InterfaceC1703nb {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f7120a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f7121b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f7122c;

    /* renamed from: d */
    public static final AbstractC1666l6<Long> f7123d;

    /* renamed from: e */
    public static final AbstractC1666l6<Boolean> f7124e;

    /* renamed from: f */
    public static final AbstractC1666l6<Boolean> f7125f;

    static {
        C1618i6 m8298a = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement")).m8298a();
        f7120a = m8298a.m8302e("measurement.adid_zero.app_instance_id_fix", true);
        f7121b = m8298a.m8302e("measurement.adid_zero.service", false);
        f7122c = m8298a.m8302e("measurement.adid_zero.adid_uid", false);
        f7123d = m8298a.m8300c("measurement.id.adid_zero.service", 0L);
        f7124e = m8298a.m8302e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f7125f = m8298a.m8302e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    /* renamed from: a */
    public final boolean mo8626a() {
        return f7121b.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    /* renamed from: b */
    public final boolean mo8627b() {
        return f7124e.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    /* renamed from: c */
    public final boolean mo8628c() {
        return f7122c.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    /* renamed from: f */
    public final boolean mo8629f() {
        return f7125f.m8380b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1703nb
    public final boolean zzb() {
        return f7120a.m8380b().booleanValue();
    }
}
