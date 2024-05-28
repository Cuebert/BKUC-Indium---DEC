package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* loaded from: classes.dex */
public final class C1757r1 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ Activity f7189r;

    /* renamed from: s */
    final /* synthetic */ String f7190s;

    /* renamed from: t */
    final /* synthetic */ String f7191t;

    /* renamed from: u */
    final /* synthetic */ C1774s2 f7192u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757r1(C1774s2 c1774s2, Activity activity, String str, String str2) {
        super(c1774s2, true);
        this.f7192u = c1774s2;
        this.f7189r = activity;
        this.f7190s = str;
        this.f7191t = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f7192u.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).setCurrentScreen(BinderC3517b.m15328J0(this.f7189r), this.f7190s, this.f7191t, this.f6839n);
    }
}
