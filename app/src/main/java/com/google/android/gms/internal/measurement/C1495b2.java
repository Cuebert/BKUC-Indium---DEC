package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* loaded from: classes.dex */
public final class C1495b2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f6655r;

    /* renamed from: s */
    final /* synthetic */ String f6656s;

    /* renamed from: t */
    final /* synthetic */ boolean f6657t;

    /* renamed from: u */
    final /* synthetic */ BinderC1494b1 f6658u;

    /* renamed from: v */
    final /* synthetic */ C1774s2 f6659v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495b2(C1774s2 c1774s2, String str, String str2, boolean z10, BinderC1494b1 binderC1494b1) {
        super(c1774s2, true);
        this.f6659v = c1774s2;
        this.f6655r = str;
        this.f6656s = str2;
        this.f6657t = z10;
        this.f6658u = binderC1494b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6659v.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).getUserProperties(this.f6655r, this.f6656s, this.f6657t, this.f6658u);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: b */
    protected final void mo7879b() {
        this.f6658u.mo7941m(null);
    }
}
