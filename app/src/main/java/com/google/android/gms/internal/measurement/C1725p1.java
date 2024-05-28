package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* loaded from: classes.dex */
public final class C1725p1 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f7132r;

    /* renamed from: s */
    final /* synthetic */ String f7133s;

    /* renamed from: t */
    final /* synthetic */ Bundle f7134t;

    /* renamed from: u */
    final /* synthetic */ C1774s2 f7135u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725p1(C1774s2 c1774s2, String str, String str2, Bundle bundle) {
        super(c1774s2, true);
        this.f7135u = c1774s2;
        this.f7132r = str;
        this.f7133s = str2;
        this.f7134t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f7135u.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).clearConditionalUserProperty(this.f7132r, this.f7133s, this.f7134t);
    }
}
