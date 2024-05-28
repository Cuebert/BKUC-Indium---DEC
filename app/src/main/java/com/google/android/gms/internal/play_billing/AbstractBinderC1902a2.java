package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.play_billing.a2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1902a2 extends BinderC1940f5 implements InterfaceC1910b3 {
    /* renamed from: i */
    public static InterfaceC1910b3 m9200i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof InterfaceC1910b3 ? (InterfaceC1910b3) queryLocalInterface : new C1915c1(iBinder);
    }
}
