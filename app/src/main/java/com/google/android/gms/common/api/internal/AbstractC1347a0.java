package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC1347a0 {

    /* renamed from: a */
    public final int f6159a;

    public AbstractC1347a0(int i10) {
        this.f6159a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m7447e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo7448a(Status status);

    /* renamed from: b */
    public abstract void mo7449b(Exception exc);

    /* renamed from: c */
    public abstract void mo7450c(C1367o<?> c1367o) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo7451d(C1358g c1358g, boolean z10);
}
