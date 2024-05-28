package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC1391e;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public class BinderC1387a extends InterfaceC1391e.a {
    /* renamed from: n */
    public static Account m7629n(InterfaceC1391e interfaceC1391e) {
        Account account = null;
        if (interfaceC1391e != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1391e.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
