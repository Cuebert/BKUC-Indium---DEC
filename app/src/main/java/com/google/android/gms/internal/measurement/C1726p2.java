package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
/* loaded from: classes.dex */
final class C1726p2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ Activity f7136r;

    /* renamed from: s */
    final /* synthetic */ BinderC1494b1 f7137s;

    /* renamed from: t */
    final /* synthetic */ C1758r2 f7138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726p2(C1758r2 c1758r2, Activity activity, BinderC1494b1 binderC1494b1) {
        super(c1758r2.f7193n, true);
        this.f7138t = c1758r2;
        this.f7136r = activity;
        this.f7137s = binderC1494b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f7138t.f7193n.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).onActivitySaveInstanceState(BinderC3517b.m15328J0(this.f7136r), this.f7137s, this.f6840o);
    }
}
