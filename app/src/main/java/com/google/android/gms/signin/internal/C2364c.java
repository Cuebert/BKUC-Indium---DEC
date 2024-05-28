package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p058e4.InterfaceC3067c;
import p222r3.C4422a;
import p222r3.C4424c;

/* renamed from: com.google.android.gms.signin.internal.c */
/* loaded from: classes.dex */
public final class C2364c extends C4422a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2364c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: J0 */
    public final void m10415J0(zai zaiVar, InterfaceC3067c interfaceC3067c) throws RemoteException {
        Parcel m18222i = m18222i();
        C4424c.m18226b(m18222i, zaiVar);
        C4424c.m18227c(m18222i, interfaceC3067c);
        m18223l(12, m18222i);
    }
}
