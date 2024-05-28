package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* loaded from: classes.dex */
public final class C1741q1 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f7174r;

    /* renamed from: s */
    final /* synthetic */ String f7175s;

    /* renamed from: t */
    final /* synthetic */ BinderC1494b1 f7176t;

    /* renamed from: u */
    final /* synthetic */ C1774s2 f7177u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741q1(C1774s2 c1774s2, String str, String str2, BinderC1494b1 binderC1494b1) {
        super(c1774s2, true);
        this.f7177u = c1774s2;
        this.f7174r = str;
        this.f7175s = str2;
        this.f7176t = binderC1494b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f7177u.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).getConditionalUserProperties(this.f7174r, this.f7175s, this.f7176t);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: b */
    protected final void mo7879b() {
        this.f7176t.mo7941m(null);
    }
}
