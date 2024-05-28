package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1614i2 implements Runnable {

    /* renamed from: n */
    final long f6839n;

    /* renamed from: o */
    final long f6840o;

    /* renamed from: p */
    final boolean f6841p;

    /* renamed from: q */
    final /* synthetic */ C1774s2 f6842q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC1614i2(C1774s2 c1774s2, boolean z10) {
        this.f6842q = c1774s2;
        this.f6839n = c1774s2.f7222b.mo13781a();
        this.f6840o = c1774s2.f7222b.mo13782b();
        this.f6841p = z10;
    }

    /* renamed from: a */
    abstract void mo7878a() throws RemoteException;

    /* renamed from: b */
    protected void mo7879b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.f6842q.f7227g;
        if (z10) {
            mo7879b();
            return;
        }
        try {
            mo7878a();
        } catch (Exception e10) {
            this.f6842q.m8778i(e10, false, this.f6841p);
            mo7879b();
        }
    }
}
