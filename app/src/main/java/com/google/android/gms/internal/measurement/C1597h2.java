package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* loaded from: classes.dex */
public final class C1597h2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f6815r;

    /* renamed from: s */
    final /* synthetic */ String f6816s;

    /* renamed from: t */
    final /* synthetic */ Object f6817t;

    /* renamed from: u */
    final /* synthetic */ boolean f6818u;

    /* renamed from: v */
    final /* synthetic */ C1774s2 f6819v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597h2(C1774s2 c1774s2, String str, String str2, Object obj, boolean z10) {
        super(c1774s2, true);
        this.f6819v = c1774s2;
        this.f6815r = str;
        this.f6816s = str2;
        this.f6817t = obj;
        this.f6818u = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6819v.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).setUserProperty(this.f6815r, this.f6816s, BinderC3517b.m15328J0(this.f6817t), this.f6818u, this.f6839n);
    }
}
