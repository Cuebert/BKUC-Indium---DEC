package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* loaded from: classes.dex */
public final class C1563f2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ boolean f6789r;

    /* renamed from: s */
    final /* synthetic */ C1774s2 f6790s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563f2(C1774s2 c1774s2, boolean z10) {
        super(c1774s2, true);
        this.f6790s = c1774s2;
        this.f6789r = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6790s.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).setDataCollectionEnabled(this.f6789r);
    }
}
