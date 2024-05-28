package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p295x2.C5506a.b;
import p295x2.InterfaceC5518m;
import p308y2.InterfaceC5604c;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC1348b<R extends InterfaceC5518m, A extends C5506a.b> extends BasePendingResult<R> implements InterfaceC5604c<R> {

    /* renamed from: q */
    private final C5506a.c<A> f6160q;

    /* renamed from: r */
    private final C5506a<?> f6161r;

    public AbstractC1348b(C5506a<?> c5506a, AbstractC5511f abstractC5511f) {
        super((AbstractC5511f) C5984j.m21287k(abstractC5511f, "GoogleApiClient must not be null"));
        C5984j.m21287k(c5506a, "Api must not be null");
        this.f6160q = (C5506a.c<A>) c5506a.m20244b();
        this.f6161r = c5506a;
    }

    /* renamed from: p */
    private void m7452p(RemoteException remoteException) {
        m7457q(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p308y2.InterfaceC5604c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7453a(Object obj) {
        super.m7426g((InterfaceC5518m) obj);
    }

    /* renamed from: m */
    protected abstract void mo7454m(A a10) throws RemoteException;

    /* renamed from: n */
    protected void m7455n(R r10) {
    }

    /* renamed from: o */
    public final void m7456o(A a10) throws DeadObjectException {
        try {
            mo7454m(a10);
        } catch (DeadObjectException e10) {
            m7452p(e10);
            throw e10;
        } catch (RemoteException e11) {
            m7452p(e11);
        }
    }

    /* renamed from: q */
    public final void m7457q(Status status) {
        C5984j.m21278b(!status.m7410B(), "Failed result must not be success");
        R mo7423d = mo7423d(status);
        m7426g(mo7423d);
        m7455n(mo7423d);
    }
}
