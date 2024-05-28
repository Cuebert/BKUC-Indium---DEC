package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ad */
/* loaded from: classes.dex */
public final class C1489ad implements InterfaceC1896zc {

    /* renamed from: a */
    public static final AbstractC1666l6<Boolean> f6641a;

    /* renamed from: b */
    public static final AbstractC1666l6<Boolean> f6642b;

    /* renamed from: c */
    public static final AbstractC1666l6<Boolean> f6643c;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f6641a = c1618i6.m8302e("measurement.client.sessions.check_on_reset_and_enable2", true);
        f6642b = c1618i6.m8302e("measurement.client.sessions.check_on_startup", true);
        f6643c = c1618i6.m8302e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1896zc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1896zc
    public final boolean zzb() {
        return f6641a.m8380b().booleanValue();
    }
}
