package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes.dex */
public final class C1805u1 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f7251r;

    /* renamed from: s */
    final /* synthetic */ C1774s2 f7252s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805u1(C1774s2 c1774s2, String str) {
        super(c1774s2, true);
        this.f7252s = c1774s2;
        this.f7251r = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f7252s.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).endAdUnitExposure(this.f7251r, this.f6840o);
    }
}
