package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes.dex */
final class C1662l2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ Activity f6959r;

    /* renamed from: s */
    final /* synthetic */ C1758r2 f6960s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662l2(C1758r2 c1758r2, Activity activity) {
        super(c1758r2.f7193n, true);
        this.f6960s = c1758r2;
        this.f6959r = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6960s.f7193n.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).onActivityResumed(BinderC3517b.m15328J0(this.f6959r), this.f6840o);
    }
}
