package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p235s3.C4518a;
import p235s3.C4520c;

/* renamed from: com.google.android.gms.common.internal.x */
/* loaded from: classes.dex */
public final class C1410x extends C4518a implements InterfaceC1391e {
    public C1410x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1391e
    public final Account zzb() throws RemoteException {
        Parcel m18538i = m18538i(2, m18539l());
        Account account = (Account) C4520c.m18541a(m18538i, Account.CREATOR);
        m18538i.recycle();
        return account;
    }
}
