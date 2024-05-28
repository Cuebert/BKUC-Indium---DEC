package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1772s0 extends BinderC1724p0 implements InterfaceC1788t0 {
    /* renamed from: l */
    public static InterfaceC1788t0 m8772l(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC1788t0 ? (InterfaceC1788t0) queryLocalInterface : new C1756r0(iBinder);
    }
}
