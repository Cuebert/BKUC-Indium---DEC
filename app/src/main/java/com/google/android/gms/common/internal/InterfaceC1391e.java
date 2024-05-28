package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p235s3.BinderC4519b;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public interface InterfaceC1391e extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC4519b implements InterfaceC1391e {
        /* renamed from: l */
        public static InterfaceC1391e m7694l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC1391e ? (InterfaceC1391e) queryLocalInterface : new C1410x(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
