package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes.dex */
public final class C1546e2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f6758r;

    /* renamed from: s */
    final /* synthetic */ BinderC1494b1 f6759s;

    /* renamed from: t */
    final /* synthetic */ C1774s2 f6760t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546e2(C1774s2 c1774s2, String str, BinderC1494b1 binderC1494b1) {
        super(c1774s2, true);
        this.f6760t = c1774s2;
        this.f6758r = str;
        this.f6759s = binderC1494b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6760t.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).getMaxUserProperties(this.f6758r, this.f6759s);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: b */
    protected final void mo7879b() {
        this.f6759s.mo7941m(null);
    }
}
