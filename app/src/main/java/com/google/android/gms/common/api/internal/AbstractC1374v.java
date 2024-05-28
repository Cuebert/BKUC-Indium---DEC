package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p295x2.C5507b;
import p308y2.AbstractC5632v;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
abstract class AbstractC1374v<T> extends AbstractC5632v {

    /* renamed from: b */
    protected final C3265m<T> f6250b;

    public AbstractC1374v(int i10, C3265m<T> c3265m) {
        super(i10);
        this.f6250b = c3265m;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: a */
    public final void mo7448a(Status status) {
        this.f6250b.m14515d(new C5507b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: b */
    public final void mo7449b(Exception exc) {
        this.f6250b.m14515d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: c */
    public final void mo7450c(C1367o<?> c1367o) throws DeadObjectException {
        try {
            mo7586h(c1367o);
        } catch (DeadObjectException e10) {
            mo7448a(AbstractC1347a0.m7447e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo7448a(AbstractC1347a0.m7447e(e11));
        } catch (RuntimeException e12) {
            this.f6250b.m14515d(e12);
        }
    }

    /* renamed from: h */
    protected abstract void mo7586h(C1367o<?> c1367o) throws RemoteException;
}
